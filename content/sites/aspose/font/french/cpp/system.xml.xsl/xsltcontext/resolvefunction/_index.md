---
title: "System::Xml::Xsl::XsltContext::ResolveFunction méthode"
linktitle: "ResolveFunction"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Xsl::XsltContext::ResolveFunction méthode. Lorsqu'elle est remplacée dans une classe dérivée, résout une référence de fonction et renvoie un IXsltContextFunction représentant la fonction. Le IXsltContextFunction est utilisé au moment de l'exécution pour obtenir la valeur de retour de la fonction en C++."
type: docs
weight: 400
url: /fr/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


Lorsqu'elle est remplacée dans une classe dérivée, résout une référence de fonction et renvoie un [IXsltContextFunction](../../ixsltcontextfunction/) représentant la fonction. Le [IXsltContextFunction](../../ixsltcontextfunction/) est utilisé au moment de l'exécution pour obtenir la valeur de retour de la fonction.

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| prefix | String | Le préfixe de la fonction tel qu'il apparaît dans l'expression [XPath](../../../system.xml.xpath/). |
| nom | String | Le nom de la fonction. |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | Un tableau de types d'arguments pour la fonction en cours de résolution. Cela vous permet de choisir entre des méthodes portant le même nom (par exemple, des méthodes surchargées). |

### ReturnValue

Un [IXsltContextFunction](../../ixsltcontextfunction/) représentant la fonction.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
