---
title: "System::Xml::XmlWriter::WriteNode yöntemi"
linktitle: "WriteNode"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlWriter::WriteNode yöntemi. Türetilmiş bir sınıfta geçersiz kılındığında, okuyucudan yazıcıya her şeyi kopyalar ve okuyucuyu C++'ta bir sonraki kardeşin başlangıcına taşır."
type: docs
weight: 2600
url: /tr/cpp/system.xml/xmlwriter/writenode/
---
## XmlWriter::WriteNode(SharedPtr\<XmlReader\>, bool) method


Türetilmiş bir sınıfta geçersiz kılındığında, okuyucudan yazıcıya her şeyi kopyalar ve okuyucuyu bir sonraki kardeşin başına taşır.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XmlReader> reader, bool defattr)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | Okunacak [XmlReader](../../xmlreader/). |
| defattr | bool | Varsayılan öznitelikleri [XmlReader](../../xmlreader/) üzerinden kopyalamak için **true**; aksi takdirde **false**. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteNode(SharedPtr\<XPath::XPathNavigator\>, bool) method


XPathNavigator nesnesinden yazıcıya her şeyi kopyalar. XPathNavigator'un konumu değişmeden kalır.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XPath::XPathNavigator> navigator, bool defattr)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| gezinici | SharedPtr\<XPath::XPathNavigator\> | Kopyalanacak XPathNavigator. |
| defattr | bool | **true** varsayılan öznitelikleri kopyalamak için; aksi takdirde **false**. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
