---
title: "System::Xml::XmlDocument::CreateAttribute विधि"
linktitle: "CreateAttribute"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlDocument::CreateAttribute विधि। यह C++ में निर्दिष्ट नाम के साथ एक XmlAttribute बनाता है।"
type: docs
weight: 300
url: /hi/cpp/system.xml/xmldocument/createattribute/
---
## XmlDocument::CreateAttribute(const String\&) method


निर्दिष्ट नाम के साथ एक [XmlAttribute](../../xmlattribute/) बनाता है।

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &name)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| name | const String\& | एट्रिब्यूट का योग्य नाम। यदि नाम में कोलन हो, तो [XmlNode::get_Prefix](../../xmlnode/get_prefix/) मान पहले कोलन से पहले वाले भाग को दर्शाता है और [XmlDocument::get_LocalName](../get_localname/) मान पहले कोलन के बाद वाले भाग को दर्शाता है। [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) तब तक खाली रहता है जब तक प्रीफ़िक्स मान्यता प्राप्त बिल्ट‑इन प्रीफ़िक्स जैसे **xmlns** न हो। इस स्थिति में get_NamespaceURI का मान [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/) होगा। |

### ReturnValue

नया [XmlAttribute](../../xmlattribute/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&, const String\&) method


निर्दिष्ट [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/) और [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) के साथ एक [XmlAttribute](../../xmlattribute/) बनाता है।

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &prefix, const String &localName, const String &namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| prefix | const String\& | एट्रिब्यूट का प्रीफ़िक्स (यदि हो)। [String::Empty](../../../system/string/empty/) और **nullptr** समान हैं। |
| localName | const String\& | एट्रिब्यूट का स्थानीय नाम। |
| namespaceURI | const String\& | एट्रिब्यूट का नेमस्पेस URI (यदि हो)। [String::Empty](../../../system/string/empty/) और **nullptr** समान हैं। यदि **prefix** **xmlns** है, तो यह पैरामीटर [http://www.w3.org/2000/xmlns/;](http://www.w3.org/2000/xmlns/;) होना चाहिए, अन्यथा एक अपवाद फेंका जाएगा। |

### ReturnValue

नया [XmlAttribute](../../xmlattribute/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&) method


निर्दिष्ट योग्य नाम और [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) के साथ एक [XmlAttribute](../../xmlattribute/) बनाता है।

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &qualifiedName, const String &namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| qualifiedName | const String\& | एट्रिब्यूट का योग्य नाम। यदि नाम में कोलन हो तो [XmlNode::get_Prefix](../../xmlnode/get_prefix/) मान कोलन से पहले वाले भाग को दर्शाएगा और [XmlDocument::get_LocalName](../get_localname/) मान कोलन के बाद वाले भाग को दर्शाएगा। |
| namespaceURI | const String\& | एट्रिब्यूट का नेमस्पेस URI। यदि योग्य नाम में **xmlns** प्रीफ़िक्स शामिल है, तो यह पैरामीटर [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/) होना चाहिए। |

### ReturnValue

नया [XmlAttribute](../../xmlattribute/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
