---
title: "System::IO::StreamWriter::Write मेथड"
linktitle: "Write"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::StreamWriter::Write मेथड. निर्दिष्ट अक्षर को C++ में स्ट्रीम पर लिखता है।"
type: docs
weight: 1000
url: /hi/cpp/system.io/streamwriter/write/
---
## StreamWriter::Write(char_t) method


निर्दिष्ट अक्षर को स्ट्रीम में लिखता है।

```cpp
void System::IO::StreamWriter::Write(char_t value) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | char_t | लिखने के लिए अक्षर |

## संबंधित देखें

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&) method


निर्दिष्ट एरे से सभी अक्षर स्ट्रीम में लिखता है।

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<char_t\>\& | लिखने के लिए अक्षर रखने वाला ऐरे |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


निर्दिष्ट कैरेक्टर एरे से UTF-16 अक्षरों की निर्दिष्ट उप-रेंज को स्ट्रीम में लिखता है।

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
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
## StreamWriter::Write(const char_t *) method


निर्दिष्ट c-स्ट्रिंग को स्ट्रीम में लिखता है।

```cpp
void System::IO::StreamWriter::Write(const char_t *buffer) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const char_t * | लिखने के लिए c-स्ट्रिंग |

## संबंधित देखें

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const SharedPtr\<Object\>\&) method


निर्दिष्ट ऑब्जेक्ट का स्ट्रिंग प्रतिनिधित्व स्ट्रीम में लिखता है।

```cpp
void System::IO::StreamWriter::Write(const SharedPtr<Object> &obj) override
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
## StreamWriter::Write(const String\&) method


निर्दिष्ट स्ट्रिंग को स्ट्रीम में लिखता है।

```cpp
void System::IO::StreamWriter::Write(const String &value) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | लिखने के लिए स्ट्रिंग |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const System::SharedPtr\<T\>\&) method


निर्दिष्ट ऑब्जेक्ट का स्ट्रिंग प्रतिनिधित्व स्ट्रीम में लिखता है।

```cpp
template<typename T> void System::IO::StreamWriter::Write(const System::SharedPtr<T> &obj)
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
