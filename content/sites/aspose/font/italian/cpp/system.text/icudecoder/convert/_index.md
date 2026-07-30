---
title: "Metodo System::Text::ICUDecoder::Convert"
linktitle: "Convert"
second_title: "Aspose.Font per C++"
description: "Metodo System::Text::ICUDecoder::Convert. Converte byte in caratteri in C++."
type: docs
weight: 300
url: /it/cpp/system.text/icudecoder/convert/
---
## ICUDecoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


Converte i byte in caratteri.

```cpp
virtual void System::Text::ICUDecoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| byte | ArrayPtr\<uint8_t\> | Byte da decodificare. |
| byteIndex | int | Offset del buffer di input. |
| byteCount | int | Dimensione del buffer di input. |
| chars | ArrayPtr\<char_t\> | Buffer di caratteri di destinazione. |
| charIndex | int | Offset dell'array di destinazione. |
| charCount | int | Dimensione dell'array di destinazione. |
| flush | bool | Se vero, pulisce lo stato interno del decodificatore dopo il calcolo. |
| bytesUsed | int\& | Riferimento a una variabile per memorizzare il conteggio dei byte letti. |
| charsUsed | int\& | Riferimento a una variabile per memorizzare il conteggio dei caratteri scritti. |
| completed | bool\& | Riferimento a una variabile da impostare a true se il buffer di input è stato esaurito e a false altrimenti. |

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


Converte i byte in caratteri.

```cpp
virtual void System::Text::ICUDecoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| byte | const uint8_t * | Byte da decodificare. |
| byteCount | int | Dimensione del buffer di input. |
| chars | char_t * | Buffer di caratteri di destinazione. |
| charCount | int | Dimensione dell'array di destinazione. |
| flush | bool | Se vero, pulisce lo stato interno del decodificatore dopo il calcolo. |
| bytesUsed | int\& | Riferimento a una variabile per memorizzare il conteggio dei byte letti. |
| charsUsed | int\& | Riferimento a una variabile per memorizzare il conteggio dei caratteri scritti. |
| completed | bool\& | Riferimento a una variabile da impostare a true se il buffer di input è stato esaurito e a false altrimenti. |

## Vedi anche

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
