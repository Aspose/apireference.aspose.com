---
title: "System::Text::RegularExpressions::Regex::Matches yöntemi"
linktitle: "Eşleşmeler"
second_title: "Aspose.Page için C++"
description: "System::Text::RegularExpressions::Regex::Matches yöntemi. C++'ta tekrar tekrar eşleştirerek verilen dizede regex'in tüm eşleşmelerini alır."
type: docs
weight: 700
url: /tr/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


Verilen dizede regex'in tüm eşleşmelerini tekrar tekrar eşleştirerek alır.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| girdi | const String\& | Girdi dizesi. |
| startat | int | Eşleştirmenin başlayacağı indeks. |

### ReturnValue

Bulunan tüm eşleşmelerin koleksiyonu.

## Ayrıca Bakınız

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Dize ve desen arasındaki tüm eşleşmeleri alır.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| girdi | const String\& | Girdi dizesi. |
| pattern | const String\& | Regex deseni. |
| seçenekler | RegexOptions | Eşleştirme seçenekleri. |
| matchTimeout | TimeSpan | Zaman aşımı. |
| startat | int | [Match](../../match/) başlangıç konumu. |
| length | int | İncelenecek karakter sayısı (0 sınırlamayı devre dışı bırakır). |

### ReturnValue

Tekrar tekrar eşleştirerek bulunan tüm eşleşmeler.

## Ayrıca Bakınız

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
