---
title: "System::StaticCast-Methode"
linktitle: "StaticCast"
second_title: "Aspose.Font für C++"
description: "System::StaticCast-Methode. Führt einen statischen Cast auf Nicht-Zeiger-Objekten in C++ durch."
type: docs
weight: 38600
url: /de/cpp/system/staticcast/
---
## System::StaticCast(const TFrom\&) method


Führt einen statischen Cast auf Nicht-Zeiger-Objekten durch.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_same<TFrom, System::String>::value &&!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&!std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Zieltyp. |
| TFrom | Quelltyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const TFrom\& | Quellobjekt. |

### ReturnValue

Cast-Ergebnis, falls der Cast erlaubt ist.

## Deprecated
Zurückgelassen für Abwärtskompatibilität. Verwenden Sie stattdessen ExplicitCast.

## Siehe auch

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(const TFrom\&) method


Führt einen statischen Cast auf [Exception](../exception/)‑Objekten durch.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast(const TFrom &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Ziel‑[Exception](../exception/)-Typ. |
| TFrom | Quell‑[Exception](../exception/)-Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const TFrom\& | Quellzeiger. |

### ReturnValue

Cast-Ergebnis, falls der Cast erlaubt ist.

## Deprecated
Zurückgelassen für Abwärtskompatibilität. Verwenden Sie stattdessen ExplicitCast.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(const TFrom *) method


Spezialisierung für arithmetische Typen.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom *value)
```

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\> const\&) method


Führt einen statischen Cast auf [SmartPtr](../smartptr/) Objekten aus.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast(SmartPtr<TFrom> const &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Ziel-Pointee-Typ. |
| TFrom | Quell-Pointee-Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Quellzeiger. |

### ReturnValue

Cast-Ergebnis, falls der Cast erlaubt ist.

## Deprecated
Zurückgelassen für Abwärtskompatibilität. Verwenden Sie stattdessen ExplicitCast.

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\>) method


Führt einen statischen Cast von Objekten zu [Exception](../exception/) Objekten aus.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast(SmartPtr<TFrom> obj) noexcept
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Ziel‑[Exception](../exception/)-Typ. |
| TFrom | [Object](../object/) Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Quellzeiger. |

### ReturnValue

Cast-Ergebnis, falls der Cast erlaubt ist.

## Deprecated
Zurückgelassen für Abwärtskompatibilität. Verwenden Sie stattdessen ExplicitCast.

## Siehe auch

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(std::nullptr_t) method


Führt einen statischen Cast von Null-Objekten durch.

```cpp
template<typename TTo> CastResult<TTo>::type System::StaticCast(std::nullptr_t)
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Ziel-Pointee-Typ. |

### ReturnValue

nullptr.

## Deprecated
Zurückgelassen für Abwärtskompatibilität. Verwenden Sie stattdessen ExplicitCast.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(TFrom) method


Spezialisierung für arithmetische Typen.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(TFrom value)
```

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(TTo) method


Verarbeite Cast von [String](../string/) zu [String](../string/).

```cpp
template<typename TTo> std::enable_if<std::is_same<TTo, System::String>::value, TTo>::type System::StaticCast(TTo value)
```

## Siehe auch

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast(WeakPtr\<TFrom\> const\&) method


Führt einen statischen Cast auf [WeakPtr](../weakptr/) Objekten aus.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast(WeakPtr<TFrom> const &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Ziel-Pointee-Typ. |
| TFrom | Quell-Pointee-Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Quellzeiger. |

### ReturnValue

Cast-Ergebnis, falls der Cast erlaubt ist.

## Deprecated
Zurückgelassen für Abwärtskompatibilität. Verwenden Sie stattdessen ExplicitCast.

## Siehe auch

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
