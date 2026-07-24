---
title: "System::Xml::XmlDateTimeSerializationMode एनम"
linktitle: "XmlDateTimeSerializationMode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlDateTimeSerializationMode enum. स्ट्रिंग और DateTime के बीच रूपांतरण करते समय समय मान को कैसे संभालना है, यह निर्दिष्ट करता है। C++ में।"
type: docs
weight: 5800
url: /hi/cpp/system.xml/xmldatetimeserializationmode/
---
## XmlDateTimeSerializationMode enum


स्ट्रिंग और [DateTime](../../system/datetime/) के बीच रूपांतरण करते समय समय मान को कैसे संभालना है, यह निर्दिष्ट करता है।

```cpp
enum class XmlDateTimeSerializationMode
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| Local | 0 | स्थानीय समय के रूप में मानें। यदि [DateTime](../../system/datetime/) वस्तु समन्वित सार्वभौमिक समय (UTC) का प्रतिनिधित्व करती है, तो इसे स्थानीय समय में परिवर्तित किया जाता है। |
| Utc | 1 | UTC के रूप में मानें। यदि [DateTime](../../system/datetime/) वस्तु स्थानीय समय का प्रतिनिधित्व करती है, तो इसे UTC में परिवर्तित किया जाता है। |
| Unspecified | 2 | यदि एक [DateTime](../../system/datetime/) को स्ट्रिंग में परिवर्तित किया जा रहा है तो इसे स्थानीय समय के रूप में मानें। यदि एक स्ट्रिंग को [DateTime](../../system/datetime/) में परिवर्तित किया जा रहा है, तो यदि समय क्षेत्र निर्दिष्ट किया गया हो तो इसे स्थानीय समय में परिवर्तित करें। |
| RoundtripKind | 3 | रूपांतरण के दौरान समय क्षेत्र की जानकारी को संरक्षित रखा जाना चाहिए। |

## संबंधित देखें

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
