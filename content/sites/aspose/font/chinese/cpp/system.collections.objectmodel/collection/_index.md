---
title: "System::Collections::ObjectModel::Collection class"
linktitle: "集合"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::ObjectModel::Collection 类。通用集合的基类型。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 100
url: /zh/cpp/system.collections.objectmodel/collection/
---
## Collection class


通用集合的基类型。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<class T>class Collection : public System::Collections::Generic::IList<T>
```


| 参数 | 描述 |
| --- | --- |
| T | 元素类型。 |
## Nested classes

* Class [reverse_iterator_prototype](./reverse_iterator_prototype/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const T\&) override | 向容器添加值。 |
| [Clear](./clear/)() override | 删除所有元素。 |
| [Collection](./collection/)() | 创建空集合。 |
| [Collection](./collection/)(SharedPtr\<Generic::IList\<T\>\>) |  |
| [Contains](./contains/)(const T\&) const override | 检查集合中是否存在该项。 |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | 将集合元素复制到现有数组元素中。 |
| [crbegin](./crbegin/)() const | 获取指向集合中最后一个 const 限定元素的逆向迭代器（逆向的第一个）。 |
| [crend](./crend/)() const | 获取指向集合起始之前的不存在的 const 限定元素的逆向迭代器。 |
| [get_Count](./get_count/)() const override | 获取元素数量。 |
| [get_Items](./get_items/)() | 内部数据结构访问器。 |
| [get_Items](./get_items/)() const | 内部数据结构访问器。 |
| [GetEnumerator](./getenumerator/)() override | 获取用于遍历集合的枚举器。 |
| [idx_get](./idx_get/)(int) const override | 获取指定索引处的值。 |
| [idx_set](./idx_set/)(int, T) override | 在指定索引处设置值。 |
| [IndexOf](./indexof/)(const T\&) const override | 在集合中查找元素。 |
| [Insert](./insert/)(int, const T\&) override | 在指定位置插入项目。 |
| [operator[]](./operator[]/)(int) | 获取指定索引处的值。 |
| [operator[]](./operator[]/)(int) const | 获取指定索引处的值。 |
| [rbegin](./rbegin/)() | 获取指向集合中最后一个元素的逆向迭代器（逆向的第一个）。 |
| [rbegin](./rbegin/)() const | 获取指向 const 限定集合中最后一个元素的逆向迭代器（逆向的第一个）。 |
| [Remove](./remove/)(const T\&) override | 移除特定项。 |
| [RemoveAt](./removeat/)(int) override | 在特定位置移除项目。 |
| [rend](./rend/)() | 获取指向集合起始之前的不存在的元素的逆向迭代器。 |
| [rend](./rend/)() const | 获取指向 const 限定集合起始之前的不存在的元素的逆向迭代器。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 将存储的指针设为弱引用（如果适用）。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取当前容器的 begin const 迭代器的实现。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取当前容器的 begin 迭代器的实现。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取当前容器的 end const 迭代器的实现。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取当前容器的 end 迭代器的实现。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [const_reverse_iterator](./const_reverse_iterator/) |  |
| [reverse_iterator](./reverse_iterator/) |  |

## 另见

* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Font for C++](../../)
