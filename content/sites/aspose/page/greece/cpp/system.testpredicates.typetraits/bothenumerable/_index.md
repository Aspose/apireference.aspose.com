---
title: "System::TestPredicates::TypeTraits::BothEnumerable typedef"
linktitle: "BothEnumerable"
second_title: "Aspose.Page για C++"
description: "System::TestPredicates::TypeTraits::BothEnumerable typedef. Ελέγχει εάν και τα δύο ορίσματα τύπου είναι IEnumerable. Εάν ναι, το μέλος value ορίζεται σε true, διαφορετικά ορίζεται σε false σε C++."
type: docs
weight: 400
url: /el/cpp/system.testpredicates.typetraits/bothenumerable/
---
## BothEnumerable typedef


Ελέγχει αν και τα δύο ορίσματα τύπου είναι IEnumerable. Εάν ναι, το μέλος τιμής ορίζεται σε true, διαφορετικά ορίζεται σε false.

```cpp
using System::TestPredicates::TypeTraits::BothEnumerable =  std::integral_constant<bool, IsEnumerable<T1>::value && IsEnumerable<T2>::value>
```


## Δείτε επίσης

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
