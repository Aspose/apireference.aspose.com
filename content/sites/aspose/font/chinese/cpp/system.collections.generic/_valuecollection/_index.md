---
title: "System::Collections::Generic::_ValueCollection 类"
linktitle: "_ValueCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::_ValueCollection 类。Dictionary 的值集合。引用集合，不进行任何复制。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 300
url: /zh/cpp/system.collections.generic/_valuecollection/
---
## _ValueCollection class


对 [Dictionary](../dictionary/) 的值集合。引用集合，不进行任何复制。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename Dict>class _ValueCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::mapped_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [_ValueCollection](./_valuecollection/)(const typename Dict::Ptr\&) | 初始化引用指定字典的集合。 |
| [Contains](./contains/)(const TValue\&) const override | 检查容器中是否存在该项。 |
| [GetEnumerator](./getenumerator/)() override | 获取遍历值的枚举器。 |
| [idx_get](./idx_get/)(int) const override | 实现了 [IList](../ilist/) 方法。不受支持。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取当前容器的 begin const 迭代器的实现。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取当前容器的 begin 迭代器的实现。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取当前容器的 end const 迭代器的实现。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取当前容器的 end 迭代器的实现。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [TValue](./tvalue/) | 值类型。 |

## 另见

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
