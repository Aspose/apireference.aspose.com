---
title: "System::IO::BinaryWriter::Write मेथड"
linktitle: "Write"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::BinaryWriter::Write मेथड। आउटपुट स्ट्रीम में एकल बाइट लिखता है जिसका मान 0 होता है यदि मान ''true'' है और 1 यदि मान ''false'' है, C++ में।"
type: docs
weight: 800
url: /hi/cpp/system.io/binarywriter/write/
---
## BinaryWriter::Write(bool) method


यदि **value** 'true' है तो मान 0 और यदि **value** 'false' है तो मान 1 के साथ एक बाइट को आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(bool value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | bool | आउटपुट स्ट्रीम में लिखने के लिए बाइट मान निर्दिष्ट करने वाला बूलियन मान |

## संबंधित देखें

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(char16_t) method


निर्दिष्ट 16-बिट विस्तृत कैरेक्टर मान को आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(char16_t value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | char16_t | लिखने के लिए मान |

## संबंधित देखें

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const ArrayPtr\<char_t\>\&, int, int) method


निर्दिष्ट कैरेक्टर एरे से निर्दिष्ट UTF-16 कैरेक्टर्स की उप-रेंज को आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(const ArrayPtr<char_t> &buffer, int index=0, int count=-1)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<char_t\>\& | लिखने के लिए अक्षर रखने वाला ऐरे |
| सूचकांक | int | **buffer** में तत्व का 0-आधारित सूचकांक जहाँ लिखने के लिए उप-रेंज शुरू होता है |
| count | int | लिखने के लिए उप-रेंज में अक्षरों की संख्या; -1 यह निर्दिष्ट करता है कि उप-रेंज **buffer** ऐरे के अंत तक समाप्त होता है |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const ArrayPtr\<uint8_t\>\&, int, int) method


निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-रेंज को आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(const ArrayPtr<uint8_t> &buffer, int index=0, int count=-1)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<uint8_t\>\& | बाइट्स को लिखने वाली एरे। |
| सूचकांक | int | **buffer** में तत्व का 0-आधारित सूचकांक जहाँ लिखने के लिए उप-रेंज शुरू होता है |
| count | int | लिखने के लिए उप-रेंज में तत्वों की संख्या; -1 यह निर्दिष्ट करता है कि उप-रेंज **buffer** एरे के अंत तक समाप्त होती है |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const char_t *) method


वर्तमान एन्कोडिंग में लंबाई-प्रिफ़िक्स्ड स्ट्रिंग को आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(const char_t *value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const char_t * | लिखने के लिए c-स्ट्रिंग |

## संबंधित देखें

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const Decimal\&) method


निर्दिष्ट [Decimal](../../../system/decimal/) मान का बाइट प्रतिनिधित्व आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(const Decimal &value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const Decimal\& | लिखने के लिए मान |

## संबंधित देखें

* Class [Decimal](../../../system/decimal/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const String\&) method


वर्तमान एन्कोडिंग में लंबाई-प्रिफ़िक्स्ड स्ट्रिंग को आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(const String &value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | लिखने के लिए स्ट्रिंग |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(double) method


निर्दिष्ट डबल-प्रिसीजन फ्लोटिंग पॉइंट मान को आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(double value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | डबल | लिखने के लिए मान |

## संबंधित देखें

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(float) method


निर्दिष्ट सिंगल-प्रिसीजन फ्लोटिंग पॉइंट मान को आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(float value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | फ़्लोट | लिखने के लिए मान |

## संबंधित देखें

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(int) method


निर्दिष्ट 32-बिट पूर्णांक मान को आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(int value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int | लिखने के लिए मान |

## संबंधित देखें

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(int16_t) method


निर्दिष्ट 16-बिट पूर्णांक मान को आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(int16_t value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int16_t | लिखने के लिए मान |

## संबंधित देखें

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(int64_t) method


निर्दिष्ट 64-बिट पूर्णांक मान को आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(int64_t value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int64_t | लिखने के लिए मान |

## संबंधित देखें

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint16_t) method


निर्दिष्ट अनसाइन्ड 16-बिट पूर्णांक मान को आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(uint16_t value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | uint16_t | लिखने के लिए मान |

## संबंधित देखें

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint32_t) method


निर्दिष्ट अनसाइन्ड 32-बिट पूर्णांक मान को आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(uint32_t value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | uint32_t | लिखने के लिए मान |

## संबंधित देखें

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint64_t) method


निर्दिष्ट अनसाइन्ड 64-बिट पूर्णांक मान को आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(uint64_t value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | uint64_t | लिखने के लिए मान |

## संबंधित देखें

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint8_t) method


निर्दिष्ट अनसाइन्ड 8-बिट पूर्णांक मान को आउटपुट स्ट्रीम में लिखता है।

```cpp
virtual void System::IO::BinaryWriter::Write(uint8_t value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | uint8_t | लिखने के लिए मान |

## संबंधित देखें

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
