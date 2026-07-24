---
title: "Μέθοδος System::DateTimeOffset::TryParseExact"
linktitle: "TryParseExact"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::DateTimeOffset::TryParseExact. Προσπαθεί να μετατρέψει το καθορισμένο κείμενο σε αντικείμενο DateTimeOffset χρησιμοποιώντας τις καθορισμένες μορφές, τον πάροχο μορφής και το στυλ μορφοποίησης σε C++."
type: docs
weight: 5800
url: /el/cpp/system/datetimeoffset/tryparseexact/
---
## DateTimeOffset::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Προσπαθεί να μετατρέψει το καθορισμένο κείμενο σε αντικείμενο [DateTimeOffset](../) χρησιμοποιώντας τις καθορισμένες μορφές, τον πάροχο μορφής και το στυλ μορφοποίησης.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const String\& | [String](../../string/) για μετατροπή. |
| μορφές | const ArrayPtr\<String\>\& | Πίνακες συμβολοσειρών μορφής. |
| πάροχος | const SharedPtr\<IFormatProvider\>\& | Πάροχος μορφής. |
| styles | Globalization::DateTimeStyles | Στυλ μορφοποίησης ημερομηνίας και ώρας. |
| result | DateTimeOffset\& | [DateTimeOffset](../) που είναι ισοδύναμο με το **input**. |

### ReturnValue

αληθές εάν το **input** μετατράπηκε επιτυχώς, διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Προσπαθεί να μετατρέψει το καθορισμένο κείμενο σε αντικείμενο [DateTimeOffset](../) χρησιμοποιώντας τη καθορισμένη μορφή, τον πάροχο μορφής και το στυλ μορφοποίησης.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const String\& | [String](../../string/) για μετατροπή. |
| μορφή | const String\& | Συμβολοσειρά μορφής. |
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
