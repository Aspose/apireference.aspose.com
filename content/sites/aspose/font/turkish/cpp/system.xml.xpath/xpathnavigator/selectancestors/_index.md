---
title: "System::Xml::XPath::XPathNavigator::SelectAncestors yöntemi"
linktitle: "SelectAncestors"
second_title: "Aspose.Font için C++"
description: "System::Xml::XPath::XPathNavigator::SelectAncestors yöntemi. Belirtilen yerel ada ve ad alanı URI'sine sahip geçerli düğümün tüm üst düğümlerini C++ içinde seçer."
type: docs
weight: 7200
url: /tr/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


Geçerli düğümün belirtilen yerel ada ve ad alanı URI'sine sahip tüm üst düğümlerini seçer.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Üst düğümlerin yerel adı. |
| namespaceURI | Dize | Üst düğümlerin ad alanı URI'si. |
| matchSelf | bool | Seçime bağlam düğümünü dahil etmek için **true**; aksi takdirde **false**. |

### ReturnValue

Seçilen düğümleri içeren bir [XPathNodeIterator](../../xpathnodeiterator/). Döndürülen düğümler ters belge sırasındadır.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


Geçerli düğümün eşleşen bir [XPathNodeType](../../xpathnodetype/) olan tüm üst düğümlerini seçer.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| type | XPathNodeType | Üst düğümlerin [XPathNodeType](../../xpathnodetype/) değeri. |
| matchSelf | bool | Seçime bağlam düğümünü dahil etmek için **true**; aksi takdirde **false**. |

### ReturnValue

Seçilen düğümleri içeren bir [XPathNodeIterator](../../xpathnodeiterator/). Döndürülen düğümler ters belge sırasındadır.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
