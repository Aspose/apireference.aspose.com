---
title: "System::ExplicitCast-Methode"
linktitle: "ExpliziterCast"
second_title: "Aspose.Page für C++"
description: "System::ExplicitCast-Methode. Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird verwendet, wenn Quell- und Ergebnis­typ in C++ identisch sind."
type: docs
weight: 18500
url: /de/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird verwendet, wenn Quell- und Ergebnis­typ identisch sind.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird verwendet, wenn ein einfacher, konstruktorähnlicher Cast benötigt wird.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird für Ausnahme‑Wrapper verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird zum Umwandeln eines Objekts in eine Ausnahme verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird verwendet, wenn Quell‑ und Ergebnis‑Typ beide Smart‑Pointer sind (ohne expliziten [SmartPtr<...>](../smartptr/) im Ergebnis­typ).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird verwendet, wenn Quell‑ und Ergebnis‑Typ beide Smart‑Pointer sind (mit explizitem [SmartPtr<...>](../smartptr/) im Ergebnis­typ).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird zum Entpacken eines Objekts in einen Nullable‑Typ verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird verwendet, um einen Nullable‑Typ zu boxen.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird zum Entpacken eines Nullable‑Objekts verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird zum Boxen von Enums verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird zum Kopieren von Werttypen auf den Heap verwendet, wenn der Werttyp als Smart‑Pointer referenziert werden soll (in Generics, die mit einem Schnittstellentyp eingeschränkt sind, aber mit einer Struktur, die diese Schnittstelle implementiert, spezialisiert werden).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird verwendet, um Schnittstellen von Werttypen zu erhalten.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird für allgemeines Boxing verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird für das Boxing von [System::String](../string/) verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird zum Entpacken von Schnittstellen verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird für allgemeines Unboxing verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird für das Casten von nullptr verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird zum Casten zwischen Arrays verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(Source) method


Wandelt den Quelltyp in den Ergebnis­typ mittels explizitem Cast um. Wird verwendet, wenn ein roher Zeiger in einen Smart‑Pointer umgewandelt wird.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Result | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | Source | [Object](../object/) zum Casten. |

### ReturnValue

Das Cast-Ergebnis.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
