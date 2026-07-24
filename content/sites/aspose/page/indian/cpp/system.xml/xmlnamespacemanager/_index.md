---
title: "System::Xml::XmlNamespaceManager क्लास"
linktitle: "XmlNamespaceManager"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNamespaceManager क्लास। एक संग्रह में नेमस्पेस को हल करता है, जोड़ता है और हटाता है और C++ में इन नेमस्पेस के लिए स्कोप प्रबंधन प्रदान करता है।"
type: docs
weight: 2300
url: /hi/cpp/system.xml/xmlnamespacemanager/
---
## XmlNamespaceManager class


एक संग्रह में नेमस्पेस को रिजॉल्व, जोड़ और हटाता है और इन नेमस्पेस के लिए स्कोप मैनेजमेंट प्रदान करता है।

```cpp
class XmlNamespaceManager : public System::Xml::IXmlNamespaceResolver,
                            public System::Collections::Generic::IEnumerable<String>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [AddNamespace](./addnamespace/)(String, String) | दिए गए नेमस्पेस को संग्रह में जोड़ता है। |
| virtual [get_DefaultNamespace](./get_defaultnamespace/)() | डिफ़ॉल्ट नेमस्पेस के लिए नेमस्पेस URI लौटाता है। |
| virtual [get_NameTable](./get_nametable/)() | इस ऑब्जेक्ट से जुड़ा [XmlNameTable](../xmlnametable/) लौटाता है। |
| [GetEnumerator](./getenumerator/)() override | नेमस्पेस को [XmlNamespaceManager](./) में इटररेट करने के लिए उपयोगी एक एनेमरेटर लौटाता है। |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | एक संग्रह लौटाता है जिसमें प्रीफ़िक्स द्वारा कुंजीबद्ध नेमस्पेस नाम होते हैं, जिन्हें वर्तमान में स्कोप में मौजूद नेमस्पेस को एनेमरेट करने के लिए उपयोग किया जा सकता है। |
| virtual [HasNamespace](./hasnamespace/)(String) | एक मान लौटाता है जो दर्शाता है कि प्रदान किया गया प्रीफ़िक्स वर्तमान पुश किए गए स्कोप के लिए परिभाषित नेमस्पेस रखता है या नहीं। |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | निर्दिष्ट प्रीफ़िक्स के लिए नेमस्पेस URI लौटाता है। |
| [LookupPrefix](./lookupprefix/)(const String\&) override | दिए गए नेमस्पेस URI के लिए घोषित प्रीफ़िक्स खोजता है। |
| virtual [PopScope](./popscope/)() | स्टैक से एक नेमस्पेस स्कोप को पॉप करता है। |
| virtual [PushScope](./pushscope/)() | स्टैक पर एक नेमस्पेस स्कोप को पुश करता है। |
| virtual [RemoveNamespace](./removenamespace/)(String, String) | दिए गए प्रीफ़िक्स के लिए दिया गया नेमस्पेस हटाता है। |
| [XmlNamespaceManager](./xmlnamespacemanager/)(const SharedPtr\<XmlNameTable\>\&) | निर्दिष्ट [XmlNameTable](../xmlnametable/) के साथ [XmlNamespaceManager](./) क्लास का एक नया उदाहरण प्रारंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
