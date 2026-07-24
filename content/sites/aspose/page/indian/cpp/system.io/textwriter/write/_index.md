---
title: "System::IO::TextWriter::Write method"
linktitle: "Write"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::TextWriter::Write method. C++ में निर्दिष्ट बूलियन मान का स्ट्रिंग प्रतिनिधित्व स्ट्रीम में लिखता है।"
type: docs
weight: 900
url: /hi/cpp/system.io/textwriter/write/
---
## TextWriter::Write(bool) method


निर्दिष्ट बूलियन मान का स्ट्रिंग प्रतिनिधित्व स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::TextWriter::Write(bool value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | bool | लिखने के लिए मान |

## संबंधित देखें

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(char_t) method


निर्दिष्ट अक्षर को स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::TextWriter::Write(char_t value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | char_t | लिखने के लिए मान |

## संबंधित देखें

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const ArrayPtr\<char_t\>\&) method


निर्दिष्ट एरे से सभी अक्षर स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::TextWriter::Write(const ArrayPtr<char_t> &buffer)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<char_t\>\& | लिखने के लिए अक्षर रखने वाला ऐरे |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


निर्दिष्ट कैरेक्टर एरे से UTF-16 अक्षरों की निर्दिष्ट उप-रेंज को स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::TextWriter::Write(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<char_t\>\& | लिखने के लिए अक्षर रखने वाला ऐरे |
| सूचकांक | int32_t | **buffer** में तत्व का 0-आधारित सूचकांक जहाँ लिखने के लिए उप-रेंज शुरू होता है |
| count | int32_t | लिखने के लिए उप-रेंज में अक्षरों की संख्या; -1 यह निर्दिष्ट करता है कि उप-रेंज **buffer** ऐरे के अंत तक समाप्त होता है |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const char_t *) method


निर्दिष्ट c-स्ट्रिंग को स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::TextWriter::Write(const char_t *value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const char_t * | लिखने के लिए c-स्ट्रिंग |

## संबंधित देखें

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const SharedPtr\<Object\>\&) method


निर्दिष्ट ऑब्जेक्ट का स्ट्रिंग प्रतिनिधित्व स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::TextWriter::Write(const SharedPtr<Object> &value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const SharedPtr\<Object\>\& | लिखने के लिए ऑब्जेक्ट |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const String\&, const TArgs\&...) method


निर्दिष्ट मानों को निर्दिष्ट फ़ॉर्मेट के अनुसार फ़ॉर्मेट करके स्ट्रीम में लिखता है।

```cpp
template<class...> void System::IO::TextWriter::Write(const String &format, const TArgs &... args)
```


| पैरामीटर | विवरण |
| --- | --- |
| TArgs | लिखने के लिए मानों के प्रकारों की सूची |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| फ़ॉर्मेट | const String\& | स्ट्रिंग फ़ॉर्मेट |
| args | const TArgs\&... | लिखने के लिए मान |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const String\&) method


निर्दिष्ट स्ट्रिंग को स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::TextWriter::Write(const String &value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | लिखने के लिए स्ट्रिंग |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const TypeInfo\&) method


निर्दिष्ट [TypeInfo](../../../system/typeinfo/) ऑब्जेक्ट का स्ट्रिंग प्रतिनिधित्व स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::TextWriter::Write(const TypeInfo &value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const TypeInfo\& | लिखने के लिए ऑब्जेक्ट |

## संबंधित देखें

* Class [TypeInfo](../../../system/typeinfo/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(Decimal) method


निर्दिष्ट [Decimal](../../../system/decimal/) ऑब्जेक्ट का स्ट्रिंग प्रतिनिधित्व स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::TextWriter::Write(Decimal value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | डेसिमल | लिखने के लिए ऑब्जेक्ट |

## संबंधित देखें

* Class [Decimal](../../../system/decimal/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(double) method


निर्दिष्ट डबल-प्रिसिशन फ्लोटिंग पॉइंट मान का स्ट्रिंग प्रतिनिधित्व स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::TextWriter::Write(double value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | डबल | लिखने के लिए मान |

## संबंधित देखें

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(float) method


निर्दिष्ट सिंगल-प्रिसिशन फ्लोटिंग पॉइंट मान का स्ट्रिंग प्रतिनिधित्व स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::TextWriter::Write(float value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | फ़्लोट | लिखने के लिए मान |

## संबंधित देखें

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(int) method


निर्दिष्ट 32-बिट पूर्णांक मान का स्ट्रिंग प्रतिनिधित्व स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::TextWriter::Write(int value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int | लिखने के लिए मान |

## संबंधित देखें

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(int64_t) method


निर्दिष्ट 64-बिट पूर्णांक मान का स्ट्रिंग प्रतिनिधित्व स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::TextWriter::Write(int64_t value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int64_t | लिखने के लिए मान |

## संबंधित देखें

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(uint32_t) method


निर्दिष्ट अनसाइनड 32-बिट पूर्णांक मान का स्ट्रिंग प्रतिनिधित्व स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::TextWriter::Write(uint32_t value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | uint32_t | लिखने के लिए मान |

## संबंधित देखें

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(uint64_t) method


निर्दिष्ट अनसाइनड 64-बिट पूर्णांक मान का स्ट्रिंग प्रतिनिधित्व स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::TextWriter::Write(uint64_t value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | uint64_t | लिखने के लिए मान |

## संबंधित देखें

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
