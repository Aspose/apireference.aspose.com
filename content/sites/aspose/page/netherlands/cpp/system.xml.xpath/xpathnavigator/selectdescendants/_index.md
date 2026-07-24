---
title: "System::Xml::XPath::XPathNavigator::SelectDescendants method"
linktitle: "SelectDescendants"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants method. Selecteert alle afstammings-nodes van de huidige node met de lokale naam en namespace-URI gespecificeerd in C++."
type: docs
weight: 7400
url: /nl/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


Selecteert alle afstammingsknooppunten van het huidige knooppunt met de opgegeven lokale naam en namespace‑URI.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De lokale naam van de afstammings-nodes. |
| namespaceURI | String | De namespace-URI van de afstammings-nodes. |
| matchSelf | bool | **true** om het context-node op te nemen in de selectie; anders **false**. |

### ReturnValue

Een [XPathNodeIterator](../../xpathnodeiterator/) die de geselecteerde knooppunten bevat.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


Selecteert alle afstammings-nodes van de huidige node die een overeenkomend [XPathNodeType](../../xpathnodetype/) hebben.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| type | XPathNodeType | De [XPathNodeType](../../xpathnodetype/) van de afstammings-nodes. |
| matchSelf | bool | **true** om het context-node op te nemen in de selectie; anders **false**. |

### ReturnValue

Een [XPathNodeIterator](../../xpathnodeiterator/) die de geselecteerde knooppunten bevat.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
