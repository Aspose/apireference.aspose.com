---
title: "System::Xml::XPath::XPathNavigator::MoveToFollowing metodu"
linktitle: "MoveToFollowing"
second_title: "Aspose.Font için C++"
description: "System::Xml::XPath::XPathNavigator::MoveToFollowing metodu. XPathNavigator'ı belge sırasına göre belirtilen yerel ad ve ad alanı URI'sine sahip öğeye C++'de taşır."
type: docs
weight: 5700
url: /tr/cpp/system.xml.xpath/xpathnavigator/movetofollowing/
---
## XPathNavigator::MoveToFollowing(String, String) method


[XPathNavigator](../) öğesini belge sırasına göre belirtilen yerel ad ve ad alanı URI'sine sahip öğeye taşır.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| localName | Dize | Öğenin yerel adı. |
| namespaceURI | Dize | Öğenin ad alanı URI'si. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToFollowing(String, String, SharedPtr\<XPathNavigator\>) method


[XPathNavigator](../) öğesini belge sırasına göre belirtilen yerel ad ve ad alanı URI'sine sahip öğeye, belirtilen sınıra kadar taşır.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI, SharedPtr<XPathNavigator> end)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| localName | Dize | Öğenin yerel adı. |
| namespaceURI | Dize | Öğenin ad alanı URI'si. |
| end | SharedPtr\<XPathNavigator\> | Öğenin sınırında konumlandırılmış ve mevcut [XPathNavigator](../) nesnesinin bir sonraki öğeyi ararken geçmeyeceği [XPathNavigator](../) nesnesi. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType) method


[XPathNavigator](../) öğesini belge sırasına göre belirtilen [XPathNodeType](../../xpathnodetype/) öğesinin sonraki öğesine taşır.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| type | XPathNodeType | Öğenin [XPathNodeType](../../xpathnodetype/) değeri. [XPathNodeType](../../xpathnodetype/) [XPathNodeType::Attribute](../../xpathnodetype/) veya [XPathNodeType::Namespace](../../xpathnodetype/) olamaz. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Ayrıca Bakınız

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType, SharedPtr\<XPathNavigator\>) method


[XPathNavigator](../) öğesini belge sırasına göre belirtilen [XPathNodeType](../../xpathnodetype/) öğesinin sonraki öğesine, belirtilen sınıra kadar taşır.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type, SharedPtr<XPathNavigator> end)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| type | XPathNodeType | Öğenin [XPathNodeType](../../xpathnodetype/) değeri. [XPathNodeType](../../xpathnodetype/) [XPathNodeType::Attribute](../../xpathnodetype/) veya [XPathNodeType::Namespace](../../xpathnodetype/) olamaz. |
| end | SharedPtr\<XPathNavigator\> | Öğenin sınırında konumlandırılmış ve mevcut [XPathNavigator](../) nesnesinin bir sonraki öğeyi ararken geçmeyeceği [XPathNavigator](../) nesnesi. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Ayrıca Bakınız

* Enum [XPathNodeType](../../xpathnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
