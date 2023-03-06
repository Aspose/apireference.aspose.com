---
title: Class AbstractPath
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.AbstractPath clase. Unruta abstracta es una clase base para clases que especifican una ubicación única en un entorno similar a un sistema de archivos como un sistema de archivos local un almacenamiento de archivos remoto o un archivo ZIP entre otros.
type: docs
weight: 10
url: /es/net/aspose.gis/abstractpath/
---
## AbstractPath class

Un`ruta abstracta` es una clase base para clases que especifican una ubicación única en un entorno similar a un sistema de archivos, como un sistema de archivos local, un almacenamiento de archivos remoto o un archivo ZIP, entre otros.

```csharp
public abstract class AbstractPath
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| abstract [Location](../../aspose.gis/abstractpath/location/) { get; } | Obtiene una representación de cadena de la ubicación de este`ruta abstracta` . |
| abstract [Separator](../../aspose.gis/abstractpath/separator/) { get; } | Obtiene un carácter separador que se usa para separar los niveles de directorio del[`Location`](./location/) cadena. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| static [FromLocalPath](../../aspose.gis/abstractpath/fromlocalpath/)(string) | Crea un`AbstractPath` que representa una ubicación en el sistema de archivos local. |
| static [FromStream](../../aspose.gis/abstractpath/fromstream/)(Stream) | Crea un`AbstractPath` a partir de unaStream . |
| virtual [Combine](../../aspose.gis/abstractpath/combine/)(string) | Combina esto`AbstractPath` con componentes de ruta especificados. |
| abstract [Delete](../../aspose.gis/abstractpath/delete/)() | Elimina un archivo al que apunta esta ruta. |
| [GetExtension](../../aspose.gis/abstractpath/getextension/)() | Devuelve la extensión de este`AbstractPath` . |
| [GetFileName](../../aspose.gis/abstractpath/getfilename/)() | Devuelve el nombre del archivo y la extensión de este`AbstractPath` . |
| [GetFileNameWithoutExtension](../../aspose.gis/abstractpath/getfilenamewithoutextension/)() | Devuelve el nombre de archivo de este`AbstractPath` sin la extensión. |
| abstract [IsFile](../../aspose.gis/abstractpath/isfile/)() | Obtiene un valor que indica si esta ruta apunta a un archivo existente que se puede abrir para lectura. |
| abstract [ListDirectory](../../aspose.gis/abstractpath/listdirectory/)() | Devuelve las rutas ubicadas dentro de este`ruta abstracta` , si es un directorio. |
| abstract [Open](../../aspose.gis/abstractpath/open/)(FileAccess) | Abre esto`ruta abstracta`como archivo. |
| virtual [WithExtension](../../aspose.gis/abstractpath/withextension/)(string) | Devuelve un nuevo`AbstractPath` con la extensión del archivo cambiada al valor especificado. |

### Observaciones

Un`ruta abstracta` puede especificar una ubicación en un sistema de archivos local, una ubicación en un sistema de archivos remoto o un almacenamiento externo como Azure Blob Storage, etc. La ubicación puede apuntar a objetos similares a archivos existentes o no existentes, objetos similares a directorios, o tener cualquier otro significado razonable para el entorno al que pertenece. Como ejemplo, un`ruta abstracta` El heredero que representa una ubicación en el sistema de archivos local puede apuntar a un archivo o directorio existente o a un lugar en el sistema de archivos que aún no se ha creado. Para hacer que un nuevo almacenamiento similar a un sistema de archivos esté disponible para`Aspose.GIS` uno debería heredar esta clase e implementar sus métodos abstractos.

### Ver también

* espacio de nombres [Aspose.Gis](../../aspose.gis/)
* asamblea [Aspose.GIS](../../)


