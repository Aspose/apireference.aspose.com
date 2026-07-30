---
title: "System::Xml::XPath::XPathNavigator::Select Methode"
linktitle: "Auswählen"
second_title: "Aspose.Font für C++"
description: "System::Xml::XPath::XPathNavigator::Select Methode. Wählt eine Knotengruppe aus, indem der angegebene XPathExpression in C++ verwendet wird."
type: docs
weight: 7100
url: /de/cpp/system.xml.xpath/xpathnavigator/select/
---
## XPathNavigator::Select(SharedPtr\<XPathExpression\>) method


Wählt eine Knotengruppe aus, indem der angegebene [XPathExpression](../../xpathexpression/) verwendet wird.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(SharedPtr<XPathExpression> expr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Ein [XPathExpression](../../xpathexpression/) Objekt, das die kompilierte [XPath](../../) Abfrage enthält. |

### ReturnValue

Ein [XPathNodeIterator](../../xpathnodeiterator/), der auf die ausgewählte Knotengruppe zeigt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Select(String) method


Wählt eine Knotengruppe aus, unter Verwendung des angegebenen [XPath](../../)-Ausdrucks.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xpath | String | Ein [String](../../../system/string/) der einen [XPath](../../) Ausdruck darstellt. |

### ReturnValue

Ein [XPathNodeIterator](../../xpathnodeiterator/), der auf die ausgewählte Knotengruppe zeigt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Select(String, SharedPtr\<IXmlNamespaceResolver\>) method


Wählt eine Knotengruppe aus, indem der angegebene [XPath](../../)-Ausdruck zusammen mit dem angegebenen [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-Objekt verwendet wird, um Namespace‑Präfixe aufzulösen.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xpath | String | Ein [String](../../../system/string/) der einen [XPath](../../) Ausdruck darstellt. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | Das [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-Objekt, das zum Auflösen von Namensraumpräfixen verwendet wird. |

### ReturnValue

Ein [XPathNodeIterator](../../xpathnodeiterator/), der auf die ausgewählte Knotengruppe zeigt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
