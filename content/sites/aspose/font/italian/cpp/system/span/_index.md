---
title: "Classe System::Span"
linktitle: "Span"
second_title: "Aspose.Font per C++"
description: "Classe System::Span. Rappresenta una regione contigua di memoria arbitraria simile a std::span di C++20 in C++."
type: docs
weight: 5700
url: /it/cpp/system/span/
---
## Span class


Rappresenta una regione contigua di memoria arbitraria simile a std::span di C++20.

```cpp
template<typename T>class Span : public System::Details::SpanCore<T, Span<T>, Span<T>>
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo di elementi nello span. Questa classe fornisce un modo tipizzato per lavorare con sequenze contigue di oggetti. Può essere usata per avvolgere array, array stack o puntatori grezzi mantenendo il controllo dei limiti. Il [Span](./) non possiede la memoria a cui punta - è solo una visualizzazione della memoria esistente. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clear](./clear/)() const | Cancella il contenuto dello span impostando tutti gli elementi al valore predefinito. |
| [Fill](./fill/)(const T\&) const | Riempie lo span con il valore specificato. |
| static [to_Span](./to_span/)(const typename BaseType::ArrayPtrT\&) | Converte un array in un [Span](./). |

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
