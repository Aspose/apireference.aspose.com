---
title: "System::Collections::Generic::_KeyList 类"
linktitle: "_KeyList"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::_KeyList 类。实现字典键的列表。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 200
url: /zh/cpp/system.collections.generic/_keylist/
---
## _KeyList class


实现字典键的列表。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename Dict>class _KeyList : public System::Collections::Generic::_KeyCollection<Dict>
```


| 参数 | 描述 |
| --- | --- |
| Dict | [Dictionary](../dictionary/) 类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [_KeyList](./_keylist/)(const typename Dict::Ptr\&) | 初始化引用指定字典的集合。 |
| [Contains](./contains/)(const TKey\&) const override | 检查指定键是否存在于集合中。 |
| [idx_get](./idx_get/)(int) const override | 在指定位置获取键。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [TKey](./tkey/) | 密钥类型。 |

## 另见

* Class [_KeyCollection](../_keycollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
