---
title: "System::Threading::TimerQueue class"
linktitle: "TimerQueue"
second_title: "Aspose.Page για C++"
description: "System::Threading::TimerQueue class. Ουρά που διαχειρίζεται αντικείμενα Timer. Αυτό είναι απλώς μια υλοποίηση. Τα αντικείμενα Timer εγγράφονται εκεί από μόνα τους, δεν χρειάζεται να το κάνετε για να τα χρησιμοποιήσετε - χρησιμοποιήστε το API της κλάσης Timer αντί αυτού. Αυτός είναι ένας τύπος singleton με διαχείριση μνήμης που γίνεται μέσω λειτουργιών πρόσβασης. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του άμεσα στο C++."
type: docs
weight: 1600
url: /el/cpp/system.threading/timerqueue/
---
## TimerQueue class


Ουρά που διαχειρίζεται αντικείμενα [Timer](../timer/). Αυτό είναι μόνο μια υλοποίηση. Τα αντικείμενα [Timer](../timer/) εγγράφονται εκεί από μόνα τους, δεν χρειάζεται να το κάνετε για να τα χρησιμοποιήσετε - χρησιμοποιήστε το API της κλάσης [Timer](../timer/) αντί αυτού. Αυτός είναι ένας τύπος singleton με διαχείριση μνήμης που γίνεται μέσω της συνάρτησης πρόσβασης. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του απευθείας.

```cpp
class TimerQueue
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(Timer *) | Καταχωρεί το χρονομετρητή στην ουρά. |
| [Delete](./delete/)(Timer *) | Διαγράφει το χρονομετρητή από την ουρά. |
| static [GetInstance](./getinstance/)() | Υλοποίηση singleton. |
| static [JoinWorkerThread](./joinworkerthread/)() | Ενώνει το νήμα εργασίας. Περιμένει επ' άπειρο αν απαιτείται. |
| [operator=](./operator=/)(const TimerQueue\&) | Δεν επιτρέπεται η αντιγραφή. |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | Δεν επιτρέπεται η αντιγραφή. |
## Δείτε επίσης

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
