---
title: "System::Collections::Generic::Stack 类"
linktitle: "Stack"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::Stack 类。Stack 类在 C++ 中的前向声明。"
type: docs
weight: 4600
url: /zh/cpp/system.collections.generic/stack/
---
## Stack class


[Stack](./) class forward declaration.

```cpp
template<typename T>class Stack : public System::Collections::Generic::IEnumerable<T>
```


| 参数 | 描述 |
| --- | --- |
| T | 元素类型。 |
## Nested classes

* Class [Enumerator](./enumerator/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [AddRange](./addrange/)(IEnumerablePtr) | 将元素放入栈中。 |
| virtual [Clear](./clear/)() | 删除栈中的所有元素。 |
| virtual [Contains](./contains/)(const T\&) const | 检查容器中是否存在特定项；使用运算符 == 进行比较。 |
| [data](./data/)() | 内部数据结构访问器。 |
| [data](./data/)() const | 内部数据结构访问器。 |
| virtual [get_Count](./get_count/)() const | 获取栈中元素的数量。 |
| [GetEnumerator](./getenumerator/)() override | 获取枚举器以遍历当前栈。 |
| [Peek](./peek/)() | 获取栈顶元素，但保持在栈中。 |
| [Pop](./pop/)() | 获取栈顶元素。 |
| [Push](./push/)(const T\&) | 放置栈顶元素。 |
| [Stack](./stack/)() | 构造空栈。 |
| [Stack](./stack/)(int) | 构造空栈。 |
| [Stack](./stack/)(IEnumerablePtr) | 拷贝构造函数。 |
| virtual [ToArray](./toarray/)() | 将栈转换为数组。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取当前容器的 begin const 迭代器的实现。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取当前容器的 begin 迭代器的实现。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取当前容器的 end const 迭代器的实现。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取当前容器的 end 迭代器的实现。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | 包含相同类型元素的集合。 |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 类型。 |
| [stack_t](./stack_t/) | RTTI 信息。 |
| [ValueType](./valuetype/) | 值类型。 |
## 备注


[Stack](./) class wrapping std::list. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/stack.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void PrintItems(const SmartPtr<IEnumerable<int>> &stack)
{
  for (const auto item: stack)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // 创建 Stack 类实例。
  auto stack = MakeObject<Stack<int>>();

  // 填充栈。
  stack->Push(1);
  stack->Push(2);
  stack->Push(3);

  // 打印栈的最后一个项目。Peek 方法不会从栈中移除项目。
  std::cout << stack->Peek() << std::endl;
  PrintItems(stack);

  // 打印栈的最后一个项目。Pop 方法会从栈中移除项目。
  std::cout << stack->Pop() << std::endl;
  PrintItems(stack);

  return 0;
}
/*
This code example produces the following output:
3
3 2 1
3
2 1
*/
```

## 另见

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
