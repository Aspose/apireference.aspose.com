---
title: "System::Xml::Schema::XmlSchemaAnnotation क्लास"
linktitle: "XmlSchemaAnnotation"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaAnnotation क्लास। C++ में World Wide Web Consortium (W3C) **annotation** तत्व का प्रतिनिधित्व करता है।"
type: docs
weight: 700
url: /hi/cpp/system.xml.schema/xmlschemaannotation/
---
## XmlSchemaAnnotation class


World Wide [Web](../../system.web/) Consortium (W3C) **annotation** तत्व का प्रतिनिधित्व करता है।

```cpp
class XmlSchemaAnnotation : public System::Xml::Schema::XmlSchemaObject
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Id](./get_id/)() | स्ट्रिंग आईडी को लौटाता है। |
| [get_Items](./get_items/)() | **Items** संग्रह लौटाता है जो **appinfo** और **documentation** चाइल्ड तत्वों को संग्रहीत करने के लिए उपयोग किया जाता है। |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | स्कीमा के लक्ष्य नेमस्पेस से संबंधित नहीं होने वाले योग्य एट्रिब्यूट्स लौटाता है। |
| [set_Id](./set_id/)(const String\&) | स्ट्रिंग आईडी सेट करता है। |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | स्कीमा के लक्ष्य नेमस्पेस से संबंधित नहीं होने वाले योग्य एट्रिब्यूट्स सेट करता है। |
| [XmlSchemaAnnotation](./xmlschemaannotation/)() | एक नया उदाहरण प्रारंभ करता है [XmlSchemaAnnotation](./) क्लास का। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
