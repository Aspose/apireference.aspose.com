---
title: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef"
linktitle: "AnyOfDecimal"
second_title: "Aspose.Font 适用于 C++"
description: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef。检查至少有一个类型参数是 System::Decimal。如果是，则将 value 成员设为 true，否则在 C++ 中为 false。"
type: docs
weight: 100
url: /zh/cpp/system.testpredicates.typetraits/anyofdecimal/
---
## AnyOfDecimal typedef


检查至少有一个类型参数是 [System::Decimal](../../system/decimal/)。如果是，则将 value 成员设为 true，否则为 false。

```cpp
using System::TestPredicates::TypeTraits::AnyOfDecimal =  std::integral_constant<bool, std::is_same<T1, System::Decimal>::value || std::is_same<T2, System::Decimal>::value>
```


## 另见

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
