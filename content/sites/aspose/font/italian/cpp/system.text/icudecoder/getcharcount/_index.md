---
title: "Metodo System::Text::ICUDecoder::GetCharCount"
linktitle: "GetCharCount"
second_title: "Aspose.Font per C++"
description: "Metodo System::Text::ICUDecoder::GetCharCount. Restituisce il numero di caratteri necessari per decodificare un buffer in C++."
type: docs
weight: 400
url: /it/cpp/system.text/icudecoder/getcharcount/
---
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int) method


Restituisce il numero di caratteri necessari per decodificare un buffer.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| byte | ArrayPtr\<uint8_t\> | Byte da decodificare. |
| index | int | Offset di [Buffer](../../../system/buffer/). |
| count | int | Numero di byte da decodificare. |

### ReturnValue

Numero di caratteri richiesti per decodificare il buffer.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int, bool) method


Restituisce il numero di caratteri necessari per decodificare un buffer.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count, bool flush)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| byte | ArrayPtr\<uint8_t\> | Byte da decodificare. |
| index | int | Offset di [Buffer](../../../system/buffer/). |
| count | int | Numero di byte da decodificare. |
| flush | bool | Se vero, pulisce lo stato interno del decodificatore dopo il calcolo. |

### ReturnValue

Numero di caratteri richiesti per decodificare il buffer.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetCharCount(const uint8_t *, int, bool) method


Restituisce il numero di caratteri necessari per decodificare un buffer.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(const uint8_t *bytes, int count, bool flush)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| byte | const uint8_t * | Byte da decodificare. |
| count | int | Numero di byte da decodificare. |
| flush | bool | Se vero, pulisce lo stato interno del decodificatore dopo il calcolo. |

### ReturnValue

Numero di caratteri richiesti per decodificare il buffer.

## Vedi anche

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
