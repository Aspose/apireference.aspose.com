---
title: "Κλάση System::Threading::Tasks::ResultValueTask"
linktitle: "ResultValueTask"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Threading::Tasks::ResultValueTask. Αντιπροσωπεύει έναν υβριδικό τύπο παρόμοιο με εργασία που μπορεί να περιβάλλει είτε μια άμεση τιμή αποτελέσματος είτε ένα ResultTask<T> σε C++."
type: docs
weight: 200
url: /el/cpp/system.threading.tasks/resultvaluetask/
---
## ResultValueTask class


Αντιπροσωπεύει έναν υβριδικό τύπο παρόμοιο με εργασία που μπορεί να περιβάλλει είτε μια άμεση τιμή αποτελέσματος είτε ένα [ResultTask<T>](../resulttask/).

```cpp
template<typename T>class ResultValueTask : public System::IEquatable<ResultValueTask<T>>,
                                            public System::Details::BoxableObjectBase
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος του αποτελέσματος που παράγεται από την εργασία. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AsTask](./astask/)() const | Μετατρέπει αυτό το [ResultValueTask](./) σε κοινό δείκτη προς [ResultTask<T>](../resulttask/). |
| [ConfigureAwait](./configureawait/)(bool) const | Διαμορφώνει έναν awaiter για αυτό το task. |
| [Equals](./equals/)(ResultValueTask) override | Καθορίζει εάν αυτή η παρουσία ισούται με άλλη παρουσία του [ResultValueTask](./). |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Καθορίζει εάν αυτή η παρουσία ισούται με άλλο αντικείμενο. |
| [get_IsCanceled](./get_iscanceled/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν το task ολοκληρώθηκε λόγω ακύρωσης. |
| [get_IsCompleted](./get_iscompleted/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν το task έχει ολοκληρωθεί. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν το task ολοκληρώθηκε επιτυχώς. |
| [get_IsFaulted](./get_isfaulted/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν το task ολοκληρώθηκε λόγω μη επεξεργασμένης εξαίρεσης. |
| [get_Result](./get_result/)() const | Αποκτά το αποτέλεσμα της ολοκληρωμένης εργασίας. |
| [GetAwaiter](./getawaiter/)() const | Λαμβάνει έναν awaiter για αυτό το task ώστε να υποστηρίζει εκφράσεις await. |
| [operator!=](./operator!=/)(const ResultValueTask\&) const | Τελεστής ανισότητας για το [ResultValueTask](./). |
| [operator==](./operator==/)(const ResultValueTask\&) const | Τελεστής ισότητας για το [ResultValueTask](./). |
| [ResultValueTask](./resultvaluetask/)() | Δημιουργεί ένα κενό, μη αρχικοποιημένο [ResultValueTask](./). |
| [ResultValueTask](./resultvaluetask/)(const T\&) | Δημιουργεί ένα ολοκληρωμένο [ResultValueTask](./) με το καθορισμένο αποτέλεσμα. |
| [ResultValueTask](./resultvaluetask/)(const RTaskPtr\<T\>\&) | Δημιουργεί ένα [ResultValueTask](./) από κοινό δείκτη προς ένα [ResultTask<T>](../resulttask/). |
## Παρατηρήσεις


[ResultValueTask](./) combines the benefits of [ValueTask](../valuetask/) (reduced allocations for synchronous results) with the ability to wrap existing [ResultTask<T>](../resulttask/) objects. It provides awaitable interface and various task status inspection methods. 
## Δείτε επίσης

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
