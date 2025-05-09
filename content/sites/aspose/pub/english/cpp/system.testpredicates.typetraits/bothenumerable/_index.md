---
title: System::TestPredicates::TypeTraits::BothEnumerable typedef
linktitle: BothEnumerable
second_title: Aspose.PUB for C++
description: 'System::TestPredicates::TypeTraits::BothEnumerable typedef. Checks if both type arguments are IEnumerable. If so, value member is set to true, otherwise it is set to false in C++.'
type: docs
weight: 400
url: /cpp/system.testpredicates.typetraits/bothenumerable/
---
## BothEnumerable typedef


Checks if both type arguments are IEnumerable. If so, value member is set to true, otherwise it is set to false.

```cpp
using System::TestPredicates::TypeTraits::BothEnumerable =  std::integral_constant<bool, IsEnumerable<T1>::value && IsEnumerable<T2>::value>
```


## See Also

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.PUB for C++](../../)
