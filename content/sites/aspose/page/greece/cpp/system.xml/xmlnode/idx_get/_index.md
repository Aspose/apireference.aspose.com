---
title: "System::Xml::XmlNode::idx_get μέθοδος"
linktitle: "idx_get"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNode::idx_get μέθοδος. Επιστρέφει το πρώτο στοιχείο-παιδί με τις καθορισμένες τιμές XmlNode::get_LocalName και XmlNode::get_NamespaceURI σε C++."
type: docs
weight: 3000
url: /el/cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String, String) method


Επιστρέφει το πρώτο στοιχείο-παιδί με τις καθορισμένες τιμές [XmlNode::get_LocalName](../get_localname/) και [XmlNode::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localname | String | Το τοπικό όνομα του στοιχείου. |
| ns | String | Το URI του χώρου ονομάτων του στοιχείου. |

### ReturnValue

Το πρώτο [XmlElement](../../xmlelement/) με το αντίστοιχο **localname** και **ns**. Επιστρέφει **nullptr** εάν δεν υπάρχει αντιστοίχιση.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::idx_get(String) method


Επιστρέφει το πρώτο στοιχείο-παιδί με την καθορισμένη [XmlNode::get_Name](../get_name/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το πλήρες όνομα του στοιχείου που θα ανακτηθεί. |

### ReturnValue

Το πρώτο [XmlElement](../../xmlelement/) που ταιριάζει με το καθορισμένο όνομα. Επιστρέφει **nullptr** εάν δεν υπάρχει αντιστοίχιση.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
