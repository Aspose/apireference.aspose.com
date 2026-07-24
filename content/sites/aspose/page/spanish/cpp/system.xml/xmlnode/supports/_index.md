---
title: "System::Xml::XmlNode::Supports método"
linktitle: "Supports"
second_title: "Aspose.Page para C++"
description: "System::Xml::XmlNode::Supports método. Prueba si la implementación DOM implementa una característica específica en C++."
type: docs
weight: 4400
url: /es/cpp/system.xml/xmlnode/supports/
---
## XmlNode::Supports method


Prueba si la implementación del DOM implementa una característica específica.

```cpp
virtual bool System::Xml::XmlNode::Supports(String feature, String version)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| característica | String | El nombre del paquete de la característica a probar. Este nombre no distingue entre mayúsculas y minúsculas. |
| versión | String | El número de versión del nombre del paquete a probar. Si la versión no se especifica (null), admitir cualquier versión de la característica hace que el método devuelva **true**. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Observaciones



La tabla siguiente describe las combinaciones que devuelven **true**. |||
|-|-|
| Característica | Versión |
| XML | 1.0 |
| XML | 2.0 |

## Ver también

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
