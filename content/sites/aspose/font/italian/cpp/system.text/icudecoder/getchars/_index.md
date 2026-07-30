---
title: "Metodo System::Text::ICUDecoder::GetChars"
linktitle: "GetChars"
second_title: "Aspose.Font per C++"
description: "Metodo System::Text::ICUDecoder::GetChars. Ottiene i caratteri risultanti dalla decodifica di un buffer in C++."
type: docs
weight: 500
url: /it/cpp/system.text/icudecoder/getchars/
---
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Ottieni i caratteri risultanti dalla decodifica di un buffer.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| byte | ArrayPtr\<uint8_t\> | Byte da decodificare. |
| byteIndex | int | Offset del buffer di input. |
| byteCount | int | Dimensione del buffer di input. |
| chars | ArrayPtr\<char_t\> | Buffer di caratteri di destinazione. |
| charIndex | int | Offset dell'array di destinazione. |

### ReturnValue

Numero di caratteri scritti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


Ottieni i caratteri risultanti dalla decodifica di un buffer.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| byte | ArrayPtr\<uint8_t\> | Byte da decodificare. |
| byteIndex | int | Offset del buffer di input. |
| byteCount | int | Dimensione del buffer di input. |
| chars | ArrayPtr\<char_t\> | Buffer di caratteri di destinazione. |
| charIndex | int | Offset dell'array di destinazione. |
| flush | bool | Se vero, pulisce lo stato interno del decodificatore dopo il calcolo. |

### ReturnValue

Numero di caratteri scritti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


Ottieni i caratteri risultanti dalla decodifica di un buffer.

```cpp
virtual int System::Text::ICUDecoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| byte | const uint8_t * | Byte da decodificare. |
| byteCount | int | Dimensione del buffer di input. |
| chars | char_t * | Buffer di caratteri di destinazione. |
| charCount | int | Dimensione dell'array di destinazione. |
| flush | bool | Se vero, pulisce lo stato interno del decodificatore dopo il calcolo. |

### ReturnValue

Numero di caratteri scritti.

## Vedi anche

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
