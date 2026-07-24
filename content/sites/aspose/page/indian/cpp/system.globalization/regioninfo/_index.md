---
title: "System::Globalization::RegionInfo क्लास"
linktitle: "RegionInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::RegionInfo क्लास। क्षेत्र के बारे में जानकारी प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें C++ में।"
type: docs
weight: 2100
url: /hi/cpp/system.globalization/regioninfo/
---
## RegionInfo class


क्षेत्र के बारे में जानकारी प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class RegionInfo : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_CurrencyEnglishName](./get_currencyenglishname/)() const | मुद्रा का अंग्रेज़ी नाम प्राप्त करता है। |
| virtual [get_CurrencyNativeName](./get_currencynativename/)() const | मुद्रा का मूल नाम प्राप्त करता है। |
| virtual [get_CurrencySymbol](./get_currencysymbol/)() const | मुद्रा प्रतीक प्राप्त करता है। |
| static [get_CurrentRegion](./get_currentregion/)() | सिस्टम में सेट किए गए क्षेत्र को प्राप्त करता है। |
| virtual [get_DisplayName](./get_displayname/)() const | पूरा क्षेत्र नाम प्राप्त करता है। |
| virtual [get_EnglishName](./get_englishname/)() const | अंग्रेज़ी क्षेत्र नाम प्राप्त करता है। |
| virtual [get_GeoId](./get_geoid/)() const | एक क्षेत्र के लिए अद्वितीय पहचानकर्ता प्राप्त करता है। |
| virtual [get_IsMetric](./get_ismetric/)() const | जाँचता है कि क्या क्षेत्र मीट्रिक प्रणाली का उपयोग करता है। |
| virtual [get_ISOCurrencySymbol](./get_isocurrencysymbol/)() const | ISO मुद्रा प्रतीक प्राप्त करता है। |
| virtual [get_Name](./get_name/)() const | क्षेत्र नाम प्राप्त करता है। |
| virtual [get_NativeName](./get_nativename/)() const | मूल क्षेत्र नाम प्राप्त करता है। |
| virtual [get_ThreeLetterISORegionName](./get_threeletterisoregionname/)() const | 3 अक्षर वाला ISO क्षेत्र कोड प्राप्त करता है। |
| virtual [get_ThreeLetterWindowsRegionName](./get_threeletterwindowsregionname/)() const | 3 अक्षर वाला [Windows](../../system.windows/) क्षेत्र कोड प्राप्त करता है। |
| virtual [get_TwoLetterISORegionName](./get_twoletterisoregionname/)() const | 2 अक्षर वाला ISO क्षेत्र कोड प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| [operator=](./operator=/)(const RegionInfo\&) |  |
| [RegionInfo](./regioninfo/)(const String\&) | RTTI जानकारी। |
| [RegionInfo](./regioninfo/)(int) | निर्माता। |
| [RegionInfo](./regioninfo/)(const RegionInfo\&) |  |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
