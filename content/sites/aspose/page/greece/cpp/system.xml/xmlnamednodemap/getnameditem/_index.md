---
title: "System::Xml::XmlNamedNodeMap::GetNamedItem μέθοδος"
linktitle: "GetNamedItem"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNamedItem::GetNamedItem μέθοδος. Ανακτά έναν κόμβο με τις αντίστοιχες τιμές XmlNode::get_LocalName και XmlNode::get_NamespaceURI σε C++."
type: docs
weight: 700
url: /el/cpp/system.xml/xmlnamednodemap/getnameditem/
---
## XmlNamedNodeMap::GetNamedItem(String, String) method


Ανακτά έναν κόμβο με τις αντίστοιχες τιμές [XmlNode::get_LocalName](../../xmlnode/get_localname/) και [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String localName, String namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το τοπικό όνομα του κόμβου για ανάκτηση. |
| namespaceURI | String | Το Uniform Resource Identifier (URI) του ονόματος χώρου του κόμβου για ανάκτηση. |

### ReturnValue

Ένα [XmlNode](../../xmlnode/) με το αντίστοιχο τοπικό όνομα και URI ονόματος χώρου ή **nullptr** εάν δεν βρέθηκε αντίστοιχος κόμβος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::GetNamedItem(String) method


Ανακτά ένα [XmlNode](../../xmlnode/) που καθορίζεται με όνομα.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String name)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| name | String | Το πλήρες όνομα του κόμβου για ανάκτηση. Συμφωνεί με την τιμή [XmlNode::get_Name](../../xmlnode/get_name/) του αντίστοιχου κόμβου. |

### ReturnValue

Ένα [XmlNode](../../xmlnode/) με το καθορισμένο όνομα ή **nullptr** εάν δεν βρεθεί αντίστοιχος κόμβος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
