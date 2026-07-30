---
title: "System::Random 类"
linktitle: "Random"
second_title: "Aspose.Font 适用于 C++"
description: "System::Random 类。表示一个伪随机数生成器。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 5200
url: /zh/cpp/system/random/
---
## Random class


表示一个伪随机数生成器。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Random : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [IsNull](./isnull/)() const | 始终返回 false。 |
| virtual [Next](./next/)() | 返回一个小于 int32 最大值的非负随机数。 |
| virtual [Next](./next/)(int32_t) | 返回一个小于指定最大值的非负随机数。 |
| virtual [Next](./next/)(int32_t, int32_t) | 返回一个位于指定范围内的随机数。 |
| virtual [NextBytes](./nextbytes/)(const ArrayPtr\<uint8_t\>\&) | 用随机数填充指定字节数组的元素。 |
| virtual [NextDouble](./nextdouble/)() | 返回一个介于 0.0 和 1.0 之间的随机数。 |
| [Random](./random/)() | 使用基于时间的默认种子值初始化一个新实例。 |
| [Random](./random/)(int32_t) | 使用指定的种子值初始化 [System.Random](./) 类的新实例。 |
## 备注



```cpp
#include "system/random.h"
#include "system/smart_ptr.h"
#include <iostream>

int main()
{
  const auto rnd = System::MakeObject<System::Random>();

  // 获取一个随机的月份编号并打印出来。
  auto monthNumber = rnd->Next(1, 13);
  std::cout << "Month: " << monthNumber << std::endl;

  // 用随机数填充数组。
  auto arr = System::MakeObject<System::Array<uint8_t>>(12);
  rnd->NextBytes(arr);

  // 打印数组。
  for (auto i = 0; i < arr->get_Length(); ++i)
  {
    std::cout << static_cast<int>(arr[i]) << ' ';
  }
  std::cout << std::endl;

  return 0;
}
/*
This code example produces the following output:
Month: 4
177 213 89 240 68 182 18 96 109 131 1 78
*/
```

## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
