---
title: "System::Collections::Generic::List 类"
linktitle: "列表"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::List 类。C++ 中的 List 前向声明。"
type: docs
weight: 3300
url: /zh/cpp/system.collections.generic/list/
---
## List class


[List](./) forward declaration.

```cpp
template<typename T>class List : public virtual System::Object,
                                 public System::Collections::Generic::IList<T>
```


| 参数 | 描述 |
| --- | --- |
| T | 元素类型。 |
## Nested classes

* Class [Enumerator](./enumerator/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | 特定于 C++。 |
| [Add](./add/)(const T\&) override | 将元素添加到列表末尾。 |
| [AddInitializer](./addinitializer/)(int, const T *) | 向列表添加元素；在翻译初始化器时使用。 |
| [AddRange](./addrange/)(IEnumerablePtr) | 将集合（或自身）的所有元素添加到当前列表的末尾。 |
| [AsReadOnly](./asreadonly/)() | 获取对此集合的只读引用。 |
| [begin](./begin/)() | 获取集合中第一个元素的迭代器。 |
| [begin](./begin/)() const | 获取指向 const 限定集合的第一个元素的迭代器。 |
| [BinarySearch](./binarysearch/)(const T\&) const | 在已排序的列表中查找项目。 |
| [BinarySearch](./binarysearch/)(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | 在已排序的列表中查找项目。 |
| [BinarySearch](./binarysearch/)(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | 在已排序的列表中查找项目。 |
| [cbegin](./cbegin/)() const | 获取指向集合的第一个 const 限定元素的迭代器。 |
| [cend](./cend/)() const | 获取指向集合末尾之后的不存在的 const 限定元素的迭代器。 |
| [Clear](./clear/)() override | 删除所有元素。 |
| [Contains](./contains/)(const T\&) const override | 检查项是否存在于列表中。 |
| [ConvertAll](./convertall/)(Converter\<T, OutputType\>) | 创建一个元素已转换为不同类型的列表。 |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | 将列表元素复制到现有数组元素中。 |
| [CopyTo](./copyto/)(const System::ArrayPtr\<T\>\&) | 将所有元素复制到现有数组元素中。 |
| [CopyTo](./copyto/)(int, const System::ArrayPtr\<T\>\&, int, int) | 从指定索引开始，将元素复制到现有数组元素中。 |
| [crbegin](./crbegin/)() const | 获取指向集合中最后一个 const 限定元素的逆向迭代器（逆向的第一个）。 |
| [crend](./crend/)() const | 获取指向集合起始之前的不存在的 const 限定元素的逆向迭代器。 |
| [data](./data/)() | 底层数据结构访问函数。 |
| [data](./data/)() const | 底层数据结构访问函数。 |
| [end](./end/)() | 获取指向集合末尾之后的不存在的元素的迭代器。 |
| [end](./end/)() const | 获取指向 const 限定集合末尾之后的不存在的元素的迭代器。 |
| [Exists](./exists/)(System::Predicate\<T\>) | 检查列表中是否存在符合特定谓词的元素。 |
| [Find](./find/)(System::Predicate\<T\>) | 查找符合特定谓词的元素。 |
| [FindAll](./findall/)(System::Predicate\<T\>) | 查找符合特定谓词的元素集合。 |
| [FindIndex](./findindex/)(System::Predicate\<T\>) | 查找符合特定谓词的元素。 |
| [FindIndex](./findindex/)(int, System::Predicate\<T\>) | 查找符合特定谓词的元素。 |
| [FindIndex](./findindex/)(int, int, System::Predicate\<T\>) | 查找符合特定谓词的元素。 |
| [FindLast](./findlast/)(System::Predicate\<T\>) | 查找符合特定谓词的最后一个元素。 |
| [ForEach](./foreach/)(System::Action\<T\>) | 对列表中的所有元素应用操作。 |
| [get_Capacity](./get_capacity/)() const | 获取当前列表的容量。 |
| [get_Count](./get_count/)() const override | 获取当前列表中的元素数量。 |
| [GetEnumerator](./getenumerator/)() override | 获取用于遍历列表元素的枚举器。 |
| [GetRange](./getrange/)(int, int) | 创建列表的切片。 |
| [idx_get](./idx_get/)(int) const override | 获取特定位置的元素。 |
| [idx_set](./idx_set/)(int, T) override | 在特定位置设置元素。 |
| [IndexOf](./indexof/)(const T\&) const override | 获取特定项的第一个索引。 |
| [IndexOf](./indexof/)(const T\&, int) const | 在列表中查找特定项。 |
| [Insert](./insert/)(int, const T\&) override | 在指定位置插入项。 |
| [InsertRange](./insertrange/)(int, IEnumerablePtr) | 在特定位置插入数据范围。 |
| [LastIndexOf](./lastindexof/)(const T\&) const | 搜索指定对象，并返回其在整个列表中最后一次出现的零基索引。 |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t) const | 搜索指定对象，并返回其在 [List](./) 中从第一个元素到指定索引范围内最后一次出现的零基索引。 |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t, int32_t) const | 搜索指定对象，并返回其在 [List](./) 中包含指定数量元素并以指定索引结束的范围内最后一次出现的零基索引。 |
| [List](./list/)() | 创建空列表。 |
| [List](./list/)(int) | 创建具有预定义容量的列表。 |
| [List](./list/)(IEnumerablePtr) | 拷贝构造函数。 |
| [operator[]](./operator[]/)(int) | 访问器函数。 |
| [operator[]](./operator[]/)(int) const | 访问器函数。 |
| [rbegin](./rbegin/)() | 获取指向集合中最后一个元素的逆向迭代器（逆向的第一个）。 |
| [rbegin](./rbegin/)() const | 获取指向 const 限定集合中最后一个元素的逆向迭代器（逆向的第一个）。 |
| [Remove](./remove/)(const T\&) override | 从列表中移除特定项的第一次出现。 |
| [RemoveAll](./removeall/)(Predicate\<T\>) | 移除所有匹配特定谓词的元素。 |
| [RemoveAt](./removeat/)(int) override | 移除指定位置的项。 |
| [RemoveRange](./removerange/)(int, int) | 移除列表的切片。 |
| [rend](./rend/)() | 获取指向集合起始之前的不存在的元素的逆向迭代器。 |
| [rend](./rend/)() const | 获取指向 const 限定集合起始之前的不存在的元素的逆向迭代器。 |
| [Reverse](./reverse/)() | 反转整个列表的元素顺序。 |
| [Reverse](./reverse/)(int, int) | 反转列表切片的元素顺序。 |
| [set_Capacity](./set_capacity/)(int) | 设置列表容量。 |
| [Sort](./sort/)(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | 对列表中的元素进行排序。 |
| [Sort](./sort/)() | 使用默认比较器对列表中的元素进行排序。 |
| [Sort](./sort/)(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) | 对列表切片中的元素进行排序。 |
| [Sort](./sort/)(Comparison\<T\>, bool) | 对列表中的元素进行排序。 |
| [ToArray](./toarray/)() const | 将列表转换为数组。 |
| [TrimExcess](./trimexcess/)() | 使列表容量适应其大小。 |
| [TrueForAll](./trueforall/)(System::Predicate\<T\>) | 确定集合中的每个元素是否匹配指定谓词定义的条件。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取当前容器的 begin const 迭代器的实现。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取当前容器的 begin 迭代器的实现。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取当前容器的 end const 迭代器的实现。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取当前容器的 end 迭代器的实现。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [BaseType](./basetype/) | 接口类型。 |
| [const_iterator](./const_iterator/) | 常量迭代器类型。 |
| [const_reverse_iterator](./const_reverse_iterator/) | 常量反向迭代器类型。 |
| [IEnumerablePtr](./ienumerableptr/) | 容器保存我们持有的相同类型的元素。 |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 类型。 |
| [iterator](./iterator/) | 迭代器类型。 |
| [reverse_iterator](./reverse_iterator/) | 反向迭代器类型。 |
| [ValueType](./valuetype/) | 此类型。 |
| [vector_t](./vector_t/) | RTTI 信息。 |
## 备注


[List](./) - wrapper around std::vector to be used in translated code. Requires operator == to be impemented for element type. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // 创建第一个列表。
  auto list1 = MakeObject<List<int>>();

  // 填充第一个列表。
  list1->Add(3);
  list1->Add(1);
  list1->Add(-5);
  list1->Add(8);

  // 对第一个列表进行排序。
  // 第一个列表的项将是: {-5, 1, 3, 8}
  list1->Sort();

  // 删除索引为 2 的项。
  // 第一个列表的项将是: {-5, 1, 8}
  list1->RemoveAt(2);

  // 在索引 1 处插入该项。
  // 第一个列表的项将是: {-5, 15, 1, 8}
  list1->Insert(1, 15);

  // 创建第二个列表。
  auto list2 = MakeObject<List<int>>();

  // 填充第二个列表。
  list2->Add(10);
  list2->Add(20);
  list2->Add(30);

  // 将第二个列表的元素追加到第一个列表。
  list1->AddRange(list2);

  // 打印第一个列表的项。
  for (const auto item: list1)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
-5 15 1 8 10 20 30
*/
```

## 另见

* Class [Object](../../system/object/)
* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
