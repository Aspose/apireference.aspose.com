---
title: "System::Xml::XmlNode::SelectNodes yöntemi"
linktitle: "SelectNodes"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNode::SelectNodes yöntemi. C++'ta XPath ifadesiyle eşleşen düğüm listesini seçer."
type: docs
weight: 3800
url: /tr/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


[XPath](../../../system.xml.xpath/) ifadesiyle eşleşen bir düğüm listesini seçer.

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xpath | const String\& | [XPath](../../../system.xml.xpath/) ifadesi. |

### ReturnValue

Bir [XmlNodeList](../../xmlnodelist/), [XPath](../../../system.xml.xpath/) sorgusuyla eşleşen düğüm koleksiyonunu içerir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


XPath ifadesiyle eşleşen bir düğüm listesini seçer. [XPath](../../../system.xml.xpath/) ifadesinde bulunan tüm önekler, sağlanan [XmlNamespaceManager](../../xmlnamespacemanager/) kullanılarak çözülür.

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xpath | const String\& | [XPath](../../../system.xml.xpath/) ifadesi. |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | [XPath](../../../system.xml.xpath/) ifadesindeki önekler için ad alanlarını çözmekte kullanılacak bir [XmlNamespaceManager](../../xmlnamespacemanager/) nesnesi. |

### ReturnValue

Bir [XmlNodeList](../../xmlnodelist/), [XPath](../../../system.xml.xpath/) sorgusuyla eşleşen düğüm koleksiyonunu içerir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
