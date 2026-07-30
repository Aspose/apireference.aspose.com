---
title: "System::Func 类"
linktitle: "Func"
second_title: "Aspose.Font 适用于 C++"
description: "System::Func 类。函数委托。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 2800
url: /zh/cpp/system/func/
---
## Func class


函数委托。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../smartptr/) 类来管理此类型的对象。

```cpp
template<typename...>class Func : public System::MulticastDelegate<::System::Detail::FuncArgsReorderer<void(), Args...>::type>
```


| 参数 | 描述 |
| --- | --- |
| 参数 | 调用参数，然后是必需的返回类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [Func](./func/)() | 创建 null-Func 的默认构造函数。 |
| [Func](./func/)(T\&&) | 构造函数用于构造 [Func](./) 对象并将值（实际回调或 nullptr）分配给它。 |
| [Func](./func/)(const Func\&) | 拷贝构造函数。 |
| [Func](./func/)(Func\&&) | 移动构造函数。 |
| [operator=](./operator=/)(const Func\&) | 复制赋值。 |
| [operator=](./operator=/)(Func\&&) | 移动赋值。 |
| [~Func](./~func/)() | 析构函数。 |
## 备注



```cpp
#include "system/func.h"
#include <iostream>

// 此函数接受一个 System::Func 委托的实例作为参数。
void Print(int x, const System::Func<int, int> &func)
{
  std::cout << func(x) << std::endl;
}

int main()
{
  // 创建一个 System::Func 委托的实例。
  auto func = static_cast<System::Func<int, int>>([](int x) -> int
  {
    return x * x;
  });

  // 将创建的实例作为函数参数传递。
  Print(1, func);
  Print(2, func);
  Print(3, func);

  return 0;
}
/*
This code example produces the following output:
1
4
9
*/
```

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
