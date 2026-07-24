---
title: "System::Text::RegularExpressions::Regex::Split yöntemi"
linktitle: "Böl"
second_title: "Aspose.Page için C++"
description: "System::Text::RegularExpressions::Regex::Split yöntemi. C++'ta regex eşleşmelerine göre dizeyi böler."
type: docs
weight: 900
url: /tr/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


Dizeyi düzenli ifade eşleşmelerine göre böler.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) bölünecek dize. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int) method


Dizeyi düzenli ifade eşleşmelerine göre böler.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) bölünecek dize. |
| count | int | Alt dize sayısı sınırı. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int, int) method


Bir giriş dizesini, [Regex](../) yapıcısında belirtilen bir düzenli ifadeyle tanımlanan konumlardan, belirtilen maksimum sayıda bölerek alt dizeler dizisine ayırır. Düzenli ifade deseninin aranması, giriş dizesindeki belirtilen karakter konumundan başlar.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| girdi | const String\& | Bölünecek dize. |
| count | int | Bölmenin gerçekleşebileceği maksimum sayı. |
| startat | int | Aramanın başlayacağı giriş dizesindeki karakter konumu. |

### ReturnValue

Dizeler dizisi.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


Dizeyi regexp'e göre böler.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| girdi | const String\& | Girdi dizesi. |
| pattern | const String\& | Regex deseni. |
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
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


Dizeyi regexp'e göre böler.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| girdi | const String\& | Girdi dizesi. |
| pattern | const String\& | Regex deseni. |
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
* Library [Aspose.Page for C++](../../../)
