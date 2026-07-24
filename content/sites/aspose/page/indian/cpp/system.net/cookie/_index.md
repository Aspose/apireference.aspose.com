---
title: "System::Net::Cookie क्लास"
linktitle: "कुकी"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Cookie क्लास। एक HTTP कुकी का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।"
type: docs
weight: 100
url: /hi/cpp/system.net/cookie/
---
## Cookie class


एक HTTP कुकी का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class Cookie : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() | वर्तमान इंस्टेंस की एक प्रति बनाता है। |
| [Cookie](./cookie/)() | एक नया उदाहरण बनाता है। |
| [Cookie](./cookie/)(String, String) | एक नया उदाहरण बनाता है। |
| [Cookie](./cookie/)(String, String, String) | एक नया उदाहरण बनाता है। |
| [Cookie](./cookie/)(String, String, String, String) | एक नया उदाहरण बनाता है। |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_Comment](./get_comment/)() const | 'Comment' एट्रिब्यूट का मान प्राप्त करता है। |
| [get_CommentUri](./get_commenturi/)() const | 'CommentURL' एट्रिब्यूट का मान प्राप्त करता है। |
| [get_Discard](./get_discard/)() const | 'Discard' एट्रिब्यूट का मान प्राप्त करता है। |
| [get_Domain](./get_domain/)() const | 'Domain' एट्रिब्यूट का मान प्राप्त करता है। |
| [get_DomainImplicit](./get_domainimplicit/)() | डोमेन निहित है या नहीं, यह दर्शाने वाला मान प्राप्त करता है। |
| [get_DomainKey](./get_domainkey/)() const | डोमेन कुंजी लौटाता है। |
| [get_Expired](./get_expired/)() | कुकी समाप्त हुई है या नहीं, यह दर्शाने वाला मान प्राप्त करता है। |
| [get_Expires](./get_expires/)() | 'Expires' एट्रिब्यूट का मान प्राप्त करता है। |
| [get_HttpOnly](./get_httponly/)() const | 'HttpOnly' एट्रिब्यूट का मान प्राप्त करता है। |
| [get_Name](./get_name/)() const | कुकी का नाम प्राप्त करता है। |
| [get_Path](./get_path/)() const | 'Path' एट्रिब्यूट का मान प्राप्त करता है। |
| [get_Plain](./get_plain/)() const | कुकी विनिर्देशन 'Plain' है या नहीं, यह दर्शाने वाला मान लौटाता है। |
| [get_Port](./get_port/)() const | 'Port' एट्रिब्यूट का मान प्राप्त करता है। |
| [get_PortList](./get_portlist/)() const | 'Port' एट्रिब्यूट के मानों का संग्रह लौटाता है। |
| [get_Secure](./get_secure/)() const | 'Secure' एट्रिब्यूट का मान प्राप्त करता है। |
| [get_TimeStamp](./get_timestamp/)() const | कुकी के निर्मित होने का समय लौटाता है। |
| [get_Value](./get_value/)() const | कुकी का मान प्राप्त करता है। |
| [get_Variant](./get_variant/)() const | कुकी का विनिर्देशन प्राप्त करता है। |
| [get_Version](./get_version/)() const | '[Version](../../system/version/)' एट्रिब्यूट का मान प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| [InternalSetName](./internalsetname/)(String) | यह मेथड अन्य मेथड्स द्वारा मेथड नाम सेट करने के लिए बुलाया जाता है। |
| [set_Comment](./set_comment/)(String) | 'Comment' एट्रिब्यूट का मान सेट करता है। |
| [set_CommentUri](./set_commenturi/)(System::SharedPtr\<Uri\>) | 'CommentURL' एट्रिब्यूट का मान सेट करता है। |
| [set_Discard](./set_discard/)(bool) | 'Discard' एट्रिब्यूट का मान सेट करता है। |
| [set_Domain](./set_domain/)(String) | 'Domain' एट्रिब्यूट का मान सेट करता है। |
| [set_DomainImplicit](./set_domainimplicit/)(bool) | डोमेन यदि अप्रत्यक्ष है तो दर्शाने वाला मान सेट करता है। |
| [set_Expired](./set_expired/)(bool) | कुकी समाप्त हुई है या नहीं दर्शाने वाला मान सेट करता है। |
| [set_Expires](./set_expires/)(DateTime) | 'Expires' एट्रिब्यूट का मान सेट करता है। |
| [set_HttpOnly](./set_httponly/)(bool) | 'HttpOnly' एट्रिब्यूट का मान सेट करता है। |
| [set_Name](./set_name/)(String) | कुकी का नाम सेट करता है। |
| [set_Path](./set_path/)(String) | 'Path' एट्रिब्यूट का मान सेट करता है। |
| [set_Port](./set_port/)(String) | 'Port' एट्रिब्यूट का मान सेट करता है। |
| [set_Secure](./set_secure/)(bool) | 'Secure' एट्रिब्यूट का मान सेट करता है। |
| [set_Value](./set_value/)(String) | कुकी का मान सेट करता है। |
| [set_Variant](./set_variant/)(CookieVariant) | कुकी का विनिर्देशन सेट करता है। |
| [set_Version](./set_version/)(int32_t) | '[Version](../../system/version/)' एट्रिब्यूट का मान सेट करता है। |
| [ToServerString](./toserverstring/)() | वर्तमान इंस्टेंस को स्ट्रिंग प्रतिनिधित्व में सीरियलाइज़ करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| [VerifySetDefaults](./verifysetdefaults/)(CookieVariant, System::SharedPtr\<Uri\>, bool, String, bool, bool) | डिफ़ॉल्ट एट्रिब्यूट के मानों को सत्यापित करता है और सेट करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [CommentAttributeName](./commentattributename/) | 'Comment' एट्रिब्यूट का नाम। |
| static [CommentUrlAttributeName](./commenturlattributename/) | 'CommentURL' एट्रिब्यूट का नाम। |
| static [DiscardAttributeName](./discardattributename/) | 'Discard' एट्रिब्यूट का नाम। |
| static [DomainAttributeName](./domainattributename/) | 'Domain' एट्रिब्यूट का नाम। |
| static [EqualsLiteral](./equalsliteral/) | एक विशेषता के नाम और मान को अलग करने के लिए उपयोग किया जाने वाला विभाजक। |
| static [ExpiresAttributeName](./expiresattributename/) | ‘Expires’ विशेषता का नाम। |
| static [HttpOnlyAttributeName](./httponlyattributename/) | ‘HttpOnly’ विशेषता का नाम। |
| static [MaxAgeAttributeName](./maxageattributename/) | ‘Max-Age’ विशेषता का नाम। |
| static [MaxSupportedVersion](./maxsupportedversion/) | RTTI जानकारी। |
| static [MaxSupportedVersionString](./maxsupportedversionstring/) | अधिकतम समर्थित संस्करण का स्ट्रिंग प्रतिनिधित्व। |
| static [PathAttributeName](./pathattributename/) | ‘Path’ विशेषता का नाम। |
| static [PortAttributeName](./portattributename/) | ‘Port’ विशेषता का नाम। |
| static [PortSplitDelimiters](./portsplitdelimiters/) | ‘Port’ विशेषता के मानों के लिए विभाजकों को सम्मिलित करने वाला एरे। |
| static [QuotesLiteral](./quotesliteral/) | विशेषता के भागों को घेरने के लिए उपयोग किया जाने वाला प्रतीक। |
| static [ReservedToName](./reservedtoname/) | कुकी नाम के लिए आरक्षित एक मान। |
| static [ReservedToValue](./reservedtovalue/) | कुकी मान के लिए आरक्षित एक मान। |
| static [SecureAttributeName](./secureattributename/) | ‘Secure’ विशेषता का नाम। |
| static [SeparatorLiteral](./separatorliteral/) | विशेषता विभाजक। |
| static [SpecialAttributeLiteral](./specialattributeliteral/) | विशेष विशेषताओं के नामों का उपसर्ग। |
| static [VersionAttributeName](./versionattributename/) | ‘[Version](../../system/version/)’ विशेषता का नाम। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
