---
title: "System::Xml::XmlNamedNodeMap::Item μέθοδος"
linktitle: "Item"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNamedNodeMap::Item μέθοδος. Ανακτά τον κόμβο στο καθορισμένο δείκτη στο XmlNamedNodeMap σε C++."
type: docs
weight: 800
url: /el/cpp/system.xml/xmlnamednodemap/item/
---
## XmlNamedNodeMap::Item method


Ανακτά τον κόμβο στο καθορισμένο δείκτη στο [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::Item(int32_t index)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| index | int32_t | Η θέση δείκτη του κόμβου που θα ανακτηθεί από το [XmlNamedNodeMap](../). Ο δείκτης είναι μηδενικής βάσης· επομένως, ο δείκτης του πρώτου κόμβου είναι 0 και ο δείκτης του τελευταίου κόμβου είναι [XmlNamedNodeMap::get_Count](../get_count/) - 1. |

### ReturnValue

Το [XmlNode](../../xmlnode/) στον καθορισμένο δείκτη. Εάν το **index** είναι μικρότερο από 0 ή μεγαλύτερο ή ίσο με την τιμή του [XmlNamedNodeMap::get_Count](../get_count/), επιστρέφεται **nullptr**.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
