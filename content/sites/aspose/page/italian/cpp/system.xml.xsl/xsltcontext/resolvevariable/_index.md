---
title: "System::Xml::Xsl::XsltContext::ResolveVariable metodo"
linktitle: "ResolveVariable"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::Xsl::XsltContext::ResolveVariable. Quando sovrascritto in una classe derivata, risolve un riferimento a una variabile e restituisce un IXsltContextVariable che rappresenta la variabile in C++."
type: docs
weight: 500
url: /it/cpp/system.xml.xsl/xsltcontext/resolvevariable/
---
## XsltContext::ResolveVariable method


Quando sovrascritto in una classe derivata, risolve un riferimento a una variabile e restituisce un [IXsltContextVariable](../../ixsltcontextvariable/) che rappresenta la variabile.

```cpp
virtual SharedPtr<IXsltContextVariable> System::Xml::Xsl::XsltContext::ResolveVariable(String prefix, String name)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| prefix | String | Il prefisso della variabile così come appare nell'espressione [XPath](../../../system.xml.xpath/). |
| name | String | Il nome della variabile. |

### ReturnValue

Un [IXsltContextVariable](../../ixsltcontextvariable/) che rappresenta la variabile a runtime.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextVariable](../../ixsltcontextvariable/)
* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
