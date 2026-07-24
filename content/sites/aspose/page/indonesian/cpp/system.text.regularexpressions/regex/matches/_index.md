---
title: "System::Text::RegularExpressions::Regex::Matches metode"
linktitle: "Kecocokan"
second_title: "Aspose.Page untuk C++"
description: "System::Text::RegularExpressions::Regex::Matches metode. Mendapatkan semua kecocokan regex dalam string yang diberikan dengan mencocokkan berulang kali di C++."
type: docs
weight: 700
url: /id/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


Mendapatkan semua kecocokan regex dalam string yang diberikan dengan mencocokkan berulang kali.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const String\& | String masukan. |
| startat | int | Indeks untuk memulai pencocokan pada. |

### ReturnValue

Koleksi semua kecocokan yang ditemukan.

## Lihat Juga

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Mendapatkan semua kecocokan antara string dan pola.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const String\& | String masukan. |
| pola | const String\& | Pola Regexp. |
| opsi | RegexOptions | Opsi pencocokan. |
| matchTimeout | TimeSpan | Batas waktu. |
| startat | int | [Match](../../match/) posisi awal. |
| length | int | Jumlah karakter yang akan diperiksa (0 menonaktifkan batas). |

### ReturnValue

Semua kecocokan yang ditemukan dengan pencocokan berulang.

## Lihat Juga

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
