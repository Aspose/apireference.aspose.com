---
title: "System::Xml::XPath::XPathNavigator::Evaluate method"
linktitle: "Evalueren"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathNavigator::Evaluate method. Evalueert de XPathExpression en retourneert het getypeerde resultaat in C++."
type: docs
weight: 1200
url: /nl/cpp/system.xml.xpath/xpathnavigator/evaluate/
---
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>) method


Evalueert de [XPathExpression](../../xpathexpression/) en retourneert het getypeerde resultaat.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Een [XPathExpression](../../xpathexpression/) die geëvalueerd kan worden. |

### ReturnValue

Het resultaat van de expressie ([Boolean](../../../system/boolean/), getal, tekenreeks of knooppuntset). Dit komt respectievelijk overeen met [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), of [XPathNodeIterator](../../xpathnodeiterator/)-objecten.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) method


Gebruikt de geleverde context om de [XPathExpression](../../xpathexpression/) te evalueren, en retourneert het getypeerde resultaat.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr, SharedPtr<XPathNodeIterator> context)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Een [XPathExpression](../../xpathexpression/) die geëvalueerd kan worden. |
| context | SharedPtr\<XPathNodeIterator\> | Een [XPathNodeIterator](../../xpathnodeiterator/) die naar de geselecteerde knooppuntset wijst waarop de evaluatie moet worden uitgevoerd. |

### ReturnValue

Het resultaat van de expressie ([Boolean](../../../system/boolean/), getal, tekenreeks of knooppuntset). Dit komt respectievelijk overeen met [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), of [XPathNodeIterator](../../xpathnodeiterator/)-objecten.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String) method


Evalueert de opgegeven [XPath](../../)-expressie en retourneert het getypte resultaat.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xpath | String | Een string die een [XPath](../../)-expressie vertegenwoordigt die geëvalueerd kan worden. |

### ReturnValue

Het resultaat van de expressie ([Boolean](../../../system/boolean/), getal, tekenreeks of knooppuntset). Dit komt respectievelijk overeen met [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), of [XPathNodeIterator](../../xpathnodeiterator/)-objecten.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String, SharedPtr\<IXmlNamespaceResolver\>) method


Evalueert de opgegeven [XPath](../../)-expressie en retourneert het getypte resultaat, met gebruik van het [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) object dat is opgegeven om namespace‑prefixen in de [XPath](../../)-expressie op te lossen.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xpath | String | Een string die een [XPath](../../)-expressie vertegenwoordigt die geëvalueerd kan worden. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | Het [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) object dat wordt gebruikt om namespace‑prefixen in de [XPath](../../)-expressie op te lossen. |

### ReturnValue

Het resultaat van de expressie ([Boolean](../../../system/boolean/), getal, tekenreeks of knooppuntset). Dit komt respectievelijk overeen met [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), of [XPathNodeIterator](../../xpathnodeiterator/)-objecten.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
