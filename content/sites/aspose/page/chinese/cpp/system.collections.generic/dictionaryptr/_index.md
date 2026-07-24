---
title: "System::Collections::Generic::DictionaryPtr 类"
linktitle: "DictionaryPtr"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::Generic::DictionaryPtr 类。带有运算符重载的字典指针类。此类型是用于管理其他对象删除的指针。它应在栈上分配，并在 C++ 中以值或 const 引用方式传递给函数。"
type: docs
weight: 1300
url: /zh/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<Dictionary<T, V>>
```


| Parameter | 描述 |
| --- | --- |
| T | 密钥类型。 |
| V | 值类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | 初始化空指针。 |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | 转换指针类型。 |
| [operator[]](./operator[]/)(const X\&) const | 访问运算符，用于处理键类型转换。 |
| [operator[]](./operator[]/)(const T\&) const | 访问运算符。 |

## 另见

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
