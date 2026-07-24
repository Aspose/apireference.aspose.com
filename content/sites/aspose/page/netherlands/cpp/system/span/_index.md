---
title: "System::Span klasse"
linktitle: "Span"
second_title: "Aspose.Page voor C++"
description: "System::Span klasse. Vertegenwoordigt een aaneengesloten regio van willekeurig geheugen, vergelijkbaar met C++20's std::span in C++."
type: docs
weight: 5700
url: /nl/cpp/system/span/
---
## Span class


Stelt een aaneengesloten gebied van willekeurig geheugen voor, vergelijkbaar met std::span uit C++20.

```cpp
template<typename T>class Span : public System::Details::SpanCore<T, Span<T>, Span<T>>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type elementen in de span. Deze klasse biedt een type‑veilige manier om te werken met aaneengesloten reeksen van objecten. Hij kan worden gebruikt om arrays, stack‑arrays of ruwe pointers te omhullen terwijl grenzen worden gecontroleerd. De [Span](./) bezit het geheugen waarnaar hij wijst niet – het is slechts een weergave van bestaand geheugen. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clear](./clear/)() const | Leegt de inhoud van de span door alle elementen op de standaardwaarde te zetten. |
| [Fill](./fill/)(const T\&) const | Vult de span met de opgegeven waarde. |
| static [to_Span](./to_span/)(const typename BaseType::ArrayPtrT\&) | Converteert een array naar een [Span](./). |

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
