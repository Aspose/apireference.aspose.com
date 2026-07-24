---
title: "System::TestPredicates::TypeTraits::BothEnumerable टाइपडिफ़"
linktitle: "BothEnumerable"
second_title: "Aspose.Page C++ के लिए"
description: "System::TestPredicates::TypeTraits::BothEnumerable टाइपडिफ़। जांचता है कि दोनों प्रकार तर्क IEnumerable हैं या नहीं। यदि हाँ, तो वैल्यू सदस्य को true सेट किया जाता है, अन्यथा C++ में false सेट किया जाता है।"
type: docs
weight: 400
url: /hi/cpp/system.testpredicates.typetraits/bothenumerable/
---
## BothEnumerable typedef


जाँचता है कि दोनों प्रकार तर्क IEnumerable हैं। यदि ऐसा है, तो वैल्यू सदस्य को true सेट किया जाता है, अन्यथा इसे false सेट किया जाता है।

```cpp
using System::TestPredicates::TypeTraits::BothEnumerable =  std::integral_constant<bool, IsEnumerable<T1>::value && IsEnumerable<T2>::value>
```


## संबंधित देखें

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
