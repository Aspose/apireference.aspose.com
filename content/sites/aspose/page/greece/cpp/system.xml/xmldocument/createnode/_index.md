---
title: "Μέθοδος System::Xml::XmlDocument::CreateNode"
linktitle: "CreateNode"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Xml::XmlDocument::CreateNode. Δημιουργεί ένα XmlNode με τον καθορισμένο τύπο κόμβου, XmlDocument::get_Name και XmlNode::get_NamespaceURI σε C++."
type: docs
weight: 1100
url: /el/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


Δημιουργεί ένα [XmlNode](../../xmlnode/) με τον καθορισμένο τύπο κόμβου, [XmlDocument::get_Name](../get_name/) και [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| nodeTypeString | const String\& | Έκδοση [String](../../../system/string/) του [XmlNodeType](../../xmlnodetype/) του νέου κόμβου. Αυτή η παράμετρος πρέπει να είναι μία από τις τιμές που αναφέρονται στον παρακάτω πίνακα. |
| name | const String\& | Το πλήρες όνομα του νέου κόμβου. Εάν το όνομα περιέχει άνω-κάτω τελεία, αναλύεται σε στοιχεία [XmlNode::get_Prefix](../../xmlnode/get_prefix/) και [XmlDocument::get_LocalName](../get_localname/). |
| namespaceURI | const String\& | Το URI του ονοματοχώρου του νέου κόμβου. |

### ReturnValue

Ο νέος [XmlNode](../../xmlnode/).
## Παρατηρήσεις



Η παράμετρος **nodeTypeString** είναι ευαίσθητη σε πεζά/κεφαλαία και πρέπει να είναι μία από τις τιμές στον παρακάτω πίνακα: |||
|-|-|
| nodeTypeString | XmlNodeType |
| attribute | Attribute |
| cdatasection | CDATA |
| comment | Comment |
| document | Document |
| documentfragment | DocumentFragment |
| documenttype | DocumentType |
| element | Element |
| entityreference | EntityReference |
| processinginstruction | ProcessingInstruction |
| significantwhitespace | SignificantWhitespace |
| text | Text |
| whitespace | Κενοί χαρακτήρες |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


Δημιουργεί ένα [XmlNode](../../xmlnode/) με το καθορισμένο [XmlNodeType](../../xmlnodetype/), [XmlDocument::get_Name](../get_name/), και [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| type | XmlNodeType | Το [XmlNodeType](../../xmlnodetype/) του νέου κόμβου. |
| name | const String\& | Το πλήρες όνομα του νέου κόμβου. Εάν το όνομα περιέχει άνω-κάτω τελεία, τότε αναλύεται στα στοιχεία [XmlNode::get_Prefix](../../xmlnode/get_prefix/) και [XmlDocument::get_LocalName](../get_localname/) συστατικά. |
| namespaceURI | const String\& | Το URI του ονοματοχώρου του νέου κόμβου. |

### ReturnValue

Ο νέος [XmlNode](../../xmlnode/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


Δημιουργεί ένα [XmlNode](../../xmlnode/) με το καθορισμένο [XmlNodeType](../../xmlnodetype/), [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_Name](../get_name/), και [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| type | XmlNodeType | Το [XmlNodeType](../../xmlnodetype/) του νέου κόμβου. |
| πρόθεμα | const String\& | Το πρόθεμα του νέου κόμβου. |
| όνομα | const String\& | Το τοπικό όνομα του νέου κόμβου. |
| namespaceURI | const String\& | Το URI του ονοματοχώρου του νέου κόμβου. |

### ReturnValue

Ο νέος [XmlNode](../../xmlnode/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
