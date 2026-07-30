---
title: "System::Collections::Generic::BaseSet 类"
linktitle: "BaseSet"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Collections::Generic::BaseSet 类。"
type: docs
weight: 800
url: /zh/cpp/system.collections.generic/baseset/
---
## BaseSet class




```cpp
template<typename T,typename SET_T>class BaseSet : public virtual System::Object,
                                                   public System::Collections::Generic::ICollection<T>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | 特定于 C++。 |
| [Add](./add/)(const T\&) override | 向集合中添加元素。 |
| [begin](./begin/)() const | 获取指向 const 限定集合的第一个元素的迭代器。 |
| [cbegin](./cbegin/)() const | 获取指向集合的第一个 const 限定元素的迭代器。 |
| [cend](./cend/)() const | 获取指向集合末尾之后的不存在的 const 限定元素的迭代器。 |
| [Clear](./clear/)() override | 删除集合中的所有元素。 |
| [Contains](./contains/)(const T\&) const override | 检查元素是否存在于集合中。 |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | 将哈希内容复制到现有数组元素中。 |
| [data](./data/)() | 底层数据结构访问器。 |
| [data](./data/)() const | 底层数据结构访问器。 |
| [end](./end/)() const | 获取指向 const 限定集合末尾之后的不存在的元素的迭代器。 |
| [get_Count](./get_count/)() const override | 获取集合中的元素数量。 |
| [GetEnumerator](./getenumerator/)() override | 创建枚举器。 |
| [Remove](./remove/)(const T\&) override | 从集合中移除元素。 |
| [TryAdd](./tryadd/)(const T\&) | 向集合中添加元素。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取当前容器的 begin const 迭代器的实现。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取当前容器的 begin 迭代器的实现。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取当前容器的 end const 迭代器的实现。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取当前容器的 end 迭代器的实现。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [BaseType](./basetype/) | 实现的接口。 |
| [const_iterator](./const_iterator/) | 常量迭代器类型。 |
| [IEnumerablePtr](./ienumerableptr/) | 可枚举接口指针。 |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 指针。 |
| [iterator](./iterator/) | 迭代器类型。 |
| [set_t](./set_t/) | 底层数据类型。 |
| [ThisPtr](./thisptr/) | 指针类型。 |
| [ThisType](./thistype/) | 自身类型。 |
| [ValueType](./valuetype/) | 值类型。 |
## 另见

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
