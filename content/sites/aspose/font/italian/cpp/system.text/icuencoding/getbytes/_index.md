---
title: "System::Text::ICUEncoding::GetBytes metodo"
linktitle: "GetBytes"
second_title: "Aspose.Font per C++"
description: "System::Text::ICUEncoding::GetBytes metodo. Ottiene i byte risultanti dalla codifica di un buffer di caratteri in C++."
type: docs
weight: 300
url: /it/cpp/system.text/icuencoding/getbytes/
---
## ICUEncoding::GetBytes(ArrayPtr\<char_t\>) method


Ottieni i byte risultanti dalla codifica di un buffer di caratteri.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Caratteri da codificare. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) method


Ottieni i byte risultanti dalla codifica di un buffer di caratteri.

```cpp
virtual int System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Caratteri da codificare. |
| char_index | int | Inizio della porzione di carattere. |
| char_count | int | Numero di caratteri da convertire. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) per inserire i caratteri. |
| byte_index | int | Offset del buffer di output. |

### ReturnValue

Numero di byte scritti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(ArrayPtr\<char_t\>, int, int) method


Ottieni i byte risultanti dalla codifica di un buffer di caratteri.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int index, int count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Caratteri da codificare. |
| indice | int | Inizio della porzione di carattere. |
| count | int | Numero di caratteri da convertire. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(const char_t *, int, uint8_t *, int) method


Ottieni i byte risultanti dalla codifica di un buffer di caratteri.

```cpp
int System::Text::ICUEncoding::GetBytes(const char_t *chars, int char_count, uint8_t *bytes, int byte_count) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chars | const char_t * | Caratteri da codificare. |
| char_count | int | Numero di caratteri da convertire. |
| bytes | uint8_t * | [Buffer](../../../system/buffer/) per inserire i caratteri. |
| byte_count | int | Dimensione del buffer di output. |

### ReturnValue

Numero di byte scritti.

## Vedi anche

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(const String\&) method


Ottieni i byte risultanti dalla codifica di un buffer di caratteri.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const String &s)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) da codificare. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(const String\&, int, int, ArrayPtr\<uint8_t\>, int) method


Ottieni i byte risultanti dalla codifica di un buffer di caratteri.

```cpp
virtual int System::Text::Encoding::GetBytes(const String &s, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) da codificare. |
| char_index | int | Inizio della porzione di carattere. |
| char_count | int | Numero di caratteri da convertire. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) per inserire i caratteri. |
| byte_index | int | Offset del buffer di output. |

### ReturnValue

Numero di byte scritti.

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(const System::Details::ArrayView\<char_t\>\&, int, int) method


Ottieni i byte risultanti dalla codifica di un buffer di caratteri.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::ArrayView<char_t> &chars, int index, int count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chars | const System::Details::ArrayView\<char_t\>\& | Caratteri da codificare. |
| indice | int | Inizio della porzione di carattere. |
| count | int | Numero di caratteri da convertire. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(const System::Details::StackArray\<char_t, N\>\&, int, int) method


Ottieni i byte risultanti dalla codifica di un buffer di caratteri.

```cpp
template<std::size_t> ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::StackArray<char_t, N> &chars, int index, int count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chars | const System::Details::StackArray\<char_t, N\>\& | Caratteri da codificare. |
| indice | int | Inizio della porzione di carattere. |
| count | int | Numero di caratteri da convertire. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) method


Ottieni i byte risultanti dalla codifica di un buffer di caratteri.

```cpp
virtual int System::Text::Encoding::GetBytes(System::Details::ArrayView<char_t> chars, int char_index, int char_count, System::Details::ArrayView<uint8_t> bytes, int byte_index)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chars | System::Details::ArrayView\<char_t\> | Caratteri da codificare. |
| char_index | int | Inizio della porzione di carattere. |
| char_count | int | Numero di caratteri da convertire. |
| bytes | System::Details::ArrayView\<uint8_t\> | [Buffer](../../../system/buffer/) per inserire i caratteri. |
| byte_index | int | Offset del buffer di output. |

### ReturnValue

Numero di byte scritti.

## Vedi anche

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) method


Ottieni i byte risultanti dalla codifica di un buffer di caratteri.

```cpp
template<std::size_t,std::size_t> int System::Text::Encoding::GetBytes(System::Details::StackArray<char_t, SC> &chars, int char_index, int char_count, System::Details::StackArray<uint8_t, SB> &bytes, int byte_index)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chars | System::Details::StackArray\<char_t, SC\>\& | Caratteri da codificare. |
| char_index | int | Inizio della porzione di carattere. |
| char_count | int | Numero di caratteri da convertire. |
| bytes | System::Details::StackArray\<uint8_t, SB\>\& | [Buffer](../../../system/buffer/) per inserire i caratteri. |
| byte_index | int | Offset del buffer di output. |

### ReturnValue

Numero di byte scritti.

## Vedi anche

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
