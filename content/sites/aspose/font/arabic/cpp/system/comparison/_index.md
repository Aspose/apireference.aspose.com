---
title: "فئة System::Comparison"
linktitle: "مقارنة"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Comparison. تمثل مؤشرًا إلى الطريقة التي تقارن كائنين من نفس النوع. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 1300
url: /ar/cpp/system/comparison/
---
## Comparison class


تمثل مؤشرًا إلى الطريقة التي تقارن كائنين من نفس النوع. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
template<typename T>class Comparison : public System::MulticastDelegate<int(T, T)>
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائنات التي تقارنها الطريقة |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Comparison](./comparison/)(Y) | ينشئ نسخة من المفوضية [Comparison](./) التي تمثل المؤشر إلى الكيان القابل للاستدعاء المحدد. |
| [operator()](./operator()/)(T, T) | ينفذ الكائن القابل للاستدعاء الذي يشير إليه الكائن الحالي. |
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

// الفئة القالب التي تمثل مصفوفة ديناميكية.
template <typename T>
class MyArray
{
  // تُستخدم لتخزين بيانات المصفوفة.
  std::vector<T> m_data;

public:
  // ينشئ نسخة جديدة من مصفوفةنا الديناميكية.
  MyArray(const std::initializer_list<T>& source) : m_data(source) {};

  // تُستخدم لفرز بيانات المصفوفة. تقبل هذه الطريقة نسخة من
  // فئة القالب 'System::Comparison'.
  void Sort(Comparison<T> comparison)
  {
    if (comparison.IsNull())
    {
      throw ArgumentNullException(u"comparison");
    }
    std::sort(m_data.begin(), m_data.end(), comparison);
  }

  // تُرجع عدد العناصر التي تخزنها مصفوفةنا الديناميكية.
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
  // إنشاء نسخة من الفئة MyArray مع العناصر المحددة.
  MyArray<String> arr = {u"a", u"e", u"c", u"b", u"d"};

  // فرز العناصر بترتيب تصاعدي للمصفوفة الديناميكية.
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
* Library [Aspose.Font for C++](../../)
