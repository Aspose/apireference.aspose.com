---
title: "System::Xml::XmlNode::idx_get विधि"
linktitle: "idx_get"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNode::idx_get विधि। निर्दिष्ट XmlNode::get_LocalName और XmlNode::get_NamespaceURI मानों वाले पहले चाइल्ड एलिमेंट को C++ में लौटाता है।"
type: docs
weight: 3000
url: /hi/cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String, String) method


निर्दिष्ट [XmlNode::get_LocalName](../get_localname/) और [XmlNode::get_NamespaceURI](../get_namespaceuri/) मानों वाले पहले चाइल्ड एलिमेंट को लौटाता है।

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्थानीयनाम | String | एलिमेंट का स्थानीय नाम। |
| ns | String | एलिमेंट का नेमस्पेस URI। |

### ReturnValue

मैचिंग **localname** और **ns** वाले पहले [XmlElement](../../xmlelement/) को लौटाता है। यदि कोई मिलान नहीं मिलता तो **nullptr** लौटाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::idx_get(String) method


निर्दिष्ट [XmlNode::get_Name](../get_name/) वाले पहले चाइल्ड एलिमेंट को लौटाता है।

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्राप्त करने के लिए एलिमेंट का योग्य नाम। |

### ReturnValue

निर्दिष्ट नाम से मेल खाने वाले पहले [XmlElement](../../xmlelement/) को लौटाता है। यदि कोई मिलान नहीं मिलता तो **nullptr** लौटाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
