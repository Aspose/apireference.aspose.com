---
title: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef"
linktitle: "AreFPandArithmetic"
second_title: "C++용 Aspose.Page"
description: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef. T1이 산술형이고 T2가 부동 소수점형이거나 그 반대인지 확인합니다. 그렇다면 value 멤버를 true로 설정하고, 그렇지 않으면 C++에서 false로 설정합니다."
type: docs
weight: 200
url: /ko/cpp/system.testpredicates.typetraits/arefpandarithmetic/
---
## AreFPandArithmetic typedef


**T1**이 산술형이고 **T2**가 부동소수점형인지, 혹은 그 반대인지 확인합니다. 그렇다면 value 멤버를 true로 설정하고, 그렇지 않으면 false로 설정합니다.

```cpp
using System::TestPredicates::TypeTraits::AreFPandArithmetic =  std::integral_constant<bool, (std::is_floating_point<T1>::value && std::is_arithmetic<T2>::value) || (std::is_arithmetic<T1>::value && std::is_floating_point<T2>::value) >
```


## 또 보기

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
