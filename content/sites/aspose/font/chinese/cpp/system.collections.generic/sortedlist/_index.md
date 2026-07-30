---
title: "System::Collections::Generic::SortedList 类"
linktitle: "SortedList"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::SortedList 类。封装 FlatMap 结构的有序列表。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 4200
url: /zh/cpp/system.collections.generic/sortedlist/
---
## SortedList class


封装 FlatMap 结构的有序列表。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数参数中传递。

```cpp
template<typename TKey,typename TValue>class SortedList : public System::Collections::Generic::SortedListHelper<TKey, TValue>,
                                                          public System::Collections::Generic::BaseDictionary<Detail::FlatMap<TKey, TValue, ComparerAdapter<TKey>>>
```


| 参数 | 描述 |
| --- | --- |
| TKey | 密钥类型。 |
| TValue | 值类型。 |
## Nested classes

* Class [Enumerator](./enumerator/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [crbegin](./crbegin/)() const | 获取指向集合中最后一个 const 限定元素的逆向迭代器（逆向的第一个）。 |
| [crend](./crend/)() const | 获取指向集合起始之前的不存在的 const 限定元素的逆向迭代器。 |
| [get_Capacity](./get_capacity/)() const | 获取当前列表的容量。 |
| virtual [get_Keys](./get_keys/)() const | 访问键集合。 |
| virtual [get_Values](./get_values/)() const | 访问值集合。 |
| [GetEnumerator](./getenumerator/)() override | 获取遍历当前列表的枚举器。 |
| [IndexOfKey](./indexofkey/)(TKey) const | 查找特定键。 |
| [IndexOfValue](./indexofvalue/)(TValue) const | 查找特定值。 |
| [rbegin](./rbegin/)() | 获取指向集合中最后一个元素的逆向迭代器（逆向的第一个）。 |
| [rbegin](./rbegin/)() const | 获取指向 const 限定集合中最后一个元素的逆向迭代器（逆向的第一个）。 |
| [RemoveAt](./removeat/)(int) | 移除指定位置的项。 |
| [rend](./rend/)() | 获取指向集合起始之前的不存在的元素的逆向迭代器。 |
| [rend](./rend/)() const | 获取指向 const 限定集合起始之前的不存在的元素的逆向迭代器。 |
| [set_Capacity](./set_capacity/)(int) | 设置当前列表的容量。 |
| [SortedList](./sortedlist/)() | 构造空列表。 |
| [SortedList](./sortedlist/)(const SharedPtr\<IComparer\<TKey\>\>\&) | 构造空列表。 |
| [SortedList](./sortedlist/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | 拷贝构造函数。 |
| [SortedList](./sortedlist/)(const map_t\&) | 拷贝构造函数。 |
| [SortedList](./sortedlist/)(int) | 构造空列表。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [const_iterator](./const_iterator/) | 常量迭代器类型。 |
| [const_reverse_iterator](./const_reverse_iterator/) | 常量反向迭代器类型。 |
| [IEnumerablePtr](./ienumerableptr/) | 相同键值对类型的集合。 |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 类型。 |
| [iterator](./iterator/) | 迭代器类型。 |
| [KeyCollection](./keycollection/) | 键集合类型。 |
| [KVPair](./kvpair/) | 键值对类型。 |
| [map_t](./map_t/) | 底层数据类型。 |
| [Ptr](./ptr/) | 指针类型。 |
| [reverse_iterator](./reverse_iterator/) | 反向迭代器类型。 |
| [this_t](./this_t/) | 此类型。 |
| [ValueCollection](./valuecollection/) | 值集合类型。 |

## 另见

* Class [SortedListHelper](../sortedlisthelper/)
* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
