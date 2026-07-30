---
title: "System::Xml::XPath::XPathNavigator::SelectSingleNode Methode"
linktitle: "SelectSingleNode"
second_title: "Aspose.Font für C++"
description: "System::Xml::XPath::XPathNavigator::SelectSingleNode Methode. Wählt einen einzelnen Knoten im XPathNavigator aus, indem das angegebene XPathExpression-Objekt in C++ verwendet wird."
type: docs
weight: 7500
url: /de/cpp/system.xml.xpath/xpathnavigator/selectsinglenode/
---
## XPathNavigator::SelectSingleNode(SharedPtr\<XPathExpression\>) method


Wählt einen einzelnen Knoten im [XPathNavigator](../) aus, indem das angegebene [XPathExpression](../../xpathexpression/) Objekt verwendet wird.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(SharedPtr<XPathExpression> expression)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| expression | SharedPtr\<XPathExpression\> | Ein [XPathExpression](../../xpathexpression/) Objekt, das die kompilierte [XPath](../../) Abfrage enthält. |

### ReturnValue

Ein [XPathNavigator](../) Objekt, das den ersten passenden Knoten für die angegebene [XPath](../../) Abfrage enthält; andernfalls **nullptr**, wenn es keine Abfrageergebnisse gibt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectSingleNode(String) method


Wählt einen einzelnen Knoten im [XPathNavigator](../) aus, indem die angegebene [XPath](../../) Abfrage verwendet wird.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xpath | String | Ein [String](../../../system/string/) der einen [XPath](../../) Ausdruck darstellt. |

### ReturnValue

Ein [XPathNavigator](../) Objekt, das den ersten passenden Knoten für die angegebene [XPath](../../) Abfrage enthält; andernfalls **nullptr**, wenn es keine Abfrageergebnisse gibt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectSingleNode(String, SharedPtr\<IXmlNamespaceResolver\>) method


Wählt einen einzelnen Knoten im [XPathNavigator](../) Objekt aus, indem die angegebene [XPath](../../) Abfrage zusammen mit dem angegebenen [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) Objekt verwendet wird, um Namensraumpräfixe aufzulösen.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xpath | String | Ein [String](../../../system/string/) der einen [XPath](../../) Ausdruck darstellt. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | Das [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) Objekt, das verwendet wird, um Namensraumpräfixe in der [XPath](../../) Abfrage aufzulösen. |

### ReturnValue

Ein [XPathNavigator](../) Objekt, das den ersten passenden Knoten für die angegebene [XPath](../../) Abfrage enthält; andernfalls **nullptr**, wenn es keine Abfrageergebnisse gibt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
