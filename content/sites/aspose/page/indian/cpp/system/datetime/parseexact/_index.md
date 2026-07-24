---
title: "System::DateTime::ParseExact मेथड"
linktitle: "ParseExact"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::DateTime क्लास के ParseExact मेथड का उपयोग कैसे करें।"
type: docs
weight: 6700
url: /hi/cpp/system/datetime/parseexact/
---
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles)
```

## संबंधित देखें

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles)
```

## संबंधित देखें

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


निर्दिष्ट फ़ॉर्मेट, सांस्कृतिक-विशिष्ट फ़ॉर्मेट जानकारी और शैली का उपयोग करके तिथि और समय मान की निर्दिष्ट स्ट्रिंग प्रतिनिधित्व को समकक्ष [DateTime](../) ऑब्जेक्ट में परिवर्तित करता है। स्ट्रिंग प्रतिनिधित्व का फ़ॉर्मेट ठीक उसी तरह होना चाहिए जैसा कि एक या अधिक निर्दिष्ट फ़ॉर्मेट्स में है। यदि रूपांतरण विफल होता है तो एक अपवाद फेंकता है।

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | const String\& | रूपांतरण के लिए तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व। |
| फ़ॉर्मेट्स | const ArrayPtr\<String\>\& | स्ट्रिंग फ़ॉर्मैट्स की सरणी। |
| provider | const SharedPtr\<IFormatProvider\>\& | वह [IFormatProvider](../../iformatprovider/) ऑब्जेक्ट जो संस्कृति-विशिष्ट फ़ॉर्मेट जानकारी प्रदान करता है। |
| styles | Globalization::DateTimeStyles | एक बिटवाइज़ संयोजन जो **s** के बारे में अतिरिक्त जानकारी, **s** में मौजूद हो सकने वाले शैली तत्वों, या **s** से एक [DateTime](../) ऑब्जेक्ट में रूपांतरण के बारे में प्रदान करता है। |

### ReturnValue

एक नया [DateTime](../) क्लास का उदाहरण जो निर्दिष्ट स्ट्रिंग द्वारा प्रतिनिधित्व किए गए तिथि और समय मान के बराबर मान को दर्शाता है।

## संबंधित देखें

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::DateTimeStyles styles)
```

## संबंधित देखें

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## संबंधित देखें

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## संबंधित देखें

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


निर्दिष्ट फ़ॉर्मेट और संस्कृति-विशिष्ट फ़ॉर्मेट जानकारी का उपयोग करके तिथि और समय मान के निर्दिष्ट स्ट्रिंग प्रतिनिधित्व को समतुल्य [DateTime](../) ऑब्जेक्ट में परिवर्तित करता है। स्ट्रिंग प्रतिनिधित्व का फ़ॉर्मेट बिल्कुल निर्दिष्ट फ़ॉर्मेट से मेल खाना चाहिए। यदि रूपांतरण विफल होता है तो एक अपवाद फेंका जाता है।

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | const String\& | रूपांतरण के लिए तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व। |
| फ़ॉर्मेट | const String\& | स्ट्रिंग फ़ॉर्मेट। |
| provider | const SharedPtr\<IFormatProvider\>\& | वह [IFormatProvider](../../iformatprovider/) ऑब्जेक्ट जो संस्कृति-विशिष्ट फ़ॉर्मेट जानकारी प्रदान करता है। |
| styles | Globalization::DateTimeStyles | एक बिटवाइज़ संयोजन जो **s** के बारे में अतिरिक्त जानकारी, **s** में मौजूद हो सकने वाले शैली तत्वों, या **s** से एक [DateTime](../) ऑब्जेक्ट में रूपांतरण के बारे में प्रदान करता है। |

### ReturnValue

एक नया [DateTime](../) क्लास का उदाहरण जो निर्दिष्ट स्ट्रिंग द्वारा प्रतिनिधित्व किए गए तिथि और समय मान के बराबर मान को दर्शाता है।

## संबंधित देखें

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## संबंधित देखें

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
