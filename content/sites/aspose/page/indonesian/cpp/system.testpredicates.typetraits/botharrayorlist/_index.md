---
title: "System::TestPredicates::TypeTraits::BothArrayOrList typedef"
linktitle: "BothArrayOrList"
second_title: "Aspose.Page untuk C++"
description: "typedef System::TestPredicates::TypeTraits::BothArrayOrList. Memeriksa apakah kedua argumen tipe adalah array atau list. Jika ya, anggota nilai disetel ke true, jika tidak disetel ke false dalam C++."
type: docs
weight: 300
url: /id/cpp/system.testpredicates.typetraits/botharrayorlist/
---
## BothArrayOrList typedef


Memeriksa apakah kedua argumen tipe adalah array atau list. Jika ya, anggota nilai diatur menjadi true, jika tidak menjadi false.

```cpp
using System::TestPredicates::TypeTraits::BothArrayOrList =  std::integral_constant<bool, (IsArray<T1>::value || IsList<T1>::value) && (IsArray<T2>::value || IsList<T2>::value)>
```


## Lihat Juga

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
