---
title: "System::Text::EncodingEncoder::Convert metodo"
linktitle: "Convert"
second_title: "Aspose.Font per C++"
description: "System::Text::EncodingEncoder::Convert metodo. Converte i caratteri in byte in C++."
type: docs
weight: 100
url: /it/cpp/system.text/encodingencoder/convert/
---
## EncodingEncoder::Convert(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) method


Converte i caratteri in byte.

```cpp
virtual void System::Text::EncodingEncoder::Convert(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Caratteri da codificare. |
| charIndex | int | Offset del buffer di input. |
| charCount | int | Dimensione del buffer di input. |
| byte | ArrayPtr\<uint8_t\> | Buffer di byte di destinazione. |
| byteIndex | int | Offset dell'array di destinazione. |
| byteCount | int | Dimensione dell'array di destinazione. |
| flush | bool | Se true, pulisce lo stato interno del codificatore dopo il calcolo. |
| charsUsed | int\& | Riferimento a una variabile per memorizzare il conteggio dei caratteri letti. |
| bytesUsed | int\& | Riferimento a una variabile per memorizzare il conteggio dei byte scritti. |
| completed | bool\& | Riferimento a una variabile da impostare a true se il buffer di input è stato esaurito e a false altrimenti. |

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [EncodingEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncodingEncoder::Convert(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) method


Converte i caratteri in byte.

```cpp
virtual void System::Text::EncodingEncoder::Convert(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chars | const char_t * | Caratteri da codificare. |
| charCount | int | Dimensione del buffer di input. |
| byte | uint8_t * | Buffer di byte di destinazione. |
| byteCount | int | Dimensione dell'array di destinazione. |
| flush | bool | Se true, pulisce lo stato interno del codificatore dopo il calcolo. |
| charsUsed | int\& | Riferimento a una variabile per memorizzare il conteggio dei caratteri letti. |
| bytesUsed | int\& | Riferimento a una variabile per memorizzare il conteggio dei byte scritti. |
| completed | bool\& | Riferimento a una variabile da impostare a true se il buffer di input è stato esaurito e a false altrimenti. |

## Vedi anche

* Class [EncodingEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
