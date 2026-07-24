---
title: "System::Xml::XmlDateTimeSerializationMode enum"
linktitle: "XmlDateTimeSerializationMode"
second_title: "Aspose.Page para C++"
description: "System::Xml::XmlDateTimeSerializationMode enum. Especifica cómo tratar el valor de tiempo al convertir entre cadena y DateTime en C++."
type: docs
weight: 5800
url: /es/cpp/system.xml/xmldatetimeserializationmode/
---
## XmlDateTimeSerializationMode enum


Especifica cómo tratar el valor de tiempo al convertir entre cadena y [DateTime](../../system/datetime/).

```cpp
enum class XmlDateTimeSerializationMode
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| Local | 0 | Tratar como hora local. Si el objeto [DateTime](../../system/datetime/) representa una Hora Universal Coordinada (UTC), se convierte a la hora local. |
| Utc | 1 | Tratar como UTC. Si el objeto [DateTime](../../system/datetime/) representa una hora local, se convierte a UTC. |
| Unspecified | 2 | Tratar como hora local si un [DateTime](../../system/datetime/) se está convirtiendo a una cadena. Si una cadena se está convirtiendo a [DateTime](../../system/datetime/), conviértela a hora local si se especifica una zona horaria. |
| RoundtripKind | 3 | La información de zona horaria debe preservarse al convertir. |

## Ver también

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
