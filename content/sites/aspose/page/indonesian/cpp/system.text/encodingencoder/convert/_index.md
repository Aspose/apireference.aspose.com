---
title: "System::Text::EncodingEncoder::Convert metode"
linktitle: "Konversi"
second_title: "Aspose.Page untuk C++"
description: "System::Text::EncodingEncoder::Convert metode. Mengonversi karakter menjadi byte dalam C++."
type: docs
weight: 100
url: /id/cpp/system.text/encodingencoder/convert/
---
## EncodingEncoder::Convert(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) method


Mengonversi karakter menjadi byte.

```cpp
virtual void System::Text::EncodingEncoder::Convert(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Karakter untuk dienkode. |
| charIndex | int | Offset buffer input. |
| charCount | int | Ukuran buffer masukan. |
| byte | ArrayPtr\<uint8_t\> | Buffer byte tujuan. |
| byteIndex | int | Offset array tujuan. |
| byteCount | int | Ukuran array tujuan. |
| flush | bool | Jika true, membersihkan status encoder internal setelah perhitungan. |
| charsUsed | int\& | Referensi ke variabel untuk menyimpan jumlah karakter yang dibaca. |
| bytesUsed | int\& | Referensi ke variabel untuk menyimpan jumlah byte yang ditulis. |
| completed | bool\& | Referensi ke variabel yang akan diatur menjadi true jika buffer input habis dan menjadi false sebaliknya. |

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [EncodingEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncodingEncoder::Convert(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) method


Mengonversi karakter menjadi byte.

```cpp
virtual void System::Text::EncodingEncoder::Convert(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| chars | const char_t * | Karakter untuk dienkode. |
| charCount | int | Ukuran buffer masukan. |
| byte | uint8_t * | Buffer byte tujuan. |
| byteCount | int | Ukuran array tujuan. |
| flush | bool | Jika true, membersihkan status encoder internal setelah perhitungan. |
| charsUsed | int\& | Referensi ke variabel untuk menyimpan jumlah karakter yang dibaca. |
| bytesUsed | int\& | Referensi ke variabel untuk menyimpan jumlah byte yang ditulis. |
| completed | bool\& | Referensi ke variabel yang akan diatur menjadi true jika buffer input habis dan menjadi false sebaliknya. |

## Lihat Juga

* Class [EncodingEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
