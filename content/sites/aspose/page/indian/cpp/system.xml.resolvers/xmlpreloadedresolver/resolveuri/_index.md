---
title: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri मेथड"
linktitle: "ResolveUri"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri मेथड। C++ में बेस और रिलेटिव URI से पूर्ण URI को हल करता है।"
type: docs
weight: 600
url: /hi/cpp/system.xml.resolvers/xmlpreloadedresolver/resolveuri/
---
## XmlPreloadedResolver::ResolveUri method


बेस और रिलेटिव URI से पूर्ण (एब्सोल्यूट) URI को हल करता है।

```cpp
SharedPtr<Uri> System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | रिलेटिव URI को हल करने के लिए उपयोग किया जाने वाला बेस URI। |
| relativeUri | String | हल करने के लिए URI। यह URI absolute या relative हो सकता है। यदि absolute है, तो यह मान प्रभावी रूप से **baseUri** मान को प्रतिस्थापित करता है। यदि relative है, तो यह **baseUri** के साथ मिलकर एक absolute URI बनाता है। |

### ReturnValue

यह [Uri](../../../system/uri/) पूर्ण URI को दर्शाता है या **nullptr** यदि रिलेटिव URI को हल नहीं किया जा सकता।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
