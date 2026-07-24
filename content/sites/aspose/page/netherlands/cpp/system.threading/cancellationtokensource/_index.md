---
title: "System::Threading::CancellationTokenSource klasse"
linktitle: "CancellationTokenSource"
second_title: "Aspose.Page voor C++"
description: "System::Threading::CancellationTokenSource klasse. Een annulerings-tokenbron die kan worden gebruikt om annuleringsmeldingen te activeren in C++."
type: docs
weight: 400
url: /nl/cpp/system.threading/cancellationtokensource/
---
## CancellationTokenSource class


Een annuleringstoken‑bron die kan worden gebruikt om annuleringsmeldingen te activeren.

```cpp
class CancellationTokenSource : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Cancel](./cancel/)() | Communiceert een verzoek tot annulering. |
| [CancellationTokenSource](./cancellationtokensource/)() | Construeert een nieuwe [CancellationTokenSource](./). |
| static [CreateLinkedTokenSource](./createlinkedtokensource/)(const CancellationToken\&, const CancellationToken\&) | Maakt een gekoppelde tokenbron die annuleert wanneer een van de opgegeven tokens annuleert. |
| [Dispose](./dispose/)() override | Geeft alle bronnen vrij die door de [CancellationTokenSource](./) worden gebruikt. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Haalt op of annulering is aangevraagd. |
| [get_Token](./get_token/)() const | Haalt het annulerings-token op dat aan deze bron is gekoppeld. |
## Opmerkingen


Biedt mechanismen om annulerings-tokens te maken en te beheren voor coöperatieve annulering van bewerkingen.
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
