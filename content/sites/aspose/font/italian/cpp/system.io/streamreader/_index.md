---
title: "Classe System::IO::StreamReader"
linktitle: "StreamReader"
second_title: "Aspose.Font per C++"
description: "Classe System::IO::StreamReader. Rappresenta un lettore che legge caratteri da un flusso di byte. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2200
url: /it/cpp/system.io/streamreader/
---
## StreamReader class


Rappresenta un lettore che legge caratteri da un flusso di byte. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class StreamReader : public System::IO::TextReader
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() override | Chiude i flussi corrente e sottostanti. |
| [Dispose](./dispose/)() override | Rilascia tutte le risorse utilizzate dall'oggetto corrente e chiude lo stream sottostante. |
| [get_BaseStream](./get_basestream/)() const | Restituisce un puntatore condiviso a un oggetto che rappresenta il flusso sottostante. |
| [get_CurrentEncoding](./get_currentencoding/)() | Restituisce la codifica attualmente utilizzata. |
| [get_EndOfStream](./get_endofstream/)() | Restituisce un valore che indica se è stata raggiunta la fine del flusso. |
| [Peek](./peek/)() override | Legge un singolo carattere dal flusso senza modificare il cursore di lettura del flusso. |
| [Read](./read/)() override | Legge un singolo carattere dal flusso. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Legge il numero specificato di caratteri dal flusso, li converte nella codifica UTF-16 e scrive i caratteri UTF-16 risultanti nell'array di caratteri specificato a partire dalla posizione indicata. |
| [ReadLine](./readline/)() override | Legge i caratteri dal flusso fino alla fine della riga corrente. |
| [ReadToEnd](./readtoend/)() override | Legge i caratteri dal flusso fino alla fine del flusso. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&) | Crea un'istanza dell'oggetto [StreamReader](./) che legge caratteri dal flusso sottostante specificato usando la codifica UTF-8 e un buffer con dimensione predefinita di 1024 byte. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, bool) | Crea un'istanza dell'oggetto [StreamReader](./) che legge caratteri dal flusso sottostante specificato usando la codifica UTF-8 e un buffer con dimensione predefinita di 1024 byte. Un parametro specifica se deve essere abilitata la rilevazione del marcatore di ordine dei byte. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | Crea un'istanza dell'oggetto [StreamReader](./) che legge caratteri dal flusso sottostante specificato usando la codifica specificata e un buffer con dimensione predefinita di 1024 byte. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) | Crea un'istanza dell'oggetto [StreamReader](./) che legge caratteri dal flusso sottostante specificato usando la codifica specificata e un buffer con dimensione predefinita di 1024 byte. Un parametro specifica se deve essere abilitata la rilevazione del marcatore di ordine dei byte. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) | Crea un'istanza dell'oggetto [StreamReader](./) che legge caratteri dal flusso sottostante specificato usando la codifica specificata e un buffer della dimensione specificata. Un parametro specifica se deve essere abilitata la rilevazione del marcatore di ordine dei byte. |
| [StreamReader](./streamreader/)(const System::String\&) | Crea un'istanza dell'oggetto [StreamReader](./) che legge caratteri dal file specificato usando la codifica UTF-8 e un buffer con dimensione predefinita di 4096 byte. |
| [StreamReader](./streamreader/)(const System::String\&, bool) | Crea un'istanza dell'oggetto [StreamReader](./) che legge caratteri dal file specificato usando la codifica UTF-8 e un buffer con dimensione predefinita di 4096 byte. Un parametro specifica se deve essere abilitata la rilevazione del marcatore di ordine dei byte. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&) | Crea un'istanza dell'oggetto [StreamReader](./) che legge caratteri dal file specificato usando la codifica specificata e un buffer con dimensione predefinita di 4096 byte. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool) | Crea un'istanza dell'oggetto [StreamReader](./) che legge caratteri dal flusso sottostante specificato usando la codifica specificata e un buffer con dimensione predefinita di 4096 byte. Un parametro specifica se deve essere abilitata la rilevazione del marcatore di ordine dei byte. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool, int) | Crea un'istanza dell'oggetto [StreamReader](./) che legge caratteri dal file specificato usando la codifica specificata e un buffer della dimensione specificata. Un parametro specifica se deve essere abilitata la rilevazione del marcatore di ordine dei byte. |
| [~StreamReader](./~streamreader/)() | Distruttore. |
## Vedi anche

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
