---
title: "Μέθοδος System::Xml::XmlNotation::CloneNode"
linktitle: "CloneNode"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Xml::XmlNotation::CloneNode. Δημιουργεί ένα αντίγραφο αυτού του κόμβου. Οι κόμβοι Notation δεν μπορούν να κλωνοποιηθούν. Η κλήση αυτής της μεθόδου σε αντικείμενο XmlNotation προκαλεί εξαίρεση σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml/xmlnotation/clonenode/
---
## XmlNotation::CloneNode method


Δημιουργεί ένα αντίγραφο αυτού του κόμβου. Οι κόμβοι Notation δεν μπορούν να κλωνοποιηθούν. Η κλήση αυτής της μεθόδου σε αντικείμενο [XmlNotation](../) προκαλεί εξαίρεση.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNotation::CloneNode(bool deep) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| βαθύ | bool | **true** για αναδρομική κλωνοποίηση του υποδέντρου κάτω από τον καθορισμένο κόμβο· **false** για κλωνοποίηση μόνο του κόμβου. |

### ReturnValue

Ένα αντίγραφο [XmlNode](../../xmlnode/) του κόμβου από τον οποίο κλήθηκε η μέθοδος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNotation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
