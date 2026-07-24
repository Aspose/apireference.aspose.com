---
title: "System::Xml::XmlElement::RemoveAttributeNode μέθοδος"
linktitle: "RemoveAttributeNode"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlElement::RemoveAttributeNode μέθοδος. Αφαιρεί το καθορισμένο XmlAttribute σε C++."
type: docs
weight: 2100
url: /el/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


Αφαιρεί το καθορισμένο [XmlAttribute](../../xmlattribute/).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | Ο κόμβος [XmlAttribute](../../xmlattribute/) που θα αφαιρεθεί. Εάν το αφαιρεθέν χαρακτηριστικό έχει προεπιλεγμένη τιμή, αντικαθίσταται αμέσως. |

### ReturnValue

Το αφαιρεθέν [XmlAttribute](../../xmlattribute/) ή **nullptr** εάν **oldAttr** δεν είναι κόμβος χαρακτηριστικού του [XmlElement](../).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


Αφαιρεί το [XmlAttribute](../../xmlattribute/) που καθορίζεται από το τοπικό όνομα και το URI του χώρου ονομάτων. (Εάν το αφαιρεθέν χαρακτηριστικό έχει προεπιλεγμένη τιμή, αντικαθίσταται αμέσως).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το τοπικό όνομα του χαρακτηριστικού. |
| namespaceURI | String | Το URI του χώρου ονομάτων του χαρακτηριστικού. |

### ReturnValue

Το αφαιρεθέν [XmlAttribute](../../xmlattribute/) ή **nullptr** εάν το [XmlElement](../) δεν διαθέτει αντίστοιχο κόμβο χαρακτηριστικού.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
