---
title: "System::Xml::ReadState enum"
linktitle: "ReadState"
second_title: "Aspose.Page voor C++"
description: "System::Xml::ReadState enum. Specificeert de status van de lezer in C++."
type: docs
weight: 5300
url: /nl/cpp/system.xml/readstate/
---
## ReadState enum


Specificeert de status van de lezer.

```cpp
enum class ReadState
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Initial | 0 | De [XmlReader::Read](../xmlreader/read/) methode is niet aangeroepen. |
| Interactive | 1 | De [XmlReader::Read](../xmlreader/read/) methode is aangeroepen. Er kunnen extra methoden op de lezer worden aangeroepen. |
| Error | 2 | Er is een fout opgetreden die voorkomt dat de leesoperatie wordt voortgezet. |
| EndOfFile | 3 | Het einde van het bestand is succesvol bereikt. |
| Closed | 4 | De [XmlReader::Close](../xmlreader/close/) methode is aangeroepen. |

## Zie ook

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
