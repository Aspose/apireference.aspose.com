---
title: "System::Xml::XPath::XPathNavigator::SelectChildren Methode"
linktitle: "SelectChildren"
second_title: "Aspose.Font für C++"
description: "System::Xml::XPath::XPathNavigator::SelectChildren Methode. Wählt alle Kindknoten des aktuellen Knotens aus, die den in C++ angegebenen lokalen Namen und Namespace-URI besitzen."
type: docs
weight: 7300
url: /de/cpp/system.xml.xpath/xpathnavigator/selectchildren/
---
## XPathNavigator::SelectChildren(String, String) method


Wählt alle untergeordneten Knoten des aktuellen Knotens aus, die den angegebenen lokalen Namen und die angegebene Namespace-URI besitzen.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(String name, String namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Der lokale Name der Kindknoten. |
| namespaceURI | String | Der Namespace-URI der Kindknoten. |

### ReturnValue

Ein [XPathNodeIterator](../../xpathnodeiterator/) der die ausgewählten Knoten enthält.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectChildren(XPathNodeType) method


Wählt alle Kindknoten des aktuellen Knotens aus, die den passenden [XPathNodeType](../../xpathnodetype/) haben.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(XPathNodeType type)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| type | XPathNodeType | Der [XPathNodeType](../../xpathnodetype/) der Kindknoten. |

### ReturnValue

Ein [XPathNodeIterator](../../xpathnodeiterator/) der die ausgewählten Knoten enthält.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
