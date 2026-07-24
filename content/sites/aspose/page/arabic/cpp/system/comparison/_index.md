---
title: "System::Comparison فئة"
linktitle: "مقارنة"
second_title: "Aspose.Page لـ C++"
description: "System::Comparison فئة. تمثل مؤشرًا إلى الطريقة التي تقارن كائنين من نفس النوع. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 1300
url: /ar/cpp/system/comparison/
---
## Comparison class


تمثل مؤشرًا إلى الطريقة التي تقارن كائنين من نفس النوع. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
template<typename T>class Comparison : public System::MulticastDelegate<int(T, T)>
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائنات التي تقارنها الطريقة |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Comparison](./comparison/)(Y) | ينشئ مثيلًا من المفوض [Comparison](./) الذي يمثل المؤشر إلى الكيان القابل للاستدعاء المحدد. |
| [operator()](./operator()/)(T, T) | ينفذ الكائن القابل للاستدعاء المشار إليه من قبل الكائن الحالي. |
## ملاحظات



```cpp
#include "system/comparison.h"
#include "system/console.h"
#include "system/exceptions.h"
#include "system/string.h"
#include <algorithm>
#include <initializer_list>
#include <vector>

using namespace System;

// الفئة القالبية التي تمثل مصفوفة ديناميكية.
template <typename T>
class MyArray
{
  // تُستخدم لتخزين بيانات المصفوفة.
  std::vector<T> m_data;

public:
  // ينشئ نسخة جديدة من مصفوفةنا الديناميكية.
  MyArray(const std::initializer_list<T>& source) : m_data(source) {};

  // يُستخدم لفرز بيانات المصفوفة. هذه الطريقة تقبل مثيلاً من الـ
  // 'System::Comparison' فئة القالب.
  void Sort(Comparison<T> comparison)
  {
    if (comparison.IsNull())
    {
      throw ArgumentNullException(u"comparison");
    }
    std::sort(m_data.begin(), m_data.end(), comparison);
  }

  // يعيد عدد العناصر التي تخزنها مصفوفتنا الديناميكية.
  size_t get_Size()
  {
    return m_data.size();
  }

  // يُستخدم للحصول على عنصر في الفهرس المحدد.
  T& operator[](int index)
  {
    if (index < 0 || index >= m_data.size())
    {
      throw IndexOutOfRangeException(u"index");
    }
    return m_data[index];
  }
};

int main() {
  // إنشاء مثيل من فئة MyArray بالعناصر المحددة.
  MyArray<String> arr = {u"a", u"e", u"c", u"b", u"d"};

  // فرز العناصر تصاعديًا في المصفوفة الديناميكية.
  arr.Sort([](const String &a, const String &b) -> int
  {
    return String::Compare(a, b);
  });

  // طباعة عناصر المصفوفة الديناميكية.
  for (auto i = 0; i < arr.get_Size(); ++i)
  {
    Console::WriteLine(arr[i]);
  }

  return 0;
}
/*
This code example produces the following output:
a
b
c
d
e
*/
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
