---
title: "System::Text::RegularExpressions::Regex::IsMatch μέθοδος"
linktitle: "IsMatch"
second_title: "Aspose.Page για C++"
description: "System::Text::RegularExpressions::Regex::IsMatch μέθοδος. Ταιριάζει το regex με τη συμβολοσειρά σε C++."
type: docs
weight: 500
url: /el/cpp/system.text.regularexpressions/regex/ismatch/
---
## Regex::IsMatch(const String\&, int) method


Ταιριάζει την κανονική έκφραση με τη συμβολοσειρά.

```cpp
bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, int startat=0)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const String\& | Στοχευόμενη συμβολοσειρά. |
| startat | int | Αρχικός δείκτης. |

### ReturnValue

Αληθές εάν η συμβολοσειρά ταιριάζει με το regex, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


Ελέγχει αν η συμβολοσειρά ταιριάζει με το πρότυπο.

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const String\& | Συμβολοσειρά εισόδου. |
| πρότυπο | const String\& | Μοτίβο Regexp. |
| επιλογές | RegexOptions | Επιλογές αντιστοίχισης. |
| matchTimeout | TimeSpan | Χρονικό όριο. |
| startat | int | [Match](../../match/) αρχική θέση. |

### ReturnValue

Αληθές εάν βρεθεί αντιστοίχιση, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
