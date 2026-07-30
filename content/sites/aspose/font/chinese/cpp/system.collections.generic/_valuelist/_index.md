---
title: "System::Collections::Generic::_ValueList 类"
linktitle: "_ValueList"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::_ValueList 类。实现字典值的列表。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 400
url: /zh/cpp/system.collections.generic/_valuelist/
---
## _ValueList class


实现字典值的列表。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename Dict>class _ValueList : public System::Collections::Generic::_ValueCollection<Dict>
```


| 参数 | 描述 |
| --- | --- |
| Dict | [Dictionary](../dictionary/) 类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [_ValueList](./_valuelist/)(const typename Dict::Ptr\&) | 初始化引用指定字典的集合。 |
| virtual [idx_get](./idx_get/)(int) const | 获取指定位置的值。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [TValue](./tvalue/) | 值类型。 |

## 另见

* Class [_ValueCollection](../_valuecollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
