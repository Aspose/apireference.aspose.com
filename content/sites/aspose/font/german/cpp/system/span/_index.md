---
title: "System::Span Klasse"
linktitle: "Span"
second_title: "Aspose.Font für C++"
description: "System::Span Klasse. Stellt einen zusammenhängenden Bereich beliebigen Speichers dar, ähnlich wie std::span aus C++20 in C++."
type: docs
weight: 5700
url: /de/cpp/system/span/
---
## Span class


Stellt einen zusammenhängenden Bereich beliebigen Speichers dar, ähnlich wie std::span aus C++20.

```cpp
template<typename T>class Span : public System::Details::SpanCore<T, Span<T>, Span<T>>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Elemente im Span. Diese Klasse bietet eine typensichere Möglichkeit, mit zusammenhängenden Sequenzen von Objekten zu arbeiten. Sie kann verwendet werden, um Arrays, Stack-Arrays oder Roh-Pointer zu kapseln, während die Bereichsprüfung beibehalten wird. Der [Span](./) besitzt den Speicher, auf den er zeigt, nicht – er ist lediglich eine Ansicht auf bestehenden Speicher. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clear](./clear/)() const | Löscht den Inhalt des Span, indem alle Elemente auf den Standardwert gesetzt werden. |
| [Fill](./fill/)(const T\&) const | Füllt den Span mit dem angegebenen Wert. |
| static [to_Span](./to_span/)(const typename BaseType::ArrayPtrT\&) | Konvertiert ein Array in einen [Span](./). |

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
