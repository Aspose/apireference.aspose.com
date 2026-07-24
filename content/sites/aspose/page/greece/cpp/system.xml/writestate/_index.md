---
title: "System::Xml::WriteState enum"
linktitle: "WriteState"
second_title: "Aspose.Page για C++"
description: "System::Xml::WriteState enum. Καθορίζει την κατάσταση του XmlWriter σε C++."
type: docs
weight: 5700
url: /el/cpp/system.xml/writestate/
---
## WriteState enum


Καθορίζει την κατάσταση του [XmlWriter](../xmlwriter/).

```cpp
enum class WriteState
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| Έναρξη | 0 | Δείχνει ότι η μέθοδος XmlWriter::Write δεν έχει κληθεί ακόμη. |
| Prolog | 1 | Δείχνει ότι γράφεται το πρόλογος. |
| Element | 2 | Δείχνει ότι γράφεται η ετικέτα έναρξης ενός στοιχείου. |
| Attribute | 3 | Δείχνει ότι γράφεται η τιμή ενός χαρακτηριστικού. |
| Content | 4 | Δείχνει ότι γράφεται το περιεχόμενο του στοιχείου. |
| Closed | 5 | Δείχνει ότι η μέθοδος [XmlWriter::Close](../xmlwriter/close/) έχει κληθεί. |
| Error | 6 | Έχει ριχθεί μια εξαίρεση, η οποία άφησε το [XmlWriter](../xmlwriter/) σε μη έγκυρη κατάσταση. Μπορείτε να καλέσετε τη μέθοδο [XmlWriter::Close](../xmlwriter/close/) για να τοποθετήσετε το [XmlWriter](../xmlwriter/) στην κατάσταση [WriteState::Closed](./). Οποιαδήποτε άλλη κλήση μεθόδου του [XmlWriter](../xmlwriter/) οδηγεί σε InvalidOperationException. |

## Δείτε επίσης

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
