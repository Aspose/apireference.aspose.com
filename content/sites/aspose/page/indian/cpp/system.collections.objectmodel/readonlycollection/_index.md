---
title: "System::Collections::ObjectModel::ReadOnlyCollection क्लास"
linktitle: "ReadOnlyCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::ObjectModel::ReadOnlyCollection क्लास। विशिष्ट कंटेनर को रीड‑ओनली मोड में एक्सेस करने के लिए रैप करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शन्स को आर्ग्यूमेंट के रूप में पास करें।"
type: docs
weight: 300
url: /hi/cpp/system.collections.objectmodel/readonlycollection/
---
## ReadOnlyCollection class


विशिष्ट कंटेनर को रीड‑ओनली मोड में एक्सेस करने के लिए रैप करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शन्स को आर्ग्यूमेंट के रूप में पास करें।

```cpp
template<typename T>class ReadOnlyCollection : public virtual System::Object,
                                               public System::Collections::Generic::IList<T>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तत्व प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Contains](./contains/)(const T\&) const override | जाँचता है कि कंटेनर में विशिष्ट आइटम मौजूद है या नहीं। |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | कंटेनर के तत्वों को मौजूदा एरे के तत्वों में कॉपी करता है। |
| [get_Count](./get_count/)() const override | कंटेनर के तत्वों की गिनती प्राप्त करता है। |
| [get_IsReadOnly](./get_isreadonly/)() const override | जाँचता है कि कलेक्शन रीड‑ओनली है या नहीं। |
| [GetEnumerator](./getenumerator/)() override | कलेक्शन का एनेमरेटर प्राप्त करता है। |
| [idx_get](./idx_get/)(int) const override | निर्दिष्ट स्थिति पर आइटम प्राप्त करता है। |
| [IndexOf](./indexof/)(const T\&) const override | कलेक्शन में विशिष्ट आइटम की खोज करता है। |
| [ReadOnlyCollection](./readonlycollection/)(const SharedPtr\<Generic::IList\<T\>\>\&) | विशिष्ट कलेक्शन के चारों ओर रीड‑ओनली कलेक्शन को रैप करता है। |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | कुछ नहीं करता क्योंकि रीड‑ओनली कलेक्शन केवल डेटा को रैप करता है और कुछ भी संग्रहीत नहीं करता। |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | वर्तमान कंटेनर के लिए begin const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | वर्तमान कंटेनर के लिए begin इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | वर्तमान कंटेनर के लिए end const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | वर्तमान कंटेनर के लिए end इटररेटर का कार्यान्वयन प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [BaseType](./basetype/) | इम्प्लीमेंट किया गया इंटरफ़ेस। |
| [IEnumeratorPtr](./ienumeratorptr/) | एक ही तत्वों का कंटेनर। |
| [ValueType](./valuetype/) | वैल्यू टाइप। |

## संबंधित देखें

* Class [Object](../../system/object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
