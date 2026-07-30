---
title: "Metodo System::IO::Stream::WriteAsync"
linktitle: "WriteAsync"
second_title: "Aspose.Font per C++"
description: "Metodo System::IO::Stream::WriteAsync. Scrive in modo asincrono una sequenza di byte sullo stream corrente, avanza la posizione corrente all'interno di questo stream del numero di byte scritti e monitora le richieste di cancellazione in C++."
type: docs
weight: 2700
url: /it/cpp/system.io/stream/writeasync/
---
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Scrive in modo asincrono una sequenza di byte nello stream corrente, avanza la posizione corrente in questo stream del numero di byte scritti e monitora le richieste di annullamento.

```cpp
TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | L'array contenente i byte da scrivere. |
| offset | int32_t | Un indice basato su zero dell'elemento in **buffer** al quale inizia il sottointervallo da scrivere. |
| count | int32_t | Il numero di elementi nel sottointervallo da scrivere. |

### ReturnValue

Un'attività che rappresenta l'operazione di scrittura asincrona.

## Vedi anche

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


Scrive in modo asincrono una sequenza di byte nello stream corrente, avanza la posizione corrente in questo stream del numero di byte scritti e monitora le richieste di annullamento.

```cpp
virtual TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
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
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
