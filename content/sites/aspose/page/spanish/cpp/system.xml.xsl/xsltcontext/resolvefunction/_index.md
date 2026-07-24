---
title: "System::Xml::Xsl::XsltContext::ResolveFunction método"
linktitle: "ResolveFunction"
second_title: "Aspose.Page para C++"
description: "System::Xml::Xsl::XsltContext::ResolveFunction método. Cuando se sobrescribe en una clase derivada, resuelve una referencia de función y devuelve un IXsltContextFunction que representa la función. El IXsltContextFunction se utiliza en tiempo de ejecución para obtener el valor de retorno de la función en C++."
type: docs
weight: 400
url: /es/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


Cuando se sobrescribe en una clase derivada, resuelve una referencia de función y devuelve un [IXsltContextFunction](../../ixsltcontextfunction/) que representa la función. El [IXsltContextFunction](../../ixsltcontextfunction/) se utiliza en tiempo de ejecución para obtener el valor de retorno de la función.

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| prefix | String | El prefijo de la función tal como aparece en la expresión [XPath](../../../system.xml.xpath/). |
| name | String | El nombre de la función. |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | Una matriz de tipos de argumentos para la función que se está resolviendo. Esto le permite seleccionar entre métodos con el mismo nombre (por ejemplo, métodos sobrecargados). |

### ReturnValue

Un [IXsltContextFunction](../../ixsltcontextfunction/) que representa la función.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
