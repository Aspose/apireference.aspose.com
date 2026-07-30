---
title: "System::StaticCast_noexcept yöntemi"
linktitle: "StaticCast_noexcept"
second_title: "Aspose.Font için C++"
description: "System::StaticCast_noexcept yöntemi. C++'ta Exception nesneleri üzerinde statik dönüşüm gerçekleştirir."
type: docs
weight: 39500
url: /tr/cpp/system/staticcast_noexcept/
---
## System::StaticCast_noexcept(const TFrom\&) method


[Exception](../exception/) nesneleri üzerinde statik dönüşüm gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast_noexcept(const TFrom &obj)
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

## Deprecated
Geriye dönük uyumluluk için bırakıldı. Bunun yerine AsCast kullanın.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\> const\&) method


Statik dönüşüm [SmartPtr](../smartptr/) nesneleri üzerinde gerçekleştirilir.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast_noexcept(SmartPtr<TFrom> const &obj)
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
## System::StaticCast_noexcept(SmartPtr\<TFrom\>) method


Statik dönüşüm Nesnelerden [İstisna](../exception/) nesnelerine gerçekleştirilir.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast_noexcept(SmartPtr<TFrom> obj) noexcept
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
## System::StaticCast_noexcept(WeakPtr\<TFrom\> const\&) method


Statik dönüşüm [WeakPtr](../weakptr/) nesneleri üzerinde gerçekleştirilir.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast_noexcept(WeakPtr<TFrom> const &obj)
```


| Parametre | Açıklama |
| --- | --- |
| TTo | Hedef işaretlenen tür. |
| TFrom | Kaynak işaretlenen tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Kaynak işaretçisi. |

### ReturnValue

Dönüştürme izinliyse dönüş sonucu, aksi takdirde nullptr.

## Deprecated
Geriye dönük uyumluluk için bırakıldı. Bunun yerine AsCast kullanın.

## Ayrıca Bakınız

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
