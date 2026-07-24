---
title: "Método System::Array::ConvertAll"
linktitle: "ConvertAll"
second_title: "Aspose.Page para C++"
description: "System::Array::ConvertAll método. Construye un nuevo objeto Array y lo llena con los elementos del array especificado convertidos al tipo **OutputType** usando el delegado convertidor especificado en C++."
type: docs
weight: 4800
url: /es/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


Construye un nuevo objeto [Array](../) y lo llena con los elementos del array especificado convertidos al tipo **OutputType** usando el delegado convertidor especificado.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| Parámetro | Descripción |
| --- | --- |
| InputType | El tipo de los elementos del array de entrada |
| OutputType | El tipo de los elementos del array resultante |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Un objeto [Array](../) |
| converter | Converter\<InputType, OutputType\> | Un objeto [Converter](../../converter/) usado para convertir cada elemento del array de entrada a valores equivalentes del tipo **OutputType** |

### ReturnValue

Un nuevo array que contiene valores del tipo **OutputType** equivalentes a los valores de **input_array**

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


Construye un nuevo objeto [Array](../) y lo llena con los elementos del array especificado convertidos al tipo **OutputType** usando el objeto función convertidor especificado.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| Parámetro | Descripción |
| --- | --- |
| InputType | El tipo de los elementos del array de entrada |
| OutputType | El tipo de los elementos del array resultante |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Un objeto [Array](../) |
| convertidor | std::function\<OutputType(InputType)> | Un objeto función usado para convertir cada elemento del array de entrada a valores equivalentes del tipo **OutputType** |

### ReturnValue

Un nuevo array que contiene valores del tipo **OutputType** equivalentes a los valores de **input_array**

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
