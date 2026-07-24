---
title: "System::Globalization::UmAlQuraCalendar क्लास"
linktitle: "UmAlQuraCalendar"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::UmAlQuraCalendar क्लास। उम अल क़ुरा कैलेंडर। लागू नहीं है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 3000
url: /hi/cpp/system.globalization/umalquracalendar/
---
## UmAlQuraCalendar class


उम अल क़ुरा कैलेंडर। लागू नहीं है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class UmAlQuraCalendar : public System::Globalization::Calendar
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | RTTI जानकारी। |
| [get_AlgorithmType](./get_algorithmtype/)() const override | एल्गोरिदम प्रकार प्राप्त करता है। |
| [get_Eras](./get_eras/)() const override | कैलेंडर में मौजूद युगों की सूची प्राप्त करता है। |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | कैलेंडर द्वारा समर्थित अधिकतम समय बिंदु। |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | कैलेंडर द्वारा समर्थित न्यूनतम समय बिंदु। |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | निर्दिष्ट समय बिंदु के लिए सप्ताह का दिन प्राप्त करता है। |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | निर्दिष्ट वर्ष के लिए लीप माह प्राप्त करता है। |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | RTTI जानकारी। |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | जाँचता है कि दिन लीप है या नहीं। |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | जाँचता है कि दिन लीप है या नहीं। |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | जाँचता है कि महीना लीप है या नहीं। |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | जाँचता है कि महीना लीप है या नहीं। |
| [IsLeapYear](./isleapyear/)(int, int) const override | जाँचता है कि वर्ष लीप है या नहीं। |
| virtual [IsLeapYear](./isleapyear/)(int) const | जाँचता है कि वर्ष लीप है या नहीं। |
| [set_TwoDigitYearMax](./set_twodigityearmax/)(int) override | 2-अंकीय द्वारा प्रतिनिधित्व किया जा सकने वाला अंतिम वर्ष सेट करता है। |
| [UmAlQuraCalendar](./umalquracalendar/)() | निर्माता। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static constexpr [UmAlQuraEra](./umalquraera/) | वर्तमान UmAlQura युग। |
## संबंधित देखें

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
