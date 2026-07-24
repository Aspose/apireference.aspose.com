---
title: "System::TestPredicates::TypeTraits::BothArrayOrList typedef"
linktitle: "BothArrayOrList"
second_title: "Aspose.Page 适用于 C++"
description: "System::TestPredicates::TypeTraits::BothArrayOrList typedef。检查两个类型参数是否都是数组或列表。如果是，则 value 成员设为 true，否则在 C++ 中设为 false。"
type: docs
weight: 300
url: /zh/cpp/system.testpredicates.typetraits/botharrayorlist/
---
## BothArrayOrList typedef


检查两个类型参数是否都是数组或列表。如果是，则 value 成员设为 true，否则设为 false。

```cpp
using System::TestPredicates::TypeTraits::BothArrayOrList =  std::integral_constant<bool, (IsArray<T1>::value || IsList<T1>::value) && (IsArray<T2>::value || IsList<T2>::value)>
```


## 另见

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
