---
title: "System::Xml::XmlNamespaceManager::AddNamespace method"
linktitle: "AddNamespace"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNamespaceManager::AddNamespace method. Voegt de opgegeven namespace toe aan de collectie in C++."
type: docs
weight: 200
url: /nl/cpp/system.xml/xmlnamespacemanager/addnamespace/
---
## XmlNamespaceManager::AddNamespace method


Voegt de opgegeven namespace toe aan de collectie.

```cpp
virtual void System::Xml::XmlNamespaceManager::AddNamespace(String prefix, String uri)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| prefix | String | De prefix die moet worden geassocieerd met de toe te voegen namespace. Gebruik [String::Empty](../../../system/string/empty/) om een standaardnamespace toe te voegen. Als de [XmlNamespaceManager](../) wordt gebruikt voor het oplossen van namespaces in een XML Path Language‑expressie ([XPath](../../../system.xml.xpath/)), moet er een prefix worden opgegeven. Als een [XPath](../../../system.xml.xpath/)‑expressie geen prefix bevat, wordt aangenomen dat de Uniform Resource Identifier (URI) van de namespace de lege namespace is. Voor meer informatie over [XPath](../../../system.xml.xpath/)‑expressies en de [XmlNamespaceManager](../), raadpleeg de methoden XmlNode::SelectNodes(String) en XPathExpression::SetContext(SharedPtr<XmlNamespaceManager>) methoden. |
| uri | String | De namespace om toe te voegen. |

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
