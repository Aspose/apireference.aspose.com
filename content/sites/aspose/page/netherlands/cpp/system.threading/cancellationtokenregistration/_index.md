---
title: "System::Threading::CancellationTokenRegistration class"
linktitle: "CancellationTokenRegistration"
second_title: "Aspose.Page voor C++"
description: "System::Threading::CancellationTokenRegistration class. Vertegenwoordigt een registratie voor een annulerings-token callback in C++."
type: docs
weight: 300
url: /nl/cpp/system.threading/cancellationtokenregistration/
---
## CancellationTokenRegistration class


Stelt een registratie voor een annuleringstoken‑callback voor.

```cpp
class CancellationTokenRegistration
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Dispose](./dispose/)() | Verwijdert de registratie en verwijdert de callback van de bijbehorende [CancellationTokenSource](../cancellationtokensource/). Na het aanroepen van deze methode zal de geregistreerde callback niet meer worden aangeroepen wanneer de bijbehorende [CancellationTokenSource](../cancellationtokensource/) wordt geannuleerd. |
## Opmerkingen


Deze klasse maakt het mogelijk om een callback van een annulerings-token af te melden. Wanneer verwijderd, verwijdert deze de callback van de bijbehorende [CancellationTokenSource](../cancellationtokensource/).
Deze klasse mag niet direct worden aangemaakt - hij wordt geretourneerd door de registratie‑methoden van [CancellationToken](../cancellationtoken/).

## Zie ook

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
