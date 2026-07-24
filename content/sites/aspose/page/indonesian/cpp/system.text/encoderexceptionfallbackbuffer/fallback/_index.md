---
title: "System::Text::EncoderExceptionFallbackBuffer::Fallback metode"
linktitle: "Fallback"
second_title: "Aspose.Page untuk C++"
description: "System::Text::EncoderExceptionFallbackBuffer::Fallback metode. Menangani kegagalan enkoding dalam C++."
type: docs
weight: 200
url: /id/cpp/system.text/encoderexceptionfallbackbuffer/fallback/
---
## EncoderExceptionFallbackBuffer::Fallback(char_t, int) method


Menangani kegagalan enkoding.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| charUnknown | char_t | Karakter tidak dikenal; diabaikan. |
| indeks | int | Offset karakter tidak dikenal; diabaikan. |

### ReturnValue

Tidak pernah mengembalikan nilai, melainkan melempar pengecualian.

## Lihat Juga

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderExceptionFallbackBuffer::Fallback(char_t, char_t, int) method


Menangani kegagalan enkoding.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| charUnknownHigh | char_t | Bagian tinggi pasangan surrogate yang memicu kesalahan. |
| charUnknownLow | char_t | Bagian rendah pasangan surrogate yang memicu kesalahan. |
| indeks | int | Offset karakter tidak dikenal; diabaikan. |

### ReturnValue

Tidak pernah mengembalikan nilai, melainkan melempar pengecualian.

## Lihat Juga

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
