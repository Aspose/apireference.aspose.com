---
title: "System::Net::FileWebRequest::BeginGetRequestStream मेथड"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::FileWebRequest::BeginGetRequestStream मेथड। C++ में डेटा को संसाधन में लिखने के लिए एक स्ट्रीम प्राप्त करने हेतु असिंक्रोनस ऑपरेशन शुरू करता है।"
type: docs
weight: 300
url: /hi/cpp/system.net/filewebrequest/begingetrequeststream/
---
## FileWebRequest::BeginGetRequestStream method


संसाधन में डेटा लिखने के लिए एक स्ट्रीम प्राप्त करने हेतु असिंक्रोनस ऑपरेशन शुरू करता है।

```cpp
System::SharedPtr<IAsyncResult> System::Net::FileWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
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
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
