---
title: "System::Text::RegularExpressions::Regex::Split metodu"
linktitle: "Split"
second_title: "Aspose.Font için C++"
description: "System::Text::RegularExpressions::Regex::Split metodu. C++'ta dizeyi regex eşleşmelerine göre böler."
type: docs
weight: 900
url: /tr/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


Dizeyi regex eşleşmelerine göre böler.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) bölmek için. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, int) method


Dizeyi regex eşleşmelerine göre böler.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) bölmek için. |
| count | int | Alt dizelerin sayısı sınırı. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, int, int) method


Girdi dizesini belirtilen azami sayıda bölerek, [Regex](../) yapıcısında belirtilen bir düzenli ifadeyle tanımlanan konumlardaki alt dizi dizisine ayırır. Düzenli ifade deseninin aranması, girdi dizesindeki belirtilen karakter konumundan başlar.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const String\& | Bölünecek dize. |
| count | int | Bölmenin gerçekleşebileceği azami sayı. |
| startat | int | Aramanın başlayacağı girdi dizesindeki karakter konumu. |

### ReturnValue

Dizeler dizisi.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


Dizeyi regexp'e göre böler.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const String\& | Girdi dizesi. |
| desen | const String\& | Regexp deseni. |
| count | int | [Match](../../match/) sayı sınırı. |
| seçenekler | RegexOptions | Eşleştirme seçenekleri. |
| matchTimeout | TimeSpan | Zaman aşımı. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


Dizeyi regexp'e göre böler.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const String\& | Girdi dizesi. |
| desen | const String\& | Regexp deseni. |
| seçenekler | RegexOptions | Eşleştirme seçenekleri. |
| matchTimeout | TimeSpan | Zaman aşımı. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
