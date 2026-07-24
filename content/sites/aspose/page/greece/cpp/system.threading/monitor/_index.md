---
title: "System::Threading::Monitor class"
linktitle: "Monitor"
second_title: "Aspose.Page για C++"
description: "System::Threading::Monitor class. Η κλάση Monitor παρέχει έναν μηχανισμό που συγχρονίζει την πρόσβαση σε αντικείμενα σε C++."
type: docs
weight: 800
url: /el/cpp/system.threading/monitor/
---
## Monitor class


Η κλάση [Monitor](./) παρέχει έναν μηχανισμό που συγχρονίζει την πρόσβαση σε αντικείμενα.

```cpp
class Monitor : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [Enter](./enter/)(const SharedPtr\<Object\>\&) | Αποκτά αποκλειστικό κλείδωμα σε ένα καθορισμένο αντικείμενο. |
| static [Enter](./enter/)(const System::SharedPtr\<Object\>\&, bool\&) | Αποκτά αποκλειστικό κλείδωμα στο καθορισμένο αντικείμενο και ατομικά ορίζει μια τιμή που υποδεικνύει εάν το κλείδωμα ελήφθη. |
| static [Exit](./exit/)(const SharedPtr\<Object\>\&) | Απελευθερώνει το αποκλειστικό κλείδωμα στο καθορισμένο αντικείμενο. |
| static [IsEntered](./isentered/)(const System::SharedPtr\<Object\>\&) | Καθορίζει εάν το τρέχον νήμα κατέχει το κλείδωμα στο καθορισμένο αντικείμενο. |
| static [Pulse](./pulse/)(const SharedPtr\<Object\>\&) | Ειδοποιεί ένα νήμα στην ουρά αναμονής για μια αλλαγή στην κατάσταση του κλειδωμένου αντικειμένου. Δεν υλοποιείται. |
| static [PulseAll](./pulseall/)(const SharedPtr\<Object\>\&) | Ειδοποιεί όλα τα νήματα που περιμένουν για μια αλλαγή στην κατάσταση του αντικειμένου. Δεν υλοποιείται. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&) | Προσπαθεί να αποκτήσει αποκλειστικό κλείδωμα στο καθορισμένο αντικείμενο. Δεν υλοποιείται. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, bool\&) | Προσπαθεί να αποκτήσει αποκλειστικό κλείδωμα στο καθορισμένο αντικείμενο και ατομικά ορίζει μια τιμή που υποδεικνύει εάν το κλείδωμα ελήφθη. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, int32_t) | Προσπαθεί, για τον καθορισμένο αριθμό χιλιοστών του δευτερολέπτου, να αποκτήσει αποκλειστικό κλείδωμα στο καθορισμένο αντικείμενο. Δεν υλοποιείται. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, TimeSpan) | Προσπαθεί, για το καθορισμένο χρονικό διάστημα, να αποκτήσει αποκλειστικό κλείδωμα στο καθορισμένο αντικείμενο. Δεν υλοποιείται. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, int32_t, bool\&) | Προσπάθειες, για το καθορισμένο χρονικό διάστημα, να αποκτηθεί αποκλειστικό κλείδωμα στο καθορισμένο αντικείμενο, και ατομικά ορίζει μια τιμή που υποδεικνύει εάν το κλείδωμα ελήφθη. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, TimeSpan, bool\&) | Προσπάθειες, για το καθορισμένο χρονικό διάστημα, να αποκτηθεί αποκλειστικό κλείδωμα στο καθορισμένο αντικείμενο, και ατομικά ορίζει μια τιμή που υποδεικνύει εάν το κλείδωμα ελήφθη. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t, bool) | Απελευθερώνει το κλείδωμα σε ένα αντικείμενο και αποκλείει το τρέχον νήμα μέχρι να επανακτήσει το κλείδωμα. Εάν το καθορισμένο διάστημα λήξης λήξει, το νήμα εισέρχεται στην ουρά ετοιμότητας. Προαιρετικά εξέρχεται από τον τομέα συγχρονισμού για το συγχρονισμένο πλαίσιο πριν από την αναμονή και επανακτά τον τομέα μετά. Δεν έχει υλοποιηθεί. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan, bool) | Απελευθερώνει το κλείδωμα σε ένα αντικείμενο και αποκλείει το τρέχον νήμα μέχρι να επανακτήσει το κλείδωμα. Εάν το καθορισμένο διάστημα λήξης λήξει, το νήμα εισέρχεται στην ουρά ετοιμότητας. Προαιρετικά εξέρχεται από τον τομέα συγχρονισμού για το συγχρονισμένο πλαίσιο πριν από την αναμονή και επανακτά τον τομέα μετά. Δεν έχει υλοποιηθεί. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t) | Απελευθερώνει το κλείδωμα σε ένα αντικείμενο και αποκλείει το τρέχον νήμα μέχρι να επανακτήσει το κλείδωμα. Εάν το καθορισμένο διάστημα λήξης λήξει, το νήμα εισέρχεται στην ουρά ετοιμότητας. Δεν έχει υλοποιηθεί. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan) | Απελευθερώνει το κλείδωμα σε ένα αντικείμενο και αποκλείει το τρέχον νήμα μέχρι να επανακτήσει το κλείδωμα. Εάν το καθορισμένο διάστημα λήξης λήξει, το νήμα εισέρχεται στην ουρά ετοιμότητας. Δεν έχει υλοποιηθεί. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&) | Απελευθερώνει το κλείδωμα σε ένα αντικείμενο και αποκλείει το τρέχον νήμα μέχρι να επανακτήσει το κλείδωμα. Δεν έχει υλοποιηθεί. |
## Παρατηρήσεις



```cpp
#include "system/threading/monitor.h"
#include "system/threading/thread.h"
#include "system/smart_ptr.h"
#include "system/string.h"
#include <iostream>
#include <vector>

int main()
{
  using namespace System::Threading;

  const auto threadsCount = 3;
  std::cout << "Threads count: " << threadsCount << std::endl;
  auto locker = System::MakeObject<System::Object>();
  int x = 0;

  std::vector<System::SharedPtr<Thread>> threads;
  threads.reserve(threadsCount);
  for (auto i = 0; i < threadsCount; ++i)
  {
    threads.emplace_back(System::MakeObject<Thread>([&x, &locker]() -> void {
      Monitor::Enter(locker);

      x = 1;
      for (auto i = 0; i < 5; ++i)
      {
        std::cout << Thread::get_CurrentThread()->get_Name() << ": " << x++ << std::endl;
        Thread::Sleep(100);
      }

      Monitor::Exit(locker);
    }));
    threads.back()->set_Name(System::String("Thread " + std::to_string(i)));
    threads.back()->Start();
  }

  Thread::Sleep(threadsCount * 100);

  for (auto& thread : threads)
  {
    thread->Join();
  }

  return 0;
}
/*
This code example produces the following output:
Threads count: 3
Thread 0: 1
Thread 0: 2
Thread 0: 3
Thread 0: 4
Thread 0: 5
Thread 1: 1
Thread 1: 2
Thread 1: 3
Thread 1: 4
Thread 1: 5
Thread 2: 1
Thread 2: 2
Thread 2: 3
Thread 2: 4
Thread 2: 5
*/
```

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
