---
title: "System::ObjectExt::ObjectToUnknown método"
linktitle: "ObjectToUnknown"
second_title: "Aspose.Page para C++"
description: "System::ObjectExt::ObjectToUnknown método. Convierte Object a un tipo desconocido, manejando tanto tipos de puntero inteligente como situaciones de valor bpxed en C++."
type: docs
weight: 1200
url: /es/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Convierte [Object](../../object/) a un tipo desconocido, manejando tanto tipos de puntero inteligente como situaciones de valor bpxed.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo al que convertir [Object](../../object/). |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) a convertir. |

### ReturnValue

Ya sea valor desempaquetado o puntero convertido.

## Ver también

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Convierte [Object](../../object/) a un tipo desconocido, manejando tanto tipos de puntero inteligente como situaciones de valor empaquetado.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo al que convertir [Object](../../object/). |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) a convertir. |

### ReturnValue

Ya sea valor desempaquetado o puntero convertido.

## Ver también

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
