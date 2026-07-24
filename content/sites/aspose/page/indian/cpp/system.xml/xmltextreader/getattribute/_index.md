---
title: "System::Xml::XmlTextReader::GetAttribute विधि"
linktitle: "GetAttribute"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlTextReader::GetAttribute विधि। C++ में निर्दिष्ट अनुक्रमांक वाले एट्रिब्यूट का मान लौटाता है।"
type: docs
weight: 3300
url: /hi/cpp/system.xml/xmltextreader/getattribute/
---
## XmlTextReader::GetAttribute(int32_t) method


वापस देता है निर्दिष्ट अनुक्रमांक वाले गुण का मान।

```cpp
String System::Xml::XmlTextReader::GetAttribute(int32_t i) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| i | int32_t | एट्रिब्यूट का इंडेक्स। इंडेक्स शून्य-आधारित है। (पहला एट्रिब्यूट का इंडेक्स 0 है।) |

### ReturnValue

निर्दिष्ट एट्रिब्यूट का मान।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::GetAttribute(String, String) method


वापस देता है निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले गुण का मान।

```cpp
String System::Xml::XmlTextReader::GetAttribute(String localName, String namespaceURI) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | एट्रिब्यूट का स्थानीय नाम। |
| namespaceURI | String | एट्रिब्यूट का नेमस्पेस URI। |

### ReturnValue

निर्दिष्ट एट्रिब्यूट का मान। यदि एट्रिब्यूट नहीं मिला, तो **nullptr** लौटाया जाता है। यह विधि रीडर को नहीं ले जाती।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::GetAttribute(String) method


वापस देता है निर्दिष्ट नाम वाले गुण का मान।

```cpp
String System::Xml::XmlTextReader::GetAttribute(String name) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | एट्रिब्यूट का योग्य नाम। |

### ReturnValue

निर्दिष्ट एट्रिब्यूट का मान। यदि एट्रिब्यूट नहीं मिला, तो **nullptr** लौटाया जाता है।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
