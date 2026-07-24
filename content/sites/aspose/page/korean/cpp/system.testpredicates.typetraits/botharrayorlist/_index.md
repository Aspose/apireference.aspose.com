---
title: "System::TestPredicates::TypeTraits::BothArrayOrList typedef"
linktitle: "BothArrayOrList"
second_title: "C++용 Aspose.Page"
description: "System::TestPredicates::TypeTraits::BothArrayOrList typedef. 두 타입 인수가 모두 배열이거나 리스트인지 확인합니다. 그렇다면 value 멤버가 true로 설정되고, 그렇지 않으면 C++에서 false로 설정됩니다."
type: docs
weight: 300
url: /ko/cpp/system.testpredicates.typetraits/botharrayorlist/
---
## BothArrayOrList typedef


두 형식 인수가 모두 배열이거나 리스트인지 확인합니다. 그렇다면 value 멤버를 true로 설정하고, 그렇지 않으면 false로 설정합니다.

```cpp
using System::TestPredicates::TypeTraits::BothArrayOrList =  std::integral_constant<bool, (IsArray<T1>::value || IsList<T1>::value) && (IsArray<T2>::value || IsList<T2>::value)>
```


## 또 보기

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
