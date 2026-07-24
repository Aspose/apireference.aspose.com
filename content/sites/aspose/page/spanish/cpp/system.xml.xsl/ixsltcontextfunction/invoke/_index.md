---
title: "System::Xml::Xsl::IXsltContextFunction::Invoke method"
linktitle: "Invoke"
second_title: "Aspose.Page para C++"
description: "System::Xml::Xsl::IXsltContextFunction::Invoke method. Proporciona el método para invocar la función con los argumentos dados en el contexto especificado en C++."
type: docs
weight: 500
url: /es/cpp/system.xml.xsl/ixsltcontextfunction/invoke/
---
## IXsltContextFunction::Invoke method


Proporciona el método para invocar la función con los argumentos dados en el contexto dado.

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextFunction::Invoke(SharedPtr<XsltContext> xsltContext, ArrayPtr<SharedPtr<Object>> args, SharedPtr<System::Xml::XPath::XPathNavigator> docContext)=0
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | El contexto XSLT para la llamada a la función. |
| args | ArrayPtr\<SharedPtr\<Object\>\> | Los argumentos de la llamada a la función. Cada argumento es un elemento en la matriz. |
| docContext | SharedPtr\<System::Xml::XPath::XPathNavigator\> | El nodo de contexto para la llamada a la función. |

### ReturnValue

Un [Object](../../../system/object/) que representa el valor de retorno de la función.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [IXsltContextFunction](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
