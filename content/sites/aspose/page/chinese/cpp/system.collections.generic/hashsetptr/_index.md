---
title: "System::Collections::Generic::HashSetPtr 类"
linktitle: "HashSetPtr"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::Generic::HashSetPtr 类。用于保持 HashSet 引用的指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值传递或 const 引用方式传递给 C++ 函数。"
type: docs
weight: 1800
url: /zh/cpp/system.collections.generic/hashsetptr/
---
## HashSetPtr class


用于保持 [HashSet](../hashset/) 引用的指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值传递或 const 引用方式传递给函数。

```cpp
template<typename T>class HashSetPtr : public System::SmartPtr<HashSet<T>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [HashSetPtr](./hashsetptr/)() | 空指针构造函数。 |
| [HashSetPtr](./hashsetptr/)(const SharedPtr\<HashSet\<T\>\>\&) | 拷贝构造函数。 |

## 另见

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
