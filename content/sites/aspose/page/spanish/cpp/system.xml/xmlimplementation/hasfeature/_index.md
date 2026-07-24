---
title: "System::Xml::XmlImplementation::HasFeature método"
linktitle: "HasFeature"
second_title: "Aspose.Page para C++"
description: "System::Xml::XmlImplementation::HasFeature método. Prueba si la implementación del Modelo de Objeto de Documento (DOM) implementa una característica específica en C++."
type: docs
weight: 300
url: /es/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


Prueba si la implementación del Documento [Object](../../../system/object/) Modelo (DOM) implementa una característica específica.

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| strFeature | const String\& | El nombre del paquete de la característica a probar. Este nombre no distingue entre mayúsculas y minúsculas. |
| strVersion | const String\& | Este es el número de versión del nombre del paquete para probar. Si la versión no se especifica (**nullptr**), admitir cualquier versión de la característica hace que el método devuelva **true**. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Observaciones



La tabla siguiente muestra las combinaciones que hacen que **HasFeature** devuelva **true**. |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## Ver también

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
