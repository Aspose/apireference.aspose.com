---
title: "System::TestPredicates::TypeTraits::AreFPandArithmetic typedef"
linktitle: "AreFPandArithmetic"
second_title: "Aspose.Page untuk C++"
description: "typedef System::TestPredicates::TypeTraits::AreFPandArithmetic. Memeriksa bahwa T1 bersifat aritmetika dan T2 adalah titik mengambang, atau sebaliknya. Jika ya, mengatur anggota nilai ke true, jika tidak menjadi false dalam C++."
type: docs
weight: 200
url: /id/cpp/system.testpredicates.typetraits/arefpandarithmetic/
---
## AreFPandArithmetic typedef


Memeriksa bahwa **T1** bersifat aritmetika dan **T2** bertipe floating point, atau sebaliknya. Jika ya, mengatur anggota nilai menjadi true, jika tidak menjadi false.

```cpp
using System::TestPredicates::TypeTraits::AreFPandArithmetic =  std::integral_constant<bool, (std::is_floating_point<T1>::value && std::is_arithmetic<T2>::value) || (std::is_arithmetic<T1>::value && std::is_floating_point<T2>::value) >
```


## Lihat Juga

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
