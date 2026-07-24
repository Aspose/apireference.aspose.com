---
title: "System::TestPredicates::TypeTraits::BothArrayOrList टाइपडिफ़"
linktitle: "BothArrayOrList"
second_title: "Aspose.Page C++ के लिए"
description: "System::TestPredicates::TypeTraits::BothArrayOrList टाइपडिफ़। जांचता है कि दोनों प्रकार तर्क एरे या लिस्ट हैं या नहीं। यदि हाँ, तो वैल्यू सदस्य को true सेट किया जाता है, अन्यथा C++ में false सेट किया जाता है।"
type: docs
weight: 300
url: /hi/cpp/system.testpredicates.typetraits/botharrayorlist/
---
## BothArrayOrList typedef


जाँचता है कि दोनों प्रकार तर्क एरे या सूची हैं। यदि ऐसा है, तो वैल्यू सदस्य को true सेट किया जाता है, अन्यथा इसे false सेट किया जाता है।

```cpp
using System::TestPredicates::TypeTraits::BothArrayOrList =  std::integral_constant<bool, (IsArray<T1>::value || IsList<T1>::value) && (IsArray<T2>::value || IsList<T2>::value)>
```


## संबंधित देखें

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
