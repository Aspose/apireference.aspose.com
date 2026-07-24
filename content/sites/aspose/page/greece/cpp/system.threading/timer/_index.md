---
title: "System::Threading::Timer class"
linktitle: "Timer"
second_title: "Aspose.Page για C++"
description: "System::Threading::Timer class. Κλάση χρονομέτρου που εκτελεί το αντικείμενο εργασίας σε ξεχωριστό νήμα μετά από καθυστέρηση. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή με τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα στο C++."
type: docs
weight: 1500
url: /el/cpp/system.threading/timer/
---
## Timer class


[Timer](./) class that executes job item in separate thread after delay. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Timer : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Change](./change/)(int64_t, int64_t) | Επαναπρογραμματίζει ή ακυρώνει το χρονομετρητή. |
| [Change](./change/)(System::TimeSpan, System::TimeSpan) | Επαναπρογραμματίζει ή ακυρώνει το χρονομετρητή. |
| [Dispose](./dispose/)() | Ακυρώνει το χρονομετρητή. |
| [Timer](./timer/)(TimerCallback) | Κατασκευαστής. |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) | Κατασκευαστής. |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) | Κατασκευαστής. |
## Παρατηρήσεις



```cpp
#include "system/threading/thread.h"
#include "system/threading/timer.h"
#include "system/object.h"
#include "system/smart_ptr.h"
#include <iostream>

int main()
{
  using namespace System::Threading;

  auto number = 0;
  auto timer = System::MakeObject<Timer>([&number](System::SharedPtr<System::Object> object) -> void {
    std::cout << ++number << std::endl;
  }, nullptr, 0, 200);

  Thread::Sleep(1000);
  timer->Dispose();

  return 0;
}
/*
This code example produces the following output:
1
2
3
4
5
*/
```

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
