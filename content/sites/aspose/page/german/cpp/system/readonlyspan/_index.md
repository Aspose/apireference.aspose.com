---
title: "System::ReadOnlySpan Klasse"
linktitle: "ReadOnlySpan"
second_title: "Aspose.Page für C++"
description: "System::ReadOnlySpan Klasse. Weiterleitung zur Verwendung innerhalb der Span-Klasse in C++."
type: docs
weight: 5300
url: /de/cpp/system/readonlyspan/
---
## ReadOnlySpan class


Weiterleitung zur Verwendung innerhalb der [Span](../span/) Klasse.

```cpp
template<typename T>class ReadOnlySpan : public System::Details::SpanCore<const T, ReadOnlySpan<T>, Span<T>>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Elemente im Span. Diese Klasse bietet eine typensichere Möglichkeit, mit zusammenhängenden Sequenzen von Objekten schreibgeschützt zu arbeiten. Sie kann verwendet werden, um Arrays, Stack-Arrays oder rohe Zeiger zu umschließen, während die Bereichsprüfung beibehalten wird. Der [ReadOnlySpan](./) besitzt den Speicher, auf den er zeigt, nicht – er ist lediglich eine Ansicht auf bestehenden Speicher. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ReadOnlySpan](./readonlyspan/)(const Span\<T\>\&) | Konstruiert einen schreibgeschützten Span aus einem regulären Span. |
| static [to_ReadOnlySpan](./to_readonlyspan/)(const typename BaseType::ArrayPtrT\&) | Konvertiert ein Array zu einem [ReadOnlySpan](./). |
## Hinweise


Stellt einen schreibgeschützten zusammenhängenden Bereich beliebigen Speichers dar.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
