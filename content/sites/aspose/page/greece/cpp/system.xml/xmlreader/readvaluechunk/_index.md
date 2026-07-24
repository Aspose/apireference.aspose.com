---
title: "System::Xml::XmlReader::ReadValueChunk μέθοδος"
linktitle: "ReadValueChunk"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::ReadValueChunk μέθοδος. Διαβάζει μεγάλες ροές κειμένου ενσωματωμένες σε ένα έγγραφο XML σε C++."
type: docs
weight: 7400
url: /el/cpp/system.xml/xmlreader/readvaluechunk/
---
## XmlReader::ReadValueChunk method


Διαβάζει μεγάλα ρεύματα κειμένου ενσωματωμένα σε ένα έγγραφο XML.

```cpp
virtual int32_t System::Xml::XmlReader::ReadValueChunk(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | ArrayPtr\<char16_t\> | Ο πίνακας χαρακτήρων που λειτουργεί ως buffer στον οποίο γράφονται τα περιεχόμενα του κειμένου. Αυτή η τιμή δεν μπορεί να είναι **nullptr**. |
| index | int32_t | Η μετατόπιση εντός του buffer όπου το [XmlReader](../) μπορεί να αρχίσει να αντιγράφει τα αποτελέσματα. |
| count | int32_t | Ο μέγιστος αριθμός χαρακτήρων που θα αντιγραφούν στο buffer. Ο πραγματικός αριθμός των αντιγραμμένων χαρακτήρων επιστρέφεται από αυτή τη μέθοδο. |

### ReturnValue

Ο αριθμός των χαρακτήρων που διαβάζονται στο buffer. Η τιμή μηδέν επιστρέφεται όταν δεν υπάρχει άλλο περιεχόμενο κειμένου.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
