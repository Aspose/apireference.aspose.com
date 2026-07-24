---
title: "System::Xml::XmlAttributeCollection::idx_get method"
linktitle: "idx_get"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlAttributeCollection::idx_get method. C++ में निर्दिष्ट स्थानीय नाम और नेमस्पेस यूनिफॉर्म रिसोर्स आइडेंटिफायर (URI) वाले गुण को लौटाता है।"
type: docs
weight: 300
url: /hi/cpp/system.xml/xmlattributecollection/idx_get/
---
## XmlAttributeCollection::idx_get(const String\&, const String\&) method


निर्दिष्ट स्थानीय नाम और नेमस्पेस यूनिफॉर्म रिसोर्स आइडेंटिफायर (URI) के साथ गुण लौटाता है।

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::idx_get(const String &localName, const String &namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | const String\& | एट्रिब्यूट का स्थानीय नाम। |
| namespaceURI | const String\& | एट्रिब्यूट का नेमस्पेस URI। |

### ReturnValue

निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाला गुण। यदि यह गुण मौजूद नहीं है, तो यह विधि **nullptr** लौटाती है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlAttributeCollection::idx_get(const String\&) method


निर्दिष्ट नाम के साथ गुण लौटाता है।

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::idx_get(const String &name)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | const String\& | एट्रिब्यूट का योग्य नाम। |

### ReturnValue

निर्दिष्ट नाम वाला गुण। यदि यह गुण मौजूद नहीं है, तो यह विधि **nullptr** लौटाती है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlAttributeCollection::idx_get(int32_t) method


निर्दिष्ट अनुक्रमांक के साथ गुण लौटाता है।

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::idx_get(int32_t i)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| i | int32_t | एट्रिब्यूट का सूचकांक। |

### ReturnValue

निर्दिष्ट अनुक्रमांक पर स्थित गुण।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
