---
title: "System::Xml::XmlDocument::CreateNode metodu"
linktitle: "CreateNode"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlDocument::CreateNode metodu. Belirtilen düğüm türü, XmlDocument::get_Name ve XmlNode::get_NamespaceURI ile bir XmlNode oluşturur C++'da."
type: docs
weight: 1100
url: /tr/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


Belirtilen düğüm türü, [XmlDocument::get_Name](../get_name/) ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) ile bir [XmlNode](../../xmlnode/) oluşturur.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| nodeTypeString | const String\& | Yeni düğümün [XmlNodeType](../../xmlnodetype/) için [String](../../../system/string/) sürümü. Bu parametre aşağıdaki tabloda listelenen değerlerden biri olmalıdır. |
| name | const String\& | Yeni düğümün nitelikli adı. Ad bir iki nokta üstüste içeriyorsa, [XmlNode::get_Prefix](../../xmlnode/get_prefix/) ve [XmlDocument::get_LocalName](../get_localname/) bileşenlerine ayrılır. |
| namespaceURI | const String\& | Yeni düğümün ad alanı URI'si. |

### ReturnValue

Yeni [XmlNode](../../xmlnode/).
## Açıklamalar



**nodeTypeString** parametresi büyük/küçük harfe duyarlıdır ve aşağıdaki tablodaki değerlerden biri olmalıdır: |||
|-|-|
| nodeTypeString | XmlNodeType |
| attribute | Attribute |
| cdatasection | CDATA |
| comment | Yorum |
| belge | Belge |
| belgeparçası | BelgeParçası |
| belge türü | BelgeTürü |
| öğe | Element |
| varlık referansı | EntityReference |
| işlem talimatı | İşlemeTalimatı |
| önemli boşluk | ÖnemliBoşluk |
| metin | Text |
| boşluk | Boşluk |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


Belirtilen [XmlNodeType](../../xmlnodetype/), [XmlDocument::get_Name](../get_name/) ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) ile bir [XmlNode](../../xmlnode/) oluşturur.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| type | XmlNodeType | Yeni düğümün [XmlNodeType](../../xmlnodetype/). |
| name | const String\& | Yeni düğümün nitelikli adı. Ad bir iki nokta üstüste içeriyorsa, [XmlNode::get_Prefix](../../xmlnode/get_prefix/) ve [XmlDocument::get_LocalName](../get_localname/) bileşenlerine ayrılır. |
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
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


Belirtilen [XmlNodeType](../../xmlnodetype/), [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_Name](../get_name/) ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) ile bir [XmlNode](../../xmlnode/) oluşturur.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| Parametre | Tür | Açıklama |
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
* Library [Aspose.Font for C++](../../../)
