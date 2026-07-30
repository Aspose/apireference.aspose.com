---
title: "System::IO::FileStream::FlushAsync method"
linktitle: "FlushAsync"
second_title: "Aspose.Font per C++"
description: "System::IO::FileStream::FlushAsync metodo. Cancella in modo asincrono tutti i buffer per questo stream, provoca la scrittura di tutti i dati bufferizzati sul dispositivo sottostante e monitora le richieste di annullamento in C++."
type: docs
weight: 500
url: /it/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


Cancella in modo asincrono tutti i buffer per questo stream, fa sì che i dati bufferizzati vengano scritti sul dispositivo sottostante e monitora le richieste di annullamento.

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | Il token da monitorare per le richieste di cancellazione. |

### ReturnValue

Un'attività che rappresenta l'operazione di flush asincrona.

## Vedi anche

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
