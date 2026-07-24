---
title: "System::ObjectExt::UnboxToNullable método"
linktitle: "UnboxToNullable"
second_title: "Aspose.Page para C++"
description: "System::ObjectExt::UnboxToNullable método. Desempaqueta el objeto a un tipo nullable en C++."
type: docs
weight: 1600
url: /es/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


Desempaqueta objeto a tipo anulable.

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo de destino. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) para desempaquetar. |
| seguro | bool | Si es true, devuelve nullptr en caso de fallo, de lo contrario lanza InvalidCastException. |

### ReturnValue

Valor nullable desempaquetado (puede ser null).

## Ver también

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
