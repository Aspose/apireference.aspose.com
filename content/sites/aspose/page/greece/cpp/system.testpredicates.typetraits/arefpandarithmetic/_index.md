---
title: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef"
linktitle: "AreFPandArithmetic"
second_title: "Aspose.Page για C++"
description: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef. Ελέγχει ότι το T1 είναι αριθμητικό και το T2 είναι κινητής υποδιαστολής, ή το αντίστροφο. Εάν ναι, ορίζει το μέλος value σε true, διαφορετικά είναι false σε C++."
type: docs
weight: 200
url: /el/cpp/system.testpredicates.typetraits/arefpandarithmetic/
---
## AreFPandArithmetic typedef


Ελέγχει ότι το **T1** είναι αριθμητικό και το **T2** είναι κινητής υποδιαστολής, ή αντίστροφα. Εάν ναι, ορίζει το μέλος τιμής σε true, διαφορετικά είναι false.

```cpp
using System::TestPredicates::TypeTraits::AreFPandArithmetic =  std::integral_constant<bool, (std::is_floating_point<T1>::value && std::is_arithmetic<T2>::value) || (std::is_arithmetic<T1>::value && std::is_floating_point<T2>::value) >
```


## Δείτε επίσης

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
