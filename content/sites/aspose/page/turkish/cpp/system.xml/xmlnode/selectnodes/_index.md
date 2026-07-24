---
title: "System::Xml::XmlNode::SelectNodes method"
linktitle: "SelectNodes"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNode::SelectNodes yöntemi. C++'da XPath ifadesine uyan düğüm listesini seçer."
type: docs
weight: 3800
url: /tr/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


[XPath](../../../system.xml.xpath/) ifadesine uyan bir düğüm listesini seçer.

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| xpath | const String\& | Bu [XPath](../../../system.xml.xpath/) ifadesi. |

### ReturnValue

XPath sorgusuna uyan düğüm koleksiyonunu içeren bir [XmlNodeList](../../xmlnodelist/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


[XPath](../../../system.xml.xpath/) ifadesine uyan bir düğüm listesini seçer. [XPath](../../../system.xml.xpath/) ifadesinde bulunan tüm önekler, sağlanan [XmlNamespaceManager](../../xmlnamespacemanager/) kullanılarak çözülür.

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| xpath | const String\& | Bu [XPath](../../../system.xml.xpath/) ifadesi. |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | [XPath](../../../system.xml.xpath/) ifadesindeki önekler için ad alanlarını çözmekte kullanılacak bir [XmlNamespaceManager](../../xmlnamespacemanager/). |

### ReturnValue

XPath sorgusuna uyan düğüm koleksiyonunu içeren bir [XmlNodeList](../../xmlnodelist/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
