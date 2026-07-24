---
title: "System::IO::Stream::FlushAsync metodo"
linktitle: "FlushAsync"
second_title: "Aspose.Page per C++"
description: "System::IO::Stream::FlushAsync metodo. Cancella in modo asincrono tutti i buffer per questo flusso, fa sì che tutti i dati bufferizzati vengano scritti sul dispositivo sottostante e monitora le richieste di annullamento in C++."
type: docs
weight: 900
url: /it/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


Cancella in modo asincrono tutti i buffer per questo stream, provoca la scrittura di tutti i dati bufferizzati sul dispositivo sottostante e monitora le richieste di annullamento.

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

Un task che rappresenta l'operazione di flush asincrona.

## Vedi anche

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


Cancella in modo asincrono tutti i buffer per questo stream, provoca la scrittura di tutti i dati bufferizzati sul dispositivo sottostante e monitora le richieste di annullamento.

```cpp
virtual TaskPtr System::IO::Stream::FlushAsync(const Threading::CancellationToken &cancellationToken)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | Il token da monitorare per le richieste di cancellazione. |

### ReturnValue

Un task che rappresenta l'operazione di flush asincrona.

## Vedi anche

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
