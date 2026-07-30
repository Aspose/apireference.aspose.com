---
title: "System::Threading::CancellationToken class"
linktitle: "CancellationToken"
second_title: "Aspose.Font per C++"
description: "System::Threading::CancellationToken class. Propaga una notifica che le operazioni dovrebbero essere annullate. Questa classe fornisce un meccanismo per la cancellazione cooperativa tra thread, consentendo a un thread di notificare gli altri che un'operazione dovrebbe essere annullata in C++."
type: docs
weight: 200
url: /it/cpp/system.threading/cancellationtoken/
---
## CancellationToken class


Propaga la notifica che le operazioni devono essere annullate. Questa classe fornisce un meccanismo per la cancellazione cooperativa tra thread, consentendo a un thread di notificare gli altri che un'operazione deve essere annullata.

```cpp
class CancellationToken : public System::Details::BoxableObjectBase
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CancellationToken](./cancellationtoken/)() | Costruttore predefinito. |
| [get_CanBeCanceled](./get_canbecanceled/)() const | Restituisce se questo token può trovarsi nello stato annullato. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Restituisce se è stata richiesta la cancellazione per questo token. |
| static [get_None](./get_none/)() | Restituisce un valore vuoto di [System::Threading::CancellationToken](./). |
| [Register](./register/)(const Action<>\&) const | Registra una callback che verrà invocata quando viene richiesta la cancellazione. |
| [ThrowIfCancellationRequested](./throwifcancellationrequested/)() const | Lancia un'OperationCanceledException se è stata richiesta la cancellazione. |
## Osservazioni



Un [CancellationToken](./) può essere annullato solo tramite il suo [CancellationTokenSource](../cancellationtokensource/) associato.

## Vedi anche

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
