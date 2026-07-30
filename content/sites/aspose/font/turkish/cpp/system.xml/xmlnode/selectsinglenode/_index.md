---
title: "System::Xml::XmlNode::SelectSingleNode yöntemi"
linktitle: "SelectSingleNode"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNode::SelectSingleNode yöntemi. C++'ta XPath ifadesiyle eşleşen ilk XmlNode'u seçer."
type: docs
weight: 3900
url: /tr/cpp/system.xml/xmlnode/selectsinglenode/
---
## XmlNode::SelectSingleNode(const String\&) method


İlk [XmlNode](../) öğesini, [XPath](../../../system.xml.xpath/) ifadesiyle eşleşen, seçer.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xpath | const String\& | [XPath](../../../system.xml.xpath/) ifadesi. |

### ReturnValue

Eşleşen bir düğüm bulunamazsa **nullptr** dönen, [XPath](../../../system.xml.xpath/) sorgusuyla eşleşen ilk [XmlNode](../) öğesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNode::SelectSingleNode(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


İfade ile eşleşen ilk [XmlNode](../) öğesini seçer. [XPath](../../../system.xml.xpath/) ifadesinde bulunan tüm önekler, sağlanan [XmlNamespaceManager](../../xmlnamespacemanager/) kullanılarak çözülür.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xpath | const String\& | [XPath](../../../system.xml.xpath/) ifadesi. |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | [XPath](../../../system.xml.xpath/) ifadesindeki önekler için ad alanlarını çözmekte kullanılacak bir [XmlNamespaceManager](../../xmlnamespacemanager/) nesnesi. |

### ReturnValue

Eşleşen bir düğüm bulunamazsa **nullptr** dönen, [XPath](../../../system.xml.xpath/) sorgusuyla eşleşen ilk [XmlNode](../) öğesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
