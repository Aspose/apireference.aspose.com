---
title: "System::Text::ICUEncoder::GetByteCount metode"
linktitle: "GetByteCount"
second_title: "Aspose.Page untuk C++"
description: "System::Text::ICUEncoder::GetByteCount metode. Mendapatkan jumlah byte yang diperlukan untuk menyandikan buffer dalam C++."
type: docs
weight: 400
url: /id/cpp/system.text/icuencoder/getbytecount/
---
## ICUEncoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


Mendapatkan jumlah byte yang diperlukan untuk mengenkode sebuah buffer.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Karakter untuk dienkode. |
| index | int | [Buffer](../../../system/buffer/) offset. |
| count | int | Jumlah karakter yang akan di-encode. |
| flush | bool | Jika true, membersihkan status encoder internal setelah perhitungan. |

### ReturnValue

Jumlah byte yang diperlukan untuk mengkodekan buffer.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::GetByteCount(const char_t *, int, bool) method


Mendapatkan jumlah byte yang diperlukan untuk mengenkode sebuah buffer.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| chars | const char_t * | Karakter untuk dienkode. |
| count | int | Jumlah karakter yang akan di-encode. |
| flush | bool | Jika true, membersihkan status encoder internal setelah perhitungan. |

### ReturnValue

Jumlah byte yang diperlukan untuk mengkodekan buffer.

## Lihat Juga

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
