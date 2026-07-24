---
title: "System::Drawing::StringFormat क्लास"
linktitle: "StringFormat"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::StringFormat क्लास। टेक्स्ट लेआउट जानकारी, डिस्प्ले मैनिपुलेशन और OpenType सुविधाओं को संलग्न करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2500
url: /hi/cpp/system.drawing/stringformat/
---
## StringFormat class


टेक्स्ट लेआउट जानकारी, डिस्प्ले मैनिपुलेशन और OpenType सुविधाओं को संलग्न करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class StringFormat : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() | वर्तमान ऑब्जेक्ट की एक सटीक प्रति लौटाता है। |
| [get_Alignment](./get_alignment/)() const | स्ट्रिंग की क्षैतिज संरेखण दर्शाने वाला मान लौटाता है। |
| [get_DigitSubstitutionLanguage](./get_digitsubstitutionlanguage/)() const | स्थानीय अंकों को पश्चिमी अंकों से बदलते समय उपयोग की जाने वाली भाषा दर्शाने वाला मान लौटाता है। |
| [get_DigitSubstitutionMethod](./get_digitsubstitutionmethod/)() const | अंक प्रतिस्थापन विधि लौटाता है। |
| [get_FormatFlags](./get_formatflags/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रिंग फ़ॉर्मेट को निर्दिष्ट करने वाले [StringFormatFlags](../stringformatflags/) का बिटवाइज़ संयोजन लौटाता है। |
| static [get_GenericDefault](./get_genericdefault/)() | एक सामान्य डिफ़ॉल्ट फ़ॉर्मेट का प्रतिनिधित्व करने वाला [StringFormat](./) ऑब्जेक्ट लौटाता है। |
| static [get_GenericTypographic](./get_generictypographic/)() | एक सामान्य टाइपोग्राफ़िक फ़ॉर्मेट का प्रतिनिधित्व करने वाला [StringFormat](./) ऑब्जेक्ट लौटाता है। |
| [get_HotkeyPrefix](./get_hotkeyprefix/)() const | हॉट की प्रीफ़िक्स कैसे प्रदर्शित होता है, यह दर्शाने वाला मान लौटाता है। |
| [get_LineAlignment](./get_linealignment/)() const | स्ट्रिंग की लंबवत संरेखण दर्शाने वाला मान लौटाता है। |
| [get_Trimming](./get_trimming/)() const | स्ट्रिंग को कैसे ट्रिम किया जाता है, यह दर्शाने वाला मान लौटाता है। |
| [GetCharacterRangesCount](./getcharacterrangescount/)() const | [CharacterRange](../characterrange/) एरे का आकार प्राप्त करता है। |
| [GetTabStops](./gettabstops/)(float\&) const | वर्तमान [StringFormat](./) ऑब्जेक्ट के टैब स्टॉप्स लौटाता है। |
| [set_Alignment](./set_alignment/)(StringAlignment) | स्ट्रिंग की क्षैतिज संरेखण सेट करता है। |
| [set_FormatFlags](./set_formatflags/)(StringFormatFlags) | स्ट्रिंग फ़ॉर्मेट फ़्लैग्स सेट करता है। |
| [set_HotkeyPrefix](./set_hotkeyprefix/)(Text::HotkeyPrefix) | हॉट की प्रीफ़िक्स को कैसे प्रदर्शित किया जाना चाहिए, यह निर्दिष्ट करने वाला मान सेट करता है। |
| [set_LineAlignment](./set_linealignment/)(StringAlignment) | स्ट्रिंग की लंबवत संरेखण सेट करता है। |
| [set_Trimming](./set_trimming/)(StringTrimming) | स्ट्रिंग को कैसे ट्रिम किया जाता है, यह निर्दिष्ट करने वाला मान सेट करता है। |
| [SetDigitSubstitution](./setdigitsubstitution/)(int32_t, StringDigitSubstitute) | अंक प्रतिस्थापन भाषा और विधि सेट करता है। |
| [SetMeasurableCharacterRanges](./setmeasurablecharacterranges/)(const ArrayPtr\<CharacterRange\>\&) | एक एरे सेट करता है जिसमें [CharacterRange](../characterrange/) ऑब्जेक्ट्स होते हैं जो MeasureCharacterRanges() मेथड के कॉल द्वारा मापी गई अक्षर रेंज को दर्शाते हैं। |
| [SetTabStops](./settabstops/)(float, const ArrayPtr\<float\>\&) | वर्तमान [StringFormat](./) ऑब्जेक्ट के टैब स्टॉप्स सेट करता है। |
| [StringFormat](./stringformat/)() | [StringFormat](./) क्लास का नया इंस्टेंस बनाता है। |
| [StringFormat](./stringformat/)(StringFormatFlags, int32_t) | निर्दिष्ट फ़ॉर्मेट फ़्लैग्स और भाषा के साथ [StringFormat](./) क्लास का नया इंस्टेंस बनाता है। |
| [StringFormat](./stringformat/)(const SharedPtr\<StringFormat\>\&) | कॉपी कंस्ट्रक्टर। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
