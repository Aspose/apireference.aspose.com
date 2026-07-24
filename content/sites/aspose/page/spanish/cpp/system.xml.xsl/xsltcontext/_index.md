---
title: "System::Xml::Xsl::XsltContext class"
linktitle: "XsltContext"
second_title: "Aspose.Page para C++"
description: "System::Xml::Xsl::XsltContext class. Encapsula el contexto de ejecución actual del procesador Extensible Stylesheet Language for Transformations (XSLT) que permite al Lenguaje de Ruta XML (XPath) resolver funciones, parámetros y espacios de nombres dentro de expresiones XPath en C++."
type: docs
weight: 500
url: /es/cpp/system.xml.xsl/xsltcontext/
---
## XsltContext class


Encapsula el contexto de ejecución actual del procesador Extensible Stylesheet Language for Transformations (XSLT) que permite al Lenguaje de Ruta XML ([XPath](../../system.xml.xpath/)) resolver funciones, parámetros y espacios de nombres dentro de expresiones [XPath](../../system.xml.xpath/).

```cpp
class XsltContext : public System::Xml::XmlNamespaceManager
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [CompareDocument](./comparedocument/)(String, String) | Cuando se sobrescribe en una clase derivada, compara los Identificadores Uniformes de Recursos (URI) base de dos documentos según el orden en que los documentos fueron cargados por el procesador XSLT (es decir, la clase [XslTransform](../xsltransform/)). |
| virtual [get_Whitespace](./get_whitespace/)() | Cuando se sobrescribe en una clase derivada, obtiene un valor que indica si se deben incluir nodos de espacio en blanco en la salida. |
| virtual [PreserveWhitespace](./preservewhitespace/)(SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Cuando se sobrescribe en una clase derivada, evalúa si se deben preservar los nodos de espacio en blanco o eliminarlos para el contexto dado. |
| virtual [ResolveFunction](./resolvefunction/)(String, String, ArrayPtr\<System::Xml::XPath::XPathResultType\>) | Cuando se sobrescribe en una clase derivada, resuelve una referencia a una función y devuelve un [IXsltContextFunction](../ixsltcontextfunction/) que representa la función. El [IXsltContextFunction](../ixsltcontextfunction/) se utiliza en tiempo de ejecución para obtener el valor de retorno de la función. |
| virtual [ResolveVariable](./resolvevariable/)(String, String) | Cuando se sobrescribe en una clase derivada, resuelve una referencia a una variable y devuelve un [IXsltContextVariable](../ixsltcontextvariable/) que representa la variable. |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Ver también

* Class [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
