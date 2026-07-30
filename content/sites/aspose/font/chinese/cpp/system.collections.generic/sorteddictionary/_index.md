---
title: "System::Collections::Generic::SortedDictionary 类"
linktitle: "SortedDictionary"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::SortedDictionary 类。SortedDictionary 类型在 C++ 中的前向声明。"
type: docs
weight: 4000
url: /zh/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


已排序字典类型前向声明。

```cpp
template<typename TKey,typename TValue>class SortedDictionary : public System::Collections::Generic::BaseDictionary<std::map<TKey, TValue, ComparerAdapter<BasePointerType<TKey>::type>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
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
| [get_Comparer](./get_comparer/)() const | 获取用于对 SortedDictionary<TKey,TValue> 元素进行排序的 [IComparer<TKey>](../icomparer/)。 |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | 单例访问器函数。 |
| [GetEnumerator](./getenumerator/)() override | 获取枚举器以遍历当前字典。 |
| [rbegin](./rbegin/)() | 获取指向集合中最后一个元素的逆向迭代器（逆向的第一个）。 |
| [rbegin](./rbegin/)() const | 获取指向 const 限定集合中最后一个元素的逆向迭代器（逆向的第一个）。 |
| [rend](./rend/)() | 获取指向集合起始之前的不存在的元素的逆向迭代器。 |
| [rend](./rend/)() const | 获取指向 const 限定集合起始之前的不存在的元素的逆向迭代器。 |
| [SortedDictionary](./sorteddictionary/)() | 构造空字典。 |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | 构造空字典。 |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | 拷贝构造函数。 |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | 拷贝构造函数。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [const_iterator](./const_iterator/) | 常量迭代器类型。 |
| [const_reverse_iterator](./const_reverse_iterator/) | 常量反向迭代器类型。 |
| [IEnumerablePtr](./ienumerableptr/) | 相同元素的集合。 |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 类型。 |
| [iterator](./iterator/) | 迭代器类型。 |
| [KeyCollection](./keycollection/) | 键集合类型。 |
| [KVPair](./kvpair/) | 键值对类型。 |
| [map_t](./map_t/) | 底层数据类型。 |
| [Ptr](./ptr/) | 指针类型。 |
| [reverse_iterator](./reverse_iterator/) | 反向迭代器类型。 |
| [this_t](./this_t/) | 自身类型。 |
| [ValueCollection](./valuecollection/) | 值集合类型。 |
## 备注


包装 STL map 的已排序字典类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
