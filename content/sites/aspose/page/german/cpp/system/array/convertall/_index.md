---
title: "System::Array::ConvertAll Methode"
linktitle: "ConvertAll"
second_title: "Aspose.Page für C++"
description: "System::Array::ConvertAll-Methode. Erstellt ein neues Array-Objekt und füllt es mit Elementen des angegebenen Arrays, die mithilfe des angegebenen Converter-Delegaten in den Typ OutputType konvertiert wurden, in C++."
type: docs
weight: 4800
url: /de/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


Konstruiert ein neues [Array](../)-Objekt und füllt es mit Elementen des angegebenen Arrays, die in den Typ **OutputType** mithilfe des angegebenen Converter-Delegaten konvertiert wurden.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| Parameter | Beschreibung |
| --- | --- |
| InputType | Der Typ der Elemente des Eingabe-Arrays |
| OutputType | Der Typ der Elemente des resultierenden Arrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Ein [Array](../)-Objekt |
| converter | Converter\<InputType, OutputType\> | Ein [Converter](../../converter/)-Objekt, das verwendet wird, um jedes Element des Eingabe-Arrays in äquivalente Werte des Typs **OutputType** zu konvertieren. |

### ReturnValue

Ein neues Array, das Werte des Typs **OutputType** enthält, die den Werten von **input_array** entsprechen.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


Konstruiert ein neues [Array](../)-Objekt und füllt es mit Elementen des angegebenen Arrays, die mithilfe des angegebenen Converter-Funktionsobjekts in den Typ **OutputType** konvertiert wurden.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| Parameter | Beschreibung |
| --- | --- |
| InputType | Der Typ der Elemente des Eingabe-Arrays |
| OutputType | Der Typ der Elemente des resultierenden Arrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Ein [Array](../)-Objekt |
| converter | std::function\<OutputType(InputType)> | Ein Funktionsobjekt, das verwendet wird, um jedes Element des Eingabe-Arrays in äquivalente Werte des Typs **OutputType** zu konvertieren. |

### ReturnValue

Ein neues Array, das Werte des Typs **OutputType** enthält, die den Werten von **input_array** entsprechen.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
