---
title: "System::Text::RegularExpressions::Regex::Match method"
linktitle: "Match"
second_title: "Aspose.Page για C++"
description: "System::Text::RegularExpressions::Regex::Match method. Ταιριάζει την κανονική έκφραση με τη συμβολοσειρά σε C++."
type: docs
weight: 600
url: /el/cpp/system.text.regularexpressions/regex/match/
---
## Regex::Match(const String\&) method


Ταιριάζει την κανονική έκφραση με τη συμβολοσειρά.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const String\& | Στοχευόμενη συμβολοσειρά. |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## Δείτε επίσης

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, int, int) method


Ταιριάζει την κανονική έκφραση με τη συμβολοσειρά.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, int startat, int length=0)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const String\& | Στοχευόμενη συμβολοσειρά. |
| startat | int | Αρχικός δείκτης. |
| length | int | Αριθμός χαρακτήρων προς εξέταση (0 για εξέταση ολόκληρης της συμβολοσειράς). |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## Δείτε επίσης

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Ταιριάζει τη συμβολοσειρά και το πρότυπο.

```cpp
static MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const String\& | Συμβολοσειρά εισόδου. |
| πρότυπο | const String\& | Μοτίβο Regexp. |
| επιλογές | RegexOptions | Επιλογές αντιστοίχισης. |
| matchTimeout | TimeSpan | Χρονικό όριο. |
| startat | int | [Match](../../match/) αρχική θέση. |
| length | int | Αριθμός χαρακτήρων προς εξέταση (0 απενεργοποιεί το όριο). |

### ReturnValue

Βρέθηκε το πρώτο ταίριασμα.

## Δείτε επίσης

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
