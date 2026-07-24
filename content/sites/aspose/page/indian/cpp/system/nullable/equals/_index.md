---
title: "System::Nullable::Equals मेथड"
linktitle: "बराबर"
second_title: "Aspose.Page C++ के लिए"
description: "System::Nullable::Equals मेथड. निर्धारित करता है कि वर्तमान वस्तु द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट Nullable वस्तु द्वारा प्रतिनिधित्व किए गए मान के बराबर है या नहीं C++ में।"
type: docs
weight: 200
url: /hi/cpp/system/nullable/equals/
---
## Nullable::Equals method


निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया मान निर्दिष्ट [Nullable](../) ऑब्जेक्ट द्वारा दर्शाए गए मान के बराबर है या नहीं।

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | निर्दिष्ट [Nullable](../) वस्तु के साथ तुलना करने के लिए आधारभूत प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | const T1\& | निर्दिष्ट [Nullable](../) वस्तु के साथ तुलना करने के लिए एक स्थिर संदर्भ |

### ReturnValue

यदि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया मान निर्दिष्ट [Nullable](../) ऑब्जेक्ट द्वारा दर्शाए गए मान के बराबर है तो सत्य, अन्यथा - असत्य

## संबंधित देखें

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
