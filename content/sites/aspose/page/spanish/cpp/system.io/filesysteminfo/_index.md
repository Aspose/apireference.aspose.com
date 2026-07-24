---
title: "Clase System::IO::FileSystemInfo"
linktitle: "FileSystemInfo"
second_title: "Aspose.Page para C++"
description: "Clase System::IO::FileSystemInfo. La clase base para FileInfo y DirectoryInfo. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 1600
url: /es/cpp/system.io/filesysteminfo/
---
## FileSystemInfo class


La clase base para [FileInfo](../fileinfo/) y [DirectoryInfo](../directoryinfo/). Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class FileSystemInfo : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [Delete](./delete/)() | Elimina la entidad representada por el objeto actual. |
| virtual [Finalize](./finalize/)() | No hace nada. |
| [get_Attributes](./get_attributes/)() | Devuelve los atributos de la entidad representada por el objeto actual. |
| [get_CreationTime](./get_creationtime/)() | Devuelve la hora de creación de la entidad representada por el objeto actual en hora local. |
| [get_CreationTimeUtc](./get_creationtimeutc/)() | Devuelve la hora de creación de la entidad representada por el objeto actual en hora UTC. |
| virtual [get_Exists](./get_exists/)() | Determina si la entidad referenciada por la ruta representada por el objeto actual existe. |
| [get_Extension](./get_extension/)() | Devuelve la extensión del archivo representado por el objeto actual. |
| virtual [get_FullName](./get_fullname/)() | Devuelve el nombre completo (incluyendo la ruta) de la entidad representada por el objeto actual. |
| [get_LastAccessTime](./get_lastaccesstime/)() | Devuelve la última hora de acceso de la entidad representada por el objeto actual como hora local. |
| [get_LastAccessTimeUtc](./get_lastaccesstimeutc/)() | Devuelve la última hora de acceso de la entidad representada por el objeto actual como hora UTC. |
| [get_LastWriteTime](./get_lastwritetime/)() | Devuelve la última hora de escritura de la entidad representada por el objeto actual como hora local. |
| [get_LastWriteTimeUtc](./get_lastwritetimeutc/)() | Devuelve la última hora de escritura de la entidad representada por el objeto actual como hora UTC. |
| virtual [get_Name](./get_name/)() | Devuelve un nombre de la entidad representada por el objeto actual. |
| [Refresh](./refresh/)() | Actualiza el estado del objeto actual. |
| [set_Attributes](./set_attributes/)(FileAttributes) | Establece los atributos especificados en la entidad representada por el objeto actual. |
| [set_CreationTime](./set_creationtime/)(DateTime) | Establece la hora de creación de la entidad representada por el objeto actual como hora local. |
| [set_CreationTimeUtc](./set_creationtimeutc/)(DateTime) | Establece la hora de creación de la entidad representada por el objeto actual como hora UTC. |
| [set_LastAccessTime](./set_lastaccesstime/)(DateTime) | Establece la última hora de acceso de la entidad representada por el objeto actual como hora local. |
| [set_LastAccessTimeUtc](./set_lastaccesstimeutc/)(DateTime) | Establece la última hora de acceso de la entidad representada por el objeto actual como hora UTC. |
| [set_LastWriteTime](./set_lastwritetime/)(DateTime) | Establece la última hora de escritura de la entidad representada por el objeto actual como hora local. |
| [set_LastWriteTimeUtc](./set_lastwritetimeutc/)(DateTime) | Establece la última hora de escritura de la entidad representada por el objeto actual como hora UTC. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
