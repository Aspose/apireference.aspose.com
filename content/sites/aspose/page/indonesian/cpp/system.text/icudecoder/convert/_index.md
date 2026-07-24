---
title: "System::Text::ICUDecoder::Convert metode"
linktitle: "Konversi"
second_title: "Aspose.Page untuk C++"
description: "System::Text::ICUDecoder::Convert metode. Mengonversi byte menjadi karakter dalam C++."
type: docs
weight: 300
url: /id/cpp/system.text/icudecoder/convert/
---
## ICUDecoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


Mengonversi byte menjadi karakter.

```cpp
virtual void System::Text::ICUDecoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| byte | ArrayPtr\<uint8_t\> | Byte untuk didekode. |
| byteIndex | int | Offset buffer input. |
| byteCount | int | Ukuran buffer masukan. |
| chars | ArrayPtr\<char_t\> | Buffer karakter tujuan. |
| charIndex | int | Offset array tujuan. |
| charCount | int | Ukuran array tujuan. |
| flush | bool | Jika true, membersihkan status decoder internal setelah perhitungan. |
| bytesUsed | int\& | Referensi ke variabel untuk menyimpan jumlah byte yang dibaca. |
| charsUsed | int\& | Referensi ke variabel untuk menyimpan jumlah karakter yang ditulis. |
| completed | bool\& | Referensi ke variabel yang akan diatur menjadi true jika buffer input habis dan menjadi false sebaliknya. |

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


Mengonversi byte menjadi karakter.

```cpp
virtual void System::Text::ICUDecoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| byte | const uint8_t * | Byte untuk didekode. |
| byteCount | int | Ukuran buffer masukan. |
| chars | char_t * | Buffer karakter tujuan. |
| charCount | int | Ukuran array tujuan. |
| flush | bool | Jika true, membersihkan status decoder internal setelah perhitungan. |
| bytesUsed | int\& | Referensi ke variabel untuk menyimpan jumlah byte yang dibaca. |
| charsUsed | int\& | Referensi ke variabel untuk menyimpan jumlah karakter yang ditulis. |
| completed | bool\& | Referensi ke variabel yang akan diatur menjadi true jika buffer input habis dan menjadi false sebaliknya. |

## Lihat Juga

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
