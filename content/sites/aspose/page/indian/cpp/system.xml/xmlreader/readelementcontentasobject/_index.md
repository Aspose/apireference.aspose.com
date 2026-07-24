---
title: "System::Xml::XmlReader::ReadElementContentAsObject विधि"
linktitle: "ReadElementContentAsObject"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::ReadElementContentAsObject विधि। वर्तमान तत्व को पढ़ता है और सामग्री को C++ में एक Object के रूप में लौटाता है।"
type: docs
weight: 6200
url: /hi/cpp/system.xml/xmlreader/readelementcontentasobject/
---
## XmlReader::ReadElementContentAsObject() method


वर्तमान तत्व को पढ़ता है और सामग्री को एक [Object](../../../system/object/) के रूप में लौटाता है।

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject()
```


### ReturnValue

सबसे उपयुक्त प्रकार का एक बॉक्स्ड ऑब्जेक्ट। [XmlReader::get_ValueType](../get_valuetype/) मान उपयुक्त प्रकार निर्धारित करता है। यदि सामग्री को सूची प्रकार के रूप में टाइप किया गया है, तो यह विधि उपयुक्त प्रकार के बॉक्स्ड ऑब्जेक्ट्स की एक सरणी लौटाती है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAsObject(String, String) method


जाँचता है कि निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वर्तमान तत्व से मेल खाते हैं, फिर वर्तमान तत्व को पढ़ता है और सामग्री को एक [Object](../../../system/object/) के रूप में लौटाता है।

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject(String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | एलिमेंट का स्थानीय नाम। |
| namespaceURI | String | एलिमेंट का नेमस्पेस URI। |

### ReturnValue

सबसे उपयुक्त प्रकार का एक बॉक्स्ड ऑब्जेक्ट। [XmlReader::get_ValueType](../get_valuetype/) मान उपयुक्त प्रकार निर्धारित करता है। यदि सामग्री को सूची प्रकार के रूप में टाइप किया गया है, तो यह विधि उपयुक्त प्रकार के बॉक्स्ड ऑब्जेक्ट्स की एक सरणी लौटाती है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
