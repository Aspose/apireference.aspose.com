---
title: "System::IO::Stream::EndRead मेथड"
linktitle: "EndRead"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Stream::EndRead मेथड। C++ में निर्दिष्ट असिंक्रोनस रीड ऑपरेशन के पूरा होने तक प्रतीक्षा करता है।"
type: docs
weight: 600
url: /hi/cpp/system.io/stream/endread/
---
## Stream::EndRead method


निर्दिष्ट असिंक्रोनस रीड ऑपरेशन के पूरा होने तक प्रतीक्षा करता है।

```cpp
virtual int System::IO::Stream::EndRead(System::SharedPtr<System::IAsyncResult> asyncResult)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<System::IAsyncResult\> | एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो एक असिंक्रोनस रीड ऑपरेशन का प्रतिनिधित्व करता है |

### ReturnValue

रीड ऑपरेशन के दौरान पढ़े गए बाइट्स की संख्या जो **asyncResult** द्वारा प्रतिनिधित्व किया गया है

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
