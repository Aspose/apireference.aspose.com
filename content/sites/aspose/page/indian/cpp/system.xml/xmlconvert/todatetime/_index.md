---
title: "System::Xml::XmlConvert::ToDateTime विधि"
linktitle: "ToDateTime"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlConvert::ToDateTime विधि। C++ में स्ट्रिंग को DateTime के समतुल्य में परिवर्तित करती है।"
type: docs
weight: 1400
url: /hi/cpp/system.xml/xmlconvert/todatetime/
---
## XmlConvert::ToDateTime(const String\&) method


[String](../../../system/string/) को [DateTime](../../../system/datetime/) के समतुल्य में परिवर्तित करता है।

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | const String\& | परिवर्तित करने के लिए स्ट्रिंग। |

### ReturnValue

स्ट्रिंग का एक [DateTime](../../../system/datetime/) समतुल्य।

## संबंधित देखें

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const ArrayPtr\<String\>\&) method


[String](../../../system/string/) को [DateTime](../../../system/datetime/) के समतुल्य में परिवर्तित करता है।

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const ArrayPtr<String> &formats)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | const String\& | परिवर्तित करने के लिए स्ट्रिंग। |
| formats | const ArrayPtr\<String\>\& | एक एरे जिसमें रूपांतरण किए गए [DateTime](../../../system/datetime/) पर लागू करने के लिए फ़ॉर्मेट संरचनाएँ होती हैं। वैध फ़ॉर्मेट में "yyyy-MM-ddTHH:mm:sszzzzzz" और उसके उपसमुच्चय शामिल हैं। |

### ReturnValue

स्ट्रिंग का एक [DateTime](../../../system/datetime/) समतुल्य।

## संबंधित देखें

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const String\&) method


[String](../../../system/string/) को [DateTime](../../../system/datetime/) के समतुल्य में परिवर्तित करता है।

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const String &format)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | const String\& | परिवर्तित करने के लिए स्ट्रिंग। |
| format | const String\& | रूपांतरित [DateTime](../../../system/datetime/) पर लागू करने के लिए फ़ॉर्मेट संरचना। वैध फ़ॉर्मेट में "yyyy-MM-ddTHH:mm:sszzzzzz" और उसके उपसमुच्चय शामिल हैं। स्ट्रिंग को इस फ़ॉर्मेट के विरुद्ध मान्य किया जाता है। |

### ReturnValue

स्ट्रिंग का एक [DateTime](../../../system/datetime/) समतुल्य।

## संबंधित देखें

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, XmlDateTimeSerializationMode) method


निर्दिष्ट [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) का उपयोग करके [String](../../../system/string/) को [DateTime](../../../system/datetime/) में परिवर्तित करता है।

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, XmlDateTimeSerializationMode dateTimeOption)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | const String\& | परिवर्तित करने के लिए [String](../../../system/string/) मान। |
| dateTimeOption | XmlDateTimeSerializationMode | एक enumeration मान जो यह निर्दिष्ट करता है कि तिथि को स्थानीय समय में परिवर्तित किया जाना चाहिए या यदि यह UTC तिथि है तो इसे समन्वित सार्वभौमिक समय (UTC) के रूप में संरक्षित रखा जाए। |

### ReturnValue

एक [DateTime](../../../system/datetime/) समतुल्य है [String](../../../system/string/) का।

## संबंधित देखें

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
