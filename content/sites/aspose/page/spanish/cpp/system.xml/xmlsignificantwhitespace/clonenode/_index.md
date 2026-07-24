---
title: "Método System::Xml::XmlSignificantWhitespace::CloneNode"
linktitle: "CloneNode"
second_title: "Aspose.Page para C++"
description: "Método System::Xml::XmlSignificantWhitespace::CloneNode. Crea un duplicado de este nodo en C++."
type: docs
weight: 100
url: /es/cpp/system.xml/xmlsignificantwhitespace/clonenode/
---
## XmlSignificantWhitespace::CloneNode method


Crea un duplicado de este nodo.

```cpp
SharedPtr<XmlNode> System::Xml::XmlSignificantWhitespace::CloneNode(bool deep) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| profundo | bool | **true** para clonar recursivamente el subárbol bajo el nodo especificado; **false** para clonar solo el nodo en sí. Para nodos de espacio en blanco significativo, el nodo clonado siempre incluye el valor de datos, sin importar la configuración del parámetro. |

### ReturnValue

El nodo clonado.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlSignificantWhitespace](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
