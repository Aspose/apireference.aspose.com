---
title: "Método System::ObjectExt::UnknownToObject"
linktitle: "UnknownToObject"
second_title: "Aspose.Page para C++"
description: "Método System::ObjectExt::UnknownToObject. Convierte un tipo desconocido a Object, manejando tanto situaciones de tipo puntero inteligente como de tipo valor en C++."
type: docs
weight: 1800
url: /es/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


Convierte un tipo desconocido a [Object](../../object/), manejando tanto situaciones de tipo puntero inteligente como de tipo valor.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo al que convertir a [Object](../../object/). |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) a convertir. |

### ReturnValue

Puntero inteligente a [Object](../../object/) que puede ser un puntero convertido o un valor empaquetado.

## Ver también

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownToObject(T) method


Convierte un tipo desconocido a [Object](../../object/), manejando tanto situaciones de tipo puntero inteligente como de tipo valor.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo al que convertir a [Object](../../object/). |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | T | [Object](../../object/) a convertir. |

### ReturnValue

Puntero inteligente a [Object](../../object/) que puede ser un puntero convertido o un valor empaquetado.

## Ver también

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
