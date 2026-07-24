---
title: "System::Text::ICUEncoder::GetBytes metode"
linktitle: "GetBytes"
second_title: "Aspose.Page untuk C++"
description: "System::Text::ICUEncoder::GetBytes metode. Dapatkan byte yang dihasilkan dari penyandian buffer dalam C++."
type: docs
weight: 500
url: /id/cpp/system.text/icuencoder/getbytes/
---
## ICUEncoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


Dapatkan byte yang dihasilkan dari mengenkode sebuah buffer.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Karakter untuk dienkode. |
| charIndex | int | Offset array sumber. |
| charCount | int | Panjang subarray sumber. |
| byte | ArrayPtr\<uint8_t\> | Buffer byte tujuan. |
| byteIndex | int | Offset buffer tujuan. |
| flush | bool | Jika true, membersihkan status encoder internal setelah perhitungan. |

### ReturnValue

Jumlah byte yang ditulis.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


Dapatkan byte yang dihasilkan dari mengenkode sebuah buffer.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| chars | const char_t * | Karakter untuk dienkode. |
| charCount | int | Panjang array sumber. |
| byte | uint8_t * | Buffer byte tujuan. |
| byteCount | int | Ukuran buffer tujuan. |
| flush | bool | Jika true, membersihkan status encoder internal setelah perhitungan. |

### ReturnValue

Jumlah byte yang ditulis.

## Lihat Juga

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
