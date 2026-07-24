---
title: "System::Nullable::NullableBoolHelper मेथड"
linktitle: "NullableBoolHelper"
second_title: "Aspose.Page C++ के लिए"
description: "System::Nullable::NullableBoolHelper मेथड. यह हेल्पर फ़ंक्शन जांचता है कि **this** और **other** दोनों नल नहीं हैं और यदि ऐसा है तो एक लैम्ब्डा को कॉल करता है। C++ में implementation.s में उपयोग किया जाता है।"
type: docs
weight: 800
url: /hi/cpp/system/nullable/nullableboolhelper/
---
## Nullable::NullableBoolHelper method


यह और **other** दोनों का null न होना जांचने के लिए सहायक फ़ंक्शन और यदि ऐसा है तो एक लैम्ब्डा को कॉल करता है। implementation.s में उपयोग किया जाता है।

```cpp
template<typename T1> bool System::Nullable<T>::NullableBoolHelper(const T1 &other, const std::function<bool()> &f, bool default_if_both_are_null=false) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | अन्य nullable प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| अन्य | const T1\& | तुलना करने के लिए अन्य nullable मान। |
| f | const std::function\<bool()>\& | यदि दोनों **this** और **other** नल नहीं हैं तो कॉल करने के लिए लैम्ब्डा। |
| default_if_both_are_null | bool | यदि दोनों मान नल हैं तो लौटाने वाला मान। |

### ReturnValue

यदि **this** या **other** में से कोई भी नल है तो false; यदि दोनों नल हैं तो **default_if_both_are_null**; यदि दोनों नल नहीं हैं तो **f** कॉल का परिणाम।

## संबंधित देखें

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
