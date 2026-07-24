---
title: "System::Xml::Schema::XmlSchemaAny क्लास"
linktitle: "XmlSchemaAny"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaAny क्लास। World Wide Web Consortium (W3C) के any तत्व को C++ में दर्शाता है।"
type: docs
weight: 800
url: /hi/cpp/system.xml.schema/xmlschemaany/
---
## XmlSchemaAny class


World Wide [Web](../../system.web/) Consortium (W3C) के **any** तत्व को दर्शाता है।

```cpp
class XmlSchemaAny : public System::Xml::Schema::XmlSchemaParticle
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Namespace](./get_namespace/)() | उपयोग किए जा सकने वाले तत्वों को शामिल करने वाले नेमस्पेस लौटाता है। |
| [get_ProcessContents](./get_processcontents/)() | **any** तत्व द्वारा निर्दिष्ट तत्वों के लिए XML दस्तावेज़ों की वैधता को कैसे संभालना चाहिए, इस बारे में एप्लिकेशन या XML प्रोसेसर को जानकारी लौटाता है। |
| [set_Namespace](./set_namespace/)(const String\&) | उपयोग किए जा सकने वाले तत्वों को शामिल करने वाले नेमस्पेस सेट करता है। |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | **any** तत्व द्वारा निर्दिष्ट तत्वों के लिए XML दस्तावेज़ों की वैधता को कैसे संभालना चाहिए, इस बारे में एप्लिकेशन या XML प्रोसेसर को जानकारी सेट करता है। |
| [XmlSchemaAny](./xmlschemaany/)() | [XmlSchemaAny](./) क्लास का नया उदाहरण प्रारंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
