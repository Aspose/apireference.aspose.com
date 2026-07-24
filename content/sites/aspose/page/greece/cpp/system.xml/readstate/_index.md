---
title: "System::Xml::ReadState enum"
linktitle: "ReadState"
second_title: "Aspose.Page για C++"
description: "System::Xml::ReadState enum. Καθορίζει την κατάσταση του αναγνώστη σε C++."
type: docs
weight: 5300
url: /el/cpp/system.xml/readstate/
---
## ReadState enum


Καθορίζει την κατάσταση του αναγνώστη.

```cpp
enum class ReadState
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| Initial | 0 | Η μέθοδος [XmlReader::Read](../xmlreader/read/) δεν έχει κληθεί. |
| Interactive | 1 | Η μέθοδος [XmlReader::Read](../xmlreader/read/) έχει κληθεί. Επιπλέον μέθοδοι μπορεί να κληθούν στον αναγνώστη. |
| Σφάλμα | 2 | Παρουσιάστηκε σφάλμα που εμποδίζει τη συνέχιση της λειτουργίας ανάγνωσης. |
| EndOfFile | 3 | Το τέλος του αρχείου έχει επιτευχθεί με επιτυχία. |
| Closed | 4 | Η μέθοδος [XmlReader::Close](../xmlreader/close/) έχει κληθεί. |

## Δείτε επίσης

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
