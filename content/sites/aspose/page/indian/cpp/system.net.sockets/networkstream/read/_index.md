---
title: "System::Net::Sockets::NetworkStream::Read method"
linktitle: "पढ़ें"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::NetworkStream::Read method. निर्दिष्ट बाइट्स की संख्या को स्ट्रीम से पढ़ता है और उन्हें C++ में निर्दिष्ट बाइट एरे में लिखता है।"
type: docs
weight: 1900
url: /hi/cpp/system.net.sockets/networkstream/read/
---
## NetworkStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<uint8_t\>\& | बाइट एरे जहाँ पढ़े गए बाइट्स लिखे जाएंगे। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | पढ़ने के लिए बाइट्स की संख्या। |

### ReturnValue

पढ़े गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## NetworkStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const System::Details::ArrayView\<uint8_t\>\& | पढ़े गए बाइट्स को लिखने के लिए बाइट एरे व्यू |
| offset | int32_t | एक 0-आधारित स्थिति **buffer** में जहाँ लिखना शुरू किया जाए |
| size | int32_t | पढ़ने के लिए बाइट्स की संख्या |

### ReturnValue

पढ़े गए बाइट्स की संख्या

## संबंधित देखें

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
