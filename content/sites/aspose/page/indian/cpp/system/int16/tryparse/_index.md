---
title: "System::Int16::TryParse method"
linktitle: "TryParse"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::Int16 क्लास के TryParse मेथड का उपयोग कैसे करें।"
type: docs
weight: 200
url: /hi/cpp/system/int16/tryparse/
---
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int16_t &result)
```

## संबंधित देखें

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int16_t &result)
```

## संबंधित देखें

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int16_t\&) method


प्रदान की गई फ़ॉर्मेटिंग जानकारी और नंबर शैली का उपयोग करके, निर्दिष्ट स्ट्रिंग, जिसमें संख्या का स्ट्रिंग प्रतिनिधित्व है, को समतुल्य 16-बिट साइन्ड इंटीजर में परिवर्तित करता है।

```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int16_t &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | परिवर्तित करने के लिए स्ट्रिंग। |
| शैलियाँ | Globalization::NumberStyles | NumberStyles एनम के मानों का बिटवाइज़ संयोजन जो संख्या के स्ट्रिंग प्रतिनिधित्व की अनुमत शैली निर्दिष्ट करता है। |
| प्रदाता | const SharedPtr\<IFormatProvider\>\& | एक पॉइंटर जो उस ऑब्जेक्ट की ओर इशारा करता है जिसमें स्ट्रिंग फ़ॉर्मेट जानकारी होती है। |
| परिणाम | int16_t\& | एक 16-बिट साइन्ड इंटीजर वेरिएबल का रेफ़रेंस जहाँ रूपांतरण का परिणाम रखा जाता है। |

### ReturnValue

यदि रूपांतरण सफल हुआ तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int16_t &result)
```

## संबंधित देखें

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, int16_t\&) method


निर्दिष्ट स्ट्रिंग, जिसमें संख्या का स्ट्रिंग प्रतिनिधित्व है, को समतुल्य 16-बिट साइन्ड इंटीजर में परिवर्तित करता है।

```cpp
static bool System::Int16::TryParse(const String &value, int16_t &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | परिवर्तित करने के लिए स्ट्रिंग। |
| परिणाम | int16_t\& | एक 16-बिट साइन्ड इंटीजर वेरिएबल का रेफ़रेंस जहाँ रूपांतरण का परिणाम रखा जाता है। |

### ReturnValue

यदि रूपांतरण सफल हुआ तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../../string/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
