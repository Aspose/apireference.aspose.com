---
title: "System::Net::Http::Headers::ContentDispositionHeaderValue क्लास"
linktitle: "ContentDispositionHeaderValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::ContentDispositionHeaderValue क्लास। ''Content-Disposition'' हेडर के मान का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों में तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 300
url: /hi/cpp/system.net.http.headers/contentdispositionheadervalue/
---
## ContentDispositionHeaderValue class


''Content-Disposition'' हेडर के मान का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों में तर्क के रूप में पास करने के लिए करें।

```cpp
class ContentDispositionHeaderValue : public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)() | एक नया उदाहरण बनाता है। |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)(String) | एक नया उदाहरण बनाता है। |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_CreationDate](./get_creationdate/)() | फ़ाइल निर्माण तिथि प्राप्त करता है। |
| [get_DispositionType](./get_dispositiontype/)() | RTTI जानकारी। |
| [get_FileName](./get_filename/)() | एक मान प्राप्त करता है जो संदेश पेलोड को संग्रहीत करने के लिए फ़ाइलनाम बनाने का तरीका निर्धारित करता है। यह तब उपयोग किया जाता है जब इकाई अलग की गई हो और एक अलग फ़ाइल में संग्रहीत हो। |
| [get_FileNameStar](./get_filenamestar/)() | एक मान प्राप्त करता है जो संदेश पेलोड को संग्रहीत करने के लिए फ़ाइलनाम बनाने का तरीका निर्धारित करता है। यह तब उपयोग किया जाता है जब इकाइयाँ अलग की गई हों और अलग-अलग फ़ाइलों में संग्रहीत हों। |
| [get_ModificationDate](./get_modificationdate/)() | फ़ाइल संशोधन तिथि प्राप्त करता है। |
| [get_Name](./get_name/)() | सामग्री शरीर के एक भाग के लिए नाम प्राप्त करता है। |
| [get_Parameters](./get_parameters/)() | 'Content-Disposition' हेडर का पैरामीटर संग्रह लौटाता है। |
| [get_ReadDate](./get_readdate/)() | फ़ाइल को अंतिम बार पढ़े जाने की तिथि प्राप्त करता है। |
| [get_Size](./get_size/)() | फ़ाइल का अनुमानित आकार प्राप्त करता है। |
| static [GetDispositionTypeLength](./getdispositiontypelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | प्रदान की गई स्ट्रिंग को निर्दिष्ट इंडेक्स से [ContentDispositionHeaderValue](./) क्लास की एक इंस्टेंस में परिवर्तित करता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| static [Parse](./parse/)(String) | प्रदान की गई स्ट्रिंग को [ContentDispositionHeaderValue](./) क्लास की एक इंस्टेंस में परिवर्तित करता है। |
| [set_CreationDate](./set_creationdate/)(Nullable\<DateTimeOffset\>) | फ़ाइल निर्माण तिथि सेट करता है। |
| [set_DispositionType](./set_dispositiontype/)(String) | एक डिस्पोज़िशन प्रकार सेट करता है। |
| [set_FileName](./set_filename/)(String) | एक मान सेट करता है जो संदेश पेलोड को संग्रहीत करने के लिए फ़ाइलनाम बनाने का तरीका निर्धारित करता है। यह तब उपयोग किया जाता है जब इकाई अलग की गई हो और एक अलग फ़ाइल में संग्रहीत हो। |
| [set_FileNameStar](./set_filenamestar/)(String) | एक मान सेट करता है जो संदेश पेलोड को संग्रहीत करने के लिए फ़ाइलनाम बनाने का तरीका निर्धारित करता है। यह तब उपयोग किया जाता है जब इकाइयाँ अलग की गई हों और अलग-अलग फ़ाइलों में संग्रहीत हों। |
| [set_ModificationDate](./set_modificationdate/)(Nullable\<DateTimeOffset\>) | फ़ाइल संशोधन तिथि सेट करता है। |
| [set_Name](./set_name/)(String) | सामग्री शरीर के एक भाग के लिए नाम सेट करता है। |
| [set_ReadDate](./set_readdate/)(Nullable\<DateTimeOffset\>) | फ़ाइल को अंतिम बार पढ़े जाने की तिथि सेट करता है। |
| [set_Size](./set_size/)(Nullable\<int64_t\>) | फ़ाइल का अनुमानित आकार सेट करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentDispositionHeaderValue\>\&) | प्रदान की गई स्ट्रिंग को [ContentDispositionHeaderValue](./) क्लास की एक इंस्टेंस में परिवर्तित करने का प्रयास करता है। |
## संबंधित देखें

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
