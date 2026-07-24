---
title: "System::Collections::ObjectModel::Collection class"
linktitle: "संग्रह"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::ObjectModel::Collection class. सामान्य संग्रह के लिए बेस टाइप। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या एसेर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 100
url: /hi/cpp/system.collections.objectmodel/collection/
---
## Collection class


सामान्य संग्रह के लिए बेस टाइप। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या एसेर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
template<class T>class Collection : public System::Collections::Generic::IList<T>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तत्व प्रकार। |
## Nested classes

* Class [reverse_iterator_prototype](./reverse_iterator_prototype/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const T\&) override | कंटेनर में मान जोड़ता है। |
| [Clear](./clear/)() override | सभी तत्वों को हटाता है। |
| [Collection](./collection/)() | खाली संग्रह बनाता है। |
| [Collection](./collection/)(SharedPtr\<Generic::IList\<T\>\>) |  |
| [Contains](./contains/)(const T\&) const override | जाँचता है कि आइटम संग्रह में मौजूद है या नहीं। |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | संग्रह तत्वों को मौजूदा एरे तत्वों में कॉपी करता है। |
| [crbegin](./crbegin/)() const | संग्रह के अंतिम const-योग्य तत्व के लिए एक रिवर्स इटरेटर प्राप्त करता है (रिवर्स में पहला)। |
| [crend](./crend/)() const | संग्रह की शुरुआत से पहले एक गैर-मौजूद const-योग्य तत्व के लिए रिवर्स इटरेटर प्राप्त करता है। |
| [get_Count](./get_count/)() const override | तत्वों की संख्या प्राप्त करता है। |
| [get_Items](./get_items/)() | आंतरिक डेटा संरचना अभिगमकर्ता। |
| [get_Items](./get_items/)() const | आंतरिक डेटा संरचना अभिगमकर्ता। |
| [GetEnumerator](./getenumerator/)() override | संग्रह के माध्यम से पुनरावृत्ति करने के लिए एन्यूमरेटर प्राप्त करता है। |
| [idx_get](./idx_get/)(int) const override | निर्दिष्ट अनुक्रमांक पर मान प्राप्त करता है। |
| [idx_set](./idx_set/)(int, T) override | निर्दिष्ट अनुक्रमांक पर मान सेट करता है। |
| [IndexOf](./indexof/)(const T\&) const override | संग्रह में तत्व की खोज करता है। |
| [Insert](./insert/)(int, const T\&) override | निर्दिष्ट स्थान में आइटम डालता है। |
| [operator[]](./operator[]/)(int) | निर्दिष्ट अनुक्रमांक पर मान प्राप्त करता है। |
| [operator[]](./operator[]/)(int) const | निर्दिष्ट अनुक्रमांक पर मान प्राप्त करता है। |
| [rbegin](./rbegin/)() | कलेक्शन के अंतिम तत्व (रिवर्स में पहला) के लिए एक रिवर्स इटररेटर प्राप्त करता है। |
| [rbegin](./rbegin/)() const | कॉन्स्ट-योग्य कलेक्शन के अंतिम तत्व (रिवर्स में पहला) के लिए एक रिवर्स इटररेटर प्राप्त करता है। |
| [Remove](./remove/)(const T\&) override | विशिष्ट आइटम को हटाता है। |
| [RemoveAt](./removeat/)(int) override | निर्दिष्ट स्थिति पर आइटम हटाता है। |
| [rend](./rend/)() | कलेक्शन की शुरुआत से पहले एक गैर-मौजूद तत्व के लिए रिवर्स इटररेटर प्राप्त करता है। |
| [rend](./rend/)() const | कॉन्स्ट-योग्य कलेक्शन की शुरुआत से पहले एक गैर-मौजूद तत्व के लिए रिवर्स इटररेटर प्राप्त करता है। |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | सहेजे गए पॉइंटर्स को कमजोर बनाता है (यदि लागू हो)। |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | वर्तमान कंटेनर के लिए begin const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | वर्तमान कंटेनर के लिए begin इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | वर्तमान कंटेनर के लिए end const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | वर्तमान कंटेनर के लिए end इटररेटर का कार्यान्वयन प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [const_reverse_iterator](./const_reverse_iterator/) |  |
| [reverse_iterator](./reverse_iterator/) |  |

## संबंधित देखें

* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
