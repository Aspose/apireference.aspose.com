---
title: "System::operator<= विधि"
linktitle: "operator<="
second_title: "Aspose.Page C++ के लिए"
description: "System::operator<= विधि। निर्दिष्ट मान को निर्दिष्ट Nullable ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से कम या बराबर है या नहीं, यह operator<=() को इन मानों पर लागू करके C++ में निर्धारित करता है।"
type: docs
weight: 31900
url: /hi/cpp/system/operator_=/
---
## System::operator<=(const T1\&, const Nullable\<T2\>\&) method


निर्दिष्ट मान को निर्दिष्ट [Nullable](../nullable/) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से कम या बराबर है या नहीं, यह [operator<=()](./) को इन मानों पर लागू करके निर्धारित करता है।

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<=(const T1 &some, const Nullable<T2> &other)
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | पहले तुलना मान का प्रकार |
| T2 | दूसरे तुलना मान का प्रतिनिधित्व करने वाले [Nullable](../nullable/) ऑब्जेक्ट का अंतर्निहित प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुछ | const T1\& | पहले तुलना मान के रूप में उपयोग किए जाने वाले मान का एक स्थिर संदर्भ |
| other | const Nullable\<T2\>\& | दूसरे तुलना मान के रूप में उपयोग किए जाने वाले प्रतिनिधित्व मान वाले [Nullable](../nullable/) ऑब्जेक्ट का एक स्थिर संदर्भ |

### ReturnValue

यदि पहला तुल्यांक दूसरा तुल्यांक से कम या बराबर है तो सत्य, अन्यथा - असत्य

## संबंधित देखें

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<=(std::nullptr_t, const DateTimeOffset &)
```

## संबंधित देखें

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, const Nullable\<T\>\&) method


हमेशा false लौटाता है।

```cpp
template<typename T> bool System::operator<=(std::nullptr_t, const Nullable<T> &)
```

## संबंधित देखें

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, DateTime) method




```cpp
bool System::operator<=(std::nullptr_t, DateTime)
```

## संबंधित देखें

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<=(std::nullptr_t, TimeSpan)
```

## संबंधित देखें

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
title: System::operator>= विधि
लिंकशीर्षक: operator>=
second_title: Aspose.Page for C++
description: 'System::operator>= विधि। निर्दिष्ट मान को निर्दिष्ट Nullable ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से बड़ा या बराबर है या नहीं, यह operator>=() को इन मानों पर लागू करके C++ में निर्धारित करता है।'
type: docs
वजन: 34600
url: /cpp/system/operator_=/
---
## System::operator>=(const T1\&, const Nullable\<T2\>\&) method


निर्दिष्ट मान को निर्दिष्ट [Nullable](../nullable/) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से बड़ा या बराबर है या नहीं, यह [operator>=()](./) को इन मानों पर लागू करके निर्धारित करता है।

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>=(const T1 &some, const Nullable<T2> &other)
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | पहले तुलना मान का प्रकार |
| T2 | दूसरे तुलना मान का प्रतिनिधित्व करने वाले [Nullable](../nullable/) ऑब्जेक्ट का अंतर्निहित प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुछ | const T1\& | पहले तुलना मान के रूप में उपयोग किए जाने वाले मान का एक स्थिर संदर्भ |
| other | const Nullable\<T2\>\& | दूसरे तुलना मान के रूप में उपयोग किए जाने वाले प्रतिनिधित्व मान वाले [Nullable](../nullable/) ऑब्जेक्ट का एक स्थिर संदर्भ |

### ReturnValue

यदि पहला तुल्यांक दूसरा तुल्यांक से बड़ा या बराबर है तो सत्य, अन्यथा - असत्य

## संबंधित देखें

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>=(std::nullptr_t, const DateTimeOffset &)
```

## संबंधित देखें

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, const Nullable\<T\>\&) method


हमेशा false लौटाता है।

```cpp
template<typename T> bool System::operator>=(std::nullptr_t, const Nullable<T> &)
```

## संबंधित देखें

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, DateTime) method




```cpp
bool System::operator>=(std::nullptr_t, DateTime)
```

## संबंधित देखें

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>=(std::nullptr_t, TimeSpan)
```

## संबंधित देखें

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
