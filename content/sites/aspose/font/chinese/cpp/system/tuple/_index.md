---
title: "System::Tuple 类"
linktitle: "Tuple"
second_title: "Aspose.Font 适用于 C++"
description: "System::Tuple 类。表示元组数据结构的类。C++ 中最大项数为 8。"
type: docs
weight: 6400
url: /zh/cpp/system/tuple/
---
## Tuple class


表示元组数据结构的类。最大项数为 8。

```cpp
template<typename ...>class Tuple : public System::Runtime::CompilerServices::ITuple
```


| 参数 | 描述 |
| --- | --- |
| 参数 | tuple 元素的类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 确定当前对象和指定对象是否相同。 |
| [get_Item](./get_item/)() const | 获取 [Tuple](./) 对象的组件的值。 |
| [Tuple](./tuple/)(Args...) | 构造一个 tuple 对象。 |
## 备注



```cpp
#include "system/smart_ptr.h"
#include "system/tuple.h"
#include <iostream>

int main()
{
  const auto tuple = System::MakeObject<System::Tuple<int, int, int>>(32, 16, 128);

  std::cout <<
    "Item 1: " << tuple->get_Item<0>() << std::endl <<
    "Item 2: " << tuple->get_Item<1>() << std::endl <<
    "Item 3: " << tuple->get_Item<2>() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Item 1: 32
Item 2: 16
Item 3: 128
*/
```

## 另见

* Class [ITuple](../../system.runtime.compilerservices/ituple/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
