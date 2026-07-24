---
title: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef"
linktitle: "AnyOfDecimal"
second_title: "Aspose.Page για C++"
description: "System::TestPredicates::TypeTraits::AnyOfDecimal typedef. Ελέγχει ότι τουλάχιστον ένα από τα ορίσματα τύπου είναι System::Decimal. Εάν ναι, ορίζει το μέλος value σε true, διαφορετικά είναι false σε C++."
type: docs
weight: 100
url: /el/cpp/system.testpredicates.typetraits/anyofdecimal/
---
## AnyOfDecimal typedef


Ελέγχει ότι τουλάχιστον ένα από τα ορίσματα τύπου είναι [System::Decimal](../../system/decimal/). Εάν ναι, ορίζει το μέλος value σε true, διαφορετικά είναι false.

```cpp
using System::TestPredicates::TypeTraits::AnyOfDecimal =  std::integral_constant<bool, std::is_same<T1, System::Decimal>::value || std::is_same<T2, System::Decimal>::value>
```


## Δείτε επίσης

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
