---
title: "Método System::ObjectExt::UnknownIsNull"
linktitle: "UnknownIsNull"
second_title: "Aspose.Page para C++"
description: "Método System::ObjectExt::UnknownIsNull. Verifica si un objeto de tipo desconocido es nullptr. Sobrecarga para tipos no escalares en C++."
type: docs
weight: 1700
url: /es/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


Comprueba si el objeto de tipo desconocido es nullptr. Sobrecarga para tipos no escalares.

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parámetro | Descripción |
| --- | --- |
| T | tipo [Object](../../object/). |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | T | [Object](../../object/) para comprobar. |

### ReturnValue

Verdadero si 'obj == nullptr' es verdadero, falso en caso contrario.

## Ver también

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


Comprueba si el objeto de tipo desconocido es nullptr. Sobrecarga para tipos escalares.

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parámetro | Descripción |
| --- | --- |
| T | tipo [Object](../../object/). |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | T | [Object](../../object/) para comprobar. |

### ReturnValue

Siempre devuelve false.

## Ver también

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
