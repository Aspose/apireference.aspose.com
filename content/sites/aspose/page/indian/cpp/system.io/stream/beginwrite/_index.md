---
title: "System::IO::Stream::BeginWrite मेथड"
linktitle: "BeginWrite"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Stream::BeginWrite मेथड। C++ में एक असिंक्रोनस लिखने का ऑपरेशन शुरू करता है।"
type: docs
weight: 200
url: /hi/cpp/system.io/stream/beginwrite/
---
## Stream::BeginWrite method


एक असिंक्रोनस राइट ऑपरेशन शुरू करता है।

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | लिखे जाने वाले डेटा को सम्मिलित करने वाला बफ़र |
| offset | int | **buffer** में 0-आधारित ऑफ़सेट जो उस स्थिति को दर्शाता है जहाँ से लिखने का डेटा शुरू होता है |
| count | int | लिखने के लिए बाइट्स की संख्या |
| कॉलबैक | System::AsyncCallback | ऑपरेशन के पूरा होने पर कॉल किया जाने वाला कॉलबैक |
| स्थिति | System::SharedPtr\<System::Object\> | उपयोगकर्ता द्वारा प्रदान किया गया डेटा जो प्रत्येक असिंक्रोनस लिखने के ऑपरेशन को विशिष्ट रूप से पहचानता है |

### ReturnValue

एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो शुरू किए गए असिंक्रोनस लिखने के ऑपरेशन को दर्शाता है

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
