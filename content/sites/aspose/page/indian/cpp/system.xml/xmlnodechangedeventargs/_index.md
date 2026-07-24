---
title: "System::Xml::XmlNodeChangedEventArgs class"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNodeChangedEventArgs क्लास। C++ में XmlDocument::NodeChanged, XmlDocument::NodeChanging, XmlDocument::NodeInserted, XmlDocument::NodeInserting, XmlDocument::NodeRemoved और XmlDocument::NodeRemoving इवेंट्स के लिए डेटा प्रदान करती है।"
type: docs
weight: 2600
url: /hi/cpp/system.xml/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs class


**XmlDocument::NodeChanged**, **XmlDocument::NodeChanging**, **XmlDocument::NodeInserted**, **XmlDocument::NodeInserting**, **XmlDocument::NodeRemoved** और **XmlDocument::NodeRemoving** इवेंट्स के लिए डेटा प्रदान करता है।

```cpp
class XmlNodeChangedEventArgs : public System::EventArgs
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Action](./get_action/)() | एक मान लौटाता है जो दर्शाता है कि कौन सा प्रकार का नोड परिवर्तन इवेंट हो रहा है। |
| [get_NewParent](./get_newparent/)() | ऑपरेशन पूर्ण होने के बाद [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) का मान लौटाता है। |
| [get_NewValue](./get_newvalue/)() | नोड का नया मान लौटाता है। |
| [get_Node](./get_node/)() | जो [XmlNode](../xmlnode/) जोड़ा, हटाया या बदला जा रहा है, उसे लौटाता है। |
| [get_OldParent](./get_oldparent/)() | ऑपरेशन शुरू होने से पहले [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) का मान लौटाता है। |
| [get_OldValue](./get_oldvalue/)() | नोड का मूल मान लौटाता है। |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/)(const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const String\&, const String\&, XmlNodeChangedAction) | [XmlNodeChangedEventArgs](./) क्लास की नई इंस्टेंस को प्रारंभ करता है। |
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
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
