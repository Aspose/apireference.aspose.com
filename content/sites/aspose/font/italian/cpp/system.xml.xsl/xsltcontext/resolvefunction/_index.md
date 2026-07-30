---
title: "System::Xml::Xsl::XsltContext::ResolveFunction metodo"
linktitle: "ResolveFunction"
second_title: "Aspose.Font per C++"
description: "System::Xml::Xsl::XsltContext::ResolveFunction metodo. Quando sovrascritto in una classe derivata, risolve un riferimento a una funzione e restituisce un IXsltContextFunction che rappresenta la funzione. L'IXsltContextFunction viene utilizzato in fase di esecuzione per ottenere il valore di ritorno della funzione in C++."
type: docs
weight: 400
url: /it/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


Quando sovrascritto in una classe derivata, risolve un riferimento a una funzione e restituisce un [IXsltContextFunction](../../ixsltcontextfunction/) che rappresenta la funzione. Il [IXsltContextFunction](../../ixsltcontextfunction/) viene utilizzato in fase di esecuzione per ottenere il valore di ritorno della funzione.

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| prefix | String | Il prefisso della funzione così come appare nell'espressione [XPath](../../../system.xml.xpath/). |
| nome | Stringa | Il nome della funzione. |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | Un array di tipi di argomento per la funzione in fase di risoluzione. Questo consente di selezionare tra metodi con lo stesso nome (ad esempio, metodi sovraccaricati). |

### ReturnValue

Un [IXsltContextFunction](../../ixsltcontextfunction/) che rappresenta la funzione.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
