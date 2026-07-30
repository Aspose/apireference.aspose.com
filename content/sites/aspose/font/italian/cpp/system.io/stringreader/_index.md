---
title: "System::IO::StringReader class"
linktitle: "StringReader"
second_title: "Aspose.Font per C++"
description: "System::IO::StringReader class. Rappresenta un lettore che legge caratteri da una stringa. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2400
url: /it/cpp/system.io/stringreader/
---
## StringReader class


Rappresenta un lettore che legge caratteri da una stringa. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class StringReader : public System::IO::TextReader
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() override | Chiude lo stream. |
| [Dispose](./dispose/)() override | Non fa nulla. |
| [Dispose](./dispose/)(bool) override | Non fa nulla. |
| [Peek](./peek/)() override | Legge un singolo carattere dallo stream senza modificare la posizione dello stream. |
| [Read](./read/)() override | Legge un singolo carattere dal flusso. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Legge il numero specificato di caratteri dallo stream nell'array di caratteri specificato, a partire dalla posizione specificata. |
| [ReadLine](./readline/)() override | Legge i caratteri dal flusso fino alla fine della riga corrente. |
| [ReadToEnd](./readtoend/)() override | Legge i caratteri dal flusso fino alla fine del flusso. |
| [StringReader](./stringreader/)(const String\&) | Crea una nuova istanza della classe [StringReader](./) che legge caratteri dalla stringa specificata. |
## Vedi anche

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
