---
title: "System::Text::EncoderReplacementFallbackBuffer::Fallback metode"
linktitle: "Fallback"
second_title: "Aspose.Page untuk C++"
description: "System::Text::EncoderReplacementFallbackBuffer::Fallback metode. Menangani kegagalan enkoding dalam C++."
type: docs
weight: 200
url: /id/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


Menangani kegagalan enkoding.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| charUnknown | char_t | Karakter tidak dikenal; diabaikan. |
| indeks | int | Posisi karakter tidak dikenal; diabaikan. |

### ReturnValue

Benar jika string pengganti disediakan dan tidak kosong, salah jika tidak.

## Lihat Juga

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


Menangani kegagalan enkoding.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| charUnknownHigh | char_t | Bagian tinggi pasangan surrogate yang memicu kesalahan. |
| charUnknownLow | char_t | Bagian rendah pasangan surrogate yang memicu kesalahan. |
| indeks | int | Posisi karakter tidak dikenal; diabaikan. |

### ReturnValue

Benar jika string pengganti disediakan dan tidak kosong, salah jika tidak.

## Lihat Juga

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
