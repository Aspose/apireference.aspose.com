---
title: "System::Globalization::JapaneseLunisolarCalendar क्लास"
linktitle: "JapaneseLunisolarCalendar"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::JapaneseLunisolarCalendar क्लास। Japanese lunisolar calendar। लागू नहीं है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों को तर्क के रूप में पास करें।"
type: docs
weight: 1500
url: /hi/cpp/system.globalization/japaneselunisolarcalendar/
---
## JapaneseLunisolarCalendar class


Japanese lunisolar calendar। लागू नहीं है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों को तर्क के रूप में पास करें।

```cpp
class JapaneseLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | RTTI जानकारी। |
| [get_Eras](./get_eras/)() const override | कैलेंडर में मौजूद युगों की सूची प्राप्त करता है। |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | कैलेंडर द्वारा समर्थित अधिकतम समय बिंदु। |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | कैलेंडर द्वारा समर्थित न्यूनतम समय बिंदु। |
| [GetEra](./getera/)(DateTime) const override | निर्दिष्ट समय बिंदु के लिए युग प्राप्त करता है। |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | निर्दिष्ट वर्ष के लिए लीप माह प्राप्त करता है। |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | RTTI जानकारी। |
| [GetYear](./getyear/)(DateTime) const override | निर्दिष्ट समय बिंदु के लिए वर्ष प्राप्त करता है। |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | जाँचता है कि दिन लीप है या नहीं। |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | जाँचता है कि दिन लीप है या नहीं। |
| [IsLeapYear](./isleapyear/)(int, int) const override | जाँचता है कि वर्ष लीप है या नहीं। |
| virtual [IsLeapYear](./isleapyear/)(int) const | जाँचता है कि वर्ष लीप है या नहीं। |
| [JapaneseLunisolarCalendar](./japaneselunisolarcalendar/)() | निर्माता। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static constexpr [JapaneseEra](./japaneseera/) | वर्तमान जापानी युग। |
## संबंधित देखें

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
