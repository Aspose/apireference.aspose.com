---
title: "System::IO::StringReader classe"
linktitle: "StringReader"
second_title: "Aspose.Page per C++"
description: "System::IO::StringReader classe. Rappresenta un lettore che legge caratteri da una stringa. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2400
url: /it/cpp/system.io/stringreader/
---
## StringReader class


Rappresenta un lettore che legge caratteri da una stringa. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class StringReader : public System::IO::TextReader
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() override | Chiude il flusso. |
| [Dispose](./dispose/)() override | Non fa nulla. |
| [Dispose](./dispose/)(bool) override | Non fa nulla. |
| [Peek](./peek/)() override | Legge un singolo carattere dallo stream senza modificare la posizione dello stream. |
| [Read](./read/)() override | Legge un singolo carattere dallo stream. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Legge il numero specificato di caratteri dallo stream nell'array di caratteri specificato a partire dalla posizione specificata. |
| [ReadLine](./readline/)() override | Legge caratteri dallo stream fino alla fine della riga corrente. |
| [ReadToEnd](./readtoend/)() override | Legge caratteri dallo stream fino alla fine dello stream. |
| [StringReader](./stringreader/)(const String\&) | Crea una nuova istanza della classe [StringReader](./) che legge caratteri dalla stringa specificata. |
## Vedi anche

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
