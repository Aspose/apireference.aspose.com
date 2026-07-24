---
title: "System::Globalization::CultureInfo class"
linktitle: "CultureInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::CultureInfo क्लास। संस्कृति-विशिष्ट मानों और एल्गोरिदम का संग्रह। सेट्टर ऑपरेशन्स केवल गैर-रीड-ओनली ऑब्जेक्ट्स पर सक्षम होते हैं। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। कभी भी इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 500
url: /hi/cpp/system.globalization/cultureinfo/
---
## CultureInfo class


संस्कृति-विशिष्ट मानों और एल्गोरिदम का संग्रह। सेट्टर ऑपरेशन्स केवल गैर-रीड-ओनली ऑब्जेक्ट्स पर सक्षम होते हैं। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। कभी भी इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class CultureInfo : public virtual System::Object,
                    public System::IFormatProvider,
                    public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ClearCachedData](./clearcacheddata/)() | कैश किए गए संस्कृति जानकारी को रीफ़्रेश करता है। |
| [Clone](./clone/)() override | संस्कृति जानकारी की क्लोन बनाता है। |
| static [CreateSpecificCulture](./createspecificculture/)(const String\&) | नाम द्वारा संस्कृति बनाता है। |
| explicit [CultureInfo](./cultureinfo/)(int) | RTTI जानकारी। |
| [CultureInfo](./cultureinfo/)(int, bool) | निर्माता। |
| explicit [CultureInfo](./cultureinfo/)(const String\&) | निर्माता। |
| [CultureInfo](./cultureinfo/)(const String\&, bool) | निर्माता। |
| [CultureInfo](./cultureinfo/)(std::nullptr_t) | हमेशा ArgumentNullException फेंकता है। |
| [Equals](./equals/)(SharedPtr\<Object\>) override | ऑब्जेक्ट्स की तुलना करता है। |
| virtual [get_Calendar](./get_calendar/)() const | संस्कृति द्वारा उपयोग किए जाने वाले कैलेंडर को प्राप्त करता है। |
| virtual [get_CompareInfo](./get_compareinfo/)() const | संस्कृति नियमों का पालन करने वाला स्ट्रिंग कंपेयर प्राप्त करता है। |
| [get_CultureTypes](./get_culturetypes/)() const | वर्तमान संस्कृति का वर्णन करने वाले संस्कृति प्रकारों का बिटवाइज़ संयुक्त प्राप्त करता है। |
| static [get_CurrentCulture](./get_currentculture/)() | वर्तमान थ्रेड के लिए सेट की गई संस्कृति को प्राप्त करता है। |
| static [get_CurrentUICulture](./get_currentuiculture/)() | वर्तमान थ्रेड की UI संस्कृति को प्राप्त करता है। |
| virtual [get_DateTimeFormat](./get_datetimeformat/)() const | तारीख फ़ॉर्मेट जानकारी प्राप्त करता है। |
| static [get_DefaultThreadCurrentCulture](./get_defaultthreadcurrentculture/)() | वर्तमान एप्लिकेशन डोमेन में डिफ़ॉल्ट संस्कृति को प्राप्त करता है। |
| static [get_DefaultThreadCurrentUICulture](./get_defaultthreadcurrentuiculture/)() | वर्तमान एप्लिकेशन डोमेन में डिफ़ॉल्ट UI संस्कृति को प्राप्त करता है। |
| virtual [get_DisplayName](./get_displayname/)() const | संस्कृति का डिस्प्ले नाम प्राप्त करता है। |
| virtual [get_EnglishName](./get_englishname/)() const | संस्कृति का अंग्रेज़ी नाम प्राप्त करता है। |
| [get_IetfLanguageTag](./get_ietflanguagetag/)() const | भाषा के लिए RFC 4646 नाम प्राप्त करता है। |
| static [get_InstalledUICulture](./get_installeduiculture/)() | ऑपरेटिंग सिस्टम के साथ स्थापित संस्कृति को प्राप्त करता है। |
| static [get_InvariantCulture](./get_invariantculture/)() | इनवेरिएंट संस्कृति को प्राप्त करता है। |
| virtual [get_IsNeutralCulture](./get_isneutralculture/)() const | जाँचता है कि संस्कृति न्यूट्रल है या नहीं। |
| [get_IsReadOnly](./get_isreadonly/)() const | जाँचता है कि संस्कृति वस्तु केवल-पढ़ने योग्य है। |
| virtual [get_KeyboardLayoutId](./get_keyboardlayoutid/)() const | सक्रिय इनपुट लोकेल पहचानकर्ता प्राप्त करता है। |
| virtual [get_LCID](./get_lcid/)() const | संस्कृति पहचानकर्ता प्राप्त करता है। |
| virtual [get_Name](./get_name/)() const | संस्कृति नाम प्राप्त करता है। |
| virtual [get_NativeName](./get_nativename/)() const | संस्कृति मूल नाम प्राप्त करता है। |
| virtual [get_NumberFormat](./get_numberformat/)() const | संख्या स्वरूप जानकारी प्राप्त करता है। |
| virtual [get_OptionalCalendars](./get_optionalcalendars/)() const | संस्कृति के साथ उपयोग किए जा सकने वाले कैलेंडरों की सूची। |
| virtual [get_Parent](./get_parent/)() const | पैरेंट संस्कृति प्राप्त करता है। |
| virtual [get_TextInfo](./get_textinfo/)() const | संस्कृति द्वारा उपयोग किए जाने वाले टेक्स्ट पैरामीटर प्राप्त करता है। |
| virtual [get_ThreeLetterISOLanguageName](./get_threeletterisolanguagename/)() const | तीन-अक्षर वाला ISO 639-2 भाषा कोड प्राप्त करता है। |
| virtual [get_ThreeLetterWindowsLanguageName](./get_threeletterwindowslanguagename/)() const | भाषा के लिए तीन-अक्षर कोड प्राप्त करता है जैसा कि [Windows](../../system.windows/) API में परिभाषित है। |
| virtual [get_TwoLetterISOLanguageName](./get_twoletterisolanguagename/)() const | संस्कृति से जुड़ा दो-अक्षर ISO भाषा नाम प्राप्त करता है। |
| [get_UseUserOverride](./get_useuseroverride/)() const | [CultureInfo](./) उपयोगकर्ता-चयनित संस्कृति सेटिंग्स का उपयोग करता है या नहीं, यह दर्शाने वाला फ़्लैग प्राप्त करता है। |
| [GetConsoleFallbackUICulture](./getconsolefallbackuiculture/)() const | कंसोल अनुप्रयोगों के लिए उपयुक्त वैकल्पिक संस्कृति प्राप्त करता है। |
| static [GetCultureInfo](./getcultureinfo/)(const String\&) | नाम द्वारा संस्कृति प्राप्त करता है। यह CreateSpecificCulture के समान है। |
| static [GetCultureInfo](./getcultureinfo/)(const String\&, const String\&) | नाम द्वारा संस्कृति प्राप्त करता है। |
| static [GetCultureInfo](./getcultureinfo/)(int32_t) | आईडी द्वारा संस्कृति प्राप्त करता है। |
| static [GetCultureInfoByIetfLanguageTag](./getcultureinfobyietflanguagetag/)(const String\&) | अप्रचलित। निर्दिष्ट RFC 4646 भाषा टैग द्वारा केवल-पढ़ने योग्य [CultureInfo](./) वस्तु प्राप्त करता है। |
| static [GetCultures](./getcultures/)(CultureTypes) | निर्दिष्ट प्रकारों में आने वाली संस्कृतियों को प्राप्त करता है। |
| [GetFormat](./getformat/)(const TypeInfo\&) override | विशिष्ट प्रकार के लिए फ़ॉर्मेट वस्तु प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override | वस्तु का हैश कोड लौटाता है। |
| [IsInherited](./isinherited/)() const | विरासत में मिला फ़्लैग प्राप्त करता है। आंतरिक उपयोग के लिए। |
| [operator=](./operator=/)(const CultureInfo\&) |  |
| [operator==](./operator==/)(const CultureInfo\&) const | संस्कृति पैरामीटरों की तुलना करता है। |
| static [ReadOnly](./readonly/)(const CultureInfoPtr\&) | संस्कृति का केवल-पढ़ने योग्य संस्करण प्राप्त करता है। |
| static [set_CurrentCulture](./set_currentculture/)(const CultureInfoPtr\&) | वर्तमान थ्रेड के लिए संस्कृति सेट करता है। |
| static [set_CurrentUICulture](./set_currentuiculture/)(const CultureInfoPtr\&) | वर्तमान थ्रेड की UI संस्कृति सेट करता है। |
| virtual [set_DateTimeFormat](./set_datetimeformat/)(DateTimeFormatInfoPtr) | तारीख फ़ॉर्मेट जानकारी सेट करता है। |
| static [set_DefaultThreadCurrentCulture](./set_defaultthreadcurrentculture/)(const CultureInfoPtr\&) | वर्तमान एप्लिकेशन डोमेन में डिफ़ॉल्ट संस्कृति सेट करता है। |
| static [set_DefaultThreadCurrentUICulture](./set_defaultthreadcurrentuiculture/)(const CultureInfoPtr\&) | वर्तमान एप्लिकेशन डोमेन में डिफ़ॉल्ट UI संस्कृति सेट करता है। |
| virtual [set_NumberFormat](./set_numberformat/)(NumberFormatInfoPtr) | संख्या स्वरूप जानकारी प्राप्त करता है। |
| [ToString](./tostring/)() const override | संस्कृति को स्ट्रिंग में बदलता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
