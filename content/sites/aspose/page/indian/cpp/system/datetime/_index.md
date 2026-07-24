---
title: "System::DateTime class"
linktitle: "DateTime"
second_title: "Aspose.Page C++ के लिए"
description: "System::DateTime class. समय निरंतरता पर एक विशिष्ट तिथि और समय मान का प्रतिनिधित्व करता है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शन को मान या संदर्भ द्वारा पास किया जाना चाहिए। C++ में इस प्रकार की वस्तुओं को प्रबंधित करने के लिए System::SmartPtr क्लास का कभी उपयोग न करें।"
type: docs
weight: 1600
url: /hi/cpp/system/datetime/
---
## DateTime class


समय निरंतरता पर एक विशिष्ट तिथि और समय मान का प्रतिनिधित्व करता है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शन को मान या संदर्भ द्वारा पास किया जाना चाहिए। इस प्रकार की वस्तुओं को प्रबंधित करने के लिए [System::SmartPtr](../smartptr/) क्लास का कभी उपयोग न करें।

```cpp
class DateTime
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(TimeSpan) const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए तिथि और समय मान में निर्दिष्ट समय अंतराल को जोड़ने के परिणामस्वरूप प्राप्त तिथि और समय मान का प्रतिनिधित्व करने वाली नई [DateTime](./) क्लास की एक इंस्टेंस लौटाता है। |
| [AddDays](./adddays/)(double) const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए मान और निर्दिष्ट दिनों की संख्या के योग के रूप में तिथि और समय मान का प्रतिनिधित्व करने वाली नई [DateTime](./) क्लास की एक इंस्टेंस लौटाता है। |
| [AddHours](./addhours/)(double) const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए मान और निर्दिष्ट घंटों की संख्या के योग के रूप में तिथि और समय मान का प्रतिनिधित्व करने वाली नई [DateTime](./) क्लास की एक इंस्टेंस लौटाता है। |
| [AddMilliseconds](./addmilliseconds/)(double) const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए मान और निर्दिष्ट मिलीसेकंड की संख्या के योग के रूप में तिथि और समय मान का प्रतिनिधित्व करने वाली नई [DateTime](./) क्लास की एक इंस्टेंस लौटाता है। |
| [AddMinutes](./addminutes/)(double) const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए मान और निर्दिष्ट मिनटों की संख्या के योग के रूप में तिथि और समय मान का प्रतिनिधित्व करने वाली नई [DateTime](./) क्लास की एक इंस्टेंस लौटाता है। |
| [AddMonths](./addmonths/)(int) const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए मान और निर्दिष्ट महीनों की संख्या के योग के रूप में तिथि और समय मान का प्रतिनिधित्व करने वाली नई [DateTime](./) क्लास की एक इंस्टेंस लौटाता है। |
| [AddSeconds](./addseconds/)(double) const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए मान और निर्दिष्ट सेकंड की संख्या के योग के रूप में तिथि और समय मान का प्रतिनिधित्व करने वाली नई [DateTime](./) क्लास की एक इंस्टेंस लौटाता है। |
| [AddTicks](./addticks/)(int64_t) const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए मान और निर्दिष्ट 100-नैनोसेकंड अंतराल की संख्या के योग के रूप में तिथि और समय मान का प्रतिनिधित्व करने वाली नई [DateTime](./) क्लास की एक इंस्टेंस लौटाता है। |
| [AddYears](./addyears/)(int) const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए मान के वर्ष घटक को निर्दिष्ट संख्या से बढ़ाकर समान तिथि और समय मान वाली नई [DateTime](./) क्लास की एक इंस्टेंस लौटाता है। |
| static [Compare](./compare/)(DateTime, DateTime) | [DateTime](./) क्लास के निर्दिष्ट इंस्टेंस द्वारा प्रतिनिधित्व किए गए दो मानों की तुलना करता है और समय रेखा पर मानों की सापेक्ष स्थितियों को दर्शाने वाला मान लौटाता है। |
| [CompareTo](./compareto/)(DateTime) const | वर्तमान वस्तु और [DateTime](./) क्लास के निर्दिष्ट इंस्टेंस द्वारा प्रतिनिधित्व किए गए दो तिथि और समय मानों की तुलना करता है और समय रेखा पर मानों की सापेक्ष स्थितियों को दर्शाने वाला मान लौटाता है। |
| [DateTime](./datetime/)() | एक इंस्टेंस बनाता है जो MinValue के बराबर सबसे छोटा संभव तिथि और समय मान दर्शाता है। |
| [DateTime](./datetime/)(int, int, int) | एक इंस्टेंस बनाता है जो एक विशिष्ट वर्ष, माह और दिन के रूप में निर्दिष्ट तिथि और समय मान दर्शाता है। |
| [DateTime](./datetime/)(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | एक इंस्टेंस बनाता है जो निर्दिष्ट कैलेंडर में एक विशिष्ट वर्ष, माह और दिन के रूप में निर्दिष्ट तिथि और समय मान दर्शाता है। |
| [DateTime](./datetime/)(int, int, int, int, int, int) | एक उदाहरण बनाता है जो एक विशिष्ट वर्ष, माह, दिन, घंटा, मिनट और सेकंड के रूप में निर्दिष्ट तिथि और समय मान का प्रतिनिधित्व करता है। |
| [DateTime](./datetime/)(int, int, int, int, int, int, DateTimeKind) | एक उदाहरण बनाता है जो एक विशिष्ट वर्ष, माह, दिन, घंटा, मिनट और सेकंड के रूप में निर्दिष्ट तिथि और समय मान का प्रतिनिधित्व करता है। |
| [DateTime](./datetime/)(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | एक उदाहरण बनाता है जो निर्दिष्ट कैलेंडर में एक विशिष्ट वर्ष, माह, दिन, घंटा, मिनट और सेकंड के रूप में निर्दिष्ट तिथि और समय मान का प्रतिनिधित्व करता है। |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, DateTimeKind) | एक उदाहरण बनाता है जो एक विशिष्ट वर्ष, माह, दिन, घंटा, मिनट, सेकंड और मिलीसेकंड के रूप में निर्दिष्ट तिथि और समय मान का प्रतिनिधित्व करता है। |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) | एक उदाहरण बनाता है जो निर्दिष्ट कैलेंडर में एक विशिष्ट वर्ष, माह, दिन, घंटा, मिनट, सेकंड और मिलीसेकंड के रूप में निर्दिष्ट तिथि और समय मान का प्रतिनिधित्व करता है। |
| [DateTime](./datetime/)(int64_t, DateTimeKind) | एक उदाहरण बनाता है जो टिक की संख्या के रूप में निर्दिष्ट तिथि और समय मान का प्रतिनिधित्व करता है। |
| [DateTime](./datetime/)(int64_t, DateTimeKind, bool) | एक उदाहरण बनाता है जो टिक की संख्या के रूप में निर्दिष्ट तिथि और समय मान का प्रतिनिधित्व करता है। आंतरिक उपयोग के लिए। |
| [DateTime](./datetime/)(const DateTime\&) | एक उदाहरण की प्रतिलिपि-निर्माण करता है। |
| static [DaysInMonth](./daysinmonth/)(int, int) | निर्दिष्ट वर्ष के निर्दिष्ट माह में दिनों की संख्या लौटाता है। |
| static [Equals](./equals/)(DateTime, DateTime) | निर्धारित करता है कि क्या निर्दिष्ट [DateTime](./) क्लास के उदाहरण समान तिथि और समय मान का प्रतिनिधित्व करते हैं। |
| [Equals](./equals/)(DateTime) const | निर्धारित करता है कि क्या निर्दिष्ट [DateTime](./) क्लास का उदाहरण वर्तमान वस्तु के समान तिथि और समय मान का प्रतिनिधित्व करता है। |
| static [FromBinary](./frombinary/)(int64_t) | निर्दिष्ट अनसाइनड 64-बिट पूर्णांक से तिथि-समय मान को डीसीरियलाइज़ करता है और [DateTime](./) क्लास का नया उदाहरण उस मान पर सेट करता है। |
| static [FromFileTime](./fromfiletime/)(int64_t) | निर्दिष्ट फ़ाइल समय को स्थानीय समय के समान तिथि और समय मान का प्रतिनिधित्व करने वाले [DateTime](./) क्लास के उदाहरण में परिवर्तित करता है। |
| static [FromFileTimeUtc](./fromfiletimeutc/)(int64_t) | निर्दिष्ट फ़ाइल समय को UTC समय के समान तिथि और समय मान का प्रतिनिधित्व करने वाले [DateTime](./) क्लास के उदाहरण में परिवर्तित करता है। |
| static [FromOADate](./fromoadate/)(double) | निर्दिष्ट OLE ऑटोमेशन डेट के बराबर तिथि और समय मान का प्रतिनिधित्व करने वाला [DateTime](./) क्लास का उदाहरण लौटाता है। |
| static [FromUnixTime](./fromunixtime/)(time_t) | निर्दिष्ट यूनिक्स समय मान को [DateTime](./) क्लास के उदाहरण में परिवर्तित करता है। आंतरिक उपयोग के लिए। |
| [get_Date](./get_date/)() const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए तिथि और समय के तिथि भाग को दर्शाने वाला, समय भाग के प्रत्येक घटक को 0 पर सेट किया हुआ, नया [DateTime](./) क्लास का उदाहरण लौटाता है। |
| [get_Day](./get_day/)() const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए माह में दिन का क्रमांक लौटाता है। |
| [get_DayOfWeek](./get_dayofweek/)() const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए सप्ताह के दिन को दर्शाने वाला मान लौटाता है। |
| [get_DayOfYear](./get_dayofyear/)() const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए वर्ष में दिन का क्रमांक लौटाता है। |
| [get_Hour](./get_hour/)() const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए तिथि और समय मान का घंटा घटक लौटाता है। |
| [get_Kind](./get_kind/)() const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए तिथि और समय का स्थानीय, UTC या न तो कोई भी हो, इसे दर्शाने वाला मान लौटाता है। |
| [get_Millisecond](./get_millisecond/)() const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए तिथि और समय मान का मिलीसेकंड घटक लौटाता है। |
| [get_Minute](./get_minute/)() const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए तिथि और समय मान का मिनट घटक लौटाता है। |
| [get_Month](./get_month/)() const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए वर्ष में माह का क्रमांक लौटाता है। |
| static [get_Now](./get_now/)() | वर्तमान समय को स्थानीय समय के रूप में दर्शाने वाला [DateTime](./) क्लास का उदाहरण लौटाता है। |
| [get_Second](./get_second/)() const | वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए तिथि और समय मान का दूसरा घटक लौटाता है। |
| [get_Ticks](./get_ticks/)() const | वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए तिथि और समय तक ग्रेगोरियन कैलेंडर में 1 जनवरी, 0001, 0:00:00 UTC से बीते 100-नैनोसेकंड अंतरालों की संख्या लौटाता है। |
| [get_TimeOfDay](./get_timeofday/)() const | वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए दिन की शुरुआत से लेकर उसी ऑब्जेक्ट द्वारा दर्शाए गए तिथि और समय मान तक के समय अंतराल का मान लौटाता है। |
| static [get_Today](./get_today/)() | वर्तमान तिथि का प्रतिनिधित्व करने वाला, और ऑब्जेक्ट द्वारा दर्शाए गए मान के समय भाग के प्रत्येक घटक को 0 पर सेट करने वाला, [DateTime](./) क्लास का एक उदाहरण लौटाता है। |
| static [get_UtcNow](./get_utcnow/)() | वर्तमान समय को UTC के रूप में दर्शाने वाला, [DateTime](./) क्लास का एक उदाहरण लौटाता है। |
| [get_Year](./get_year/)() const | वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए वर्ष को लौटाता है। |
| [GetDateComponents](./getdatecomponents/)(int\&, int\&, int\&) const | तिथि के भाग प्राप्त करता है। आंतरिक उपयोग के लिए। |
| [GetDateTimeFormats](./getdatetimeformats/)() const | एक स्ट्रिंग्स की एरे लौटाता है जहाँ प्रत्येक तत्व वर्तमान ऑब्जेक्ट का स्ट्रिंग प्रतिनिधित्व होता है, जो मानक तिथि और समय फ़ॉर्मेट स्पेसिफ़ायर में से एक के साथ स्वरूपित किया गया है। |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t) const | एक स्ट्रिंग्स की एरे लौटाता है जहाँ प्रत्येक तत्व वर्तमान ऑब्जेक्ट का स्ट्रिंग प्रतिनिधित्व होता है, जिसे निर्दिष्ट मानक तिथि और समय फ़ॉर्मेट स्पेसिफ़ायर के साथ स्वरूपित किया गया है। |
| [GetDateTimeFormats](./getdatetimeformats/)(const SharedPtr\<IFormatProvider\>\&) const | एक स्ट्रिंग्स की एरे लौटाता है जहाँ प्रत्येक तत्व वर्तमान ऑब्जेक्ट का स्ट्रिंग प्रतिनिधित्व होता है, जिसे मानक तिथि और समय फ़ॉर्मेट स्पेसिफ़ायर में से एक और निर्दिष्ट फ़ॉर्मेट प्रोवाइडर के साथ स्वरूपित किया गया है। |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t, const SharedPtr\<IFormatProvider\>\&) const | एक स्ट्रिंग्स की एरे लौटाता है जहाँ प्रत्येक तत्व वर्तमान ऑब्जेक्ट का स्ट्रिंग प्रतिनिधित्व होता है, जिसे निर्दिष्ट मानक तिथि और समय फ़ॉर्मेट स्पेसिफ़ायर और फ़ॉर्मेट प्रोवाइडर के साथ स्वरूपित किया गया है। |
| [GetHashCode](./gethashcode/)() const | वर्तमान ऑब्जेक्ट के लिए हैश कोड लौटाता है। |
| [IsDaylightSavingTime](./isdaylightsavingtime/)() const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया तिथि और समय मान वर्तमान समय क्षेत्र के डेलाइट सेविंग टाइम की सीमा में आता है या नहीं। |
| static [IsLeapYear](./isleapyear/)(int) | निर्धारित करता है कि निर्दिष्ट वर्ष लीप वर्ष है या नहीं। |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(DateTime) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट और निर्दिष्ट [DateTime](./) ऑब्जेक्ट अलग-अलग तिथि और समय मान दर्शाते हैं या नहीं। |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | एक नया [DateTime](./) क्लास का उदाहरण लौटाता है जो वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए मान और निर्दिष्ट टाइम स्पैन के योग को दर्शाता है। |
| [operator+=](./operator+=/)(TimeSpan) | वर्तमान ऑब्जेक्ट को उस तिथि और समय मान पर सेट करता है जो वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए मान और निर्दिष्ट टाइम स्पैन के योग के बराबर है। |
| [operator-](./operator-/)(TimeSpan) const | एक नया [DateTime](./) क्लास का उदाहरण लौटाता है जो वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए मान से निर्दिष्ट टाइम स्पैन घटाने के परिणामस्वरूप प्राप्त तिथि और समय मान को दर्शाता है। |
| [operator-](./operator-/)(DateTime) const | एक [TimeSpan](../timespan/) क्लास का इंस्टेंस लौटाता है जो वर्तमान और निर्दिष्ट ऑब्जेक्ट्स द्वारा दर्शाए गए तिथि और समय मानों के बीच समय अंतराल को दर्शाता है। |
| [operator-=](./operator-=/)(TimeSpan) | वर्तमान ऑब्जेक्ट को उस तिथि और समय मान पर सेट करता है जो वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए तिथि और समय मान से निर्दिष्ट टाइम स्पैन घटाने के परिणामस्वरूप प्राप्त होता है। |
| [operator<](./operator_/)(DateTime) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया तिथि और समय मान निर्दिष्ट [DateTime](./) ऑब्जेक्ट द्वारा दर्शाए गए मान से पहले है या नहीं। |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(DateTime) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया तिथि और समय मान निर्दिष्ट [DateTime](./) ऑब्जेक्ट द्वारा दर्शाए गए मान से पहले या समान है या नहीं। |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const DateTime\&) | निर्दिष्ट [DateTime](./) इंस्टेंस द्वारा दर्शाए गए मान को वर्तमान ऑब्जेक्ट को असाइन करता है। |
| [operator==](./operator==/)(DateTime) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट और निर्दिष्ट [DateTime](./) ऑब्जेक्ट एक ही तिथि और समय मान दर्शाते हैं या नहीं। |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(DateTime) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया तिथि और समय मान निर्दिष्ट [DateTime](./) ऑब्जेक्ट द्वारा दर्शाए गए मान से बाद में है या नहीं। |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(DateTime) const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा दर्शाया गया तिथि और समय मान निर्दिष्ट [DateTime](./) ऑब्जेक्ट द्वारा दर्शाए गए मान से बाद में या समान है या नहीं। |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | निर्दिष्ट तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व को समकक्ष [DateTime](./) ऑब्जेक्ट में परिवर्तित करता है। |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | निर्दिष्ट तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व को सांस्कृतिक-विशिष्ट फ़ॉर्मेट जानकारी का उपयोग करके समतुल्य [DateTime](./) ऑब्जेक्ट में परिवर्तित करता है। |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | निर्दिष्ट तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व को निर्दिष्ट फ़ॉर्मेट और सांस्कृतिक-विशिष्ट फ़ॉर्मेट जानकारी का उपयोग करके समतुल्य [DateTime](./) ऑब्जेक्ट में परिवर्तित करता है। स्ट्रिंग प्रतिनिधित्व का फ़ॉर्मेट बिल्कुल निर्दिष्ट फ़ॉर्मेट से मेल खाना चाहिए। यदि रूपांतरण विफल होता है तो एक अपवाद फेंकता है। |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | निर्दिष्ट तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व को निर्दिष्ट फ़ॉर्मेट्स, सांस्कृतिक-विशिष्ट फ़ॉर्मेट जानकारी और शैली का उपयोग करके समतुल्य [DateTime](./) ऑब्जेक्ट में परिवर्तित करता है। स्ट्रिंग प्रतिनिधित्व का फ़ॉर्मेट बिल्कुल एक या अधिक निर्दिष्ट फ़ॉर्मेट्स से मेल खाना चाहिए। यदि रूपांतरण विफल होता है तो एक अपवाद फेंकता है। |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [SpecifyKind](./specifykind/)(DateTime, DateTimeKind) | एक नया [DateTime](./) ऑब्जेक्ट बनाता है जो निर्दिष्ट [DateTime](./) ऑब्जेक्ट के समान टिक्स की संख्या को दर्शाता है और तर्क **kind** द्वारा निर्दिष्ट अनुसार स्थानीय समय, UTC समय या कोई नहीं दर्शाता है। |
| [Subtract](./subtract/)(TimeSpan) const | एक नया [DateTime](./) क्लास का उदाहरण लौटाता है जो वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए मान से निर्दिष्ट टाइम स्पैन घटाने के परिणामस्वरूप प्राप्त तिथि और समय मान को दर्शाता है। |
| [Subtract](./subtract/)(DateTime) const | वर्तमान और निर्दिष्ट ऑब्जेक्ट्स द्वारा दर्शाए गए तिथि और समय मानों के बीच समय अंतराल को दर्शाने वाली [TimeSpan](../timespan/) क्लास का एक उदाहरण लौटाता है। |
| [ToBinary](./tobinary/)() const | वर्तमान ऑब्जेक्ट को क्रमबद्ध (सीरियलाइज़) करता है। |
| [ToFileTime](./tofiletime/)() const | वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए तिथि और समय मान को फ़ाइल समय के रूप में दर्शाने वाला मान लौटाता है। |
| [ToFileTimeUtc](./tofiletimeutc/)() const | वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए तिथि और समय मान को फ़ाइल समय UTC में परिवर्तित करता है। |
| [ToLocalTime](./tolocaltime/)() const | वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए तिथि और समय मान को स्थानीय समय के रूप में दर्शाने वाली नई [DateTime](./) क्लास का एक उदाहरण लौटाता है। |
| [ToLongDateString](./tolongdatestring/)() const | वर्तमान ऑब्जेक्ट की लंबी तिथि स्ट्रिंग प्रतिनिधित्व को शामिल करने वाली स्ट्रिंग लौटाता है। |
| [ToLongTimeString](./tolongtimestring/)() const | वर्तमान ऑब्जेक्ट की लंबी समय स्ट्रिंग प्रतिनिधित्व को शामिल करने वाली स्ट्रिंग लौटाता है। |
| [ToOADate](./tooadate/)() const | वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए तिथि और समय मान को OLE ऑटोमेशन डेट के रूप में लौटाता है। |
| [ToShortDateString](./toshortdatestring/)() const | वर्तमान ऑब्जेक्ट की संक्षिप्त तिथि स्ट्रिंग प्रतिनिधित्व को शामिल करने वाली स्ट्रिंग लौटाता है। |
| [ToShortTimeString](./toshorttimestring/)() const | वर्तमान ऑब्जेक्ट की संक्षिप्त समय स्ट्रिंग प्रतिनिधित्व को शामिल करने वाली स्ट्रिंग लौटाता है। |
| [ToString](./tostring/)() const | वर्तमान संस्कृति द्वारा परिभाषित फ़ॉर्मेटिंग सम्मेलनों का उपयोग करके वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [ToString](./tostring/)(const String\&) const | निर्दिष्ट फ़ॉर्मेट और वर्तमान संस्कृति द्वारा परिभाषित फ़ॉर्मेटिंग सम्मेलनों का उपयोग करके वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | निर्दिष्ट फ़ॉर्मेट जानकारी का उपयोग करके वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | निर्दिष्ट फ़ॉर्मेट जानकारी का उपयोग करके वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToUniversalTime](./touniversaltime/)() const | वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए तिथि और समय मान को UTC के रूप में दर्शाने वाली नई [DateTime](./) क्लास का एक उदाहरण लौटाता है। |
| [ToUnixTime](./tounixtime/)() const | वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए तिथि और समय मान को यूनिक्स समय के रूप में दर्शाने वाला मान लौटाता है। आंतरिक उपयोग के लिए। |
| static [TryParse](./tryparse/)(const String\&, DateTime\&) | निर्दिष्ट तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व को समकक्ष [DateTime](./) ऑब्जेक्ट में परिवर्तित करता है। |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | निर्दिष्ट तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व को निर्दिष्ट सांस्कृतिक-विशिष्ट फ़ॉर्मेट जानकारी और शैली का उपयोग करके समतुल्य [DateTime](./) ऑब्जेक्ट में परिवर्तित करता है। |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | निर्दिष्ट तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व को निर्दिष्ट फ़ॉर्मेट, सांस्कृतिक-विशिष्ट फ़ॉर्मेट जानकारी और शैली का उपयोग करके समतुल्य [DateTime](./) ऑब्जेक्ट में परिवर्तित करता है। स्ट्रिंग प्रतिनिधित्व का फ़ॉर्मेट बिल्कुल निर्दिष्ट फ़ॉर्मेट से मेल खाना चाहिए। |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | निर्दिष्ट तिथि और समय मान की स्ट्रिंग प्रतिनिधित्व को निर्दिष्ट फ़ॉर्मेट्स, सांस्कृतिक-विशिष्ट फ़ॉर्मेट जानकारी और शैली का उपयोग करके समतुल्य [DateTime](./) ऑब्जेक्ट में परिवर्तित करता है। स्ट्रिंग प्रतिनिधित्व का फ़ॉर्मेट बिल्कुल एक या अधिक निर्दिष्ट फ़ॉर्मेट्स से मेल खाना चाहिए। |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [Type](./type/)() | इस क्लास के बारे में जानकारी शामिल करने वाला एक [TypeInfo](../typeinfo/) ऑब्जेक्ट लौटाता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static constexpr [MaxTicks](./maxticks/) | न्यूनतम संभव और अधिकतम संभव [DateTime](./) मान के बीच समय अंतराल में 100-नैनोसेकंड की संख्या। |
| static [MaxValue](./maxvalue/) | अधिकतम संभव तिथि और समय मान को दर्शाने वाली [DateTime](./) क्लास का एक उदाहरण। |
| static constexpr [MinTicks](./minticks/) | एक [DateTime](./) क्लास की इंस्टेंस द्वारा प्रतिनिधित्व किया जा सकने वाला न्यूनतम टिक्स संख्या। |
| static [MinValue](./minvalue/) | [DateTime](./) क्लास की एक इंस्टेंस जो न्यूनतम संभव तिथि और समय मान का प्रतिनिधित्व करती है। |
| static constexpr [TicksPerDay](./ticksperday/) | एक दिन में टिक्स की संख्या। |
| static constexpr [TicksPerHour](./ticksperhour/) | एक घंटे में टिक्स की संख्या। |
| static constexpr [TicksPerMicrosecond](./tickspermicrosecond/) | एक माइक्रोसेकंड में टिक्स की संख्या। |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | एक मिलीसेकंड में टिक्स की संख्या। |
| static constexpr [TicksPerMinute](./ticksperminute/) | एक मिनट में टिक्स की संख्या। |
| static constexpr [TicksPerSecond](./tickspersecond/) | एक सेकंड में टिक्स की संख्या। |
| static [UnixEpoch](./unixepoch/) | [DateTime](./) क्लास की एक इंस्टेंस जो यूनिक्स एपोक की शुरुआत (1970.01.01 00:00:00) का प्रतिनिधित्व करती है। |
## टिप्पणियाँ



```cpp
#include "system/console.h"
#include "system/date_time.h"

int main()
{
  using namespace System;

  // 'DateTime' क्लास की इंस्टेंस बनाएं।
  DateTime dateTime{1990, 10, 30};

  // इंस्टेंस को कई स्वरूपों में प्रिंट करें।
  Console::WriteLine(dateTime.ToShortDateString());
  Console::WriteLine(dateTime.ToShortTimeString());
  Console::WriteLine(dateTime.ToString());

  return 0;
}
/*
This code example produces the following output:
30.10.1990
0:00
30.10.1990 0:00:00
*/
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
