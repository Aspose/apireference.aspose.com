---
title: "System::Xml::XmlResolver::GetEntity method"
linktitle: "GetEntity"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlResolver::GetEntity method. जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो यह URI को एक ऑब्जेक्ट से मैप करता है जिसमें वास्तविक संसाधन C++ में मौजूद होता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो एक URI को उस वस्तु से मैप करता है जिसमें वास्तविक संसाधन होता है।

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/) कॉल से लौटाया गया URI। |
| भूमिका | String | वर्तमान में उपयोग नहीं किया गया है। |
| ofObjectToReturn | const TypeInfo\& | वापस करने के लिए ऑब्जेक्ट का प्रकार। वर्तमान संस्करण केवल Stream ऑब्जेक्ट्स लौटाता है। |

### ReturnValue

एक स्ट्रीम वस्तु या **nullptr** यदि स्ट्रीम के अलावा कोई प्रकार निर्दिष्ट किया गया हो।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
