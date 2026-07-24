---
title: "System::Collections::ObjectModel::KeyedCollection क्लास"
linktitle: "KeyedCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::ObjectModel::KeyedCollection class. एम्बेडेड कुंजियों के साथ तत्वों का सारांश संग्रह। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या एसेर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 200
url: /hi/cpp/system.collections.objectmodel/keyedcollection/
---
## KeyedCollection class


एम्बेडेड कुंजियों के साथ तत्वों का सारांश संग्रह। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या एसेर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
template<typename TKey,typename TItem>class KeyedCollection : public System::Collections::ObjectModel::Collection<TItem>
```


| पैरामीटर | विवरण |
| --- | --- |
| TKey | कुंजी प्रकार। |
| TItem | मान प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const TItem\&) override | कंटेनर के अंत में आइटम जोड़ें। |
| [Contains](./contains/)(TKey) | जाँचता है कि कुंजी कंटेनर में मौजूद है या नहीं। |
| [get_Comparer](./get_comparer/)() | कम्पेयर प्राप्त करता है। |
| [idx_get](./idx_get/)(TKey) | निर्दिष्ट अनुक्रमांक पर आइटम प्राप्त करता है। |
| [Remove](./remove/)(TKey) | कुंजी को कंटेनर से हटाता है। |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | विशिष्ट टेम्प्लेट आर्ग्यूमेंट को साझा पॉइंटर के बजाय कमजोर पॉइंटर के रूप में माना जाता है (यदि लागू हो)। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [defaultThreshold](./defaultthreshold/) | लुकअप शब्दकोश निर्माण थ्रेशहोल्ड, डिफ़ॉल्ट। |

## संबंधित देखें

* Class [Collection](../collection/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
