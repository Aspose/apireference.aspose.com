---
title: "System::Text::ICUDecoder::GetCharCount मेथड"
linktitle: "GetCharCount"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::ICUDecoder::GetCharCount मेथड। बफ़र को C++ में डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करता है।"
type: docs
weight: 400
url: /hi/cpp/system.text/icudecoder/getcharcount/
---
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int) method


बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करता है।

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाइट्स | ArrayPtr\<uint8_t\> | डिकोड करने के लिए बाइट्स. |
| index | int | [Buffer](../../../system/buffer/) ऑफ़सेट। |
| count | int | डिकोड करने के लिए बाइट्स की संख्या। |

### ReturnValue

बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int, bool) method


बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करता है।

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count, bool flush)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाइट्स | ArrayPtr\<uint8_t\> | डिकोड करने के लिए बाइट्स. |
| index | int | [Buffer](../../../system/buffer/) ऑफ़सेट। |
| count | int | डिकोड करने के लिए बाइट्स की संख्या। |
| flush | bool | यदि true है, तो गणना के बाद आंतरिक डिकोडर स्थिति को साफ़ करता है। |

### ReturnValue

बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetCharCount(const uint8_t *, int, bool) method


बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करता है।

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(const uint8_t *bytes, int count, bool flush)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाइट्स | const uint8_t * | डिकोड करने के लिए बाइट्स. |
| count | int | डिकोड करने के लिए बाइट्स की संख्या। |
| flush | bool | यदि true है, तो गणना के बाद आंतरिक डिकोडर स्थिति को साफ़ करता है। |

### ReturnValue

बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या।

## संबंधित देखें

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
