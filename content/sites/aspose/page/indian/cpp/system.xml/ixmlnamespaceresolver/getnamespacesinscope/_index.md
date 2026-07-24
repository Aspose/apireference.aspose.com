---
title: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope मेथड"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope मेथड। वर्तमान में C++ में स्कोप में मौजूद परिभाषित प्रिफिक्स-नेमस्पेस मैपिंग्स का संग्रह लौटाता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml/ixmlnamespaceresolver/getnamespacesinscope/
---
## IXmlNamespaceResolver::GetNamespacesInScope method


वर्तमान में स्कोप में परिभाषित प्रीफ़िक्स-नेमस्पेस मैपिंग्स का संग्रह लौटाता है।

```cpp
virtual SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::IXmlNamespaceResolver::GetNamespacesInScope(XmlNamespaceScope scope)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| scope | XmlNamespaceScope | एक [XmlNamespaceScope](../../xmlnamespacescope/) मान जो लौटाने के लिए नेमस्पेस नोड्स के प्रकार को निर्दिष्ट करता है। |

### ReturnValue

एक IDictionary संग्रह जो वर्तमान इन-स्कोप नेमस्पेसेस को शामिल करता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [IXmlNamespaceResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
