---
title: "System::Text::ICUEncoder::GetBytes विधि"
linktitle: "GetBytes"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::ICUEncoder::GetBytes विधि. C++ में बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें।"
type: docs
weight: 500
url: /hi/cpp/system.text/icuencoder/getbytes/
---
## ICUEncoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें।

```cpp
virtual int System::Text::ICUEncoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | एन्कोड करने के लिए अक्षर। |
| charIndex | int | स्रोत एरे ऑफ़सेट। |
| charCount | int | स्रोत सबएरे की लंबाई। |
| बाइट्स | ArrayPtr\<uint8_t\> | गंतव्य बाइट बफ़र। |
| byteIndex | int | गंतव्य बफ़र ऑफ़सेट। |
| flush | bool | यदि सत्य हो, तो गणना के बाद आंतरिक एन्कोडर स्थिति को साफ़ करता है। |

### ReturnValue

लिखे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें।

```cpp
virtual int System::Text::ICUEncoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| chars | const char_t * | एन्कोड करने के लिए अक्षर। |
| charCount | int | स्रोत एरे की लंबाई। |
| बाइट्स | uint8_t * | गंतव्य बाइट बफ़र। |
| byteCount | int | गंतव्य बफ़र आकार। |
| flush | bool | यदि सत्य हो, तो गणना के बाद आंतरिक एन्कोडर स्थिति को साफ़ करता है। |

### ReturnValue

लिखे गए बाइट्स की संख्या।

## संबंधित देखें

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
