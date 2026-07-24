---
title: "System::Globalization::Calendar क्लास"
linktitle: "कैलेंडर"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::Calendar क्लास। कैलेंडर जो निर्धारित करता है कि तिथियों को कैसे संभाला, गणना किया, स्वरूपित किया आदि। सेट्टर ऑपरेशन्स केवल गैर-रीड-ओनली ऑब्जेक्ट्स पर सक्षम होते हैं। इस क्लास के ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों को तर्क के रूप में पास करें।"
type: docs
weight: 100
url: /hi/cpp/system.globalization/calendar/
---
## Calendar class


[Calendar](./) which defines how the dates are handled, calculated, formatted, etc. Setter operations are only enabled on non-read-only objects. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Calendar : public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [AddDays](./adddays/)(DateTime, int) const | समय बिंदु में दिन जोड़ता है। |
| virtual [AddHours](./addhours/)(DateTime, int) const | समय बिंदु में घंटे जोड़ता है। |
| virtual [AddMilliseconds](./addmilliseconds/)(DateTime, double) const | समय बिंदु में मिलीसेकंड जोड़ता है। |
| virtual [AddMinutes](./addminutes/)(DateTime, int) const | समय बिंदु में मिनट जोड़ता है। |
| virtual [AddMonths](./addmonths/)(DateTime, int) const | समय बिंदु में महीने जोड़ता है। |
| virtual [AddSeconds](./addseconds/)(DateTime, int) const | समय बिंदु में सेकंड जोड़ता है। |
| virtual [AddWeeks](./addweeks/)(DateTime, int) const | समय बिंदु में हफ़्ते जोड़ता है। |
| virtual [AddYears](./addyears/)(DateTime, int) const | समय बिंदु में वर्ष जोड़ता है। |
| [Calendar](./calendar/)(const Calendar\&) | RTTI जानकारी। |
| virtual [get_AlgorithmType](./get_algorithmtype/)() const | एल्गोरिदम प्रकार प्राप्त करता है। |
| [get_CurrentEra](./get_currentera/)() const | वर्तमान युग का सूचकांक प्राप्त करता है। |
| [get_CurrentEraValue](./get_currenteravalue/)() const | वर्तमान युग का मान प्राप्त करता है। |
| virtual [get_Eras](./get_eras/)() const | कैलेंडर में मौजूद युगों की सूची प्राप्त करता है। |
| virtual [get_ID](./get_id/)() const | कैलेंडर पहचानकर्ता प्राप्त करता है। |
| [get_IsReadOnly](./get_isreadonly/)() const | जाँचता है कि कैलेंडर केवल पढ़ने योग्य है या नहीं। |
| virtual [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const | कैलेंडर द्वारा समर्थित अधिकतम समय बिंदु। |
| virtual [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const | कैलेंडर द्वारा समर्थित न्यूनतम समय बिंदु। |
| virtual [get_TwoDigitYearMax](./get_twodigityearmax/)() const | 2-अंकीय द्वारा प्रतिनिधित्व किया जा सकने वाला अंतिम वर्ष प्राप्त करता है। |
| virtual [GetDayOfMonth](./getdayofmonth/)(DateTime) const | निर्दिष्ट समय बिंदु के लिए महीने का दिन प्राप्त करता है। |
| virtual [GetDayOfWeek](./getdayofweek/)(DateTime) const | निर्दिष्ट समय बिंदु के लिए सप्ताह का दिन प्राप्त करता है। |
| virtual [GetDayOfYear](./getdayofyear/)(DateTime) const | निर्दिष्ट समय बिंदु के लिए वर्ष का दिन प्राप्त करता है। |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | विशिष्ट महीने में दिनों की संख्या प्राप्त करता है। |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const | विशिष्ट महीने में दिनों की संख्या प्राप्त करता है। |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | विशिष्ट वर्ष में दिनों की संख्या प्राप्त करता है। |
| virtual [GetDaysInYear](./getdaysinyear/)(int, int) const | विशिष्ट वर्ष में दिनों की संख्या प्राप्त करता है। |
| virtual [GetEra](./getera/)(DateTime) const | निर्दिष्ट समय बिंदु के लिए युग प्राप्त करता है। |
| virtual [GetHour](./gethour/)(DateTime) const | निर्दिष्ट समय बिंदु के लिए घंटे प्राप्त करता है। |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | निर्दिष्ट वर्ष के लिए लीप माह प्राप्त करता है। |
| virtual [GetLeapMonth](./getleapmonth/)(int, int) const | निर्दिष्ट वर्ष के लिए लीप माह प्राप्त करता है। |
| virtual [GetMilliseconds](./getmilliseconds/)(DateTime) const | निर्दिष्ट समय बिंदु के लिए मिलीसेकंड प्राप्त करता है। |
| virtual [GetMinute](./getminute/)(DateTime) const | निर्दिष्ट समय बिंदु के लिए मिनट प्राप्त करता है। |
| virtual [GetMonth](./getmonth/)(DateTime) const | निर्दिष्ट समय बिंदु के लिए माह प्राप्त करता है। |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | निर्दिष्ट वर्ष में महीनों की संख्या प्राप्त करता है। |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int, int) const | निर्दिष्ट वर्ष में महीनों की संख्या प्राप्त करता है। |
| virtual [GetSecond](./getsecond/)(DateTime) const | निर्दिष्ट समय बिंदु के लिए सेकंड प्राप्त करता है। |
| virtual [GetWeekOfYear](./getweekofyear/)(DateTime, CalendarWeekRule, DayOfWeek) const | निर्दिष्ट समय बिंदु के लिए वर्ष का हफ़्ता प्राप्त करता है। |
| virtual [GetYear](./getyear/)(DateTime) const | निर्दिष्ट समय बिंदु के लिए वर्ष प्राप्त करता है। |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | जाँचता है कि दिन लीप है या नहीं। |
| virtual [IsLeapDay](./isleapday/)(int, int, int, int) const | जाँचता है कि दिन लीप है या नहीं। |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | जाँचता है कि महीना लीप है या नहीं। |
| virtual [IsLeapMonth](./isleapmonth/)(int, int, int) const | जाँचता है कि महीना लीप है या नहीं। |
| virtual [IsLeapYear](./isleapyear/)(int) const | जाँचता है कि वर्ष लीप है या नहीं। |
| virtual [IsLeapYear](./isleapyear/)(int, int) const | जाँचता है कि वर्ष लीप है या नहीं। |
| [IsValidDay](./isvalidday/)(int, int, int, int) const | वर्ष, महीना, दिन और युग मानों की जाँच करता है। |
| [operator=](./operator=/)(const Calendar\&) |  |
| static [ReadOnly](./readonly/)(const CalendarPtr\&) | कैलेंडर का केवल पढ़ने योग्य संस्करण प्राप्त करता है। |
| virtual [set_TwoDigitYearMax](./set_twodigityearmax/)(int) | 2-अंकीय द्वारा प्रतिनिधित्व किया जा सकने वाला अंतिम वर्ष सेट करता है। |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | घटकों से [DateTime](../../system/datetime/) ऑब्जेक्ट बनाता है। |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const | घटकों से [DateTime](../../system/datetime/) ऑब्जेक्ट बनाता है। |
| virtual [ToFourDigitYear](./tofourdigityear/)(int) const | TwoDigitYearMax प्रॉपर्टी का उपयोग करके वर्ष को 4-अंकीय वर्ष में परिवर्तित करता है। |
## संबंधित देखें

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
