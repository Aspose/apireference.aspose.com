---
title: "System::IO::TextReader classe"
linktitle: "TextReader"
second_title: "Aspose.Font per C++"
description: "Classe System::IO::TextReader. Una classe base per le classi che rappresentano lettori che leggono sequenze di caratteri da diverse sorgenti. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2600
url: /it/cpp/system.io/textreader/
---
## TextReader class


Una classe base per le classi che rappresentano lettori che leggono sequenze di caratteri da diverse sorgenti. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class TextReader : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Close](./close/)() | Chiude lo stream e rilascia le risorse acquisite. |
| [Dispose](./dispose/)() override | Rilascia tutte le risorse utilizzate dall'oggetto corrente e chiude lo stream sottostante. |
| virtual [Peek](./peek/)() | Legge un singolo carattere dal flusso senza modificare il cursore di lettura del flusso. |
| virtual [Read](./read/)() | Legge un singolo carattere dal flusso. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | Legge il numero specificato di caratteri dal flusso e li scrive nell'array di caratteri specificato a partire dalla posizione specificata. |
| virtual [ReadBlock](./readblock/)(ArrayPtr\<char_t\>, int, int) | Legge il numero massimo specificato di caratteri dal lettore di testo corrente e scrive i dati in un buffer, a partire dall'indice specificato. |
| virtual [ReadLine](./readline/)() | Legge i caratteri dal flusso fino alla fine della riga corrente. |
| virtual [ReadToEnd](./readtoend/)() | Legge i caratteri dal flusso fino alla fine del flusso. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
