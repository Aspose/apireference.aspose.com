---
title: "System::Collections::Generic::List::ConvertAll method"
linktitle: "ConvertAll"
second_title: "Aspose.Page para C++"
description: "System::Collections::Generic::List::ConvertAll method. Crea una lista de elementos convertidos a un tipo diferente en C++."
type: docs
weight: 1300
url: /es/cpp/system.collections.generic/list/convertall/
---
## List::ConvertAll method


Crea una lista de elementos convertidos a un tipo diferente.

```cpp
template<typename OutputType> SharedPtr<List<OutputType>> System::Collections::Generic::List<T>::ConvertAll(Converter<T, OutputType> converter)
```


| Parámetro | Descripción |
| --- | --- |
| OutputType | Tipo de elemento de la lista de salida. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| converter | Converter\<T, OutputType\> | [Converter](../../../system/converter/) para usar en la conversión de elementos. |

### ReturnValue

Una lista recién creada de elementos convertidos.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../)
* Typedef [Converter](../../../system/converter/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
