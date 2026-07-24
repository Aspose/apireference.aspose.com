---
title: "System::Text::RegularExpressions::Regex::Matches μέθοδος"
linktitle: "Αντιστοιχίες"
second_title: "Aspose.Page για C++"
description: "System::Text::RegularExpressions::Regex::Matches μέθοδος. Λαμβάνει όλες τις αντιστοιχίες του regex σε δεδομένη συμβολοσειρά κάνοντας επαναλαμβανόμενη αντιστοίχιση σε C++."
type: docs
weight: 700
url: /el/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


Επιστρέφει όλες τις αντιστοιχίες της κανονικής έκφρασης σε δεδομένη συμβολοσειρά, κάνοντας επαναλαμβανόμενη αντιστοίχιση.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | const String\& | Συμβολοσειρά εισόδου. |
| startat | int | Δείκτης από όπου ξεκινά η αντιστοίχιση. |

### ReturnValue

Συλλογή όλων των βρεθεισών αντιστοιχίσεων.

## Δείτε επίσης

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Επιστρέφει όλες τις αντιστοιχίες μεταξύ της συμβολοσειράς και του προτύπου.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
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

Όλες οι αντιστοιχίες που βρέθηκαν με επαναλαμβανόμενη αντιστοίχιση.

## Δείτε επίσης

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
