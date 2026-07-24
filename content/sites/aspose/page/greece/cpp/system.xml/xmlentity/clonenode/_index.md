---
title: "System::Xml::XmlEntity::CloneNode μέθοδος"
linktitle: "CloneNode"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlEntity::CloneNode μέθοδος. Δημιουργεί ένα αντίγραφο αυτού του κόμβου. Οι κόμβοι οντότητας δεν μπορούν να κλωνοποιηθούν. Η κλήση αυτής της μεθόδου σε αντικείμενο XmlEntity προκαλεί εξαίρεση σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml/xmlentity/clonenode/
---
## XmlEntity::CloneNode method


Δημιουργεί ένα αντίγραφο αυτού του κόμβου. Οι κόμβοι οντότητας δεν μπορούν να κλωνοποιηθούν. Η κλήση αυτής της μεθόδου σε αντικείμενο [XmlEntity](../) προκαλεί εξαίρεση.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntity::CloneNode(bool deep) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| βαθύ | bool | **true** για αναδρομική κλωνοποίηση του υποδέντρου κάτω από τον καθορισμένο κόμβο· **false** για κλωνοποίηση μόνο του κόμβου. |

### ReturnValue

Ένα αντίγραφο του [XmlNode](../../xmlnode/) από το οποίο καλείται η μέθοδος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntity](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
