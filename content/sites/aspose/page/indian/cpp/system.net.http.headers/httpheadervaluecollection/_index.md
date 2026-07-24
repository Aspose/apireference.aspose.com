---
title: "System::Net::Http::Headers::HttpHeaderValueCollection क्लास"
linktitle: "HttpHeaderValueCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::HttpHeaderValueCollection क्लास। हेडर मानों के संग्रह का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 800
url: /hi/cpp/system.net.http.headers/httpheadervaluecollection/
---
## HttpHeaderValueCollection class


हेडर मानों के संग्रह का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
template<typename T>class HttpHeaderValueCollection : public System::Collections::Generic::ICollection<T>
```


| पैरामीटर | विवरण |
| --- | --- |
| यह | संग्रह में प्रतिनिधित्व किए गए हेडर मानों का प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const T\&) override | संग्रह में तत्व जोड़ता है। |
| [Clear](./clear/)() override | संग्रह से सभी तत्व हटाता है। |
| [Contains](./contains/)(const T\&) const override | जाँचता है कि तत्व संग्रह में मौजूद है या नहीं। |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int32_t) override | सभी संग्रह तत्वों को मौजूदा एरे तत्वों में कॉपी करता है। |
| [get_Count](./get_count/)() const override | RTTI जानकारी। |
| [get_IsReadOnly](./get_isreadonly/)() | वर्तमान संग्रह यदि केवल-पढ़ने योग्य है तो संकेत करने वाला मान प्राप्त करता है। |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() | वर्तमान संग्रह में "विशेष मान" मौजूद है या नहीं, यह संकेत करने वाला मान प्राप्त करता है। |
| [GetEnumerator](./getenumerator/)() override | एन्यूमरेटर प्राप्त करता है। |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() | वर्तमान संग्रह की स्ट्रिंग प्रतिनिधित्व को "विशेष मान" के बिना लौटाता है। |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) | एक नया उदाहरण बनाता है। |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | एक नया उदाहरण बनाता है। |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T) | एक नया उदाहरण बनाता है। |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | एक नया उदाहरण बनाता है। |
| [ParseAdd](./parseadd/)(String) | हेडर स्ट्रिंग प्रतिनिधित्व को पार्स करता है और इसे वर्तमान संग्रह में जोड़ता है। |
| [Remove](./remove/)(const T\&) override | संग्रह से तत्व हटाता है। |
| [RemoveSpecialValue](./removespecialvalue/)() | "विशेष मान" को हटाता है। |
| [SetSpecialValue](./setspecialvalue/)() | "विशेष मान" सेट करता है। |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override |  n'th टेम्पलेट आर्ग्युमेंट को एक weak पॉइंटर सेट करें (shared के बजाय)। कंटेनरों में पॉइंटर्स को weak मोड में स्विच करने की अनुमति देता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| [TryParseAdd](./tryparseadd/)(String) | हेडर स्ट्रिंग प्रतिनिधित्व को पार्स करने और इसे वर्तमान संग्रह में जोड़ने का प्रयास करता है। |

## संबंधित देखें

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
