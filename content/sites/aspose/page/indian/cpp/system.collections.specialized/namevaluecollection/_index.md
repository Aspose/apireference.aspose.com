---
title: "System::Collections::Specialized::NameValueCollection क्लास"
linktitle: "NameValueCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Specialized::NameValueCollection क्लास। C++ में कुंजी या इंडेक्स से एक्सेस की जा सकने वाली संबंधित String कुंजियों और String मानों का संग्रह।"
type: docs
weight: 200
url: /hi/cpp/system.collections.specialized/namevaluecollection/
---
## NameValueCollection class


कुंजी या इंडेक्स से एक्सेस की जा सकने वाली संबंधित [String](../../system/string/) कुंजियों और [String](../../system/string/) मानों का संग्रह।

```cpp
class NameValueCollection : public System::Collections::Generic::ICollection<System::String>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const String\&) override | [ICollection](../../system.collections/icollection/) मेथड को ओवरराइड करें - लागू नहीं किया गया। |
| [Add](./add/)(const System::SharedPtr\<NameValueCollection\>\&) | निर्दिष्ट [NameValueCollection](./) में प्रविष्टियों को वर्तमान में कॉपी करता है। |
| virtual [Add](./add/)(const String\&, const String\&) | निर्दिष्ट नाम और मान के साथ एक प्रविष्टि जोड़ता है। |
| [Clear](./clear/)() override | सभी तत्वों को हटाता है। |
| [Contains](./contains/)(const String\&) const override | जाँचता है कि आइटम संग्रह में मौजूद है या नहीं। |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override | संग्रह तत्वों को मौजूदा एरे तत्वों में कॉपी करता है। |
| virtual [Get](./get/)(const String\&) | निर्दिष्ट कुंजी से जुड़े मान प्राप्त करता है। |
| virtual [get_AllKeys](./get_allkeys/)() | सभी कुंजियों को प्राप्त करता है। |
| [get_Count](./get_count/)() const override | कुंजी/मान जोड़ों की संख्या प्राप्त करता है। |
| virtual [get_Keys](./get_keys/)() | सभी कुंजियों को प्राप्त करता है। |
| [GetEnumerator](./getenumerator/)() override | संग्रह के माध्यम से पुनरावृत्ति करने के लिए एन्यूमरेटर प्राप्त करता है। |
| virtual [GetValues](./getvalues/)(const String\&) | निर्दिष्ट कुंजी से जुड़े मान प्राप्त करता है। |
| [HasKeys](./haskeys/)() | एक मान प्राप्त करता है जो दर्शाता है कि क्या [NameValueCollection](./) में नॉन-नल कुंजियाँ हैं। |
| [idx_get](./idx_get/)(const String\&) | निर्दिष्ट अनुक्रमांक पर मान प्राप्त करता है। |
| [idx_set](./idx_set/)(const String\&, const String\&) | एक प्रविष्टि का मान सेट करता है। |
| [NameValueCollection](./namevaluecollection/)() | एक खाली [NameValueCollection](./) वर्ग की नई इंस्टेंस को प्रारंभ करता है। |
| [NameValueCollection](./namevaluecollection/)(const System::SharedPtr\<NameValueCollection\>\&) | निर्दिष्ट [NameValueCollection](./) से प्रविष्टियों को नई [NameValueCollection](./) में कॉपी करता है। |
| [Remove](./remove/)(const String\&) override | विशिष्ट आइटम को हटाता है। |
| virtual [Set](./set/)(const String\&, const String\&) | एक प्रविष्टि का मान सेट करता है। |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | वर्तमान कंटेनर के लिए begin const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | वर्तमान कंटेनर के लिए begin इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | वर्तमान कंटेनर के लिए end const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | वर्तमान कंटेनर के लिए end इटररेटर का कार्यान्वयन प्राप्त करता है। |
## संबंधित देखें

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
