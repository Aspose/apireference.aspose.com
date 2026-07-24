---
title: "System::Xml::XmlNode::SelectNodes method"
linktitle: "SelectNodes"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNode::SelectNodes method. Selecteert een lijst met knooppunten die overeenkomen met de XPath-expressie in C++."
type: docs
weight: 3800
url: /nl/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


Selecteert een lijst met knooppunten die overeenkomen met de [XPath](../../../system.xml.xpath/) expressie.

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xpath | const String\& | De [XPath](../../../system.xml.xpath/) expressie. |

### ReturnValue

Een [XmlNodeList](../../xmlnodelist/) die een verzameling knooppunten bevat die overeenkomen met de [XPath](../../../system.xml.xpath/) query.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


Selecteert een lijst met knooppunten die overeenkomen met de [XPath](../../../system.xml.xpath/) expressie. Alle prefixen die in de [XPath](../../../system.xml.xpath/) expressie worden gevonden, worden opgelost met behulp van de meegeleverde [XmlNamespaceManager](../../xmlnamespacemanager/).

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xpath | const String\& | De [XPath](../../../system.xml.xpath/) expressie. |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | Een [XmlNamespaceManager](../../xmlnamespacemanager/) om te gebruiken voor het oplossen van namespaces voor prefixes in de [XPath](../../../system.xml.xpath/) expressie. |

### ReturnValue

Een [XmlNodeList](../../xmlnodelist/) die een verzameling knooppunten bevat die overeenkomen met de [XPath](../../../system.xml.xpath/) query.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
