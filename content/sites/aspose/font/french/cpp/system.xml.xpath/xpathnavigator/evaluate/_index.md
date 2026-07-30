---
title: "Méthode System::Xml::XPath::XPathNavigator::Evaluate"
linktitle: "Évaluer"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XPath::XPathNavigator::Evaluate. Évalue le XPathExpression et renvoie le résultat typé en C++."
type: docs
weight: 1200
url: /fr/cpp/system.xml.xpath/xpathnavigator/evaluate/
---
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>) method


Évalue le [XPathExpression](../../xpathexpression/) et renvoie le résultat typé.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Un [XPathExpression](../../xpathexpression/) qui peut être évalué. |

### ReturnValue

Le résultat de l'expression ([Boolean](../../../system/boolean/), nombre, chaîne ou ensemble de nœuds). Cela correspond respectivement aux objets [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), ou [XPathNodeIterator](../../xpathnodeiterator/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) method


Utilise le contexte fourni pour évaluer le [XPathExpression](../../xpathexpression/), et renvoie le résultat typé.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr, SharedPtr<XPathNodeIterator> context)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Un [XPathExpression](../../xpathexpression/) qui peut être évalué. |
| context | SharedPtr\<XPathNodeIterator\> | Un [XPathNodeIterator](../../xpathnodeiterator/) qui pointe vers l'ensemble de nœuds sélectionné sur lequel l'évaluation doit être effectuée. |

### ReturnValue

Le résultat de l'expression ([Boolean](../../../system/boolean/), nombre, chaîne ou ensemble de nœuds). Cela correspond respectivement aux objets [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), ou [XPathNodeIterator](../../xpathnodeiterator/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Evaluate(String) method


Évalue l'expression [XPath](../../) spécifiée et renvoie le résultat typé.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| xpath | String | Une chaîne représentant une expression [XPath](../../) qui peut être évaluée. |

### ReturnValue

Le résultat de l'expression ([Boolean](../../../system/boolean/), nombre, chaîne ou ensemble de nœuds). Cela correspond respectivement aux objets [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), ou [XPathNodeIterator](../../xpathnodeiterator/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Evaluate(String, SharedPtr\<IXmlNamespaceResolver\>) method


Évalue l'expression [XPath](../../) spécifiée et renvoie le résultat typé, en utilisant l'objet [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) indiqué pour résoudre les préfixes d'espace de noms dans l'expression [XPath](../../).

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| xpath | String | Une chaîne représentant une expression [XPath](../../) qui peut être évaluée. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | L'objet [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) utilisé pour résoudre les préfixes d'espace de noms dans l'expression [XPath](../../). |

### ReturnValue

Le résultat de l'expression ([Boolean](../../../system/boolean/), nombre, chaîne ou ensemble de nœuds). Cela correspond respectivement aux objets [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), ou [XPathNodeIterator](../../xpathnodeiterator/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
