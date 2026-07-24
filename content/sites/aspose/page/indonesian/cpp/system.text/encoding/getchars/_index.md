---
title: "Metode System::Text::Encoding::GetChars"
linktitle: "GetChars"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Text::Encoding::GetChars. Dapatkan karakter yang dihasilkan dari mendekode buffer byte dalam C++."
type: docs
weight: 2000
url: /id/cpp/system.text/encoding/getchars/
---
## Encoding::GetChars(ArrayPtr\<uint8_t\>) method


Dapatkan karakter yang dihasilkan dari mendekode buffer byte.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) untuk membaca byte dari. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Dapatkan karakter yang dihasilkan dari mendekode buffer byte.

```cpp
virtual int System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) untuk membaca byte dari. |
| byte_index | int | Offset buffer input. |
| byte_count | int | Ukuran buffer masukan. |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/) untuk menempatkan karakter. |
| char_index | int | Offset buffer output. |

### ReturnValue

Jumlah karakter yang ditulis.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


Dapatkan karakter yang dihasilkan dari mendekode buffer byte.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) untuk membaca byte dari. |
| indeks | int | Offset buffer input. |
| count | int | Ukuran buffer masukan. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetChars(const uint8_t *, int, char_t *, int) method


Dapatkan karakter yang dihasilkan dari mendekode buffer byte.

```cpp
virtual int System::Text::Encoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/) untuk membaca byte dari. |
| byte_count | int | Ukuran buffer masukan. |
| chars | char_t * | [Buffer](../../../system/buffer/) untuk menempatkan karakter. |
| char_count | int | Ukuran buffer output. |

### ReturnValue

Jumlah karakter yang ditulis.

## Lihat Juga

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
