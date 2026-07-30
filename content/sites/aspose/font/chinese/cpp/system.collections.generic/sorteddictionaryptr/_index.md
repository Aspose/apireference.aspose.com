---
title: "System::Collections::Generic::SortedDictionaryPtr 类"
linktitle: "SortedDictionaryPtr"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::SortedDictionaryPtr 类。具有访问运算符的排序字典指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值或 const 引用方式传递给函数，在 C++ 中使用。"
type: docs
weight: 4100
url: /zh/cpp/system.collections.generic/sorteddictionaryptr/
---
## SortedDictionaryPtr class


已排序字典指针，带访问运算符。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值或 const 引用方式传递给函数。

```cpp
template<typename T,typename V>class SortedDictionaryPtr : public System::SmartPtr<T0>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [operator[]](./operator[]/)(const T\&) const | 访问器函数。 |
| [SortedDictionaryPtr](./sorteddictionaryptr/)() | 构造空指针。 |
| [SortedDictionaryPtr](./sorteddictionaryptr/)(const SharedPtr\<SortedDictionary\<T, V\>\>\&) | 构造指向指定排序字典的指针。 |
## 另见

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
