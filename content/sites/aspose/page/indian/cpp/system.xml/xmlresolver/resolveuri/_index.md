---
title: "System::Xml::XmlResolver::ResolveUri मेथड"
linktitle: "ResolveUri"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlResolver::ResolveUri मेथड। जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो C++ में बेस और रिलेटिव URI से पूर्ण URI को हल करता है।"
type: docs
weight: 200
url: /hi/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो बेस और रिलेटिव URI से पूर्ण URI को हल करता है।

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | रिलेटिव URI को हल करने के लिए उपयोग किया जाने वाला बेस URI। |
| relativeUri | String | हल करने के लिए URI। यह URI absolute या relative हो सकता है। यदि absolute है, तो यह मान प्रभावी रूप से **baseUri** मान को प्रतिस्थापित करता है। यदि relative है, तो यह **baseUri** के साथ मिलकर एक absolute URI बनाता है। |

### ReturnValue

पूर्ण URI या **nullptr** यदि रिलेटिव URI को हल नहीं किया जा सकता।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
