---
title: "System::Xml::XmlNode::SelectNodes Methode"
linktitle: "SelectNodes"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNode::SelectNodes Methode. Wählt eine Liste von Knoten aus, die dem XPath-Ausdruck in C++ entsprechen."
type: docs
weight: 3800
url: /de/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


Wählt eine Liste von Knoten aus, die dem [XPath](../../../system.xml.xpath/) Ausdruck entsprechen.

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xpath | const String\& | Der [XPath](../../../system.xml.xpath/) Ausdruck. |

### ReturnValue

Eine [XmlNodeList](../../xmlnodelist/) die eine Sammlung von Knoten enthält, die der [XPath](../../../system.xml.xpath/) Abfrage entsprechen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


Wählt eine Liste von Knoten aus, die dem [XPath](../../../system.xml.xpath/) Ausdruck entsprechen. Alle im [XPath](../../../system.xml.xpath/) Ausdruck gefundenen Präfixe werden mithilfe des bereitgestellten [XmlNamespaceManager](../../xmlnamespacemanager/) aufgelöst.

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xpath | const String\& | Der [XPath](../../../system.xml.xpath/) Ausdruck. |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | Ein [XmlNamespaceManager](../../xmlnamespacemanager/) zum Auflösen von Namespaces für Präfixe im [XPath](../../../system.xml.xpath/) Ausdruck. |

### ReturnValue

Eine [XmlNodeList](../../xmlnodelist/) die eine Sammlung von Knoten enthält, die der [XPath](../../../system.xml.xpath/) Abfrage entsprechen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
