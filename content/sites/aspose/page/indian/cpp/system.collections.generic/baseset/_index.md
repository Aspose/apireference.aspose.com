---
title: "System::Collections::Generic::BaseSet क्लास"
linktitle: "BaseSet"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::Collections::Generic::BaseSet क्लास का उपयोग कैसे करें।"
type: docs
weight: 800
url: /hi/cpp/system.collections.generic/baseset/
---
## BaseSet class




```cpp
template<typename T,typename SET_T>class BaseSet : public virtual System::Object,
                                                   public System::Collections::Generic::ICollection<T>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | C++ विशिष्ट। |
| [Add](./add/)(const T\&) override | सेट में तत्व जोड़ता है। |
| [begin](./begin/)() const | स्थिर-योग्य संग्रह के पहले तत्व के लिए इटररेटर प्राप्त करता है। |
| [cbegin](./cbegin/)() const | संग्रह के पहले const-योग्य तत्व के लिए इटररेटर प्राप्त करता है। |
| [cend](./cend/)() const | संग्रह के अंत के पीछे मौजूद न होने वाले const-योग्य तत्व के लिए इटररेटर प्राप्त करता है। |
| [Clear](./clear/)() override | सेट में सभी तत्वों को हटाता है। |
| [Contains](./contains/)(const T\&) const override | जाँचता है कि तत्व सेट में मौजूद है या नहीं। |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | हैश की सामग्री को मौजूदा एरे तत्वों में कॉपी करता है। |
| [data](./data/)() | अधोस्तरीय डेटा संरचना एक्सेसर। |
| [data](./data/)() const | अधोस्तरीय डेटा संरचना एक्सेसर। |
| [end](./end/)() const | const-योग्य संग्रह के अंत के पीछे मौजूद न होने वाले तत्व के लिए इटररेटर प्राप्त करता है। |
| [get_Count](./get_count/)() const override | सेट में तत्वों की संख्या प्राप्त करता है। |
| [GetEnumerator](./getenumerator/)() override | एक enumerator बनाता है। |
| [Remove](./remove/)(const T\&) override | सेट से तत्व को हटाता है। |
| [TryAdd](./tryadd/)(const T\&) | सेट में तत्व जोड़ता है। |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | वर्तमान कंटेनर के लिए begin const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | वर्तमान कंटेनर के लिए begin इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | वर्तमान कंटेनर के लिए end const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | वर्तमान कंटेनर के लिए end इटररेटर का कार्यान्वयन प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [BaseType](./basetype/) | इम्प्लीमेंट किया गया इंटरफ़ेस। |
| [const_iterator](./const_iterator/) | कॉन्स्ट इटररेटर प्रकार। |
| [IEnumerablePtr](./ienumerableptr/) | Enumerable इंटरफ़ेस पॉइंटर। |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) पॉइंटर। |
| [iterator](./iterator/) | इटररेटर प्रकार। |
| [set_t](./set_t/) | अधोस्थ डेटा प्रकार। |
| [ThisPtr](./thisptr/) | पॉइंटर प्रकार। |
| [ThisType](./thistype/) | स्व प्रकार। |
| [ValueType](./valuetype/) | वैल्यू टाइप। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
