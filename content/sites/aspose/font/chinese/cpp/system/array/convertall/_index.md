---
title: "System::Array::ConvertAll 方法"
linktitle: "ConvertAll"
second_title: "Aspose.Font 适用于 C++"
description: "System::Array::ConvertAll 方法。构造一个新的 Array 对象，并使用指定的转换器委托在 C++ 中将指定数组的元素转换为 OutputType 类型后填充进去。"
type: docs
weight: 4800
url: /zh/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


构造一个新的 [Array](../) 对象，并使用指定的转换器委托将指定数组的元素转换为 **OutputType** 类型后填充它。

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| 参数 | 描述 |
| --- | --- |
| InputType | 输入数组中元素的类型 |
| OutputType | 结果数组中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | 一个 [Array](../) 对象 |
| converter | Converter\<InputType, OutputType\> | 一个用于将输入数组的每个元素转换为 **OutputType** 类型等价值的 [Converter](../../converter/) 对象 |

### ReturnValue

一个新数组，包含与 **input_array** 的值等价的 **OutputType** 类型的值

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


构造一个新的 [Array](../) 对象，并使用指定的转换函数对象将指定数组的元素转换为 **OutputType** 类型后填充它。

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| 参数 | 描述 |
| --- | --- |
| InputType | 输入数组中元素的类型 |
| OutputType | 结果数组中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | 一个 [Array](../) 对象 |
| converter | std::function\<OutputType(InputType)> | 一个用于将输入数组的每个元素转换为 **OutputType** 类型等价值的函数对象 |

### ReturnValue

一个新数组，包含与 **input_array** 的值等价的 **OutputType** 类型的值

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
