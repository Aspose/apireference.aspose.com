---
title: "System::Xml::Schema::XmlSchemaGroupRef क्लास"
linktitle: "XmlSchemaGroupRef"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaGroupRef क्लास। वह समूह तत्व दर्शाता है जिसमें ref एट्रिब्यूट XML स्कीमा से है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट किया गया है। यह क्लास C++ में स्कीमा स्तर पर परिभाषित समूह को संदर्भित करने वाले जटिल प्रकारों के भीतर उपयोग किया जाता है।"
type: docs
weight: 3300
url: /hi/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


XML [Schema](../) से **ref** एट्रिब्यूट वाले **group** तत्व को दर्शाता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट किया गया है। यह क्लास जटिल प्रकारों के भीतर उपयोग की जाती है जो **schema** स्तर पर परिभाषित **group** को संदर्भित करती हैं।

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Particle](./get_particle/)() | एक [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), या [XmlSchemaSequence](../xmlschemasequence/) क्लास में से एक लौटाता है, जो **Particle** मान की पोस्ट-कम्पाइलेशन व्याख्या रखता है। |
| [get_RefName](./get_refname/)() | इस स्कीमा में परिभाषित समूह का नाम लौटाता है (या निर्दिष्ट नेमस्पेस द्वारा संकेतित किसी अन्य स्कीमा का)। |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | इस स्कीमा में परिभाषित समूह का नाम सेट करता है (या निर्दिष्ट नेमस्पेस द्वारा संकेतित किसी अन्य स्कीमा का)। |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | एक नया उदाहरण प्रारंभ करता है [XmlSchemaGroupRef](./) क्लास का। |
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
