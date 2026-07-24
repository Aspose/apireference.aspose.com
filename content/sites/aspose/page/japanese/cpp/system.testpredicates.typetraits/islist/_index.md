---
title: "System::TestPredicates::TypeTraits::IsList typedef"
linktitle: "IsList"
second_title: "C++ 用 Aspose.Page"
description: "System::TestPredicates::TypeTraits::IsList typedef。型が System::Collections::Generic::List の特殊化かどうかをチェックします。もしそうであれば、value メンバーは true に設定され、そうでなければ C++ では false に設定されます。"
type: docs
weight: 600
url: /ja/cpp/system.testpredicates.typetraits/islist/
---
## IsList typedef


型が [System::Collections::Generic::List](../../system.collections.generic/list/) の特殊化かどうかをチェックします。もしそうであれば、value メンバーは true に設定され、そうでなければ false に設定されます。

```cpp
using System::TestPredicates::TypeTraits::IsList =  std::is_same<T, System::Collections::Generic::List<typename T::ValueType>>
```


## 参照

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
