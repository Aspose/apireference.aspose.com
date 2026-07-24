---
title: "System::Text::RegularExpressions::Regex::Match method"
linktitle: "Match"
second_title: "Aspose.Page untuk C++"
description: "System::Text::RegularExpressions::Regex::Match method. Mencocokkan regex terhadap string dalam C++."
type: docs
weight: 600
url: /id/cpp/system.text.regularexpressions/regex/match/
---
## Regex::Match(const String\&) method


Mencocokkan regex terhadap string.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const String\& | String target. |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## Lihat Juga

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, int, int) method


Mencocokkan regex terhadap string.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, int startat, int length=0)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const String\& | String target. |
| startat | int | Indeks awal. |
| length | int | Jumlah karakter yang akan diperiksa (0 untuk memeriksa seluruh string). |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## Lihat Juga

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Mencocokkan string dan pola.

```cpp
static MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
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

Kecocokan pertama ditemukan.

## Lihat Juga

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
