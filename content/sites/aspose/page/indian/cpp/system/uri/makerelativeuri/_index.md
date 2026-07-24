---
title: "System::Uri::MakeRelativeUri method"
linktitle: "MakeRelativeUri"
second_title: "Aspose.Page C++ के लिए"
description: "System::Uri::MakeRelativeUri method. वर्तमान और निर्दिष्ट Uri ऑब्जेक्ट्स द्वारा प्रतिनिधित्व किए गए URIs के बीच अंतर निर्धारित करता है C++ में।"
type: docs
weight: 3100
url: /hi/cpp/system/uri/makerelativeuri/
---
## Uri::MakeRelativeUri method


वर्तमान और निर्दिष्ट [Uri](../) ऑब्जेक्ट्स द्वारा प्रतिनिधित्व किए गए URIs के बीच अंतर निर्धारित करता है।

```cpp
SharedPtr<Uri> System::Uri::MakeRelativeUri(const SharedPtr<Uri> &uri)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | तुलना मान |

### ReturnValue

यदि वर्तमान ऑब्जेक्ट और **toUri** द्वारा प्रतिनिधित्व किए गए URIs का होस्टनेम और स्कीम समान हैं, तो यह मेथड एक सापेक्ष [Uri](../) लौटाता है जो वर्तमान URI इंस्टेंस में जोड़ने पर **toUri** देता है। यदि होस्टनेम या स्कीम अलग है, तो यह मेथड एक [Uri](../) ऑब्जेक्ट लौटाता है जो **uri** पैरामीटर का प्रतिनिधित्व करता है।

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
