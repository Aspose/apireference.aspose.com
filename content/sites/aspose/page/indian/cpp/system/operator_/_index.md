---
title: "System::operator* method"
linktitle: "operator*"
second_title: "Aspose.Page C++ के लिए"
description: "System::operator* मेथड। C++ में निर्दिष्ट मान और निर्दिष्ट Decimal ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान के गुणनफल को दर्शाने वाला Decimal क्लास का नया इंस्टेंस लौटाता है।"
type: docs
weight: 27400
url: /hi/cpp/system/operator_/
---
## System::operator* method


निर्दिष्ट मान और निर्दिष्ट [Decimal](../decimal/) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान के गुणनफल को दर्शाने वाला [Decimal](../decimal/) क्लास का नया इंस्टेंस लौटाता है।

```cpp
template<typename T,typename _> Decimal System::operator*(const T &x, const Decimal &d)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | const T\& | पहला गुणक |
| d | const Decimal\& | दूसरे गुणक को दर्शाने वाला [Decimal](../decimal/) ऑब्जेक्ट |

### ReturnValue

[Decimal](../decimal/) क्लास का नया इंस्टेंस जो **x** के गुणनफल और **d** द्वारा प्रतिनिधित्व किए गए मान को दर्शाता है।

## संबंधित देखें

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
शीर्षक: System::operator< मेथड
लिंक शीर्षक: operator<
second_title: Aspose.Page for C++
विवरण: 'System::operator< method. निर्धारित करता है कि निर्दिष्ट मान निर्दिष्ट Nullable ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से कम है, इन मानों पर C++ में operator<() लागू करके।'
type: docs
वजन: 28600
यूआरएल: /cpp/system/operator_/
---
## System::operator<(const T1\&, const Nullable\<T2\>\&) method


निर्धारित करता है कि निर्दिष्ट मान निर्दिष्ट [Nullable](../nullable/) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से कम है, इन मानों पर [operator<()](./) लागू करके।

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<(const T1 &some, const Nullable<T2> &other)
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

सही यदि पहला तुल्यांक दूसरे तुल्यांक से कम है, अन्यथा - गलत

## संबंधित देखें

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<(std::nullptr_t, const DateTimeOffset &)
```

## संबंधित देखें

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const Nullable\<T\>\&) method


हमेशा false लौटाता है।

```cpp
template<typename T> bool System::operator<(std::nullptr_t, const Nullable<T> &)
```

## संबंधित देखें

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, DateTime) method




```cpp
bool System::operator<(std::nullptr_t, DateTime)
```

## संबंधित देखें

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<(std::nullptr_t, TimeSpan)
```

## संबंधित देखें

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
शीर्षक: System::operator> method
लिंक शीर्षक: operator>
second_title: Aspose.Page for C++
विवरण: 'System::operator> method. निर्धारित करता है कि निर्दिष्ट मान निर्दिष्ट Nullable ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से बड़ा है, इन मानों पर C++ में operator>() लागू करके।'
type: docs
वजन: 34100
यूआरएल: /cpp/system/operator_/
---
## System::operator>(const T1\&, const Nullable\<T2\>\&) method


निर्धारित करता है कि निर्दिष्ट मान निर्दिष्ट [Nullable](../nullable/) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से बड़ा है, इन मानों पर [operator>()](./) लागू करके।

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>(const T1 &some, const Nullable<T2> &other)
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

सही यदि पहला तुल्यांक दूसरे तुल्यांक से बड़ा है, अन्यथा - गलत

## संबंधित देखें

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>(std::nullptr_t, const DateTimeOffset &)
```

## संबंधित देखें

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const Nullable\<T\>\&) method


हमेशा false लौटाता है।

```cpp
template<typename T> bool System::operator>(std::nullptr_t, const Nullable<T> &)
```

## संबंधित देखें

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, DateTime) method




```cpp
bool System::operator>(std::nullptr_t, DateTime)
```

## संबंधित देखें

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>(std::nullptr_t, TimeSpan)
```

## संबंधित देखें

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
