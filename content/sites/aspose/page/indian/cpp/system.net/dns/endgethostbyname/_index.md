---
title: "System::Net::Dns::EndGetHostByName मेथड"
linktitle: "EndGetHostByName"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Dns::EndGetHostByName मेथड। C++ में नया IPHostEntry-क्लास इंस्टेंस बनाने के लिए निर्दिष्ट असिंक्रोनस ऑपरेशन के समाप्त होने तक प्रतीक्षा करता है।"
type: docs
weight: 600
url: /hi/cpp/system.net/dns/endgethostbyname/
---
## Dns::EndGetHostByName method


निर्दिष्ट असिंक्रोनस ऑपरेशन जो एक नया IPHostEntry-class इंस्टेंस बनाता है, के पूरा होने तक प्रतीक्षा करता है।

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndGetHostByName(System::SharedPtr<IAsyncResult> asyncResult)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो एक असिंक्रोनस ऑपरेशन का प्रतिनिधित्व करता है। |

### ReturnValue

एक नया बनाया गया IPHostEntry-क्लास इंस्टेंस।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
