---
title: "System::DateTimeOffset::TryParse μέθοδος"
linktitle: "TryParse"
second_title: "Aspose.Page για C++"
description: "System::DateTimeOffset::TryParse μέθοδος. Προσπαθεί να μετατρέψει τη συγκεκριμένη συμβολοσειρά σε αντικείμενο DateTimeOffset χρησιμοποιώντας τον καθορισμένο πάροχο μορφής και το στυλ μορφοποίησης σε C++."
type: docs
weight: 5700
url: /el/cpp/system/datetimeoffset/tryparse/
---
## DateTimeOffset::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Προσπαθεί να μετατρέψει τη συγκεκριμένη συμβολοσειρά σε αντικείμενο [DateTimeOffset](../) χρησιμοποιώντας τον καθορισμένο πάροχο μορφής και το στυλ μορφοποίησης.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const String\& | [String](../../string/) για μετατροπή. |
| πάροχος | const SharedPtr\<IFormatProvider\>\& | Πάροχος μορφής. |
| styles | Globalization::DateTimeStyles | Στυλ μορφοποίησης ημερομηνίας και ώρας. |
| result | DateTimeOffset\& | [DateTimeOffset](../) που είναι ισοδύναμο με το **input**. |

### ReturnValue

αληθές εάν το **input** μετατράπηκε επιτυχώς, διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::TryParse(const String\&, DateTimeOffset\&) method


Προσπαθεί να μετατρέψει τη συγκεκριμένη συμβολοσειρά σε αντικείμενο [DateTimeOffset](../).

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, DateTimeOffset &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const String\& | [String](../../string/) για μετατροπή. |
| result | DateTimeOffset\& | [DateTimeOffset](../) που είναι ισοδύναμο με το **input**. |

### ReturnValue

αληθές εάν το **input** μετατράπηκε επιτυχώς, διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
