---
title: "System::Xml::XmlCDataSection::CloneNode μέθοδος"
linktitle: "CloneNode"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlCDataSection::CloneNode μέθοδος. Δημιουργεί ένα αντίγραφο αυτού του κόμβου σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml/xmlcdatasection/clonenode/
---
## XmlCDataSection::CloneNode method


Δημιουργεί ένα αντίγραφο αυτού του κόμβου.

```cpp
SharedPtr<XmlNode> System::Xml::XmlCDataSection::CloneNode(bool deep) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| βαθύ | bool | **true** για να κλωνοποιήσετε αναδρομικά το υποδέντρο κάτω από τον καθορισμένο κόμβο· **false** για να κλωνοποιήσετε μόνο τον ίδιο τον κόμβο. Επειδή οι κόμβοι CDATA δεν έχουν παιδιά, ανεξάρτητα από τη ρύθμιση της παραμέτρου, ο κλωνοποιημένος κόμβος θα περιλαμβάνει πάντα το περιεχόμενο των δεδομένων. |

### ReturnValue

Ο κλωνοποιημένος κόμβος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlCDataSection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
