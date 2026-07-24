---
title: "System::IO::File::Open método"
linktitle: "Open"
second_title: "Aspose.Page para C++"
description: "System::IO::File::Open método. Abre el archivo especificado en el modo especificado para lectura y escritura y sin compartir en C++."
type: docs
weight: 1900
url: /es/cpp/system.io/file/open/
---
## File::Open(const String\&, FileMode) method


Abre el archivo especificado en el modo especificado para lectura y escritura y sin compartir.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ruta | const String\& | La ruta del archivo a abrir |
| mode | FileMode | Especifica el modo en que abrir el archivo |

### ReturnValue

Un objeto [FileStream](../../filestream/) asociado con el archivo abierto

## Ver también

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::Open(const String\&, FileMode, FileAccess, FileShare) method


Abre el archivo especificado en el modo especificado, con el tipo de acceso especificado y la opción de uso compartido.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::None)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ruta | const String\& | La ruta del archivo a abrir |
| mode | FileMode | Especifica el modo en que abrir el archivo |
| acceso | FileAccess | El tipo de acceso solicitado |
| share | FileShare | El tipo de acceso que otros objetos [FileStream](../../filestream/) tienen al archivo abierto |

### ReturnValue

Un objeto [FileStream](../../filestream/) asociado con el archivo abierto

## Ver también

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
