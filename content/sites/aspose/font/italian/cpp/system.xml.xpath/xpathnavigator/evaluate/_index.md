---
title: "System::Xml::XPath::XPathNavigator::Evaluate metodo"
linktitle: "Evaluate"
second_title: "Aspose.Font per C++"
description: "System::Xml::XPath::XPathNavigator::Evaluate metodo. Valuta l'XPathExpression e restituisce il risultato tipizzato in C++."
type: docs
weight: 1200
url: /it/cpp/system.xml.xpath/xpathnavigator/evaluate/
---
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>) method


Valuta il [XPathExpression](../../xpathexpression/) e restituisce il risultato tipizzato.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Un [XPathExpression](../../xpathexpression/) che può essere valutato. |

### ReturnValue

Il risultato dell'espressione ([Boolean](../../../system/boolean/), numero, stringa o set di nodi). Questo corrisponde rispettivamente agli oggetti [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), o [XPathNodeIterator](../../xpathnodeiterator/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) method


Utilizza il contesto fornito per valutare il [XPathExpression](../../xpathexpression/) e restituisce il risultato tipizzato.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr, SharedPtr<XPathNodeIterator> context)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Un [XPathExpression](../../xpathexpression/) che può essere valutato. |
| context | SharedPtr\<XPathNodeIterator\> | Un [XPathNodeIterator](../../xpathnodeiterator/) che punta al set di nodi selezionato su cui eseguire la valutazione. |

### ReturnValue

Il risultato dell'espressione ([Boolean](../../../system/boolean/), numero, stringa o set di nodi). Questo corrisponde rispettivamente agli oggetti [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), o [XPathNodeIterator](../../xpathnodeiterator/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Evaluate(String) method


Valuta l'espressione [XPath](../../) specificata e restituisce il risultato tipizzato.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xpath | String | Una stringa che rappresenta un'espressione [XPath](../../) che può essere valutata. |

### ReturnValue

Il risultato dell'espressione ([Boolean](../../../system/boolean/), numero, stringa o set di nodi). Questo corrisponde rispettivamente agli oggetti [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), o [XPathNodeIterator](../../xpathnodeiterator/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Evaluate(String, SharedPtr\<IXmlNamespaceResolver\>) method


Valuta l'espressione [XPath](../../) specificata e restituisce il risultato tipizzato, utilizzando l'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) specificato per risolvere i prefissi di namespace nell'espressione [XPath](../../).

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xpath | String | Una stringa che rappresenta un'espressione [XPath](../../) che può essere valutata. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | L'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) utilizzato per risolvere i prefissi di namespace nell'espressione [XPath](../../). |

### ReturnValue

Il risultato dell'espressione ([Boolean](../../../system/boolean/), numero, stringa o set di nodi). Questo corrisponde rispettivamente agli oggetti [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), o [XPathNodeIterator](../../xpathnodeiterator/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
