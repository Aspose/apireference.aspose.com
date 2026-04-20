---
title: "فئة System::ArraySegment"
linktitle: "ArraySegment"
second_title: "Aspose.Font لـ C++"
description: "فئة System::ArraySegment. تمثل جزءًا من المصفوفة أحادية البعد. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 300
url: /ar/cpp/system/arraysegment/
---
## ArraySegment class


تمثل جزءًا من المصفوفة أحادية البعد. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
template<typename T>class ArraySegment : public System::Object
```


| معامل | الوصف |
| --- | --- |
| T | نوع عناصر جزء المصفوفة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>) |  |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>, int32_t, int32_t) |  |
| [ArraySegment](./arraysegment/)() |  |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(ArraySegment\<T\>) |  |
| [get_Array](./get_array/)() |  |
| [get_Count](./get_count/)() |  |
| [get_Offset](./get_offset/)() |  |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
## ملاحظات



```cpp
#include <system/array_segment.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<ArraySegment<String>> &segment)
{
  for (auto i = segment->get_Offset(); i < segment->get_Offset() + segment->get_Count(); i++)
  {
    std::cout << segment->get_Array()[i] << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // إنشاء وملء المصفوفة.
  auto array = System::MakeObject<Array<String>>(3);
  array[0] = u"First";
  array[1] = u"Second";
  array[2] = u"Third";

  // إنشاء جزء المصفوفة الذي يحتوي على المصفوفة بالكامل.
  auto fullArray = MakeObject<ArraySegment<String>>(array);

  // طباعة عناصر جزء المصفوفة.
  Print(fullArray);

  // إنشاء جزء المصفوفة.
  auto segment = MakeObject<ArraySegment<String>>(array, 1, 2);

  // طباعة عناصر جزء المصفوفة.
  Print(segment);

  return 0;
}
/*
This code example produces the following output:
First Second Third
Second Third
*/
```

## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
