---
title: "System::Array::ConvertAll طريقة"
linktitle: "ConvertAll"
second_title: "Aspose.Font لـ C++"
description: "System::Array::ConvertAll طريقة. ينشئ كائن Array جديد ويملأه بعناصر المصفوفة المحددة المحوَّلة إلى النوع OutputType باستخدام المفوض المحول المحدد في C++."
type: docs
weight: 4800
url: /ar/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


ينشئ كائنًا جديدًا من نوع [Array](../) ويملأه بعناصر المصفوفة المحددة التي تم تحويلها إلى النوع **OutputType** باستخدام مفوض التحويل المحدد.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| معامل | الوصف |
| --- | --- |
| InputType | نوع عناصر مصفوفة الإدخال |
| OutputType | نوع عناصر المصفوفة الناتجة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | كائن من نوع [Array](../) |
| converter | Converter\<InputType, OutputType\> | كائن [Converter](../../converter/) يُستخدم لتحويل كل عنصر من مصفوفة الإدخال إلى قيم مكافئة من النوع **OutputType** |

### ReturnValue

مصفوفة جديدة تحتوي على قيم من النوع **OutputType** مكافئة للقيم في **input_array**

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


ينشئ كائنًا جديدًا من نوع [Array](../) ويملأه بعناصر المصفوفة المحددة التي تم تحويلها إلى النوع **OutputType** باستخدام كائن دالة التحويل المحدد.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| معامل | الوصف |
| --- | --- |
| InputType | نوع عناصر مصفوفة الإدخال |
| OutputType | نوع عناصر المصفوفة الناتجة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | كائن من نوع [Array](../) |
| converter | std::function\<OutputType(InputType)> | كائن دالة يُستخدم لتحويل كل عنصر من مصفوفة الإدخال إلى قيم مكافئة من النوع **OutputType** |

### ReturnValue

مصفوفة جديدة تحتوي على قيم من النوع **OutputType** مكافئة للقيم في **input_array**

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
