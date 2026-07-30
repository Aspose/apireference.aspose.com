---
title: "System::Collections::Specialized::StringCollection 类"
linktitle: "StringCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Specialized::StringCollection 类。字符串的索引列表。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 300
url: /zh/cpp/system.collections.specialized/stringcollection/
---
## StringCollection class


字符串的索引列表。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class StringCollection : public System::Collections::Generic::IEnumerable<System::String>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const System::String\&) | 在列表末尾添加值。 |
| [AddRange](./addrange/)(const ArrayPtr\<System::String\>\&) | 向容器中添加元素。 |
| [begin](./begin/)() | 返回指向容器第一个元素的迭代器。如果容器为空，返回的迭代器将等于 [end()](./end/)。 |
| [begin](./begin/)() const | 返回指向 const 限定容器第一个元素的迭代器。如果容器为空，返回的迭代器将等于 [end()](./end/)。 |
| [cbegin](./cbegin/)() const | 返回指向容器第一个 const 限定元素的迭代器。如果容器为空，返回的迭代器将等于 [cend()](./cend/)。 |
| [cend](./cend/)() const | 返回指向容器最后一个元素之后的元素的迭代器。该元素充当占位符；尝试访问它会导致未定义行为。 |
| [Clear](./clear/)() | 删除所有元素。 |
| [Contains](./contains/)(const System::String\&) const | 检查容器中是否存在特定字符串。 |
| [CopyTo](./copyto/)(const ArrayPtr\<System::String\>\&, const int32_t) const | 将元素复制到现有数组元素中。 |
| [crbegin](./crbegin/)() const | 返回指向反向容器第一个元素的逆向迭代器。它对应于未反转容器的最后一个元素。如果容器为空，返回的迭代器等于 [crend()](./crend/)。 |
| [crend](./crend/)() const | 返回指向反向容器最后一个元素之后的元素的逆向迭代器。它对应于未反转容器的第一个元素之前的元素。该元素充当占位符，尝试访问它会导致未定义行为。 |
| [data](./data/)() | 内部数据结构访问器。 |
| [data](./data/)() const | 内部数据结构访问器。 |
| [end](./end/)() | 返回指向容器最后一个元素之后的元素的迭代器。该元素充当占位符；尝试访问它会导致未定义行为。 |
| [end](./end/)() const | 返回指向 const 限定容器最后一个元素之后的元素的迭代器。该元素充当占位符；尝试访问它会导致未定义行为。 |
| [get_Count](./get_count/)() const | 获取集合中的元素数量。 |
| [GetEnumerator](./getenumerator/)() override | 获取遍历当前集合的枚举器。 |
| [idx_get](./idx_get/)(int) const | 获取指定位置的值。 |
| [idx_set](./idx_set/)(int, const System::String\&) | 设置指定位置的值。 |
| [IndexOf](./indexof/)(const System::String\&) const | 在容器中查找特定字符串。 |
| [Insert](./insert/)(int, const System::String\&) | 向容器中插入特定值。 |
| [operator[]](./operator[]/)(int) | 访问器函数。 |
| [rbegin](./rbegin/)() | 返回指向反转容器中第一个元素的反向迭代器。它对应于未反转容器的最后一个元素。如果容器为空，返回的迭代器等于 [rend()](./rend/)。 |
| [rbegin](./rbegin/)() const | 返回指向反转容器中第一个元素的反向迭代器。它对应于未反转容器的最后一个元素。如果容器为空，返回的迭代器等于 [rend()](./rend/)。 |
| [Remove](./remove/)(const System::String\&) | 移除指定字符串的第一次出现。 |
| [RemoveAt](./removeat/)(int) | 移除指定位置的元素。 |
| [rend](./rend/)() | 返回指向反向容器最后一个元素之后的元素的逆向迭代器。它对应于未反转容器的第一个元素之前的元素。该元素充当占位符，尝试访问它会导致未定义行为。 |
| [rend](./rend/)() const | 返回指向反向容器最后一个元素之后的元素的逆向迭代器。它对应于未反转容器的第一个元素之前的元素。该元素充当占位符，尝试访问它会导致未定义行为。 |
| [StringCollection](./stringcollection/)() | 构造空字符串集合。 |
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
| [reverse_iterator](./reverse_iterator/) | 反向迭代器类型。 |
## 另见

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Font for C++](../../)
