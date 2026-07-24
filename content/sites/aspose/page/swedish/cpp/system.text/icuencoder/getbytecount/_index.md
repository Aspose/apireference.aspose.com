---
title: "System::Text::ICUEncoder::GetByteCount metod"
linktitle: "GetByteCount"
second_title: "Aspose.Page för C++"
description: "System::Text::ICUEncoder::GetByteCount metod. Hämtar antalet byte som behövs för att koda en buffert i C++."
type: docs
weight: 400
url: /sv/cpp/system.text/icuencoder/getbytecount/
---
## ICUEncoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


Hämtar antalet byte som behövs för att koda en buffert.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Tecken att koda. |
| index | int | [Buffer](../../../system/buffer/) förskjutning. |
| count | int | Antal tecken att koda. |
| flush | bool | Om true, rensar det interna kodarens tillstånd efter beräkning. |

### ReturnValue

Antal byte som krävs för att koda bufferten.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::GetByteCount(const char_t *, int, bool) method


Hämtar antalet byte som behövs för att koda en buffert.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| chars | const char_t * | Tecken att koda. |
| count | int | Antal tecken att koda. |
| flush | bool | Om true, rensar det interna kodarens tillstånd efter beräkning. |

### ReturnValue

Antal byte som krävs för att koda bufferten.

## Se även

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
