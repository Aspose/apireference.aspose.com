---
title: "System::IO::Stream::Write मेथड"
linktitle: "Write"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Stream::Write मेथड। C++ में निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है।"
type: docs
weight: 2600
url: /hi/cpp/system.io/stream/write/
---
## Stream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::Stream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<uint8_t\>\& | बाइट्स को लिखने वाली एरे। |
| offset | int32_t | एक 0-आधारित सूचकांक जो **buffer** में उस तत्व का है जहाँ लिखने के लिए उप-सीमा शुरू होती है |
| count | int32_t | लिखने के लिए उप-सीमा में तत्वों की संख्या |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::Stream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const System::Details::ArrayView\<uint8_t\>\& | लेखन के लिए बाइट्स को सम्मिलित करने वाला एरे व्यू |
| offset | int32_t | एक 0-आधारित सूचकांक जो **buffer** में उस तत्व का है जहाँ लिखने के लिए उप-सीमा शुरू होती है |
| count | int32_t | लिखने के लिए उप-सीमा में तत्वों की संख्या |

## संबंधित देखें

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है।

```cpp
template<std::size_t> void System::IO::Stream::Write(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| पैरामीटर | विवरण |
| --- | --- |
| N | स्टैक सरणी का आकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const System::Details::StackArray\<uint8_t, N\>\& | बाइट्स को लिखने वाली स्टैक एरे |
| offset | int32_t | एक 0-आधारित सूचकांक जो **buffer** में उस तत्व का है जहाँ लिखने के लिए उप-सीमा शुरू होती है |
| count | int32_t | लिखने के लिए उप-सीमा में तत्वों की संख्या |

## संबंधित देखें

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
