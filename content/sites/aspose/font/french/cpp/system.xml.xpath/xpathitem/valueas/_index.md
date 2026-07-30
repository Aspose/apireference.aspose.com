---
title: "Méthode System::Xml::XPath::XPathItem::ValueAs"
linktitle: "ValueAs"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XPath::XPathItem::ValueAs. Retourne la valeur de l'élément comme le type spécifié en C++."
type: docs
weight: 1100
url: /fr/cpp/system.xml.xpath/xpathitem/valueas/
---
## XPathItem::ValueAs(const TypeInfo\&) method


Renvoie la valeur de l'élément sous le type spécifié.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| returnType | const TypeInfo\& | Le type auquel retourner la valeur de l'élément. |

### ReturnValue

La valeur de l'élément au type demandé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathItem::ValueAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Lorsqu'elle est remplacée dans une classe dérivée, renvoie la valeur de l'élément au type spécifié en utilisant l'objet [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) indiqué pour résoudre les préfixes d'espace de noms.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| returnType | const TypeInfo\& | Le type auquel renvoyer la valeur de l'élément. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | L'objet [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) utilisé pour résoudre les préfixes d'espace de noms. |

### ReturnValue

La valeur de l'élément au type demandé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
