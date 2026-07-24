---
title: "System::Xml::XPath::XPathNavigator::SelectChildren method"
linktitle: "SelectChildren"
second_title: "Aspose.Page için C++"
description: "System::Xml::XPath::XPathNavigator::SelectChildren yöntemi. C++'ta belirtilen yerel ad ve ad alanı URI'sine sahip mevcut düğümün tüm alt düğümlerini seçer."
type: docs
weight: 7300
url: /tr/cpp/system.xml.xpath/xpathnavigator/selectchildren/
---
## XPathNavigator::SelectChildren(String, String) method


Selects all the child nodes of the current node that have the local name and namespace URI specified.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(String name, String namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Alt düğümlerin yerel adı. |
| namespaceURI | String | Alt düğümlerin ad alanı URI'si. |

### ReturnValue

Seçilen düğümleri içeren bir [XPathNodeIterator](../../xpathnodeiterator/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectChildren(XPathNodeType) method


Mevcut düğümün eşleşen [XPathNodeType](../../xpathnodetype/) değerine sahip tüm alt düğümlerini seçer.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(XPathNodeType type)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| type | XPathNodeType | Alt düğümlerin [XPathNodeType](../../xpathnodetype/) değeri. |

### ReturnValue

Seçilen düğümleri içeren bir [XPathNodeIterator](../../xpathnodeiterator/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
