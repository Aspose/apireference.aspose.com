---
title: "Metodo System::IO::Stream::FlushAsync"
linktitle: "FlushAsync"
second_title: "Aspose.Font per C++"
description: "Metodo System::IO::Stream::FlushAsync. Svuota in modo asincrono tutti i buffer per questo stream, fa sì che tutti i dati bufferizzati vengano scritti sul dispositivo sottostante e monitora le richieste di annullamento in C++."
type: docs
weight: 900
url: /it/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


Cancella in modo asincrono tutti i buffer per questo stream, fa sì che i dati bufferizzati vengano scritti sul dispositivo sottostante e monitora le richieste di annullamento.

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

Un'attività che rappresenta l'operazione di flush asincrona.

## Vedi anche

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


Cancella in modo asincrono tutti i buffer per questo stream, fa sì che i dati bufferizzati vengano scritti sul dispositivo sottostante e monitora le richieste di annullamento.

```cpp
virtual TaskPtr System::IO::Stream::FlushAsync(const Threading::CancellationToken &cancellationToken)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | Il token da monitorare per le richieste di cancellazione. |

### ReturnValue

Un'attività che rappresenta l'operazione di flush asincrona.

## Vedi anche

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
