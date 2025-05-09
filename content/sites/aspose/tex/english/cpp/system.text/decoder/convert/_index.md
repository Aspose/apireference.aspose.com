---
title: System::Text::Decoder::Convert method
linktitle: Convert
second_title: Aspose.TeX for C++
description: 'System::Text::Decoder::Convert method. Converts bytes to characters in C++.'
type: docs
weight: 100
url: /cpp/system.text/decoder/convert/
---
## Decoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


Converts bytes to characters.

```cpp
virtual void System::Text::Decoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Parameter | Type | Description |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Bytes to decode. |
| byteIndex | int | Input buffer offset. |
| byteCount | int | Input buffer size. |
| chars | ArrayPtr\<char_t\> | Destination character buffer. |
| charIndex | int | Destination array offset. |
| charCount | int | Destination array size. |
| flush | bool | If true, cleans internal decoder state after calculation. |
| bytesUsed | int\& | Reference to variable to store count of bytes read. |
| charsUsed | int\& | Reference to variable to store count of characters written. |
| completed | bool\& | Reference to variable to be set to true if input buffer was exhausted and to false otherwise. |

## See Also

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.TeX for C++](../../../)
## Decoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


Converts bytes to characters.

```cpp
virtual void System::Text::Decoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Parameter | Type | Description |
| --- | --- | --- |
| bytes | const uint8_t * | Bytes to decode. |
| byteCount | int | Input buffer size. |
| chars | char_t * | Destination character buffer. |
| charCount | int | Destination array size. |
| flush | bool | If true, cleans internal decoder state after calculation. |
| bytesUsed | int\& | Reference to variable to store count of bytes read. |
| charsUsed | int\& | Reference to variable to store count of characters written. |
| completed | bool\& | Reference to variable to be set to true if input buffer was exhausted and to false otherwise. |

## See Also

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.TeX for C++](../../../)
