---
title: "System::Xml::XmlDocument::GetElementsByTagName method"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlDocument::GetElementsByTagName method. C++ में निर्दिष्ट XmlDocument::get_LocalName और XmlNode::get_NamespaceURI से मेल खाने वाले सभी वंशज तत्वों की सूची वाला XmlNodeList लौटाता है।"
type: docs
weight: 3200
url: /hi/cpp/system.xml/xmldocument/getelementsbytagname/
---
## XmlDocument::GetElementsByTagName(String, String) method


एक [XmlNodeList](../../xmlnodelist/) लौटाता है जिसमें सभी वंशज तत्वों की सूची होती है जो निर्दिष्ट [XmlDocument::get_LocalName](../get_localname/) और [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) से मेल खाते हैं।

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | मिलाने के लिए LocalName। विशेष मान **\"*\"** सभी टैग्स से मेल खाता है। |
| namespaceURI | String | मिलाने के लिए NamespaceURI। |

### ReturnValue

एक [XmlNodeList](../../xmlnodelist/) जिसमें सभी मेल खाने वाले नोड्स की सूची होती है। यदि कोई नोड निर्दिष्ट **localName** और **namespaceURI** से मेल नहीं खाता, तो लौटाई गई संग्रह खाली होगी।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::GetElementsByTagName(String) method


एक [XmlNodeList](../../xmlnodelist/) लौटाता है जिसमें सभी वंशज तत्वों की सूची होती है जो निर्दिष्ट नाम से मेल खाते हैं।

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String name)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | मिलाने के लिए योग्य नाम। यह मेल खाने वाले नोड के **get_Name** मान से तुलना किया जाता है। विशेष मान **\"*\"** सभी टैग्स से मेल खाता है। |

### ReturnValue

एक [XmlNodeList](../../xmlnodelist/) जिसमें सभी मेल खाने वाले नोड्स की सूची होती है। यदि कोई नोड **name** से मेल नहीं खाता, तो लौटाई गई संग्रह खाली होगी।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
