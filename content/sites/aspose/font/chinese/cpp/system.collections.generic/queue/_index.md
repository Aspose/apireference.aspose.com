---
title: "System::Collections::Generic::Queue 类"
linktitle: "Queue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::Queue 类。Queue 类在 C++ 中的前向声明。"
type: docs
weight: 3600
url: /zh/cpp/system.collections.generic/queue/
---
## Queue class


[Queue](./) class forward declaration.

```cpp
template<typename T>class Queue : public System::Collections::Generic::IEnumerable<T>
```


| 参数 | 描述 |
| --- | --- |
| T | 元素类型。 |
## Nested classes

* Class [Enumerator](./enumerator/)
## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Clear](./clear/)() | 删除队列中的所有元素。 |
| virtual [Contains](./contains/)(const T\&) const | 检查队列是否包含特定元素，使用运算符 == 来比较元素。 |
| [data](./data/)() | 底层数据结构访问器。 |
| [data](./data/)() const | 底层数据结构访问器。 |
| [Dequeue](./dequeue/)() | 获取队列开头的项。 |
| [Enqueue](./enqueue/)(const T\&) | 将项放入队列末尾。 |
| virtual [get_Count](./get_count/)() const | 获取队列中元素的数量。 |
| [GetEnumerator](./getenumerator/)() override | 获取枚举器以遍历队列。 |
| [Peek](./peek/)() | 获取队列开头的项，但不从队列中移除它。 |
| [Queue](./queue/)() | 构造空队列。 |
| [Queue](./queue/)(int) | 构造空队列。 |
| [Queue](./queue/)(const SharedPtr\<IEnumerable\<T\>\>\&) | 拷贝构造函数。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取当前容器的 begin const 迭代器的实现。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取当前容器的 begin 迭代器的实现。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取当前容器的 end const 迭代器的实现。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取当前容器的 end 迭代器的实现。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | 相同类型元素的容器。 |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 类型。 |
| [queue_t](./queue_t/) | RTTI 信息。 |
| [ValueType](./valuetype/) | 此类型。 |
## 备注


[Queue](./) container wrapping STL list. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/queue.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void PrintItems(const SmartPtr<IEnumerable<int>> &queue)
{
  for (const int item: queue)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // 创建 Queue 类的实例。
  auto queue = MakeObject<Queue<int>>();

  // 填充队列。
  queue->Enqueue(1);
  queue->Enqueue(2);
  queue->Enqueue(3);

  // 打印队列的第一个项。Peek 方法不会从队列中移除项。
  std::cout << queue->Peek() << std::endl;
  // 打印队列项。
  PrintItems(queue);

  // 打印队列的第一个项。Dequeue 方法会从队列中移除项。
  std::cout << queue->Dequeue() << std::endl;
  // 打印队列项。
  PrintItems(queue);

  return 0;
}
/*
This code example produces the following output:
1
1 2 3
1
2 3
*/
```

## 另见

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
