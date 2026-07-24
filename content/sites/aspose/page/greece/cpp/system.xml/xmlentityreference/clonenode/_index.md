---
title: "System::Xml::XmlEntityReference::CloneNode μέθοδος"
linktitle: "CloneNode"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlEntityReference::CloneNode μέθοδος. Δημιουργεί ένα αντίγραφο αυτού του κόμβου σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml/xmlentityreference/clonenode/
---
## XmlEntityReference::CloneNode method


Δημιουργεί ένα αντίγραφο αυτού του κόμβου.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntityReference::CloneNode(bool deep) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| deep | bool | **true** για να κλωνοποιήσετε αναδρομικά το υποδέντρο κάτω από τον καθορισμένο κόμβο· **false** για να κλωνοποιήσετε μόνο τον ίδιο τον κόμβο. Για κόμβους [XmlEntityReference](../), αυτή η μέθοδος επιστρέφει πάντα έναν κόμβο αναφοράς οντότητας χωρίς παιδιά. Το κείμενο αντικατάστασης ορίζεται όταν ο κόμβος εισάγεται σε έναν γονέα. |

### ReturnValue

Ο κλωνοποιημένος κόμβος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntityReference](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
