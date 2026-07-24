---
title: "System::Net::WebRequest::BeginGetRequestStream विधि"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::WebRequest::BeginGetRequestStream विधि. C++ में संसाधन पर डेटा लिखने के लिए स्ट्रीम प्राप्त करने हेतु एक असिंक्रोनस ऑपरेशन शुरू करती है।"
type: docs
weight: 1000
url: /hi/cpp/system.net/webrequest/begingetrequeststream/
---
## WebRequest::BeginGetRequestStream method


संसाधन में डेटा लिखने के लिए एक स्ट्रीम प्राप्त करने हेतु असिंक्रोनस ऑपरेशन शुरू करता है।

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state)=0
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
