---
title: "System::SmartPtr::ValueType typedef"
linktitle: "ValueType"
second_title: "C++ 用 Aspose.Page"
description: "System::SmartPtr::ValueType typedef。指し示す配列の格納型です。C++ で T が System::Array の特殊化である場合にのみ意味があります。"
type: docs
weight: 4100
url: /ja/cpp/system/smartptr/valuetype/
---
## ValueType typedef


指し示す配列の格納型です。T が [System::Array](../../array/) の特殊化である場合にのみ意味があります。

```cpp
using System::SmartPtr< T >::ValueType =  typename System::Details::SelectType<typename System::Details::ArrayTypeResolver<T>::value_type>::type
```

## 参照

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
