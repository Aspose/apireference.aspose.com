---
title: "System::Net::Dns::GetHostEntry मेथड"
linktitle: "GetHostEntry"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Dns::GetHostEntry मेथड. C++ में होस्ट नाम या IP पता शामिल करने वाली निर्दिष्ट स्ट्रिंग का उपयोग करके एक नया IPHostEntry-क्लास इंस्टेंस बनाता है।"
type: docs
weight: 1200
url: /hi/cpp/system.net/dns/gethostentry/
---
## Dns::GetHostEntry(String) method


निर्दिष्ट स्ट्रिंग जिसका उपयोग होस्ट नाम या IP पता शामिल करता है, से एक नया IPHostEntry-class इंस्टेंस बनाता है।

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::GetHostEntry(String hostNameOrAddress)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| hostNameOrAddress | String | एक स्ट्रिंग जिसमें होस्टनाम या IP पता शामिल है। |

### ReturnValue

एक नया बनाया गया IPHostEntry-क्लास इंस्टेंस।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [String](../../../system/string/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## Dns::GetHostEntry(System::SharedPtr\<IPAddress\>) method


निर्दिष्ट IP पते का उपयोग करके एक नया IPHostEntry-class इंस्टेंस बनाता है।

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::GetHostEntry(System::SharedPtr<IPAddress> address)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पता | System::SharedPtr\<IPAddress\> | IP पता। |

### ReturnValue

एक नया बनाया गया IPHostEntry-क्लास इंस्टेंस।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IPAddress](../../ipaddress/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
