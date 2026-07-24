---
title: "System::Xml::XmlUrlResolver::GetEntity विधि"
linktitle: "GetEntity"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlUrlResolver::GetEntity method. C++ में एक URI को उस वस्तु से मैप करता है जिसमें वास्तविक संसाधन होता है।"
type: docs
weight: 200
url: /hi/cpp/system.xml/xmlurlresolver/getentity/
---
## XmlUrlResolver::GetEntity method


एक URI को उस ऑब्जेक्ट से मैप करता है जिसमें वास्तविक संसाधन होता है।

```cpp
SharedPtr<Object> System::Xml::XmlUrlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | उस URI को जो [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../../xmlresolver/resolveuri/) कॉल से लौटाया गया है। |
| भूमिका | String | वर्तमान में उपयोग नहीं किया गया है। |
| ofObjectToReturn | const TypeInfo\& | वापस करने के लिए वस्तु का प्रकार। वर्तमान कार्यान्वयन केवल Stream वस्तुओं को लौटाता है। |

### ReturnValue

एक स्ट्रीम वस्तु या **nullptr** यदि स्ट्रीम के अलावा कोई प्रकार निर्दिष्ट किया गया हो।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
