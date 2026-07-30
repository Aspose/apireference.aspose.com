---
title: "Metodo System::Text::ICUEncoding::GetChars"
linktitle: "GetChars"
second_title: "Aspose.Font per C++"
description: "Metodo System::Text::ICUEncoding::GetChars. Ottieni i caratteri risultanti dalla decodifica di un buffer di byte in C++."
type: docs
weight: 500
url: /it/cpp/system.text/icuencoding/getchars/
---
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>) method


Ottieni i caratteri risultanti dalla decodifica di un buffer di byte.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) da cui leggere i byte. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Ottieni i caratteri risultanti dalla decodifica di un buffer di byte.

```cpp
virtual int System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) da cui leggere i byte. |
| byte_index | int | Offset del buffer di input. |
| byte_count | int | Dimensione del buffer di input. |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/) per inserire i caratteri. |
| char_index | int | Offset del buffer di output. |

### ReturnValue

Numero di caratteri scritti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


Ottieni i caratteri risultanti dalla decodifica di un buffer di byte.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) da cui leggere i byte. |
| indice | int | Offset del buffer di input. |
| count | int | Dimensione del buffer di input. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetChars(const uint8_t *, int, char_t *, int) method


Ottieni i caratteri risultanti dalla decodifica di un buffer di byte.

```cpp
int System::Text::ICUEncoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/) da cui leggere i byte. |
| byte_count | int | Dimensione del buffer di input. |
| chars | char_t * | [Buffer](../../../system/buffer/) per inserire i caratteri. |
| char_count | int | Dimensione del buffer di output. |

### ReturnValue

Numero di caratteri scritti.

## Vedi anche

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
