---
title: "System::Text::Decoder::Convert विधि"
linktitle: "Convert"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::Decoder::Convert विधि। C++ में बाइट्स को अक्षरों में परिवर्तित करता है।"
type: docs
weight: 100
url: /hi/cpp/system.text/decoder/convert/
---
## Decoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


बाइट्स को अक्षरों में परिवर्तित करता है।

```cpp
virtual void System::Text::Decoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाइट्स | ArrayPtr\<uint8_t\> | डिकोड करने के लिए बाइट्स. |
| byteIndex | int | इनपुट बफ़र ऑफ़सेट। |
| byteCount | int | इनपुट बफ़र आकार। |
| chars | ArrayPtr\<char_t\> | गंतव्य कैरेक्टर बफ़र। |
| charIndex | int | गंतव्य एरे ऑफ़सेट। |
| charCount | int | गंतव्य एरे आकार। |
| flush | bool | यदि true है, तो गणना के बाद आंतरिक डिकोडर स्थिति को साफ़ करता है। |
| bytesUsed | int\& | पढ़े गए बाइट्स की गिनती संग्रहीत करने के लिए वेरिएबल का रेफ़रेंस। |
| charsUsed | int\& | लिखे गए कैरेक्टर की गिनती संग्रहीत करने के लिए वेरिएबल का रेफ़रेंस। |
| completed | bool\& | इनपुट बफ़र समाप्त हो जाने पर सत्य और अन्यथा असत्य सेट करने वाले चर का संदर्भ। |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


बाइट्स को अक्षरों में परिवर्तित करता है।

```cpp
virtual void System::Text::Decoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाइट्स | const uint8_t * | डिकोड करने के लिए बाइट्स. |
| byteCount | int | इनपुट बफ़र आकार। |
| chars | char_t * | गंतव्य कैरेक्टर बफ़र। |
| charCount | int | गंतव्य एरे आकार। |
| flush | bool | यदि true है, तो गणना के बाद आंतरिक डिकोडर स्थिति को साफ़ करता है। |
| bytesUsed | int\& | पढ़े गए बाइट्स की गिनती संग्रहीत करने के लिए वेरिएबल का रेफ़रेंस। |
| charsUsed | int\& | लिखे गए कैरेक्टर की गिनती संग्रहीत करने के लिए वेरिएबल का रेफ़रेंस। |
| completed | bool\& | इनपुट बफ़र समाप्त हो जाने पर सत्य और अन्यथा असत्य सेट करने वाले चर का संदर्भ। |

## संबंधित देखें

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
