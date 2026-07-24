---
title: "Metode System::Char::IsSurrogatePair"
linktitle: "IsSurrogatePair"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Char::IsSurrogatePair. Menentukan apakah dua karakter yang ditentukan merupakan pasangan surrogate UTF-16 dalam C++."
type: docs
weight: 1700
url: /id/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


Menentukan apakah dua karakter yang ditentukan untuk pasangan surrogate UTF-16.

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| highSurrogate | char_t | Karakter yang diuji apakah merupakan high surrogate |
| lowSurrogate | char_t | Karakter yang diuji apakah merupakan low surrogate |

### ReturnValue

Benar jika karakter yang ditentukan membentuk pasangan surrogate, jika tidak - false

## Lihat Juga

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


Menentukan apakah dua karakter berurutan dalam buffer karakter yang ditentukan merupakan pasangan surrogate.

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const String\& | Sebuah string |
| indeks | int | Indeks berbasis nol dalam buffer yang ditentukan di mana urutan karakter untuk diuji dimulai |

### ReturnValue

Benar jika karakter yang ditentukan merupakan pasangan surrogate, jika tidak - false

## Lihat Juga

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
