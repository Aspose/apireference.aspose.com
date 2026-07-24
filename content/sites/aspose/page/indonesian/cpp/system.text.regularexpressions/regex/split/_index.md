---
title: "System::Text::RegularExpressions::Regex::Split metode"
linktitle: "Pisah"
second_title: "Aspose.Page untuk C++"
description: "System::Text::RegularExpressions::Regex::Split metode. Membagi string berdasarkan kecocokan regex di C++."
type: docs
weight: 900
url: /id/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


Membagi string berdasarkan kecocokan regex.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) untuk dipisah. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int) method


Membagi string berdasarkan kecocokan regex.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) untuk dipisah. |
| count | int | Batas jumlah substring. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int, int) method


Membagi sebuah string input sejumlah maksimum yang ditentukan menjadi sebuah array substring, pada posisi yang ditentukan oleh ekspresi reguler yang ditentukan dalam konstruktor [Regex](../). Pencarian pola ekspresi reguler dimulai pada posisi karakter yang ditentukan dalam string input.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const String\& | String yang akan dibagi. |
| count | int | Jumlah maksimum kali pemisahan dapat terjadi. |
| startat | int | Posisi karakter dalam string input tempat pencarian akan dimulai. |

### ReturnValue

Sebuah array string.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


Membagi string berdasarkan regexp.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const String\& | String masukan. |
| pola | const String\& | Pola Regexp. |
| count | int | [Match](../../match/) batas jumlah. |
| opsi | RegexOptions | Opsi pencocokan. |
| matchTimeout | TimeSpan | Batas waktu. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


Membagi string berdasarkan regexp.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const String\& | String masukan. |
| pola | const String\& | Pola Regexp. |
| opsi | RegexOptions | Opsi pencocokan. |
| matchTimeout | TimeSpan | Batas waktu. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
