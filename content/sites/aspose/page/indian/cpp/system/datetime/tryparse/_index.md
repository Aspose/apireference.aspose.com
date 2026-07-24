---
title: "System::DateTime::TryParse मेथड"
linktitle: "TryParse"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::DateTime क्लास के TryParse मेथड का उपयोग कैसे करें।"
type: docs
weight: 6900
url: /hi/cpp/system/datetime/tryparse/
---
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
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
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
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
## DateTime::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


निर्दिष्ट स्ट्रिंग प्रतिनिधित्व को निर्दिष्ट सांस्कृतिक-विशिष्ट फ़ॉर्मेट जानकारी और शैली का उपयोग करके समतुल्य [DateTime](../) ऑब्जेक्ट में परिवर्तित करता है।

```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | const String\& | रूपांतरण के लिए तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व। |
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
## DateTime::TryParse(const String\&, DateTime\&) method


निर्दिष्ट स्ट्रिंग प्रतिनिधित्व को एक तिथि और समय मान का समान [DateTime](../) ऑब्जेक्ट में परिवर्तित करता है।

```cpp
static bool System::DateTime::TryParse(const String &s, DateTime &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | const String\& | रूपांतरण के लिए तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व। |
| परिणाम | DateTime\& | आउटपुट आर्ग्यूमेंट जो, यदि रूपांतरण सफल होता है, तो रूपांतरण का परिणाम रखता है। |

### ReturnValue

यदि रूपांतरण सफल हो तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../../string/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## संबंधित देखें

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
