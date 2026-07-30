---
title: "System::Xml::Xsl::XsltContext::ResolveVariable method"
linktitle: "ResolveVariable"
second_title: "Aspose.Font per C++"
description: "System::Xml::Xsl::XsltContext::ResolveVariable method. Quando sovrascritto in una classe derivata, risolve un riferimento a una variabile e restituisce un IXsltContextVariable che rappresenta la variabile in C++."
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
| nome | Stringa | Il nome della variabile. |

### ReturnValue

Un [IXsltContextVariable](../../ixsltcontextvariable/) che rappresenta la variabile in fase di esecuzione.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextVariable](../../ixsltcontextvariable/)
* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
