---
title: "System::DateTimeOffset::ParseExact μέθοδος"
linktitle: "ParseExact"
second_title: "Aspose.Page για C++"
description: "System::DateTimeOffset::ParseExact μέθοδος. Μετατρέπει τη καθορισμένη συμβολοσειρά σε αντικείμενο DateTimeOffset χρησιμοποιώντας τις καθορισμένες μορφές, τον πάροχο μορφής και το στυλ μορφοποίησης σε C++."
type: docs
weight: 5600
url: /el/cpp/system/datetimeoffset/parseexact/
---
## DateTimeOffset::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Μετατρέπει τη καθορισμένη συμβολοσειρά σε αντικείμενο [DateTimeOffset](../) χρησιμοποιώντας τις καθορισμένες μορφές, τον πάροχο μορφής και το στυλ μορφοποίησης.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const String\& | [String](../../string/) για μετατροπή. |
| formats | const ArrayPtr\<String\>\& | [Array](../../array/) από συμβολοσειρές μορφής. |
| πάροχος | const SharedPtr\<IFormatProvider\>\& | Πάροχος μορφής. |
| styles | Globalization::DateTimeStyles | Στυλ μορφοποίησης ημερομηνίας και ώρας. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## Δείτε επίσης

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Μετατρέπει τη συγκεκριμένη συμβολοσειρά σε αντικείμενο [DateTimeOffset](../) χρησιμοποιώντας τη συγκεκριμένη μορφή, τον πάροχο μορφής και το στυλ μορφοποίησης.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input | const String\& | [String](../../string/) για μετατροπή. |
| μορφή | const String\& | Συμβολοσειρά μορφής. |
| πάροχος | const SharedPtr\<IFormatProvider\>\& | Πάροχος μορφής. |
| styles | Globalization::DateTimeStyles | Στυλ μορφοποίησης ημερομηνίας και ώρας. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## Δείτε επίσης

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
