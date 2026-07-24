---
title: "System::TestPredicates::TypeTraits::IsArray typedef"
linktitle: "IsArray"
second_title: "C++ 用 Aspose.Page"
description: "System::TestPredicates::TypeTraits::IsArray typedef。型が System::Array の特殊化かどうかをチェックします。もしそうであれば、value メンバーは true に設定され、そうでなければ C++ では false に設定されます。"
type: docs
weight: 500
url: /ja/cpp/system.testpredicates.typetraits/isarray/
---
## IsArray typedef


型が [System::Array](../../system/array/) の特殊化かどうかをチェックします。もしそうであれば、value メンバーは true に設定され、そうでなければ false に設定されます。

```cpp
using System::TestPredicates::TypeTraits::IsArray =  std::is_same<T, System::Array<typename T::ValueType>>
```


## 参照

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
