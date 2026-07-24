---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "Aspose.Page para C++"
description: "System::Xml::ConformanceLevel enum. Especifica la cantidad de comprobación de entrada o salida que realizan los objetos XmlReader y XmlWriter en C++."
type: docs
weight: 4600
url: /es/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


Especifica la cantidad de comprobación de entrada o salida que realizan los objetos [XmlReader](../xmlreader/) y [XmlWriter](../xmlwriter/).

```cpp
enum class ConformanceLevel
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| Auto | 0 | El objeto [XmlReader](../xmlreader/) o [XmlWriter](../xmlwriter/) detecta automáticamente si debe realizarse una comprobación a nivel de documento o a nivel de fragmento, y lleva a cabo la comprobación correspondiente. Si estás envolviendo otro objeto [XmlReader](../xmlreader/) o [XmlWriter](../xmlwriter/), el objeto externo no realiza ninguna comprobación de conformidad adicional. La comprobación de conformidad queda a cargo del objeto subyacente. |
| Fragment | 1 | Los datos XML son un [fragmento XML bien formado](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities), según la definición de la W3C. Este nivel de conformidad representa un documento XML que puede no tener un elemento raíz pero que, de otro modo, está bien formado. Este nivel de comprobación garantiza que la secuencia leída o escrita pueda ser consumida por cualquier procesador como una [entidad externa analizada XML 1.0](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities). |
| Document | 2 | Los datos XML cumplen con las reglas de un [documento XML 1.0 bien formado](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed), según la definición de la W3C. Este nivel de comprobación garantiza que la secuencia leída o escrita pueda ser consumida por cualquier procesador como un [documento XML 1.0](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed). |

## Ver también

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
