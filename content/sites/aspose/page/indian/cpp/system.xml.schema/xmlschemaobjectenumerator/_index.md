---
title: "System::Xml::Schema::XmlSchemaObjectEnumerator क्लास"
linktitle: "XmlSchemaObjectEnumerator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaObjectEnumerator क्लास। C++ में XmlSchemaObjectCollection के लिए एनेमरेटर को दर्शाता है।"
type: docs
weight: 5200
url: /hi/cpp/system.xml.schema/xmlschemaobjectenumerator/
---
## XmlSchemaObjectEnumerator class


यह [XmlSchemaObjectCollection](../xmlschemaobjectcollection/) के लिए एन्यूमरेटर का प्रतिनिधित्व करता है।

```cpp
class XmlSchemaObjectEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | वर्तमान इटरेटर की क्लोन बनाता है। |
| [Dispose](./dispose/)() override | कुछ नहीं करता। |
| [get_Current](./get_current/)() const override | संग्रह में वर्तमान [XmlSchemaObject](../xmlschemaobject/) को लौटाता है। |
| [MoveNext](./movenext/)() override | संग्रह में अगले आइटम पर जाता है। |
| [Reset](./reset/)() override | एन्यूमरेटर को संग्रह की शुरुआत पर रीसेट करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
