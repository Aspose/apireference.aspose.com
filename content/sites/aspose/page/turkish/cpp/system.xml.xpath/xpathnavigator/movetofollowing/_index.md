---
title: "System::Xml::XPath::XPathNavigator::MoveToFollowing yöntemi"
linktitle: "MoveToFollowing"
second_title: "Aspose.Page için C++"
description: "System::Xml::XPath::XPathNavigator::MoveToFollowing yöntemi. C++'da belge sırasına göre belirtilen yerel ada ve ad alanı URI'sine sahip öğeye XPathNavigator'ı taşır."
type: docs
weight: 5700
url: /tr/cpp/system.xml.xpath/xpathnavigator/movetofollowing/
---
## XPathNavigator::MoveToFollowing(String, String) method


[XPathNavigator](../) öğesini belge sırasına göre belirtilen yerel ada ve ad alanı URI'sine sahip öğeye taşır.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| localName | String | Öğenin yerel adı. |
| namespaceURI | String | Öğenin ad alanı URI'si. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(String, String, SharedPtr\<XPathNavigator\>) method


[XPathNavigator](../) öğesini belge sırasına göre belirtilen yerel ada ve ad alanı URI'sine sahip öğeye, belirtilen sınıra kadar taşır.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI, SharedPtr<XPathNavigator> end)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| localName | String | Öğenin yerel adı. |
| namespaceURI | String | Öğenin ad alanı URI'si. |
| end | SharedPtr\<XPathNavigator\> | Sonraki öğeyi ararken mevcut [XPathNavigator](../) nesnesinin geçmeyeceği öğe sınırında konumlandırılmış [XPathNavigator](../) nesnesi. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType) method


[XPathNavigator](../) öğesini belge sırasına göre belirtilen [XPathNodeType](../../xpathnodetype/) öğesinin sonraki öğesine taşır.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| type | XPathNodeType | Elemanın [XPathNodeType](../../xpathnodetype/). [XPathNodeType](../../xpathnodetype/) **olamaz** [XPathNodeType::Attribute](../../xpathnodetype/) **ve** [XPathNodeType::Namespace](../../xpathnodetype/). |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Ayrıca Bakınız

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType, SharedPtr\<XPathNavigator\>) method


[XPathNavigator](../) belirtilen [XPathNodeType](../../xpathnodetype/) öğesinin sonraki öğesine, belirtilen sınıra, belge sırasına göre taşır.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type, SharedPtr<XPathNavigator> end)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| type | XPathNodeType | Elemanın [XPathNodeType](../../xpathnodetype/). [XPathNodeType](../../xpathnodetype/) **olamaz** [XPathNodeType::Attribute](../../xpathnodetype/) **ve** [XPathNodeType::Namespace](../../xpathnodetype/). |
| end | SharedPtr\<XPathNavigator\> | Sonraki öğeyi ararken mevcut [XPathNavigator](../) nesnesinin geçmeyeceği öğe sınırında konumlandırılmış [XPathNavigator](../) nesnesi. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Ayrıca Bakınız

* Enum [XPathNodeType](../../xpathnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
