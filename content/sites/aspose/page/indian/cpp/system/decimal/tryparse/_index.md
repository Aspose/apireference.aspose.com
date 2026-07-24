---
title: "System::Decimal::TryParse मेथड"
linktitle: "TryParse"
second_title: "Aspose.Page C++ के लिए"
description: "System::Decimal::TryParse मेथड। निर्दिष्ट स्ट्रिंग जिसमें संख्या का स्ट्रिंग प्रतिनिधित्व है, उसे C++ में समतुल्य Decimal मान में परिवर्तित करता है।"
type: docs
weight: 5800
url: /hi/cpp/system/decimal/tryparse/
---
## Decimal::TryParse(const String\&, Decimal\&) method


संख्या के स्ट्रिंग प्रतिनिधित्व वाली निर्दिष्ट स्ट्रिंग को समतुल्य [Decimal](../) मान में परिवर्तित करता है।

```cpp
static bool System::Decimal::TryParse(const String &value, Decimal &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | परिवर्तित करने के लिए स्ट्रिंग |
| result | Decimal\& | परिवर्तन का परिणाम जहाँ रखा जाता है, उस [Decimal](../) वेरिएबल का रेफ़रेंस |

### ReturnValue

यदि परिवर्तन सफल हुआ तो true, अन्यथा false

## संबंधित देखें

* Class [String](../../string/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) method


प्रदान की गई फ़ॉर्मेटिंग जानकारी और संख्या शैली का उपयोग करके संख्या के स्ट्रिंग प्रतिनिधित्व वाली निर्दिष्ट स्ट्रिंग को समतुल्य [Decimal](../) मान में परिवर्तित करता है।

```cpp
static bool System::Decimal::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, Decimal &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | परिवर्तित करने के लिए स्ट्रिंग |
| शैलियाँ | Globalization::NumberStyles | NumberStyles एन्नुम के मानों का बिटवाइज़ संयोजन जो संख्या के स्ट्रिंग प्रतिनिधित्व की अनुमत शैली को निर्दिष्ट करता है |
| प्रदाता | const SharedPtr\<IFormatProvider\>\& | एक ऑब्जेक्ट का पॉइंटर जो स्ट्रिंग फ़ॉर्मेट जानकारी रखता है |
| परिणाम | Decimal\& | एक आउटपुट आर्ग्यूमेंट; परिवर्तन का परिणाम रखता है |

### ReturnValue

यदि परिवर्तन सफल हुआ तो true, अन्यथा false

## संबंधित देखें

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
