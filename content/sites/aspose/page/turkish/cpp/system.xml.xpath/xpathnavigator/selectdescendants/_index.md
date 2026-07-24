---
title: "System::Xml::XPath::XPathNavigator::SelectDescendants yöntemi"
linktitle: "SelectDescendants"
second_title: "Aspose.Page için C++"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants yöntemi. C++'ta belirtilen yerel ad ve ad alanı URI'siyle geçerli düğümün tüm alt düğümlerini seçer."
type: docs
weight: 7400
url: /tr/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


Selects all the descendant nodes of the current node with the local name and namespace URI specified.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Alt düğümlerin yerel adı. |
| namespaceURI | String | Alt düğümlerin ad alanı URI'si. |
| matchSelf | bool | **true** seçime bağlam düğümünü dahil etmek için; aksi takdirde **false**. |

### ReturnValue

Seçilen düğümleri içeren bir [XPathNodeIterator](../../xpathnodeiterator/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


Geçerli düğümün eşleşen bir [XPathNodeType](../../xpathnodetype/) olan tüm alt düğümlerini seçer.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| type | XPathNodeType | Alt düğümlerin [XPathNodeType](../../xpathnodetype/) değeri. |
| matchSelf | bool | **true** seçime bağlam düğümünü dahil etmek için; aksi takdirde **false**. |

### ReturnValue

Seçilen düğümleri içeren bir [XPathNodeIterator](../../xpathnodeiterator/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
