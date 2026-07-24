---
title: "System::Xml::XmlNode::SelectSingleNode methode"
linktitle: "SelectSingleNode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNode::SelectSingleNode methode. Selecteert de eerste XmlNode die overeenkomt met de XPath‑expressie in C++."
type: docs
weight: 3900
url: /nl/cpp/system.xml/xmlnode/selectsinglenode/
---
## XmlNode::SelectSingleNode(const String\&) method


Selecteert de eerste [XmlNode](../) die overeenkomt met de [XPath](../../../system.xml.xpath/) expressie.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xpath | const String\& | De [XPath](../../../system.xml.xpath/) expressie. |

### ReturnValue

De eerste [XmlNode](../) die overeenkomt met de [XPath](../../../system.xml.xpath/) query of **nullptr** als er geen overeenkomende node wordt gevonden.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectSingleNode(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


Selecteert de eerste [XmlNode](../) die overeenkomt met de [XPath](../../../system.xml.xpath/) expressie. Alle gevonden prefixes in de [XPath](../../../system.xml.xpath/) expressie worden opgelost met behulp van de meegeleverde [XmlNamespaceManager](../../xmlnamespacemanager/).

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xpath | const String\& | De [XPath](../../../system.xml.xpath/) expressie. |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | Een [XmlNamespaceManager](../../xmlnamespacemanager/) om te gebruiken voor het oplossen van namespaces voor prefixes in de [XPath](../../../system.xml.xpath/) expressie. |

### ReturnValue

De eerste [XmlNode](../) die overeenkomt met de [XPath](../../../system.xml.xpath/) query of **nullptr** als er geen overeenkomende node wordt gevonden.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
