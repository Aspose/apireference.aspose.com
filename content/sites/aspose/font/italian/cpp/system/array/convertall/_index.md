---
title: "Metodo System::Array::ConvertAll"
linktitle: "ConvertAll"
second_title: "Aspose.Font per C++"
description: "Metodo System::Array::ConvertAll. Costruisce un nuovo oggetto Array e lo riempie con gli elementi dell'array specificato convertiti al tipo OutputType utilizzando il delegato convertitore specificato in C++."
type: docs
weight: 4800
url: /it/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


Costruisce un nuovo oggetto [Array](../) e lo riempie con gli elementi dell'array specificato convertiti al tipo **OutputType** usando il delegato convertitore specificato.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| Parametro | Descrizione |
| --- | --- |
| InputType | Il tipo degli elementi dell'array di input |
| OutputType | Il tipo degli elementi dell'array risultante |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Un oggetto [Array](../) |
| converter | Converter\<InputType, OutputType\> | Un oggetto [Converter](../../converter/) usato per convertire ogni elemento dell'array di input in valori equivalenti del tipo **OutputType** |

### ReturnValue

Un nuovo array contenente valori del tipo **OutputType** equivalenti ai valori di **input_array**

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


Costruisce un nuovo oggetto [Array](../) e lo riempie con gli elementi dell'array specificato convertiti al tipo **OutputType** usando l'oggetto funzione convertitore specificato.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| Parametro | Descrizione |
| --- | --- |
| InputType | Il tipo degli elementi dell'array di input |
| OutputType | Il tipo degli elementi dell'array risultante |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Un oggetto [Array](../) |
| converter | std::function\<OutputType(InputType)> | Un oggetto funzione usato per convertire ogni elemento dell'array di input in valori equivalenti del tipo **OutputType** |

### ReturnValue

Un nuovo array contenente valori del tipo **OutputType** equivalenti ai valori di **input_array**

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
