---
title: "System::StaticCast_noexcept yöntemi"
linktitle: "StaticCast_noexcept"
second_title: "Aspose.Page için C++"
description: "System::StaticCast_noexcept yöntemi. C++'ta Exception nesneleri üzerinde statik dönüşüm gerçekleştirir."
type: docs
weight: 39400
url: /tr/cpp/system/staticcast_noexcept/
---
## System::StaticCast_noexcept(const TFrom\&) method


[Exception](../exception/) nesneleri üzerinde statik dönüşüm gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast_noexcept(const TFrom &obj)
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

## Deprecated
Geriye dönük uyumluluk için bırakılmıştır. Bunun yerine AsCast kullanın.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\> const\&) method


[SmartPtr](../smartptr/) nesneleri üzerinde statik dönüşüm gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast_noexcept(SmartPtr<TFrom> const &obj)
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
## System::StaticCast_noexcept(SmartPtr\<TFrom\>) method


Objects nesnelerini [Exception](../exception/) nesnelerine statik olarak dönüştürür.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast_noexcept(SmartPtr<TFrom> obj) noexcept
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
## System::StaticCast_noexcept(WeakPtr\<TFrom\> const\&) method


[WeakPtr](../weakptr/) nesneleri üzerinde statik dönüşüm gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast_noexcept(WeakPtr<TFrom> const &obj)
```


| Parameter | Açıklama |
| --- | --- |
| TTo | Hedef işaretlenen tip. |
| TFrom | Kaynak işaretlenen tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Kaynak işaretçi. |

### ReturnValue

Dönüşüm izin veriliyorsa dönüşüm sonucu, aksi takdirde nullptr.

## Deprecated
Geriye dönük uyumluluk için bırakılmıştır. Bunun yerine AsCast kullanın.

## Ayrıca Bakınız

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
