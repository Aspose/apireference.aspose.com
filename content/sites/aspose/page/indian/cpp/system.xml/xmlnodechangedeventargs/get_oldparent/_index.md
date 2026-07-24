---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldParent मेथड"
linktitle: "get_OldParent"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldParent मेथड। C++ में ऑपरेशन शुरू होने से पहले XmlNode::get_ParentNode का मान लौटाता है।"
type: docs
weight: 600
url: /hi/cpp/system.xml/xmlnodechangedeventargs/get_oldparent/
---
## XmlNodeChangedEventArgs::get_OldParent method


ऑपरेशन शुरू होने से पहले [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) का मान लौटाता है।

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_OldParent()
```


### ReturnValue

ऑपरेशन शुरू होने से पहले **ParentNode** का मान। यदि नोड का कोई पैरेंट नहीं था तो यह मेथड **nullptr** लौटाता है। एट्रिब्यूट नोड्स के लिए, यह मेथड [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/) का मान लौटाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
