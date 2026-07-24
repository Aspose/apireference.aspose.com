---
title: "System::Net::Sockets::TcpListener::BeginAcceptSocket मेथड"
linktitle: "BeginAcceptSocket"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::TcpListener::BeginAcceptSocket मेथड। C++ में एक असिंक्रोनस एक्सेप्ट ऑपरेशन शुरू करता है।"
type: docs
weight: 500
url: /hi/cpp/system.net.sockets/tcplistener/beginacceptsocket/
---
## TcpListener::BeginAcceptSocket method


एक असिंक्रोनस एक्सेप्ट ऑपरेशन को प्रारंभ करता है।

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpListener::BeginAcceptSocket(AsyncCallback callback, System::SharedPtr<Object> state)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कॉलबैक | AsyncCallback | एक कॉलबैक जो ऑपरेशन के पूरा होने पर बुलाया जाएगा। |
| स्थिति | System::SharedPtr\<Object\> | उपयोगकर्ता द्वारा प्रदान किया गया डेटा जो प्रत्येक असिंक्रोनस कनेक्ट ऑपरेशन को विशिष्ट रूप से पहचानने के लिए उपयोग होता है। |

### ReturnValue

एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो शुरू किए गए असिंक्रोनस एक्सेप्ट ऑपरेशन का प्रतिनिधित्व करता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
