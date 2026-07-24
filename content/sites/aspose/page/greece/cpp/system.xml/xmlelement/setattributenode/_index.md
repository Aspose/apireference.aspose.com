---
title: "System::Xml::XmlElement::SetAttributeNode method"
linktitle: "SetAttributeNode"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlElement::SetAttributeNode μέθοδος. Προσθέτει το καθορισμένο XmlAttribute σε C++."
type: docs
weight: 2700
url: /el/cpp/system.xml/xmlelement/setattributenode/
---
## XmlElement::SetAttributeNode(SharedPtr\<XmlAttribute\>) method


Προσθέτει το καθορισμένο [XmlAttribute](../../xmlattribute/).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(SharedPtr<XmlAttribute> newAttr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| newAttr | SharedPtr\<XmlAttribute\> | Ο κόμβος [XmlAttribute](../../xmlattribute/) για προσθήκη στη συλλογή χαρακτηριστικών για αυτό το στοιχείο. |

### ReturnValue

Εάν το χαρακτηριστικό αντικαθιστά ένα υπάρχον χαρακτηριστικό με το ίδιο όνομα, το παλιό [XmlAttribute](../../xmlattribute/) επιστρέφεται· διαφορετικά, **nullptr** επιστρέφεται.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::SetAttributeNode(String, String) method


Προσθέτει το καθορισμένο [XmlAttribute](../../xmlattribute/).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το τοπικό όνομα του χαρακτηριστικού. |
| namespaceURI | String | Το URI του χώρου ονομάτων του χαρακτηριστικού. |

### ReturnValue

Το [XmlAttribute](../../xmlattribute/) για προσθήκη.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
