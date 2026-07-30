---
title: "System::Text::ICUEncoder::GetBytes metodo"
linktitle: "GetBytes"
second_title: "Aspose.Font per C++"
description: "System::Text::ICUEncoder::GetBytes metodo. Ottieni i byte che risultano dalla codifica di un buffer in C++."
type: docs
weight: 500
url: /it/cpp/system.text/icuencoder/getbytes/
---
## ICUEncoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


Ottieni i byte risultanti dalla codifica di un buffer.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Caratteri da codificare. |
| charIndex | int | Offset dell'array di origine. |
| charCount | int | Lunghezza del sottoarray di origine. |
| byte | ArrayPtr\<uint8_t\> | Buffer di byte di destinazione. |
| byteIndex | int | Offset del buffer di destinazione. |
| flush | bool | Se true, pulisce lo stato interno del codificatore dopo il calcolo. |

### ReturnValue

Numero di byte scritti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


Ottieni i byte risultanti dalla codifica di un buffer.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chars | const char_t * | Caratteri da codificare. |
| charCount | int | Lunghezza dell'array di origine. |
| byte | uint8_t * | Buffer di byte di destinazione. |
| byteCount | int | Dimensione del buffer di destinazione. |
| flush | bool | Se true, pulisce lo stato interno del codificatore dopo il calcolo. |

### ReturnValue

Numero di byte scritti.

## Vedi anche

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
