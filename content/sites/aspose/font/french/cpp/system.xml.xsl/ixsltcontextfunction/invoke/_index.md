---
title: "Méthode System::Xml::Xsl::IXsltContextFunction::Invoke"
linktitle: "Invoke"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::Xsl::IXsltContextFunction::Invoke. Fournit la méthode pour invoquer la fonction avec les arguments donnés dans le contexte fourni en C++."
type: docs
weight: 500
url: /fr/cpp/system.xml.xsl/ixsltcontextfunction/invoke/
---
## IXsltContextFunction::Invoke method


Fournit la méthode permettant d'invoquer la fonction avec les arguments fournis dans le contexte donné.

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextFunction::Invoke(SharedPtr<XsltContext> xsltContext, ArrayPtr<SharedPtr<Object>> args, SharedPtr<System::Xml::XPath::XPathNavigator> docContext)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | Le contexte XSLT pour l'appel de la fonction. |
| args | ArrayPtr\<SharedPtr\<Object\>\> | Les arguments de l'appel de fonction. Chaque argument est un élément du tableau. |
| docContext | SharedPtr\<System::Xml::XPath::XPathNavigator\> | Le nœud de contexte pour l'appel de la fonction. |

### ReturnValue

Un [Object](../../../system/object/) représentant la valeur de retour de la fonction.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [IXsltContextFunction](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
