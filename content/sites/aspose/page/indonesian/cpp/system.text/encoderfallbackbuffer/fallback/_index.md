---
title: "metode System::Text::EncoderFallbackBuffer::Fallback"
linktitle: "Fallback"
second_title: "Aspose.Page untuk C++"
description: "metode System::Text::EncoderFallbackBuffer::Fallback. Mengimplementasikan prosedur fallback sebenarnya dalam C++."
type: docs
weight: 100
url: /id/cpp/system.text/encoderfallbackbuffer/fallback/
---
## EncoderFallbackBuffer::Fallback(char_t, int) method


Mengimplementasikan prosedur fallback aktual.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknown, int index)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| charUnknown | char_t | Pengkode karakter gagal melakukan enkode. |
| indeks | int | Indeks karakter yang memicu kesalahan. |

### ReturnValue

Benar jika buffer memproses karakter tidak dikenal, salah jika mengabaikannya.

## Lihat Juga

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderFallbackBuffer::Fallback(char_t, char_t, int) method


Mengimplementasikan prosedur fallback aktual.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| charUnknownHigh | char_t | Bagian tinggi pasangan surrogate yang memicu kesalahan. |
| charUnknownLow | char_t | Bagian rendah pasangan surrogate yang memicu kesalahan. |
| indeks | int | Indeks karakter yang memicu kesalahan. |

### ReturnValue

Benar jika buffer memproses karakter tidak dikenal, salah jika mengabaikannya.

## Lihat Juga

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
