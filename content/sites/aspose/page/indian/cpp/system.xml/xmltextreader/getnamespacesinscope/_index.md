---
title: "System::Xml::XmlTextReader::GetNamespacesInScope method"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlTextReader::GetNamespacesInScope method. C++ में वर्तमान में इन-स्कोप सभी नेमस्पेसेस को शामिल करने वाला संग्रह लौटाता है।"
type: docs
weight: 3400
url: /hi/cpp/system.xml/xmltextreader/getnamespacesinscope/
---
## XmlTextReader::GetNamespacesInScope method


एक संग्रह लौटाता है जिसमें वर्तमान में स्कोप में सभी नेमस्पेस शामिल होते हैं।

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlTextReader::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| scope | XmlNamespaceScope | एक [XmlNamespaceScope](../../xmlnamespacescope/) मान जो लौटाने के लिए नेमस्पेस नोड्स के प्रकार को निर्दिष्ट करता है। |

### ReturnValue

एक IDictionary ऑब्जेक्ट जो सभी वर्तमान इन-स्कोप नेमस्पेसेस को शामिल करता है। यदि रीडर किसी तत्व पर स्थित नहीं है, तो एक खाली डिक्शनरी (कोई नेमस्पेस नहीं) लौटाई जाती है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
