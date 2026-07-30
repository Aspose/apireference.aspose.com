---
title: "System::DynamicCast-Methode"
linktitle: "DynamicCast"
second_title: "Aspose.Font für C++"
description: "System::DynamicCast-Methode. Führt einen dynamischen Cast auf Exception-Objekten in C++ durch."
type: docs
weight: 17000
url: /de/cpp/system/dynamiccast/
---
## System::DynamicCast(const TFrom\&) method


Führt einen dynamischen Cast auf [Exception](../exception/)-Objekten durch.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast(const TFrom &obj)
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
## System::DynamicCast(SmartPtr\<TFrom\> const\&) method


Führt einen dynamischen Cast auf [SmartPtr](../smartptr/) Objekten aus.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_enum<TTo>::value &&!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast(SmartPtr<TFrom> const &obj)
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
## System::DynamicCast(SmartPtr\<TFrom\>) method


Entpackt ein verpacktes Enum mittels Cast.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_enum<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Ziel-Enum-Typ. |
| TFrom | Quell-Pointee-Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Zeiger auf das Objekt, aus dem Daten entpackt werden sollen. |

### ReturnValue

Entpackter Enum-Wert.

## Deprecated
Zurückgelassen für Abwärtskompatibilität. Verwenden Sie stattdessen ExplicitCast.

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


Führt einen dynamischen Cast von Objekten zu [Exception](../exception/) Objekten aus.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
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
## System::DynamicCast(std::nullptr_t) method


Führt einen dynamischen Cast von Null-Objekten aus.

```cpp
template<typename TTo> CastResult<TTo>::type System::DynamicCast(std::nullptr_t) noexcept
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
## System::DynamicCast(TFrom\&) method


Führt einen dynamischen Cast bei Nicht-Zeiger-Objekten aus.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&std::is_convertible<TTo, TFrom>::value, TTo>::type System::DynamicCast(TFrom &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Zieltyp. |
| TFrom | Quelltyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | TFrom\& | Quellobjekt. |

### ReturnValue

Cast-Ergebnis.

## Deprecated
Zurückgelassen für Abwärtskompatibilität. Verwenden Sie stattdessen ExplicitCast.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(TFrom) method


Führt einen dynamischen Cast von IntPtr zu einem Zeiger aus.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_pointer<TTo>::value &&std::is_same<IntPtr, TFrom>::value, TTo>::type System::DynamicCast(TFrom value) noexcept
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Zieltyp. |
| TFrom | Quelltyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | TFrom | Quell-IntPtr-Wert. |

### ReturnValue

Cast-Ergebnis.

## Deprecated
Zurückgelassen für Abwärtskompatibilität. Verwenden Sie stattdessen ExplicitCast.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
