---
title: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType मेथड"
linktitle: "SupportsType"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType मेथड। C++ में यह निर्धारित करता है कि क्या रिजॉल्वर केवल Stream के अलावा अन्य प्रकारों का समर्थन करता है।"
type: docs
weight: 800
url: /hi/cpp/system.xml.resolvers/xmlpreloadedresolver/supportstype/
---
## XmlPreloadedResolver::SupportsType method


निर्धारित करता है कि रिजॉल्वर केवल Stream के अलावा अन्य Types को समर्थन देता है या नहीं।

```cpp
bool System::Xml::Resolvers::XmlPreloadedResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | जाँचने के लिए पूर्ण URI। |
| प्रकार | const TypeInfo\& | वापसी के लिए Type। |

### ReturnValue

**true** if the Type is supported; otherwise, **false**.

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
