---
title: "System::Net::Security::SslStream::EndRead मेथड"
linktitle: "EndRead"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Security::SslStream::EndRead मेथड। निर्दिष्ट असिंक्रोनस रीड ऑपरेशन के पूर्ण होने तक प्रतीक्षा करता है C++ में।"
type: docs
weight: 700
url: /hi/cpp/system.net.security/sslstream/endread/
---
## SslStream::EndRead method


निर्दिष्ट असिंक्रोनस रीड ऑपरेशन के पूरा होने तक प्रतीक्षा करता है।

```cpp
int32_t System::Net::Security::SslStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो एक असिंक्रोनस रीड ऑपरेशन का प्रतिनिधित्व करता है |

### ReturnValue

रीड ऑपरेशन के दौरान पढ़े गए बाइट्स की संख्या जो **asyncResult** द्वारा प्रतिनिधित्व किया गया है

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
