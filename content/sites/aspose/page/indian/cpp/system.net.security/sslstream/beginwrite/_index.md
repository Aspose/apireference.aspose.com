---
title: "System::Net::Security::SslStream::BeginWrite method"
linktitle: "BeginWrite"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Security::SslStream::BeginWrite method. C++ में असिंक्रोनस लिखने का ऑपरेशन शुरू करता है।"
type: docs
weight: 400
url: /hi/cpp/system.net.security/sslstream/beginwrite/
---
## SslStream::BeginWrite method


एक असिंक्रोनस राइट ऑपरेशन शुरू करता है।

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | डेटा लिखने के लिए बाइट एरे। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| count | int32_t | लिखने के लिए बाइट्स की संख्या। |
| asyncCallback | AsyncCallback | ऑपरेशन पूर्ण होने पर कॉल किया जाने वाला कॉलबैक। |
| asyncState | System::SharedPtr\<Object\> | उपयोगकर्ता द्वारा प्रदान किया गया डेटा जो प्रत्येक असिंक्रोनस लिखने के ऑपरेशन को विशिष्ट रूप से पहचानने के लिए उपयोग होता है। |

### ReturnValue

एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो आरंभ किए गए असिंक्रोनस लिखने के ऑपरेशन का प्रतिनिधित्व करता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
