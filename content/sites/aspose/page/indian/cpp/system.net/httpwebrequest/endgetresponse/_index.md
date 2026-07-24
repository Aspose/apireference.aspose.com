---
title: "System::Net::HttpWebRequest::EndGetResponse मेथड"
linktitle: "EndGetResponse"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::HttpWebRequest::EndGetResponse मेथड. C++ में संसाधन के लिए निर्दिष्ट असिंक्रोनस अनुरोध के पूरा होने तक प्रतीक्षा करता है।"
type: docs
weight: 700
url: /hi/cpp/system.net/httpwebrequest/endgetresponse/
---
## HttpWebRequest::EndGetResponse method


संसाधन के लिए निर्दिष्ट असिंक्रोनस अनुरोध के समाप्त होने तक प्रतीक्षा करता है।

```cpp
System::SharedPtr<WebResponse> System::Net::HttpWebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult) override
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
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
