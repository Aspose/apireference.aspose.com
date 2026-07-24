---
title: "System::IO::BasicSTDOStreamWrapper::Write मेथड"
linktitle: "Write"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::BasicSTDOStreamWrapper::Write मेथड। यदि रैपिंग मोड बाइनरी है, तो निर्दिष्ट बाइट एरे से निर्दिष्ट सबरेंज बाइट्स को स्ट्रीम में लिखता है, अन्यथा निर्दिष्ट बाइट एरे से निर्दिष्ट सबरेंज बाइट्स को char_type प्रकार में बदलता है और फिर परिणाम को स्ट्रीम में लिखता है C++ में।"
type: docs
weight: 700
url: /hi/cpp/system.io/basicstdostreamwrapper/write/
---
## BasicSTDOStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


यदि रैपिंग मोड बाइनरी है, तो निर्दिष्ट बाइट एरे से निर्दिष्ट सबरेंज बाइट्स को स्ट्रीम में लिखता है, अन्यथा निर्दिष्ट बाइट एरे से निर्दिष्ट सबरेंज बाइट्स को [char_type](../char_type/) प्रकार में बदलता है और फिर परिणाम को स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BasicSTDOStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<uint8_t\>\& | बाइट्स को लिखने वाली एरे। |
| offset | int32_t | **buffer** में तत्व का 0-आधारित सूचकांक जहाँ लिखने के लिए उप-रेंज शुरू होता है |
| count | int32_t | लिखने के लिए उप-सीमा में तत्वों की संख्या |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDOStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BasicSTDOStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const System::Details::ArrayView\<uint8_t\>\& | लेखन के लिए बाइट्स को सम्मिलित करने वाला एरे व्यू |
| offset | int32_t | एक 0-आधारित सूचकांक जो **buffer** में उस तत्व का है जहाँ लिखने के लिए उप-सीमा शुरू होती है |
| count | int32_t | लिखने के लिए उप-सीमा में तत्वों की संख्या |

## संबंधित देखें

* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
