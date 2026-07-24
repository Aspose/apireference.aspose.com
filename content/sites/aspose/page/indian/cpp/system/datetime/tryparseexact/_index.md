---
title: "System::DateTime::TryParseExact मेथड"
linktitle: "TryParseExact"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::DateTime क्लास के TryParseExact मेथड का उपयोग कैसे करें।"
type: docs
weight: 7000
url: /hi/cpp/system/datetime/tryparseexact/
---
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## संबंधित देखें

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## संबंधित देखें

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


निर्दिष्ट फ़ॉर्मैट, सांस्कृतिक-विशिष्ट फ़ॉर्मैट जानकारी और शैली का उपयोग करके तिथि और समय मान के निर्दिष्ट स्ट्रिंग प्रतिनिधित्व को समकक्ष [DateTime](../) ऑब्जेक्ट में परिवर्तित करता है। स्ट्रिंग प्रतिनिधित्व का फ़ॉर्मैट एक या अधिक निर्दिष्ट फ़ॉर्मैट्स से बिल्कुल मेल खाना चाहिए।

```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | const String\& | रूपांतरण के लिए तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व। |
| फ़ॉर्मेट्स | const ArrayPtr\<String\>\& | स्ट्रिंग फ़ॉर्मैट्स की सरणी। |
| provider | const SharedPtr\<IFormatProvider\>\& | वह [IFormatProvider](../../iformatprovider/) ऑब्जेक्ट जो संस्कृति-विशिष्ट फ़ॉर्मेट जानकारी प्रदान करता है। |
| styles | Globalization::DateTimeStyles | एक बिटवाइज़ संयोजन जो **s** के बारे में अतिरिक्त जानकारी, **s** में मौजूद हो सकने वाले शैली तत्वों, या **s** से एक [DateTime](../) ऑब्जेक्ट में रूपांतरण के बारे में प्रदान करता है। |
| परिणाम | DateTime\& | आउटपुट आर्ग्यूमेंट जो, यदि रूपांतरण सफल होता है, तो रूपांतरण का परिणाम रखता है। |

### ReturnValue

यदि रूपांतरण सफल हो तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## संबंधित देखें

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## संबंधित देखें

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## संबंधित देखें

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


निर्दिष्ट फ़ॉर्मैट, सांस्कृतिक-विशिष्ट फ़ॉर्मैट जानकारी और शैली का उपयोग करके तिथि और समय मान के निर्दिष्ट स्ट्रिंग प्रतिनिधित्व को समकक्ष [DateTime](../) ऑब्जेक्ट में परिवर्तित करता है। स्ट्रिंग प्रतिनिधित्व का फ़ॉर्मैट निर्दिष्ट फ़ॉर्मैट से बिल्कुल मेल खाना चाहिए।

```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | const String\& | रूपांतरण के लिए तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व। |
| फ़ॉर्मेट | const String\& | स्ट्रिंग फ़ॉर्मेट। |
| provider | const SharedPtr\<IFormatProvider\>\& | वह [IFormatProvider](../../iformatprovider/) ऑब्जेक्ट जो संस्कृति-विशिष्ट फ़ॉर्मेट जानकारी प्रदान करता है। |
| styles | Globalization::DateTimeStyles | एक बिटवाइज़ संयोजन जो **s** के बारे में अतिरिक्त जानकारी, **s** में मौजूद हो सकने वाले शैली तत्वों, या **s** से एक [DateTime](../) ऑब्जेक्ट में रूपांतरण के बारे में प्रदान करता है। |
| परिणाम | DateTime\& | आउटपुट आर्ग्यूमेंट जो, यदि रूपांतरण सफल होता है, तो रूपांतरण का परिणाम रखता है। |

### ReturnValue

यदि रूपांतरण सफल हो तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## संबंधित देखें

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
