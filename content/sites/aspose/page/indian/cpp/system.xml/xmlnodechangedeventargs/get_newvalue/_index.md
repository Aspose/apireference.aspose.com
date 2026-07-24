---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewValue मेथड"
linktitle: "get_NewValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewValue मेथड। C++ में नोड का नया मान लौटाता है।"
type: docs
weight: 400
url: /hi/cpp/system.xml/xmlnodechangedeventargs/get_newvalue/
---
## XmlNodeChangedEventArgs::get_NewValue method


नोड का नया मान लौटाता है।

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_NewValue()
```


### ReturnValue

नोड का नया मान। यह मेथड **nullptr** लौटाता है यदि नोड न तो एट्रिब्यूट है न ही टेक्स्ट नोड, या यदि नोड हटाया जा रहा है। यदि इसे **XmlDocument::NodeChanging** इवेंट में कॉल किया जाता है, तो **get_NewValue** नोड का मान लौटाता है यदि परिवर्तन सफल हो। यदि इसे **XmlDocument::NodeChanged** इवेंट में कॉल किया जाता है, तो **get_NewValue** नोड का वर्तमान मान लौटाता है।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
