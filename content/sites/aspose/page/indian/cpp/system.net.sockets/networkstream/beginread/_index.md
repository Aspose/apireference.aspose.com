---
title: "System::Net::Sockets::NetworkStream::BeginRead मेथड"
linktitle: "BeginRead"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::NetworkStream::BeginRead मेथड। C++ में एक असिंक्रोनस रीड ऑपरेशन शुरू करता है।"
type: docs
weight: 300
url: /hi/cpp/system.net.sockets/networkstream/beginread/
---
## NetworkStream::BeginRead method


एक असिंक्रोनस रीड ऑपरेशन शुरू करता है।

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | बाइट एरे जहाँ पढ़े गए बाइट्स लिखे जाएंगे। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | पढ़ने के लिए बाइट्स की संख्या। |
| कॉलबैक | AsyncCallback | ऑपरेशन पूर्ण होने पर कॉल किया जाने वाला कॉलबैक। |
| स्थिति | System::SharedPtr\<Object\> | उपयोगकर्ता द्वारा प्रदान किया गया डेटा जो प्रत्येक असिंक्रोनस पढ़ने के ऑपरेशन को विशिष्ट रूप से पहचानने के लिए उपयोग होता है। |

### ReturnValue

एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो शुरू किए गए असिंक्रोनस पढ़ने के ऑपरेशन का प्रतिनिधित्व करता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
