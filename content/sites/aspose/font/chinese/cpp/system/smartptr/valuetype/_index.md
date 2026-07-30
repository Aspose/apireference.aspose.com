---
title: "System::SmartPtr::ValueType typedef"
linktitle: "ValueType"
second_title: "Aspose.Font 适用于 C++"
description: "System::SmartPtr::ValueType typedef。指向数组的存储类型。仅当 T 是 System::Array 在 C++ 中的特化时才有意义。"
type: docs
weight: 4100
url: /zh/cpp/system/smartptr/valuetype/
---
## ValueType typedef


指向数组的存储类型。仅当 T 是 [System::Array](../../array/) 的特化时才有意义。

```cpp
using System::SmartPtr< T >::ValueType =  typename System::Details::SelectType<typename System::Details::ArrayTypeResolver<T>::value_type>::type
```

## 另见

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
