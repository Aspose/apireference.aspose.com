---
title: "System::Net::Dns::BeginResolve मेथड"
linktitle: "BeginResolve"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Dns::BeginResolve मेथड। C++ में निर्दिष्ट होस्ट नाम का उपयोग करके एक नया IPHostEntry-क्लास इंस्टेंस बनाने के लिए असिंक्रोनस ऑपरेशन शुरू करता है।"
type: docs
weight: 400
url: /hi/cpp/system.net/dns/beginresolve/
---
## Dns::BeginResolve method


निर्दिष्ट होस्ट नाम का उपयोग करके एक नया IPHostEntry-class इंस्टेंस बनाने के लिए एक असिंक्रोनस ऑपरेशन शुरू करता है।

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginResolve(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| hostName | String | एक होस्ट नाम जिसका उपयोग [IPHostEntry](../../iphostentry/) क्लास का नया इंस्टेंस बनाने के लिए किया जाता है। |
| requestCallback | AsyncCallback | ऑपरेशन पूर्ण होने पर कॉल किया जाने वाला कॉलबैक। |
| stateObject | System::SharedPtr\<Object\> | उपयोगकर्ता द्वारा प्रदान किया गया डेटा जो प्रत्येक असिंक्रोनस ऑपरेशन को अद्वितीय रूप से पहचानने के लिए उपयोग होता है। |

### ReturnValue

एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो शुरू किए गए असिंक्रोनस ऑपरेशन का प्रतिनिधित्व करता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
