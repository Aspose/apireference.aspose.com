---
title: "System::DynamicCast yöntemi"
linktitle: "DinamikDönüştürme"
second_title: "Aspose.Font için C++"
description: "System::DynamicCast yöntemi. C++'da Exception nesneleri üzerinde dinamik dönüşüm gerçekleştirir."
type: docs
weight: 17000
url: /tr/cpp/system/dynamiccast/
---
## System::DynamicCast(const TFrom\&) method


[Exception](../exception/) nesneleri üzerinde dinamik dönüşüm gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast(const TFrom &obj)
```


| Parametre | Açıklama |
| --- | --- |
| TTo | Hedef [Exception](../exception/) türü. |
| TFrom | Kaynak [İstisna](../exception/) türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const TFrom\& | Kaynak işaretçisi. |

### ReturnValue

Dönüşüm izinliyse dönüşüm sonucu.

## Deprecated
Geriye dönük uyumluluk için bırakıldı. Bunun yerine ExplicitCast kullanın.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\> const\&) method


Dinamik dönüşüm gerçekleştirir [SmartPtr](../smartptr/) nesneleri üzerinde.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_enum<TTo>::value &&!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast(SmartPtr<TFrom> const &obj)
```


| Parametre | Açıklama |
| --- | --- |
| TTo | Hedef işaretlenen tür. |
| TFrom | Kaynak işaretlenen tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Kaynak işaretçisi. |

### ReturnValue

Dönüşüm izinliyse dönüşüm sonucu.

## Deprecated
Geriye dönük uyumluluk için bırakıldı. Bunun yerine ExplicitCast kullanın.

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


Kutu içinde bulunan enum'u dönüşüm yoluyla kutudan çıkarır.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_enum<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| Parametre | Açıklama |
| --- | --- |
| TTo | Hedef enum türü. |
| TFrom | Kaynak işaretlenen tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Verileri ayıklamak için nesneye işaretçi. |

### ReturnValue

Ayıklanmış enum değeri.

## Deprecated
Geriye dönük uyumluluk için bırakıldı. Bunun yerine ExplicitCast kullanın.

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


Nesneler üzerinde [Exception](../exception/) nesnelerine dinamik dönüşüm gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| Parametre | Açıklama |
| --- | --- |
| TTo | Hedef [Exception](../exception/) türü. |
| TFrom | [Nesne](../object/) türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Kaynak işaretçisi. |

### ReturnValue

Dönüşüm izinliyse dönüşüm sonucu.

## Deprecated
Geriye dönük uyumluluk için bırakıldı. Bunun yerine ExplicitCast kullanın.

## Ayrıca Bakınız

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(std::nullptr_t) method


Null nesneler üzerinde dinamik dönüşüm gerçekleştirir.

```cpp
template<typename TTo> CastResult<TTo>::type System::DynamicCast(std::nullptr_t) noexcept
```


| Parametre | Açıklama |
| --- | --- |
| TTo | Hedef işaretlenen tür. |

### ReturnValue

nullptr.

## Deprecated
Geriye dönük uyumluluk için bırakıldı. Bunun yerine ExplicitCast kullanın.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(TFrom\&) method


İşaretçi olmayan nesneler üzerinde dinamik dönüşüm gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&std::is_convertible<TTo, TFrom>::value, TTo>::type System::DynamicCast(TFrom &obj)
```


| Parametre | Açıklama |
| --- | --- |
| TTo | Hedef tip. |
| TFrom | Kaynak tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | TFrom\& | Kaynak nesne. |

### ReturnValue

Dönüşüm sonucu.

## Deprecated
Geriye dönük uyumluluk için bırakıldı. Bunun yerine ExplicitCast kullanın.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(TFrom) method


IntPtr'ten işaretçiye dinamik dönüşüm gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_pointer<TTo>::value &&std::is_same<IntPtr, TFrom>::value, TTo>::type System::DynamicCast(TFrom value) noexcept
```


| Parametre | Açıklama |
| --- | --- |
| TTo | Hedef tip. |
| TFrom | Kaynak tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | TFrom | Kaynak IntPtr değeri. |

### ReturnValue

Dönüşüm sonucu.

## Deprecated
Geriye dönük uyumluluk için bırakıldı. Bunun yerine ExplicitCast kullanın.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
