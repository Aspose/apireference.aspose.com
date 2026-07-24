---
title: "System::Text::ICUEncoder::GetByteCount विधि"
linktitle: "GetByteCount"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::ICUEncoder::GetByteCount विधि। C++ में बफ़र को एन्कोड करने के लिए आवश्यक बाइट्स की संख्या प्राप्त करता है।"
type: docs
weight: 400
url: /hi/cpp/system.text/icuencoder/getbytecount/
---
## ICUEncoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


बफ़र को एन्कोड करने के लिए आवश्यक बाइट्स की संख्या प्राप्त करता है।

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | एन्कोड करने के लिए अक्षर। |
| index | int | [Buffer](../../../system/buffer/) ऑफ़सेट। |
| count | int | एन्कोड करने के लिए अक्षरों की संख्या। |
| flush | bool | यदि सत्य हो, तो गणना के बाद आंतरिक एन्कोडर स्थिति को साफ़ करता है। |

### ReturnValue

बफ़र को एन्कोड करने के लिए आवश्यक बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::GetByteCount(const char_t *, int, bool) method


बफ़र को एन्कोड करने के लिए आवश्यक बाइट्स की संख्या प्राप्त करता है।

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| chars | const char_t * | एन्कोड करने के लिए अक्षर। |
| count | int | एन्कोड करने के लिए अक्षरों की संख्या। |
| flush | bool | यदि सत्य हो, तो गणना के बाद आंतरिक एन्कोडर स्थिति को साफ़ करता है। |

### ReturnValue

बफ़र को एन्कोड करने के लिए आवश्यक बाइट्स की संख्या।

## संबंधित देखें

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
