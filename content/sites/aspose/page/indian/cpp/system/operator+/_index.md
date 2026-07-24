---
title: "System::operator+ मेथड"
linktitle: "operator+"
second_title: "Aspose.Page C++ के लिए"
description: "System::operator+ मेथड. C++ में स्ट्रिंग संयोजन।"
type: docs
weight: 27500
url: /hi/cpp/system/operator+/
---
## System::operator+(const char_t, const String\&) method


[String](../string/) concatenation.

```cpp
String System::operator+(const char_t left, const String &right)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाएँ | const char_t | स्ट्रिंग में जोड़ने के लिए अक्षर। |
| right | const String\& | [String](../string/) जोड़ने के लिए। |

### ReturnValue

संयुक्त स्ट्रिंग।

## संबंधित देखें

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T\&, const Decimal\&) method


एक नया [Decimal](../decimal/) क्लास का इंस्टेंस लौटाता है जो निर्दिष्ट मान और निर्दिष्ट [Decimal](../decimal/) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान के योग को दर्शाता है।

```cpp
template<typename T,typename _> Decimal System::operator+(const T &x, const Decimal &d)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | const T\& | पहला योगफल |
| d | const Decimal\& | दूसरे योगफल का प्रतिनिधित्व करने वाले [Decimal](../decimal/) ऑब्जेक्ट का स्थिर रेफ़रेंस |

### ReturnValue

एक नया [Decimal](../decimal/) क्लास का इंस्टेंस जो **x** के योग और **d** द्वारा प्रतिनिधित्व किए गए मान को दर्शाता है।

## संबंधित देखें

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T1\&, const Nullable\<T2\>\&) method


नॉन-नल और नल योग्य मानों को जोड़ता है।

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some+other.get_Value())> System::operator+(const T1 &some, const Nullable<T2> &other)
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | बाएँ ऑपरेण्ड प्रकार। |
| T2 | दाएँ ऑपरेण्ड प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुछ | const T1\& | बाएँ ऑपरेण्ड। |
| अन्य | const Nullable\<T2\>\& | दाएँ ऑपरेण्ड। |

### ReturnValue

जोड़ने का परिणाम।

## संबंधित देखें

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


सभी कॉलबैक को दाएँ हाथ के डेलीगेट से बाएँ हाथ के डेलीगेट कॉलबैक सूची के अंत तक जोड़ता है।

```cpp
template<typename T> MulticastDelegate<T> System::operator+(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | डेलीगेट जिसमें कॉलबैक जोड़े जाते हैं। |
| rhv | MulticastDelegate\<T\> | डेलीगेट जिसके कॉलबैक जोड़े जा रहे हैं। |

### ReturnValue

एक डेलीगेट लौटाता है जिसमें बाएँ हाथ के मान के कॉलबैक और फिर दाएँ हाथ के कॉलबैक होते हैं।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringLiteral<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [String](../string/) लिटरल प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाएँ | T\& | स्ट्रिंग से जोड़ने के लिए लिटरल। |
| right | const String\& | [String](../string/) जोड़ने के लिए। |

### ReturnValue

संयुक्त स्ट्रिंग।

## संबंधित देखें

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringPointer<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [String](../string/) पॉइंटर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| left | T\& | [String](../string/) स्ट्रिंग से जोड़ने के लिए पॉइंटर। |
| right | const String\& | [String](../string/) जोड़ने के लिए। |

### ReturnValue

संयुक्त स्ट्रिंग।

## संबंधित देखें

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
