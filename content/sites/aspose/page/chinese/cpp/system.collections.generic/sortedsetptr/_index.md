---
title: "System::Collections::Generic::SortedSetPtr 类"
linktitle: "SortedSetPtr"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::Generic::SortedSetPtr 类。用于保持 SortedSet 引用的指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并在 C++ 中以值传递或 const 引用方式传递给函数。"
type: docs
weight: 4500
url: /zh/cpp/system.collections.generic/sortedsetptr/
---
## SortedSetPtr class


用于保持 [SortedSet](../sortedset/) 引用的指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值传递或 const 引用方式传递给函数。

```cpp
template<typename T>class SortedSetPtr : public System::SmartPtr<SortedSet<T>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [SortedSetPtr](./sortedsetptr/)() | 空指针构造函数。 |
| [SortedSetPtr](./sortedsetptr/)(const SharedPtr\<SortedSet\<T\>\>\&) | 拷贝构造函数。 |

## 另见

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
