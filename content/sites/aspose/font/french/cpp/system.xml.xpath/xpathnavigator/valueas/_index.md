---
title: "System::Xml::XPath::XPathNavigator::ValueAs méthode"
linktitle: "ValueAs"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XPath::XPathNavigator::ValueAs méthode. Retourne la valeur du nœud actuel comme le Type spécifié, en utilisant l'objet IXmlNamespaceResolver spécifié pour résoudre les préfixes d'espace de noms en C++."
type: docs
weight: 8100
url: /fr/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


Retourne la valeur du nœud actuel comme le Type spécifié, en utilisant l'objet [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) spécifié pour résoudre les préfixes d'espace de noms.

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| returnType | const TypeInfo\& | Le Type pour retourner la valeur du nœud actuel. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | L'objet [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) utilisé pour résoudre les préfixes d'espace de noms. |

### ReturnValue

La valeur du nœud actuel comme le Type demandé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
