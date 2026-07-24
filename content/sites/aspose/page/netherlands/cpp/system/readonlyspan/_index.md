---
title: "System::ReadOnlySpan klasse"
linktitle: "ReadOnlySpan"
second_title: "Aspose.Page voor C++"
description: "System::ReadOnlySpan klasse. Voorwaartse verwijzing voor gebruik binnen de Span-klasse in C++."
type: docs
weight: 5300
url: /nl/cpp/system/readonlyspan/
---
## ReadOnlySpan class


Voorwaartse verwijzing voor gebruik binnen de klasse [Span](../span/).

```cpp
template<typename T>class ReadOnlySpan : public System::Details::SpanCore<const T, ReadOnlySpan<T>, Span<T>>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type elementen in de span. Deze klasse biedt een type-veilige manier om met aaneengesloten reeksen objecten in een alleen-lezen modus te werken. Het kan worden gebruikt om arrays, stack-arrays of ruwe pointers te omhullen terwijl grenzen worden gecontroleerd. De [ReadOnlySpan](./) bezit het geheugen waarnaar hij wijst niet - het is slechts een weergave van bestaand geheugen. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ReadOnlySpan](./readonlyspan/)(const Span\<T\>\&) | Construeert een alleen-lezen span vanuit een reguliere span. |
| static [to_ReadOnlySpan](./to_readonlyspan/)(const typename BaseType::ArrayPtrT\&) | Converteert een array naar een [ReadOnlySpan](./). |
## Opmerkingen


Stelt een alleen-lezen aaneengesloten regio van willekeurig geheugen voor.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
