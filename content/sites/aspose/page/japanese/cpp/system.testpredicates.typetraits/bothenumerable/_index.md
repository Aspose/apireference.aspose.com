---
title: "System::TestPredicates::TypeTraits::BothEnumerable typedef"
linktitle: "BothEnumerable"
second_title: "C++ 用 Aspose.Page"
description: "System::TestPredicates::TypeTraits::BothEnumerable typedef。両方の型引数が IEnumerable かどうかをチェックします。もしそうであれば、value メンバーは true に設定され、そうでなければ C++ では false に設定されます。"
type: docs
weight: 400
url: /ja/cpp/system.testpredicates.typetraits/bothenumerable/
---
## BothEnumerable typedef


両方の型引数が IEnumerable であるかをチェックします。該当する場合、value メンバーは true に設定され、そうでない場合は false に設定されます。

```cpp
using System::TestPredicates::TypeTraits::BothEnumerable =  std::integral_constant<bool, IsEnumerable<T1>::value && IsEnumerable<T2>::value>
```


## 参照

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
