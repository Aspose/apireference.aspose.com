---
title: "System::Net::WebRequest::BeginGetResponse विधि"
linktitle: "BeginGetResponse"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::WebRequest::BeginGetResponse विधि। C++ में संसाधन के लिए असिंक्रोनस अनुरोध शुरू करता है।"
type: docs
weight: 1100
url: /hi/cpp/system.net/webrequest/begingetresponse/
---
## WebRequest::BeginGetResponse method


संसाधन के लिए असिंक्रोनस अनुरोध शुरू करता है।

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state)=0
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
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
