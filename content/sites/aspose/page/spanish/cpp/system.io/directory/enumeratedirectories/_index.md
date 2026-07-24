---
title: "Método System::IO::Directory::EnumerateDirectories"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Page para C++"
description: "Método System::IO::Directory::EnumerateDirectories. Busca los directorios que cumplen con los criterios de búsqueda especificados, ya sea en el directorio especificado o en todo el árbol de directorios con raíz en el directorio especificado en C++."
type: docs
weight: 300
url: /es/cpp/system.io/directory/enumeratedirectories/
---
## Directory::EnumerateDirectories method


Busca los directorios que cumplen con los criterios de búsqueda especificados, ya sea en el directorio especificado o en todo el árbol de directorios con raíz en el directorio especificado.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ruta | const String\& | Ruta completa o relativa al directorio en el que buscar |
| searchPattern | const String\& | El patrón de nombre de los directorios a buscar |
| searchOption | SearchOption | Especifica si la búsqueda debe realizarse solo en el directorio especificado o en todo el árbol de directorios con raíz en el directorio especificado |

### ReturnValue

La colección enumerable de rutas completas de los directorios encontrados cuyos nombres coinciden con **searchPattern**

## Ver también

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
