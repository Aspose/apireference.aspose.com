---
title: "System::Xml::XPath::XPathNavigator::Select méthode"
linktitle: "Sélectionner"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XPath::XPathNavigator::Select méthode. Sélectionne un ensemble de nœuds en utilisant le XPathExpression spécifié en C++."
type: docs
weight: 7100
url: /fr/cpp/system.xml.xpath/xpathnavigator/select/
---
## XPathNavigator::Select(SharedPtr\<XPathExpression\>) method


Sélectionne un ensemble de nœuds en utilisant le [XPathExpression](../../xpathexpression/) spécifié.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(SharedPtr<XPathExpression> expr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Un objet [XPathExpression](../../xpathexpression/) contenant la requête [XPath](../../) compilée. |

### ReturnValue

Un [XPathNodeIterator](../../xpathnodeiterator/) qui pointe vers l'ensemble de nœuds sélectionné.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Select(String) method


Sélectionne un ensemble de nœuds, en utilisant l'expression [XPath](../../) spécifiée.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| xpath | String | Une [String](../../../system/string/) représentant une expression [XPath](../../). |

### ReturnValue

Un [XPathNodeIterator](../../xpathnodeiterator/) pointant vers l'ensemble de nœuds sélectionné.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Select(String, SharedPtr\<IXmlNamespaceResolver\>) method


Sélectionne un ensemble de nœuds en utilisant l'expression [XPath](../../) spécifiée avec l'objet [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) spécifié pour résoudre les préfixes d'espace de noms.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| xpath | String | Une [String](../../../system/string/) représentant une expression [XPath](../../). |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | L'objet [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) utilisé pour résoudre les préfixes d'espace de noms. |

### ReturnValue

Un [XPathNodeIterator](../../xpathnodeiterator/) qui pointe vers l'ensemble de nœuds sélectionné.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
