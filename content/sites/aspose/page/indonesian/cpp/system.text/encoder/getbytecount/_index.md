---
title: "Metode System::Text::Encoder::GetByteCount"
linktitle: "GetByteCount"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Text::Encoder::GetByteCount. Mendapatkan jumlah byte yang diperlukan untuk mengkodekan sebuah buffer dalam C++."
type: docs
weight: 400
url: /id/cpp/system.text/encoder/getbytecount/
---
## Encoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


Mendapatkan jumlah byte yang diperlukan untuk mengenkode sebuah buffer.

```cpp
virtual int System::Text::Encoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
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
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoder::GetByteCount(const char_t *, int, bool) method


Mendapatkan jumlah byte yang diperlukan untuk mengenkode sebuah buffer.

```cpp
virtual int System::Text::Encoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| chars | const char_t * | Karakter untuk dienkode. |
| count | int | Jumlah karakter yang akan di-encode. |
| flush | bool | Jika true, membersihkan status encoder internal setelah perhitungan. |

### ReturnValue

Jumlah byte yang diperlukan untuk mengkodekan buffer.

## Lihat Juga

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
