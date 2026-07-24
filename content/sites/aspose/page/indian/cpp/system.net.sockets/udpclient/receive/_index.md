---
title: "System::Net::Sockets::UdpClient::Receive मेथड"
linktitle: "प्राप्त करें"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::UdpClient::Receive मेथड. C++ में सर्वर द्वारा भेजा गया डेटाग्राम लौटाता है।"
type: docs
weight: 600
url: /hi/cpp/system.net.sockets/udpclient/receive/
---
## UdpClient::Receive method


सर्वर द्वारा भेजा गया डेटाग्राम वापस करता है।

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::UdpClient::Receive(System::SharedPtr<IPEndPoint> &remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<IPEndPoint\>\& | एक [IPEndPoint](../../../system.net/ipendpoint/) जो उस रिमोट होस्ट का प्रतिनिधित्व करता है जिससे डेटा भेजा गया था। |

### ReturnValue

एक बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
