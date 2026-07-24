---
title: "Κλάση System::Threading::Thread"
linktitle: "Νήμα"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Threading::Thread. Υλοποίηση νήματος. Τα αντικείμενα αυτής της κλάσης πρέπει να κατανεμηθούν μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1200
url: /el/cpp/system.threading/thread/
---
## Thread class


[Thread](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Thread : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Abort](./abort/)() | Ακυρώνει το νήμα. Δεν έχει υλοποιηθεί. |
| [get_CurrentCulture](./get_currentculture/)() | Λαμβάνει τον πολιτισμό του νήματος. |
| static [get_CurrentThread](./get_currentthread/)() | Λαμβάνει το αντικείμενο που περιγράφει το τρέχον νήμα. |
| [get_CurrentUICulture](./get_currentuiculture/)() | Λαμβάνει τον πολιτισμό διεπαφής χρήστη που χρησιμοποιείται από το νήμα. |
| [get_IsAlive](./get_isalive/)() | Ελέγχει εάν το νήμα είναι ενεργό. |
| [get_IsBackground](./get_isbackground/)() | Ελέγχει εάν το νήμα είναι παρασκηνιακό. |
| [get_IsThreadPoolThread](./get_isthreadpoolthread/)() | Ελέγχει εάν το νήμα ανήκει σε δεξαμενή νημάτων. |
| [get_ManagedThreadId](./get_managedthreadid/)() const | Λαμβάνει το αναγνωριστικό του νήματος. Μπορεί να ληφθεί από το λειτουργικό σύστημα, αλλά εάν το αναγνωριστικό νήματος του OS υπερβαίνει τα όρια του int, τα αναγνωριστικά των νημάτων μπορεί να συγκρούονται. |
| [get_Name](./get_name/)() | Λαμβάνει το όνομα του νήματος. |
| [get_ThreadState](./get_threadstate/)() | Λαμβάνει την κατάσταση του νήματος. |
| static [GetCurrentThreadId](./getcurrentthreadid/)() | Λαμβάνει το αναγνωριστικό του τρέχοντος νήματος. |
| [GetHashCode](./gethashcode/)() const override |  |
| [Interrupt](./interrupt/)() | Διακόπτει το νήμα. Δεν έχει υλοποιηθεί. |
| [Join](./join/)() | Συμμετέχει σε διαχειριζόμενο νήμα. Εκτελεί απεριόριστη αναμονή εάν απαιτείται. |
| [Join](./join/)(int) | Συμμετέχει σε διαχειριζόμενο νήμα. Εκτελεί περιορισμένη αναμονή. |
| [Join](./join/)(TimeSpan) | Συμμετέχει σε διαχειριζόμενο νήμα. Εκτελεί περιορισμένη αναμονή. |
| static [MemoryBarrier](./memorybarrier/)() | Συγχρονίζει την πρόσβαση στη μνήμη. |
| [operator=](./operator=/)(const Thread\&) | Αντιγράφει δεδομένα TLS από διαφορετικό νήμα. |
| [set_CurrentCulture](./set_currentculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Ορίζει τον πολιτισμό του νήματος. |
| [set_CurrentUICulture](./set_currentuiculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Ορίζει τον πολιτισμό διεπαφής χρήστη που χρησιμοποιείται από το νήμα. |
| [set_IsBackground](./set_isbackground/)(bool) | Ορίζει το νήμα σε παρασκήνιο ή προσκήνιο. |
| [set_Name](./set_name/)(const System::String\&) | Ορίζει το όνομα του νήματος. |
| static [Sleep](./sleep/)(int) | Σταματά το τρέχον νήμα για το καθορισμένο χρονικό όριο. |
| static [Sleep](./sleep/)(TimeSpan) | Σταματά το τρέχον νήμα για το καθορισμένο χρονικό όριο. |
| static [SpinWait](./spinwait/)(int) | Περιμένει για συγκεκριμένο αριθμό επαναλήψεων βρόχου. |
| [Start](./start/)() | Ξεκινά το νήμα χρησιμοποιώντας αντικείμενο ορίσματος null. |
| [Start](./start/)(const System::SharedPtr\<System::Object\>\&) | Ξεκινά το νήμα. |
| [Thread](./thread/)() | Κατασκευαστής. |
| [Thread](./thread/)(ThreadStart) | Κατασκευαστής. |
| [Thread](./thread/)(ParameterizedThreadStart) | Κατασκευαστής. |
| [Thread](./thread/)(Thread\&) | Κατασκευαστής αντιγραφής. |
| static [Yield](./yield/)() | Παραχωρεί το νήμα. |
| virtual [~Thread](./~thread/)() | Καταστροφέας. |
## Παρατηρήσεις



```cpp
#include "system/threading/thread.h"
#include "system/smart_ptr.h"

int main()
{
  auto thread = System::MakeObject<System::Threading::Thread>([]()
  {
    std::cout << "Child thread ID: " << System::Threading::Thread::GetCurrentThreadId() << std::endl;
    System::Threading::Thread::Sleep(200);
  });

  std::cout << "Main thread ID: " << System::Threading::Thread::GetCurrentThreadId() << std::endl;

  thread->Start();
  thread->Join();

  return 0;
}
/*
This code example produces the following output:
Main thread ID: 2
Child thread ID: 1
*/
```

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
