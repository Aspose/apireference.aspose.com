---
title: "System::Xml::DtdProcessing enum"
linktitle: "DtdProcessing"
second_title: "Aspose.Page για C++"
description: "System::Xml::DtdProcessing enum. Καθορίζει τις επιλογές για την επεξεργασία DTD. Η απαρίθμηση DtdProcessing χρησιμοποιείται από την κλάση XmlReaderSettings σε C++."
type: docs
weight: 4700
url: /el/cpp/system.xml/dtdprocessing/
---
## DtdProcessing enum


Καθορίζει τις επιλογές για την επεξεργασία DTD. Η απαρίθμηση [DtdProcessing](./) χρησιμοποιείται από την κλάση [XmlReaderSettings](../xmlreadersettings/).

```cpp
enum class DtdProcessing
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| Prohibit | 0 | Καθορίζει ότι όταν εντοπίζεται ένα DTD, μια [XmlException](../xmlexception/) ρίχνεται με μήνυμα που δηλώνει ότι τα DTD απαγορεύονται. Αυτή είναι η προεπιλεγμένη συμπεριφορά. |
| Ignore | 1 | Κάνει το στοιχείο DOCTYPE να αγνοείται. Δεν πραγματοποιείται επεξεργασία DTD και το DTD/DOCTYPE χάνεται στην έξοδο. |
| Parse | 2 | Χρησιμοποιείται για την ανάλυση DTD. |

## Δείτε επίσης

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
