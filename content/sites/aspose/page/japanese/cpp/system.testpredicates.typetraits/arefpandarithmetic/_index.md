---
title: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef"
linktitle: "AreFPandArithmetic"
second_title: "C++ 用 Aspose.Page"
description: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef。T1 が算術型で T2 が浮動小数点型、またはその逆であるかをチェックします。もしそうであれば、value メンバーは true に設定され、そうでなければ C++ では false になります。"
type: docs
weight: 200
url: /ja/cpp/system.testpredicates.typetraits/arefpandarithmetic/
---
## AreFPandArithmetic typedef


**T1** が算術型で **T2** が浮動小数点型であるか、またはその逆であることをチェックします。該当する場合、value メンバーを true に設定し、そうでない場合は false に設定します。

```cpp
using System::TestPredicates::TypeTraits::AreFPandArithmetic =  std::integral_constant<bool, (std::is_floating_point<T1>::value && std::is_arithmetic<T2>::value) || (std::is_arithmetic<T1>::value && std::is_floating_point<T2>::value) >
```


## 参照

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
