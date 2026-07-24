---
title: "System::StaticCast metod"
linktitle: "StaticCast"
second_title: "Aspose.Page för C++"
description: "System::StaticCast metod. Utför statisk typkonvertering på icke‑pekare‑objekt i C++."
type: docs
weight: 38500
url: /sv/cpp/system/staticcast/
---
## System::StaticCast(const TFrom\&) method


Utför statisk typkonvertering på icke‑pekare‑objekt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_same<TFrom, System::String>::value &&!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&!std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Målt typ. |
| TFrom | Källtyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const TFrom\& | Källobjekt. |

### ReturnValue

Typkonverteringsresultat om konvertering är tillåten.

## Deprecated
Lämnad för bakåtkompatibilitet. Använd ExplicitCast istället.

## Se även

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom\&) method


Utför statisk cast på [Exception](../exception/)-objekt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast(const TFrom &obj)
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
## System::StaticCast(const TFrom *) method


Specialisering för aritmetiska typer.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom *value)
```

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\> const\&) method


Utför statisk cast på [SmartPtr](../smartptr/)-objekt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast(SmartPtr<TFrom> const &obj)
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
## System::StaticCast(SmartPtr\<TFrom\>) method


Utför statisk cast på Objects till [Exception](../exception/)-objekt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast(SmartPtr<TFrom> obj) noexcept
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
## System::StaticCast(std::nullptr_t) method


Utför statisk typkonvertering av null‑objekt.

```cpp
template<typename TTo> CastResult<TTo>::type System::StaticCast(std::nullptr_t)
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
## System::StaticCast(TFrom) method


Specialisering för aritmetiska typer.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(TFrom value)
```

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TTo) method


Processa konvertering från [String](../string/) till [String](../string/).

```cpp
template<typename TTo> std::enable_if<std::is_same<TTo, System::String>::value, TTo>::type System::StaticCast(TTo value)
```

## Se även

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(WeakPtr\<TFrom\> const\&) method


Utför statisk cast på [WeakPtr](../weakptr/)-objekt.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast(WeakPtr<TFrom> const &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Målpointerns typ. |
| TFrom | Källpointerns typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Källpekare. |

### ReturnValue

Typkonverteringsresultat om konvertering är tillåten.

## Deprecated
Lämnad för bakåtkompatibilitet. Använd ExplicitCast istället.

## Se även

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
