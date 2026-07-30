---
title: "System::Char::IsSurrogatePair method"
linktitle: "IsSurrogatePair"
second_title: "Aspose.Font için C++"
description: "System::Char::IsSurrogatePair method. C++'ta bir UTF-16 surrogate çifti için belirtilen iki karakterin surrogate çift olup olmadığını belirler."
type: docs
weight: 1700
url: /tr/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


Belirtilen iki karakterin UTF-16 surrogaat çifti olup olmadığını belirler.

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| highSurrogate | char_t | Yüksek surrogate olup olmadığı test edilen bir karakter |
| lowSurrogate | char_t | Düşük surrogate olup olmadığı test edilen bir karakter |

### ReturnValue

Belirtilen karakterler bir surrogate çifti oluşturuyorsa doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


Belirtilen karakter tamponundaki iki ardışık karakterin bir surrogate çifti olup olmadığını belirler.

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | Bir dize |
| indeks | int | Test edilecek karakter dizisinin başladığı belirtilen tampondaki sıfır tabanlı indeks |

### ReturnValue

Belirtilen karakterler bir surrogate çifti ise doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
