---
title: "System::Text::Encoding::GetBytes मेथड"
linktitle: "GetBytes"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::Encoding::GetBytes मेथड। C++ में एक अक्षर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करता है।"
type: docs
weight: 1800
url: /hi/cpp/system.text/encoding/getbytes/
---
## Encoding::GetBytes(ArrayPtr\<char_t\>) method


एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें।

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | एन्कोड करने के लिए अक्षर। |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) method


एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें।

```cpp
virtual int System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | एन्कोड करने के लिए अक्षर। |
| char_index | int | अक्षर स्लाइस की शुरुआत। |
| char_count | int | परिवर्तित करने के लिए अक्षरों की संख्या। |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) में अक्षर रखने के लिए। |
| byte_index | int | आउटपुट बफ़र ऑफ़सेट। |

### ReturnValue

लिखे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(ArrayPtr\<char_t\>, int, int) method


एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें।

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int index, int count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | एन्कोड करने के लिए अक्षर। |
| सूचकांक | int | अक्षर स्लाइस की शुरुआत। |
| count | int | परिवर्तित करने के लिए अक्षरों की संख्या। |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(const char_t *, int, uint8_t *, int) method


एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें।

```cpp
virtual int System::Text::Encoding::GetBytes(const char_t *chars, int char_count, uint8_t *bytes, int byte_count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| chars | const char_t * | एन्कोड करने के लिए अक्षर। |
| char_count | int | परिवर्तित करने के लिए अक्षरों की संख्या। |
| bytes | uint8_t * | [Buffer](../../../system/buffer/) में अक्षर रखने के लिए। |
| byte_count | int | आउटपुट बफ़र का आकार। |

### ReturnValue

लिखे गए बाइट्स की संख्या।

## संबंधित देखें

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(const String\&) method


एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें।

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const String &s)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) को एन्कोड करने के लिए। |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(const String\&, int, int, ArrayPtr\<uint8_t\>, int) method


एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें।

```cpp
virtual int System::Text::Encoding::GetBytes(const String &s, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) को एन्कोड करने के लिए। |
| char_index | int | अक्षर स्लाइस की शुरुआत। |
| char_count | int | परिवर्तित करने के लिए अक्षरों की संख्या। |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) में अक्षर रखने के लिए। |
| byte_index | int | आउटपुट बफ़र ऑफ़सेट। |

### ReturnValue

लिखे गए बाइट्स की संख्या।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(const System::Details::ArrayView\<char_t\>\&, int, int) method


एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें।

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::ArrayView<char_t> &chars, int index, int count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| chars | const System::Details::ArrayView\<char_t\>\& | एन्कोड करने के लिए अक्षर। |
| सूचकांक | int | अक्षर स्लाइस की शुरुआत। |
| count | int | परिवर्तित करने के लिए अक्षरों की संख्या। |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(const System::Details::StackArray\<char_t, N\>\&, int, int) method


एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें।

```cpp
template<std::size_t> ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::StackArray<char_t, N> &chars, int index, int count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| chars | const System::Details::StackArray\<char_t, N\>\& | एन्कोड करने के लिए अक्षर। |
| सूचकांक | int | अक्षर स्लाइस की शुरुआत। |
| count | int | परिवर्तित करने के लिए अक्षरों की संख्या। |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) method


एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें।

```cpp
virtual int System::Text::Encoding::GetBytes(System::Details::ArrayView<char_t> chars, int char_index, int char_count, System::Details::ArrayView<uint8_t> bytes, int byte_index)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| chars | System::Details::ArrayView\<char_t\> | एन्कोड करने के लिए अक्षर। |
| char_index | int | अक्षर स्लाइस की शुरुआत। |
| char_count | int | परिवर्तित करने के लिए अक्षरों की संख्या। |
| bytes | System::Details::ArrayView\<uint8_t\> | [Buffer](../../../system/buffer/) में अक्षर रखने के लिए। |
| byte_index | int | आउटपुट बफ़र ऑफ़सेट। |

### ReturnValue

लिखे गए बाइट्स की संख्या।

## संबंधित देखें

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) method


एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें।

```cpp
template<std::size_t,std::size_t> int System::Text::Encoding::GetBytes(System::Details::StackArray<char_t, SC> &chars, int char_index, int char_count, System::Details::StackArray<uint8_t, SB> &bytes, int byte_index)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| chars | System::Details::StackArray\<char_t, SC\>\& | एन्कोड करने के लिए अक्षर। |
| char_index | int | अक्षर स्लाइस की शुरुआत। |
| char_count | int | परिवर्तित करने के लिए अक्षरों की संख्या। |
| bytes | System::Details::StackArray\<uint8_t, SB\>\& | [Buffer](../../../system/buffer/) में अक्षर रखने के लिए। |
| byte_index | int | आउटपुट बफ़र ऑफ़सेट। |

### ReturnValue

लिखे गए बाइट्स की संख्या।

## संबंधित देखें

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
