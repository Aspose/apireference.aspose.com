---
title: "System::Xml::XmlElement::GetElementsByTagName method"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlElement::GetElementsByTagName मेथड। C++ में निर्दिष्ट XmlElement::get_LocalName और XmlElement::get_NamespaceURI मानों से मेल खाने वाले सभी वंशज तत्वों की सूची वाला XmlNodeList लौटाता है।"
type: docs
weight: 1500
url: /hi/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


एक [XmlNodeList](../../xmlnodelist/) लौटाता है जिसमें सभी वंशज तत्वों की सूची होती है जो निर्दिष्ट [XmlElement::get_LocalName](../get_localname/) और [XmlElement::get_NamespaceURI](../get_namespaceuri/) मानों से मेल खाते हैं।

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | मैच करने के लिए स्थानीय नाम। एस्टेरिस्क (*) एक विशेष मान है जो सभी टैग्स से मेल खाता है। |
| namespaceURI | String | मैच करने के लिए नेमस्पेस URI। |

### ReturnValue

एक [XmlNodeList](../../xmlnodelist/) जिसमें सभी मिलते हुए नोड्स की सूची होती है। यदि कोई मिलते हुए नोड नहीं है तो सूची खाली होती है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


एक [XmlNodeList](../../xmlnodelist/) लौटाता है जिसमें सभी वंशज तत्वों की सूची होती है जो निर्दिष्ट [XmlElement::get_Name](../get_name/) से मेल खाते हैं।

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | मैच करने के लिए नाम टैग। यह एक योग्य नाम है। यह मिलते हुए नोड के **get_Name** मान के विरुद्ध मिलान किया जाता है। एस्टरिस्क (*) एक विशेष मान है जो सभी टैग्स से मेल खाता है। |

### ReturnValue

एक [XmlNodeList](../../xmlnodelist/) जिसमें सभी मिलते हुए नोड्स की सूची होती है। यदि कोई मिलते हुए नोड नहीं है तो सूची खाली होती है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
