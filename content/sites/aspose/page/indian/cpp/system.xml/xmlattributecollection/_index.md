---
title: "System::Xml::XmlAttributeCollection class"
linktitle: "XmlAttributeCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlAttributeCollection class. यह C++ में नाम या अनुक्रमांक द्वारा पहुँचा जा सकने वाले गुणों का संग्रह दर्शाता है।"
type: docs
weight: 700
url: /hi/cpp/system.xml/xmlattributecollection/
---
## XmlAttributeCollection class


नाम या इंडेक्स द्वारा एक्सेस किए जा सकने वाले एट्रिब्यूट्स के संग्रह को दर्शाता है।

```cpp
class XmlAttributeCollection : public System::Xml::XmlNamedNodeMap
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Append](./append/)(const SharedPtr\<XmlAttribute\>\&) | निर्दिष्ट गुण को संग्रह में अंतिम नोड के रूप में सम्मिलित करता है। |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&, int32_t) | इस संग्रह से सभी [XmlAttribute](../xmlattribute/) वस्तुओं को दिए गए एरे में कॉपी करता है। |
| [idx_get](./idx_get/)(int32_t) | निर्दिष्ट अनुक्रमांक के साथ गुण लौटाता है। |
| [idx_get](./idx_get/)(const String\&) | निर्दिष्ट नाम के साथ गुण लौटाता है। |
| [idx_get](./idx_get/)(const String\&, const String\&) | निर्दिष्ट स्थानीय नाम और नेमस्पेस यूनिफॉर्म रिसोर्स आइडेंटिफायर (URI) के साथ गुण लौटाता है। |
| [InsertAfter](./insertafter/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | निर्दिष्ट संदर्भ गुण के तुरंत बाद निर्दिष्ट गुण सम्मिलित करता है। |
| [InsertBefore](./insertbefore/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | निर्दिष्ट संदर्भ गुण से तुरंत पहले निर्दिष्ट गुण सम्मिलित करता है। |
| [Prepend](./prepend/)(const SharedPtr\<XmlAttribute\>\&) | निर्दिष्ट गुण को संग्रह में पहला नोड के रूप में सम्मिलित करता है। |
| [Remove](./remove/)(const SharedPtr\<XmlAttribute\>\&) | निर्दिष्ट गुण को संग्रह से हटाता है। |
| [RemoveAll](./removeall/)() | सभी गुणों को संग्रह से हटाता है। |
| [RemoveAt](./removeat/)(int32_t) | निर्दिष्ट अनुक्रमांक से संबंधित गुण को संग्रह से हटाता है। |
| [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) override | उसके [XmlNode::get_Name](../xmlnode/get_name/) परिणाम का उपयोग करके एक [XmlNode](../xmlnode/) जोड़ता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlNamedNodeMap](../xmlnamednodemap/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
