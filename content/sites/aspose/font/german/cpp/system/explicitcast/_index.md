---
title: "System::ExplicitCast Methode"
linktitle: "ExpliziteUmwandlung"
second_title: "Aspose.Font für C++"
description: "System::ExplicitCast Methode. Castet den Quelltyp zum Ergebnistyp mittels explizitem Cast. Wird verwendet, wenn Quell- und Ergebnistyp in C++ identisch sind."
type: docs
weight: 18600
url: /de/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp zum Ergebnistyp mittels explizitem Cast. Wird verwendet, wenn Quell- und Ergebnistyp identisch sind.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird verwendet, wenn ein einfacher, konstruktorähnlicher Cast benötigt wird.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird für Ausnahme‑Wrapper verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird zum Casten eines Objekts in eine Ausnahme verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird verwendet, wenn Quelle und Ergebnis beide Smart‑Pointer sind (ohne expliziten [SmartPtr<...>](../smartptr/) im Ergebnistyp).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird verwendet, wenn Quelle und Ergebnis beide Smart‑Pointer sind (mit explizitem [SmartPtr<...>](../smartptr/) im Ergebnistyp).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird zum Entboxen eines Objekts in einen Nullable‑Typ verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird zum Boxen eines Nullable‑Typs verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird zum Entboxen eines Nullable‑Objekts verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird zum Boxen von Enums verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird zum Kopieren von Werttypen in den Heap verwendet, wenn der Werttyp als Smart‑Pointer referenziert werden soll (in Generics, die mit einem Interface‑Typ eingeschränkt sind, aber mit einer Struktur, die dieses Interface implementiert, spezialisiert werden).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird zum Abrufen von Interfaces aus Werttypen verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird für allgemeines Boxing verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird für das Boxing von [System::String](../string/) verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird zum Entboxen von Interfaces verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird für allgemeines Entboxing verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird für das Casten von nullptr verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird zum Casten zwischen Arrays verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(Source) method


Castet den Quelltyp in den Ergebnistyp mittels explizitem Cast. Wird verwendet, wenn ein roher Zeiger in einen Smart‑Pointer gecastet wird.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | Source | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
