---
title: "System::Xml::XmlNodeReader::get_Name método"
linktitle: "get_Name"
second_title: "Aspose.Page para C++"
description: "System::Xml::XmlNodeReader::get_Name método. Devuelve el nombre calificado del nodo actual en C++."
type: docs
weight: 1400
url: /es/cpp/system.xml/xmlnodereader/get_name/
---
## XmlNodeReader::get_Name method


Devuelve el nombre calificado del nodo actual.

```cpp
String System::Xml::XmlNodeReader::get_Name() override
```


### ReturnValue

El nombre calificado del nodo actual. Por ejemplo, **Name** es **bk:book** para el elemento **<bk:book>**.
## Observaciones



El nombre devuelto depende del valor de [XmlNodeReader::get_NodeType](../get_nodetype/) del nodo. Los siguientes tipos de nodo devuelven los valores listados. Todos los demás tipos de nodo devuelven una cadena vacía. |||
|-|-|
| Tipo de nodo | Nombre |
| Attribute | El nombre del atributo. |
| DocumentType | El nombre del tipo de documento. |
| Element | El nombre de la etiqueta. |
| EntityReference | El nombre de la entidad referenciada. |
| ProcessingInstruction | El objetivo de la instrucción de procesamiento. |
| XmlDeclaration | La cadena literal xml. |

## Ver también

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
