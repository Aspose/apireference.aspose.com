---
title: "System::Xml::XmlReader::ReadValueChunk metodo"
linktitle: "ReadValueChunk"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlReader::ReadValueChunk metodo. Legge grandi flussi di testo incorporati in un documento XML in C++."
type: docs
weight: 7400
url: /it/cpp/system.xml/xmlreader/readvaluechunk/
---
## XmlReader::ReadValueChunk method


Legge grandi flussi di testo incorporati in un documento XML.

```cpp
virtual int32_t System::Xml::XmlReader::ReadValueChunk(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | ArrayPtr\<char16_t\> | L'array di caratteri che funge da buffer su cui vengono scritti i contenuti di testo. Questo valore non può essere **nullptr**. |
| index | int32_t | L'offset all'interno del buffer dove il [XmlReader](../) può iniziare a copiare i risultati. |
| count | int32_t | Il numero massimo di caratteri da copiare nel buffer. Il numero effettivo di caratteri copiati viene restituito da questo metodo. |

### ReturnValue

Il numero di caratteri letti nel buffer. Il valore zero viene restituito quando non c'è più contenuto di testo.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
