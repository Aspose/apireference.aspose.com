---
title: "Método System::Build"
linktitle: "Build"
second_title: "Aspose.Page para C++"
description: "Método System::Build. Construye un objeto con propiedad directa en C++."
type: docs
weight: 15000
url: /es/cpp/system/build/
---
## System::Build method


Construye un objeto con propiedad directa.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T> System::Build(Args &&... args)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo de objeto a construir |
| Argumentos | Tipos de argumento para la construcción del objeto |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| args | Args\&&... | Argumentos para reenviar al constructor del objeto |

### ReturnValue

ObjectBuilder configured for direct object construction
## Observaciones



[Object](../object/) construction must be finished with [Get()](../get/) call 

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
