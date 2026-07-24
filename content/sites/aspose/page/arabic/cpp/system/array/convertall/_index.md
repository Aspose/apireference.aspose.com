---
title: "طريقة System::Array::ConvertAll"
linktitle: "ConvertAll"
second_title: "Aspose.Page لـ C++"
description: "System::Array::ConvertAll method. يبني كائن Array جديد ويملأه بعناصر المصفوفة المحددة التي تم تحويلها إلى النوع **OutputType** باستخدام المفوض المحدد في C++."
type: docs
weight: 4800
url: /ar/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


يبني كائن [Array](../) جديد ويملأه بعناصر المصفوفة المحددة التي تم تحويلها إلى النوع **OutputType** باستخدام المفوض المحدد.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| Parameter | الوصف |
| --- | --- |
| InputType | نوع عناصر مصفوفة الإدخال |
| OutputType | نوع عناصر المصفوفة الناتجة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | كائن [Array](../) |
| converter | Converter\<InputType, OutputType\> | كائن [Converter](../../converter/) يُستخدم لتحويل كل عنصر من مصفوفة الإدخال إلى قيم مكافئة من النوع **OutputType** |

### ReturnValue

مصفوفة جديدة تحتوي على قيم من النوع **OutputType** مكافئة لقيم **input_array**

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


يبني كائن [Array](../) جديد ويملأه بعناصر المصفوفة المحددة التي تم تحويلها إلى النوع **OutputType** باستخدام كائن دالة المحول المحدد.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| Parameter | الوصف |
| --- | --- |
| InputType | نوع عناصر مصفوفة الإدخال |
| OutputType | نوع عناصر المصفوفة الناتجة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | كائن [Array](../) |
| converter | std::function\<OutputType(InputType)> | كائن دالة يُستخدم لتحويل كل عنصر من مصفوفة الإدخال إلى قيم مكافئة من النوع **OutputType** |

### ReturnValue

مصفوفة جديدة تحتوي على قيم من النوع **OutputType** مكافئة لقيم **input_array**

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
