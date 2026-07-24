---
title: "System::Xml::XPath::XPathNavigator::SelectAncestors methode"
linktitle: "SelectAncestors"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathNavigator::SelectAncestors methode. Selecteert alle voorouder‑knopen van de huidige knoop die de opgegeven lokale naam en namespace‑URI hebben in C++."
type: docs
weight: 7200
url: /nl/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


Selecteert alle voorouderknooppunten van het huidige knooppunt met de opgegeven lokale naam en namespace‑URI.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De lokale naam van de voorouder‑knopen. |
| namespaceURI | String | De namespace‑URI van de voorouder‑knopen. |
| matchSelf | bool | Om de contextknoop in de selectie op te nemen, **true**; anders **false**. |

### ReturnValue

Een [XPathNodeIterator](../../xpathnodeiterator/) die de geselecteerde knooppunten bevat. De geretourneerde knooppunten staan in omgekeerde documentvolgorde.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


Selecteert alle voorouderknooppunten van het huidige knooppunt die een overeenkomend [XPathNodeType](../../xpathnodetype/) hebben.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| type | XPathNodeType | Het [XPathNodeType](../../xpathnodetype/) van de voorouderknooppunten. |
| matchSelf | bool | Om de contextknoop in de selectie op te nemen, **true**; anders **false**. |

### ReturnValue

Een [XPathNodeIterator](../../xpathnodeiterator/) die de geselecteerde knooppunten bevat. De geretourneerde knooppunten staan in omgekeerde documentvolgorde.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
