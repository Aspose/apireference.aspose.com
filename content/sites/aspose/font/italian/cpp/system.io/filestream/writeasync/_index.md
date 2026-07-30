---
title: "System::IO::FileStream::WriteAsync method"
linktitle: "WriteAsync"
second_title: "Aspose.Font per C++"
description: "System::IO::FileStream::WriteAsync method. Scrive in modo asincrono una sequenza di byte nello stream corrente, avanza la posizione corrente all'interno di questo stream del numero di byte scritti e monitora le richieste di annullamento in C++."
type: docs
weight: 2000
url: /it/cpp/system.io/filestream/writeasync/
---
## FileStream::WriteAsync method


Scrive in modo asincrono una sequenza di byte nello stream corrente, avanza la posizione corrente in questo stream del numero di byte scritti e monitora le richieste di annullamento.

```cpp
TaskPtr System::IO::FileStream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | L'array contenente i byte da scrivere. |
| offset | int32_t | Un indice basato su zero dell'elemento in **buffer** al quale inizia il sottointervallo da scrivere. |
| count | int32_t | Il numero di elementi nel sottointervallo da scrivere. |
| cancellationToken | const Threading::CancellationToken\& | Il token da monitorare per le richieste di cancellazione. |

### ReturnValue

Un'attività che rappresenta l'operazione di scrittura asincrona.

## Vedi anche

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
