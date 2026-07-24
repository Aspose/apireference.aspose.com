---
title: "System::Xml::ReadState enum"
linktitle: "ReadState"
second_title: "Aspose.Page per C++"
description: "System::Xml::ReadState enum. Specifica lo stato del lettore in C++."
type: docs
weight: 5300
url: /it/cpp/system.xml/readstate/
---
## ReadState enum


Specifica lo stato del lettore.

```cpp
enum class ReadState
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Initial | 0 | Il metodo [XmlReader::Read](../xmlreader/read/) non è stato chiamato. |
| Interactive | 1 | Il metodo [XmlReader::Read](../xmlreader/read/) è stato chiamato. È possibile chiamare metodi aggiuntivi sul lettore. |
| Errore | 2 | Si è verificato un errore che impedisce il proseguimento dell'operazione di lettura. |
| EndOfFile | 3 | La fine del file è stata raggiunta con successo. |
| Closed | 4 | Il metodo [XmlReader::Close](../xmlreader/close/) è stato chiamato. |

## Vedi anche

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
