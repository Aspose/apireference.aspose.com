---
title: "System::Globalization::DateTimeStyles enum"
linktitle: "DateTimeStyles"
second_title: "Aspose.Page için C++"
description: "System::Globalization::DateTimeStyles enum. Tarih ve zaman biçimlendirme seçeneklerini tanımlar. C++'da bit bayrakları."
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
| None | 0 | Varsayılan. |
| AllowLeadingWhite | 1 | Ön boşlukları yok say. |
| AllowTrailingWhite | 2 | Son boşlukları yok say. |
| AllowInnerWhite | 4 | İç beyaz boşlukları yoksay. |
| AllowWhiteSpaces | n/a | Tüm beyaz boşlukları yoksay. |
| NoCurrentDateDefault | 8 | Bir tarih/saat dizesi ayrıştırılırken, yıl/ay/gün tümü eksikse, varsayılan tarihi mevcut yıl/ay/gün yerine 0001/1/1 olarak ayarla. |
| AdjustToUniversal | 16 | Bir tarih/saat dizesi ayrıştırılırken, bir saat dilimi belirteci ("GMT","Z","+xxxx", "-xxxx" mevcutsa), ayrıştırılan zamanı GMT'ye göre ayarlayacağız. |
| AssumeLocal | 32 | Saat dilimi verilmemişse, yerel saat dilimini kullan. |
| AssumeUniversal | 64 | Saat dilimi verilmemişse, UTC'yi kullan. |
| RoundtripKind | 128 | Girişin belirtilmemiş, yerel veya UTC olup olmadığını korumaya çalış. |

## Ayrıca Bakınız

* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
