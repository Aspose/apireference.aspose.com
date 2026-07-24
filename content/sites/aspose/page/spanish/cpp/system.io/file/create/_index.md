---
title: "System::IO::File::Create método"
linktitle: "Crear"
second_title: "Aspose.Page para C++"
description: "System::IO::File::Create método. Crea un nuevo archivo (o sobrescribe el existente) y lo abre para acceso de lectura y escritura usando el tamaño del búfer y las opciones especificadas en C++."
type: docs
weight: 500
url: /es/cpp/system.io/file/create/
---
## File::Create method


Crea un nuevo archivo (o sobrescribe el existente) y lo abre para acceso de lectura y escritura usando el tamaño de búfer y las opciones especificados.

```cpp
static FileStreamPtr System::IO::File::Create(const String &path, int32_t bufferSize=DefaultBufferSize, FileOptions options=FileOptions::None)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ruta | const String\& | La ruta del archivo a crear o sobrescribir |
| bufferSize | int32_t | El número de bytes almacenados en búfer al leer y escribir en el archivo |
| opciones | FileOptions | Especifica cómo crear o sobrescribir el archivo |

### ReturnValue

Un puntero compartido al objeto [FileStream](../../filestream/) asociado con el archivo especificado

## Ver también

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileOptions](../../fileoptions/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
