---
title: "Aspose::Page::XPS::XpsModel::XpsElement class"
linktitle: "XpsElement"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsModel::XpsElement class. C++ में सामान्य XPS तत्व विशेषताओं को समाहित करने वाला क्लास।"
type: docs
weight: 900
url: /hi/cpp/aspose.page.xps.xpsmodel/xpselement/
---
## XpsElement class


सामान्य [XPS](../../aspose.page.xps/) तत्व विशेषताओं को समाहित करने वाला क्लास।

```cpp
class XpsElement : public Aspose::Page::XPS::XpsModel::XpsObject,
                   public System::Collections::Generic::IEnumerable<System::SharedPtr<XpsContentElement>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [begin](./begin/)() | संग्रह के पहले तत्व (यदि कोई हो) की ओर इशारा करने वाला इटरेटर प्राप्त करता है। |
| [begin](./begin/)() const | संग्रह के const-योग्य इंस्टेंस के पहले तत्व (यदि कोई हो) की ओर इशारा करने वाला इटरेटर प्राप्त करता है। |
| [cbegin](./cbegin/)() const | संग्रह के पहले const-योग्य तत्व (यदि कोई हो) की ओर इशारा करने वाला इटरेटर प्राप्त करता है। |
| [cend](./cend/)() const | संग्रह के अंतिम const-योग्य तत्व (यदि कोई हो) के तुरंत बाद की ओर इशारा करने वाला इटरेटर प्राप्त करता है। |
| [cpp_set_parent_shared](./cpp_set_parent_shared/)() |  |
| [cpp_set_parent_weak](./cpp_set_parent_weak/)() |  |
| [end](./end/)() | संग्रह के अंतिम तत्व (यदि कोई हो) के ठीक बाद इटररेटर प्राप्त करता है। |
| [end](./end/)() const | संग्रह की const-योग्य इंस्टेंस के अंतिम तत्व (यदि कोई हो) के ठीक बाद इटररेटर प्राप्त करता है। |
| [get_Count](./get_count/)() | चाइल्ड तत्वों की संख्या लौटाता है। |
| [get_Parent](./get_parent/)() const |  |
| [GetEnumerator](./getenumerator/)() override | इंटरफ़ेस [System::Collections::Generic::IEnumerable<XpsContentElement>](../../system.collections.generic/ienumerable/) का कार्यान्वयन। |
| [idx_get](./idx_get/)(int32_t) | इंडेक्स *i* द्वारा तत्व के चाइल्ड तक पहुँच प्रदान करता है। |
| [set_Parent](./set_parent/)(System::SharedPtr\<XpsElement\>) |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | संग्रह की const-योग्य इंस्टेंस के पहले तत्व (यदि कोई हो) की ओर इशारा करने वाला इटररेटर प्राप्त करता है। |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | संग्रह के पहले तत्व (यदि कोई हो) की ओर इशारा करने वाला इटरेटर प्राप्त करता है। |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | संग्रह की const-योग्य इंस्टेंस के अंतिम तत्व (यदि कोई हो) के ठीक बाद इटररेटर प्राप्त करता है। |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | संग्रह के अंतिम तत्व (यदि कोई हो) के ठीक बाद इटररेटर प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [const_iterator](./const_iterator/) | कॉन्स्ट इटररेटर प्रकार। |
| [iterator](./iterator/) | इटररेटर प्रकार। |
| [iterator_holder_type](./iterator_holder_type/) | एक संग्रह प्रकार जिसका इटररेटर प्रकार वर्तमान संग्रह में इटररेटर प्रकार के रूप में उपयोग किया जाता है। |
| [virtualized_iterator](./virtualized_iterator/) | वर्चुअलाइज़्ड प्रकार। |
| [virtualized_iterator_element](./virtualized_iterator_element/) | वर्चुअलाइज़्ड तत्व प्रकार। |
## संबंधित देखें

* Class [XpsObject](../xpsobject/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
