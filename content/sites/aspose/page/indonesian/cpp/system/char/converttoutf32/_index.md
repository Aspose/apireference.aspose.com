---
title: "System::Char::ConvertToUtf32 metode"
linktitle: "ConvertToUtf32"
second_title: "Aspose.Page untuk C++"
description: "System::Char::ConvertToUtf32 metode. Mengonversi pasangan surrogate UTF-16 yang ditentukan menjadi unit kode UTF-32 dalam C++."
type: docs
weight: 200
url: /id/cpp/system/char/converttoutf32/
---
## Char::ConvertToUtf32(char_t, char_t) method


Mengonversi pasangan surrogate UTF-16 yang ditentukan menjadi unit kode UTF-32.

```cpp
static int System::Char::ConvertToUtf32(char_t highSurrogate, char_t lowSurrogate)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| highSurrogate | char_t | Surrogate tinggi dari pasangan surrogate UTF-16 yang akan dikonversi |
| lowSurrogate | char_t | Surrogate rendah dari pasangan surrogate UTF-16 yang akan dikonversi |

### ReturnValue

Unit kode UTF-32 yang dihasilkan dari konversi

## Lihat Juga

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::ConvertToUtf32(const String\&, int) method


Mengonversi nilai karakter yang dikodekan UTF-16 atau pasangan surrogate pada posisi tertentu dalam string menjadi unit kode UTF-32.

```cpp
static int System::Char::ConvertToUtf32(const String &s, int index)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | const String\& | String yang berisi satu karakter atau pasangan surrogate |
| indeks | int | Posisi indeks dari karakter atau pasangan surrogate dalam string yang ditentukan |

### ReturnValue

Unit kode UTF-32 yang dihasilkan dari konversi

## Lihat Juga

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
