---
title: "System::Threading::CancellationTokenSource classe"
linktitle: "CancellationTokenSource"
second_title: "Aspose.Page per C++"
description: "System::Threading::CancellationTokenSource classe. Una sorgente di token di cancellazione che può essere usata per attivare notifiche di cancellazione in C++."
type: docs
weight: 400
url: /it/cpp/system.threading/cancellationtokensource/
---
## CancellationTokenSource class


Una sorgente di token di cancellazione che può essere utilizzata per attivare notifiche di cancellazione.

```cpp
class CancellationTokenSource : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Cancel](./cancel/)() | Comunica una richiesta di cancellazione. |
| [CancellationTokenSource](./cancellationtokensource/)() | Costruisce un nuovo [CancellationTokenSource](./). |
| static [CreateLinkedTokenSource](./createlinkedtokensource/)(const CancellationToken\&, const CancellationToken\&) | Crea una sorgente di token collegata che si annulla quando uno qualsiasi dei token forniti si annulla. |
| [Dispose](./dispose/)() override | Rilascia tutte le risorse utilizzate da [CancellationTokenSource](./). |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Restituisce se è stata richiesta la cancellazione. |
| [get_Token](./get_token/)() const | Restituisce il token di cancellazione associato a questa sorgente. |
## Osservazioni


Fornisce meccanismi per creare e controllare i token di cancellazione per la cancellazione cooperativa delle operazioni.
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
