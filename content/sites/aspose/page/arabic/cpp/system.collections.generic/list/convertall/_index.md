---
title: "طريقة System::Collections::Generic::List::ConvertAll"
linktitle: "ConvertAll"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Collections::Generic::List::ConvertAll. تنشئ قائمة من العناصر المحوّلة إلى نوع مختلف في C++."
type: docs
weight: 1300
url: /ar/cpp/system.collections.generic/list/convertall/
---
## List::ConvertAll method


ينشئ قائمة من العناصر المحوّلة إلى نوع مختلف.

```cpp
template<typename OutputType> SharedPtr<List<OutputType>> System::Collections::Generic::List<T>::ConvertAll(Converter<T, OutputType> converter)
```


| Parameter | الوصف |
| --- | --- |
| OutputType | نوع عنصر القائمة الناتجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| converter | Converter\<T, OutputType\> | [Converter](../../../system/converter/) للاستخدام في تحويل العناصر. |

### ReturnValue

قائمة جديدة من العناصر المحوّلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../)
* Typedef [Converter](../../../system/converter/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
