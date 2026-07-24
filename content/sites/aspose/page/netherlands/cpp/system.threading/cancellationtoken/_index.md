---
title: "System::Threading::CancellationToken class"
linktitle: "CancellationToken"
second_title: "Aspose.Page voor C++"
description: "System::Threading::CancellationToken class. Verspreidt een melding dat bewerkingen geannuleerd moeten worden. Deze klasse biedt een mechanisme voor coöperatieve annulering tussen threads, waardoor één thread anderen kan informeren dat een bewerking geannuleerd moet worden in C++."
type: docs
weight: 200
url: /nl/cpp/system.threading/cancellationtoken/
---
## CancellationToken class


Propagandeert een melding dat bewerkingen moeten worden geannuleerd. Deze klasse biedt een mechanisme voor coöperatieve annulering tussen threads, waardoor één thread de anderen kan informeren dat een bewerking moet worden geannuleerd.

```cpp
class CancellationToken : public System::Details::BoxableObjectBase
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CancellationToken](./cancellationtoken/)() | Standaardconstructor. |
| [get_CanBeCanceled](./get_canbecanceled/)() const | Bepaalt of dit token in de geannuleerde status kan verkeren. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Bepaalt of annulering is aangevraagd voor dit token. |
| static [get_None](./get_none/)() | Retourneert een lege [System::Threading::CancellationToken](./) waarde. |
| [Register](./register/)(const Action<>\&) const | Registreert een callback die wordt aangeroepen wanneer annulering wordt aangevraagd. |
| [ThrowIfCancellationRequested](./throwifcancellationrequested/)() const | Gooit een OperationCanceledException als annulering is aangevraagd. |
## Opmerkingen



Een [CancellationToken](./) kan alleen worden geannuleerd via de bijbehorende [CancellationTokenSource](../cancellationtokensource/).

## Zie ook

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
