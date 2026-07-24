---
title: "System::Text::Encoding::GetBytes metode"
linktitle: "GetBytes"
second_title: "Aspose.Page untuk C++"
description: "System::Text::Encoding::GetBytes metode. Mendapatkan byte yang dihasilkan dari mengkodekan buffer karakter dalam C++."
type: docs
weight: 1800
url: /id/cpp/system.text/encoding/getbytes/
---
## Encoding::GetBytes(ArrayPtr\<char_t\>) method


Dapatkan byte yang dihasilkan dari mengenkode buffer karakter.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Karakter untuk dienkode. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) method


Dapatkan byte yang dihasilkan dari mengenkode buffer karakter.

```cpp
virtual int System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Karakter untuk dienkode. |
| char_index | int | Awalan irisan karakter. |
| char_count | int | Jumlah karakter yang akan dikonversi. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) untuk menempatkan karakter. |
| byte_index | int | Offset buffer output. |

### ReturnValue

Jumlah byte yang ditulis.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(ArrayPtr\<char_t\>, int, int) method


Dapatkan byte yang dihasilkan dari mengenkode buffer karakter.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int index, int count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Karakter untuk dienkode. |
| indeks | int | Awalan irisan karakter. |
| count | int | Jumlah karakter yang akan dikonversi. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(const char_t *, int, uint8_t *, int) method


Dapatkan byte yang dihasilkan dari mengenkode buffer karakter.

```cpp
virtual int System::Text::Encoding::GetBytes(const char_t *chars, int char_count, uint8_t *bytes, int byte_count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| chars | const char_t * | Karakter untuk dienkode. |
| char_count | int | Jumlah karakter yang akan dikonversi. |
| bytes | uint8_t * | [Buffer](../../../system/buffer/) untuk menempatkan karakter. |
| byte_count | int | Ukuran buffer output. |

### ReturnValue

Jumlah byte yang ditulis.

## Lihat Juga

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(const String\&) method


Dapatkan byte yang dihasilkan dari mengenkode buffer karakter.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const String &s)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) untuk dienkode. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(const String\&, int, int, ArrayPtr\<uint8_t\>, int) method


Dapatkan byte yang dihasilkan dari mengenkode buffer karakter.

```cpp
virtual int System::Text::Encoding::GetBytes(const String &s, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) untuk dienkode. |
| char_index | int | Awalan irisan karakter. |
| char_count | int | Jumlah karakter yang akan dikonversi. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) untuk menempatkan karakter. |
| byte_index | int | Offset buffer output. |

### ReturnValue

Jumlah byte yang ditulis.

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(const System::Details::ArrayView\<char_t\>\&, int, int) method


Dapatkan byte yang dihasilkan dari mengenkode buffer karakter.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::ArrayView<char_t> &chars, int index, int count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| chars | const System::Details::ArrayView\<char_t\>\& | Karakter untuk dienkode. |
| indeks | int | Awalan irisan karakter. |
| count | int | Jumlah karakter yang akan dikonversi. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(const System::Details::StackArray\<char_t, N\>\&, int, int) method


Dapatkan byte yang dihasilkan dari mengenkode buffer karakter.

```cpp
template<std::size_t> ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::StackArray<char_t, N> &chars, int index, int count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| chars | const System::Details::StackArray\<char_t, N\>\& | Karakter untuk dienkode. |
| indeks | int | Awalan irisan karakter. |
| count | int | Jumlah karakter yang akan dikonversi. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) method


Dapatkan byte yang dihasilkan dari mengenkode buffer karakter.

```cpp
virtual int System::Text::Encoding::GetBytes(System::Details::ArrayView<char_t> chars, int char_index, int char_count, System::Details::ArrayView<uint8_t> bytes, int byte_index)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| chars | System::Details::ArrayView\<char_t\> | Karakter untuk dienkode. |
| char_index | int | Awalan irisan karakter. |
| char_count | int | Jumlah karakter yang akan dikonversi. |
| bytes | System::Details::ArrayView\<uint8_t\> | [Buffer](../../../system/buffer/) untuk menempatkan karakter. |
| byte_index | int | Offset buffer output. |

### ReturnValue

Jumlah byte yang ditulis.

## Lihat Juga

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) method


Dapatkan byte yang dihasilkan dari mengenkode buffer karakter.

```cpp
template<std::size_t,std::size_t> int System::Text::Encoding::GetBytes(System::Details::StackArray<char_t, SC> &chars, int char_index, int char_count, System::Details::StackArray<uint8_t, SB> &bytes, int byte_index)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| chars | System::Details::StackArray\<char_t, SC\>\& | Karakter untuk dienkode. |
| char_index | int | Awalan irisan karakter. |
| char_count | int | Jumlah karakter yang akan dikonversi. |
| bytes | System::Details::StackArray\<uint8_t, SB\>\& | [Buffer](../../../system/buffer/) untuk menempatkan karakter. |
| byte_index | int | Offset buffer output. |

### ReturnValue

Jumlah byte yang ditulis.

## Lihat Juga

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
