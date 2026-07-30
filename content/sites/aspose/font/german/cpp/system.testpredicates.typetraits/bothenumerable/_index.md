---
title: "System::TestPredicates::TypeTraits::BothEnumerable-Typedef"
linktitle: "BothEnumerable"
second_title: "Aspose.Font für C++"
description: "System::TestPredicates::TypeTraits::BothEnumerable-Typedef. Prüft, ob beide Typargumente IEnumerable sind. Falls ja, wird das Member value auf true gesetzt, andernfalls auf false in C++."
type: docs
weight: 400
url: /de/cpp/system.testpredicates.typetraits/bothenumerable/
---
## BothEnumerable typedef


Überprüft, ob beide Typargumente IEnumerable sind. Wenn ja, wird das Member value auf true gesetzt, andernfalls wird es auf false gesetzt.

```cpp
using System::TestPredicates::TypeTraits::BothEnumerable =  std::integral_constant<bool, IsEnumerable<T1>::value && IsEnumerable<T2>::value>
```


## Siehe auch

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Font for C++](../../)
