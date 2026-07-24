---
title: "System::Threading::ThreadPoolImpl κλάση"
linktitle: "ThreadPoolImpl"
second_title: "Aspose.Page για C++"
description: "System::Threading::ThreadPoolImpl κλάση. Εσωτερικά δεδομένα της πισίνας νημάτων. Αυτό είναι ένας τύπος μονοσύνολο με διαχείριση μνήμης που γίνεται από λειτουργία(ες) πρόσβασης. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του απευθείας σε C++."
type: docs
weight: 1400
url: /el/cpp/system.threading/threadpoolimpl/
---
## ThreadPoolImpl class


[Thread](../thread/) pool internal data. This is a singleton type with memory management done by access function(s). You should never create instances of it directly.

```cpp
class ThreadPoolImpl
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | Λαμβάνει τον αριθμό των διαθέσιμων νημάτων. |
| static [GetInitialized](./getinitialized/)() | Λαμβάνει το μονοσύνολο κατάστασης αρχικοποίησης. |
| [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | Λαμβάνει τον μέγιστο αριθμό ταυτόχρονων νημάτων. |
| [GetMinThreads](./getminthreads/)(int\&, int\&) | Λαμβάνει τον ελάχιστο αριθμό νημάτων που δημιουργούνται από την πισίνα. |
| [JoinAll](./joinall/)() | Περιμένει όλα τα ιδιόκτητα νήματα. Περιμένει επ' άπειρον. |
| [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | Προσθέτει στοιχείο εργασίας στην ουρά. |
| [SetMaxThreads](./setmaxthreads/)(int, int) | Ορίζει τον αριθμό των νημάτων που ανήκουν στην πισίνα. |
| [SetMinThreads](./setminthreads/)(int, int) | Ορίζει τον ελάχιστο αριθμό των νημάτων που ανήκουν στην πισίνα. |
| [ThreadPoolImpl](./threadpoolimpl/)() | Κατασκευαστής. |
| [~ThreadPoolImpl](./~threadpoolimpl/)() | Καταστροφέας. Ενώνει όλα τα νήματα εάν δεν είχαν ακόμη τερματιστεί. |
## Δείτε επίσης

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
