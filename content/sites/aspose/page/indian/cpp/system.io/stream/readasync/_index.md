---
title: "System::IO::Stream::ReadAsync मेथड"
linktitle: "ReadAsync"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Stream::ReadAsync मेथड। वर्तमान स्ट्रीम से बाइट्स की एक श्रृंखला को असिंक्रोनस रूप से पढ़ता है, पढ़े गए बाइट्स की संख्या के अनुसार स्ट्रीम में स्थिति को आगे बढ़ाता है, और C++ में रद्द करने के अनुरोधों की निगरानी करता है।"
type: docs
weight: 1900
url: /hi/cpp/system.io/stream/readasync/
---
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


असिंक्रोनस रूप से वर्तमान स्ट्रीम से बाइट्स की क्रमिकता पढ़ता है, पढ़े गए बाइट्स की संख्या से स्ट्रीम में स्थिति को आगे बढ़ाता है, और रद्दीकरण अनुरोधों की निगरानी करता है।

```cpp
RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<uint8_t\>\& | पढ़े गए बाइट्स को लिखने के लिए बाइट एरे। |
| offset | int32_t | **buffer** में लिखना शुरू करने के लिए 0‑आधारित स्थिति। |
| count | int32_t | पढ़ने के लिए बाइट्स की संख्या। |

### ReturnValue

एक टास्क जो असिंक्रोनस पढ़ने की ऑपरेशन का प्रतिनिधित्व करता है। TResult पैरामीटर का मान बफ़र में पढ़े गए कुल बाइट्स की संख्या रखता है। परिणाम मान अनुरोधित बाइट्स की संख्या से कम हो सकता है यदि वर्तमान में उपलब्ध बाइट्स की संख्या अनुरोधित संख्या से कम हो, या यदि स्ट्रीम का अंत पहुँच गया हो तो यह 0 (शून्य) भी हो सकता है।

## संबंधित देखें

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


असिंक्रोनस रूप से वर्तमान स्ट्रीम से बाइट्स की क्रमिकता पढ़ता है, पढ़े गए बाइट्स की संख्या से स्ट्रीम में स्थिति को आगे बढ़ाता है, और रद्दीकरण अनुरोधों की निगरानी करता है।

```cpp
virtual RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<uint8_t\>\& | पढ़े गए बाइट्स को लिखने के लिए बाइट एरे। |
| offset | int32_t | **buffer** में लिखना शुरू करने के लिए 0‑आधारित स्थिति। |
| count | int32_t | पढ़ने के लिए बाइट्स की संख्या। |
| cancellationToken | const Threading::CancellationToken\& | रद्द करने के अनुरोधों की निगरानी के लिए टोकन। |

### ReturnValue

एक टास्क जो असिंक्रोनस पढ़ने की ऑपरेशन का प्रतिनिधित्व करता है। TResult पैरामीटर का मान बफ़र में पढ़े गए कुल बाइट्स की संख्या रखता है। परिणाम मान अनुरोधित बाइट्स की संख्या से कम हो सकता है यदि वर्तमान में उपलब्ध बाइट्स की संख्या अनुरोधित संख्या से कम हो, या यदि स्ट्रीम का अंत पहुँच गया हो तो यह 0 (शून्य) भी हो सकता है।

## संबंधित देखें

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
