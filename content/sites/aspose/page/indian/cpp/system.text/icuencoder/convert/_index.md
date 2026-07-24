---
title: "System::Text::ICUEncoder::Convert विधि"
linktitle: "Convert"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::ICUEncoder::Convert विधि. C++ में अक्षरों को बाइट्स में बदलता है।"
type: docs
weight: 300
url: /hi/cpp/system.text/icuencoder/convert/
---
## ICUEncoder::Convert(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) method


अक्षरों को बाइट्स में बदलता है।

```cpp
virtual void System::Text::ICUEncoder::Convert(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | एन्कोड करने के लिए अक्षर। |
| charIndex | int | इनपुट बफ़र ऑफ़सेट। |
| charCount | int | इनपुट बफ़र आकार। |
| बाइट्स | ArrayPtr\<uint8_t\> | गंतव्य बाइट बफ़र। |
| byteIndex | int | गंतव्य एरे ऑफ़सेट। |
| byteCount | int | गंतव्य एरे आकार। |
| flush | bool | यदि सत्य हो, तो गणना के बाद आंतरिक एन्कोडर स्थिति को साफ़ करता है। |
| charsUsed | int\& | पढ़े गए अक्षरों की गिनती संग्रहीत करने वाले चर का संदर्भ। |
| bytesUsed | int\& | लिखे गए बाइट्स की गिनती संग्रहीत करने वाले चर का संदर्भ। |
| completed | bool\& | इनपुट बफ़र समाप्त हो जाने पर सत्य और अन्यथा असत्य सेट करने वाले चर का संदर्भ। |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::Convert(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) method


अक्षरों को बाइट्स में बदलता है।

```cpp
virtual void System::Text::ICUEncoder::Convert(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| chars | const char_t * | एन्कोड करने के लिए अक्षर। |
| charCount | int | इनपुट बफ़र आकार। |
| बाइट्स | uint8_t * | गंतव्य बाइट बफ़र। |
| byteCount | int | गंतव्य एरे आकार। |
| flush | bool | यदि सत्य हो, तो गणना के बाद आंतरिक एन्कोडर स्थिति को साफ़ करता है। |
| charsUsed | int\& | पढ़े गए अक्षरों की गिनती संग्रहीत करने वाले चर का संदर्भ। |
| bytesUsed | int\& | लिखे गए बाइट्स की गिनती संग्रहीत करने वाले चर का संदर्भ। |
| completed | bool\& | इनपुट बफ़र समाप्त हो जाने पर सत्य और अन्यथा असत्य सेट करने वाले चर का संदर्भ। |

## संबंधित देखें

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
