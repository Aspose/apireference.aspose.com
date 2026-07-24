---
title: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef"
linktitle: "AnyOfDecimal"
second_title: "C++ 用 Aspose.Page"
description: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef。少なくとも一方の型引数が System::Decimal であるかをチェックします。もしそうであれば、value メンバーは true に設定され、そうでなければ C++ では false になります。"
type: docs
weight: 100
url: /ja/cpp/system.testpredicates.typetraits/anyofdecimal/
---
## AnyOfDecimal typedef


少なくとも一方の型引数が [System::Decimal](../../system/decimal/) であるかをチェックします。もしそうであれば、value メンバーは true に設定され、そうでなければ false に設定されます。

```cpp
using System::TestPredicates::TypeTraits::AnyOfDecimal =  std::integral_constant<bool, std::is_same<T1, System::Decimal>::value || std::is_same<T2, System::Decimal>::value>
```


## 参照

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
