---
title: "System::Xml::XPath::XPathNavigator::Select methode"
linktitle: "Select"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathNavigator::Select methode. Selecteert een knooppuntset met behulp van de opgegeven XPathExpression in C++."
type: docs
weight: 7100
url: /nl/cpp/system.xml.xpath/xpathnavigator/select/
---
## XPathNavigator::Select(SharedPtr\<XPathExpression\>) method


Selecteert een knooppuntset met behulp van de opgegeven [XPathExpression](../../xpathexpression/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(SharedPtr<XPathExpression> expr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Een [XPathExpression](../../xpathexpression/)-object dat de gecompileerde [XPath](../../)-query bevat. |

### ReturnValue

Een [XPathNodeIterator](../../xpathnodeiterator/) die naar de geselecteerde knooppuntset wijst.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String) method


Selecteert een knooppuntset, met behulp van de opgegeven [XPath](../../) expressie.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xpath | String | Een [String](../../../system/string/) die een [XPath](../../)-expressie vertegenwoordigt. |

### ReturnValue

Een [XPathNodeIterator](../../xpathnodeiterator/) die naar de geselecteerde knooppuntset wijst.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String, SharedPtr\<IXmlNamespaceResolver\>) method


Selecteert een knooppuntset met de opgegeven [XPath](../../) expressie en het [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) object dat is opgegeven om naamruimte‑prefixen op te lossen.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xpath | String | Een [String](../../../system/string/) die een [XPath](../../)-expressie vertegenwoordigt. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | Het [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-object dat wordt gebruikt om namespace‑prefixen op te lossen. |

### ReturnValue

Een [XPathNodeIterator](../../xpathnodeiterator/) die naar de geselecteerde knooppuntset wijst.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
