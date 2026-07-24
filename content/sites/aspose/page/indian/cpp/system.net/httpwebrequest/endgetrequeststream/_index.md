---
title: "System::Net::HttpWebRequest::EndGetRequestStream मेथड"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::HttpWebRequest::EndGetRequestStream मेथड. C++ में स्ट्रीम प्राप्त करने के लिए निर्दिष्ट असिंक्रोनस ऑपरेशन के पूरा होने तक प्रतीक्षा करता है।"
type: docs
weight: 600
url: /hi/cpp/system.net/httpwebrequest/endgetrequeststream/
---
## HttpWebRequest::EndGetRequestStream method


स्ट्रीम प्राप्त करने के निर्दिष्ट असिंक्रोनस ऑपरेशन के समाप्त होने तक प्रतीक्षा करता है।

```cpp
System::SharedPtr<IO::Stream> System::Net::HttpWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो स्ट्रीम प्राप्त करने के लिए असिंक्रोनस ऑपरेशन का प्रतिनिधित्व करता है। |

### ReturnValue

संसाधन पर डेटा लिखने के लिए स्ट्रीम।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
