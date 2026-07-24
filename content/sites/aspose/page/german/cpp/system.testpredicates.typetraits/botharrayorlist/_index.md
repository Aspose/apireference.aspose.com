---
title: "System::TestPredicates::TypeTraits::BothArrayOrList typedef"
linktitle: "BothArrayOrList"
second_title: "Aspose.Page für C++"
description: "System::TestPredicates::TypeTraits::BothArrayOrList typedef. Prüft, ob beide Typargumente Arrays oder Listen sind. Falls ja, wird das value-Mitglied auf true gesetzt, andernfalls auf false in C++."
type: docs
weight: 300
url: /de/cpp/system.testpredicates.typetraits/botharrayorlist/
---
## BothArrayOrList typedef


Prüft, ob beide Typargumente Arrays oder Listen sind. Falls ja, wird das Werte‑Mitglied auf true gesetzt, andernfalls auf false.

```cpp
using System::TestPredicates::TypeTraits::BothArrayOrList =  std::integral_constant<bool, (IsArray<T1>::value || IsList<T1>::value) && (IsArray<T2>::value || IsList<T2>::value)>
```


## Siehe auch

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
