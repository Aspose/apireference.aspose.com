---
title: "System::Net::Dns::EndGetHostAddresses मेथड"
linktitle: "EndGetHostAddresses"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Dns::EndGetHostAddresses मेथड। निर्दिष्ट असिंक्रोनस ऑपरेशन जो नया IPHostEntry-क्लास इंस्टेंस बनाता है, के पूर्ण होने तक C++ में प्रतीक्षा करता है।"
type: docs
weight: 500
url: /hi/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


निर्दिष्ट असिंक्रोनस ऑपरेशन जो एक नया IPHostEntry-class इंस्टेंस बनाता है, के पूरा होने तक प्रतीक्षा करता है।

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो एक असिंक्रोनस ऑपरेशन का प्रतिनिधित्व करता है। |

### ReturnValue

एक नया बनाया गया IPHostEntry-क्लास इंस्टेंस।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
