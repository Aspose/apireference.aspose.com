---
title: "System::IO::Stream::BeginRead मेथड"
linktitle: "BeginRead"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Stream::BeginRead मेथड। C++ में एक असिंक्रोनस रीड ऑपरेशन शुरू करता है।"
type: docs
weight: 100
url: /hi/cpp/system.io/stream/beginread/
---
## Stream::BeginRead method


एक असिंक्रोनस रीड ऑपरेशन शुरू करता है।

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginRead(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | पढ़ने के लिए एक बफ़र |
| offset | int | **buffer** में 0-आधारित ऑफ़सेट जो उस स्थिति को दर्शाता है जहाँ से पढ़ा गया डेटा लिखना शुरू किया जाए। |
| count | int | पढ़ने के लिए बाइट्स की संख्या |
| कॉलबैक | System::AsyncCallback | ऑपरेशन के पूरा होने पर कॉल किया जाने वाला कॉलबैक |
| स्थिति | System::SharedPtr\<System::Object\> | प्रत्येक असिंक्रोनस रीड ऑपरेशन को विशिष्ट रूप से पहचानने के लिए उपयोग किया गया उपयोगकर्ता‑प्रदान डेटा |

### ReturnValue

एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो प्रारंभ किए गए असिंक्रोनस पढ़ने के संचालन का प्रतिनिधित्व करता है

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
