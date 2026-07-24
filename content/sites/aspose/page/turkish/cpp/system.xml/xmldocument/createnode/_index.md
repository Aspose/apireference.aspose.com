---
title: "System::Xml::XmlDocument::CreateNode yöntemi"
linktitle: "CreateNode"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlDocument::CreateNode yöntemi. C++'da belirtilen düğüm türü, XmlDocument::get_Name ve XmlNode::get_NamespaceURI ile bir XmlNode oluşturur."
type: docs
weight: 1100
url: /tr/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


Belirtilen düğüm türü, [XmlDocument::get_Name](../get_name/) ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) ile bir [XmlNode](../../xmlnode/) oluşturur.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| nodeTypeString | const String\& | Yeni düğümün [XmlNodeType](../../xmlnodetype/) için [String](../../../system/string/) sürümü. Bu parametre aşağıdaki tabloda listelenen değerlerden biri olmalıdır. |
| name | const String\& | Yeni düğümün nitelikli adı. Ad bir iki nokta üst üste (:) içeriyorsa, [XmlNode::get_Prefix](../../xmlnode/get_prefix/) ve [XmlDocument::get_LocalName](../get_localname/) bileşenlerine ayrılır. |
| namespaceURI | const String\& | Yeni düğümün ad alanı URI'si. |

### ReturnValue

Yeni [XmlNode](../../xmlnode/).
## Açıklamalar



**nodeTypeString** parametresi büyük/küçük harfe duyarlıdır ve aşağıdaki tablodaki değerlerden biri olmalıdır: |||
|-|-|
| nodeTypeString | XmlNodeType |
| öznitelik | Attribute |
| cdatasection | CDATA |
| yorum | Comment |
| belge | Document |
| belgeparçacığı | DocumentFragment |
| belge türü | DocumentType |
| öğe | Element |
| entityreference | EntityReference |
| processinginstruction | ProcessingInstruction |
| significantwhitespace | SignificantWhitespace |
| text | Text |
| whitespace | Boşluk |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


Belirtilen [XmlNodeType](../../xmlnodetype/), [XmlDocument::get_Name](../get_name/) ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) ile bir [XmlNode](../../xmlnode/) oluşturur.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| type | XmlNodeType | Yeni düğümün [XmlNodeType](../../xmlnodetype/). |
| name | const String\& | Yeni düğümün nitelikli adı. Ad bir iki nokta üst üste içeriyorsa, [XmlNode::get_Prefix](../../xmlnode/get_prefix/) ve [XmlDocument::get_LocalName](../get_localname/) bileşenlerine ayrılır. |
| namespaceURI | const String\& | Yeni düğümün ad alanı URI'si. |

### ReturnValue

Yeni [XmlNode](../../xmlnode/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


Belirtilen [XmlNodeType](../../xmlnodetype/), [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_Name](../get_name/) ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) ile bir [XmlNode](../../xmlnode/) oluşturur.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| type | XmlNodeType | Yeni düğümün [XmlNodeType](../../xmlnodetype/). |
| önek | const String\& | Yeni düğümün öneki. |
| ad | const String\& | Yeni düğümün yerel adı. |
| namespaceURI | const String\& | Yeni düğümün ad alanı URI'si. |

### ReturnValue

Yeni [XmlNode](../../xmlnode/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
