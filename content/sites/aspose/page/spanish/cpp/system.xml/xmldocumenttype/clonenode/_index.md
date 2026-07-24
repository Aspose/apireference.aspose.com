---
title: "System::Xml::XmlDocumentType::CloneNode método"
linktitle: "CloneNode"
second_title: "Aspose.Page para C++"
description: "System::Xml::XmlDocumentType::CloneNode método. Crea un duplicado de este nodo en C++."
type: docs
weight: 100
url: /es/cpp/system.xml/xmldocumenttype/clonenode/
---
## XmlDocumentType::CloneNode method


Crea un duplicado de este nodo.

```cpp
SharedPtr<XmlNode> System::Xml::XmlDocumentType::CloneNode(bool deep) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| profundo | bool | **true** para clonar recursivamente el subárbol bajo el nodo especificado; **false** para clonar solo el nodo en sí. Para nodos de tipo documento, el nodo clonado siempre incluye el subárbol, sin importar la configuración del parámetro. |

### ReturnValue

El nodo clonado.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocumentType](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
