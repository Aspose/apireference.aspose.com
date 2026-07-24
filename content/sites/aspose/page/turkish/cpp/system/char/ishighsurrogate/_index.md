---
title: "System::Char::IsHighSurrogate yöntemi"
linktitle: "IsHighSurrogate"
second_title: "Aspose.Page için C++"
description: "System::Char::IsHighSurrogate yöntemi. Belirtilen karakterin C++'da yüksek surrogaat olup olmadığını belirler."
type: docs
weight: 800
url: /tr/cpp/system/char/ishighsurrogate/
---
## Char::IsHighSurrogate(char_t) method


Belirtilen karakterin yüksek yedek olup olmadığını belirler.

```cpp
static bool System::Char::IsHighSurrogate(char_t c)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| c | char_t | Test edilecek karakter |

### ReturnValue

Belirtilen karakter bir yüksek surrogaat ise doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsHighSurrogate(const char_t *, int) method


Belirtilen karakter tamponundaki belirtilen indeksteki karakterin yüksek yedek olup olmadığını belirler.

```cpp
static bool System::Char::IsHighSurrogate(const char_t *str, int idx)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| str | const char_t * | Karakter tamponunun başlangıcına işaretçi |
| idx | int | Test edilecek karakterin bulunduğu belirtilen tamponda sıfır tabanlı bir indeks |

### ReturnValue

Belirtilen indeksteki karakter bir yüksek surrogaat ise doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsHighSurrogate(const String\&, int) method


Belirtilen dizedeki belirtilen indeksteki karakterin UTF-16 yüksek yedek kod birimi olup olmadığını belirler.

```cpp
static bool System::Char::IsHighSurrogate(const String &s, int index)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| s | const String\& | Bir dize |
| indeks | int | Test edilecek karakterin belirtilen dizedeki indeksi |

### ReturnValue

Belirtilen indeksteki karakter bir UTF-16 yüksek surrogaat kod birimi ise doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
