---
title: "System::Xml::XmlElement::GetAttributeNode method"
linktitle: "GetAttributeNode"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlElement::GetAttributeNode method. Επιστρέφει το XmlAttribute με το καθορισμένο τοπικό όνομα και το URI του χώρου ονομάτων σε C++."
type: docs
weight: 1400
url: /el/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


Επιστρέφει το [XmlAttribute](../../xmlattribute/) με το καθορισμένο τοπικό όνομα και το URI του χώρου ονομάτων.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το τοπικό όνομα του χαρακτηριστικού. |
| namespaceURI | String | Το URI του χώρου ονομάτων του χαρακτηριστικού. |

### ReturnValue

Το καθορισμένο [XmlAttribute](../../xmlattribute/) ή **nullptr** εάν δεν βρέθηκε αντίστοιχο χαρακτηριστικό.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetAttributeNode(String) method


Επιστρέφει το [XmlAttribute](../../xmlattribute/) με το καθορισμένο όνομα.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το όνομα του χαρακτηριστικού για ανάκτηση. Αυτό είναι ένα πλήρες όνομα. Συμφωνεί με την τιμή **get_Name** του αντίστοιχου κόμβου. |

### ReturnValue

Το καθορισμένο [XmlAttribute](../../xmlattribute/) ή **nullptr** εάν δεν βρέθηκε αντίστοιχο χαρακτηριστικό.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
