---
title: "System::Xml::XPath::XPathNavigator::SelectDescendants yöntemi"
linktitle: "SelectDescendants"
second_title: "Aspose.Font için C++"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants yöntemi. C++'da belirtilen yerel ad ve ad alanı URI'sına sahip geçerli düğümün tüm alt düğümlerini seçer."
type: docs
weight: 7400
url: /tr/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


Geçerli düğümün belirtilen yerel ada ve ad alanı URI'sine sahip tüm alt düğümlerini seçer.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Alt düğümlerin yerel adı. |
| namespaceURI | Dize | Alt düğümlerin ad alanı URI'sı. |
| matchSelf | bool | **true** seçime bağlam düğümünü dahil etmek için; aksi takdirde **false**. |

### ReturnValue

Seçilen düğümleri içeren bir [XPathNodeIterator](../../xpathnodeiterator/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


Geçerli düğümün eşleşen bir [XPathNodeType](../../xpathnodetype/) olan tüm alt düğümlerini seçer.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| Parametre | Tür | Açıklama |
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
* Library [Aspose.Font for C++](../../../)
