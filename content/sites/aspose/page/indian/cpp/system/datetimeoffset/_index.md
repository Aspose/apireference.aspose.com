---
title: "System::DateTimeOffset class"
linktitle: "DateTimeOffset"
second_title: "Aspose.Page C++ के लिए"
description: "System::DateTimeOffset class। समन्वित सार्वभौमिक समय के सापेक्ष दिनांक और समय को समाहित करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शन के तर्क के रूप में पास करें।"
type: docs
weight: 1700
url: /hi/cpp/system/datetimeoffset/
---
## DateTimeOffset class


समन्वित सार्वभौमिक समय के सापेक्ष दिनांक और समय को समाहित करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शन के तर्क के रूप में पास करें।

```cpp
class DateTimeOffset
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(TimeSpan) const | [DateTimeOffset](./) ऑब्जेक्ट में निर्दिष्ट समय अंतराल जोड़ता है। |
| [AddDays](./adddays/)(double) const | [DateTimeOffset](./) ऑब्जेक्ट में निर्दिष्ट संख्या में दिन जोड़ता है। |
| [AddHours](./addhours/)(double) const | [DateTimeOffset](./) ऑब्जेक्ट में निर्दिष्ट संख्या में घंटे जोड़ता है। |
| [AddMilliseconds](./addmilliseconds/)(double) const | [DateTimeOffset](./) ऑब्जेक्ट में निर्दिष्ट संख्या में मिलीसेकंड जोड़ता है। |
| [AddMinutes](./addminutes/)(double) const | [DateTimeOffset](./) ऑब्जेक्ट में निर्दिष्ट संख्या में मिनट जोड़ता है। |
| [AddMonths](./addmonths/)(int) const | [DateTimeOffset](./) ऑब्जेक्ट में निर्दिष्ट संख्या में महीने जोड़ता है। |
| [AddSeconds](./addseconds/)(double) const | [DateTimeOffset](./) ऑब्जेक्ट में निर्दिष्ट संख्या में सेकंड जोड़ता है। |
| [AddTicks](./addticks/)(int64_t) const | [DateTimeOffset](./) ऑब्जेक्ट में निर्दिष्ट संख्या में टिक जोड़ता है। |
| [AddYears](./addyears/)(int) const | [DateTimeOffset](./) ऑब्जेक्ट में निर्दिष्ट संख्या में वर्ष जोड़ता है। |
| static [Compare](./compare/)(const DateTimeOffset\&, const DateTimeOffset\&) | दो [DateTimeOffset](./) वस्तुओं की तुलना करता है। |
| [CompareTo](./compareto/)(const DateTimeOffset\&) const | दो [DateTimeOffset](./) वस्तुओं की तुलना करता है। |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | दो [DateTimeOffset](./) वस्तुओं की तुलना करता है। |
| [DateTimeOffset](./datetimeoffset/)() | डिफ़ॉल्ट कंस्ट्रक्टर। |
| [DateTimeOffset](./datetimeoffset/)(DateTime) | निर्माता। |
| [DateTimeOffset](./datetimeoffset/)(int64_t, TimeSpan) | निर्माता। |
| [DateTimeOffset](./datetimeoffset/)(DateTime, TimeSpan) | निर्माता। |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, TimeSpan) | निर्माता। |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, TimeSpan) | निर्माता। |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, TimeSpan) | निर्माता। |
| static [Equals](./equals/)(const DateTimeOffset\&, const DateTimeOffset\&) | जाँचता है कि दो [DateTimeOffset](./) वस्तुएँ समान समय बिंदु का प्रतिनिधित्व करती हैं। |
| [Equals](./equals/)(const DateTimeOffset\&) const | जाँचता है कि दो [DateTimeOffset](./) वस्तुएँ समान समय बिंदु का प्रतिनिधित्व करती हैं। |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | जाँचता है कि दो [DateTimeOffset](./) वस्तुएँ समान समय बिंदु का प्रतिनिधित्व करती हैं। |
| [EqualsExact](./equalsexact/)(const DateTimeOffset\&) const | जाँचता है कि दो [DateTimeOffset](./) वस्तुएँ समान समय बिंदु का प्रतिनिधित्व करती हैं और समान ऑफ़सेट रखती हैं। |
| [EqualsExact](./equalsexact/)(const SharedPtr\<Object\>\&) const | जाँचता है कि दो [DateTimeOffset](./) वस्तुएँ समान समय बिंदु का प्रतिनिधित्व करती हैं और समान ऑफ़सेट रखती हैं। |
| static [FromFileTime](./fromfiletime/)(int64_t) | [Convert](../convert/)[Windows](../../system.windows/) फ़ाइल समय को स्थानीय समय ऑफ़सेट के साथ तिथि और समय में बदलता है। |
| static [FromUnixTimeMilliseconds](./fromunixtimemilliseconds/)(int64_t) | [Convert](../convert/) यूनिक्स-समय को [DateTimeOffset](./) ऑब्जेक्ट में बदलता है। |
| static [FromUnixTimeSeconds](./fromunixtimeseconds/)(int64_t) | [Convert](../convert/) यूनिक्स-समय को [DateTimeOffset](./) ऑब्जेक्ट में बदलता है। |
| [get_Date](./get_date/)() const | वर्तमान ऑब्जेक्ट का तिथि घटक प्राप्त करता है। |
| [get_DateTime](./get_datetime/)() const | [DateTime](../datetime/) मान प्राप्त करता है। |
| [get_Day](./get_day/)() const | वर्तमान ऑब्जेक्ट का महीने का दिन प्राप्त करता है। |
| [get_DayOfWeek](./get_dayofweek/)() const | वर्तमान ऑब्जेक्ट का सप्ताह का दिन प्राप्त करता है। |
| [get_DayOfYear](./get_dayofyear/)() const | वर्तमान ऑब्जेक्ट का वर्ष का दिन प्राप्त करता है। |
| [get_Hour](./get_hour/)() const | वर्तमान ऑब्जेक्ट का घंटा घटक प्राप्त करता है। |
| [get_LocalDateTime](./get_localdatetime/)() const | [DateTime](../datetime/) मान प्राप्त करता है जो स्थानीय तिथि और समय का प्रतिनिधित्व करता है। |
| [get_Millisecond](./get_millisecond/)() const | वर्तमान ऑब्जेक्ट का मिलीसेकंड घटक प्राप्त करता है। |
| [get_Minute](./get_minute/)() const | वर्तमान ऑब्जेक्ट का मिनट घटक प्राप्त करता है। |
| [get_Month](./get_month/)() const | वर्तमान ऑब्जेक्ट का महीना घटक प्राप्त करता है। |
| static [get_Now](./get_now/)() | [DateTimeOffset](./) प्राप्त करता है जिसकी तिथि और समय वर्तमान स्थानीय समय पर सेट होते हैं और जिसका ऑफ़सेट स्थानीय समय के ऑफ़सेट पर सेट होता है। |
| [get_Offset](./get_offset/)() const | UTC से ऑफ़सेट प्राप्त करता है। |
| [get_Second](./get_second/)() const | वर्तमान ऑब्जेक्ट का सेकंड घटक प्राप्त करता है। |
| [get_Ticks](./get_ticks/)() const | वर्तमान ऑब्जेक्ट की टिक्स की संख्या प्राप्त करता है। |
| [get_TimeOfDay](./get_timeofday/)() const | वर्तमान ऑब्जेक्ट का दिन का समय प्राप्त करता है। |
| [get_UtcDateTime](./get_utcdatetime/)() const | [DateTime](../datetime/) मान प्राप्त करता है जो UTC तिथि और समय का प्रतिनिधित्व करता है। |
| static [get_UtcNow](./get_utcnow/)() | [DateTimeOffset](./) प्राप्त करता है जिसकी तिथि और समय वर्तमान UTC-समय पर सेट होते हैं और जिसका ऑफ़सेट [TimeSpan::Zero](../timespan/zero/) है। |
| [get_UtcTicks](./get_utcticks/)() const | UTC समय में वर्तमान ऑब्जेक्ट की टिक्स की संख्या प्राप्त करता है। |
| [get_Year](./get_year/)() const | वर्तमान ऑब्जेक्ट का वर्ष घटक प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const | वर्तमान [DateTimeOffset](./) ऑब्जेक्ट के लिए हैश कोड प्राप्त करता है। |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(const DateTimeOffset\&) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट और निर्दिष्ट [DateTimeOffset](./) ऑब्जेक्ट अलग-अलग तिथि और समय मान दर्शाते हैं या नहीं। |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | एक नया [DateTimeOffset](./) क्लास इंस्टेंस लौटाता है जो वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए मान और निर्दिष्ट टाइम स्पैन के योग को दर्शाता है। |
| [operator-](./operator-/)(TimeSpan) const | एक नया [DateTimeOffset](./) क्लास इंस्टेंस लौटाता है जो वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए मान से निर्दिष्ट टाइम स्पैन घटाने के परिणामस्वरूप तिथि और समय मान को दर्शाता है। |
| [operator-](./operator-/)(const DateTimeOffset\&) const | एक [TimeSpan](../timespan/) क्लास का इंस्टेंस लौटाता है जो वर्तमान और निर्दिष्ट ऑब्जेक्ट्स द्वारा दर्शाए गए तिथि और समय मानों के बीच समय अंतराल को दर्शाता है। |
| [operator<](./operator_/)(const DateTimeOffset\&) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया तिथि और समय मान निर्दिष्ट [DateTimeOffset](./) ऑब्जेक्ट द्वारा दर्शाए गए मान से पहले है या नहीं। |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(const DateTimeOffset\&) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया तिथि और समय मान निर्दिष्ट [DateTimeOffset](./) ऑब्जेक्ट द्वारा दर्शाए गए मान से पहले या समान है या नहीं। |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator==](./operator==/)(const DateTimeOffset\&) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट और निर्दिष्ट [DateTimeOffset](./) ऑब्जेक्ट समान तिथि और समय मान दर्शाते हैं या नहीं। |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(const DateTimeOffset\&) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया तिथि और समय मान निर्दिष्ट [DateTimeOffset](./) ऑब्जेक्ट द्वारा दर्शाए गए मान से बाद में है या नहीं। |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(const DateTimeOffset\&) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया तिथि और समय मान निर्दिष्ट [DateTimeOffset](./) ऑब्जेक्ट द्वारा दर्शाए गए मान से बाद में या समान है या नहीं। |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | निर्दिष्ट स्ट्रिंग को [DateTimeOffset](./) समकक्ष में परिवर्तित करता है। |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | निर्दिष्ट स्ट्रिंग को निर्दिष्ट फ़ॉर्मेट प्रोवाइडर और फ़ॉर्मेटिंग शैली का उपयोग करके [DateTimeOffset](./) ऑब्जेक्ट में परिवर्तित करता है। |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | निर्दिष्ट स्ट्रिंग को निर्दिष्ट फ़ॉर्मेट, फ़ॉर्मेट प्रोवाइडर और फ़ॉर्मेटिंग शैली का उपयोग करके [DateTimeOffset](./) ऑब्जेक्ट में परिवर्तित करता है। |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | निर्दिष्ट स्ट्रिंग को निर्दिष्ट फ़ॉर्मेट्स, फ़ॉर्मेट प्रोवाइडर और फ़ॉर्मेटिंग शैली का उपयोग करके [DateTimeOffset](./) ऑब्जेक्ट में परिवर्तित करता है। |
| [Subtract](./subtract/)(TimeSpan) const | वर्तमान ऑब्जेक्ट से निर्दिष्ट समय अंतराल घटाता है। |
| [Subtract](./subtract/)(const DateTimeOffset\&) const | वर्तमान ऑब्जेक्ट से निर्दिष्ट [DateTimeOffset](./) मान घटाता है। |
| [ToFileTime](./tofiletime/)() const | वर्तमान ऑब्जेक्ट को [Windows](../../system.windows/) फ़ाइल समय में परिवर्तित करता है। |
| [ToLocalTime](./tolocaltime/)() const | वर्तमान ऑब्जेक्ट को स्थानीय समय दर्शाने वाले ऑब्जेक्ट में परिवर्तित करता है,. |
| [ToOffset](./tooffset/)(TimeSpan) const | वर्तमान ऑब्जेक्ट का ऑफ़सेट निर्दिष्ट ऑफ़सेट से बदलें। |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | वर्तमान ऑब्जेक्ट को निर्दिष्ट फ़ॉर्मेट और फ़ॉर्मेट प्रोवाइडर का उपयोग करके स्ट्रिंग में परिवर्तित करता है। |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | वर्तमान ऑब्जेक्ट को निर्दिष्ट फ़ॉर्मेट प्रोवाइडर का उपयोग करके स्ट्रिंग में परिवर्तित करता है। |
| [ToString](./tostring/)(const String\&) const | वर्तमान ऑब्जेक्ट को निर्दिष्ट फ़ॉर्मेट का उपयोग करके स्ट्रिंग में परिवर्तित करता है। |
| [ToString](./tostring/)() const | वर्तमान ऑब्जेक्ट को स्ट्रिंग में परिवर्तित करता है। |
| [ToUniversalTime](./touniversaltime/)() const | वर्तमान ऑब्जेक्ट को UTC समय दर्शाने वाले ऑब्जेक्ट में परिवर्तित करता है,. |
| [ToUnixTimeMilliseconds](./tounixtimemilliseconds/)() const | Unix युग की शुरुआत से बीते मिलीसेकंड प्राप्त करता है। |
| [ToUnixTimeSeconds](./tounixtimeseconds/)() const | Unix epoch की शुरुआत से बीते सेकंड प्राप्त करता है। |
| static [TryParse](./tryparse/)(const String\&, DateTimeOffset\&) | निर्दिष्ट स्ट्रिंग को [DateTimeOffset](./) ऑब्जेक्ट में बदलने का प्रयास करता है। |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | निर्दिष्ट फ़ॉर्मेट प्रदाता और फ़ॉर्मेटिंग शैली का उपयोग करके निर्दिष्ट स्ट्रिंग को [DateTimeOffset](./) ऑब्जेक्ट में बदलने का प्रयास करता है। |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | निर्दिष्ट फ़ॉर्मेट्स, फ़ॉर्मेट प्रदाता और फ़ॉर्मेटिंग शैली का उपयोग करके निर्दिष्ट स्ट्रिंग को [DateTimeOffset](./) ऑब्जेक्ट में बदलने का प्रयास करता है। |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | निर्दिष्ट फ़ॉर्मेट, फ़ॉर्मेट प्रदाता और फ़ॉर्मेटिंग शैली का उपयोग करके निर्दिष्ट स्ट्रिंग को [DateTimeOffset](./) ऑब्जेक्ट में बदलने का प्रयास करता है। |
| static [Type](./type/)() | [TimeSpan](../timespan/) संरचना का प्रतिनिधित्व करने वाला एक [TypeInfo](../typeinfo/) ऑब्जेक्ट लौटाता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static constexpr [MaxOffset](./maxoffset/) | टिक्स में अधिकतम ऑफ़सेट प्राप्त करता है। |
| static [MaxValue](./maxvalue/) | सबसे बड़ा [DateTimeOffset](./) मान प्राप्त करता है। |
| static constexpr [MinOffset](./minoffset/) | टिक्स में न्यूनतम ऑफ़सेट प्राप्त करता है। |
| static [MinValue](./minvalue/) | सबसे प्रारंभिक [DateTimeOffset](./) मान प्राप्त करता है। |
| static [UnixEpoch](./unixepoch/) | Unix epoch की शुरुआत प्राप्त करता है। |
## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
