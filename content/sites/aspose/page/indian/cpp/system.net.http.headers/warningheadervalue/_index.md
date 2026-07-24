---
title: "System::Net::Http::Headers::WarningHeaderValue क्लास"
linktitle: "WarningHeaderValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::WarningHeaderValue क्लास। ''Warning'' हेडर का मान दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2700
url: /hi/cpp/system.net.http.headers/warningheadervalue/
---
## WarningHeaderValue class


'Warning' हेडर का मान दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class WarningHeaderValue : public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_Agent](./get_agent/)() | चेतावनी से जुड़ा होस्ट लौटाता है। |
| [get_Code](./get_code/)() | RTTI जानकारी। |
| [get_Date](./get_date/)() | चेतावनी की तिथि‑समय लौटाता है। |
| [get_Text](./get_text/)() | चेतावनी पाठ लौटाता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| static [GetWarningLength](./getwarninglength/)(String, int32_t, System::SharedPtr\<Object\>\&) | निर्दिष्ट इंडेक्स से पास किए गए स्ट्रिंग को [WarningHeaderValue](./) क्लास का एक उदाहरण में परिवर्तित करता है। |
| static [Parse](./parse/)(String) | पास किए गए स्ट्रिंग को [WarningHeaderValue](./) क्लास का एक उदाहरण में परिवर्तित करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<WarningHeaderValue\>\&) | पास किए गए स्ट्रिंग को [WarningHeaderValue](./) क्लास का एक उदाहरण में परिवर्तित करने का प्रयास करता है। |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String) | एक नया उदाहरण बनाता है। |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String, DateTimeOffset) | एक नया उदाहरण बनाता है। |
## संबंधित देखें

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
