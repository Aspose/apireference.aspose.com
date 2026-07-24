---
title: "System::Threading::Tasks::ResultValueTask::ResultValueTask κατασκευαστής"
linktitle: "ResultValueTask"
second_title: "Aspose.Page για C++"
description: "System::Threading::Tasks::ResultValueTask::ResultValueTask κατασκευαστής. Δημιουργεί ένα κενό, μη αρχικοποιημένο ResultValueTask σε C++."
type: docs
weight: 100
url: /el/cpp/system.threading.tasks/resultvaluetask/resultvaluetask/
---
## ResultValueTask::ResultValueTask() constructor


Δημιουργεί ένα κενό, μη αρχικοποιημένο [ResultValueTask](../).

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask()
```

## Παρατηρήσεις



Η εργασία δεν έχει ολοκληρωθεί και δεν περιέχει αποτέλεσμα. Η προσπάθεια λήψης του αποτελέσματος θα προκαλέσει εξαίρεση.

## Δείτε επίσης

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const RTaskPtr\<T\>\&) constructor


Δημιουργεί ένα [ResultValueTask](../) από έναν κοινό δείκτη σε ένα [ResultTask<T>](../../resulttask/).

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const RTaskPtr<T> &task)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| task | const RTaskPtr\<T\>\& | Η εργασία προς περιτύλιξη. Μπορεί να είναι null για μια κενή εργασία. |
## Παρατηρήσεις



Το [ResultValueTask](../) θα αντιπροσωπεύει την κατάσταση και το αποτέλεσμα της παρεχόμενης εργασίας.

## Δείτε επίσης

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const T\&) constructor


Δημιουργεί ένα ολοκληρωμένο [ResultValueTask](../) με το καθορισμένο αποτέλεσμα.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const T &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| αποτέλεσμα | const T\& | Η τιμή αποτελέσματος για να ενσωματωθεί σε μια ολοκληρωμένη εργασία. |
## Παρατηρήσεις



Αυτό δημιουργεί μια επιτυχώς ολοκληρωμένη εργασία που επιστρέφει αμέσως την τιμή.

## Δείτε επίσης

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
