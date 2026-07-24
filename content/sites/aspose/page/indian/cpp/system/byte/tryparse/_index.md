---
title: "System::Byte::TryParse मेथड"
linktitle: "TryParse"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::Byte क्लास के TryParse मेथड का उपयोग कैसे करें।"
type: docs
weight: 200
url: /hi/cpp/system/byte/tryparse/
---
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, uint8_t &result)
```

## संबंधित देखें

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, uint8_t &result)
```

## संबंधित देखें

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) method


प्रदान की गई फ़ॉर्मेटिंग जानकारी और नंबर स्टाइल का उपयोग करके, निर्दिष्ट स्ट्रिंग, जिसमें किसी संख्या का स्ट्रिंग प्रतिनिधित्व होता है, को समकक्ष 8-बिट अनसाइनड इंटीजर में परिवर्तित करता है।

```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, uint8_t &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | परिवर्तित करने के लिए स्ट्रिंग। |
| शैलियाँ | Globalization::NumberStyles | NumberStyles एनम के मानों का बिटवाइज़ संयोजन जो संख्या के स्ट्रिंग प्रतिनिधित्व की अनुमत शैली निर्दिष्ट करता है। |
| प्रदाता | const SharedPtr\<IFormatProvider\>\& | एक पॉइंटर जो उस ऑब्जेक्ट की ओर इशारा करता है जिसमें स्ट्रिंग फ़ॉर्मेट जानकारी होती है। |
| परिणाम | uint8_t\& | परिणाम को रखने वाले 8-बिट अनसाइन्ड इंटीजर वेरिएबल का रेफ़रेंस। |

### ReturnValue

यदि रूपांतरण सफल हुआ तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, uint8_t &result)
```

## संबंधित देखें

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, uint8_t\&) method


निर्दिष्ट स्ट्रिंग, जिसमें किसी संख्या का स्ट्रिंग प्रतिनिधित्व होता है, को समकक्ष 8-बिट अनसाइनड इंटीजर में परिवर्तित करता है।

```cpp
static bool System::Byte::TryParse(const String &value, uint8_t &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | परिवर्तित करने के लिए स्ट्रिंग। |
| परिणाम | uint8_t\& | परिणाम को रखने वाले 8-बिट अनसाइन्ड इंटीजर वेरिएबल का रेफ़रेंस। |

### ReturnValue

यदि रूपांतरण सफल हुआ तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../../string/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
