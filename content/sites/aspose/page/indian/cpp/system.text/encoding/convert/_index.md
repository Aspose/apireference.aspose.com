---
title: "System::Text::Encoding::Convert मेथड"
linktitle: "Convert"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::Encoding::Convert मेथड। C++ में दो एन्कोडिंग्स के बीच बाइट्स को परिवर्तित करता है।"
type: docs
weight: 3000
url: /hi/cpp/system.text/encoding/convert/
---
## Encoding::Convert(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) method


दो एन्कोडिंग्स के बीच बाइट्स को परिवर्तित करता है।

```cpp
static ArrayPtr<uint8_t> System::Text::Encoding::Convert(const EncodingPtr &src_encoding, const EncodingPtr &dst_encoding, const ArrayPtr<uint8_t> &bytes)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| src_encoding | const EncodingPtr\& | स्रोत एन्कोडिंग। |
| dst_encoding | const EncodingPtr\& | गंतव्य एन्कोडिंग। |
| बाइट्स | const ArrayPtr\<uint8_t\>\& | परिवर्तित करने के लिए बाइट्स। |

### ReturnValue

परिवर्तित बाइट्स।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::Convert(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) method


दो एन्कोडिंग्स के बीच बाइट्स को परिवर्तित करता है।

```cpp
static ArrayPtr<uint8_t> System::Text::Encoding::Convert(const EncodingPtr &src_encoding, const EncodingPtr &dst_encoding, const ArrayPtr<uint8_t> &bytes, int index, int count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| src_encoding | const EncodingPtr\& | स्रोत एन्कोडिंग। |
| dst_encoding | const EncodingPtr\& | गंतव्य एन्कोडिंग। |
| बाइट्स | const ArrayPtr\<uint8_t\>\& | परिवर्तित करने के लिए बाइट्स। |
| सूचकांक | int | स्लाइस की शुरुआत. |
| count | int | स्लाइस का आकार। |

### ReturnValue

परिवर्तित बाइट्स।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
