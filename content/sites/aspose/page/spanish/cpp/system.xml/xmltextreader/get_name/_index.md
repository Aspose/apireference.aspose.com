---
title: "Método System::Xml::XmlTextReader::get_Name"
linktitle: "get_Name"
second_title: "Aspose.Page para C++"
description: "Método System::Xml::XmlTextReader::get_Name. Devuelve el nombre calificado del nodo actual en C++."
type: docs
weight: 1900
url: /es/cpp/system.xml/xmltextreader/get_name/
---
## XmlTextReader::get_Name method


Devuelve el nombre calificado del nodo actual.

```cpp
String System::Xml::XmlTextReader::get_Name() override
```


### ReturnValue

El nombre calificado del nodo actual. Por ejemplo, **Name** es **bk:book** para el elemento **<bk:book>**.
## Observaciones



El nombre devuelto depende del valor de [XmlTextReader::get_NodeType](../get_nodetype/) del nodo. Los siguientes tipos de nodo devuelven los valores listados. Todos los demás tipos de nodo devuelven una cadena vacía. |||
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
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
