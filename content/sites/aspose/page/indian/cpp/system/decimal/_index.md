---
title: "System::Decimal क्लास"
linktitle: "डेसिमल"
second_title: "Aspose.Page C++ के लिए"
description: "System::Decimal क्लास। एक दशमलव संख्या का प्रतिनिधित्व करता है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान या रेफ़रेंस द्वारा पास किया जाना चाहिए। C++ में इस प्रकार की वस्तुओं को प्रबंधित करने के लिए कभी भी System::SmartPtr क्लास का उपयोग न करें।"
type: docs
weight: 1900
url: /hi/cpp/system/decimal/
---
## Decimal class


एक दशमलव संख्या का प्रतिनिधित्व करता है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान या रेफ़रेंस द्वारा पास किया जाना चाहिए। इस प्रकार की वस्तुओं को प्रबंधित करने के लिए कभी भी [System::SmartPtr](../smartptr/) क्लास का उपयोग न करें।

```cpp
class Decimal
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [Add](./add/)(const Decimal\&, const Decimal\&) | दो निर्दिष्ट [Decimal](./) मानों को जोड़ता है। |
| static [Ceiling](./ceiling/)(const Decimal\&) | निर्दिष्ट मान के बराबर या उससे बड़ा सबसे छोटा पूर्णांक मान लौटाता है। |
| static [Compare](./compare/)(const Decimal\&, const Decimal\&) | पहले [Decimal](./) वस्तु द्वारा प्रतिनिधित्व किए गए मान की तुलना दूसरे [Decimal](./) वस्तु द्वारा प्रतिनिधित्व किए गए मान से कम, बराबर या अधिक है या नहीं निर्धारित करता है। |
| [CompareTo](./compareto/)(const Decimal\&) const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए मान की तुलना निर्दिष्ट वस्तु द्वारा प्रतिनिधित्व किए गए मान से कम, बराबर या अधिक है या नहीं निर्धारित करता है। |
| [Decimal](./decimal/)() | 0 का प्रतिनिधित्व करने वाला एक इंस्टेंस बनाता है। |
| [Decimal](./decimal/)(std::int8_t) | निर्दिष्ट मान का प्रतिनिधित्व करने वाला एक इंस्टेंस बनाता है। |
| [Decimal](./decimal/)(std::int16_t) | निर्दिष्ट मान का प्रतिनिधित्व करने वाला एक इंस्टेंस बनाता है। |
| [Decimal](./decimal/)(std::int32_t) | निर्दिष्ट मान का प्रतिनिधित्व करने वाला एक इंस्टेंस बनाता है। |
| [Decimal](./decimal/)(std::int64_t) | निर्दिष्ट मान का प्रतिनिधित्व करने वाला एक इंस्टेंस बनाता है। |
| [Decimal](./decimal/)(std::uint8_t) | निर्दिष्ट मान का प्रतिनिधित्व करने वाला एक इंस्टेंस बनाता है। |
| [Decimal](./decimal/)(std::uint16_t) | निर्दिष्ट मान का प्रतिनिधित्व करने वाला एक इंस्टेंस बनाता है। |
| [Decimal](./decimal/)(std::uint32_t) | निर्दिष्ट मान का प्रतिनिधित्व करने वाला एक इंस्टेंस बनाता है। |
| [Decimal](./decimal/)(std::uint64_t) | निर्दिष्ट मान का प्रतिनिधित्व करने वाला एक इंस्टेंस बनाता है। |
| [Decimal](./decimal/)(float) | निर्दिष्ट मान का प्रतिनिधित्व करने वाला एक इंस्टेंस बनाता है। |
| [Decimal](./decimal/)(double) | निर्दिष्ट मान का प्रतिनिधित्व करने वाला एक इंस्टेंस बनाता है। |
| explicit [Decimal](./decimal/)(const std::string\&) | एक इंस्टेंस बनाता है जो उस मान का प्रतिनिधित्व करता है जिसकी स्ट्रिंग प्रतिनिधित्व std::string क्लास के एक इंस्टेंस के रूप में निर्दिष्ट है। |
| [Decimal](./decimal/)(int32_t, int32_t, int32_t, bool, uint8_t) | निर्दिष्ट घटकों से एक [Decimal](./) वस्तु बनाता है। |
| [Decimal](./decimal/)(const Decimal\&) | निर्दिष्ट [Decimal](./) वस्तु के समान संख्या का प्रतिनिधित्व करने वाला [Decimal](./) क्लास का एक इंस्टेंस बनाता है। |
| [Decimal](./decimal/)(const ArrayPtr\<int32_t\>\&) | बाइनरी प्रतिनिधित्व वाली पूर्णांक ऐरे से [Decimal](./) क्लास का एक उदाहरण बनाता है। |
| [Decimal](./decimal/)(std::nullptr_t) | हमेशा ArgumentNullException फेंकता है। |
| [Decimal](./decimal/)(const number_type\&) | निर्दिष्ट मान का प्रतिनिधित्व करने वाले [Decimal](./) क्लास का एक उदाहरण बनाता है। |
| static [Divide](./divide/)(const Decimal\&, const Decimal\&) | दो निर्दिष्ट [Decimal](./) मानों को विभाजित करता है। |
| [Equals](./equals/)(const Decimal\&) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट और निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान समान हैं या नहीं। |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट और निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान समान हैं या नहीं। |
| static [Equals](./equals/)(const Decimal\&, const Decimal\&) | निर्धारित करता है कि निर्दिष्ट ऑब्जेक्ट्स द्वारा प्रतिनिधित्व किए गए मान समान हैं या नहीं। |
| static [Floor](./floor/)(const Decimal\&) | निर्दिष्ट मान से कम या बराबर सबसे बड़ा पूर्णांक मान लौटाता है। |
| static [FromOACurrency](./fromoacurrency/)(int64_t) | [Convert](../convert/) निर्दिष्ट OLE मुद्रा मान को समकक्ष [Decimal](./) मान में परिवर्तित करता है। लागू नहीं किया गया। |
| static [GetBits](./getbits/)(const Decimal\&) | निर्दिष्ट [Decimal](./) ऑब्जेक्ट को उसके प्रतिनिधित्व वाले मान के बाइनरी प्रतिनिधित्व में परिवर्तित करता है। |
| static [GetBytes](./getbytes/)(const Decimal\&, const System::ArrayPtr\<uint8_t\>\&) | [Convert](../convert/) निर्दिष्ट [Decimal](./) मान को बाइट्स की ऐरे में परिवर्तित करता है। |
| [GetHashCode](./gethashcode/)() const | वर्तमान ऑब्जेक्ट के लिए हैश कोड लौटाता है। |
| [GetTypeCode](./gettypecode/)() const | ऑब्जेक्ट प्रकार कोड प्राप्त करता है। |
| static [Multiply](./multiply/)(const Decimal\&, const Decimal\&) | दो निर्दिष्ट [Decimal](./) मानों को गुणा करता है। |
| static [Negate](./negate/)(const Decimal\&) | एक नया [Decimal](./) क्लास का उदाहरण लौटाता है जो निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान के नकारात्मक परिणाम को दर्शाता है। |
| explicit [operator bool](./operatorbool/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को बूलियन मान में परिवर्तित करता है। |
| explicit [operator double](./operatordouble/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को डबल-प्रिसीजन फ्लोटिंग पॉइंट मान में परिवर्तित करता है। |
| explicit [operator float](./operatorfloat/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को सिंगल-प्रिसीजन फ्लोटिंग पॉइंट मान में परिवर्तित करता है। |
| [operator!=](./operator!=/)(const Decimal\&) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट और निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान असमान हैं या नहीं। |
| [operator!=](./operator!=/)(std::nullptr_t) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया मान 0 से अलग है या नहीं। |
| [operator%](./operator%/)(const Decimal\&) const | एक नया [Decimal](./) क्लास का उदाहरण लौटाता है जो वर्तमान और निर्दिष्ट ऑब्जेक्ट्स द्वारा प्रतिनिधित्व किए गए मानों के मोड्यूलो ऑपरेशन के परिणाम को दर्शाता है। |
| [operator%=](./operator%=/)(const Decimal\&) | वर्तमान ऑब्जेक्ट को एक नया मान असाइन करता है जो वर्तमान और निर्दिष्ट ऑब्जेक्ट्स द्वारा प्रतिनिधित्व किए गए मानों के मोड्यूलो ऑपरेशन के परिणामस्वरूप प्राप्त होता है। |
| [operator*](./operator_/)(const Decimal\&) const | एक नया [Decimal](./) क्लास का उदाहरण लौटाता है जो वर्तमान और निर्दिष्ट ऑब्जेक्ट्स द्वारा प्रतिनिधित्व किए गए मानों के गुणन के परिणाम को दर्शाता है। |
| [operator*=](./operator_=/)(const Decimal\&) | वर्तमान ऑब्जेक्ट को एक नया मान असाइन करता है जो वर्तमान और निर्दिष्ट ऑब्जेक्ट्स के गुणन के परिणामस्वरूप प्राप्त होता है। |
| [operator+](./operator+/)(const Decimal\&) const | एक नया [Decimal](./) क्लास का उदाहरण लौटाता है जो वर्तमान और निर्दिष्ट ऑब्जेक्ट्स द्वारा प्रतिनिधित्व किए गए मानों के योग को दर्शाता है। |
| [operator++](./operator++/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को बढ़ाता है। |
| [operator+=](./operator+=/)(const Decimal\&) | वर्तमान ऑब्जेक्ट को एक नया मान असाइन करता है जो वर्तमान और निर्दिष्ट ऑब्जेक्ट्स द्वारा प्रतिनिधित्व किए गए मानों के योग के बराबर होता है। |
| [operator-](./operator-/)(const Decimal\&) const | एक नया [Decimal](./) क्लास का उदाहरण लौटाता है जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को घटाने के परिणाम को दर्शाता है। |
| [operator-](./operator-/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान के नकारात्मक करने से प्राप्त मान का प्रतिनिधित्व करने वाली [Decimal](./) क्लास की नई इंस्टेंस लौटाता है। |
| [operator--](./operator--/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को घटाता है। |
| [operator-=](./operator-=/)(const Decimal\&) | वर्तमान ऑब्जेक्ट को एक नया मान असाइन करता है जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को घटाने का परिणाम है। |
| [operator/](./operator//)(const Decimal\&) const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से विभाजित करने के परिणामस्वरूप प्राप्त मान का प्रतिनिधित्व करने वाली [Decimal](./) क्लास की नई इंस्टेंस लौटाता है। |
| [operator/=](./operator/=/)(const Decimal\&) | वर्तमान ऑब्जेक्ट को एक नया मान असाइन करता है जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से विभाजित करने का परिणाम है। |
| [operator<](./operator_/)(const Decimal\&) const | निर्धारित करता है कि क्या वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से छोटा है। |
| [operator<=](./operator_=/)(const Decimal\&) const | निर्धारित करता है कि क्या वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से कम या बराबर है। |
| [operator=](./operator=/)(const Decimal\&) | निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को वर्तमान ऑब्जेक्ट को असाइन करता है। |
| [operator==](./operator==/)(const Decimal\&) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट और निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान समान हैं या नहीं। |
| [operator==](./operator==/)(std::nullptr_t) const | निर्धारित करता है कि क्या वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया मान 0 है। |
| [operator>](./operator_/)(const Decimal\&) const | निर्धारित करता है कि क्या वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से बड़ा है। |
| [operator>=](./operator_=/)(const Decimal\&) const | निर्धारित करता है कि क्या वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से बड़ा या बराबर है। |
| static [Parse](./parse/)(const String\&) | दशमलव संख्या की स्ट्रिंग प्रतिनिधित्व को समान [Decimal](./) क्लास की इंस्टेंस में परिवर्तित करता है। |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles) | दशमलव संख्या की स्ट्रिंग प्रतिनिधित्व को निर्दिष्ट शैली का उपयोग करके समान [Decimal](./) क्लास की इंस्टेंस में परिवर्तित करता है। |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | दशमलव संख्या की स्ट्रिंग प्रतिनिधित्व को निर्दिष्ट फ़ॉर्मेट प्रदाता का उपयोग करके समान [Decimal](./) क्लास की इंस्टेंस में परिवर्तित करता है। |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | दशमलव संख्या की स्ट्रिंग प्रतिनिधित्व को निर्दिष्ट शैली और फ़ॉर्मेट प्रदाता का उपयोग करके समान [Decimal](./) क्लास की इंस्टेंस में परिवर्तित करता है। |
| static [Remainder](./remainder/)(const Decimal\&, const Decimal\&) | दो [Decimal](./) मानों को विभाजित करने के बाद शेषफल की गणना करता है। |
| static [Round](./round/)(const Decimal\&, MidpointRounding) | निर्दिष्ट मान को निकटतम पूर्णांक में गोल करता है। एक पैरामीटर निर्दिष्ट करता है कि यदि निर्दिष्ट मान दो निकटतम संख्याओं के बराबर दूरी पर हो तो फ़ंक्शन का व्यवहार क्या होगा। |
| static [Round](./round/)(const Decimal\&, int, MidpointRounding) | निर्दिष्ट मान को निर्दिष्ट दशांश अंकों की संख्या के साथ निकटतम मान में गोल करता है। एक पैरामीटर निर्दिष्ट करता है कि यदि निर्दिष्ट मान दो निकटतम संख्याओं के बराबर दूरी पर हो तो फ़ंक्शन का व्यवहार क्या होगा। |
| static [Subtract](./subtract/)(const Decimal\&, const Decimal\&) | एक निर्दिष्ट [Decimal](./) मान को दूसरे से घटाता है। |
| static [ToByte](./tobyte/)(Decimal) | [Decimal](./) मान को अनसाइन्ड 8-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToDouble](./todouble/)(Decimal) | [Decimal](./) मान को डबल प्रिसीजन फ्लोटिंग-पॉइंट संख्या में परिवर्तित करता है। |
| static [ToInt16](./toint16/)(Decimal) | [Decimal](./) मान को साइन्ड 16-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToInt32](./toint32/)(Decimal) | [Decimal](./) मान को साइन्ड 32-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToInt64](./toint64/)(Decimal) | [Decimal](./) मान को साइन्ड 64-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToOACurrency](./tooacurrency/)(const Decimal\&) | [Convert](../convert/) निर्दिष्ट [Decimal](./) मान को समान OLE मुद्रा मान में परिवर्तित करता है। लागू नहीं किया गया। |
| static [ToSByte](./tosbyte/)(Decimal) | दिए गए [Decimal](./) मान को साइन किए गए 8-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToSingle](./tosingle/)(Decimal) | दिए गए [Decimal](./) मान को सिंगल प्रिसिजन फ्लोटिंग-पॉइंट संख्या में परिवर्तित करता है। |
| [ToStdString](./tostdstring/)() const | ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान की स्ट्रिंग प्रतिनिधित्व को शामिल करने वाला std::string का एक इंस्टेंस लौटाता है। |
| [ToString](./tostring/)() const | ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान की स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | वर्तमान ऑब्जेक्ट को संस्कृति-विशिष्ट फ़ॉर्मेट जानकारी का उपयोग करके स्ट्रिंग में परिवर्तित करता है। |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const Decimal\&, std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | वर्तमान ऑब्जेक्ट को निर्दिष्ट स्ट्रिंग फ़ॉर्मेट और निर्दिष्ट [IFormatProvider](../iformatprovider/) ऑब्जेक्ट द्वारा प्रदान की गई संस्कृति-विशिष्ट फ़ॉर्मेट जानकारी का उपयोग करके उसकी स्ट्रिंग प्रतिनिधित्व में परिवर्तित करता है। |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToStringInternal](./tostringinternal/)() const | ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान की स्ट्रिंग प्रतिनिधित्व लौटाता है। आंतरिक उपयोग के लिए। |
| static [ToUInt16](./touint16/)(Decimal) | दिए गए [Decimal](./) मान को अनसाइन्ड 16-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToUInt32](./touint32/)(Decimal) | दिए गए [Decimal](./) मान को अनसाइन्ड 32-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToUInt64](./touint64/)(Decimal) | दिए गए [Decimal](./) मान को अनसाइन्ड 64-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [Truncate](./truncate/)(const Decimal\&) | निर्दिष्ट [Decimal](./) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान के समान पूर्णांक भाग वाला, सभी भिन्न अंकों को हटाकर, [Decimal](./) ऑब्जेक्ट लौटाता है। |
| static [TryParse](./tryparse/)(const String\&, Decimal\&) | संख्या की स्ट्रिंग प्रतिनिधित्व वाली निर्दिष्ट स्ट्रिंग को समकक्ष [Decimal](./) मान में परिवर्तित करता है। |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) | प्रदान की गई फ़ॉर्मेटिंग जानकारी और संख्या शैली का उपयोग करके, संख्या की स्ट्रिंग प्रतिनिधित्व वाली निर्दिष्ट स्ट्रिंग को समकक्ष [Decimal](./) मान में परिवर्तित करता है। |
| static [Type](./type/)() | [Decimal](./) क्लास की टाइप जानकारी का प्रतिनिधित्व करने वाले [TypeInfo](../typeinfo/) ऑब्जेक्ट का एक रेफ़रेंस लौटाता है। |
| [~Decimal](./~decimal/)() | डिस्ट्रक्टर। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [MaxValue](./maxvalue/) | [Decimal](./) क्लास द्वारा प्रतिनिधित्व किया जा सकने वाला सबसे बड़ा संख्या दर्शाता है। |
| static [MinusOne](./minusone/) | -1 संख्या दर्शाता है। |
| static [MinValue](./minvalue/) | [Decimal](./) क्लास द्वारा प्रतिनिधित्व किया जा सकने वाला सबसे छोटा संख्या दर्शाता है। |
| static [One](./one/) | 1 संख्या दर्शाता है। |
| static [Zero](./zero/) | 0 संख्या दर्शाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [number_type](./number_type/) | Detail::decimal_number_type के लिए एक उपनाम है। |
## टिप्पणियाँ



```cpp
#include "system/console.h"
#include "system/decimal.h"

int main()
{
  using namespace System;

  Console::WriteLine(Decimal::MinValue);
  Console::WriteLine(Decimal::MaxValue);

  auto dividend = Decimal::One;
  auto divisor = 6;
  Console::WriteLine(dividend/divisor);

  return 0;
}
/*
This code example produces the following output:
-79228162514264337593543950335
79228162514264337593543950335
0,1666666666666666666666666667
*/
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
