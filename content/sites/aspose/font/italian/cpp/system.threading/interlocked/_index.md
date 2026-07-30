---
title: "System::Threading::Interlocked classe"
linktitle: "Interlocked"
second_title: "Aspose.Font per C++"
description: "System::Threading::Interlocked classe. Fornisce API per operazioni thread-safe. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo in C++."
type: docs
weight: 600
url: /it/cpp/system.threading/interlocked/
---
## Interlocked class


Fornisce un'API per operazioni thread-safe. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo.

```cpp
class Interlocked
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Add](./add/)(int32_t\&, int32_t) | Incrementa il valore in modo atomico. |
| static [Add](./add/)(int64_t\&, int64_t) | Incrementa il valore in modo atomico. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Compare-exchanges valore su variabile: verifica se la variabile è uguale a un valore specifico e memorizza il nuovo valore solo se il valore memorizzato corrisponde a quello previsto. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Compare-exchanges valore su variabile: verifica se la variabile è uguale a un valore specifico e memorizza il nuovo valore solo se il valore memorizzato corrisponde a quello previsto. Non implementato. |
| static [CompareExchange](./compareexchange/)(int32_t\&, int32_t, int32_t, bool\&) | Compare-exchanges valore su variabile: verifica se la variabile è uguale a un valore specifico e memorizza il nuovo valore solo se il valore memorizzato corrisponde a quello previsto. |
| static [Decrement](./decrement/)(int32_t\&) | Decrementa il valore in modo atomico. |
| static [Decrement](./decrement/)(int64_t\&) | Decrementa il valore in modo atomico. |
| static [Exchange](./exchange/)(T\&, T) | Scambia il valore su variabile: memorizza il nuovo valore e restituisce il valore che la variabile aveva immediatamente prima della memorizzazione. |
| static [Exchange](./exchange/)(T\&, T) | Scambia il valore su variabile: memorizza il nuovo valore e restituisce il valore che la variabile aveva immediatamente prima della memorizzazione. Non implementato. |
| static [ExchangeAdd](./exchangeadd/)(int32_t\&, int32_t) | Incrementa il valore in modo atomico tramite la procedura exchange-add. |
| static [ExchangeAdd](./exchangeadd/)(int64_t\&, int64_t) | Incrementa il valore in modo atomico tramite la procedura exchange-add. |
| static [Increment](./increment/)(int32_t\&) | Incrementa il valore in modo atomico. |
| static [Increment](./increment/)(int64_t\&) | Incrementa il valore in modo atomico. |
| static [Read](./read/)(int64_t\&) | Restituisce un valore a 64 bit, caricato come operazione atomica. |
## Vedi anche

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
