---
title: "System::Array::ConvertAll method"
linktitle: "ConvertAll"
second_title: "Aspose.Page voor C++"
description: "System::Array::ConvertAll method. Construeert een nieuw Array‑object en vult het met elementen van de opgegeven array die zijn geconverteerd naar het type OutputType met behulp van de opgegeven converter‑delegate in C++."
type: docs
weight: 4800
url: /nl/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


Construeert een nieuw [Array](../)‑object en vult het met elementen van de opgegeven array die zijn geconverteerd naar het type **OutputType** met behulp van de opgegeven converter‑delegate.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| Parameter | Beschrijving |
| --- | --- |
| InputType | Het type van de elementen van de invoerarray |
| OutputType | Het type van de elementen van de resulterende array |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Een [Array](../) object |
| converter | Converter\<InputType, OutputType\> | Een [Converter](../../converter/) object dat wordt gebruikt om elk element van de invoerarray te converteren naar equivalente waarden van het type **OutputType** |

### ReturnValue

Een nieuwe array die waarden van het type **OutputType** bevat die gelijkwaardig zijn aan de waarden van **input_array**

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


Construeert een nieuw [Array](../)‑object en vult het met elementen van de opgegeven array die zijn geconverteerd naar het type **OutputType** met behulp van het opgegeven converter‑functie‑object.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| Parameter | Beschrijving |
| --- | --- |
| InputType | Het type van de elementen van de invoerarray |
| OutputType | Het type van de elementen van de resulterende array |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Een [Array](../) object |
| converter | std::function\<OutputType(InputType)> | Een functie‑object dat wordt gebruikt om elk element van de invoerarray te converteren naar equivalente waarden van het type **OutputType** |

### ReturnValue

Een nieuwe array die waarden van het type **OutputType** bevat die gelijkwaardig zijn aan de waarden van **input_array**

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
