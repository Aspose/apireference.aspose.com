---
title: "System::Xml::XPath::XPathNavigator::ValueAs méthode"
linktitle: "ValueAs"
second_title: "Aspose.Page pour C++"
description: "System::Xml::XPath::XPathNavigator::ValueAs méthode. Renvoie la valeur du nœud actuel en tant que Type spécifié, en utilisant l'objet IXmlNamespaceResolver spécifié pour résoudre les préfixes d'espace de noms en C++."
type: docs
weight: 8100
url: /fr/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


Renvoie la valeur du nœud actuel en tant que Type spécifié, en utilisant l'objet [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) spécifié pour résoudre les préfixes d'espace de noms.

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| returnType | const TypeInfo\& | Le Type dans lequel renvoyer la valeur du nœud actuel. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | L'objet [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) utilisé pour résoudre les préfixes d'espace de noms. |

### ReturnValue

La valeur du nœud actuel en tant que Type demandé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
