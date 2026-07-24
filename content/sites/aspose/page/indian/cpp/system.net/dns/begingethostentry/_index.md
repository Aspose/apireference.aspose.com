---
title: "System::Net::Dns::BeginGetHostEntry मेथड"
linktitle: "BeginGetHostEntry"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Dns::BeginGetHostEntry मेथड। C++ में होस्ट नाम या IP पता शामिल करने वाली निर्दिष्ट स्ट्रिंग का उपयोग करके एक नया IPHostEntry-क्लास इंस्टेंस बनाने के लिए असिंक्रोनस ऑपरेशन शुरू करता है।"
type: docs
weight: 300
url: /hi/cpp/system.net/dns/begingethostentry/
---
## Dns::BeginGetHostEntry(String, AsyncCallback, System::SharedPtr\<Object\>) method


निर्दिष्ट स्ट्रिंग का उपयोग करके जिसमें होस्ट नाम या IP पता हो, एक नया IPHostEntry-class इंस्टेंस बनाने के लिए एक असिंक्रोनस ऑपरेशन शुरू करता है।

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| hostNameOrAddress | String | स्ट्रिंग जिसमें होस्टनाम या IP पता शामिल है। |
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
## Dns::BeginGetHostEntry(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) method


निर्दिष्ट IP पते का उपयोग करके एक नया IPHostEntry-class इंस्टेंस बनाने के लिए एक असिंक्रोनस ऑपरेशन शुरू करता है।

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(System::SharedPtr<IPAddress> address, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पता | System::SharedPtr\<IPAddress\> | IP पता। |
| requestCallback | AsyncCallback | ऑपरेशन पूर्ण होने पर कॉल किया जाने वाला कॉलबैक। |
| stateObject | System::SharedPtr\<Object\> | उपयोगकर्ता द्वारा प्रदान किया गया डेटा जो प्रत्येक असिंक्रोनस ऑपरेशन को अद्वितीय रूप से पहचानने के लिए उपयोग होता है। |

### ReturnValue

एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो शुरू किए गए असिंक्रोनस ऑपरेशन का प्रतिनिधित्व करता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
