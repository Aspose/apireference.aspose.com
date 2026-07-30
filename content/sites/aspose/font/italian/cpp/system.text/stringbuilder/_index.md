---
title: "System::Text::StringBuilder classe"
linktitle: "StringBuilder"
second_title: "Aspose.Font per C++"
description: "System::Text::StringBuilder classe. Buffer per accumulare la stringa parte per parte. Questo tipo può essere allocato sia nello stack come tipo valore sia nell'heap usando la funzione System::MakeObject(). Una volta che l'oggetto è allocato, non mescolare mai questi due casi d'uso: avere puntatori SmartPtr su oggetti allocati nello stack è strettamente proibito in C++."
type: docs
weight: 2400
url: /it/cpp/system.text/stringbuilder/
---
## StringBuilder class


[Buffer](../../system/buffer/) to accumulate string part by part. This type can be allocated either in stack as value type or in heap using [System::MakeObject()](../../system/makeobject/) function. Once the object is allocated, never mix up these two usecases: having [SmartPtr](../../system/smartptr/) pointers onto stack-allocated objects is strictly prohibited.

```cpp
class StringBuilder : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Append](./append/)(char_t) | Aggiunge un carattere al builder. |
| [Append](./append/)(char_t, int) | Aggiunge caratteri al builder. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&) | Aggiunge l'array di caratteri al builder. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&, int, int) | Aggiunge una porzione dell'array di caratteri al builder. |
| [Append](./append/)(const String\&) | Aggiunge una stringa al builder. |
| [Append](./append/)(const String\&, int, int) | Aggiunge una porzione di stringa al builder. |
| [Append](./append/)(const SharedPtr\<T\>\&) | Aggiunge la rappresentazione stringa dell'oggetto al builder. |
| [Append](./append/)(const SharedPtr\<StringBuilder\>\&) | Aggiunge il contenuto del builder al builder. |
| [Append](./append/)(float) | Aggiunge un valore a virgola mobile al builder. |
| [Append](./append/)(double) | Aggiunge un valore a virgola mobile al builder. |
| [Append](./append/)(int) | Aggiunge un valore intero al builder. |
| [Append](./append/)(T) | Aggiunge valore aritmetico al builder. |
| [Append](./append/)(E) | Aggiunge la rappresentazione stringa del valore enum al builder. |
| [AppendFormat](./appendformat/)(const String\&, const TArgs\&...) | Aggiunge una stringa formattata al builder. |
| [AppendFormat](./appendformat/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) | Aggiunge una stringa formattata al builder. |
| [AppendLine](./appendline/)() | Aggiunge il carattere di nuova riga al builder. |
| [AppendLine](./appendline/)(const String\&) | Aggiunge una stringa seguita dal carattere di nuova riga al builder. |
| [Clear](./clear/)() | Rimuove tutti i caratteri dal builder. |
| [CopyTo](./copyto/)(int, System::ArrayPtr\<char_t\> const\&, int, int) | Copia i dati del builder nelle posizioni esistenti dell'array. |
| [get_Capacity](./get_capacity/)() const | Ottiene la capacità corrente del string builder. |
| [get_Length](./get_length/)() const | Ottiene la lunghezza della stringa attualmente nel builder. |
| [idx_get](./idx_get/)(int) const | Ottiene il carattere nella posizione specificata. |
| [idx_set](./idx_set/)(int, char_t) | Imposta il carattere nella posizione specificata. |
| [Insert](./insert/)(int, const String\&) | Inserisce una stringa nella posizione fissa del builder. |
| [Insert](./insert/)(int32_t, const String\&, int32_t) | Inserisce una stringa ripetuta nella posizione fissa del builder. |
| [Insert](./insert/)(int, char_t) | Inserisce un carattere nella posizione fissa del builder. |
| [Insert](./insert/)(int, const System::ArrayPtr\<char_t\>\&, int, int) | Inserisce caratteri nella posizione fissa del builder. |
| [Insert](./insert/)(int, T) | Inserisce un valore nella posizione fissa del builder. |
| [operator[]](./operator[]/)(int) const | Ottiene il carattere nella posizione specificata. |
| [Remove](./remove/)(int, int) | Rimuove un frammento dal builder. |
| [Replace](./replace/)(const String\&, const String\&) | Sostituisce una sottostringa tramite il builder. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Sostituisce una sottostringa tramite l'intervallo del builder. |
| [Replace](./replace/)(char_t, char_t) | Sostituisce un carattere tramite il builder. |
| [Replace](./replace/)(char_t, char_t, int, int) | Sostituisce un carattere tramite l'intervallo del builder. |
| [set_Capacity](./set_capacity/)(int) | Imposta la capacità corrente del string builder. |
| [set_Length](./set_length/)(int) | Tronca o estende il string builder alla lunghezza specificata. |
| [StringBuilder](./stringbuilder/)() | Costruttore. |
| [StringBuilder](./stringbuilder/)(int) | Costruttore. |
| [StringBuilder](./stringbuilder/)(const String\&) | Costruttore. |
| [StringBuilder](./stringbuilder/)(const String\&, int) | Costruttore. |
| [StringBuilder](./stringbuilder/)(const String\&, int, int, int) | Costruttore. |
| [ToString](./tostring/)() const override | Ottiene la stringa attualmente contenuta nel builder. |
| [ToString](./tostring/)(int, int) const | Ottiene la sottostringa attualmente contenuta nel builder. |
| [~StringBuilder](./~stringbuilder/)() | Distruttore. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
