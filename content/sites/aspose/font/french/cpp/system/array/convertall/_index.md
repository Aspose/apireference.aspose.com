---
title: "System::Array::ConvertAll method"
linktitle: "ConvertAll"
second_title: "Aspose.Font pour C++"
description: "System::Array::ConvertAll method. Construit un nouvel objet Array et le remplit avec les éléments du tableau spécifié convertis en type OutputType à l'aide du délégué de conversion spécifié en C++."
type: docs
weight: 4800
url: /fr/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


Construit un nouvel objet [Array](../) et le remplit avec les éléments du tableau spécifié convertis en type **OutputType** à l'aide du délégué de conversion spécifié.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| Paramètre | Description |
| --- | --- |
| InputType | Le type des éléments du tableau d'entrée |
| OutputType | Le type des éléments du tableau résultant |

| Paramètre | Type | Description |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Un objet [Array](../) |
| converter | Converter\<InputType, OutputType\> | Un objet [Converter](../../converter/) utilisé pour convertir chaque élément du tableau d'entrée en valeurs équivalentes du type **OutputType** |

### ReturnValue

Un nouveau tableau contenant des valeurs du type **OutputType** équivalentes aux valeurs de **input_array**

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


Construit un nouvel objet [Array](../) et le remplit avec les éléments du tableau spécifié convertis en type **OutputType** à l'aide de l'objet fonction de conversion spécifié.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| Paramètre | Description |
| --- | --- |
| InputType | Le type des éléments du tableau d'entrée |
| OutputType | Le type des éléments du tableau résultant |

| Paramètre | Type | Description |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Un objet [Array](../) |
| convertisseur | std::function\<OutputType(InputType)> | Un objet fonction utilisé pour convertir chaque élément du tableau d'entrée en valeurs équivalentes du type **OutputType** |

### ReturnValue

Un nouveau tableau contenant des valeurs du type **OutputType** équivalentes aux valeurs de **input_array**

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
