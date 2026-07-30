---
title: "Metodo System::Xml::XmlTextReader::ReadChars"
linktitle: "ReadChars"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XmlTextReader::ReadChars. Legge il contenuto testuale di un elemento in un buffer di caratteri. Questo metodo è progettato per leggere grandi flussi di testo incorporato richiamandolo più volte in C++."
type: docs
weight: 4600
url: /it/cpp/system.xml/xmltextreader/readchars/
---
## XmlTextReader::ReadChars method


Legge il contenuto testuale di un elemento in un buffer di caratteri. Questo metodo è progettato per leggere grandi flussi di testo incorporato chiamandolo successivamente.

```cpp
int32_t System::Xml::XmlTextReader::ReadChars(const ArrayPtr<char16_t> &buffer, int32_t index, int32_t count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<char16_t\>\& | L'array di caratteri che funge da buffer su cui vengono scritti i contenuti testuali. |
| indice | int32_t | La posizione all'interno di **buffer** dove il metodo può iniziare a scrivere i contenuti testuali. |
| count | int32_t | Il numero di caratteri da scrivere in **buffer**. |

### ReturnValue

Il numero di caratteri letti. Può essere 0 se il lettore non è posizionato su un elemento o se non ci sono più contenuti testuali da restituire nel contesto corrente.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
