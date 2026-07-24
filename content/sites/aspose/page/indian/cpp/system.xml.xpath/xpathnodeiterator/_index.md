---
title: "System::Xml::XPath::XPathNodeIterator क्लास"
linktitle: "XPathNodeIterator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNodeIterator क्लास। C++ में चयनित नोड सेट पर एक इटररेटर प्रदान करता है।"
type: docs
weight: 600
url: /hi/cpp/system.xml.xpath/xpathnodeiterator/
---
## XPathNodeIterator class


चयनित नोड्स के सेट पर एक इटररेटर प्रदान करता है।

```cpp
class XPathNodeIterator : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XPath::XPathNavigator>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Clone](./clone/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो यह इस [XPathNodeIterator](./) ऑब्जेक्ट की एक क्लोन लौटाता है। |
| virtual [get_Count](./get_count/)() | चयनित नोड सेट में अंतिम नोड का इंडेक्स लौटाता है। |
| virtual [get_Current](./get_current/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो यह इस [XPathNodeIterator](./) के लिए [XPathNavigator](../xpathnavigator/) ऑब्जेक्ट प्राप्त करता है, जो वर्तमान संदर्भ नोड पर स्थित होता है। |
| virtual [get_CurrentPosition](./get_currentposition/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो यह चयनित नोड सेट में वर्तमान स्थिति का इंडेक्स प्राप्त करता है। |
| [GetEnumerator](./getenumerator/)() override | चयनित नोड सेट के माध्यम से इटररेट करने के लिए एक IEnumerator ऑब्जेक्ट लौटाता है। |
| virtual [MoveNext](./movenext/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो यह [XPathNodeIterator::get_Current](./get_current/) मेथड द्वारा लौटाए गए [XPathNavigator](../xpathnavigator/) ऑब्जेक्ट को चयनित नोड सेट में अगले नोड पर ले जाता है। |
| [XPathNodeIterator](./xpathnodeiterator/)() | [XPathNodeIterator](./) क्लास का एक नया इंस्टेंस इनिशियलाइज़ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## संबंधित देखें

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
