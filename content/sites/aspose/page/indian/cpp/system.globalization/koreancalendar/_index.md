---
title: "System::Globalization::KoreanCalendar क्लास"
linktitle: "KoreanCalendar"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::KoreanCalendar क्लास। कोरियन कैलेंडर। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1700
url: /hi/cpp/system.globalization/koreancalendar/
---
## KoreanCalendar class


कोरियन कैलेंडर। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class KoreanCalendar : public System::Globalization::Calendar
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | RTTI जानकारी। |
| [get_AlgorithmType](./get_algorithmtype/)() const override | एल्गोरिदम प्रकार प्राप्त करता है। |
| [get_Eras](./get_eras/)() const override | कैलेंडर में मौजूद युगों की सूची प्राप्त करता है। |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | कैलेंडर द्वारा समर्थित अधिकतम समय बिंदु। |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | कैलेंडर द्वारा समर्थित न्यूनतम समय बिंदु। |
| [GetDayOfMonth](./getdayofmonth/)(DateTime) const override | निर्दिष्ट समय बिंदु के लिए महीने का दिन प्राप्त करता है। |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | निर्दिष्ट समय बिंदु के लिए सप्ताह का दिन प्राप्त करता है। |
| [GetDayOfYear](./getdayofyear/)(DateTime) const override | निर्दिष्ट समय बिंदु के लिए वर्ष का दिन प्राप्त करता है। |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | विशिष्ट महीने में दिनों की संख्या प्राप्त करता है। |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | विशिष्ट महीने में दिनों की संख्या प्राप्त करता है। |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | विशिष्ट वर्ष में दिनों की संख्या प्राप्त करता है। |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | विशिष्ट वर्ष में दिनों की संख्या प्राप्त करता है। |
| [GetEra](./getera/)(DateTime) const override | निर्दिष्ट समय बिंदु के लिए युग प्राप्त करता है। |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | निर्दिष्ट वर्ष के लिए लीप माह प्राप्त करता है। |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | निर्दिष्ट वर्ष के लिए लीप माह प्राप्त करता है। |
| [GetMonth](./getmonth/)(DateTime) const override | निर्दिष्ट समय बिंदु के लिए माह प्राप्त करता है। |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | निर्दिष्ट वर्ष में महीनों की संख्या प्राप्त करता है। |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | RTTI जानकारी। |
| [GetYear](./getyear/)(DateTime) const override | निर्दिष्ट समय बिंदु के लिए वर्ष प्राप्त करता है। |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | जाँचता है कि दिन लीप है या नहीं। |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | जाँचता है कि दिन लीप है या नहीं। |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | जाँचता है कि महीना लीप है या नहीं। |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | जाँचता है कि महीना लीप है या नहीं। |
| [IsLeapYear](./isleapyear/)(int, int) const override | जाँचता है कि वर्ष लीप है या नहीं। |
| virtual [IsLeapYear](./isleapyear/)(int) const | जाँचता है कि वर्ष लीप है या नहीं। |
| [KoreanCalendar](./koreancalendar/)() | निर्माता। |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | घटकों से [DateTime](../../system/datetime/) ऑब्जेक्ट बनाता है। |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | घटकों से [DateTime](../../system/datetime/) ऑब्जेक्ट बनाता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static constexpr [KoreanEra](./koreanera/) | वर्तमान कोरियन युग। |
## संबंधित देखें

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
