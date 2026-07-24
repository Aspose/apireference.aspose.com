---
title: "System::IO::BufferedStream::Read विधि"
linktitle: "पढ़ें"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::BufferedStream::Read विधि. अंतर्निहित स्ट्रीम से निर्दिष्ट संख्या में बाइट पढ़ता है और उन्हें C++ में निर्दिष्ट बाइट एरे में लिखता है।"
type: docs
weight: 900
url: /hi/cpp/system.io/bufferedstream/read/
---
## BufferedStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


आधारभूत स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है।

```cpp
virtual int32_t System::IO::BufferedStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<uint8_t\>\& | पढ़े गए बाइट्स को लिखने के लिए बाइट एरे। |
| offset | int32_t | एक 0-आधारित स्थिति **buffer** में जहाँ लिखना शुरू किया जाए |
| count | int32_t | पढ़ने के लिए बाइट्स की संख्या |

### ReturnValue

पढ़े गए बाइट्स की संख्या

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BufferedStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


आधारभूत स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है।

```cpp
virtual int32_t System::IO::BufferedStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const System::Details::ArrayView\<uint8_t\>\& | पढ़े गए बाइट्स को लिखने के लिए बाइट एरे। |
| offset | int32_t | एक 0-आधारित स्थिति **buffer** में जहाँ लिखना शुरू किया जाए |
| count | int32_t | पढ़ने के लिए बाइट्स की संख्या |

### ReturnValue

पढ़े गए बाइट्स की संख्या

## संबंधित देखें

* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
