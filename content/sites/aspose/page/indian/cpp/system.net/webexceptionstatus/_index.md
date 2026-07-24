---
title: "System::Net::WebExceptionStatus enum"
linktitle: "WebExceptionStatus"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::WebExceptionStatus enum. WebException क्लास के स्थिति कोड को C++ में सूचीबद्ध करता है।"
type: docs
weight: 4900
url: /hi/cpp/system.net/webexceptionstatus/
---
## WebExceptionStatus enum


[WebException](../webexception/) क्लास के स्थिति कोड को सूचीबद्ध करता है।

```cpp
enum class WebExceptionStatus
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| Success | 0 | कोई त्रुटि नहीं हुई। |
| NameResolutionFailure | 1 | नाम समाधान सेवा होस्ट नाम को हल नहीं कर सकी। |
| ConnectFailure | 2 | रिमोट सर्विस पॉइंट को ट्रांसपोर्ट स्तर पर संपर्क नहीं किया जा सका। |
| ReceiveFailure | 3 | रिमोट सर्वर से पूरी प्रतिक्रिया प्राप्त नहीं हुई। |
| SendFailure | 4 | पूरी अनुरोध रिमोट सर्वर को भेजा नहीं जा सका। |
| PipelineFailure | 5 | अनुरोध एक पाइपलाइन्ड अनुरोध था और प्रतिक्रिया प्राप्त होने से पहले कनेक्शन बंद हो गया। |
| RequestCanceled | 6 | अनुरोध रद्द कर दिया गया या कोई अज्ञात त्रुटि हुई। |
| ProtocolError | 7 | सर्वर से प्राप्त प्रतिक्रिया पूरी थी लेकिन प्रोटोकॉल स्तर की त्रुटि दर्शाती है। |
| ConnectionClosed | 8 | कनेक्शन समय से पहले बंद हो गया। |
| TrustFailure | 9 | सर्वर प्रमाणपत्र को सत्यापित नहीं किया जा सका। |
| SecureChannelFailure | 10 | SSL का उपयोग करके कनेक्शन स्थापित करने के दौरान त्रुटि हुई। |
| ServerProtocolViolation | 11 | सर्वर प्रतिक्रिया एक वैध HTTP प्रतिक्रिया नहीं थी। |
| KeepAliveFailure | 12 | एक अनुरोध के लिए जो 'Keep-Alive' हेडर निर्दिष्ट करता है, कनेक्शन अप्रत्याशित रूप से बंद हो गया था। |
| लंबित | 13 | एक आंतरिक असिंक्रोनस अनुरोध लंबित है। |
| समय समाप्ति | 14 | एक अनुरोध के लिए टाइम‑आउट अवधि के दौरान कोई प्रतिक्रिया प्राप्त नहीं हुई। |
| ProxyNameResolutionFailure | 15 | नाम रिज़ॉल्वर सेवा प्रॉक्सी होस्ट नाम को हल नहीं कर सकी। |
| UnknownError | 16 | एक अज्ञात प्रकार का अपवाद हुआ है। |
| MessageLengthLimitExceeded | 17 | एक संदेश प्राप्त हुआ जो निर्दिष्ट सीमा से अधिक था। |
| CacheEntryNotFound | 18 | निर्दिष्ट कैश एंट्री नहीं मिली। |
| RequestProhibitedByCachePolicy | 19 | अनुरोध को कैश नीति द्वारा अनुमति नहीं दी गई थी। |
| RequestProhibitedByProxy | 20 | यह अनुरोध प्रॉक्सी द्वारा अनुमति नहीं दिया गया था। |

## संबंधित देखें

* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
