---
title: "System::Collections::Generic::_KeyCollection 类"
linktitle: "_KeyCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::_KeyCollection 类。Dictionary 的键集合。引用集合，不复制任何内容。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 100
url: /zh/cpp/system.collections.generic/_keycollection/
---
## _KeyCollection class


[Dictionary](../dictionary/) 的键集合。引用集合，不复制任何内容。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename Dict>class _KeyCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::key_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [_KeyCollection](./_keycollection/)(const typename Dict::Ptr\&) | 初始化引用指定字典的集合。 |
| [Contains](./contains/)(const TKey\&) const override | 检查容器中是否存在该项。 |
| [GetEnumerator](./getenumerator/)() override | 获取遍历键的枚举器。 |
| [idx_get](./idx_get/)(int) const override | 实现了 [IList](../ilist/) 方法。不受支持。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取当前容器的 begin const 迭代器的实现。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取当前容器的 begin 迭代器的实现。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取当前容器的 end const 迭代器的实现。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取当前容器的 end 迭代器的实现。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [TKey](./tkey/) | 密钥类型。 |

## 另见

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
