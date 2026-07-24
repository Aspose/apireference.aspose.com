---
title: "System::Globalization::NumberFormatInfo क्लास"
linktitle: "NumberFormatInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::NumberFormatInfo क्लास। संख्याओं को फ़ॉर्मेट करने के बारे में जानकारी रखता है। सेट्टर ऑपरेशन्स केवल गैर-रीड‑ओनली ऑब्जेक्ट्स पर सक्षम होते हैं। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 1900
url: /hi/cpp/system.globalization/numberformatinfo/
---
## NumberFormatInfo class


संख्याओं को फ़ॉर्मेट करने के बारे में जानकारी रखता है। सेट्टर ऑपरेशन्स केवल गैर-रीड‑ओनली ऑब्जेक्ट्स पर सक्षम होते हैं। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class NumberFormatInfo : public virtual System::Object,
                         public System::IFormatProvider,
                         public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | फ़ॉर्मेट जानकारी को क्लोन करता है। |
| [get_CurrencyDecimalDigits](./get_currencydecimaldigits/)() const | मुद्रा दशमलव अंकों की संख्या प्राप्त करता है। |
| [get_CurrencyDecimalSeparator](./get_currencydecimalseparator/)() const | मुद्रा दशमलव विभाजक प्राप्त करता है। |
| [get_CurrencyGroupSeparator](./get_currencygroupseparator/)() const | मुद्रा समूह विभाजक प्राप्त करता है। |
| [get_CurrencyGroupSizes](./get_currencygroupsizes/)() const | प्रति समूह मुद्रा दशमलव अंकों की संख्या प्राप्त करता है। |
| [get_CurrencyNegativePattern](./get_currencynegativepattern/)() const | मुद्रा नकारात्मक पैटर्न प्राप्त करता है। |
| [get_CurrencyPositivePattern](./get_currencypositivepattern/)() const | मुद्रा सकारात्मक पैटर्न प्राप्त करता है। |
| [get_CurrencySymbol](./get_currencysymbol/)() const | मुद्रा प्रतीक प्राप्त करता है। |
| static [get_CurrentInfo](./get_currentinfo/)() | वर्तमान थ्रेड संस्कृति-परिभाषित संख्या स्वरूप जानकारी प्राप्त करता है। |
| [get_DigitSubstitution](./get_digitsubstitution/)() const | एक मान प्राप्त करता है जो अंक के आकार को कैसे प्रदर्शित किया जाए, निर्दिष्ट करता है। |
| static [get_InvariantInfo](./get_invariantinfo/)() | अपरिवर्तनीय संस्कृति-परिभाषित संख्या स्वरूप जानकारी प्राप्त करता है। |
| [get_IsReadOnly](./get_isreadonly/)() const | जाँचता है कि क्या स्वरूप केवल-पढ़ने योग्य है। |
| [get_NaNSymbol](./get_nansymbol/)() const | Not-a-Number प्रतीक प्राप्त करता है। |
| [get_NativeDigits](./get_nativedigits/)() const | अंकों के प्रतीक (0 से 9) प्राप्त करता है। |
| [get_NegativeInfinitySymbol](./get_negativeinfinitysymbol/)() const | नकारात्मक अनंत प्रतीक प्राप्त करता है। |
| [get_NegativeSign](./get_negativesign/)() const | नकारात्मक चिह्न प्राप्त करता है। |
| [get_NumberDecimalDigits](./get_numberdecimaldigits/)() const | दशमलव अंकों की संख्या प्राप्त करता है। |
| [get_NumberDecimalSeparator](./get_numberdecimalseparator/)() const | दशमलव विभाजक प्राप्त करता है। |
| [get_NumberGroupSeparator](./get_numbergroupseparator/)() const | संख्या समूह विभाजक प्राप्त करता है। |
| [get_NumberGroupSizes](./get_numbergroupsizes/)() const | प्रति समूह अंकों की संख्या प्राप्त करता है। |
| [get_NumberNegativePattern](./get_numbernegativepattern/)() const | संख्या नकारात्मक पैटर्न प्राप्त करता है। |
| [get_PercentDecimalDigits](./get_percentdecimaldigits/)() const | प्रतिशत मानों में दशमलव स्थानों की संख्या प्राप्त करता है। |
| [get_PercentDecimalSeparator](./get_percentdecimalseparator/)() const | प्रतिशत मानों में दशमलव विभाजक प्राप्त करता है। |
| [get_PercentGroupSeparator](./get_percentgroupseparator/)() const | प्रतिशत मानों में समूह विभाजक प्राप्त करता है। |
| [get_PercentGroupSizes](./get_percentgroupsizes/)() const | प्रति प्रतिशत मान समूह में अंकों की संख्या प्राप्त करता है। |
| [get_PercentNegativePattern](./get_percentnegativepattern/)() const | प्रतिशत नकारात्मक पैटर्न प्राप्त करता है। |
| [get_PercentPositivePattern](./get_percentpositivepattern/)() const | प्रतिशत सकारात्मक पैटर्न प्राप्त करता है। |
| [get_PercentSymbol](./get_percentsymbol/)() const | प्रतिशत चिह्न प्राप्त करता है। |
| [get_PerMilleSymbol](./get_permillesymbol/)() const | परमिल चिह्न प्राप्त करता है। |
| [get_PositiveInfinitySymbol](./get_positiveinfinitysymbol/)() const | धनात्मक अनंत चिह्न प्राप्त करता है। |
| [get_PositiveSign](./get_positivesign/)() const | धनात्मक चिह्न प्राप्त करता है। |
| [GetFormat](./getformat/)(const TypeInfo\&) override | विशिष्ट प्रकार के फ़ॉर्मेटर को प्राप्त करता है। |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | फ़ॉर्मेट प्रोवाइडर से जुड़े फ़ॉर्मेटर को प्राप्त करता है। |
| [NumberFormatInfo](./numberformatinfo/)() | डिफ़ॉल्ट कंस्ट्रक्टर (इनवेरिएंट [NumberFormatInfo](./)). |
| [operator=](./operator=/)(const NumberFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(NumberFormatInfoPtr) | फ़ॉर्मेटर का केवल-पढ़ने योग्य संस्करण प्राप्त करता है। |
| [set_CurrencyDecimalDigits](./set_currencydecimaldigits/)(int) | मुद्रा दशमलव अंकों की संख्या सेट करता है। |
| [set_CurrencyDecimalSeparator](./set_currencydecimalseparator/)(const String\&) | मुद्रा दशमलव विभाजक सेट करता है। |
| [set_CurrencyGroupSeparator](./set_currencygroupseparator/)(const String\&) | मुद्रा समूह विभाजक सेट करता है। |
| [set_CurrencyGroupSizes](./set_currencygroupsizes/)(const ArrayPtr\<int\>\&) | प्रति समूह मुद्रा दशमलव अंकों की संख्या सेट करता है। |
| [set_CurrencyNegativePattern](./set_currencynegativepattern/)(int) | मुद्रा नकारात्मक पैटर्न सेट करता है। |
| [set_CurrencyPositivePattern](./set_currencypositivepattern/)(int) | मुद्रा सकारात्मक पैटर्न सेट करता है। |
| [set_CurrencySymbol](./set_currencysymbol/)(const String\&) | मुद्रा प्रतीक सेट करता है। |
| [set_DigitSubstitution](./set_digitsubstitution/)(DigitShapes) | एक मान सेट करता है जो अंक के आकार को कैसे प्रदर्शित किया जाए, निर्दिष्ट करता है। |
| [set_NaNSymbol](./set_nansymbol/)(const String\&) | नॉट-ए-नंबर चिह्न सेट करता है। |
| [set_NativeDigits](./set_nativedigits/)(const ArrayPtr\<String\>\&) | अंकों के प्रतीक सेट करता है (0 से 9 तक)। |
| [set_NegativeInfinitySymbol](./set_negativeinfinitysymbol/)(const String\&) | नकारात्मक अनंत चिह्न सेट करता है। |
| [set_NegativeSign](./set_negativesign/)(const String\&) | नकारात्मक चिह्न सेट करता है। |
| [set_NumberDecimalDigits](./set_numberdecimaldigits/)(int) | दशमलव अंकों की संख्या सेट करता है। |
| [set_NumberDecimalSeparator](./set_numberdecimalseparator/)(const String\&) | दशमलव विभाजक सेट करता है। |
| [set_NumberGroupSeparator](./set_numbergroupseparator/)(const String\&) | संख्या समूह विभाजक सेट करता है। |
| [set_NumberGroupSizes](./set_numbergroupsizes/)(const ArrayPtr\<int\>\&) | प्रति समूह अंकों की संख्या सेट करता है। |
| [set_NumberNegativePattern](./set_numbernegativepattern/)(int) | संख्या नकारात्मक पैटर्न सेट करता है। |
| [set_PercentDecimalDigits](./set_percentdecimaldigits/)(int) | प्रतिशत मानों में दशमलव स्थानों की संख्या सेट करता है। |
| [set_PercentDecimalSeparator](./set_percentdecimalseparator/)(const String\&) | प्रतिशत मानों में दशमलव विभाजक सेट करता है। |
| [set_PercentGroupSeparator](./set_percentgroupseparator/)(const String\&) | प्रतिशत मानों में समूह विभाजक सेट करता है। |
| [set_PercentGroupSizes](./set_percentgroupsizes/)(const ArrayPtr\<int\>\&) | प्रति प्रतिशत मान समूह में अंकों की संख्या सेट करता है। |
| [set_PercentNegativePattern](./set_percentnegativepattern/)(int) | प्रतिशत नकारात्मक पैटर्न सेट करता है। |
| [set_PercentPositivePattern](./set_percentpositivepattern/)(int) | प्रतिशत सकारात्मक पैटर्न सेट करता है। |
| [set_PercentSymbol](./set_percentsymbol/)(const String\&) | प्रतिशत चिन्ह सेट करता है। |
| [set_PerMilleSymbol](./set_permillesymbol/)(const String\&) | परमीले चिन्ह सेट करता है। |
| [set_PositiveInfinitySymbol](./set_positiveinfinitysymbol/)(const String\&) | सकारात्मक अनंत चिन्ह सेट करता है। |
| [set_PositiveSign](./set_positivesign/)(const String\&) | सकारात्मक संकेत सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
