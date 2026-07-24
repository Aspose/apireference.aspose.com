---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldValue मेथड"
linktitle: "get_OldValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldValue मेथड। C++ में नोड का मूल मान लौटाता है।"
type: docs
weight: 700
url: /hi/cpp/system.xml/xmlnodechangedeventargs/get_oldvalue/
---
## XmlNodeChangedEventArgs::get_OldValue method


नोड का मूल मान लौटाता है।

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_OldValue()
```


### ReturnValue

नोड का मूल मान। यह मेथड **nullptr** लौटाता है यदि नोड न तो एट्रिब्यूट है न ही टेक्स्ट नोड, या यदि नोड सम्मिलित किया जा रहा है। यदि इसे **XmlDocument::NodeChanging** इवेंट में कॉल किया जाता है, तो **get_OldValue** वह वर्तमान मान लौटाता है जो परिवर्तन सफल होने पर प्रतिस्थापित होगा। यदि इसे **XmlDocument::NodeChanged** इवेंट में कॉल किया जाता है, तो **get_OldValue** परिवर्तन से पहले नोड का मान लौटाता है।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
