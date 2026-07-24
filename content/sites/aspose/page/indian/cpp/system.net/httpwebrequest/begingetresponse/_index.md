---
title: "System::Net::HttpWebRequest::BeginGetResponse मेथड"
linktitle: "BeginGetResponse"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::HttpWebRequest::BeginGetResponse मेथड. C++ में संसाधन के लिए एक असिंक्रोनस अनुरोध शुरू करता है।"
type: docs
weight: 500
url: /hi/cpp/system.net/httpwebrequest/begingetresponse/
---
## HttpWebRequest::BeginGetResponse method


संसाधन के लिए असिंक्रोनस अनुरोध शुरू करता है।

```cpp
System::SharedPtr<IAsyncResult> System::Net::HttpWebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कॉलबैक | AsyncCallback | ऑपरेशन पूर्ण होने पर कॉल किया जाने वाला कॉलबैक। |
| स्थिति | System::SharedPtr\<Object\> | उपयोगकर्ता द्वारा प्रदान किया गया डेटा जो प्रत्येक असिंक्रोनस ऑपरेशन को अद्वितीय रूप से पहचानने के लिए उपयोग होता है। |

### ReturnValue

एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो शुरू किए गए असिंक्रोनस ऑपरेशन का प्रतिनिधित्व करता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
