---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewParent मेथड"
linktitle: "get_NewParent"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewParent मेथड। C++ में ऑपरेशन पूर्ण होने के बाद XmlNode::get_ParentNode का मान लौटाता है।"
type: docs
weight: 300
url: /hi/cpp/system.xml/xmlnodechangedeventargs/get_newparent/
---
## XmlNodeChangedEventArgs::get_NewParent method


ऑपरेशन पूर्ण होने के बाद [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) का मान लौटाता है।

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_NewParent()
```


### ReturnValue

**ParentNode** का मान ऑपरेशन पूर्ण होने के बाद। यह मेथड **nullptr** लौटाता है यदि नोड हटाया जा रहा है। एट्रिब्यूट नोड्स के लिए, यह मेथड [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/) का मान लौटाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
