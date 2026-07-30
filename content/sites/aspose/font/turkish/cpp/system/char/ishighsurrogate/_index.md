---
title: "System::Char::IsHighSurrogate yöntemi"
linktitle: "IsHighSurrogate"
second_title: "Aspose.Font için C++"
description: "System::Char::IsHighSurrogate yöntemi. Belirtilen karakterin C++'ta yüksek surrogate olup olmadığını belirler."
type: docs
weight: 800
url: /tr/cpp/system/char/ishighsurrogate/
---
## Char::IsHighSurrogate(char_t) method


Belirtilen karakterin yüksek surrogaat olup olmadığını belirler.

```cpp
static bool System::Char::IsHighSurrogate(char_t c)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| c | char_t | Test edilecek karakter |

### ReturnValue

Belirtilen karakter yüksek bir surrogate ise doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::IsHighSurrogate(const char_t *, int) method


Belirtilen karakter tamponundaki belirtilen indeksdeki karakterin yüksek surrogaat olup olmadığını belirler.

```cpp
static bool System::Char::IsHighSurrogate(const char_t *str, int idx)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const char_t * | Karakter tamponunun başlangıcına işaretçi |
| idx | int | Test edilecek karakterin bulunduğu belirtilen tamponda sıfır tabanlı bir indeks |

### ReturnValue

Belirtilen indeksdeki karakter yüksek bir surrogate ise doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::IsHighSurrogate(const String\&, int) method


Belirtilen dizedeki belirtilen indeksdeki karakterin UTF-16 yüksek surrogaat kod birimi olup olmadığını belirler.

```cpp
static bool System::Char::IsHighSurrogate(const String &s, int index)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | const String\& | Bir dize |
| indeks | int | Test edilecek karakterin belirtilen dizedeki indeksi |

### ReturnValue

Doğru, eğer belirtilen indeksteki karakter bir UTF-16 yüksek surrogate kod birimi ise, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
