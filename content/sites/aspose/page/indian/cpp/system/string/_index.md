---
title: "System::String क्लास"
linktitle: "String"
second_title: "Aspose.Page C++ के लिए"
description: "System::String क्लास। लाइब्रेरी भर में उपयोग की जाने वाली स्ट्रिंग क्लास। कोड ट्रांसलेशन के समय C# System.String का विकल्प है। ऑप्टिमाइज़ेशन कारणों से इसे Object की सबक्लास नहीं माना जाता। इस टाइप को स्टैक पर अलोकेट किया जाना चाहिए और फ़ंक्शन्स को वैल्यू या रेफ़रेंस द्वारा पास किया जाना चाहिए। कभी भी System::SmartPtr क्लास का उपयोग इस टाइप के ऑब्जेक्ट्स को मैनेज करने के लिए न करें C++ में।"
type: docs
weight: 5800
url: /hi/cpp/system/string/
---
## String class


[String](./) class used across the library. Is a substitute for C# [System.String](./) when translating code. For optimization reasons, isn't considered an [Object](../object/) subclass. This type should be allocated on stack and passed to functions by value or by reference. Never use [System::SmartPtr](../smartptr/) class to manage objects of this type.

```cpp
class String
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ASPOSECPP_VALUE_TYPE_IMPLEMENTS_INTERFACES](./asposecpp_value_type_implements_interfaces/)() | [String](./) C++ साइड पर वैल्यू टाइप है जो अप्रत्यक्ष रूप से (बिना इनहेरिटेंस के) कुछ इंटरफ़ेसेस को इम्प्लीमेंट करता है। |
| [begin](./begin/)() const | वास्तविक स्ट्रिंग बफ़र की शुरुआत की ओर पॉइंटर लौटाता है। कुछ भी पुनः आवंटित नहीं करता। बफ़र को शून्य-समाप्त नहीं होने की गारंटी नहीं देता। |
| [Clone](./clone/)() const | वर्तमान स्ट्रिंग की एक प्रति बनाता है। |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool) | लेस-इक्वल-ग्रेटर दो उपस्ट्रिंग्स की तुलना करता है। |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | लेस-इक्वल-ग्रेटर दो उपस्ट्रिंग्स की तुलना करता है। |
| static [Compare](./compare/)(const String\&, const String\&, System::StringComparison) | लेस-इक्वल-ग्रेटर दो स्ट्रिंग्स की तुलना करता है। |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, System::StringComparison) | लेस-इक्वल-ग्रेटर दो स्ट्रिंग्स की तुलना करता है। |
| static [Compare](./compare/)(const String\&, const String\&, bool) | लेस-इक्वल-ग्रेटर दो स्ट्रिंग्स की तुलना करता है। |
| static [Compare](./compare/)(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | लेस-इक्वल-ग्रेटर दो स्ट्रिंग्स की तुलना करता है। |
| static [CompareOrdinal](./compareordinal/)(const String\&, const String\&) | लेस-इक्वल-ग्रेटर ऑर्डिनल मोड का उपयोग करके दो स्ट्रिंग्स की तुलना करता है। |
| static [CompareOrdinal](./compareordinal/)(const String\&, int, const String\&, int, int) | लेस-इक्वल-ग्रेटर ऑर्डिनल मोड का उपयोग करके दो स्ट्रिंग्स की तुलना करता है। |
| [CompareTo](./compareto/)(const String\&) const | दो स्ट्रिंग्स की तुलना 'लेस-इक्वल्स-मोर' शैली में करता है। वर्तमान संस्कृति का उपयोग करता है। |
| static [Concat](./concat/)(const ArrayPtr\<String\>\&) | स्ट्रिंग्स को जोड़ता है। |
| static [Concat](./concat/)(const String\&, const String\&) | स्ट्रिंग्स को जोड़ता है। |
| static [Concat](./concat/)(const String\&, const String\&, const String\&) | स्ट्रिंग्स को जोड़ता है। |
| static [Concat](./concat/)(const String\&, const String\&, const String\&, const String\&) | स्ट्रिंग्स को जोड़ता है। |
| [Contains](./contains/)(const String\&) const | जाँचता है कि str वर्तमान स्ट्रिंग का उपस्ट्रिंग है या नहीं। |
| [Contains](./contains/)(char16_t) const | जाँचता है कि स्ट्रिंग में दिया गया अक्षर मौजूद है या नहीं। |
| static [Copy](./copy/)(const String\&) | स्ट्रिंग की प्रति बनाता है। |
| [CopyTo](./copyto/)(int, const ArrayPtr\<char_t\>\&, int, int) const | स्ट्रिंग के अक्षरों को मौजूदा एरे तत्वों में कॉपी करता है। कोई आकार परिवर्तन नहीं किया जाता। |
| [end](./end/)() const | वास्तविक स्ट्रिंग बफ़र के अंत की ओर पॉइंटर लौटाता है। कुछ भी पुनः आवंटित नहीं करता। बफ़र को शून्य-समाप्त नहीं होने की गारंटी नहीं देता। |
| [EndsWith](./endswith/)(const String\&) const | जाँचता है कि स्ट्रिंग निर्दिष्ट उपस्ट्रिंग के साथ समाप्त होती है या नहीं। |
| [EndsWith](./endswith/)(const String\&, System::StringComparison) const | जाँचता है कि स्ट्रिंग निर्दिष्ट उपस्ट्रिंग के साथ समाप्त होती है या नहीं। |
| [EndsWith](./endswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | जाँचता है कि स्ट्रिंग निर्दिष्ट उपस्ट्रिंग के साथ समाप्त होती है या नहीं। |
| [Equals](./equals/)(const String\&, System::StringComparison) const | [String](./) समानता तुलना। कई मोड्स जो [StringComparison](../stringcomparison/) enumeration द्वारा प्रदान किए गए हैं, समर्थित हैं। |
| [Equals](./equals/)(const String\&) const | [String](./) समानता तुलना। [System::StringComparison::Ordinal](../stringcomparison/) तुलना मोड का उपयोग करता है। |
| static [Equals](./equals/)(const String\&, const String\&) | इक्वल दो स्ट्रिंग्स की तुलना ऑर्डिनल तुलना मोड का उपयोग करके करता है। |
| static [Equals](./equals/)(const String\&, const String\&, System::StringComparison) | इक्वल दो स्ट्रिंग्स की तुलना करता है। |
| [FastToAscii](./fasttoascii/)(char, int) const | [String](./) को ASCII स्ट्रिंग में बदलने का प्रयास करता है। |
| static [Format](./format/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const Args\&...) | स्ट्रिंग को C# शैली में फॉर्मेट करता है। |
| static [Format](./format/)(std::nullptr_t, const String\&, const Args\&...) | स्ट्रिंग को C# शैली में फॉर्मेट करता है। |
| static [Format](./format/)(std::nullptr_t, const char16_t(&), const Args\&...) | स्ट्रिंग को C# शैली में फॉर्मेट करता है। |
| static [Format](./format/)(const String\&, const Args\&...) | स्ट्रिंग को C# शैली में फॉर्मेट करता है। |
| static [Format](./format/)(const String\&, const System::ArrayPtr\<T\>\&) | स्ट्रिंग को C# शैली में फॉर्मेट करता है। |
| static [FromAscii](./fromascii/)(const char *) | ASCII स्ट्रिंग से [String](./) बनाता है। |
| static [FromAscii](./fromascii/)(const char *, int) | ASCII स्ट्रिंग से [String](./) बनाता है। |
| static [FromAscii](./fromascii/)(const std::string\&) | ASCII स्ट्रिंग से [String](./) बनाता है। |
| static [FromUtf16](./fromutf16/)(const std::u16string\&) | utf16 स्ट्रिंग से [String](./) बनाता है। |
| static [FromUtf32](./fromutf32/)(const uint32_t *, int32_t) | utf32 स्ट्रिंग से [String](./) बनाता है। |
| static [FromUtf8](./fromutf8/)(const char *) | utf8 स्ट्रिंग से [String](./) बनाता है। |
| static [FromUtf8](./fromutf8/)(const char *, int) | utf8 स्ट्रिंग से [String](./) बनाता है। |
| static [FromUtf8](./fromutf8/)(const uint8_t *) | utf8 स्ट्रिंग से [String](./) बनाता है। |
| static [FromUtf8](./fromutf8/)(const std::string\&) | utf8 स्ट्रिंग से [String](./) बनाता है। |
| static [FromWCS](./fromwcs/)(const std::wstring\&) | widestring से [String](./) बनाता है। |
| [get_Length](./get_length/)() const | स्ट्रिंग की लंबाई प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const | हैशेस वाले स्ट्रिंग। ICU में लागू किया गया, C# में हैशेस से मेल नहीं खाता। |
| [IndexOf](./indexof/)(const String\&, System::StringComparison) const | सबस्ट्रिंग आगे की खोज। |
| [IndexOf](./indexof/)(char_t, int) const | अक्षर आगे की खोज। |
| [IndexOf](./indexof/)(char_t, int, int) const | सबस्ट्रिंग में अक्षर आगे की खोज। |
| [IndexOf](./indexof/)(const String\&, int) const | सबस्ट्रिंग आगे की खोज। |
| [IndexOf](./indexof/)(const String\&, int, System::StringComparison) const | सबस्ट्रिंग आगे की खोज। |
| [IndexOf](./indexof/)(const String\&, int, int, System::StringComparison) const | सबस्ट्रिंग आगे की खोज। |
| [IndexOf](./indexof/)(const String\&, int, int) const | सबस्ट्रिंग आगे की खोज। |
| [IndexOfAny](./indexofany/)(char_t, int) const | अक्षर आगे की खोज। |
| [IndexOfAny](./indexofany/)(const String\&, int) const | इसलिए यह इस में str के सभी अक्षरों की खोज करता है। यदि पहला अक्षर मिला, तो उसकी स्थिति लौटाई जाती है, अन्यथा दूसरा अक्षर और आगे की खोज की जाती है। |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&) const | पूरे स्ट्रिंग में पास किए गए किसी भी अक्षर की खोज करता है। पहले स्ट्रिंग अक्षर की तुलना anyOf के सभी अक्षरों से करता है, फिर दूसरे की और आगे भी। लक्ष्य अक्षरों में से किसी से मेल खाने वाले पहले अक्षर का इंडेक्स लौटाता है। |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | सबस्ट्रिंग में पास किए गए किसी भी अक्षर की खोज करता है। पहले स्ट्रिंग अक्षर की तुलना anyOf के सभी अक्षरों से करता है, फिर दूसरे की और आगे भी। लक्ष्य अक्षरों में से किसी से मेल खाने वाले पहले अक्षर का इंडेक्स लौटाता है। |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | सबस्ट्रिंग में पास किए गए किसी भी अक्षर की खोज करता है। पहले स्ट्रिंग अक्षर की तुलना anyOf के सभी अक्षरों से करता है, फिर दूसरे की और आगे भी। लक्ष्य अक्षरों में से किसी से मेल खाने वाले पहले अक्षर का इंडेक्स लौटाता है। |
| [Insert](./insert/)(int, const String\&) const | निर्दिष्ट स्थिति पर सबस्ट्रिंग डालता है। |
| [Is](./is/)(const System::TypeInfo\&) const | जाँचता है कि स्ट्रिंग ऑब्जेक्ट पास किए गए [TypeInfo](../typeinfo/) द्वारा निर्दिष्ट प्रकार का है या नहीं। |
| [IsAsciiString](./isasciistring/)() const | बताता है कि क्या एक [String](./) में केवल ASCII प्रतीक हैं। |
| [IsEmpty](./isempty/)() const | जाँचता है कि स्ट्रिंग न तो null है और न ही खाली है। |
| [IsNormalized](./isnormalized/)(System::Text::NormalizationForm) const | जाँचता है कि यूनिकोड स्ट्रिंग निर्दिष्ट नॉर्मलाइज़ेशन फ़ॉर्म का उपयोग करके सामान्यीकृत है या नहीं। |
| [IsNull](./isnull/)() const | जाँचता है कि स्ट्रिंग को null माना जाता है या नहीं। [String](./) केवल तब null होती है जब इसे [String()](./string/) कन्स्ट्रक्टर से बनाया गया हो, स्थानांतरित, कॉपी या null स्ट्रिंग से असाइन किया गया हो या [reset()](./reset/) मेथड को कॉल किया गया हो। |
| [IsNullOrEmpty](./isnullorempty/)() const | जाँचता है कि स्ट्रिंग खाली है या इसे null माना जाता है। |
| static [IsNullOrEmpty](./isnullorempty/)(const String\&) | जाँचता है कि पास की गई स्ट्रिंग null है या खाली है। |
| static [IsNullOrWhiteSpace](./isnullorwhitespace/)(const String\&) | बताता है कि निर्दिष्ट स्ट्रिंग null है, खाली है, या केवल व्हाइट-स्पेस अक्षरों से बनी है। |
| static [Join](./join/)(const String\&, const ArrayPtr\<String\>\&, int, int) | ऐरे को स्ट्रिंग को विभाजक के रूप में उपयोग करके जोड़ता है। |
| static [Join](./join/)(const String\&, const System::Details::ArrayView\<String\>\&, int, int) | ऐरे को स्ट्रिंग को विभाजक के रूप में उपयोग करके जोड़ता है। |
| static [Join](./join/)(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) | ऐरे को स्ट्रिंग को विभाजक के रूप में उपयोग करके जोड़ता है। |
| static [Join](./join/)(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) | ऐरे को स्ट्रिंग को विभाजक के रूप में उपयोग करके जोड़ता है। |
| [LastIndexOf](./lastindexof/)(const String\&, int) const | सबस्ट्रिंग पीछे की खोज। |
| [LastIndexOf](./lastindexof/)(const String\&, System::StringComparison) const | सबस्ट्रिंग पीछे की खोज। |
| [LastIndexOf](./lastindexof/)(const String\&, int, System::StringComparison) const | सबस्ट्रिंग पीछे की खोज। |
| [LastIndexOf](./lastindexof/)(const String\&, int, int, StringComparison) const | सबस्ट्रिंग पीछे की खोज। |
| [LastIndexOf](./lastindexof/)(char_t) const | अक्षर पीछे की खोज। |
| [LastIndexOf](./lastindexof/)(char_t, int32_t) const | अक्षर पीछे की खोज। |
| [LastIndexOf](./lastindexof/)(char_t, int32_t, int32_t) const | अक्षर पीछे की खोज। |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&) const | पूरे स्ट्रिंग में पास किए गए किसी भी अक्षर की पीछे की ओर खोज करता है। अंतिम स्ट्रिंग अक्षर की तुलना anyOf के सभी अक्षरों से करता है, फिर पिछले अक्षर और आगे भी। मिलने वाले पहले मेल का इंडेक्स लौटाता है। |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | सबस्ट्रिंग में पास किए गए किसी भी अक्षर की पीछे की ओर खोज करता है। अंतिम स्ट्रिंग अक्षर की तुलना anyOf के सभी अक्षरों से करता है, फिर पिछले अक्षर और आगे भी। मिलने वाले पहले मेल का इंडेक्स लौटाता है। |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | सबस्ट्रिंग में पास किए गए किसी भी अक्षर की पीछे की ओर खोज करता है। अंतिम स्ट्रिंग अक्षर की तुलना anyOf के सभी अक्षरों से करता है, फिर पिछले अक्षर और आगे भी। मिलने वाले पहले मेल का इंडेक्स लौटाता है। |
| [Normalize](./normalize/)(System::Text::NormalizationForm) const | निर्दिष्ट नॉर्मलाइज़ेशन फ़ॉर्म का उपयोग करके यूनिकोड स्ट्रिंग को सामान्यीकृत करता है। |
| [operator!=](./operator!=/)(const String\&) const | असमानता तुलना ऑपरेटर। |
| [operator!=](./operator!=/)(std::nullptr_t) const | जाँचता है कि स्ट्रिंग null नहीं है। यह वही तर्क लागू करता है जैसा कि [IsNull()](./isnull/) कॉल में है। |
| [operator+](./operator+/)(const String\&) const | [String](./) संयोजन ऑपरेटर। |
| [operator+](./operator+/)(const T\&) const | [String](./) स्ट्रिंग लिटरल या कैरेक्टर स्ट्रिंग पॉइंटर के साथ संयोजन। |
| [operator+](./operator+/)(char_t) const | स्ट्रिंग के अंत में कैरेक्टर जोड़ता है। |
| [operator+](./operator+/)(int) const | स्ट्रिंग के अंत में पूर्णांक मान की स्ट्रिंग प्रतिनिधित्व जोड़ता है। |
| [operator+](./operator+/)(uint32_t) const | स्ट्रिंग के अंत में अनसाइन्ड पूर्णांक मान की स्ट्रिंग प्रतिनिधित्व जोड़ता है। |
| [operator+](./operator+/)(double) const | स्ट्रिंग के अंत में फ्लोटिंग पॉइंट मान की स्ट्रिंग प्रतिनिधित्व जोड़ता है। |
| [operator+](./operator+/)(int64_t) const | स्ट्रिंग के अंत में पूर्णांक मान की स्ट्रिंग प्रतिनिधित्व जोड़ता है। |
| [operator+](./operator+/)(const T\&) const | स्ट्रिंग के अंत में रेफ़रेंस टाइप ऑब्जेक्ट की स्ट्रिंग प्रतिनिधित्व जोड़ता है। |
| [operator+](./operator+/)(const T\&) const | स्ट्रिंग के अंत में रेफ़रेंस टाइप ऑब्जेक्ट की स्ट्रिंग प्रतिनिधित्व जोड़ता है। |
| [operator+](./operator+/)(T) const | स्ट्रिंग के अंत में बूलियन मान की स्ट्रिंग प्रतिनिधित्व जोड़ता है। |
| [operator+=](./operator+=/)(char_t) | संयोजन असाइनमेंट ऑपरेटर। |
| [operator+=](./operator+=/)(const String\&) | संयोजन असाइनमेंट ऑपरेटर। |
| [operator+=](./operator+=/)(double) | संयोजन असाइनमेंट ऑपरेटर। |
| [operator+=](./operator+=/)(uint8_t) | संयोजन असाइनमेंट ऑपरेटर। |
| [operator+=](./operator+=/)(int16_t) | संयोजन असाइनमेंट ऑपरेटर। |
| [operator+=](./operator+=/)(uint16_t) | संयोजन असाइनमेंट ऑपरेटर। |
| [operator+=](./operator+=/)(int32_t) | संयोजन असाइनमेंट ऑपरेटर। |
| [operator+=](./operator+=/)(uint32_t) | संयोजन असाइनमेंट ऑपरेटर। |
| [operator+=](./operator+=/)(int64_t) | संयोजन असाइनमेंट ऑपरेटर। |
| [operator+=](./operator+=/)(uint64_t) | संयोजन असाइनमेंट ऑपरेटर। |
| [operator+=](./operator+=/)(T) | संयोजन असाइनमेंट ऑपरेटर। |
| [operator<](./operator_/)(const String\&) const | स्ट्रिंग्स की क्रम तुलना करता है। |
| [operator=](./operator=/)(const String\&) | असाइनमेंट ऑपरेटर। |
| [operator=](./operator=/)(String\&&) | मूव असाइनमेंट ऑपरेटर। |
| [operator==](./operator==/)(const String\&) const | समानता तुलना ऑपरेटर। |
| [operator==](./operator==/)(std::nullptr_t) const | जाँचता है कि स्ट्रिंग null है या नहीं। वही तर्क लागू करता है जैसा कि [IsNull()](./isnull/) कॉल में है। |
| [operator>](./operator_/)(const String\&) const | स्ट्रिंग्स की क्रम तुलना करता है। |
| [operator[]](./operator[]/)(int) const | निर्दिष्ट स्थिति पर कैरेक्टर प्राप्त करता है। |
| [PadLeft](./padleft/)(int, char_t) const | मूल स्ट्रिंग के बाएँ तरफ पैडिंग जोड़ता है। |
| [PadRight](./padright/)(int, char_t) const | मूल स्ट्रिंग के दाएँ तरफ पैडिंग जोड़ता है। |
| [rbegin](./rbegin/)() const | वास्तविक स्ट्रिंग बफ़र के अंतिम कैरेक्टर (यदि कोई हो) के लिए रिवर्स इटररेटर लौटाता है। |
| [Remove](./remove/)(int32_t, int32_t) const | वर्तमान स्ट्रिंग से सबस्ट्रिंग को छोड़कर सभी को निकालता है। |
| [rend](./rend/)() const | वास्तविक स्ट्रिंग बफ़र के पहले कैरेक्टर से पहले (यदि कोई हो) के लिए रिवर्स इटररेटर लौटाता है। |
| [Replace](./replace/)(char_t, char_t) const | स्ट्रिंग में कैरेक्टर की सभी घटनाओं को बदलता है। |
| [Replace](./replace/)(const String\&, const String\&) const | इस स्ट्रिंग में लुकअप की सभी घटनाओं को बदलता है। |
| [reset](./reset/)() | स्ट्रिंग को null सेट करता है। यह C# में 'string_variable_name = null' के समान है। |
| [SetCharAt](./setcharat/)(int, char_t) | निर्दिष्ट स्थिति पर कैरेक्टर सेट करता है। |
| [Split](./split/)(char_t, StringSplitOptions) const | स्ट्रिंग को कैरेक्टर द्वारा विभाजित करता है। |
| [Split](./split/)(char_t, int32_t, StringSplitOptions) const | स्ट्रिंग को कैरेक्टर द्वारा विभाजित करता है। |
| [Split](./split/)(char_t, char_t, StringSplitOptions) const | स्ट्रिंग को दो में से एक कैरेक्टर द्वारा विभाजित करता है। |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, StringSplitOptions) const | निर्दिष्ट किए गए अक्षरों में से एक द्वारा स्ट्रिंग को विभाजित करता है। |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const | निर्दिष्ट किए गए अक्षरों में से एक द्वारा स्ट्रिंग को विभाजित करता है। |
| [Split](./split/)(const String\&, StringSplitOptions) const | सबस्ट्रिंग द्वारा स्ट्रिंग को विभाजित करता है। |
| [Split](./split/)(const String\&, int, StringSplitOptions) const | सबस्ट्रिंग द्वारा स्ट्रिंग को विभाजित करता है। |
| [Split](./split/)(const ArrayPtr\<String\>\&, StringSplitOptions) const | सबस्ट्रिंग द्वारा स्ट्रिंग को विभाजित करता है। |
| [Split](./split/)(const ArrayPtr\<String\>\&, int, StringSplitOptions) const | सबस्ट्रिंग द्वारा स्ट्रिंग को विभाजित करता है। वर्तमान में, केवल शून्य या एक तत्व वाले सेपरेटर एरे को समर्थन देता है। |
| [StartsWith](./startswith/)(const String\&) const | जाँचता है कि स्ट्रिंग निर्दिष्ट सबस्ट्रिंग से शुरू होती है या नहीं। |
| [StartsWith](./startswith/)(const String\&, System::StringComparison) const | जाँचता है कि स्ट्रिंग निर्दिष्ट सबस्ट्रिंग से शुरू होती है या नहीं। |
| [StartsWith](./startswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | जाँचता है कि स्ट्रिंग निर्दिष्ट सबस्ट्रिंग से शुरू होती है या नहीं। |
| [String](./string/)() | डिफ़ॉल्ट कंस्ट्रक्टर। एक स्ट्रिंग ऑब्जेक्ट बनाता है जिसे null माना जाता है। |
| [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) | स्ट्रिंग लिटरल के आधार पर स्ट्रिंग बनाता है। लिटरल को null-terminated स्ट्रिंग मानता है, लिटरल के आकार के आधार पर लक्ष्य स्ट्रिंग की लंबाई गणना करता है। |
| [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) | कैरेक्टर स्ट्रिंग पॉइंटर के आधार पर स्ट्रिंग बनाता है। पॉइंटेड स्ट्रिंग को null-terminated मानता है, null कैरेक्टर के आधार पर लक्ष्य स्ट्रिंग की लंबाई गणना करता है। |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) | स्ट्रिंग लिटरल के आधार पर स्ट्रिंग बनाता है। लिटरल को UTF8 में null-terminated स्ट्रिंग मानता है, लिटरल के आकार के आधार पर लक्ष्य स्ट्रिंग की लंबाई गणना करता है। |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) | कैरेक्टर स्ट्रिंग पॉइंटर के आधार पर स्ट्रिंग बनाता है। पॉइंटेड स्ट्रिंग को UTF8 में null-terminated मानता है, null कैरेक्टर के आधार पर लक्ष्य स्ट्रिंग की लंबाई गणना करता है। |
| [String](./string/)(const char16_t *, int) | कैरेक्टर स्ट्रिंग पॉइंटर और स्पष्ट लंबाई से स्ट्रिंग बनाता है। |
| [String](./string/)(const char *, int) | कैरेक्टर स्ट्रिंग पॉइंटर और स्पष्ट लंबाई से स्ट्रिंग बनाता है। |
| [String](./string/)(const char16_t *, int, int) | शुरुआती स्थिति से लंबाई का उपयोग करके कैरेक्टर स्ट्रिंग पॉइंटर से स्ट्रिंग बनाता है। |
| explicit [String](./string/)(const char16_t, int) | फ़िल कंस्ट्रक्टर। |
| [String](./string/)(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) | नलपॉइंट कंस्ट्रक्टर। अन्य टेम्प्लेट कंस्ट्रक्टर्स के साथ प्राथमिकताओं को हल करने के लिए टेम्प्लेट के रूप में घोषित किया गया है। |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) | वाइडस्ट्रिंग लिटरल के आधार पर स्ट्रिंग बनाता है। लिटरल को null-terminated स्ट्रिंग मानता है, लिटरल के आकार के आधार पर लक्ष्य स्ट्रिंग की लंबाई गणना करता है। कुछ प्लेटफ़ॉर्म पर wchar_t से रूपांतरण समय-साध्य है, इसलिए कोई अप्रत्यक्ष रूपांतरण अनुमति नहीं है। |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) | वाइडकैरेक्टर स्ट्रिंग पॉइंटर के आधार पर स्ट्रिंग बनाता है। पॉइंटेड स्ट्रिंग को null-terminated मानता है, null कैरेक्टर के आधार पर लक्ष्य स्ट्रिंग की लंबाई गणना करता है। कुछ प्लेटफ़ॉर्म पर wchar_t से रूपांतरण समय-साध्य है, इसलिए कोई अप्रत्यक्ष रूपांतरण अनुमति नहीं है। |
| explicit [String](./string/)(const wchar_t *, int) | वाइडकैरेक्टर स्ट्रिंग पॉइंटर और स्पष्ट लंबाई से स्ट्रिंग बनाता है। कुछ प्लेटफ़ॉर्म पर wchar_t से रूपांतरण समय-साध्य है, इसलिए कोई अप्रत्यक्ष रूपांतरण अनुमति नहीं है। |
| explicit [String](./string/)(const wchar_t, int) | फ़िल कंस्ट्रक्टर। कुछ प्लेटफ़ॉर्म पर wchar_t से रूपांतरण समय-साध्य है, इसलिए कोई अप्रत्यक्ष रूपांतरण अनुमति नहीं है। |
| [String](./string/)(const String\&) | कॉपी कंस्ट्रक्टर। |
| [String](./string/)(String\&&) | मूव कंस्ट्रक्टर। |
| [String](./string/)(const ArrayPtr\<char16_t\>\&) | पूरे कैरेक्टर एरे को स्ट्रिंग में परिवर्तित करता है। |
| [String](./string/)(const ArrayPtr\<char16_t\>\&, int, int) | कैरेक्टर एरे की उप-रेंज को स्ट्रिंग में परिवर्तित करता है। यदि पैरामीटर एरे की सीमा से बाहर हैं, तो खाली स्ट्रिंग बनाई जाती है। |
| explicit [String](./string/)(const codeporting_icu::UnicodeString\&) | UnicodeString को [String](./) में रैप करता है। |
| explicit [String](./string/)(codeporting_icu::UnicodeString\&&) | मूव कंस्ट्रक्टर। |
| explicit [String](./string/)(const std::wstring\&) | widestring से [String](./) बनाता है। |
| explicit [String](./string/)(const std::u16string\&) | utf16 स्ट्रिंग से [String](./) बनाता है। |
| explicit [String](./string/)(const std::string\&) | UTF-8 फ़ॉर्मेट में प्रस्तुत std::string स्ट्रिंग से [String](./) बनाता है। |
| explicit [String](./string/)(const std::u32string\&) | std::u32string स्ट्रिंग से [String](./) बनाता है। |
| [Substring](./substring/)(int32_t) const | सबस्ट्रिंग निकालता है। |
| [Substring](./substring/)(int32_t, int32_t) const | सबस्ट्रिंग निकालता है। |
| [ToAsciiString](./toasciistring/)() const | स्ट्रिंग को std::string में परिवर्तित करता है। ASCII एन्कोडिंग का उपयोग करता है। |
| [ToByteArray](./tobytearray/)(int32_t, int32_t, bool) const | स्ट्रिंग या सबस्ट्रिंग को बाइट्स की एरे में परिवर्तित करता है। |
| [ToCharArray](./tochararray/)(int32_t, int32_t) const | स्ट्रिंग या सबस्ट्रिंग को अक्षरों की एरे में बदलता है। |
| [ToLower](./tolower/)() const | स्ट्रिंग के सभी अक्षरों को लोअर केस में बदलता है। |
| [ToLower](./tolower/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | विशिष्ट संस्कृति का उपयोग करके स्ट्रिंग के सभी अक्षरों को लोअर केस में बदलता है। |
| [ToLowerInvariant](./tolowerinvariant/)() const | इनवेरिएंट संस्कृति का उपयोग करके स्ट्रिंग के सभी अक्षरों को लोअर केस में बदलता है। |
| [ToString](./tostring/)() const | वैल्यू टाइप ऑब्जेक्ट्स पर [ToString()](./tostring/) कॉल किए जाने वाले संदर्भों में [String](./) क्लास को संभालने के लिए रैपर। |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | वैल्यू टाइप ऑब्जेक्ट्स पर [ToString()](./tostring/) कॉल किए जाने वाले संदर्भों में [String](./) क्लास को संभालने के लिए रैपर। |
| [ToU16Str](./tou16str/)() const | स्ट्रिंग को std::u16string में बदलता है। |
| [ToU32Str](./tou32str/)() const | स्ट्रिंग को std::u32string में बदलता है। |
| [ToUpper](./toupper/)() const | स्ट्रिंग के सभी अक्षरों को अपर केस में बदलता है। |
| [ToUpper](./toupper/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | विशिष्ट संस्कृति का उपयोग करके स्ट्रिंग के सभी अक्षरों को अपर केस में बदलता है। |
| [ToUpperInvariant](./toupperinvariant/)() const | इनवेरिएंट संस्कृति का उपयोग करके स्ट्रिंग के सभी अक्षरों को अपर केस में बदलता है। |
| [ToUtf8String](./toutf8string/)() const | स्ट्रिंग को std::string में बदलता है। UTF-8 एन्कोडिंग का उपयोग करता है। |
| [ToWCS](./towcs/)() const | स्ट्रिंग को std::wstring में बदलता है। |
| [Trim](./trim/)() const | स्ट्रिंग की शुरुआत और अंत दोनों से सभी व्हाइटस्पेस अक्षरों को हटाता है। |
| [Trim](./trim/)(char_t) const | स्ट्रिंग की शुरुआत और अंत दोनों से पास किए गए अक्षर की सभी घटनाओं को हटाता है। |
| [Trim](./trim/)(const String\&) const | स्ट्रिंग की शुरुआत और अंत दोनों से पास किए गए अक्षरों की सभी घटनाओं को हटाता है। |
| [Trim](./trim/)(const ArrayPtr\<char_t\>\&) const | स्ट्रिंग की शुरुआत और अंत दोनों से पास किए गए अक्षरों की सभी घटनाओं को हटाता है। |
| [TrimEnd](./trimend/)() const | स्ट्रिंग के अंत से सभी व्हाइटस्पेस अक्षरों को हटाता है। |
| [TrimEnd](./trimend/)(char_t) const | स्ट्रिंग के अंत से पास किए गए अक्षर की सभी घटनाओं को हटाता है। |
| [TrimEnd](./trimend/)(const String\&) const | स्ट्रिंग के अंत से पास किए गए अक्षरों की सभी घटनाओं को हटाता है। |
| [TrimEnd](./trimend/)(const ArrayPtr\<char_t\>\&) const | स्ट्रिंग के अंत से पास किए गए अक्षरों की सभी घटनाओं को हटाता है। |
| [TrimStart](./trimstart/)() const | स्ट्रिंग की शुरुआत से सभी व्हाइटस्पेस अक्षरों को हटाता है। |
| [TrimStart](./trimstart/)(char_t) const | स्ट्रिंग की शुरुआत से पास किए गए अक्षर की सभी घटनाओं को हटाता है। |
| [TrimStart](./trimstart/)(const String\&) const | स्ट्रिंग की शुरुआत से पास किए गए अक्षरों की सभी घटनाओं को हटाता है। |
| [TrimStart](./trimstart/)(const ArrayPtr\<char_t\>\&) const | स्ट्रिंग की शुरुआत से पास किए गए अक्षरों की सभी घटनाओं को हटाता है। |
| [u_str](./u_str/)() const | ICU-शैली का नल-टर्मिनेटेड बफ़र लौटाता है। स्ट्रिंग को पुनः आवंटित कर सकता है। |
| [~String](./~string/)() | डिस्ट्रक्टर। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Empty](./empty/) | खाली स्ट्रिंग। |
| static [Null](./null/) | नल स्ट्रिंग। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [reverse_iterator](./reverse_iterator/) | रिवर्स इटररेटर प्रकार। |
## टिप्पणियाँ



```cpp
#include "system/string.h"
#include <iostream>

int main()
{
  // अक्षरों की एरे से स्ट्रिंग बनाएं और उसे प्रिंट करें।
  const auto chars = {u'h', u'e', u'l', u'l', u'o'};
  const System::String string1(chars);
  std::cout << string1 << std::endl;

  // बाइट्स की array से एक string बनाएं और उसे प्रिंट करें।
  const uint8_t bytes[] = {0x77, 0x6f, 0x72, 0x6c, 0x64, 0x0};
  const auto string2 = System::String::FromUtf8(bytes);
  std::cout << string2 << std::endl;

  // नीचे दी गई string को trim करें और उसे प्रिंट करें।
  const System::String string3(u"   This string contains whitespaces in the beginning and at the end.   ");
  std::cout << '"' << string3.Trim() << '"' << std::endl;

  // वाक्यों की संख्या को प्रिंट करें।
  std::cout << "Number of words: " << string3.Trim().Split(' ')->get_Length() << std::endl;

  return 0;
}
/*
This code example produces the following output:
hello
world
"This string contains whitespaces in the beginning and at the end."
Number of words: 11
*/
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
