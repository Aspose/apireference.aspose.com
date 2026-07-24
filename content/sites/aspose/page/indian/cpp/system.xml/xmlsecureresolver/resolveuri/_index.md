---
title: "System::Xml::XmlSecureResolver::ResolveUri मेथड"
linktitle: "ResolveUri"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlSecureResolver::ResolveUri मेथड। आधार और सापेक्ष URI से पूर्ण URI को हल करता है, अंतर्निहित XmlResolver पर ResolveUri को कॉल करके C++ में।"
type: docs
weight: 300
url: /hi/cpp/system.xml/xmlsecureresolver/resolveuri/
---
## XmlSecureResolver::ResolveUri method


आधार और सापेक्ष URI से पूर्ण URI को हल करता है, अंतर्निहित [XmlResolver](../../xmlresolver/) पर **ResolveUri** को कॉल करके।

```cpp
SharedPtr<Uri> System::Xml::XmlSecureResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | रिलेटिव URI को हल करने के लिए उपयोग किया जाने वाला बेस URI। |
| relativeUri | String | हल करने के लिए URI। यह URI absolute या relative हो सकता है। यदि absolute है, तो यह मान प्रभावी रूप से **baseUri** मान को प्रतिस्थापित करता है। यदि relative है, तो यह **baseUri** के साथ मिलकर एक absolute URI बनाता है। |

### ReturnValue

पूर्ण URI या **nullptr** यदि सापेक्ष URI को हल नहीं किया जा सकता (अंतर्निहित [XmlResolver](../../xmlresolver/) पर **ResolveUri** को कॉल करके लौटाया जाता है)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
