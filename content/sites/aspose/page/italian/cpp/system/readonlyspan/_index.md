---
title: "Classe System::ReadOnlySpan"
linktitle: "ReadOnlySpan"
second_title: "Aspose.Page per C++"
description: "Classe System::ReadOnlySpan. Forward da utilizzare nella classe Span in C++."
type: docs
weight: 5300
url: /it/cpp/system/readonlyspan/
---
## ReadOnlySpan class


Forward da utilizzare nella classe [Span](../span/).

```cpp
template<typename T>class ReadOnlySpan : public System::Details::SpanCore<const T, ReadOnlySpan<T>, Span<T>>
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo degli elementi nello span. Questa classe fornisce un modo type-safe per lavorare con sequenze contigue di oggetti in modalità sola lettura. Può essere usata per avvolgere array, array di stack o puntatori grezzi mantenendo il controllo dei limiti. Il [ReadOnlySpan](./) non possiede la memoria a cui punta - è solo una vista sulla memoria esistente. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ReadOnlySpan](./readonlyspan/)(const Span\<T\>\&) | Costruisce uno span di sola lettura da uno span regolare. |
| static [to_ReadOnlySpan](./to_readonlyspan/)(const typename BaseType::ArrayPtrT\&) | Converte un array in un [ReadOnlySpan](./). |
## Osservazioni


Rappresenta una regione contigua di memoria arbitraria in sola lettura.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
