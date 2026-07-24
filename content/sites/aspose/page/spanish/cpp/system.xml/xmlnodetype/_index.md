---
title: "System::Xml::XmlNodeType enum"
linktitle: "XmlNodeType"
second_title: "Aspose.Page para C++"
description: "System::Xml::XmlNodeType enum. Especifica el tipo de nodo en C++."
type: docs
weight: 6200
url: /es/cpp/system.xml/xmlnodetype/
---
## XmlNodeType enum


Especifica el tipo de nodo.

```cpp
enum class XmlNodeType
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| None | 0 | Esto es devuelto por el [XmlReader](../xmlreader/) si no se ha llamado al método **Read**. |
| Element | 1 | Un elemento (por ejemplo, **<item>**). |
| Attribute | 2 | Un atributo (por ejemplo, **id='123'**). |
| Text | 3 | El contenido de texto de un nodo. Un nodo [XmlNodeType::Text](./) no puede tener nodos hijos. Puede aparecer como nodo hijo de los nodos [XmlNodeType::Attribute](./), [XmlNodeType::DocumentFragment](./), [XmlNodeType::Element](./) y [XmlNodeType::EntityReference](./). |
| CDATA | 4 | Una sección CDATA (por ejemplo, **my escaped text**). |
| EntityReference | 5 | Una referencia a una entidad (por ejemplo, **&num;**). |
| Entity | 6 | Una declaración de entidad (por ejemplo, **<!ENTITY...>**). |
| ProcessingInstruction | 7 | Una instrucción de procesamiento (por ejemplo, **<?pi test?>**). |
| Comment | 8 | Un comentario (por ejemplo, ****). |
| Document | 9 | Un objeto documento que, como raíz del árbol del documento, proporciona acceso a todo el documento XML. |
| DocumentType | 10 | The document type declaration, indicated by the following tag (for example, **<!DOCTYPE...>**). |
| DocumentFragment | 11 | Un fragmento de documento. |
| Notación | 12 | Una notación en la declaración del tipo de documento (por ejemplo, **<!NOTATION...>**). |
| Espacio en blanco | 13 | Espacio en blanco entre marcas. |
| SignificantWhitespace | 14 | Espacio en blanco entre marcas en un modelo de contenido mixto o espacio en blanco dentro del alcance **xml:space=\"preserve\"**. |
| EndElement | 15 | Una etiqueta de elemento final (por ejemplo, ****). |
| EndEntity | 16 | Devuelto cuando [XmlReader](../xmlreader/) llega al final del reemplazo de entidad como resultado de una llamada a [XmlReader::ResolveEntity](../xmlreader/resolveentity/). |
| XmlDeclaration | 17 | La declaración XML (por ejemplo, **<?xml version='1.0'?>**). El nodo [XmlNodeType::XmlDeclaration](./) debe ser el primer nodo del documento. No puede tener hijos. Es un hijo del nodo [XmlNodeType::Document](./). Puede tener atributos que proporcionen información de versión y codificación. |

## Ver también

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
