---
title: "System::Array::ConvertAll метод"
linktitle: "ConvertAll"
second_title: "Aspose.Page для C++"
description: "Метод System::Array::ConvertAll. Создает новый объект Array и заполняет его элементами указанного массива, преобразованными в тип OutputType с использованием указанного делегата преобразователя в C++."
type: docs
weight: 4800
url: /ru/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


Создает новый объект [Array](../) и заполняет его элементами указанного массива, преобразованными в тип **OutputType** с использованием указанного делегата преобразователя.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| Параметр | Описание |
| --- | --- |
| InputType | Тип элементов входного массива |
| OutputType | Тип элементов результирующего массива |

| Параметр | Тип | Описание |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Объект [Array](../) |
| converter | Converter\<InputType, OutputType\> | Объект [Converter](../../converter/), используемый для преобразования каждого элемента входного массива в эквивалентные значения типа **OutputType** |

### ReturnValue

Новый массив, содержащий значения типа **OutputType**, эквивалентные значениям **input_array**

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


Создает новый объект [Array](../) и заполняет его элементами указанного массива, преобразованными в тип **OutputType** с использованием указанного объект-функции преобразователя.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| Параметр | Описание |
| --- | --- |
| InputType | Тип элементов входного массива |
| OutputType | Тип элементов результирующего массива |

| Параметр | Тип | Описание |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Объект [Array](../) |
| конвертер | std::function\<OutputType(InputType)> | Объект-функция, используемый для преобразования каждого элемента входного массива в эквивалентные значения типа **OutputType** |

### ReturnValue

Новый массив, содержащий значения типа **OutputType**, эквивалентные значениям **input_array**

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
