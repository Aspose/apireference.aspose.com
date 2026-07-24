---
title: "Clase Aspose::Page::Plugins::IOperationResult"
linktitle: "IOperationResult"
second_title: "Aspose.Page para C++"
description: "Clase Aspose::Page::Plugins::IOperationResult. Interfaz general de resultado de operación que define los métodos comunes que el resultado de operación de un plugin concreto debe implementar en C++."
type: docs
weight: 700
url: /es/cpp/aspose.page.plugins/ioperationresult/
---
## IOperationResult class


Interfaz general de resultado de operación que define métodos comunes que el resultado de operación del complemento concreto debe implementar.

```cpp
class IOperationResult : public virtual System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [get_Data](./get_data/)() | Obtiene datos sin procesar. |
| virtual [get_IsByteArray](./get_isbytearray/)() | Indica si el resultado es una matriz de bytes. |
| virtual [get_IsFile](./get_isfile/)() | Indica si el resultado es una ruta a un archivo de salida. |
| virtual [get_IsStream](./get_isstream/)() | Indica si el resultado es un stream de salida. |
| virtual [get_IsString](./get_isstring/)() | Indica si el resultado es una cadena de texto. |
| virtual [ToFile](./tofile/)() | Intenta convertir el resultado al archivo. |
| virtual [ToStream](./tostream/)() | Intenta convertir el resultado al objeto de flujo. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
