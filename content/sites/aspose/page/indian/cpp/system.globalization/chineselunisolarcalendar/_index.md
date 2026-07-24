---
title: "System::Globalization::ChineseLunisolarCalendar क्लास"
linktitle: "ChineseLunisolarCalendar"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::ChineseLunisolarCalendar क्लास। चीनी लूनिसोलर कैलेंडर। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 300
url: /hi/cpp/system.globalization/chineselunisolarcalendar/
---
## ChineseLunisolarCalendar class


चीनी लूनिसोलर कैलेंडर। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class ChineseLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ChineseLunisolarCalendar](./chineselunisolarcalendar/)() | डिफ़ॉल्ट कंस्ट्रक्टर। |
| [Clone](./clone/)() override | RTTI जानकारी। |
| [get_Eras](./get_eras/)() const override | कैलेंडर में मौजूद युगों की सूची प्राप्त करता है। |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | कैलेंडर द्वारा समर्थित अधिकतम समय बिंदु। |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | कैलेंडर द्वारा समर्थित न्यूनतम समय बिंदु। |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | विशिष्ट महीने में दिनों की संख्या प्राप्त करता है। |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | विशिष्ट महीने में दिनों की संख्या प्राप्त करता है। |
| [GetEra](./getera/)(DateTime) const override | निर्दिष्ट समय बिंदु के लिए युग प्राप्त करता है। |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | निर्दिष्ट वर्ष के लिए लीप माह प्राप्त करता है। |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | निर्दिष्ट वर्ष के लिए लीप माह प्राप्त करता है। |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | निर्दिष्ट वर्ष में महीनों की संख्या प्राप्त करता है। |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | RTTI जानकारी। |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | जाँचता है कि दिन लीप है या नहीं। |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | जाँचता है कि दिन लीप है या नहीं। |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | जाँचता है कि महीना लीप है या नहीं। |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | जाँचता है कि महीना लीप है या नहीं। |
| [IsLeapYear](./isleapyear/)(int, int) const override | जाँचता है कि वर्ष लीप है या नहीं। |
| virtual [IsLeapYear](./isleapyear/)(int) const | जाँचता है कि वर्ष लीप है या नहीं। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static constexpr [ChineseEra](./chineseera/) | वर्तमान चीनी युग। |
## संबंधित देखें

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
