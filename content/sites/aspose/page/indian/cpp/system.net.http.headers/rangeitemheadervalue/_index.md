---
title: "System::Net::Http::Headers::RangeItemHeaderValue क्लास"
linktitle: "RangeItemHeaderValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::RangeItemHeaderValue क्लास। ''Range'' हेडर के मान में बाइट्स की एक रेंज दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2100
url: /hi/cpp/system.net.http.headers/rangeitemheadervalue/
---
## RangeItemHeaderValue class


'Range' हेडर के मान में बाइट्स की एक रेंज दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class RangeItemHeaderValue : public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_From](./get_from/)() | RTTI जानकारी। |
| [get_To](./get_to/)() | डेटा भेजने को जहाँ रोकना है, उस स्थिति को लौटाता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| static [GetRangeItemLength](./getrangeitemlength/)(String, int32_t, System::SharedPtr\<RangeItemHeaderValue\>\&) | निर्दिष्ट इंडेक्स से पास की गई स्ट्रिंग को [RangeItemHeaderValue](./) क्लास का एक उदाहरण में परिवर्तित करता है। |
| static [GetRangeItemListLength](./getrangeitemlistlength/)(String, int32_t, System::SharedPtr\<Collections::Generic::ICollection\<System::SharedPtr\<RangeItemHeaderValue\>\>\>) | निर्दिष्ट स्थिति से पास की गई स्ट्रिंग को RangeItemHeaderValue-क्लास के उदाहरणों के संग्रह में परिवर्तित करता है। |
| [RangeItemHeaderValue](./rangeitemheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | एक नया उदाहरण बनाता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
## संबंधित देखें

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
