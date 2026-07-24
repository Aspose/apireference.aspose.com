---
title: "System::Text::UTF7Encoding::GetChars विधि"
linktitle: "GetChars"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::UTF7Encoding::GetChars विधि। C++ में बाइट बफ़र को डिकोड करने से प्राप्त अक्षरों को प्राप्त करता है।"
type: docs
weight: 700
url: /hi/cpp/system.text/utf7encoding/getchars/
---
## UTF7Encoding::GetChars(ArrayPtr\<uint8_t\>) method


एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें।

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) से बाइट पढ़ने के लिये। |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें।

```cpp
int System::Text::UTF7Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) से बाइट पढ़ने के लिये। |
| byte_index | int | इनपुट बफ़र ऑफ़सेट। |
| byte_count | int | इनपुट बफ़र आकार। |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/) में अक्षर रखने के लिए। |
| char_index | int | आउटपुट बफ़र ऑफ़सेट। |

### ReturnValue

लिखे गए अक्षरों की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें।

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) से बाइट पढ़ने के लिये। |
| सूचकांक | int | इनपुट बफ़र ऑफ़सेट। |
| count | int | इनपुट बफ़र आकार। |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetChars(const uint8_t *, int, char_t *, int) method


एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें।

```cpp
int System::Text::UTF7Encoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/) से बाइट पढ़ने के लिये। |
| byte_count | int | इनपुट बफ़र आकार। |
| chars | char_t * | [Buffer](../../../system/buffer/) में अक्षर रखने के लिए। |
| char_count | int | आउटपुट बफ़र का आकार। |

### ReturnValue

लिखे गए अक्षरों की संख्या।

## संबंधित देखें

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
