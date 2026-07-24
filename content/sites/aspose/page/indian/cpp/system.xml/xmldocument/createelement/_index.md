---
title: "System::Xml::XmlDocument::CreateElement method"
linktitle: "CreateElement"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlDocument::CreateElement method. C++ में निर्दिष्ट नाम के साथ एक तत्व बनाता है।"
type: docs
weight: 800
url: /hi/cpp/system.xml/xmldocument/createelement/
---
## XmlDocument::CreateElement(const String\&) method


निर्दिष्ट नाम के साथ एक तत्व बनाता है।

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &name)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| name | const String\& | तत्व का योग्य नाम। यदि नाम में कोलन है तो [XmlNode::get_Prefix](../../xmlnode/get_prefix/) मान कोलन से पहले वाले भाग को दर्शाता है और [XmlDocument::get_LocalName](../get_localname/) मान कोलन के बाद वाले भाग को दर्शाता है। योग्य नाम में **xmlns** उपसर्ग शामिल नहीं हो सकता। |

### ReturnValue

नया [XmlElement](../../xmlelement/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&, const String\&) method


निर्दिष्ट [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/) और [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) के साथ एक तत्व बनाता है।

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &prefix, const String &localName, const String &namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| prefix | const String\& | नए तत्व का उपसर्ग (यदि कोई हो)। [String::Empty](../../../system/string/empty/) और **nullptr** समान हैं। |
| localName | const String\& | नए तत्व का स्थानीय नाम। |
| namespaceURI | const String\& | नए तत्व का नेमस्पेस URI (यदि कोई हो)। [String::Empty](../../../system/string/empty/) और **nullptr** समान हैं। |

### ReturnValue

नया [XmlElement](../../xmlelement/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&) method


एक [XmlElement](../../xmlelement/) को योग्य नाम और [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) के साथ बनाता है।

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &qualifiedName, const String &namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| qualifiedName | const String\& | तत्व का योग्य नाम। यदि नाम में कोलन हो तो [XmlNode::get_Prefix](../../xmlnode/get_prefix/) मान कोलन से पहले वाले भाग को दर्शाएगा और [XmlDocument::get_LocalName](../get_localname/) मान कोलन के बाद वाले भाग को दर्शाएगा। योग्य नाम में **xmlns** उपसर्ग शामिल नहीं हो सकता। |
| namespaceURI | const String\& | एलिमेंट का नेमस्पेस URI। |

### ReturnValue

नया [XmlElement](../../xmlelement/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
