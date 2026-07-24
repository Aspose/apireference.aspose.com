---
title: "System::TestPredicates::TypeTraits::AnyOfDecimal टाइपडिफ़"
linktitle: "AnyOfDecimal"
second_title: "Aspose.Page C++ के लिए"
description: "System::TestPredicates::TypeTraits::AnyOfDecimal टाइपडिफ़। जांचता है कि कम से कम एक प्रकार तर्क System::Decimal है। यदि हाँ, तो वैल्यू सदस्य को true सेट करता है, अन्यथा C++ में false रहता है।"
type: docs
weight: 100
url: /hi/cpp/system.testpredicates.typetraits/anyofdecimal/
---
## AnyOfDecimal typedef


जांचता है कि कम से कम एक प्रकार तर्क [System::Decimal](../../system/decimal/) है। यदि हाँ, तो वैल्यू सदस्य को true सेट करता है, अन्यथा false रहता है।

```cpp
using System::TestPredicates::TypeTraits::AnyOfDecimal =  std::integral_constant<bool, std::is_same<T1, System::Decimal>::value || std::is_same<T2, System::Decimal>::value>
```


## संबंधित देखें

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
