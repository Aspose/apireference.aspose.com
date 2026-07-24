---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem μέθοδος"
linktitle: "RemoveNamedItem"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNamedNodeMap::RemoveNamedItem μέθοδος. Αφαιρεί έναν κόμβο με τις αντίστοιχες τιμές XmlNode::get_LocalName και XmlNode::get_NamespaceURI σε C++."
type: docs
weight: 900
url: /el/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


Αφαιρεί έναν κόμβο με τις αντίστοιχες τιμές [XmlNode::get_LocalName](../../xmlnode/get_localname/) και [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το τοπικό όνομα του κόμβου για αφαίρεση. |
| namespaceURI | String | Το URI ονόματος χώρου του κόμβου για αφαίρεση. |

### ReturnValue

Το [XmlNode](../../xmlnode/) που αφαιρέθηκε ή **nullptr** εάν δεν βρέθηκε αντίστοιχος κόμβος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


Αφαιρεί τον κόμβο από το [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| name | String | Το πλήρες όνομα του κόμβου για αφαίρεση. Το όνομα ταιριάζει με την τιμή [XmlNode::get_Name](../../xmlnode/get_name/) του αντίστοιχου κόμβου. |

### ReturnValue

Το [XmlNode](../../xmlnode/) που αφαιρέθηκε από αυτό το [XmlNamedNodeMap](../) ή **nullptr** εάν δεν βρέθηκε αντίστοιχος κόμβος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
