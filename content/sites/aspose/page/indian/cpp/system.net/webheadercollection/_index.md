---
title: "System::Net::WebHeaderCollection क्लास"
linktitle: "WebHeaderCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::WebHeaderCollection क्लास। प्रोटोकॉल हेडर के संग्रह का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 3600
url: /hi/cpp/system.net/webheadercollection/
---
## WebHeaderCollection class


प्रोटोकॉल हेडर के संग्रह का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।

```cpp
class WebHeaderCollection : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(String, String) | निर्दिष्ट हेडर नाम और हेडर मान की जोड़ी को संग्रह में जोड़ता है। |
| [Add](./add/)(HttpResponseHeader, String) | निर्दिष्ट हेडर और हेडर मान की जोड़ी को संग्रह में जोड़ता है। |
| [Add](./add/)(HttpRequestHeader, String) | निर्दिष्ट हेडर और हेडर मान की जोड़ी को संग्रह में जोड़ता है। |
| [AllKeys](./allkeys/)() | संग्रह में संग्रहीत हेडर नामों का संग्रह लौटाता है। |
| [get_Count](./get_count/)() const | संग्रह में तत्वों की संख्या लौटाता है। |
| [get_Keys](./get_keys/)() | संग्रह में संग्रहीत हेडर नामों का संग्रह लौटाता है। |
| [GetKey](./getkey/)(int) | निर्दिष्ट सूचकांक पर कुंजी लौटाता है। |
| [GetValues](./getvalues/)(String) | हेडर मानों का संग्रह लौटाता है। |
| [idx_get](./idx_get/)(HttpRequestHeader) | निर्दिष्ट अनुरोध के हेडर का उपयोग करके हेडर मान प्राप्त करता है। |
| [idx_get](./idx_get/)(HttpResponseHeader) | निर्दिष्ट प्रतिक्रिया के हेडर का उपयोग करके हेडर मान प्राप्त करता है। |
| [idx_get](./idx_get/)(String) | निर्दिष्ट हेडर नाम का उपयोग करके हेडर मान प्राप्त करता है। |
| [idx_set](./idx_set/)(HttpRequestHeader, String) | निर्दिष्ट हेडर का हेडर मान सेट करता है। |
| [idx_set](./idx_set/)(HttpResponseHeader, String) | निर्दिष्ट प्रतिक्रिया के हेडर का उपयोग करके हेडर मान सेट करता है। |
| [idx_set](./idx_set/)(String, String) | निर्दिष्ट हेडर नाम का उपयोग करके हेडर मान सेट करता है। |
| static [IsRestricted](./isrestricted/)(const String\&) | परीक्षण करता है कि क्या निर्दिष्ट HTTP हेडर को अनुरोध के लिए सेट किया जा सकता है। |
| [Remove](./remove/)(String) | निर्दिष्ट हेडर नाम द्वारा हेडर को हटाता है। |
| [Remove](./remove/)(HttpResponseHeader) | निर्दिष्ट प्रतिक्रिया के हेडर को हटाता है। |
| [Remove](./remove/)(HttpRequestHeader) | निर्दिष्ट अनुरोध के हेडर को हटाता है। |
| [Set](./set/)(String, String) | निर्दिष्ट हेडर का मान सेट करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| [WebHeaderCollection](./webheadercollection/)() | एक नया उदाहरण बनाता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
