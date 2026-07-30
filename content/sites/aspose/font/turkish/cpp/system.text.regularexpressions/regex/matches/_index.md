---
title: "System::Text::RegularExpressions::Regex::Matches metodu"
linktitle: "Matches"
second_title: "Aspose.Font için C++"
description: "System::Text::RegularExpressions::Regex::Matches metodu. C++'ta verilen dizede regex'in tüm eşleşmelerini tekrar tekrar eşleştirerek alır."
type: docs
weight: 700
url: /tr/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


Verilen dizede regex'in tüm eşleşmelerini tekrar tekrar eşleştirerek alır.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const String\& | Girdi dizesi. |
| startat | int | Eşleştirmeye başlanacak indeks. |

### ReturnValue

Bulunan tüm eşleşmelerin koleksiyonu.

## Ayrıca Bakınız

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Dize ile desen arasındaki tüm eşleşmeleri alır.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const String\& | Girdi dizesi. |
| desen | const String\& | Regexp deseni. |
| seçenekler | RegexOptions | Eşleştirme seçenekleri. |
| matchTimeout | TimeSpan | Zaman aşımı. |
| startat | int | [Match](../../match/) başlangıç konumu. |
| uzunluk | int | İncelenecek karakter sayısı (0 sınırsızdır). |

### ReturnValue

Tekrar tekrar eşleştirerek bulunan tüm eşleşmeler.

## Ayrıca Bakınız

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
