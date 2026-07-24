---
title: "System::Xml::XmlConvert क्लास"
linktitle: "XmlConvert"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlConvert क्लास। XML नामों को एन्कोड और डिकोड करता है, और रनटाइम प्रकारों और XML स्कीमा डिफ़िनिशन लैंग्वेज (XSD) प्रकारों के बीच रूपांतरण के लिए मेथड्स प्रदान करता है। डेटा प्रकारों को परिवर्तित करते समय, C++ में लौटाए गए मान लोकेल-स्वतंत्र होते हैं।"
type: docs
weight: 1200
url: /hi/cpp/system.xml/xmlconvert/
---
## XmlConvert class


XML नामों को एन्कोड और डिकोड करता है, और रनटाइम प्रकारों और XML [Schema](../../system.xml.schema/) डिफ़िनिशन लैंग्वेज (XSD) प्रकारों के बीच रूपांतरण के लिए मेथड्स प्रदान करता है। डेटा प्रकारों को परिवर्तित करते समय, लौटाए गए मान लोकेल-स्वतंत्र होते हैं।

```cpp
class XmlConvert : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [DecodeName](./decodename/)(const String\&) | एक नाम को डिकोड करता है। यह मेथड XmlConvert::EncodeName(String) और XmlConvert::EncodeLocalName(String) मेथड्स के विपरीत कार्य करता है। |
| static [EncodeLocalName](./encodelocalname/)(const String\&) | नाम को वैध XML स्थानीय नाम में परिवर्तित करता है। |
| static [EncodeName](./encodename/)(const String\&) | नाम को वैध XML नाम में परिवर्तित करता है। |
| static [EncodeNmToken](./encodenmtoken/)(const String\&) | XML विनिर्देशन के अनुसार नाम वैध है या नहीं सत्यापित करता है। |
| static [IsNCNameChar](./isncnamechar/)(char16_t) | जाँचता है कि पास किया गया अक्षर वैध गैर-कोलन अक्षर प्रकार है या नहीं। |
| static [IsPublicIdChar](./ispublicidchar/)(char16_t) | यदि तर्क में दिया गया अक्षर वैध सार्वजनिक आईडी अक्षर है तो पास किए गए अक्षर इंस्टेंस को लौटाता है, अन्यथा **nullptr**। |
| static [IsStartNCNameChar](./isstartncnamechar/)(char16_t) | जाँचता है कि पास किया गया अक्षर वैध स्टार्ट नेम कैरेक्टर प्रकार है या नहीं। |
| static [IsWhitespaceChar](./iswhitespacechar/)(char16_t) | जाँचता है कि पास किया गया अक्षर एक वैध XML व्हाइटस्पेस अक्षर है। |
| static [IsXmlChar](./isxmlchar/)(char16_t) | जाँचता है कि पास किया गया अक्षर एक वैध XML अक्षर है। |
| static [IsXmlSurrogatePair](./isxmlsurrogatepair/)(char16_t, char16_t) | जाँचता है कि पास किया गया सरोगेट अक्षर युग्म एक वैध XML अक्षर है। |
| static [ToBoolean](./toboolean/)(String) | परिवर्तित करता है [String](../../system/string/) को एक [Boolean](../../system/boolean/) समकक्ष में। |
| static [ToByte](./tobyte/)(const String\&) | परिवर्तित करता है [String](../../system/string/) को एक [Byte](../../system/byte/) समकक्ष में। |
| static [ToChar](./tochar/)(const String\&) | परिवर्तित करता है [String](../../system/string/) को एक [Char](../../system/char/) समकक्ष में। |
| static [ToDateTime](./todatetime/)(const String\&) | परिवर्तित करता है [String](../../system/string/) को एक [DateTime](../../system/datetime/) समकक्ष में। |
| static [ToDateTime](./todatetime/)(const String\&, const String\&) | परिवर्तित करता है [String](../../system/string/) को एक [DateTime](../../system/datetime/) समकक्ष में। |
| static [ToDateTime](./todatetime/)(const String\&, const ArrayPtr\<String\>\&) | परिवर्तित करता है [String](../../system/string/) को एक [DateTime](../../system/datetime/) समकक्ष में। |
| static [ToDateTime](./todatetime/)(const String\&, XmlDateTimeSerializationMode) | परिवर्तित करता है [String](../../system/string/) को एक [DateTime](../../system/datetime/) में, निर्दिष्ट [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/) का उपयोग करके। |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&) | परिवर्तित करता है प्रदान किए गए [String](../../system/string/) को एक [DateTimeOffset](../../system/datetimeoffset/) समकक्ष में। |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const String\&) | परिवर्तित करता है प्रदान किए गए [String](../../system/string/) को एक [DateTimeOffset](../../system/datetimeoffset/) समकक्ष में। |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const ArrayPtr\<String\>\&) | परिवर्तित करता है प्रदान किए गए [String](../../system/string/) को एक [DateTimeOffset](../../system/datetimeoffset/) समकक्ष में। |
| static [ToDecimal](./todecimal/)(const String\&) | परिवर्तित करता है [String](../../system/string/) को एक [Decimal](../../system/decimal/) समकक्ष में। |
| static [ToDouble](./todouble/)(String) | परिवर्तित करता है [String](../../system/string/) को एक [Double](../../system/double/) समकक्ष में। |
| static [ToGuid](./toguid/)(const String\&) | परिवर्तित करता है [String](../../system/string/) को एक [Guid](../../system/guid/) समकक्ष में। |
| static [ToInt16](./toint16/)(const String\&) | परिवर्तित करता है [String](../../system/string/) को एक [Int16](../../system/int16/) समकक्ष में। |
| static [ToInt32](./toint32/)(const String\&) | परिवर्तित करता है [String](../../system/string/) को एक [Int32](../../system/int32/) समकक्ष में। |
| static [ToInt64](./toint64/)(const String\&) | परिवर्तित करता है [String](../../system/string/) को एक [Int64](../../system/int64/) समकक्ष में। |
| static [ToSByte](./tosbyte/)(const String\&) | परिवर्तित करता है [String](../../system/string/) को एक [SByte](../../system/sbyte/) समकक्ष में। |
| static [ToSingle](./tosingle/)(String) | परिवर्तित करता है [String](../../system/string/) को एक [Single](../../system/single/) समकक्ष में। |
| static [ToString](./tostring/)(bool) | परिवर्तित करता है [Boolean](../../system/boolean/) को एक [String](../../system/string/) में। |
| static [ToString](./tostring/)(char16_t) | परिवर्तित करता है [Char](../../system/char/) को एक [String](../../system/string/) में। |
| static [ToString](./tostring/)(Decimal) | परिवर्तित करता है [Decimal](../../system/decimal/) को एक [String](../../system/string/) में। |
| static [ToString](./tostring/)(int8_t) | परिवर्तित करता है [SByte](../../system/sbyte/) को एक [String](../../system/string/) में। |
| static [ToString](./tostring/)(int16_t) | परिवर्तित करता है [Int16](../../system/int16/) को एक [String](../../system/string/) में। |
| static [ToString](./tostring/)(int32_t) | परिवर्तित करता है [Int32](../../system/int32/) को एक [String](../../system/string/) में। |
| static [ToString](./tostring/)(int64_t) | परिवर्तित करता है [Int64](../../system/int64/) को एक [String](../../system/string/) में। |
| static [ToString](./tostring/)(uint8_t) | परिवर्तित करता है [Byte](../../system/byte/) को एक [String](../../system/string/) में। |
| static [ToString](./tostring/)(uint16_t) | [UInt16](../../system/uint16/) को एक [String](../../system/string/) में परिवर्तित करता है। |
| static [ToString](./tostring/)(uint32_t) | [UInt32](../../system/uint32/) को एक [String](../../system/string/) में परिवर्तित करता है। |
| static [ToString](./tostring/)(uint64_t) | [UInt64](../../system/uint64/) को एक [String](../../system/string/) में परिवर्तित करता है। |
| static [ToString](./tostring/)(float) | [Single](../../system/single/) को एक [String](../../system/string/) में परिवर्तित करता है। |
| static [ToString](./tostring/)(double) | [Double](../../system/double/) को एक [String](../../system/string/) में परिवर्तित करता है। |
| static [ToString](./tostring/)(TimeSpan) | [TimeSpan](../../system/timespan/) को एक [String](../../system/string/) में परिवर्तित करता है। |
| static [ToString](./tostring/)(DateTime) | [DateTime](../../system/datetime/) को एक [String](../../system/string/) में परिवर्तित करता है। |
| static [ToString](./tostring/)(DateTime, const String\&) | [DateTime](../../system/datetime/) को एक [String](../../system/string/) में परिवर्तित करता है। |
| static [ToString](./tostring/)(DateTime, XmlDateTimeSerializationMode) | [DateTime](../../system/datetime/) को निर्दिष्ट किए गए [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/) का उपयोग करके एक [String](../../system/string/) में परिवर्तित करता है। |
| static [ToString](./tostring/)(DateTimeOffset) | प्रदान किए गए [DateTimeOffset](../../system/datetimeoffset/) को एक [String](../../system/string/) में परिवर्तित करता है। |
| static [ToString](./tostring/)(DateTimeOffset, const String\&) | प्रदान किए गए [DateTimeOffset](../../system/datetimeoffset/) को निर्दिष्ट प्रारूप में एक [String](../../system/string/) में परिवर्तित करता है। |
| static [ToString](./tostring/)(Guid) | [Guid](../../system/guid/) को एक [String](../../system/string/) में परिवर्तित करता है। |
| static [ToTimeSpan](./totimespan/)(const String\&) | [String](../../system/string/) को एक [TimeSpan](../../system/timespan/) समतुल्य में परिवर्तित करता है। |
| static [ToUInt16](./touint16/)(const String\&) | [String](../../system/string/) को एक [UInt16](../../system/uint16/) समतुल्य में परिवर्तित करता है। |
| static [ToUInt32](./touint32/)(const String\&) | [String](../../system/string/) को एक [UInt32](../../system/uint32/) समतुल्य में परिवर्तित करता है। |
| static [ToUInt64](./touint64/)(const String\&) | [String](../../system/string/) को एक [UInt64](../../system/uint64/) समतुल्य में परिवर्तित करता है। |
| static [VerifyName](./verifyname/)(const String\&) | सत्यापित करता है कि नाम W3C विस्तारित मार्कअप भाषा सिफ़ारिश के अनुसार मान्य है। |
| static [VerifyNCName](./verifyncname/)(const String\&) | W3C विस्तारित मार्कअप भाषा सिफ़ारिश के अनुसार यह सत्यापित करता है कि नाम एक मान्य **NCName** है। एक **NCName** वह नाम है जिसमें कोलन नहीं हो सकता। |
| static [VerifyNMTOKEN](./verifynmtoken/)(const String\&) | W3C XML [Schema](../../system.xml.schema/) Part2: Datatypes सिफ़ारिश के अनुसार यह सत्यापित करता है कि स्ट्रिंग एक मान्य NMTOKEN है। |
| static [VerifyPublicId](./verifypublicid/)(const String\&) | यदि स्ट्रिंग तर्क के सभी अक्षर मान्य सार्वजनिक आईडी अक्षर हैं तो पास किए गए स्ट्रिंग इंस्टेंस को लौटाता है। |
| static [VerifyTOKEN](./verifytoken/)(const String\&) | W3C XML [Schema](../../system.xml.schema/) Part2: Datatypes सिफ़ारिश के अनुसार यह सत्यापित करता है कि स्ट्रिंग एक मान्य टोकन है। |
| static [VerifyWhitespace](./verifywhitespace/)(const String\&) | यदि स्ट्रिंग तर्क के सभी अक्षर मान्य व्हाइटस्पेस अक्षर हैं तो पास किए गए स्ट्रिंग इंस्टेंस को लौटाता है। |
| static [VerifyXmlChars](./verifyxmlchars/)(const String\&) | यदि स्ट्रिंग तर्क के सभी अक्षर और सरोगेट पेयर अक्षर मान्य XML अक्षर हैं तो पास किए गए स्ट्रिंग को लौटाता है, अन्यथा एक [XmlException](../xmlexception/) फेंका जाता है जिसमें पहली अमान्य अक्षर की जानकारी होती है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
