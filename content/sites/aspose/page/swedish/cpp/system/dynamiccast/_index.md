---
title: "System::DynamicCast‑metod"
linktitle: "DynamicCast"
second_title: "Aspose.Page för C++"
description: "System::DynamicCast‑metod. Utför dynamisk typkonvertering på Exception‑objekt i C++."
type: docs
weight: 16900
url: /sv/cpp/system/dynamiccast/
---
## System::DynamicCast(const TFrom\&) method


Utför dynamisk typkonvertering på [Exception](../exception/)-objekt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast(const TFrom &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Måltyp för [Exception](../exception/)-typen. |
| TFrom | Källtyp för [Exception](../exception/)-typen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const TFrom\& | Källpekare. |

### ReturnValue

Typkonverteringsresultat om konvertering är tillåten.

## Deprecated
Lämnad för bakåtkompatibilitet. Använd ExplicitCast istället.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\> const\&) method


Utför dynamisk cast på [SmartPtr](../smartptr/)-objekt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_enum<TTo>::value &&!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast(SmartPtr<TFrom> const &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Målpointerns typ. |
| TFrom | Källpointerns typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Källpekare. |

### ReturnValue

Typkonverteringsresultat om konvertering är tillåten.

## Deprecated
Lämnad för bakåtkompatibilitet. Använd ExplicitCast istället.

## Se även

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


Avpaketerar inlåst enum via typkonvertering.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_enum<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Målenum‑typ. |
| TFrom | Källpointerns typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Pekare till objektet att avpaketera data från. |

### ReturnValue

Avpaketerat enum‑värde.

## Deprecated
Lämnad för bakåtkompatibilitet. Använd ExplicitCast istället.

## Se även

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


Utför dynamisk cast på objekt till [Exception](../exception/)-objekt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Måltyp för [Exception](../exception/)-typen. |
| TFrom | [Object](../object/)-typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Källpekare. |

### ReturnValue

Typkonverteringsresultat om konvertering är tillåten.

## Deprecated
Lämnad för bakåtkompatibilitet. Använd ExplicitCast istället.

## Se även

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(std::nullptr_t) method


Utför dynamisk typkonvertering av null‑objekt.

```cpp
template<typename TTo> CastResult<TTo>::type System::DynamicCast(std::nullptr_t) noexcept
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Målpointerns typ. |

### ReturnValue

nullptr.

## Deprecated
Lämnad för bakåtkompatibilitet. Använd ExplicitCast istället.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(TFrom\&) method


Utför dynamisk typkonvertering på icke‑pekare‑objekt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&std::is_convertible<TTo, TFrom>::value, TTo>::type System::DynamicCast(TFrom &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Målt typ. |
| TFrom | Källtyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | TFrom\& | Källobjekt. |

### ReturnValue

Typkonverteringsresultat.

## Deprecated
Lämnad för bakåtkompatibilitet. Använd ExplicitCast istället.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(TFrom) method


Utför dynamisk typkonvertering från IntPtr till pekare.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_pointer<TTo>::value &&std::is_same<IntPtr, TFrom>::value, TTo>::type System::DynamicCast(TFrom value) noexcept
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Målt typ. |
| TFrom | Källtyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | TFrom | Käll‑IntPtr‑värde. |

### ReturnValue

Typkonverteringsresultat.

## Deprecated
Lämnad för bakåtkompatibilitet. Använd ExplicitCast istället.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
