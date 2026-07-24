---
title: "System::EnumValues क्लास"
linktitle: "EnumValues"
second_title: "Aspose.Page C++ के लिए"
description: "System::EnumValues क्लास। C++ में enum प्रकार E के एनीमरेशन कॉन्स्टेंट्स के बारे में मेटा जानकारी प्रदान करता है।"
type: docs
weight: 2300
url: /hi/cpp/system/enumvalues/
---
## EnumValues class


enum टाइप **E** के एन्हुमरेशन कॉन्स्टेंट्स के बारे में मेटा जानकारी प्रदान करता है।

```cpp
template<typename E,class Guard>class EnumValues : public System::EnumValuesBase
```


| पैरामीटर | विवरण |
| --- | --- |
| E | एनीमरेशन का प्रकार |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [EnumValues](./enumvalues/)() | एक इंस्टेंस बनाता है। |
| [GetNames](./getnames/)() const override | एनीमरेशन **E** के सभी नामों को शामिल करने वाला एरे लौटाता है। |
| static [GetNames](../enumvaluesbase/getnames/)(const TypeInfo\&) | निर्दिष्ट एनीमरेशन में कॉन्स्टेंट्स के नामों का एरे प्राप्त करता है। |
| [GetUnderlyingType](./getunderlyingtype/)() const override | निर्दिष्ट एनीमरेशन का अंतर्निहित प्रकार लौटाता है। |
| static [GetUnderlyingType](../enumvaluesbase/getunderlyingtype/)(const TypeInfo\&) | निर्दिष्ट एनीमरेशन का अंतर्निहित प्रकार लौटाता है। |
| [GetValueOf](./getvalueof/)(const String\&, bool) const override | निर्दिष्ट नाम वाले एनीमरेशन कॉन्स्टेंट का बॉक्स्ड वैल्यू लौटाता है। |
| [GetValueOf](./getvalueof/)(long) const override | निर्दिष्ट मान के साथ enum स्थिरांक का बॉक्स्ड मान लौटाता है। |
| [GetValues](./getvalues/)() const override | enumeration **E** के सभी मानों को शामिल करने वाला एक ऐरे लौटाता है। |
| static [GetValues](../enumvaluesbase/getvalues/)(const TypeInfo\&) | निर्दिष्ट enumeration प्रकार के सभी मानों को शामिल करने वाला एक ऐरे लौटाता है। |
| static [Parse](../enumvaluesbase/parse/)(const TypeInfo\&, const String\&, bool) | निर्दिष्ट नाम के साथ निर्दिष्ट enumeration प्रकार के enumeration स्थिरांक के मान का प्रतिनिधित्व करने वाला एक ऑब्जेक्ट लौटाता है। |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, uint64_t) | निर्दिष्ट 64-बिट unsigned integer मान को एक enumeration सदस्य में परिवर्तित करता है। |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | एक integer मान वाले निर्दिष्ट ऑब्जेक्ट को एक enumeration सदस्य में परिवर्तित करता है। |
| virtual [~EnumValues](./~enumvalues/)() | डिस्ट्रक्टर। |

## संबंधित देखें

* Class [EnumValuesBase](../enumvaluesbase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
