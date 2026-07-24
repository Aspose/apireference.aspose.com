---
title: "System::IO::FileStream::Write method"
linktitle: "Write"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::FileStream::Write method. निर्दिष्ट बाइट एरे से निर्दिष्ट उप-सीमा के बाइट्स को C++ में स्ट्रीम में लिखता है।"
type: docs
weight: 1900
url: /hi/cpp/system.io/filestream/write/
---
## FileStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है।

```cpp
void System::IO::FileStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<uint8_t\>\& | लिखने के लिए बाइट्स वाला एरे। |
| offset | int32_t | **buffer** में उस तत्व का 0-आधारित इंडेक्स जहाँ लिखने के लिए उप-रेंज शुरू होती है। |
| count | int32_t | लिखने के लिए उप-सीमा में तत्वों की संख्या। |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है।

```cpp
void System::IO::FileStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const System::Details::ArrayView\<uint8_t\>\& | लिखने के लिए बाइट्स वाली एरे व्यू। |
| offset | int32_t | **buffer** में उस तत्व का 0-आधारित इंडेक्स जहाँ लिखने के लिए उप-रेंज शुरू होती है। |
| count | int32_t | लिखने के लिए उप-सीमा में तत्वों की संख्या। |

## संबंधित देखें

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
