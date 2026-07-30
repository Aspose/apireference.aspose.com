---
title: "System::Xml::Xsl::XsltContext::ResolveVariable méthode"
linktitle: "ResolveVariable"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Xsl::XsltContext::ResolveVariable méthode. Lorsqu'elle est substituée dans une classe dérivée, elle résout une référence de variable et renvoie un IXsltContextVariable représentant la variable en C++."
type: docs
weight: 500
url: /fr/cpp/system.xml.xsl/xsltcontext/resolvevariable/
---
## XsltContext::ResolveVariable method


Lorsqu'elle est substituée dans une classe dérivée, elle résout une référence de variable et renvoie un [IXsltContextVariable](../../ixsltcontextvariable/) représentant la variable.

```cpp
virtual SharedPtr<IXsltContextVariable> System::Xml::Xsl::XsltContext::ResolveVariable(String prefix, String name)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| prefix | String | Le préfixe de la variable tel qu'il apparaît dans l'expression [XPath](../../../system.xml.xpath/). |
| nom | String | Le nom de la variable. |

### ReturnValue

Un [IXsltContextVariable](../../ixsltcontextvariable/) représentant la variable à l'exécution.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextVariable](../../ixsltcontextvariable/)
* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
