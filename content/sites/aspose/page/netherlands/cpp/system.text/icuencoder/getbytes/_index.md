---
title: "System::Text::ICUEncoder::GetBytes-methode"
linktitle: "GetBytes"
second_title: "Aspose.Page voor C++"
description: "System::Text::ICUEncoder::GetBytes-methode. Haalt de bytes op die voortkomen uit het coderen van een buffer in C++."
type: docs
weight: 500
url: /nl/cpp/system.text/icuencoder/getbytes/
---
## ICUEncoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


Haalt de bytes op die ontstaan bij het coderen van een buffer.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekens | ArrayPtr\<char_t\> | Tekens om te coderen. |
| charIndex | int | Bronarrayverschuiving. |
| charCount | int | Lengte van bron-subarray. |
| bytes | ArrayPtr\<uint8_t\> | Doel-bytebuffer. |
| byteIndex | int | Offset van bestemmingsbuffer. |
| flush | bool | Indien true, wordt de interne encoderstatus na de berekening opgeschoond. |

### ReturnValue

Aantal geschreven bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


Haalt de bytes op die ontstaan bij het coderen van een buffer.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekens | const char_t * | Tekens om te coderen. |
| charCount | int | Lengte van bronarray. |
| bytes | uint8_t * | Doel-bytebuffer. |
| byteCount | int | Grootte van bestemmingsbuffer. |
| flush | bool | Indien true, wordt de interne encoderstatus na de berekening opgeschoond. |

### ReturnValue

Aantal geschreven bytes.

## Zie ook

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
