---
title: "System::Net::Sockets::NetworkStream::Write विधि"
linktitle: "Write"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::NetworkStream::Write विधि। निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को C++ में स्ट्रीम में लिखता है।"
type: docs
weight: 2500
url: /hi/cpp/system.net.sockets/networkstream/write/
---
## NetworkStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है।

```cpp
void System::Net::Sockets::NetworkStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<uint8_t\>\& | लिखने के लिए बाइट्स वाला एरे। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | लिखने के लिए उप-सीमा में तत्वों की संख्या। |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## NetworkStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है।

```cpp
void System::Net::Sockets::NetworkStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const System::Details::ArrayView\<uint8_t\>\& | लेखन के लिए बाइट्स को सम्मिलित करने वाला एरे व्यू |
| offset | int32_t | एक 0-आधारित सूचकांक जो **buffer** में उस तत्व का है जहाँ लिखने के लिए उप-सीमा शुरू होती है |
| size | int32_t | लिखने के लिए उप-सीमा में तत्वों की संख्या |

## संबंधित देखें

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
