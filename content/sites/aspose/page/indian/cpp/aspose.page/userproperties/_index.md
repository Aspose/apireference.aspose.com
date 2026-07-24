---
title: "Aspose::Page::UserProperties क्लास"
linktitle: "UserProperties"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::UserProperties क्लास। विशेष प्रॉपर्टी क्लास जो टाइप्ड प्रॉपर्टीज़ को सेट और रिटर्न करने की अनुमति देता है। यह दो डिफ़ॉल्ट प्रॉपर्टी ऑब्जेक्ट्स को हुकअप करने की भी सुविधा देता है, जिन्हें खोजा जा सकता है यदि यह प्रॉपर्टी ऑब्जेक्ट C++ में प्रॉपर्टी नहीं रखता है।"
type: docs
weight: 1600
url: /hi/cpp/aspose.page/userproperties/
---
## UserProperties class


विशेष प्रॉपर्टी क्लास जो टाइप्ड प्रॉपर्टीज़ को सेट और रिटर्न करने की अनुमति देती है। यह दो डिफ़ॉल्ट प्रॉपर्टी ऑब्जेक्ट्स को खोजने के लिए हुकअप करने की भी अनुमति देती है यदि यह प्रॉपर्टी ऑब्जेक्ट प्रॉपर्टी नहीं रखता।

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | स्ट्रिंग प्रॉपर्टी मान प्राप्त करता है। |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | स्ट्रिंग प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है। |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | रंग प्रॉपर्टी मान प्राप्त करता है। |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | रंग प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है। |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | डबल प्रॉपर्टी मान प्राप्त करता है। |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | डबल प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है। |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | फ़्लोट प्रॉपर्टी मान प्राप्त करता है। |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | फ़्लोट प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है। |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | इंटीजर प्रॉपर्टी मान प्राप्त करता है। |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | इंटीजर प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है। |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | मार्जिन्स प्रॉपर्टी मान प्राप्त करता है। |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | मार्जिन्स प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है। |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | मैट्रिक्स प्रॉपर्टी मान प्राप्त करता है। |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | मैट्रिक्स प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है। |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | रेक्टेंगल प्रॉपर्टी मान प्राप्त करता है। |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | रेक्टेंगल प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है। |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | साइज़ प्रॉपर्टी मान प्राप्त करता है। |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | साइज़ प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है। |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | स्ट्रिंग एरे प्रॉपर्टी मान प्राप्त करता है। |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | स्ट्रिंग एरे प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है। |
| virtual [IsProperty](./isproperty/)(System::String) | बूलियन प्रॉपर्टी मान प्राप्त करता है। |
| virtual [IsProperty](./isproperty/)(System::String, bool) | बूलियन प्रॉपर्टी मान प्राप्त करता है। यदि अनुरोधित प्रॉपर्टी अनुपलब्ध है, तो प्रदान किया गया डिफ़ॉल्ट मान लौटाता है। |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | प्रॉपर्टी नाम लौटाता है। |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | प्रॉपर्टी कॉपी करता है, जिसमें इसके डिफ़ॉल्ट भी शामिल हैं, इस [UserProperties](./) में। |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | स्ट्रिंग प्रॉपर्टी मान सेट करता है। |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | स्ट्रिंग एरे प्रॉपर्टी मान सेट करता है। |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | निर्दिष्ट प्रॉपर्टीज़ तालिका में स्ट्रिंग एरे प्रॉपर्टी मान सेट करता है। |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | रंग प्रॉपर्टी मान सेट करता है। |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | निर्दिष्ट प्रॉपर्टीज़ तालिका में रंग प्रॉपर्टी मान सेट करता है। |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | आयत प्रॉपर्टी मान सेट करता है। |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | निर्दिष्ट प्रॉपर्टीज़ तालिका में आयत प्रॉपर्टी मान सेट करता है। |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | मार्जिन प्रॉपर्टी मान सेट करता है। |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | निर्दिष्ट प्रॉपर्टीज़ तालिका में मार्जिन प्रॉपर्टी मान सेट करता है। |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | आकार प्रॉपर्टी मान सेट करता है। |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | निर्दिष्ट प्रॉपर्टीज़ तालिका में आकार प्रॉपर्टी मान सेट करता है। |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | इंटीजर प्रॉपर्टी मान सेट करता है। |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | निर्दिष्ट प्रॉपर्टीज़ तालिका में इंटीजर प्रॉपर्टी मान सेट करता है। |
| virtual [SetProperty](./setproperty/)(System::String, double) | डबल प्रॉपर्टी मान सेट करता है। |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | निर्दिष्ट प्रॉपर्टीज़ तालिका में डबल प्रॉपर्टी मान सेट करता है। |
| virtual [SetProperty](./setproperty/)(System::String, float) | फ़्लोट प्रॉपर्टी मान सेट करता है। |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | निर्दिष्ट प्रॉपर्टीज़ तालिका में फ़्लोट प्रॉपर्टी मान सेट करता है। |
| virtual [SetProperty](./setproperty/)(System::String, bool) | बूलियन प्रॉपर्टी मान सेट करता है। |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | निर्दिष्ट प्रॉपर्टीज़ तालिका में बूलियन प्रॉपर्टी मान सेट करता है। |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | मैट्रिक्स प्रॉपर्टी मान सेट करता है। |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | निर्दिष्ट प्रॉपर्टीज़ तालिका में मैट्रिक्स प्रॉपर्टी मान सेट करता है। |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override |  n'th टेम्पलेट आर्ग्युमेंट को एक weak पॉइंटर सेट करें (shared के बजाय)। कंटेनरों में पॉइंटर्स को weak मोड में स्विच करने की अनुमति देता है। |
| [UserProperties](./userproperties/)() | एक खाली [UserProperties](./) क्लास का उदाहरण इनिशियलाइज़ करता है। |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | डिफ़ॉल्ट मानों के साथ एक [UserProperties](./) क्लास को इनिशियलाइज़ करता है। |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | एक डिफ़ॉल्ट्स और altDefaults तालिका के साथ [UserProperties](./) बनाता है, जिन्हें उस क्रम में खोजा जाता है। |
## संबंधित देखें

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
