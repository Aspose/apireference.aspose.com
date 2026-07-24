---
title: "System::Globalization::DateTimeFormatInfo क्लास"
linktitle: "DateTimeFormatInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::DateTimeFormatInfo क्लास। तिथि और समय फ़ॉर्मेटिंग पैरामीटरों का सेट। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्युमेंट के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 600
url: /hi/cpp/system.globalization/datetimeformatinfo/
---
## DateTimeFormatInfo class


तिथि और समय फ़ॉर्मेटिंग पैरामीटरों का सेट। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्युमेंट के रूप में पास करने के लिए करें।

```cpp
class DateTimeFormatInfo : public virtual System::Object,
                           public System::IFormatProvider,
                           public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | फ़ॉर्मेट जानकारी को क्लोन करता है। |
| [DateTimeFormatInfo](./datetimeformatinfo/)() | डिफ़ॉल्ट कंस्ट्रक्टर, अपरिवर्तनीय फ़ॉर्मेट जानकारी बनाता है। |
| [get_AbbreviatedDayNames](./get_abbreviateddaynames/)() const | संक्षिप्त दिन नाम प्राप्त करता है। |
| [get_AbbreviatedMonthGenitiveNames](./get_abbreviatedmonthgenitivenames/)() const | जनिटिव रूप में संक्षिप्त महीने के नाम प्राप्त करता है। |
| [get_AbbreviatedMonthNames](./get_abbreviatedmonthnames/)() const | संक्षिप्त महीने के नाम प्राप्त करता है। |
| [get_AMDesignator](./get_amdesignator/)() const | AM डिज़ाइनेटर प्राप्त करता है। |
| [get_Calendar](./get_calendar/)() const | फ़ॉर्मेटर से जुड़ा कैलेंडर प्राप्त करता है। |
| [get_CalendarWeekRule](./get_calendarweekrule/)() const | फ़ॉर्मेटर से जुड़ा कैलेंडर सप्ताह नियम प्राप्त करता है। |
| static [get_CurrentInfo](./get_currentinfo/)() | वर्तमान थ्रेड का तिथि और समय फ़ॉर्मेटर प्राप्त करता है। |
| [get_DateSeparator](./get_dateseparator/)() const | तिथि विभाजक प्राप्त करता है। |
| [get_DayNames](./get_daynames/)() const | दिन के नाम प्राप्त करता है। |
| [get_FirstDayOfWeek](./get_firstdayofweek/)() const | सप्ताह का पहला दिन प्राप्त करता है। |
| [get_FullDateTimePattern](./get_fulldatetimepattern/)() const | पूर्ण तिथि और समय पैटर्न प्राप्त करता है। |
| static [get_InvariantInfo](./get_invariantinfo/)() | अपरिवर्तनीय तिथि और समय फ़ॉर्मेटर प्राप्त करता है। |
| [get_IsReadOnly](./get_isreadonly/)() const | जाँचता है कि फ़ॉर्मेटर केवल-पढ़ने योग्य है या नहीं। |
| [get_LongDatePattern](./get_longdatepattern/)() const | लंबा तिथि पैटर्न प्राप्त करता है। |
| [get_LongTimePattern](./get_longtimepattern/)() const | लंबा समय पैटर्न प्राप्त करता है। |
| [get_MonthDayPattern](./get_monthdaypattern/)() const | महीने के दिन का पैटर्न प्राप्त करता है। |
| [get_MonthGenitiveNames](./get_monthgenitivenames/)() const | जननात्मक रूप में महीने के नाम प्राप्त करता है। |
| [get_MonthNames](./get_monthnames/)() const | महीने के नाम प्राप्त करता है। |
| [get_NativeCalendarName](./get_nativecalendarname/)() const | यदि उपलब्ध हो तो मूल कैलेंडर का नाम प्राप्त करता है। |
| [get_PMDesignator](./get_pmdesignator/)() const | पीएम डिज़ाइनटर प्राप्त करता है। |
| [get_RFC1123Pattern](./get_rfc1123pattern/)() const | RFC1123 पैटर्न प्राप्त करता है। |
| [get_ShortDatePattern](./get_shortdatepattern/)() const | संक्षिप्त तिथि पैटर्न प्राप्त करता है। |
| [get_ShortestDayNames](./get_shortestdaynames/)() const | संभव सबसे छोटे दिन के नाम प्राप्त करता है। |
| [get_ShortTimePattern](./get_shorttimepattern/)() const | संक्षिप्त समय पैटर्न प्राप्त करता है। |
| [get_SortableDateTimePattern](./get_sortabledatetimepattern/)() const | सॉर्टेबल तिथि और समय पैटर्न प्राप्त करता है। |
| [get_TimeSeparator](./get_timeseparator/)() const | समय विभाजक प्राप्त करता है। |
| [get_UniversalSortableDateTimePattern](./get_universalsortabledatetimepattern/)() const | सार्वभौमिक सॉर्टेबल तिथि और समय पैटर्न प्राप्त करता है। |
| [get_YearMonthPattern](./get_yearmonthpattern/)() const | वर्ष और महीने का पैटर्न प्राप्त करता है। |
| [GetAbbreviatedDayName](./getabbreviateddayname/)(DayOfWeek) const | संकुचित सप्ताह के दिन का नाम प्राप्त करता है। |
| [GetAbbreviatedEraName](./getabbreviatederaname/)(int) const | संकुचित युग का नाम प्राप्त करता है। |
| [GetAbbreviatedMonthName](./getabbreviatedmonthname/)(int) const | संकुचित महीने का नाम प्राप्त करता है। |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)() const | उन सभी पैटर्न को प्राप्त करता है जिनमें तिथि और समय मानों को फ़ॉर्मेट किया जा सकता है। |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)(char16_t) const | निर्दिष्ट फ़ॉर्मेट स्ट्रिंग का उपयोग करके तिथि और समय मानों को फ़ॉर्मेट करने के सभी पैटर्न प्राप्त करता है। |
| [GetDayName](./getdayname/)(DayOfWeek) const | सप्ताह के दिन का नाम प्राप्त करता है। |
| [GetEra](./getera/)(const String\&) const | नाम द्वारा युग प्राप्त करता है। |
| [GetEraName](./geteraname/)(int) const | युग का नाम प्राप्त करता है। |
| [GetFormat](./getformat/)(const TypeInfo\&) override | विशिष्ट प्रकार के फ़ॉर्मेटर को प्राप्त करता है। |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | फ़ॉर्मेट प्रोवाइडर से जुड़े फ़ॉर्मेटर को प्राप्त करता है। |
| [GetLeapYearMonthName](./getleapyearmonthname/)(int) const | लीप-इयर महीने का नाम प्राप्त करता है। |
| [GetMonthGenitiveName](./getmonthgenitivename/)(int) const | जननवाचक महीने का नाम प्राप्त करता है। |
| [GetMonthName](./getmonthname/)(int) const | महीने का नाम प्राप्त करता है। |
| [GetShortestDayName](./getshortestdayname/)(DayOfWeek) const | निर्दिष्ट सप्ताह के दिन के लिए सबसे छोटा नाम प्राप्त करता है। |
| [operator=](./operator=/)(const DateTimeFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(const DateTimeFormatInfoPtr\&) | फ़ॉर्मेटर का केवल-पढ़ने योग्य संस्करण प्राप्त करता है। |
| [set_AbbreviatedDayNames](./set_abbreviateddaynames/)(const ArrayPtr\<String\>\&) | संक्षिप्त दिन के नाम सेट करता है। |
| [set_AbbreviatedMonthGenitiveNames](./set_abbreviatedmonthgenitivenames/)(const ArrayPtr\<String\>\&) | जननवाचक रूप में संक्षिप्त महीने के नाम सेट करता है। |
| [set_AbbreviatedMonthNames](./set_abbreviatedmonthnames/)(const ArrayPtr\<String\>\&) | संक्षिप्त महीने के नाम सेट करता है। |
| [set_AMDesignator](./set_amdesignator/)(const String\&) | AM डिज़ाइनेटर सेट करता है। |
| [set_Calendar](./set_calendar/)(const SharedPtr\<Calendar\>\&) | फ़ॉर्मेटर से जुड़ा कैलेंडर सेट करता है। |
| [set_CalendarWeekRule](./set_calendarweekrule/)(CalendarWeekRule) | फ़ॉर्मेटर से जुड़ा कैलेंडर सप्ताह नियम सेट करता है। |
| [set_DateSeparator](./set_dateseparator/)(const String\&) | तारीख विभाजक सेट करता है। |
| [set_DayNames](./set_daynames/)(const ArrayPtr\<String\>\&) | दिन के नाम सेट करता है। |
| [set_FirstDayOfWeek](./set_firstdayofweek/)(DayOfWeek) | सप्ताह का पहला दिन सेट करता है। |
| [set_FullDateTimePattern](./set_fulldatetimepattern/)(const String\&) | पूरा तिथि और समय पैटर्न सेट करता है। |
| [set_LongDatePattern](./set_longdatepattern/)(const String\&) | लंबा तिथि पैटर्न सेट करता है। |
| [set_LongTimePattern](./set_longtimepattern/)(const String\&) | लंबा समय पैटर्न सेट करता है। |
| [set_MonthDayPattern](./set_monthdaypattern/)(const String\&) | महीने-तारीख पैटर्न सेट करता है। |
| [set_MonthGenitiveNames](./set_monthgenitivenames/)(const ArrayPtr\<String\>\&) | जननवाचक रूप में महीने के नाम सेट करता है। |
| [set_MonthNames](./set_monthnames/)(const ArrayPtr\<String\>\&) | महीने के नाम सेट करता है। |
| [set_PMDesignator](./set_pmdesignator/)(const String\&) | PM डिज़ाइनेटर सेट करता है। |
| [set_ShortDatePattern](./set_shortdatepattern/)(const String\&) | छोटा तिथि पैटर्न सेट करता है। |
| [set_ShortestDayNames](./set_shortestdaynames/)(const ArrayPtr\<String\>\&) | संभव सबसे छोटे दिन के नाम सेट करता है। |
| [set_ShortTimePattern](./set_shorttimepattern/)(const String\&) | संक्षिप्त समय पैटर्न सेट करता है। |
| [set_TimeSeparator](./set_timeseparator/)(const String\&) | समय विभाजक सेट करता है। |
| [set_YearMonthPattern](./set_yearmonthpattern/)(const String\&) | वर्ष और माह पैटर्न सेट करता है। |
| [SetAllDateTimePatterns](./setalldatetimepatterns/)(const ArrayPtr\<String\>\&, char16_t) | निर्दिष्ट फ़ॉर्मेट के लिए पैटर्न सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
