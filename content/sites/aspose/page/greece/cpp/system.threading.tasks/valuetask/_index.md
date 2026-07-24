---
title: "Κλάση System::Threading::Tasks::ValueTask"
linktitle: "ValueTask"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Threading::Tasks::ValueTask. Παρέχει ένα awaitable αποτέλεσμα μιας ασύγχρονης λειτουργίας σε C++."
type: docs
weight: 500
url: /el/cpp/system.threading.tasks/valuetask/
---
## ValueTask class


Παρέχει ένα αναμονή-αποτέλεσμα μιας ασύγχρονης λειτουργίας.

```cpp
class ValueTask : public System::IEquatable<ValueTask>,
                  public System::Details::BoxableObjectBase
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AsTask](./astask/)() const | Μετατρέπει αυτό το [ValueTask](./) σε κοινό δείκτη (shared pointer) προς [Task](../task/). |
| [ConfigureAwait](./configureawait/)(bool) const | Διαμορφώνει έναν awaiter για αυτό το task. |
| [Equals](./equals/)(ValueTask) override | Καθορίζει εάν αυτή η παρουσία ισούται με άλλη παρουσία του [ValueTask](./). |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Καθορίζει εάν αυτή η παρουσία ισούται με άλλο αντικείμενο. |
| [get_IsCanceled](./get_iscanceled/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν το task ολοκληρώθηκε λόγω ακύρωσης. |
| [get_IsCompleted](./get_iscompleted/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν το task έχει ολοκληρωθεί. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν το task ολοκληρώθηκε επιτυχώς. |
| [get_IsFaulted](./get_isfaulted/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν το task ολοκληρώθηκε λόγω μη επεξεργασμένης εξαίρεσης. |
| [GetAwaiter](./getawaiter/)() const | Λαμβάνει έναν awaiter για αυτό το task ώστε να υποστηρίζει εκφράσεις await. |
| [operator!=](./operator!=/)(const ValueTask\&) const | Τελεστής ανισότητας για το [ValueTask](./). |
| [operator==](./operator==/)(const ValueTask\&) const | Τελεστής ισότητας για το [ValueTask](./). |
| [ValueTask](./valuetask/)() | Δημιουργεί ένα κενό, μη αρχικοποιημένο [ValueTask](./). |
| [ValueTask](./valuetask/)(const TaskPtr\&) | Δημιουργεί ένα [ValueTask](./) από κοινό δείκτη (shared pointer) προς ένα [Task](../task/). |
## Δείτε επίσης

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
