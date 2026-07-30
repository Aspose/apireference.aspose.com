---
title: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef"
linktitle: "AreFPandArithmetic"
second_title: "Aspose.Font 适用于 C++"
description: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef。检查 T1 是否为算术类型且 T2 为浮点类型，或反之。如果满足，则将 value 成员设为 true，否则在 C++ 中为 false。"
type: docs
weight: 200
url: /zh/cpp/system.testpredicates.typetraits/arefpandarithmetic/
---
## AreFPandArithmetic typedef


检查 **T1** 是否为算术类型且 **T2** 为浮点类型，或反之。如果是，则将 value 成员设置为 true，否则为 false。

```cpp
using System::TestPredicates::TypeTraits::AreFPandArithmetic =  std::integral_constant<bool, (std::is_floating_point<T1>::value && std::is_arithmetic<T2>::value) || (std::is_arithmetic<T1>::value && std::is_floating_point<T2>::value) >
```


## 另见

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
