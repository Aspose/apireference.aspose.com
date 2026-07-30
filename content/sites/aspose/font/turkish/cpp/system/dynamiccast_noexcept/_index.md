---
title: "System::DynamicCast_noexcept yöntemi"
linktitle: "DinamikDönüştürme_hatasız"
second_title: "Aspose.Font için C++"
description: "System::DynamicCast_noexcept yöntemi. Eski, kullanımdan kaldırılmış dönüşümler. Gelecek sürümlerde C++'da kaldırılacak."
type: docs
weight: 17700
url: /tr/cpp/system/dynamiccast_noexcept/
---
## System::DynamicCast_noexcept(const TFrom\&) method


Eski, kullanımdan kaldırılmış dönüşümler. Gelecek sürümlerde kaldırılacak.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast_noexcept(const TFrom &obj) noexcept
```


| Parametre | Açıklama |
| --- | --- |
| TTo | Hedef [Exception](../exception/) türü. |
| TFrom | Kaynak [İstisna](../exception/) türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const TFrom\& | Kaynak işaretçisi. |

### ReturnValue

Dönüştürme izinliyse dönüş sonucu, aksi takdirde nullptr.
## Açıklamalar


Dinamik dönüşüm gerçekleştirir [Exception](../exception/) nesneleri üzerinde. ## Kullanımdan Kaldırıldı
Geriye dönük uyumluluk için bırakıldı. Bunun yerine AsCast kullanın.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\> const\&) method


Dinamik dönüşüm gerçekleştirir [SmartPtr](../smartptr/) nesneleri üzerinde.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast_noexcept(SmartPtr<TFrom> const &obj) noexcept
```


| Parametre | Açıklama |
| --- | --- |
| TTo | Hedef işaretlenen tür. |
| TFrom | Kaynak işaretlenen tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Kaynak işaretçisi. |

### ReturnValue

Dönüştürme izinliyse dönüş sonucu, aksi takdirde nullptr.

## Deprecated
Geriye dönük uyumluluk için bırakıldı. Bunun yerine AsCast kullanın.

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\>) method


Nesneler üzerinde [Exception](../exception/) nesnelerine dinamik dönüşüm gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| Parametre | Açıklama |
| --- | --- |
| TTo | Hedef [Exception](../exception/) türü. |
| TFrom | [Nesne](../object/) türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Kaynak işaretçisi. |

### ReturnValue

Dönüştürme izinliyse dönüş sonucu, aksi takdirde nullptr.

## Deprecated
Geriye dönük uyumluluk için bırakıldı. Bunun yerine AsCast kullanın.

## Ayrıca Bakınız

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
