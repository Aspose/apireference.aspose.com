---
title: "System::Xml::XmlNamespaceManager::AddNamespace método"
linktitle: "AddNamespace"
second_title: "Aspose.Page para C++"
description: "System::Xml::XmlNamespaceManager::AddNamespace método. Añade el espacio de nombres proporcionado a la colección en C++."
type: docs
weight: 200
url: /es/cpp/system.xml/xmlnamespacemanager/addnamespace/
---
## XmlNamespaceManager::AddNamespace method


Agrega el espacio de nombres proporcionado a la colección.

```cpp
virtual void System::Xml::XmlNamespaceManager::AddNamespace(String prefix, String uri)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| prefix | String | El prefijo para asociar con el espacio de nombres que se está añadiendo. Use [String::Empty](../../../system/string/empty/) para añadir un espacio de nombres predeterminado. Si el [XmlNamespaceManager](../) se usará para resolver espacios de nombres en una expresión del Lenguaje de Ruta XML ([XPath](../../../system.xml.xpath/)), se debe especificar un prefijo. Si una expresión [XPath](../../../system.xml.xpath/) no incluye un prefijo, se asume que el Identificador Uniforme de Recursos (URI) del espacio de nombres es el espacio de nombres vacío. Para obtener más información sobre las expresiones [XPath](../../../system.xml.xpath/) y el [XmlNamespaceManager](../), consulte los métodos XmlNode::SelectNodes(String) y XPathExpression::SetContext(SharedPtr<XmlNamespaceManager>). |
| uri | String | El espacio de nombres para agregar. |

## Ver también

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
