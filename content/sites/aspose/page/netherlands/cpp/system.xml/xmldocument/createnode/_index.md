---
title: "System::Xml::XmlDocument::CreateNode methode"
linktitle: "CreateNode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlDocument::CreateNode-methode. Maakt een XmlNode aan met het opgegeven knooptype, XmlDocument::get_Name en XmlNode::get_NamespaceURI in C++."
type: docs
weight: 1100
url: /nl/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


Maakt een [XmlNode](../../xmlnode/) aan met het opgegeven knooptype, [XmlDocument::get_Name](../get_name/) en [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| nodeTypeString | const String\& | De [String](../../../system/string/) versie van de [XmlNodeType](../../xmlnodetype/) van het nieuwe knooppunt. Deze parameter moet een van de waarden zijn die in de onderstaande tabel staan. |
| name | const String\& | De gekwalificeerde naam van het nieuwe knooppunt. Als de naam een dubbele punt bevat, wordt deze geparseerd in [XmlNode::get_Prefix](../../xmlnode/get_prefix/) en [XmlDocument::get_LocalName](../get_localname/) componenten. |
| namespaceURI | const String\& | De namespace-URI van het nieuwe knooppunt. |

### ReturnValue

Het nieuwe [XmlNode](../../xmlnode/).
## Opmerkingen



De **nodeTypeString**-parameter is hoofdlettergevoelig en moet een van de waarden in de volgende tabel zijn: |||
|-|-|
| nodeTypeString | XmlNodeType |
| attribuut | Attribute |
| cdatasection | CDATA |
| opmerking | Comment |
| document | Document |
| documentfragment | DocumentFragment |
| documenttype | DocumentType |
| element | Element |
| entityreference | EntityReference |
| processinginstruction | ProcessingInstruction |
| significantwhitespace | SignificantWhitespace |
| text | Text |
| whitespace | Witruimte |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


Maakt een [XmlNode](../../xmlnode/) met het opgegeven [XmlNodeType](../../xmlnodetype/), [XmlDocument::get_Name](../get_name/) en [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| type | XmlNodeType | Het [XmlNodeType](../../xmlnodetype/) van het nieuwe knooppunt. |
| name | const String\& | De gekwalificeerde naam van het nieuwe knooppunt. Als de naam een dubbelepunt bevat, wordt deze geparseerd in de componenten [XmlNode::get_Prefix](../../xmlnode/get_prefix/) en [XmlDocument::get_LocalName](../get_localname/). |
| namespaceURI | const String\& | De namespace-URI van het nieuwe knooppunt. |

### ReturnValue

Het nieuwe [XmlNode](../../xmlnode/).

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


Maakt een [XmlNode](../../xmlnode/) met het opgegeven [XmlNodeType](../../xmlnodetype/), [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_Name](../get_name/) en [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| type | XmlNodeType | Het [XmlNodeType](../../xmlnodetype/) van het nieuwe knooppunt. |
| prefix | const String\& | Het voorvoegsel van het nieuwe knooppunt. |
| name | const String\& | De lokale naam van het nieuwe knooppunt. |
| namespaceURI | const String\& | De namespace-URI van het nieuwe knooppunt. |

### ReturnValue

Het nieuwe [XmlNode](../../xmlnode/).

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
