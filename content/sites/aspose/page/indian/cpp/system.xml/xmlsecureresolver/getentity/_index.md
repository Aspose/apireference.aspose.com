---
title: "System::Xml::XmlSecureResolver::GetEntity मेथड"
linktitle: "GetEntity"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlSecureResolver::GetEntity मेथड। C++ में एक URI को उस ऑब्जेक्ट से मैप करता है जिसमें वास्तविक संसाधन होता है।"
type: docs
weight: 200
url: /hi/cpp/system.xml/xmlsecureresolver/getentity/
---
## XmlSecureResolver::GetEntity method


एक URI को उस ऑब्जेक्ट से मैप करता है जिसमें वास्तविक संसाधन होता है।

```cpp
SharedPtr<Object> System::Xml::XmlSecureResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | [XmlSecureResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/) कॉल से लौटाया गया URI। |
| भूमिका | String | वर्तमान में उपयोग नहीं किया गया है। |
| ofObjectToReturn | const TypeInfo\& | वापस करने के लिए ऑब्जेक्ट का प्रकार। वर्तमान संस्करण केवल Stream ऑब्जेक्ट्स लौटाता है। |

### ReturnValue

अधीनस्थ [XmlResolver](../../xmlresolver/) पर **GetEntity** को कॉल करके लौटाया गया स्ट्रीम। यदि Stream के अलावा कोई प्रकार निर्दिष्ट किया जाता है, तो मेथड **nullptr** लौटाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
