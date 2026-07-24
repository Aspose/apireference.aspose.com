---
title: "System::Xml::Schema::XmlSchemaCollectionEnumerator क्लास"
linktitle: "XmlSchemaCollectionEnumerator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaCollectionEnumerator क्लास। एक संग्रह पर सरल पुनरावृत्ति का समर्थन करता है। इस क्लास को C++ में विरासत में नहीं लिया जा सकता।"
type: docs
weight: 1600
url: /hi/cpp/system.xml.schema/xmlschemacollectionenumerator/
---
## XmlSchemaCollectionEnumerator class


एक संग्रह पर सरल पुनरावृत्ति का समर्थन करता है। यह वर्ग विरासत में नहीं लिया जा सकता।

```cpp
class XmlSchemaCollectionEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | वर्तमान इटरेटर की क्लोन बनाता है। |
| [Dispose](./dispose/)() override | कुछ नहीं करता। |
| [get_Current](./get_current/)() const override | संग्रह में वर्तमान [XmlSchema](../xmlschema/) को लौटाता है। |
| [MoveNext](./movenext/)() override | एन्यूमरेटर को संग्रह में अगले स्कीमा तक आगे बढ़ाता है। |
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
