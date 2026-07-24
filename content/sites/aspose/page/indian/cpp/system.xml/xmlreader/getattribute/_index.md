---
title: "System::Xml::XmlReader::GetAttribute मेथड"
linktitle: "GetAttribute"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::GetAttribute मेथड। जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह निर्दिष्ट इंडेक्स वाले एट्रिब्यूट का मान प्राप्त करता है C++ में।"
type: docs
weight: 2800
url: /hi/cpp/system.xml/xmlreader/getattribute/
---
## XmlReader::GetAttribute(int32_t) method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट अनुक्रमांक वाले गुण का मान प्राप्त करता है।

```cpp
virtual String System::Xml::XmlReader::GetAttribute(int32_t i)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| i | int32_t | एट्रिब्यूट का इंडेक्स। इंडेक्स शून्य-आधारित है। (पहला एट्रिब्यूट का इंडेक्स 0 है।) |

### ReturnValue

निर्दिष्ट एट्रिब्यूट का मान। यह मेथड रीडर को नहीं ले जाता।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String) method


जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह निर्दिष्ट [XmlReader::get_Name](../get_name/) मान वाले एट्रिब्यूट का मान प्राप्त करता है।

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | एट्रिब्यूट का योग्य नाम। |

### ReturnValue

निर्दिष्ट एट्रिब्यूट का मान। यदि एट्रिब्यूट नहीं मिला या मान [String::Empty](../../../system/string/empty/) है, तो **nullptr** लौटाया जाता है।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String, String) method


जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह निर्दिष्ट [XmlReader::get_LocalName](../get_localname/) और [XmlReader::get_NamespaceURI](../get_namespaceuri/) मानों वाले एट्रिब्यूट का मान प्राप्त करता है।

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name, String namespaceURI)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | एट्रिब्यूट का स्थानीय नाम। |
| namespaceURI | String | एट्रिब्यूट का नेमस्पेस URI। |

### ReturnValue

निर्दिष्ट एट्रिब्यूट का मान। यदि एट्रिब्यूट नहीं मिला या मान [String::Empty](../../../system/string/empty/) है, तो **nullptr** लौटाया जाता है। यह मेथड रीडर को नहीं ले जाता।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
