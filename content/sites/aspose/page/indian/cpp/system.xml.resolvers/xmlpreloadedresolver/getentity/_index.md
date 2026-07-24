---
title: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity मेथड"
linktitle: "GetEntity"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity मेथड। C++ में एक URI को उस वस्तु से मैप करता है जिसमें वास्तविक संसाधन होता है।"
type: docs
weight: 400
url: /hi/cpp/system.xml.resolvers/xmlpreloadedresolver/getentity/
---
## XmlPreloadedResolver::GetEntity method


एक URI को उस ऑब्जेक्ट से मैप करता है जिसमें वास्तविक संसाधन होता है।

```cpp
SharedPtr<Object> System::Xml::Resolvers::XmlPreloadedResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | कॉल [XmlResolver::ResolveUri(SharedPtr<Uri>,String)](../../../system.xml/xmlresolver/resolveuri/) से प्राप्त URI। |
| भूमिका | String | वर्तमान में उपयोग नहीं किया गया है। |
| ofObjectToReturn | const TypeInfo\& | वापसी के लिए वस्तु का प्रकार। [XmlPreloadedResolver](../) URI के लिए जो [String](../../../system/string/) के रूप में जोड़े गए हैं, Stream वस्तुओं और TextReader वस्तुओं का समर्थन करता है। यदि अनुरोधित प्रकार रिजॉल्वर द्वारा समर्थित नहीं है, तो एक अपवाद फेंका जाएगा। यह निर्धारित करने के लिए कि क्या कोई विशेष **Type** इस रिजॉल्वर द्वारा समर्थित है, XmlPreloadedResolver::SupportsType(SharedPtr<Uri>,TypeInfo) मेथड का उपयोग करें। |

### ReturnValue

वास्तविक स्रोत से संबंधित एक Stream या TextReader वस्तु।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
