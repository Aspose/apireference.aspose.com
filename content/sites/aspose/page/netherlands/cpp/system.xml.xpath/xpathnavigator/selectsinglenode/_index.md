---
title: "System::Xml::XPath::XPathNavigator::SelectSingleNode-methode"
linktitle: "SelectSingleNode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathNavigator::SelectSingleNode-methode. Selecteert een enkel knooppunt in de XPathNavigator met behulp van het opgegeven XPathExpression-object in C++."
type: docs
weight: 7500
url: /nl/cpp/system.xml.xpath/xpathnavigator/selectsinglenode/
---
## XPathNavigator::SelectSingleNode(SharedPtr\<XPathExpression\>) method


Selecteert een enkel knooppunt in de [XPathNavigator](../) met behulp van het opgegeven [XPathExpression](../../xpathexpression/)-object.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(SharedPtr<XPathExpression> expression)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| expression | SharedPtr\<XPathExpression\> | Een [XPathExpression](../../xpathexpression/)-object dat de gecompileerde [XPath](../../)-query bevat. |

### ReturnValue

Een [XPathNavigator](../)-object dat de eerste overeenkomende node voor de opgegeven [XPath](../../)-query bevat; anders **nullptr** als er geen query-resultaten zijn.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectSingleNode(String) method


Selecteert een enkel knooppunt in de [XPathNavigator](../) met behulp van de opgegeven [XPath](../../)-query.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xpath | String | Een [String](../../../system/string/) die een [XPath](../../)-expressie vertegenwoordigt. |

### ReturnValue

Een [XPathNavigator](../)-object dat de eerste overeenkomende node voor de opgegeven [XPath](../../)-query bevat; anders **nullptr** als er geen query-resultaten zijn.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectSingleNode(String, SharedPtr\<IXmlNamespaceResolver\>) method


Selecteert een enkel knooppunt in het [XPathNavigator](../)-object met behulp van de opgegeven [XPath](../../)-query en het opgegeven [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-object om namespace-prefixen op te lossen.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xpath | String | Een [String](../../../system/string/) die een [XPath](../../)-expressie vertegenwoordigt. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | Het [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-object dat wordt gebruikt om namespace-prefixen in de [XPath](../../)-query op te lossen. |

### ReturnValue

Een [XPathNavigator](../)-object dat de eerste overeenkomende node voor de opgegeven [XPath](../../)-query bevat; anders **nullptr** als er geen query-resultaten zijn.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
