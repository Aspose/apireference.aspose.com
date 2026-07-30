---
title: "System::Xml::XPath::XPathNavigator::SelectSingleNode méthode"
linktitle: "SélectionnerNœudUnique"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XPath::XPathNavigator::SelectSingleNode méthode. Sélectionne un seul nœud dans le XPathNavigator en utilisant l'objet XPathExpression spécifié en C++."
type: docs
weight: 7500
url: /fr/cpp/system.xml.xpath/xpathnavigator/selectsinglenode/
---
## XPathNavigator::SelectSingleNode(SharedPtr\<XPathExpression\>) method


Sélectionne un seul nœud dans le [XPathNavigator](../) en utilisant l'objet [XPathExpression](../../xpathexpression/) spécifié.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(SharedPtr<XPathExpression> expression)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| expression | SharedPtr\<XPathExpression\> | Un objet [XPathExpression](../../xpathexpression/) contenant la requête [XPath](../../) compilée. |

### ReturnValue

Un objet [XPathNavigator](../) qui contient le premier nœud correspondant à la requête [XPath](../../) spécifiée ; sinon **nullptr** s'il n'y a aucun résultat de requête.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectSingleNode(String) method


Sélectionne un seul nœud dans le [XPathNavigator](../) en utilisant la requête [XPath](../../) spécifiée.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| xpath | String | Une [String](../../../system/string/) représentant une expression [XPath](../../). |

### ReturnValue

Un objet [XPathNavigator](../) qui contient le premier nœud correspondant à la requête [XPath](../../) spécifiée ; sinon, **nullptr** s’il n’y a aucun résultat de requête.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectSingleNode(String, SharedPtr\<IXmlNamespaceResolver\>) method


Sélectionne un nœud unique dans l’objet [XPathNavigator](../) en utilisant la requête [XPath](../../) spécifiée avec l’objet [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) indiqué pour résoudre les préfixes d’espace de noms.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| xpath | String | Une [String](../../../system/string/) représentant une expression [XPath](../../). |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | L’objet [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) utilisé pour résoudre les préfixes d’espace de noms dans la requête [XPath](../../). |

### ReturnValue

Un objet [XPathNavigator](../) qui contient le premier nœud correspondant à la requête [XPath](../../) spécifiée ; sinon **nullptr** s'il n'y a aucun résultat de requête.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
