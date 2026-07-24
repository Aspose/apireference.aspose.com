---
title: "System::Char::IsSurrogatePair metodu"
linktitle: "IsSurrogatePair"
second_title: "Aspose.Page için C++"
description: "System::Char::IsSurrogatePair metodu. C++'ta bir UTF-16 surrogate çiftinin iki belirtilen karakter olup olmadığını belirler."
type: docs
weight: 1700
url: /tr/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


Belirtilen iki karakterin bir UTF-16 yedek çiftini oluşturup oluşturmadığını belirler.

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| highSurrogate | char_t | Yüksek surrogate olup olmadığı test edilen bir karakter |
| lowSurrogate | char_t | Düşük surrogate olup olmadığı test edilen bir karakter |

### ReturnValue

Belirtilen karakterler bir surrogate çifti oluşturuyorsa doğru, aksi takdirinde - yanlış

## Ayrıca Bakınız

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


Belirtilen karakter tamponundaki ardışık iki karakterin yedek çift olup olmadığını belirler.

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| str | const String\& | Bir dize |
| indeks | int | Test edilecek karakter dizisinin başladığı, belirtilen tamponda sıfır tabanlı bir indeks |

### ReturnValue

Belirtilen karakterler bir surrogate çifti ise doğru, aksi takdirde - false

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
