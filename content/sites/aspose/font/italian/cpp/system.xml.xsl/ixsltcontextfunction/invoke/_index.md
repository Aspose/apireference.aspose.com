---
title: "System::Xml::Xsl::IXsltContextFunction::Invoke metodo"
linktitle: "Invoke"
second_title: "Aspose.Font per C++"
description: "System::Xml::Xsl::IXsltContextFunction::Invoke metodo. Fornisce il metodo per invocare la funzione con gli argomenti forniti nel contesto specificato in C++."
type: docs
weight: 500
url: /it/cpp/system.xml.xsl/ixsltcontextfunction/invoke/
---
## IXsltContextFunction::Invoke method


Fornisce il metodo per invocare la funzione con gli argomenti forniti nel contesto specificato.

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextFunction::Invoke(SharedPtr<XsltContext> xsltContext, ArrayPtr<SharedPtr<Object>> args, SharedPtr<System::Xml::XPath::XPathNavigator> docContext)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | Il contesto XSLT per la chiamata della funzione. |
| argomenti | ArrayPtr\<SharedPtr\<Object\>\> | Gli argomenti della chiamata della funzione. Ogni argomento è un elemento nell'array. |
| docContext | SharedPtr\<System::Xml::XPath::XPathNavigator\> | Il nodo di contesto per la chiamata della funzione. |

### ReturnValue

Un [Object](../../../system/object/) che rappresenta il valore di ritorno della funzione.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [IXsltContextFunction](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
