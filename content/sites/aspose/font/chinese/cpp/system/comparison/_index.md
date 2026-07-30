---
title: "System::Comparison 类"
linktitle: "比较"
second_title: "Aspose.Font 适用于 C++"
description: "System::Comparison 类。表示指向比较两个相同类型对象的方法的指针。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 1300
url: /zh/cpp/system/comparison/
---
## Comparison class


表示指向比较两个相同类型对象的方法的指针。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../smartptr/) 类来管理此类型的对象。

```cpp
template<typename T>class Comparison : public System::MulticastDelegate<int(T, T)>
```


| 参数 | 描述 |
| --- | --- |
| T | 方法比较的对象类型 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [Comparison](./comparison/)(Y) | 构造一个 [Comparison](./) 委托实例，该委托表示指向指定可调用实体的指针。 |
| [operator()](./operator()/)(T, T) | 调用当前对象指向的可调用对象。 |
## 备注



```cpp
#include "system/comparison.h"
#include "system/console.h"
#include "system/exceptions.h"
#include "system/string.h"
#include <algorithm>
#include <initializer_list>
#include <vector>

using namespace System;

// 表示动态数组的模板类。
template <typename T>
class MyArray
{
  // 用于存储数组数据。
  std::vector<T> m_data;

public:
  // 构造我们的动态数组的新实例。
  MyArray(const std::initializer_list<T>& source) : m_data(source) {};

  // 用于对数组数据进行排序。此方法接受一个实例，属于
  // 'System::Comparison' 模板类。
  void Sort(Comparison<T> comparison)
  {
    if (comparison.IsNull())
    {
      throw ArgumentNullException(u"comparison");
    }
    std::sort(m_data.begin(), m_data.end(), comparison);
  }

  // 返回我们的动态数组存储的元素数量。
  size_t get_Size()
  {
    return m_data.size();
  }

  // 用于在指定索引处获取元素。
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
  // 使用指定的元素创建 MyArray 类的实例。
  MyArray<String> arr = {u"a", u"e", u"c", u"b", u"d"};

  // 按动态数组的升序元素进行排序。
  arr.Sort([](const String &a, const String &b) -> int
  {
    return String::Compare(a, b);
  });

  // 打印动态数组的元素。
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

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
