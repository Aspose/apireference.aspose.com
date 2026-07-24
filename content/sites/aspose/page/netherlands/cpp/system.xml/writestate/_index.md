---
title: "System::Xml::WriteState enum"
linktitle: "WriteState"
second_title: "Aspose.Page voor C++"
description: "System::Xml::WriteState enum. Specificeert de status van de XmlWriter in C++."
type: docs
weight: 5700
url: /nl/cpp/system.xml/writestate/
---
## WriteState enum


Specificeert de status van de [XmlWriter](../xmlwriter/).

```cpp
enum class WriteState
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Start | 0 | Geeft aan dat de XmlWriter::Write-methode nog niet is aangeroepen. |
| Prolog | 1 | Geeft aan dat de prolog wordt geschreven. |
| Element | 2 | Geeft aan dat een starttag van een element wordt geschreven. |
| Attribute | 3 | Geeft aan dat een attribuutwaarde wordt geschreven. |
| Content | 4 | Geeft aan dat elementinhoud wordt geschreven. |
| Closed | 5 | Geeft aan dat de [XmlWriter::Close](../xmlwriter/close/)-methode is aangeroepen. |
| Error | 6 | Er is een uitzondering gegooid, waardoor de [XmlWriter](../xmlwriter/) zich in een ongeldige toestand bevindt. Je kunt de [XmlWriter::Close](../xmlwriter/close/)-methode aanroepen om de [XmlWriter](../xmlwriter/) in de [WriteState::Closed](./)-toestand te plaatsen. Elke andere aanroep van een [XmlWriter](../xmlwriter/)-methode resulteert in een InvalidOperationException. |

## Zie ook

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
