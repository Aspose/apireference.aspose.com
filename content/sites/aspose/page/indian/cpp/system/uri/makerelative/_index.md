---
title: "System::Uri::MakeRelative मेथड"
linktitle: "MakeRelative"
second_title: "Aspose.Page C++ के लिए"
description: "System::Uri::MakeRelative मेथड। दो Uri इंस्टेंस के बीच अंतर निर्धारित करता है C++ में।"
type: docs
weight: 3000
url: /hi/cpp/system/uri/makerelative/
---
## Uri::MakeRelative method


दो [Uri](../) इंस्टेंस के बीच अंतर निर्धारित करता है।

```cpp
String System::Uri::MakeRelative(const SharedPtr<Uri> &toUri)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| toUri | const SharedPtr\<Uri\>\& | वर्तमान URI से तुलना करने के लिए URI |

### ReturnValue

यदि वर्तमान ऑब्जेक्ट और **toUri** द्वारा प्रतिनिधित्व किए गए URIs का होस्टनेम और स्कीम समान हैं, तो यह मेथड एक [String](../../string/) लौटाता है जो एक रिलेटिव [Uri](../) का प्रतिनिधित्व करता है, जिसे वर्तमान URI इंस्टेंस में जोड़ने पर **toUri** प्राप्त होता है। यदि होस्टनेम या स्कीम अलग है, तो यह मेथड एक [String](../../string/) लौटाता है जो **uri** पैरामीटर का प्रतिनिधित्व करता है।

## संबंधित देखें

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
