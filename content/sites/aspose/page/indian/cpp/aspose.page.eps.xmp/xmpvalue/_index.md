---
title: "Aspose::Page::EPS::XMP::XmpValue क्लास"
linktitle: "XmpValue"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::EPS::XMP::XmpValue क्लास. C++ में XMP मान का प्रतिनिधित्व करता है।"
type: docs
weight: 300
url: /hi/cpp/aspose.page.eps.xmp/xmpvalue/
---
## XmpValue class


[XMP](../) मान का प्रतिनिधित्व करता है।

```cpp
class XmpValue : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_IsArray](./get_isarray/)() | सही लौटाता है यदि [XmpValue](./) एरे है। |
| [get_IsDateTime](./get_isdatetime/)() const | सही लौटाता है यदि मान DateTime है। |
| [get_IsDouble](./get_isdouble/)() const | सही लौटाता है यदि मान फ्लोटिंग पॉइंट मान है। |
| [get_IsField](./get_isfield/)() | सही लौटाता है यदि [XmpValue](./) फ़ील्ड है। |
| [get_IsInteger](./get_isinteger/)() const | सही लौटाता है यदि मान पूर्णांक है। |
| [get_IsNamedValue](./get_isnamedvalue/)() const | सही लौटाता है यदि [XmpValue](./) नामित मान है। |
| [get_IsNamedValues](./get_isnamedvalues/)() | सही लौटाता है यदि [XmpValue](./) नामित मानों का प्रतिनिधित्व करता है। |
| [get_IsRaw](./get_israw/)() | मान असमर्थित/अज्ञात है और कच्चा XML कोड प्रदान किया गया है। |
| [get_IsString](./get_isstring/)() | सही लौटाता है यदि मान स्ट्रिंग है। |
| [get_IsStructure](./get_isstructure/)() | सही लौटाता है यदि [XmpValue](./) संरचना का प्रतिनिधित्व करता है। |
| static [to_KeyValuePair](./to_keyvaluepair/)(System::SharedPtr\<XmpValue\>) | [XmpValue](./) को नामित मान में परिवर्तित करता है। |
| static [to_KeyValuePairArray](./to_keyvaluepairarray/)(System::SharedPtr\<XmpValue\>) | XmlValue को नामित संग्रह मान में परिवर्तित करता है। |
| static [to_String](./to_string/)(System::SharedPtr\<XmpValue\>) | [XmpValue](./) को स्ट्रिंग में परिवर्तित करता है। |
| static [to_XmpValue](./to_xmpvalue/)(System::String) | स्ट्रिंग को [XmpValue](./) में परिवर्तित करता है। |
| static [to_XmpValue](./to_xmpvalue/)(int32_t) | इंटीजर को [XmpValue](./) में परिवर्तित करता है। |
| static [to_XmpValue](./to_xmpvalue/)(double) | डबल को [XmpValue](./) में परिवर्तित करता है। |
| static [to_XmpValue](./to_xmpvalue/)(System::DateTime) | DateTime को [XmpValue](./) में परिवर्तित करता है। |
| static [to_XmpValue](./to_xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | ऐरे को [XmpValue](./) में परिवर्तित करता है। |
| static [to_XmpValueArray](./to_xmpvaluearray/)(System::SharedPtr\<XmpValue\>) | [XmpValue](./) को ऐरे में परिवर्तित करता है। |
| [ToArray](./toarray/)() | ऐरे लौटाता है। |
| [ToDateTime](./todatetime/)() | डेट टाइम में परिवर्तित करता है। |
| [ToDictionary](./todictionary/)() | डिक्शनरी लौटाता है जिसमें नामित मान होते हैं। |
| [ToDouble](./todouble/)() | डबल में परिवर्तित करता है। |
| [ToField](./tofield/)() | [XMP](../) मान को [XMP](../) फ़ील्ड के रूप में लौटाता है। |
| [ToInteger](./tointeger/)() | इंटीजर में परिवर्तित करता है। |
| [ToNamedValue](./tonamedvalue/)() | [XMP](../) मान को नामित मान के रूप में लौटाता है। |
| [ToNamedValues](./tonamedvalues/)() | [XMP](../) मान को नामित मान संग्रह के रूप में लौटाता है। |
| [ToRaw](./toraw/)() | अज्ञात/असमर्थित मानों के लिए कच्चा XML कोड। |
| [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [ToString](./tostring/)() const override | [XmpValue](./) का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [ToStringValue](./tostringvalue/)() | स्ट्रिंग में परिवर्तित करता है। |
| [ToStructure](./tostructure/)() | [XMP](../) मान को संरचना (फ़ील्डों का सेट) के रूप में लौटाता है। |
| [XmpValue](./xmpvalue/)(System::String) | स्ट्रिंग मान के लिए कंस्ट्रक्टर। |
| [XmpValue](./xmpvalue/)(int32_t) | इंटीजर मान के लिए कंस्ट्रक्टर। |
| [XmpValue](./xmpvalue/)(double) | फ़्लोटिंग पॉइंट मान के लिए कंस्ट्रक्टर। |
| [XmpValue](./xmpvalue/)(System::DateTime) | डेट टाइम मान के लिए कंस्ट्रक्टर। |
| [XmpValue](./xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<XmpValue\>\>) | ऐरे मान के लिए कंस्ट्रक्टर। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
