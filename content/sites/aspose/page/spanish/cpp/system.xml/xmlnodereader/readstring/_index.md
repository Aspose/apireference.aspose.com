---
title: "System::Xml::XmlNodeReader::ReadString método"
linktitle: "ReadString"
second_title: "Aspose.Page para C++"
description: "System::Xml::XmlNodeReader::ReadString método. Lee el contenido del elemento o nodo de texto como una cadena en C++."
type: docs
weight: 3600
url: /es/cpp/system.xml/xmlnodereader/readstring/
---
## XmlNodeReader::ReadString method


Lee el contenido de un elemento o nodo de texto como una cadena.

```cpp
String System::Xml::XmlNodeReader::ReadString() override
```


### ReturnValue

El contenido del elemento o nodo tipo texto (Esto puede incluir CDATA, [Text](../../../system.text/) nodos, etc.). Puede ser una cadena vacía si el lector está posicionado en algo que no sea un elemento o nodo de texto, o si no hay más contenido de texto que devolver en el contexto actual. Nota: El nodo de texto puede ser un elemento o un nodo de texto de atributo.

## Ver también

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
