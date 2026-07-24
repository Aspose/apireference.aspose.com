---
title: "System::Text::ICUDecoder::GetChars metode"
linktitle: "GetChars"
second_title: "Aspose.Page untuk C++"
description: "System::Text::ICUDecoder::GetChars metode. Dapatkan karakter yang dihasilkan dari mendekode buffer dalam C++."
type: docs
weight: 500
url: /id/cpp/system.text/icudecoder/getchars/
---
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Dapatkan karakter yang dihasilkan dari mendekode sebuah buffer.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| byte | ArrayPtr\<uint8_t\> | Byte untuk didekode. |
| byteIndex | int | Offset buffer input. |
| byteCount | int | Ukuran buffer masukan. |
| chars | ArrayPtr\<char_t\> | Buffer karakter tujuan. |
| charIndex | int | Offset array tujuan. |

### ReturnValue

Jumlah karakter yang ditulis.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


Dapatkan karakter yang dihasilkan dari mendekode sebuah buffer.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| byte | ArrayPtr\<uint8_t\> | Byte untuk didekode. |
| byteIndex | int | Offset buffer input. |
| byteCount | int | Ukuran buffer masukan. |
| chars | ArrayPtr\<char_t\> | Buffer karakter tujuan. |
| charIndex | int | Offset array tujuan. |
| flush | bool | Jika true, membersihkan status decoder internal setelah perhitungan. |

### ReturnValue

Jumlah karakter yang ditulis.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


Dapatkan karakter yang dihasilkan dari mendekode sebuah buffer.

```cpp
virtual int System::Text::ICUDecoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| byte | const uint8_t * | Byte untuk didekode. |
| byteCount | int | Ukuran buffer masukan. |
| chars | char_t * | Buffer karakter tujuan. |
| charCount | int | Ukuran array tujuan. |
| flush | bool | Jika true, membersihkan status decoder internal setelah perhitungan. |

### ReturnValue

Jumlah karakter yang ditulis.

## Lihat Juga

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
