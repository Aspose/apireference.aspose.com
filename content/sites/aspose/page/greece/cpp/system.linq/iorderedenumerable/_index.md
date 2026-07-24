---
title: "Κλάση System::Linq::IOrderedEnumerable"
linktitle: "IOrderedEnumerable"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Linq::IOrderedEnumerable. Αντιπροσωπεύει μια ταξινομημένη ακολουθία σε C++."
type: docs
weight: 300
url: /el/cpp/system.linq/iorderedenumerable/
---
## IOrderedEnumerable class


Αντιπροσωπεύει μια ταξινομημένη ακολουθία.

```cpp
template<typename T>class IOrderedEnumerable : public System::Collections::Generic::IEnumerable<T>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος των στοιχείων της ακολουθίας. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [GetEnumerator](./getenumerator/)() override | Λαμβάνει τον ενομετρητή. |
| [IOrderedEnumerable](./iorderedenumerable/)(const System::SharedPtr\<System::Collections::Generic::IEnumerable\<T\>\>\&, const Comparator\&) |  |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<T, Key\>\&) | Εκτελεί μια επακόλουθη ταξινόμηση των στοιχείων σε μια ακολουθία σε αύξουσα σειρά σύμφωνα με ένα κλειδί. |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<Source, Key\>\&) |  |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Comparator](./comparator/) | Πληροφορίες RTTI. |

## Δείτε επίσης

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Linq](../)
* Library [Aspose.Page for C++](../../)
