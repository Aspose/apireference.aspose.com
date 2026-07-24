---
title: "Κλάση Aspose::Page::EPS::Util::ThreadLocal"
linktitle: "ThreadLocal"
second_title: "Aspose.Page για C++"
description: "Κλάση Aspose::Page::EPS::Util::ThreadLocal. Κλάση που χρησιμοποιείται για την αντιγραφή της λειτουργικότητας που παρέχεται από τον τύπο περιτύλιξης System.Threading.ThreadLocal του .NET Framework 4.0 και 4.5''. Αυτό υλοποιεί στιγμιότυπα και στατικούς τύπους που είναι τοπικά νήματος και αναφέρονται σε διαφορετικά στιγμιότυπα μεταξύ των νημάτων, ακόμη και αν ο πραγματικός τύπος στιγμιότυπίου που αποτελεί το σύνολο της κλάσης μπορεί να είναι ο ίδιος σε C++."
type: docs
weight: 100
url: /el/cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


Κλάση που χρησιμοποιείται για την αντιγραφή της λειτουργικότητας που παρέχεται από τον τύπο περιτυλίγματος System.Threading.ThreadLocal του .NET Framework 4.0 και 4.5. Αυτή υλοποιεί τύπους στιγμιοτύπων και στατικούς τύπους που είναι τοπικοί στο νήμα και αναφέρονται σε διαφορετικές στιγμιότυπες μεταξύ των νημάτων, ακόμη και αν ο πραγματικός τύπος στιγμιότυπου του οποίου είναι η κλάση μια συγκέντρωση μπορεί να είναι ο ίδιος.

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος μεταβλητής για περιτύλιξη στη λογική επιλογής νήματος |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Dispose](./dispose/)() override | Δεν κάνει τίποτα. |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ορίστε το n'th όρισμα προτύπου ως αδύναμο δείκτη (αντί για κοινόχρηστο). Επιτρέπει την εναλλαγή δεικτών σε containers σε αδύναμη λειτουργία. |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Factory](./factory/) |  |

## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
