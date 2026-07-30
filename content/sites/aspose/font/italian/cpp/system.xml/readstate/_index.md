---
title: "enum System::Xml::ReadState"
linktitle: "ReadState"
second_title: "Aspose.Font per C++"
description: "enum System::Xml::ReadState. Specifica lo stato del lettore in C++."
type: docs
weight: 5300
url: /it/cpp/system.xml/readstate/
---
## ReadState enum


Specifica lo stato del reader.

```cpp
enum class ReadState
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Initial | 0 | Il metodo [XmlReader::Read](../xmlreader/read/) non è stato chiamato. |
| Interactive | 1 | Il metodo [XmlReader::Read](../xmlreader/read/) è stato chiamato. È possibile chiamare metodi aggiuntivi sul lettore. |
| Error | 2 | Si è verificato un errore che impedisce il proseguimento dell'operazione di lettura. |
| EndOfFile | 3 | La fine del file è stata raggiunta con successo. |
| Closed | 4 | Il metodo [XmlReader::Close](../xmlreader/close/) è stato chiamato. |

## Vedi anche

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
