---
title: "System::Text::ICUDecoder::GetCharCount metod"
linktitle: "GetCharCount"
second_title: "Aspose.Page för C++"
description: "System::Text::ICUDecoder::GetCharCount metod. Hämtar antalet tecken som behövs för att avkoda en buffert i C++."
type: docs
weight: 400
url: /sv/cpp/system.text/icudecoder/getcharcount/
---
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int) method


Hämtar antalet tecken som behövs för att avkoda en buffert.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Byte att avkoda. |
| index | int | [Buffer](../../../system/buffer/) förskjutning. |
| count | int | Antal byte att avkoda. |

### ReturnValue

Antal tecken som krävs för att avkoda bufferten.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int, bool) method


Hämtar antalet tecken som behövs för att avkoda en buffert.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count, bool flush)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Byte att avkoda. |
| index | int | [Buffer](../../../system/buffer/) förskjutning. |
| count | int | Antal byte att avkoda. |
| flush | bool | Om sant, rensar det interna avkodartillståndet efter beräkning. |

### ReturnValue

Antal tecken som krävs för att avkoda bufferten.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetCharCount(const uint8_t *, int, bool) method


Hämtar antalet tecken som behövs för att avkoda en buffert.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(const uint8_t *bytes, int count, bool flush)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| bytes | const uint8_t * | Byte att avkoda. |
| count | int | Antal byte att avkoda. |
| flush | bool | Om sant, rensar det interna avkodartillståndet efter beräkning. |

### ReturnValue

Antal tecken som krävs för att avkoda bufferten.

## Se även

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
