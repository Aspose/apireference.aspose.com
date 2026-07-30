---
title: "System::Xml::XmlNamespaceManager::AddNamespace-Methode"
linktitle: "AddNamespace"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNamespaceManager::AddNamespace-Methode. Fügt den angegebenen Namensraum zur Sammlung in C++ hinzu."
type: docs
weight: 200
url: /de/cpp/system.xml/xmlnamespacemanager/addnamespace/
---
## XmlNamespaceManager::AddNamespace method


Fügt den angegebenen Namensraum zur Sammlung hinzu.

```cpp
virtual void System::Xml::XmlNamespaceManager::AddNamespace(String prefix, String uri)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| prefix | String | Das Präfix, das dem hinzuzufügenden Namensraum zugeordnet werden soll. Verwenden Sie [String::Empty](../../../system/string/empty/), um einen Standard‑Namensraum hinzuzufügen. Wenn der [XmlNamespaceManager](../) zum Auflösen von Namensräumen in einem XML Path Language ([XPath](../../../system.xml.xpath/))-Ausdruck verwendet wird, muss ein Präfix angegeben werden. Enthält ein [XPath](../../../system.xml.xpath/)-Ausdruck kein Präfix, wird angenommen, dass der Uniform Resource Identifier (URI) des Namensraums der leere Namensraum ist. Weitere Informationen zu [XPath](../../../system.xml.xpath/)-Ausdrücken und dem [XmlNamespaceManager](../) finden Sie in den Methoden XmlNode::SelectNodes(String) und XPathExpression::SetContext(SharedPtr<XmlNamespaceManager>) Methoden. |
| uri | String | Der hinzuzufügende Namensraum. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
