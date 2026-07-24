---
title: "System::TestPredicates::TypeTraits::BothArrayOrList typedef"
linktitle: "BothArrayOrList"
second_title: "C++ 用 Aspose.Page"
description: "System::TestPredicates::TypeTraits::BothArrayOrList typedef。両方の型引数が配列またはリストかどうかをチェックします。もしそうであれば、value メンバーは true に設定され、そうでなければ C++ では false に設定されます。"
type: docs
weight: 300
url: /ja/cpp/system.testpredicates.typetraits/botharrayorlist/
---
## BothArrayOrList typedef


両方の型引数が配列またはリストであるかをチェックします。該当する場合、value メンバーは true に設定され、そうでない場合は false に設定されます。

```cpp
using System::TestPredicates::TypeTraits::BothArrayOrList =  std::integral_constant<bool, (IsArray<T1>::value || IsList<T1>::value) && (IsArray<T2>::value || IsList<T2>::value)>
```


## 参照

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
