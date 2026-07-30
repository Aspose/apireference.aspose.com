---
title: "System::ArraySegment 类"
linktitle: "ArraySegment"
second_title: "Aspose.Font 适用于 C++"
description: "System::ArraySegment 类。表示一维数组的一个段。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 300
url: /zh/cpp/system/arraysegment/
---
## ArraySegment class


表示一维数组的一个段。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../smartptr/) 类来管理此类型的对象。

```cpp
template<typename T>class ArraySegment : public System::Object
```


| 参数 | 描述 |
| --- | --- |
| T | 数组段元素的类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>) |  |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>, int32_t, int32_t) |  |
| [ArraySegment](./arraysegment/)() |  |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(ArraySegment\<T\>) |  |
| [get_Array](./get_array/)() |  |
| [get_Count](./get_count/)() |  |
| [get_Offset](./get_offset/)() |  |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# 的 [Object.GetHashCode()](../object/gethashcode/) 方法。支持对自定义对象进行哈希。 |
## 备注



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
  // 创建并填充数组。
  auto array = System::MakeObject<Array<String>>(3);
  array[0] = u"First";
  array[1] = u"Second";
  array[2] = u"Third";

  // 创建包含整个数组的数组段。
  auto fullArray = MakeObject<ArraySegment<String>>(array);

  // 打印数组段的项目。
  Print(fullArray);

  // 创建数组段。
  auto segment = MakeObject<ArraySegment<String>>(array, 1, 2);

  // 打印数组段的项目。
  Print(segment);

  return 0;
}
/*
This code example produces the following output:
First Second Third
Second Third
*/
```

## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
