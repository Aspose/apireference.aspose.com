---
title: "System::Globalization::DateTimeStyles enum"
linktitle: "DateTimeStyles"
second_title: "Aspose.Font için C++"
description: "System::Globalization::DateTimeStyles enum. Tarih ve saat biçimlendirme seçeneklerini tanımlar. C++'da bit bayrakları."
type: docs
weight: 3500
url: /tr/cpp/system.globalization/datetimestyles/
---
## DateTimeStyles enum


Tarih ve saat biçimlendirme seçeneklerini tanımlar. Bit bayrakları.

```cpp
enum class DateTimeStyles : int32_t
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Yok | 0 | Varsayılan. |
| AllowLeadingWhite | 1 | Ön boşlukları yok say. |
| AllowTrailingWhite | 2 | Son boşlukları yok say. |
| AllowInnerWhite | 4 | İç boşlukları yok say. |
| AllowWhiteSpaces | n/a | Tüm boşlukları yok say. |
| NoCurrentDateDefault | 8 | Bir tarih/saat dizesi ayrıştırılırken, tüm yıl/ay/gün eksikse, varsayılan tarihi mevcut yıl/ay/gün yerine 0001/1/1 olarak ayarla. |
| AdjustToUniversal | 16 | Bir tarih/saat dizesi ayrıştırılırken, bir saat dilimi belirteci ("GMT","Z","+xxxx","-xxxx" mevcut) varsa, ayrıştırılan zamanı GMT'ye göre ayarlayacağız. |
| AssumeLocal | 32 | Saat dilimi verilmemişse, yerel saat dilimini kullan. |
| AssumeUniversal | 64 | Saat dilimi verilmemişse, UTC'yi kullan. |
| RoundtripKind | 128 | Girişin belirtilmemiş, yerel veya UTC olup olmadığını korumaya çalış. |

## Ayrıca Bakınız

* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
