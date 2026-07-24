---
title: "System::Xml::XmlComment::CloneNode μέθοδος"
linktitle: "CloneNode"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlComment::CloneNode μέθοδος. Δημιουργεί ένα αντίγραφο αυτού του κόμβου σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml/xmlcomment/clonenode/
---
## XmlComment::CloneNode method


Δημιουργεί ένα αντίγραφο αυτού του κόμβου.

```cpp
SharedPtr<XmlNode> System::Xml::XmlComment::CloneNode(bool deep) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| βαθύ | bool | **true** για να κλωνοποιηθεί αναδρομικά το υποδέντρο κάτω από τον καθορισμένο κόμβο· **false** για να κλωνοποιηθεί μόνο ο ίδιος ο κόμβος. Επειδή οι κόμβοι σχολίων δεν έχουν παιδιά, ο κλωνοποιημένος κόμβος περιλαμβάνει πάντα το κείμενο, ανεξάρτητα από τη ρύθμιση της παραμέτρου. |

### ReturnValue

Ο κλωνοποιημένος κόμβος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlComment](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
