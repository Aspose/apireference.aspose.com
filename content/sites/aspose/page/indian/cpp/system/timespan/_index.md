---
title: "System::TimeSpan class"
linktitle: "TimeSpan"
second_title: "Aspose.Page C++ के लिए"
description: "System::TimeSpan class. एक समय अंतराल का प्रतिनिधित्व करता है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान या रेफ़रेंस द्वारा पास किया जाना चाहिए। C++ में इस प्रकार की वस्तुओं को प्रबंधित करने के लिए कभी भी System::SmartPtr class का उपयोग न करें।"
type: docs
weight: 6100
url: /hi/cpp/system/timespan/
---
## TimeSpan class


एक समय अंतराल का प्रतिनिधित्व करता है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान या रेफ़रेंस द्वारा पास किया जाना चाहिए। इस प्रकार की वस्तुओं को प्रबंधित करने के लिए कभी भी [System::SmartPtr](../smartptr/) class का उपयोग न करें।

```cpp
class TimeSpan
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(TimeSpan) const | एक नया [TimeSpan](./) क्लास इंस्टेंस लौटाता है जो एक समय अंतराल का प्रतिनिधित्व करता है, जो वर्तमान और निर्दिष्ट ऑब्जेक्ट्स द्वारा प्रतिनिधित्व किए गए समय अंतरालों के योग के बराबर होता है। |
| static [Compare](./compare/)(TimeSpan, TimeSpan) | दो [TimeSpan](./) ऑब्जेक्ट्स की तुलना करता है। |
| [CompareTo](./compareto/)(TimeSpan) const | वर्तमान और निर्दिष्ट ऑब्जेक्ट्स की तुलना करता है। |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | वर्तमान और निर्दिष्ट ऑब्जेक्ट्स की तुलना करता है। |
| [Duration](./duration/)() const | वर्तमान ऑब्जेक्ट के निरपेक्ष मान के बराबर मान वाला नया [TimeSpan](./) ऑब्जेक्ट लौटाता है। |
| [Equals](./equals/)(TimeSpan) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया समय अंतराल निर्दिष्ट ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल के बराबर है या नहीं। |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया समय अंतराल निर्दिष्ट ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल के बराबर है या नहीं। |
| static [Equals](./equals/)(TimeSpan, TimeSpan) | यदि निर्दिष्ट ऑब्जेक्ट समान समय अंतराल दर्शाते हैं तो true लौटाता है, अन्यथा false। |
| static [FromDays](./fromdays/)(double) | निर्दिष्ट अंतराल को दर्शाने वाला नया [TimeSpan](./) ऑब्जेक्ट लौटाता है। |
| static [FromHours](./fromhours/)(double) | निर्दिष्ट अंतराल को दर्शाने वाला नया [TimeSpan](./) ऑब्जेक्ट लौटाता है। |
| static [FromMilliseconds](./frommilliseconds/)(double) | निर्दिष्ट अंतराल को दर्शाने वाला नया [TimeSpan](./) ऑब्जेक्ट लौटाता है। |
| static [FromMinutes](./fromminutes/)(double) | निर्दिष्ट अंतराल को दर्शाने वाला नया [TimeSpan](./) ऑब्जेक्ट लौटाता है। |
| static [FromSeconds](./fromseconds/)(double) | निर्दिष्ट अंतराल को दर्शाने वाला नया [TimeSpan](./) ऑब्जेक्ट लौटाता है। |
| static [FromTicks](./fromticks/)(int64_t) | निर्दिष्ट अंतराल को दर्शाने वाला नया [TimeSpan](./) ऑब्जेक्ट लौटाता है। |
| [get_Days](./get_days/)() const | वर्तमान [TimeSpan](./) ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल का दिन घटक लौटाता है। |
| [get_Hours](./get_hours/)() const | वर्तमान [TimeSpan](./) ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल का घंटे घटक लौटाता है। |
| [get_Milliseconds](./get_milliseconds/)() const | वर्तमान [TimeSpan](./) ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल का मिलीसेकंड घटक लौटाता है। |
| [get_Minutes](./get_minutes/)() const | वर्तमान [TimeSpan](./) ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल का मिनट घटक लौटाता है। |
| [get_Seconds](./get_seconds/)() const | वर्तमान [TimeSpan](./) ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल का सेकंड घटक लौटाता है। |
| [get_Ticks](./get_ticks/)() const | वर्तमान [TimeSpan](./) ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल को बनाते हुए 100-नैनोसेकंड अंतरालों की संख्या लौटाता है। |
| [get_TotalDays](./get_totaldays/)() const | वर्तमान [TimeSpan](./) ऑब्जेक्ट का मान पूर्ण और अंशीय दिनों में व्यक्त करके लौटाता है। |
| [get_TotalHours](./get_totalhours/)() const | वर्तमान [TimeSpan](./) ऑब्जेक्ट का मान पूर्ण और अंशीय घंटों में व्यक्त करके लौटाता है। |
| [get_TotalMilliseconds](./get_totalmilliseconds/)() const | वर्तमान [TimeSpan](./) ऑब्जेक्ट का मान पूर्ण और अंशीय मिलीसेकंड में व्यक्त करके लौटाता है। |
| [get_TotalMinutes](./get_totalminutes/)() const | वर्तमान [TimeSpan](./) ऑब्जेक्ट का मान पूर्ण और अंशीय मिनटों में व्यक्त करके लौटाता है। |
| [get_TotalSeconds](./get_totalseconds/)() const | वर्तमान [TimeSpan](./) ऑब्जेक्ट का मान पूर्ण और अंशीय सेकंड में व्यक्त करके लौटाता है। |
| [GetHashCode](./gethashcode/)() const | वर्तमान ऑब्जेक्ट के लिए हैश कोड लौटाता है। |
| [IsNull](./isnull/)() const |  |
| [Negate](./negate/)() const | वर्तमान [TimeSpan](./) ऑब्जेक्ट द्वारा दर्शाए गए नकारात्मक मान को दर्शाने वाला नया [TimeSpan](./) ऑब्जेक्ट लौटाता है। |
| [operator!=](./operator!=/)(TimeSpan) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया समय अंतराल निर्दिष्ट ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल के बराबर नहीं है या नहीं। |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | एक नया [TimeSpan](./) क्लास इंस्टेंस लौटाता है जो एक समय अंतराल का प्रतिनिधित्व करता है, जो वर्तमान और निर्दिष्ट ऑब्जेक्ट्स द्वारा प्रतिनिधित्व किए गए समय अंतरालों के योग के बराबर होता है। |
| [operator+](./operator+/)() const | स्वयं लौटाता है। |
| [operator+=](./operator+=/)(TimeSpan) | वर्तमान ऑब्जेक्ट को वह समय अंतराल असाइन करता है जो वर्तमान और निर्दिष्ट ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल का योग है। |
| [operator-](./operator-/)(TimeSpan) const | वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल से निर्दिष्ट ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल को घटाने के परिणामस्वरूप प्राप्त समय अंतराल को दर्शाने वाली नई [TimeSpan](./) क्लास की इंस्टेंस लौटाता है। |
| [operator-](./operator-/)() const | वर्तमान [TimeSpan](./) ऑब्जेक्ट द्वारा दर्शाए गए नकारात्मक मान को दर्शाने वाला नया [TimeSpan](./) ऑब्जेक्ट लौटाता है। |
| [operator-=](./operator-=/)(TimeSpan) | वर्तमान ऑब्जेक्ट को वह समय अंतराल असाइन करता है जो वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल से निर्दिष्ट ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल को घटाने के परिणामस्वरूप प्राप्त होता है। |
| [operator/](./operator//)(double) const |  |
| [operator/](./operator//)(TimeSpan) const |  |
| [operator/=](./operator/=/)(double) |  |
| [operator<](./operator_/)(TimeSpan) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया समय अंतराल निर्दिष्ट ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल से छोटा है या नहीं। |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(TimeSpan) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया समय अंतराल निर्दिष्ट ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल से छोटा या बराबर है या नहीं। |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const TimeSpan\&) | निर्दिष्ट [TimeSpan](./) ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल को वर्तमान [TimeSpan](./) ऑब्जेक्ट पर सेट करता है। |
| [operator==](./operator==/)(TimeSpan) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया समय अंतराल निर्दिष्ट ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल के बराबर है या नहीं। |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(TimeSpan) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया समय अंतराल निर्दिष्ट ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल से लंबा है या नहीं। |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(TimeSpan) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया समय अंतराल निर्दिष्ट ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल से लंबा या बराबर है। |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | स्ट्रिंग को समतुल्य [TimeSpan](./) ऑब्जेक्ट में परिवर्तित करता है। |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | स्ट्रिंग को निर्दिष्ट फ़ॉर्मेट प्रदाता का उपयोग करके समतुल्य [TimeSpan](./) ऑब्जेक्ट में परिवर्तित करता है। |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | स्ट्रिंग को निर्दिष्ट फ़ॉर्मेट्स, फ़ॉर्मेट प्रदाता और शैलियों का उपयोग करके समतुल्य [TimeSpan](./) ऑब्जेक्ट में परिवर्तित करता है। |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | स्ट्रिंग को निर्दिष्ट फ़ॉर्मेट, फ़ॉर्मेट प्रदाता और शैलियों का उपयोग करके समतुल्य [TimeSpan](./) ऑब्जेक्ट में परिवर्तित करता है। |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| [Subtract](./subtract/)(TimeSpan) const | वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल से निर्दिष्ट ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल को घटाने के परिणामस्वरूप प्राप्त समय अंतराल को दर्शाने वाली नई [TimeSpan](./) क्लास की इंस्टेंस लौटाता है। |
| [TimeSpan](./timespan/)() | एक शून्य समय अंतराल को दर्शाने वाला [TimeSpan](./) ऑब्जेक्ट बनाता है। |
| explicit [TimeSpan](./timespan/)(int64_t) | निर्दिष्ट समय अंतराल को दर्शाने वाली [TimeSpan](./) क्लास का एक इंस्टेंस बनाता है। |
| [TimeSpan](./timespan/)(int, int, int) | निर्दिष्ट घंटों, मिनटों और सेकंडों की संख्या के योग के बराबर समय अंतराल को दर्शाने वाली [TimeSpan](./) क्लास का एक इंस्टेंस बनाता है। |
| [TimeSpan](./timespan/)(int, int, int, int, int) | निर्दिष्ट घंटों, मिनटों, सेकंडों और मिलीसेकंडों की संख्या के योग के बराबर समय अंतराल को दर्शाने वाली [TimeSpan](./) क्लास का एक इंस्टेंस बनाता है। |
| [TimeSpan](./timespan/)(const TimeSpan\&) | निर्दिष्ट [TimeSpan](./) ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल के बराबर समय अंतराल को दर्शाने वाला [TimeSpan](./) ऑब्जेक्ट बनाता है। |
| [ToString](./tostring/)() const | वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए समय अंतराल का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [ToString](./tostring/)(const String\&) const | वर्तमान ऑब्जेक्ट के मान को निर्दिष्ट फ़ॉर्मेट का उपयोग करके समतुल्य स्ट्रिंग प्रतिनिधित्व में परिवर्तित करता है। |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | वर्तमान ऑब्जेक्ट के मान को निर्दिष्ट फ़ॉर्मेट और फ़ॉर्मेट प्रदाता का उपयोग करके समतुल्य स्ट्रिंग प्रतिनिधित्व में परिवर्तित करता है। |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| static [TryParse](./tryparse/)(const String\&, TimeSpan\&) | स्ट्रिंग को समतुल्य [TimeSpan](./) ऑब्जेक्ट में परिवर्तित करता है और रूपांतरण का परिणाम लौटाता है। |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | स्ट्रिंग को निर्दिष्ट फ़ॉर्मेट प्रदाता का उपयोग करके समतुल्य [TimeSpan](./) ऑब्जेक्ट में परिवर्तित करता है और रूपांतरण का परिणाम लौटाता है। |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | स्ट्रिंग को निर्दिष्ट फ़ॉर्मेट्स और फ़ॉर्मेट प्रदाता का उपयोग करके समतुल्य [TimeSpan](./) ऑब्जेक्ट में परिवर्तित करता है, और रूपांतरण का परिणाम लौटाता है। |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | स्ट्रिंग को निर्दिष्ट फ़ॉर्मेट, फ़ॉर्मेट प्रदाता और शैलियों का उपयोग करके समतुल्य [TimeSpan](./) ऑब्जेक्ट में परिवर्तित करता है, और रूपांतरण का परिणाम लौटाता है। |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | स्ट्रिंग को निर्दिष्ट फ़ॉर्मेट्स, फ़ॉर्मेट प्रदाता और शैलियों का उपयोग करके समतुल्य [TimeSpan](./) ऑब्जेक्ट में परिवर्तित करता है, और रूपांतरण का परिणाम लौटाता है। |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | स्ट्रिंग को निर्दिष्ट फ़ॉर्मेट और फ़ॉर्मेट प्रदाता का उपयोग करके समतुल्य [TimeSpan](./) ऑब्जेक्ट में परिवर्तित करता है, और रूपांतरण का परिणाम लौटाता है। |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [Type](./type/)() | एक [TypeInfo](../typeinfo/) ऑब्जेक्ट लौटाता है जो [TimeSpan](./) संरचना को दर्शाता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [MaxValue](./maxvalue/) | [TimeSpan](./) ऑब्जेक्ट जो सबसे लंबा संभव अंतराल दर्शाता है। |
| static [MinValue](./minvalue/) | /// [TimeSpan](./) ऑब्जेक्ट जो सबसे छोटा संभव अंतराल दर्शाता है। |
| static constexpr [TicksPerDay](./ticksperday/) | एक दिन (24-घंटे का अंतराल) में 100-नैनोसेकंड अंतरालों की संख्या। |
| static constexpr [TicksPerHour](./ticksperhour/) | एक घंटे में 100-नैनोसेकंड अंतरालों की संख्या। |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | एक मिलीसेकंड में 100-नैनोसेकंड अंतरालों की संख्या। |
| static constexpr [TicksPerMinute](./ticksperminute/) | एक मिनट में 100-नैनोसेकंड अंतरालों की संख्या। |
| static constexpr [TicksPerSecond](./tickspersecond/) | एक सेकंड में 100-नैनोसेकंड अंतरालों की संख्या। |
| static [Zero](./zero/) | शून्य-अंतराल को दर्शाने वाला [TimeSpan](./) ऑब्जेक्ट। |
## टिप्पणियाँ



```cpp
#include "system/datetime.h"
#include "system/timespan.h"
#include <iostream>

int main()
{
  const auto date1 = System::DateTime(2021, 01, 01);
  const auto date2 = System::DateTime(2021, 10, 30);

  const auto interval = date2 - date1;

  std::cout << "Number of ticks: " << interval.get_Ticks() << std::endl;
  std::cout << "Number of milliseconds: " << interval.get_Milliseconds() << std::endl;
  std::cout << "Total number of milliseconds: " << interval.get_TotalMilliseconds() << std::endl;
  std::cout << "Number of minutes: " << interval.get_Minutes() << std::endl;
  std::cout << "Total number of minutes: " << interval.get_TotalMinutes() << std::endl;
  std::cout << "Number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Total number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Number of days: " << interval.get_Days() << std::endl;
  std::cout << "Total number of days: " << interval.get_TotalDays() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Number of ticks: 260928000000000
Number of milliseconds: 0
Total number of milliseconds: 2.60928e+10
Number of minutes: 0
Total number of minutes: 434880
Number of hours: 0
Total number of hours: 0
Number of days: 302
Total number of days: 302
*/
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
