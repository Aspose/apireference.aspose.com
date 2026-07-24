---
title: "System::Text::RegularExpressions::Regex::Split μέθοδος"
linktitle: "Διαίρεση"
second_title: "Aspose.Page για C++"
description: "System::Text::RegularExpressions::Regex::Split μέθοδος. Διαχωρίζει τη συμβολοσειρά με βάση τις αντιστοιχίες regex σε C++."
type: docs
weight: 900
url: /el/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


Διαχωρίζει τη συμβολοσειρά με βάση τις αντιστοιχίες regex.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) για διαχωρισμό. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int) method


Διαχωρίζει τη συμβολοσειρά με βάση τις αντιστοιχίες regex.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) για διαχωρισμό. |
| count | int | Όριο αριθμού υποσυμβολοσειρών. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int, int) method


Διαιρεί μια είσοδο συμβολοσειράς έναν καθορισμένο μέγιστο αριθμό φορών σε έναν πίνακα υποσυμβολοσειρών, στις θέσεις που ορίζονται από μια κανονική έκφραση που έχει καθοριστεί στον κατασκευαστή [Regex](../). Η αναζήτηση του μοτίβου της κανονικής έκφρασης ξεκινά από μια καθορισμένη θέση χαρακτήρα στην είσοδο συμβολοσειράς.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const String\& | Η συμβολοσειρά που θα διαχωριστεί. |
| count | int | Ο μέγιστος αριθμός φορών που μπορεί να γίνει το διαχωρισμό. |
| startat | int | Η θέση χαρακτήρα στην είσοδο συμβολοσειράς όπου θα ξεκινήσει η αναζήτηση. |

### ReturnValue

Ένας πίνακας συμβολοσειρών.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


Διαιρεί τη συμβολοσειρά με βάση regexp.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const String\& | Συμβολοσειρά εισόδου. |
| πρότυπο | const String\& | Μοτίβο Regexp. |
| count | int | [Match](../../match/) όριο αριθμού. |
| επιλογές | RegexOptions | Επιλογές αντιστοίχισης. |
| matchTimeout | TimeSpan | Χρονικό όριο. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


Διαιρεί τη συμβολοσειρά με βάση regexp.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const String\& | Συμβολοσειρά εισόδου. |
| πρότυπο | const String\& | Μοτίβο Regexp. |
| επιλογές | RegexOptions | Επιλογές αντιστοίχισης. |
| matchTimeout | TimeSpan | Χρονικό όριο. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
