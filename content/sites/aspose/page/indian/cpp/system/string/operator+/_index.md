---
title: "System::String::operator+ मेथड"
linktitle: "operator+"
second_title: "Aspose.Page C++ के लिए"
description: "System::String::operator+ मेथड। C++ में स्ट्रिंग के अंत में कैरेक्टर जोड़ता है।"
type: docs
weight: 2800
url: /hi/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


स्ट्रिंग के अंत में कैरेक्टर जोड़ता है।

```cpp
String System::String::operator+(char_t x) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | char_t | जोड़ने के लिए कैरेक्टर। |

### ReturnValue

[String](../) concatenation result.

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | [String](../) को वर्तमान के अंत में जोड़ने के लिए। |

### ReturnValue

संयुक्त स्ट्रिंग।

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T | स्ट्रिंग लिटरल या कैरेक्टर स्ट्रिंग पॉइंटर रूपों में से एक। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg | const T\& | वर्तमान स्ट्रिंग के साथ संयोजित करने के लिए एंटिटी। |

### ReturnValue

संयुक्त स्ट्रिंग।

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


स्ट्रिंग के अंत में रेफ़रेंस टाइप ऑब्जेक्ट की स्ट्रिंग प्रतिनिधित्व जोड़ता है।

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T | पॉइंटर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) को स्ट्रिंग में बदलने के लिए [ToString()](../tostring/) कॉल का उपयोग करके और वर्तमान स्ट्रिंग में जोड़ने के लिए। |

### ReturnValue

[String](../) concatenation result.

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


स्ट्रिंग के अंत में वैल्यू टाइप ऑब्जेक्ट स्ट्रिंग प्रतिनिधित्व जोड़ता है।

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [ToString()](../tostring/) को कॉल करने के लिए वैल्यू टाइप। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) को स्ट्रिंग में बदलने के लिए [ToString()](../tostring/) कॉल का उपयोग करके और वर्तमान स्ट्रिंग में जोड़ने के लिए। |

### ReturnValue

[String](../) concatenation result.

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(double) const method


स्ट्रिंग के अंत में फ्लोटिंग पॉइंट मान की स्ट्रिंग प्रतिनिधित्व जोड़ता है।

```cpp
String System::String::operator+(double d) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| d | डबल | स्ट्रिंग में बदलने और जोड़ने के लिए वैल्यू। |

### ReturnValue

[String](../) concatenation result.

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int) const method


स्ट्रिंग के अंत में पूर्णांक मान की स्ट्रिंग प्रतिनिधित्व जोड़ता है।

```cpp
String System::String::operator+(int i) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| i | int | स्ट्रिंग में बदलने और जोड़ने के लिए पूर्णांक वैल्यू। |

### ReturnValue

[String](../) concatenation result.

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int64_t) const method


स्ट्रिंग के अंत में पूर्णांक मान की स्ट्रिंग प्रतिनिधित्व जोड़ता है।

```cpp
String System::String::operator+(int64_t v) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| v | int64_t | स्ट्रिंग में बदलने और जोड़ने के लिए वैल्यू। |

### ReturnValue

[String](../) concatenation result.

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(T) const method


स्ट्रिंग के अंत में बूलियन मान की स्ट्रिंग प्रतिनिधित्व जोड़ता है।

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T | स्ट्रिंग के साथ संयोजित करने के लिए वैल्यू टाइप। Must be bool |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg | T | [Boolean](../../boolean/) को स्ट्रिंग में बदलने और जोड़ने के लिए वैल्यू। |

### ReturnValue

[String](../) concatenation result.

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(uint32_t) const method


स्ट्रिंग के अंत में अनसाइन्ड पूर्णांक मान की स्ट्रिंग प्रतिनिधित्व जोड़ता है।

```cpp
String System::String::operator+(uint32_t i) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| i | uint32_t | स्ट्रिंग में बदलने और जोड़ने के लिए वैल्यू। |

### ReturnValue

[String](../) concatenation result.

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
