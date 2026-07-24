---
title: "System::TestPredicates::TypeTraits::BothEnumerable typedef"
linktitle: "BothEnumerable"
second_title: "C++용 Aspose.Page"
description: "System::TestPredicates::TypeTraits::BothEnumerable typedef. 두 타입 인수가 모두 IEnumerable인지 확인합니다. 그렇다면 value 멤버가 true로 설정되고, 그렇지 않으면 C++에서 false로 설정됩니다."
type: docs
weight: 400
url: /ko/cpp/system.testpredicates.typetraits/bothenumerable/
---
## BothEnumerable typedef


두 형식 인수가 모두 IEnumerable인지 확인합니다. 그렇다면 value 멤버를 true로 설정하고, 그렇지 않으면 false로 설정합니다.

```cpp
using System::TestPredicates::TypeTraits::BothEnumerable =  std::integral_constant<bool, IsEnumerable<T1>::value && IsEnumerable<T2>::value>
```


## 또 보기

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
