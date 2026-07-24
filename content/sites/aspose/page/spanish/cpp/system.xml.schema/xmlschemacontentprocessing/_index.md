---
title: "System::Xml::Schema::XmlSchemaContentProcessing enum"
linktitle: "XmlSchemaContentProcessing"
second_title: "Aspose.Page para C++"
description: "System::Xml::Schema::XmlSchemaContentProcessing enum. Proporciona información sobre el modo de validación de cualquier sustitución de elementos any y anyAttribute en C++."
type: docs
weight: 7300
url: /es/cpp/system.xml.schema/xmlschemacontentprocessing/
---
## XmlSchemaContentProcessing enum


Proporciona información sobre el modo de validación de los reemplazos de los elementos **any** y **anyAttribute**.

```cpp
enum class XmlSchemaContentProcessing
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| None | 0 | Los elementos del documento no se validan. |
| Omitir | 1 | Los elementos del documento deben consistir en XML bien formado y no son validados por el esquema. |
| Laxo | 2 | Si se encuentra el esquema asociado, los elementos del documento serán validados. De lo contrario, no se lanzarán errores. |
| Estricto | 3 | El procesador de esquemas debe encontrar un esquema asociado con el espacio de nombres indicado para validar los elementos del documento. |

## Ver también

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
