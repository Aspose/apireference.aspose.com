---
title: "System::Text::ICUDecoder::GetChars मेथड"
linktitle: "GetChars"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::ICUDecoder::GetChars मेथड। C++ में बफ़र को डिकोड करने से प्राप्त होने वाले अक्षरों को प्राप्त करें।"
type: docs
weight: 500
url: /hi/cpp/system.text/icudecoder/getchars/
---
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


बफ़र को डिकोड करने से प्राप्त होने वाले अक्षर प्राप्त करें।

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाइट्स | ArrayPtr\<uint8_t\> | डिकोड करने के लिए बाइट्स. |
| byteIndex | int | इनपुट बफ़र ऑफ़सेट। |
| byteCount | int | इनपुट बफ़र आकार। |
| chars | ArrayPtr\<char_t\> | गंतव्य कैरेक्टर बफ़र। |
| charIndex | int | गंतव्य एरे ऑफ़सेट। |

### ReturnValue

लिखे गए अक्षरों की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


बफ़र को डिकोड करने से प्राप्त होने वाले अक्षर प्राप्त करें।

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाइट्स | ArrayPtr\<uint8_t\> | डिकोड करने के लिए बाइट्स. |
| byteIndex | int | इनपुट बफ़र ऑफ़सेट। |
| byteCount | int | इनपुट बफ़र आकार। |
| chars | ArrayPtr\<char_t\> | गंतव्य कैरेक्टर बफ़र। |
| charIndex | int | गंतव्य एरे ऑफ़सेट। |
| flush | bool | यदि true है, तो गणना के बाद आंतरिक डिकोडर स्थिति को साफ़ करता है। |

### ReturnValue

लिखे गए अक्षरों की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


बफ़र को डिकोड करने से प्राप्त होने वाले अक्षर प्राप्त करें।

```cpp
virtual int System::Text::ICUDecoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाइट्स | const uint8_t * | डिकोड करने के लिए बाइट्स. |
| byteCount | int | इनपुट बफ़र आकार। |
| chars | char_t * | गंतव्य कैरेक्टर बफ़र। |
| charCount | int | गंतव्य एरे आकार। |
| flush | bool | यदि true है, तो गणना के बाद आंतरिक डिकोडर स्थिति को साफ़ करता है। |

### ReturnValue

लिखे गए अक्षरों की संख्या।

## संबंधित देखें

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
