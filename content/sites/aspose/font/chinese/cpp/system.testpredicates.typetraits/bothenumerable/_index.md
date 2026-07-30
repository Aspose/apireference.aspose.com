---
title: "System::TestPredicates::TypeTraits::BothEnumerable typedef"
linktitle: "BothEnumerable"
second_title: "Aspose.Font 适用于 C++"
description: "System::TestPredicates::TypeTraits::BothEnumerable typedef。检查两个类型参数是否都是 IEnumerable。如果是，则 value 成员设为 true，否则在 C++ 中设为 false。"
type: docs
weight: 400
url: /zh/cpp/system.testpredicates.typetraits/bothenumerable/
---
## BothEnumerable typedef


检查两个类型参数是否都是 IEnumerable。如果是，则将 value 成员设置为 true，否则设置为 false。

```cpp
using System::TestPredicates::TypeTraits::BothEnumerable =  std::integral_constant<bool, IsEnumerable<T1>::value && IsEnumerable<T2>::value>
```


## 另见

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
