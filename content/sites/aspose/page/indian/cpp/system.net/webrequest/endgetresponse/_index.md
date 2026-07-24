---
title: "System::Net::WebRequest::EndGetResponse विधि"
linktitle: "EndGetResponse"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::WebRequest::EndGetResponse विधि। C++ में संसाधन के लिए निर्दिष्ट असिंक्रोनस अनुरोध के पूर्ण होने तक प्रतीक्षा करता है।"
type: docs
weight: 1300
url: /hi/cpp/system.net/webrequest/endgetresponse/
---
## WebRequest::EndGetResponse method


संसाधन के लिए निर्दिष्ट असिंक्रोनस अनुरोध के समाप्त होने तक प्रतीक्षा करता है।

```cpp
virtual System::SharedPtr<WebResponse> System::Net::WebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो संसाधन के लिए एक असिंक्रोनस अनुरोध का प्रतिनिधित्व करता है। |

### ReturnValue

वेब प्रतिक्रिया।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WebResponse](../../webresponse/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
