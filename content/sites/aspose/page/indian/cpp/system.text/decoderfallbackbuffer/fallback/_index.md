---
title: "System::Text::DecoderFallbackBuffer::Fallback मेथड"
linktitle: "Fallback"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::DecoderFallbackBuffer::Fallback मेथड। C++ में वास्तविक फॉलबैक प्रक्रिया को लागू करता है।"
type: docs
weight: 100
url: /hi/cpp/system.text/decoderfallbackbuffer/fallback/
---
## DecoderFallbackBuffer::Fallback method


वास्तविक फॉलबैक प्रक्रिया को लागू करता है।

```cpp
virtual bool System::Text::DecoderFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) बाइट्स का, जिसमें वह बाइट भी शामिल है जिसे डिकोडर डिकोड करने में विफल रहता है। |
| सूचकांक | int | त्रुटि उत्पन्न करने वाले बाइट का इंडेक्स। |

### ReturnValue

यदि बफ़र अज्ञात बाइट्स को प्रोसेस करता है तो true, यदि वह उन्हें अनदेखा करता है तो false।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
