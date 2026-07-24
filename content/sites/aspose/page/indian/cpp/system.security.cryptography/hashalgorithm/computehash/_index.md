---
title: "System::Security::Cryptography::HashAlgorithm::ComputeHash method"
linktitle: "ComputeHash"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::HashAlgorithm::ComputeHash method. C++ में बफ़र को हैश करता है।"
type: docs
weight: 200
url: /hi/cpp/system.security.cryptography/hashalgorithm/computehash/
---
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&) method


बफ़र को हैश करता है।

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<uint8_t\>\& | स्रोत बफ़र। |

### ReturnValue

गणना किया गया हैश मान।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&, int, int) method


बफ़र स्लाइस को हैश करता है।

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer, int offset, int count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<uint8_t\>\& | स्रोत बफ़र। |
| offset | int | स्रोत बफ़र में ऑफ़सेट। |
| count | int | स्रोत बफ़र से उपयोग करने के लिए बाइट्स की संख्या। |

### ReturnValue

गणना किया गया हैश मान।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## HashAlgorithm::ComputeHash(SharedPtr\<IO::Stream\> const\&) method


स्ट्रीम को अंत तक पढ़ता है और पढ़े गए डेटा के लिए हैश की गणना करता है।

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(SharedPtr<IO::Stream> const &inputStream)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inputStream | SharedPtr\<IO::Stream\> const\& | डेटा पढ़ने के लिए स्ट्रीम। |

### ReturnValue

पूरे स्ट्रीम डेटा के लिए गणना किया गया हैश मान।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
