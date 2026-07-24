---
title: "System::TestPredicates::TypeTraits::BothArrayOrList typedef"
linktitle: "BothArrayOrList"
second_title: "Aspose.Page για C++"
description: "System::TestPredicates::TypeTraits::BothArrayOrList typedef. Ελέγχει εάν και τα δύο ορίσματα τύπου είναι πίνακες ή λίστες. Εάν ναι, το μέλος value ορίζεται σε true, διαφορετικά ορίζεται σε false σε C++."
type: docs
weight: 300
url: /el/cpp/system.testpredicates.typetraits/botharrayorlist/
---
## BothArrayOrList typedef


Ελέγχει αν και τα δύο ορίσματα τύπου είναι πίνακες ή λίστες. Εάν ναι, το μέλος τιμής ορίζεται σε true, διαφορετικά ορίζεται σε false.

```cpp
using System::TestPredicates::TypeTraits::BothArrayOrList =  std::integral_constant<bool, (IsArray<T1>::value || IsList<T1>::value) && (IsArray<T2>::value || IsList<T2>::value)>
```


## Δείτε επίσης

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
