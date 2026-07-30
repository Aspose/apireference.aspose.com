---
title: "System::Delegate< ReturnType(ArgumentTypes...)> 类"
linktitle: "Delegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Font 适用于 C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)> 类。表示指向函数、方法或函数对象的指针。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 2100
url: /zh/cpp/system/delegate_returntype(argumenttypes...)_/
---
## Delegate< ReturnType(ArgumentTypes...)> class


表示指向函数、方法或函数对象的指针。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../smartptr/) 类来管理此类型的对象。

```cpp
template<class ReturnType,class...>class Delegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| 参数 | 描述 |
| --- | --- |
| ReturnType | 该类所表示的函数、方法或函数对象指针的返回类型 |
| ArgumentTypes | 该类所表示的函数、方法或函数对象指针的参数列表 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [Delegate](./delegate/)() | 默认构造函数。构造一个不指向任何对象的委托对象。 |
| [Delegate](./delegate/)(const Delegate\&) |  |
| [Delegate](./delegate/)(Delegate\&&) | 移动拷贝构造函数。获取指定委托所指向实体的所有权。 |
| [Delegate](./delegate/)(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) | 构造函数。从指定的指向自由函数或静态方法的指针构造委托对象。 |
| [Delegate](./delegate/)(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) | 构造函数。从由 std::bind() 生成的函数对象指针构造委托。 |
| [Delegate](./delegate/)(int, T\&) | 构造函数。从指定的函数对象构造委托。 |
| [Delegate](./delegate/)(long, T\&&) | 移动构造函数。从指定的函数对象构造委托。 |
| [Delegate](./delegate/)(MemberType ClassType::*, ClassType *) | 构造函数。构造一个指向指定对象的指定非静态方法的委托。 |
| [Delegate](./delegate/)(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) | 构造函数。构造一个指向指定对象的指定非静态方法的委托。 |
| [Delegate](./delegate/)(std::function\<R(Args...)>) | 构造一个指向 std::function 函数对象的委托对象。 |
| [Empty](./empty/)() const | 确定当前委托对象是否为空，例如不指向任何实体。 |
| [operator()](./operator()/)(ArgumentTypes...) const | 调用当前委托对象所指向的函数、方法或函数对象。 |
| [operator=](./operator=/)(const Delegate\&) |  |
| [operator=](./operator=/)(Delegate\&&) | 移动赋值运算符。获取指定委托所指向实体的所有权。 |
| [operator==](./operator==/)(const Delegate\&) const | 比较两个委托对象，以检查它们是否指向相同的实体。 |
## 备注



```cpp
#include "system/delegate.h"
#include <iostream>

// 声明委托。
using Message = System::Delegate<void()>;

void PrintMessage()
{
  std::cout << "Hello, world!" << std::endl;
}

int main()
{
  // 将 PrintMessage 函数的地址赋给变量。
  Message mes = Message(&PrintMessage);

  // 调用函数。
  mes();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
