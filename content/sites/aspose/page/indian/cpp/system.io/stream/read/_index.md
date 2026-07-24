---
title: "System::IO::Stream::Read मेथड"
linktitle: "पढ़ें"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Stream::Read मेथड। स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है C++ में।"
type: docs
weight: 1800
url: /hi/cpp/system.io/stream/read/
---
## Stream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है।

```cpp
virtual int32_t System::IO::Stream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
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
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है।

```cpp
virtual int32_t System::IO::Stream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const System::Details::ArrayView\<uint8_t\>\& | पढ़े गए बाइट्स को लिखने के लिए बाइट एरे व्यू |
| offset | int32_t | एक 0-आधारित स्थिति **buffer** में जहाँ लिखना शुरू किया जाए |
| count | int32_t | पढ़ने के लिए बाइट्स की संख्या |

### ReturnValue

पढ़े गए बाइट्स की संख्या

## संबंधित देखें

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Read(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है।

```cpp
template<std::size_t> int32_t System::IO::Stream::Read(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| पैरामीटर | विवरण |
| --- | --- |
| N | स्टैक सरणी का आकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const System::Details::StackArray\<uint8_t, N\>\& | पढ़े गए बाइट्स को लिखने के लिए बाइट स्टैक एरे |
| offset | int32_t | एक 0-आधारित स्थिति **buffer** में जहाँ लिखना शुरू किया जाए |
| count | int32_t | पढ़ने के लिए बाइट्स की संख्या |

### ReturnValue

पढ़े गए बाइट्स की संख्या

## संबंधित देखें

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
