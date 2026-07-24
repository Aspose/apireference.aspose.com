---
title: "System::IO::FileStream::ReadAsync method"
linktitle: "ReadAsync"
second_title: "Aspose.Page per C++"
description: "System::IO::FileStream::ReadAsync method. Legge in modo asincrono una sequenza di byte dal flusso corrente, avanza la posizione nel flusso del numero di byte letti e monitora le richieste di annullamento in C++."
type: docs
weight: 1400
url: /it/cpp/system.io/filestream/readasync/
---
## FileStream::ReadAsync method


Legge in modo asincrono una sequenza di byte dallo stream corrente, avanza la posizione nello stream del numero di byte letti e monitora le richieste di annullamento.

```cpp
RTaskPtr<int32_t> System::IO::FileStream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | L'array di byte in cui scrivere i byte letti. |
| offset | int32_t | Una posizione basata su zero in **buffer** da cui iniziare a scrivere. |
| count | int32_t | Il numero di byte da leggere. |
| cancellationToken | const Threading::CancellationToken\& | Il token da monitorare per le richieste di cancellazione. |

### ReturnValue

Un'attività che rappresenta l'operazione di lettura asincrona. Il valore del parametro TResult contiene il numero totale di byte letti nel buffer. Il valore del risultato può essere inferiore al numero di byte richiesti se il numero di byte attualmente disponibili è inferiore al numero richiesto, oppure può essere 0 (zero) se è stato raggiunto la fine dello stream.

## Vedi anche

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
