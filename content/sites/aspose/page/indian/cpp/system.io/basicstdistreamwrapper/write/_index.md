---
title: "System::IO::BasicSTDIStreamWrapper::Write मेथड"
linktitle: "Write"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::BasicSTDIStreamWrapper::Write मेथड। यदि रैपिंग मोड बाइनरी है, तो निर्दिष्ट बाइट एरे से निर्दिष्ट उप-रेंज के बाइट्स को स्ट्रीम में लिखता है, अन्यथा निर्दिष्ट बाइट एरे से निर्दिष्ट उप-रेंज के बाइट्स को char_type प्रकार में परिवर्तित करता है और फिर परिणाम को स्ट्रीम में लिखता है। C++ में समर्थित नहीं!"
type: docs
weight: 700
url: /hi/cpp/system.io/basicstdistreamwrapper/write/
---
## BasicSTDIStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


यदि रैपिंग मोड बाइनरी है, तो निर्दिष्ट बाइट एरे से निर्दिष्ट उप-रेंज के बाइट्स को स्ट्रीम में लिखता है, अन्यथा निर्दिष्ट बाइट एरे से निर्दिष्ट उप-रेंज के बाइट्स को [char_type](../char_type/) प्रकार में परिवर्तित करता है और फिर परिणाम को स्ट्रीम में लिखता है। समर्थित नहीं!

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<uint8_t\>\& | लिखने के लिए बाइट्स वाला एरे। |
| offset | int32_t | **buffer** में उस तत्व का 0-आधारित इंडेक्स जहाँ लिखने के लिए उप-रेंज शुरू होती है। |
| count | int32_t | लिखने के लिए उप-सीमा में तत्वों की संख्या। |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const System::Details::ArrayView\<uint8_t\>\& | लेखन के लिए बाइट्स को सम्मिलित करने वाला एरे व्यू |
| offset | int32_t | एक 0-आधारित सूचकांक जो **buffer** में उस तत्व का है जहाँ लिखने के लिए उप-सीमा शुरू होती है |
| count | int32_t | लिखने के लिए उप-सीमा में तत्वों की संख्या |

## संबंधित देखें

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
