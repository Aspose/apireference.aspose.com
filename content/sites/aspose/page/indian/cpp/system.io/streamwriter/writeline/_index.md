---
title: "System::IO::StreamWriter::WriteLine method"
linktitle: "WriteLine"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::StreamWriter::WriteLine मेथड। C++ में स्ट्रीम को लाइन टर्मिनेटर अक्षर लिखता है।"
type: docs
weight: 1100
url: /hi/cpp/system.io/streamwriter/writeline/
---
## StreamWriter::WriteLine() method


लाइन टर्मिनेटर अक्षरों को स्ट्रीम में लिखता है।

```cpp
void System::IO::StreamWriter::WriteLine() override
```

## संबंधित देखें

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


निर्दिष्ट एरे से सभी अक्षर लिखता है और उसके बाद लाइन-टर्मिनेटिंग अक्षर स्ट्रीम में लिखता है।

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<char_t\>\& | लिखने के लिए अक्षर रखने वाला ऐरे |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


निर्दिष्ट कैरेक्टर एरे से निर्दिष्ट UTF-16 अक्षरों की उप-सीमा लिखता है और उसके बाद लाइन-टर्मिनेटिंग अक्षर स्ट्रीम में लिखता है।

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<char_t\>\& | लिखने के लिए अक्षर रखने वाला ऐरे |
| सूचकांक | int32_t | **buffer** में तत्व का 0-आधारित सूचकांक जहाँ लिखने के लिए उप-रेंज शुरू होता है |
| count | int32_t | लिखने के लिए उप-रेंज में अक्षरों की संख्या; -1 यह निर्दिष्ट करता है कि उप-रेंज **buffer** ऐरे के अंत तक समाप्त होता है |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const char_t *) method


निर्दिष्ट C-स्ट्रिंग लिखता है और उसके बाद लाइन-टर्मिनेटिंग अक्षर स्ट्रीम में लिखता है।

```cpp
void System::IO::StreamWriter::WriteLine(const char_t *buffer) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const char_t * | लिखने के लिए c-स्ट्रिंग |

## संबंधित देखें

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const SharedPtr\<Object\>\&) method


निर्दिष्ट ऑब्जेक्ट का स्ट्रिंग प्रतिनिधित्व, उसके बाद लाइन-टर्मिनेटर अक्षरों के साथ, स्ट्रीम में लिखता है।

```cpp
void System::IO::StreamWriter::WriteLine(const SharedPtr<Object> &obj) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const SharedPtr\<Object\>\& | लिखने के लिए ऑब्जेक्ट |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const String\&) method


निर्दिष्ट स्ट्रिंग लिखता है और उसके बाद लाइन-टर्मिनेटिंग अक्षर स्ट्रीम में लिखता है।

```cpp
void System::IO::StreamWriter::WriteLine(const String &value) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | लिखने के लिए स्ट्रिंग |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const System::SharedPtr\<T\>\&) method


निर्दिष्ट ऑब्जेक्ट का स्ट्रिंग प्रतिनिधित्व, उसके बाद लाइन-टर्मिनेटर अक्षरों के साथ, स्ट्रीम में लिखता है।

```cpp
template<typename T> void System::IO::StreamWriter::WriteLine(const System::SharedPtr<T> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | ऑब्जेक्ट का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const System::SharedPtr\<T\>\& | लिखने के लिए ऑब्जेक्ट |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
