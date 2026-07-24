---
title: "System::Threading::Mutex κλάση"
linktitle: "Mutex"
second_title: "Aspose.Page για C++"
description: "System::Threading::Mutex κλάση. Υλοποίηση Mutex. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 900
url: /el/cpp/system.threading/mutex/
---
## Mutex class


[Mutex](./) implemnetation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Mutex : public System::Threading::WaitHandle
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Mutex](./mutex/)() | Πληροφορίες RTTI. |
| [Mutex](./mutex/)(bool) | Κατασκευαστής. |
| [Mutex](./mutex/)(bool, const String\&) | Κατασκευαστής. |
| [ReleaseMutex](./releasemutex/)() | Απελευθερώνει το mutex. |
| static [Remove](./remove/)(const String\&) | Διαγράφει ένα ονομαστικό mutex από το σύστημα. |
| virtual [Reset](./reset/)() | Επαναφέρει την κατάσταση του mutex. Δεν έχει υλοποιηθεί. |
| virtual [Set](./set/)() | Ορίζει το mutex σε κατάσταση σήματος. Δεν έχει υλοποιηθεί. |
| [WaitOne](./waitone/)() override | Κλειδώνει το mutex. Εκτελεί απεριόριστη αναμονή εάν είναι απαραίτητο. |
| [WaitOne](./waitone/)(int) override | Κλειδώνει το mutex. Εκτελεί αναμονή εάν είναι απαραίτητο. |
| [WaitOne](./waitone/)(TimeSpan) override | Κλειδώνει το mutex. Εκτελεί αναμονή εάν είναι απαραίτητο. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Ειδική τιμή που θα επιστραφεί από τη συνάρτηση, διαφορετικά επιστρέφει το δείκτη του αντικειμένου που έχει σήμα στον πίνακα, εάν το χρονικό όριο υπερβεί και τίποτα δεν σήμα. |
## Παρατηρήσεις



```cpp
#include "system/threading/mutex.h"
#include "system/threading/thread.h"
#include "system/console.h"
#include "system/convert.h"
#include "system/smart_ptr.h"
#include "system/string.h"

int main()
{
  auto mutex = System::MakeObject<System::Threading::Mutex>();

  System::String str;

  const int THREADS_COUNT = 3;
  std::vector<System::SharedPtr<System::Threading::Thread>> threads;
  threads.reserve(THREADS_COUNT);

  for (auto i = 0; i < THREADS_COUNT; ++i)
  {
    threads.push_back(System::MakeObject<System::Threading::Thread>([&mutex, &str]()
    {
      mutex->WaitOne();

      str += u"Thread " + System::Convert::ToString(System::Threading::Thread::GetCurrentThreadId()) + u" started." + System::Environment::get_NewLine();

      System::Threading::Thread::Sleep(200);

      str += u"Thread " + System::Convert::ToString(System::Threading::Thread::GetCurrentThreadId()) + u" ended." + System::Environment::get_NewLine();

      mutex->ReleaseMutex();
    }));

    threads[i]->Start();
  }

  System::Threading::Thread::Sleep(700);

  System::Console::WriteLine(str);

  return 0;
}
/*
This code example produces the following output:
Thread 1 started.
Thread 1 ended.
Thread 2 started.
Thread 2 ended.
Thread 3 started.
Thread 3 ended.
*/
```

## Δείτε επίσης

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
