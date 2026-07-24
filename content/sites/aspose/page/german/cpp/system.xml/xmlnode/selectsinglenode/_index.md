---
title: "System::Xml::XmlNode::SelectSingleNode Methode"
linktitle: "SelectSingleNode"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlNode::SelectSingleNode Methode. Wählt das erste XmlNode aus, das dem XPath-Ausdruck in C++ entspricht."
type: docs
weight: 3900
url: /de/cpp/system.xml/xmlnode/selectsinglenode/
---
## XmlNode::SelectSingleNode(const String\&) method


Wählt das erste [XmlNode](../) aus, das dem [XPath](../../../system.xml.xpath/) Ausdruck entspricht.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xpath | const String\& | Der [XPath](../../../system.xml.xpath/) Ausdruck. |

### ReturnValue

Das erste [XmlNode](../), das der [XPath](../../../system.xml.xpath/) Abfrage entspricht, oder **nullptr**, wenn kein passender Knoten gefunden wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectSingleNode(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


Wählt das erste [XmlNode](../) aus, das dem [XPath](../../../system.xml.xpath/) Ausdruck entspricht. Alle im [XPath](../../../system.xml.xpath/) Ausdruck gefundenen Präfixe werden mithilfe des bereitgestellten [XmlNamespaceManager](../../xmlnamespacemanager/) aufgelöst.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xpath | const String\& | Der [XPath](../../../system.xml.xpath/) Ausdruck. |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | Ein [XmlNamespaceManager](../../xmlnamespacemanager/) zum Auflösen von Namespaces für Präfixe im [XPath](../../../system.xml.xpath/) Ausdruck. |

### ReturnValue

Das erste [XmlNode](../), das der [XPath](../../../system.xml.xpath/) Abfrage entspricht, oder **nullptr**, wenn kein passender Knoten gefunden wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
