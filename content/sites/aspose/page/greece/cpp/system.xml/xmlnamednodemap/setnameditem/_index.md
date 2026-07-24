---
title: "System::Xml::XmlNamedNodeMap::SetNamedItem μέθοδος"
linktitle: "SetNamedItem"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNamedNodeMap::SetNamedItem μέθοδος. Προσθέτει ένα XmlNode χρησιμοποιώντας την τιμή XmlNode::get_Name του σε C++."
type: docs
weight: 1000
url: /el/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


Προσθέτει ένα [XmlNode](../../xmlnode/) χρησιμοποιώντας την τιμή [XmlNode::get_Name](../../xmlnode/get_name/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | Ένα [XmlNode](../../xmlnode/) για αποθήκευση στο [XmlNamedNodeMap](../). Εάν ένας κόμβος με αυτό το όνομα υπάρχει ήδη στον χάρτη, αντικαθίσταται από το νέο. |

### ReturnValue

Εάν το **node** αντικαθιστά έναν υπάρχοντα κόμβο με το ίδιο όνομα, επιστρέφεται ο παλιός κόμβος· διαφορετικά, επιστρέφεται **nullptr**.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
