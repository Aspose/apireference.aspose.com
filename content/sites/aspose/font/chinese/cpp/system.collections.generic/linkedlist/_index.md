---
title: "System::Collections::Generic::LinkedList 类"
linktitle: "LinkedList"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::LinkedList 类。LinkedList 在 C++ 中的前向声明。"
type: docs
weight: 3100
url: /zh/cpp/system.collections.generic/linkedlist/
---
## LinkedList class


[LinkedList](./) forward declaration.

```cpp
template<typename T>class LinkedList : public virtual System::Object,
                                       public System::Collections::Generic::ICollection<T>,
                                       private System::Collections::Invalidatable
```


| 参数 | 描述 |
| --- | --- |
| T | 包含的值类型。 |
## Nested classes

* Class [Enumerator](./enumerator/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const T\&) override | 将 **element** 添加到列表的末尾。 |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | 在列表的 **node** 之后添加 **element**。 |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | 在列表的 **node** 之后添加 **newNode**。 |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | 在列表的 **node** 之前添加 **element**。 |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | 在列表的 **node** 之前添加 **newNode**。 |
| [AddFirst](./addfirst/)(const T\&) | 将 **element** 添加到列表的开头。 |
| [AddFirst](./addfirst/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | 将 **newNode** 添加到列表的开头。 |
| [AddLast](./addlast/)(const T\&) | 将 **element** 添加到列表的末尾。 |
| [AddLast](./addlast/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | 将 **newNode** 添加到列表的末尾。 |
| [begin](./begin/)() | 获取集合中第一个元素的迭代器。 |
| [begin](./begin/)() const | 获取指向 const 限定集合的第一个元素的迭代器。 |
| [cbegin](./cbegin/)() const | 获取指向集合的第一个 const 限定元素的迭代器。 |
| [cend](./cend/)() const | 获取指向集合末尾之后的不存在的 const 限定元素的迭代器。 |
| [Clear](./clear/)() override | 删除列表中的所有元素。 |
| [Contains](./contains/)(const T\&) const override | 检查列表中是否存在 **element**。 |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | 将容器数据复制到现有数组元素中。 |
| [crbegin](./crbegin/)() const | 获取指向集合中最后一个 const 限定元素的逆向迭代器（逆向的第一个）。 |
| [crend](./crend/)() const | 获取指向集合起始之前的不存在的 const 限定元素的逆向迭代器。 |
| [end](./end/)() | 获取指向集合末尾之后的不存在的元素的迭代器。 |
| [end](./end/)() const | 获取指向 const 限定集合末尾之后的不存在的元素的迭代器。 |
| [Find](./find/)(const T\&) const | 在列表中执行 **element** 的正向查找。 |
| [FindLast](./findlast/)(const T\&) const | 在列表中执行 **element** 的反向查找。 |
| [get_Count](./get_count/)() const override | 获取列表中元素的数量。 |
| [get_First](./get_first/)() const | 获取列表中第一个元素的指针。 |
| [get_Last](./get_last/)() const | 获取列表中最后一个元素的指针。 |
| [GetEnumerator](./getenumerator/)() override | 获取枚举器以遍历当前的 [LinkedList](./)。 |
| [LinkedList](./linkedlist/)() | 创建空的 [LinkedList](./)。 |
| [LinkedList](./linkedlist/)(const SharedPtr\<IEnumerable\<T\>\>\&) | 拷贝构造函数。 |
| [rbegin](./rbegin/)() | 获取指向集合中最后一个元素的逆向迭代器（逆向的第一个）。 |
| [rbegin](./rbegin/)() const | 获取指向 const 限定集合中最后一个元素的逆向迭代器（逆向的第一个）。 |
| [Remove](./remove/)(const T\&) override | 从列表中移除指定 **element** 的第一次出现。 |
| [Remove](./remove/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | 从列表中移除节点。 |
| [RemoveFirst](./removefirst/)() | 从列表中移除第一个节点。 |
| [RemoveLast](./removelast/)() | 从列表中移除最后一个节点。 |
| [rend](./rend/)() | 获取指向集合起始之前的不存在的元素的逆向迭代器。 |
| [rend](./rend/)() const | 获取指向 const 限定集合起始之前的不存在的元素的逆向迭代器。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取当前容器的 begin const 迭代器的实现。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取当前容器的 begin 迭代器的实现。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取当前容器的 end const 迭代器的实现。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取当前容器的 end 迭代器的实现。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [const_iterator](./const_iterator/) | 常量迭代器类型。 |
| [const_reverse_iterator](./const_reverse_iterator/) | 常量反向迭代器类型。 |
| [iterator](./iterator/) | 迭代器类型。 |
| [list_t](./list_t/) | 底层数据类型。 |
| [reverse_iterator](./reverse_iterator/) | 反向迭代器类型。 |
## 备注


链表容器。实现了对 std::list 的包装。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。


```cpp
#include <system/collections/linkedlist.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // 创建 LinkedList 类的实例。
  auto list = MakeObject<LinkedList<int>>();

  // 填充链表。
  list->AddFirst(1);
  list->AddLast(30);
  list->AddAfter(list->get_First(), 15);
  list->AddBefore(list->get_Last(), 25);

  // 打印链表项。
  for (const auto item: list)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
1 15 25 30
*/
```

## 另见

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Class [Invalidatable](../../system.collections/invalidatable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
