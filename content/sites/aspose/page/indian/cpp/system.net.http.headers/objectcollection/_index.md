---
title: "System::Net::Http::Headers::ObjectCollection क्लास"
linktitle: "ObjectCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::ObjectCollection क्लास। C++ में वस्तुओं के संग्रह को दर्शाता है।"
type: docs
weight: 1600
url: /hi/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


ऑब्जेक्ट्स के संग्रह का प्रतिनिधित्व करता है।

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | ऑब्जेक्ट प्रकार। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | RTTI जानकारी। |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | एक नया उदाहरण बनाता है। |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override |  n'th टेम्पलेट आर्ग्युमेंट को एक weak पॉइंटर सेट करें (shared के बजाय)। कंटेनरों में पॉइंटर्स को weak मोड में स्विच करने की अनुमति देता है। |

## संबंधित देखें

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
