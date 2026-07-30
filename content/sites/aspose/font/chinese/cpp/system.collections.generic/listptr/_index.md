---
title: "System::Collections::Generic::ListPtr 类"
linktitle: "ListPtr"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::ListPtr 类。具有访问运算符的列表指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值传递或在 C++ 中以 const 引用方式传递给函数。"
type: docs
weight: 3500
url: /zh/cpp/system.collections.generic/listptr/
---
## ListPtr class


[List](../list/) pointer with access operators. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class ListPtr : public System::SmartPtr<T0>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ListPtr](./listptr/)(std::nullptr_t) | 初始化空指针。 |
| [ListPtr](./listptr/)(const SharedPtr\<List\<T\>\>\&) | 初始化指向指定列表的指针。 |
| [operator==](./operator==/)(std::nullptr_t) const | 检查 [List](../list/) 指针是否为空。 |
| [operator[]](./operator[]/)(int) | 访问器。 |
| [operator[]](./operator[]/)(int) const | 访问器。 |
## 另见

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
