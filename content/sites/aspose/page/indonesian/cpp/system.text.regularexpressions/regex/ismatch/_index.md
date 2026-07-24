---
title: "Metode System::Text::RegularExpressions::Regex::IsMatch"
linktitle: "IsMatch"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Text::RegularExpressions::Regex::IsMatch. Mencocokkan regex terhadap string dalam C++."
type: docs
weight: 500
url: /id/cpp/system.text.regularexpressions/regex/ismatch/
---
## Regex::IsMatch(const String\&, int) method


Mencocokkan regex terhadap string.

```cpp
bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, int startat=0)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const String\& | String target. |
| startat | int | Indeks awal. |

### ReturnValue

Benar jika string cocok dengan regex, salah jika tidak.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


Memeriksa apakah string cocok dengan pola.

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const String\& | String masukan. |
| pola | const String\& | Pola Regexp. |
| opsi | RegexOptions | Opsi pencocokan. |
| matchTimeout | TimeSpan | Batas waktu. |
| startat | int | [Match](../../match/) posisi awal. |

### ReturnValue

Benar jika kecocokan ditemukan, salah jika tidak.

## Lihat Juga

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
