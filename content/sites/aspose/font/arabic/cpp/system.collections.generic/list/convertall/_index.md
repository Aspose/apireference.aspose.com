---
title: "System::Collections::Generic::List::ConvertAll طريقة"
linktitle: "ConvertAll"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Generic::List::ConvertAll طريقة. ينشئ قائمة من العناصر المحوَّلة إلى نوع مختلف في C++."
type: docs
weight: 1300
url: /ar/cpp/system.collections.generic/list/convertall/
---
## List::ConvertAll method


ينشئ قائمة من العناصر المحوّلة إلى نوع مختلف.

```cpp
template<typename OutputType> SharedPtr<List<OutputType>> System::Collections::Generic::List<T>::ConvertAll(Converter<T, OutputType> converter)
```


| معامل | الوصف |
| --- | --- |
| OutputType | نوع عنصر القائمة الناتج. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| converter | Converter\<T, OutputType\> | [Converter](../../../system/converter/) للاستخدام في تحويل العناصر. |

### ReturnValue

قائمة جديدة تم إنشاؤها من العناصر المحوَّلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../)
* Typedef [Converter](../../../system/converter/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
