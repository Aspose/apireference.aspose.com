---
title: "System::Xml::XPath::XPathNavigator::SelectAncestors metodu"
linktitle: "SelectAncestors"
second_title: "Aspose.Page için C++"
description: "System::Xml::XPath::XPathNavigator::SelectAncestors metodu. C++'da geçerli düğümün belirtilen yerel adı ve ad alanı URI'sine sahip tüm atas düğümlerini seçer."
type: docs
weight: 7200
url: /tr/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


Selects all the ancestor nodes of the current node that have the specified local name and namespace URI.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Atas düğümlerin yerel adı. |
| namespaceURI | String | Atas düğümlerin ad alanı URI'si. |
| matchSelf | bool | Seçimde bağlam düğümünü dahil etmek için **true**; aksi takdirde **false**. |

### ReturnValue

Seçilen düğümleri içeren bir [XPathNodeIterator](../../xpathnodeiterator/). Döndürülen düğümler ters belge sırasındadır.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


Geçerli düğümün eşleşen bir [XPathNodeType](../../xpathnodetype/) olan tüm üst düğümlerini seçer.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| type | XPathNodeType | Üst düğümlerin [XPathNodeType](../../xpathnodetype/) değeri. |
| matchSelf | bool | Seçimde bağlam düğümünü dahil etmek için **true**; aksi takdirde **false**. |

### ReturnValue

Seçilen düğümleri içeren bir [XPathNodeIterator](../../xpathnodeiterator/). Döndürülen düğümler ters belge sırasındadır.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
