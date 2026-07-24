---
title: "System::Xml::Schema::ValidationEventArgs क्लास"
linktitle: "ValidationEventArgs"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::ValidationEventArgs क्लास। C++ में ValidationEventHandler से संबंधित विस्तृत जानकारी लौटाता है।"
type: docs
weight: 200
url: /hi/cpp/system.xml.schema/validationeventargs/
---
## ValidationEventArgs class


विस्तृत जानकारी लौटाता है जो [ValidationEventHandler](../validationeventhandler/) से संबंधित है।

```cpp
class ValidationEventArgs : public System::EventArgs
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Exception](./get_exception/)() | वैलिडेशन इवेंट से संबंधित [XmlSchemaException](../xmlschemaexception/) लौटाता है। |
| [get_Message](./get_message/)() | वैलिडेशन इवेंट के अनुरूप टेक्स्ट विवरण लौटाता है। |
| [get_Severity](./get_severity/)() | वैलिडेशन इवेंट की गंभीरता लौटाता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | एक स्थैतिक सदस्य जो एक "खाली" [EventArgs](../../system/eventargs/) साझा पॉइंटर (नल-पॉइंटर) को दर्शाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
