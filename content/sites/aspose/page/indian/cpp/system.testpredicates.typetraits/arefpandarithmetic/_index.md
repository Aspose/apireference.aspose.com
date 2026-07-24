---
title: "System::TestPredicates::TypeTraits::AreFPandArithmetic टाइपडिफ़"
linktitle: "AreFPandArithmetic"
second_title: "Aspose.Page C++ के लिए"
description: "System::TestPredicates::TypeTraits::AreFPandArithmetic टाइपडिफ़। जांचता है कि T1 अंकगणितीय है और T2 फ्लोटिंग पॉइंट है, या इसके विपरीत। यदि हाँ, तो वैल्यू सदस्य को true सेट करता है, अन्यथा C++ में false रहता है।"
type: docs
weight: 200
url: /hi/cpp/system.testpredicates.typetraits/arefpandarithmetic/
---
## AreFPandArithmetic typedef


जाँचता है कि **T1** अंकगणितीय है और **T2** फ्लोटिंग पॉइंट है, या इसके विपरीत। यदि ऐसा है, तो वैल्यू सदस्य को true सेट करता है, अन्यथा यह false रहता है।

```cpp
using System::TestPredicates::TypeTraits::AreFPandArithmetic =  std::integral_constant<bool, (std::is_floating_point<T1>::value && std::is_arithmetic<T2>::value) || (std::is_arithmetic<T1>::value && std::is_floating_point<T2>::value) >
```


## संबंधित देखें

* Namespace [System::TestPredicates::TypeTraits](../)
* Library [Aspose.Page for C++](../../)
