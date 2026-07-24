---
title: "System::Xml::XmlTextReader::ReadChars μέθοδος"
linktitle: "ReadChars"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlTextReader::ReadChars μέθοδος. Διαβάζει το κείμενο ενός στοιχείου σε έναν buffer χαρακτήρων. Αυτή η μέθοδος έχει σχεδιαστεί για να διαβάζει μεγάλες ροές ενσωματωμένου κειμένου καλώντας την διαδοχικά σε C++."
type: docs
weight: 4600
url: /el/cpp/system.xml/xmltextreader/readchars/
---
## XmlTextReader::ReadChars method


Διαβάζει το κείμενο ενός στοιχείου σε έναν buffer χαρακτήρων. Αυτή η μέθοδος σχεδιάστηκε για την ανάγνωση μεγάλων ροών ενσωματωμένου κειμένου καλώντας την διαδοχικά.

```cpp
int32_t System::Xml::XmlTextReader::ReadChars(const ArrayPtr<char16_t> &buffer, int32_t index, int32_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<char16_t\>\& | Ο πίνακας χαρακτήρων που λειτουργεί ως buffer στον οποίο γράφεται το κείμενο. |
| δείκτης | int32_t | Η θέση μέσα στο **buffer** όπου η μέθοδος μπορεί να αρχίσει να γράφει το κείμενο. |
| count | int32_t | Ο αριθμός των χαρακτήρων που θα γραφτούν στο **buffer**. |

### ReturnValue

Ο αριθμός των χαρακτήρων που διαβάστηκαν. Μπορεί να είναι 0 εάν ο αναγνώστης δεν βρίσκεται σε στοιχείο ή εάν δεν υπάρχει άλλο κείμενο προς επιστροφή στο τρέχον πλαίσιο.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
