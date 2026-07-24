---
title: "System::IO::Stream::WriteAsync मेथड"
linktitle: "WriteAsync"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Stream::WriteAsync मेथड। असिंक्रोनस रूप से वर्तमान स्ट्रीम में बाइट्स की एक श्रृंखला लिखता है, लिखे गए बाइट्स की संख्या से इस स्ट्रीम में वर्तमान स्थिति को आगे बढ़ाता है, और C++ में रद्द करने के अनुरोधों की निगरानी करता है।"
type: docs
weight: 2700
url: /hi/cpp/system.io/stream/writeasync/
---
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


असिंक्रोनस रूप से वर्तमान स्ट्रीम में बाइट्स की क्रमिकता लिखता है, लिखे गए बाइट्स की संख्या से इस स्ट्रीम में वर्तमान स्थिति को आगे बढ़ाता है, और रद्दीकरण अनुरोधों की निगरानी करता है।

```cpp
TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<uint8_t\>\& | लिखने के लिए बाइट्स वाला एरे। |
| offset | int32_t | **buffer** में उस तत्व का 0-आधारित इंडेक्स जहाँ लिखने के लिए उप-रेंज शुरू होती है। |
| count | int32_t | लिखने के लिए उप-सीमा में तत्वों की संख्या। |

### ReturnValue

एक टास्क जो असिंक्रोनस लिखने के ऑपरेशन का प्रतिनिधित्व करता है।

## संबंधित देखें

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


असिंक्रोनस रूप से वर्तमान स्ट्रीम में बाइट्स की क्रमिकता लिखता है, लिखे गए बाइट्स की संख्या से इस स्ट्रीम में वर्तमान स्थिति को आगे बढ़ाता है, और रद्दीकरण अनुरोधों की निगरानी करता है।

```cpp
virtual TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<uint8_t\>\& | लिखने के लिए बाइट्स वाला एरे। |
| offset | int32_t | **buffer** में उस तत्व का 0-आधारित इंडेक्स जहाँ लिखने के लिए उप-रेंज शुरू होती है। |
| count | int32_t | लिखने के लिए उप-सीमा में तत्वों की संख्या। |
| cancellationToken | const Threading::CancellationToken\& | रद्द करने के अनुरोधों की निगरानी के लिए टोकन। |

### ReturnValue

एक टास्क जो असिंक्रोनस लिखने के ऑपरेशन का प्रतिनिधित्व करता है।

## संबंधित देखें

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
