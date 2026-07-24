---
title: "System::Xml::XmlDeclaration::CloneNode method"
linktitle: "CloneNode"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlDeclaration::CloneNode method. Δημιουργεί ένα αντίγραφο αυτού του κόμβου σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml/xmldeclaration/clonenode/
---
## XmlDeclaration::CloneNode method


Δημιουργεί ένα αντίγραφο αυτού του κόμβου.

```cpp
SharedPtr<XmlNode> System::Xml::XmlDeclaration::CloneNode(bool deep) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| deep | bool | **true** για να κλωνοποιήσετε αναδρομικά το υποδέντρο κάτω από τον καθορισμένο κόμβο· **false** για να κλωνοποιήσετε μόνο τον ίδιο τον κόμβο. Επειδή οι κόμβοι [XmlDeclaration](../) δεν έχουν παιδιά, ο κλωνοποιημένος κόμβος περιλαμβάνει πάντα την τιμή δεδομένων, ανεξάρτητα από τη ρύθμιση της παραμέτρου. |

### ReturnValue

Ο κλωνοποιημένος κόμβος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
