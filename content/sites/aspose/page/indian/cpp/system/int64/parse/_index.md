---
title: "System::Int64::Parse method"
linktitle: "Parse"
second_title: "Aspose.Page C++ के लिए"
description: "System::Int64::Parse method. C++ में निर्दिष्ट स्ट्रिंग को, जिसमें संख्या का स्ट्रिंग प्रतिनिधित्व है, समकक्ष 64-बिट साइन्ड इंटीजर में परिवर्तित करता है।"
type: docs
weight: 100
url: /hi/cpp/system/int64/parse/
---
## Int64::Parse(const String\&) method


निर्दिष्ट स्ट्रिंग, जिसमें संख्या का स्ट्रिंग प्रतिनिधित्व है, को समकक्ष 64-बिट साइन्ड इंटीजर में परिवर्तित करता है।

```cpp
static int64_t System::Int64::Parse(const String &value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | परिवर्तित करने के लिए स्ट्रिंग। |

### ReturnValue

निर्दिष्ट स्ट्रिंग द्वारा दर्शाए गए संख्या के बराबर 64-बिट साइन्ड इंटीजर।

## संबंधित देखें

* Class [String](../../string/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) method




```cpp
static int64_t System::Int64::Parse(const String &value, const SharedPtr<Globalization::CultureInfo> &culture)
```

## संबंधित देखें

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) method




```cpp
static int64_t System::Int64::Parse(const String &value, const SharedPtr<Globalization::NumberFormatInfo> &nfi)
```

## संबंधित देखें

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&) method


निर्दिष्ट स्ट्रिंग, जिसमें संख्या का स्ट्रिंग प्रतिनिधित्व है, को प्रदान की गई फ़ॉर्मेटिंग जानकारी का उपयोग करके समकक्ष 64-बिट साइन्ड इंटीजर में परिवर्तित करता है।

```cpp
static int64_t System::Int64::Parse(const String &value, const SharedPtr<IFormatProvider> &provider)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | परिवर्तित करने के लिए स्ट्रिंग। |
| प्रदाता | const SharedPtr\<IFormatProvider\>\& | एक पॉइंटर जो उस ऑब्जेक्ट की ओर इशारा करता है जिसमें स्ट्रिंग फ़ॉर्मेट जानकारी होती है। |

### ReturnValue

निर्दिष्ट स्ट्रिंग द्वारा दर्शाए गए संख्या के बराबर 64-बिट साइन्ड इंटीजर।

## संबंधित देखें

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) method




```cpp
static int64_t System::Int64::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture)
```

## संबंधित देखें

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) method




```cpp
static int64_t System::Int64::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi)
```

## संबंधित देखें

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) method


निर्दिष्ट स्ट्रिंग, जिसमें संख्या का स्ट्रिंग प्रतिनिधित्व है, को प्रदान की गई फ़ॉर्मेटिंग जानकारी और नंबर स्टाइल का उपयोग करके समकक्ष 64-बिट साइन्ड इंटीजर में परिवर्तित करता है।

```cpp
static int64_t System::Int64::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | परिवर्तित करने के लिए स्ट्रिंग। |
| शैलियाँ | Globalization::NumberStyles | NumberStyles एनम के मानों का बिटवाइज़ संयोजन जो संख्या के स्ट्रिंग प्रतिनिधित्व की अनुमत शैली निर्दिष्ट करता है। |
| प्रदाता | const SharedPtr\<IFormatProvider\>\& | एक पॉइंटर जो उस ऑब्जेक्ट की ओर इशारा करता है जिसमें स्ट्रिंग फ़ॉर्मेट जानकारी होती है। |

### ReturnValue

निर्दिष्ट स्ट्रिंग द्वारा दर्शाए गए संख्या के बराबर 64-बिट साइन्ड इंटीजर।

## संबंधित देखें

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, Globalization::NumberStyles, std::nullptr_t) method




```cpp
static int64_t System::Int64::Parse(const String &value, Globalization::NumberStyles styles, std::nullptr_t=nullptr)
```

## संबंधित देखें

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, std::nullptr_t) method




```cpp
static int64_t System::Int64::Parse(const String &value, std::nullptr_t)
```

## संबंधित देखें

* Class [String](../../string/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
