---
title: "System::Text::Encoder::GetByteCount metodo"
linktitle: "GetByteCount"
second_title: "Aspose.Font per C++"
description: "System::Text::Encoder::GetByteCount metodo. Ottiene il numero di byte necessari per codificare un buffer in C++."
type: docs
weight: 400
url: /it/cpp/system.text/encoder/getbytecount/
---
## Encoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


Restituisce il numero di byte necessari per codificare un buffer.

```cpp
virtual int System::Text::Encoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Caratteri da codificare. |
| index | int | Offset di [Buffer](../../../system/buffer/). |
| count | int | Numero di caratteri da codificare. |
| flush | bool | Se true, pulisce lo stato interno del codificatore dopo il calcolo. |

### ReturnValue

Numero di byte richiesti per codificare il buffer.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoder::GetByteCount(const char_t *, int, bool) method


Restituisce il numero di byte necessari per codificare un buffer.

```cpp
virtual int System::Text::Encoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chars | const char_t * | Caratteri da codificare. |
| count | int | Numero di caratteri da codificare. |
| flush | bool | Se true, pulisce lo stato interno del codificatore dopo il calcolo. |

### ReturnValue

Numero di byte richiesti per codificare il buffer.

## Vedi anche

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
