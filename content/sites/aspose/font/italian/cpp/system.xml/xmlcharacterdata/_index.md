---
title: "Classe System::Xml::XmlCharacterData"
linktitle: "XmlCharacterData"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlCharacterData. Fornisce metodi di manipolazione del testo utilizzati da diverse classi in C++."
type: docs
weight: 900
url: /it/cpp/system.xml/xmlcharacterdata/
---
## XmlCharacterData class


Fornisce metodi di manipolazione del testo utilizzati da diverse classi.

```cpp
class XmlCharacterData : public System::Xml::XmlLinkedNode
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [AppendData](./appenddata/)(String) | Aggiunge la stringa specificata alla fine dei dati di carattere del nodo. |
| virtual [DeleteData](./deletedata/)(int32_t, int32_t) | Rimuove un intervallo di caratteri dal nodo. |
| virtual [get_Data](./get_data/)() | Restituisce i dati del nodo. |
| [get_InnerText](./get_innertext/)() override | Restituisce i valori concatenati del nodo e di tutti i suoi figli. |
| virtual [get_Length](./get_length/)() | Restituisce la lunghezza dei dati, in caratteri. |
| [get_Value](./get_value/)() override | Restituisce il valore del nodo. |
| virtual [InsertData](./insertdata/)(int32_t, String) | Inserisce la stringa specificata alla posizione di offset di carattere specificata. |
| virtual [ReplaceData](./replacedata/)(int32_t, int32_t, String) | Sostituisce il numero specificato di caratteri a partire dall'offset specificato con la stringa specificata. |
| virtual [set_Data](./set_data/)(String) | Imposta i dati del nodo. |
| [set_InnerText](./set_innertext/)(String) override | Imposta i valori concatenati del nodo e di tutti i suoi figli. |
| [set_Value](./set_value/)(String) override | Imposta il valore del nodo. |
| virtual [Substring](./substring/)(int32_t, int32_t) | Recupera una sottostringa della stringa completa dall'intervallo specificato. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Vedi anche

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
