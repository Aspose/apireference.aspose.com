---
title: "System::AsCast Methode"
linktitle: "AsCast"
second_title: "Aspose.Font für C++"
description: "System::AsCast Methode. Castet den Quelltyp zum Ergebnistyp mittels ''as''‑Operator‑Cast. Wird verwendet, wenn ein einfacher, konstruktorähnlicher Cast in C++ benötigt wird."
type: docs
weight: 13600
url: /de/cpp/system/ascast/
---
## System::AsCast(const Source\&) method


Castet den Quelltyp zum Ergebnistyp mittels 'as'‑Operator‑Cast. Wird verwendet, wenn ein einfacher, konstruktorähnlicher Cast benötigt wird.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Castet den Quelltyp zum Ergebnistyp mittels 'as'‑Operator‑Cast. Wird verwendet, wenn Quell‑ und Ergebnistyp identisch sind.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Castet den Quelltyp zum Ergebnistyp mittels 'as'‑Operator‑Cast. Wird für Ausnahme‑Wrapper verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::AsCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis. Gibt nullptr zurück, wenn keine Konvertierung verfügbar ist.

## Siehe auch

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels 'as'-Operator-Cast um. Wird zum Casten von Objekt zu Ausnahme verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::AsCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis. Gibt nullptr zurück, wenn keine Konvertierung verfügbar ist.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels 'as'-Operator-Cast um. Wird verwendet, wenn Quell- und Ergebnis­typ beide Smart‑Pointer sind.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis. Gibt nullptr zurück, wenn keine Konvertierung verfügbar ist.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels 'as'-Operator-Cast um. Wird verwendet, wenn Quell- und Ergebnis­typ beide Smart‑Pointer sind (mit explizitem [SmartPtr<...>](../smartptr/) im Ergebnis­typ).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::AsCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis. Gibt nullptr zurück, wenn keine Konvertierung verfügbar ist.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels 'as'-Operator-Cast um. Wird zum Unboxing von Objekt zu Nullable verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis. Gibt ein leeres Nullable zurück, wenn keine Konvertierung verfügbar ist.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels 'as'-Operator-Cast um. Ungültiges Unboxing zu Nicht‑Objekt‑Typ.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Gibt immer null zurück.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Ungültiges Unboxing zu Nicht‑Objekt‑Typ.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InvalidUnboxing, Result> System::AsCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Gibt immer null zurück.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels 'as'-Operator-Cast um. Wird zum Boxing eines Nullable‑Objekts verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels 'as'-Operator-Cast um. Wird zum Boxing eines allgemeinen Objekts verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels 'as'-Operator-Cast um. Wird zum Boxing eines allgemeinen Objekts verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels 'as'-Operator-Cast um. Wird zum Unboxing von Zeichenketten verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToString, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels 'as'-Operator-Cast um. Wird für nullptr‑Casting verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Wandelt den Quelltyp in den Ergebnis­typ mittels 'as'-Operator-Cast um. Wird zum Casten zwischen Arrays verwendet.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Quelle | Der Quelltyp. |
| Ergebnis | Der Ergebnistyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) zu casten. |

### ReturnValue

Das Cast‑Ergebnis. Gibt nullptr zurück, wenn für kein Array‑Element eine Konvertierung verfügbar ist.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
