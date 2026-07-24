---
title: "System::TestPredicates::TypeTraits::BothArrayOrList typedef"
linktitle: "BothArrayOrList"
second_title: "Aspose.Page voor C++"
description: "System::TestPredicates::TypeTraits::BothArrayOrList typedef. Controleert of beide type‑argumenten arrays of lijsten zijn. Indien ja, wordt het waarde‑lid op true gezet, anders wordt het op false gezet in C++."
type: docs
weight: 300
url: /nl/cpp/system.testpredicates.typetraits/botharrayorlist/
---
## BothArrayOrList typedef


Controleert of beide type‑argumenten arrays of lijsten zijn. Indien ja, wordt het waarde‑lid op true gezet, anders op false.

```cpp
using System::TestPredicates::TypeTraits::BothArrayOrList =  std::integral_constant<bool, (IsArray<T1>::value || IsList<T1>::value) && (IsArray<T2>::value || IsList<T2>::value)>
```


## Zie ook

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
