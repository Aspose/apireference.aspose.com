---
title: "System::TestPredicates::TypeTraits::IsList typedef"
linktitle: "IsList"
second_title: "Aspose.Page 适用于 C++"
description: "System::TestPredicates::TypeTraits::IsList typedef。检查类型是否为 System::Collections::Generic::List 的特化。如果是，则 value 成员设为 true，否则在 C++ 中设为 false。"
type: docs
weight: 600
url: /zh/cpp/system.testpredicates.typetraits/islist/
---
## IsList typedef


检查类型是否为 [System::Collections::Generic::List](../../system.collections.generic/list/) 的特化。如果是，则 value 成员设为 true，否则设为 false。

```cpp
using System::TestPredicates::TypeTraits::IsList =  std::is_same<T, System::Collections::Generic::List<typename T::ValueType>>
```


## 另见

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
