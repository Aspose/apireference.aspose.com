---
title: "System::DynamicCast_noexcept yöntemi"
linktitle: "DynamicCast_noexcept"
second_title: "Aspose.Page için C++"
description: "System::DynamicCast_noexcept yöntemi. Eski, kullanımdan kaldırılmış dönüştürmeler. C++'ta gelecekteki sürümlerde kaldırılacak."
type: docs
weight: 17600
url: /tr/cpp/system/dynamiccast_noexcept/
---
## System::DynamicCast_noexcept(const TFrom\&) method


Eski kullanımdan kalkmış dönüşümler. Gelecek sürümlerde kaldırılacak.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast_noexcept(const TFrom &obj) noexcept
```


| Parameter | Açıklama |
| --- | --- |
| TTo | Hedef [Exception](../exception/) türü. |
| TFrom | Kaynak [Exception](../exception/) türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const TFrom\& | Kaynak işaretçi. |

### ReturnValue

Dönüşüm izin veriliyorsa dönüşüm sonucu, aksi takdirde nullptr.
## Açıklamalar


Dinamik dönüşüm [Exception](../exception/) nesneleri üzerinde gerçekleştirir. ## Kullanımdan Kaldırıldı
Geriye dönük uyumluluk için bırakılmıştır. Bunun yerine AsCast kullanın.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\> const\&) method


Dinamik dönüşüm [SmartPtr](../smartptr/) nesneleri üzerinde gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast_noexcept(SmartPtr<TFrom> const &obj) noexcept
```


| Parameter | Açıklama |
| --- | --- |
| TTo | Hedef işaretlenen tip. |
| TFrom | Kaynak işaretlenen tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Kaynak işaretçi. |

### ReturnValue

Dönüşüm izin veriliyorsa dönüşüm sonucu, aksi takdirde nullptr.

## Deprecated
Geriye dönük uyumluluk için bırakılmıştır. Bunun yerine AsCast kullanın.

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\>) method


Nesneleri [Exception](../exception/) nesnelerine dinamik olarak dönüştürür.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| Parameter | Açıklama |
| --- | --- |
| TTo | Hedef [Exception](../exception/) türü. |
| TFrom | [Object](../object/) türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Kaynak işaretçi. |

### ReturnValue

Dönüşüm izin veriliyorsa dönüşüm sonucu, aksi takdirde nullptr.

## Deprecated
Geriye dönük uyumluluk için bırakılmıştır. Bunun yerine AsCast kullanın.

## Ayrıca Bakınız

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
