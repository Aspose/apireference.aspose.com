---
title: "System::Threading::Tasks::Task κλάση"
linktitle: "Task"
second_title: "Aspose.Page για C++"
description: "System::Threading::Tasks::Task κλάση. Αντιπροσωπεύει μια ασύγχρονη λειτουργία που μπορεί να περιμένει και να συντίθεται με άλλες εργασίες σε C++."
type: docs
weight: 300
url: /el/cpp/system.threading.tasks/task/
---
## Task class


Αντιπροσωπεύει μια ασύγχρονη λειτουργία που μπορεί να περιμένει και να συντίθεται με άλλες εργασίες.

```cpp
class Task : public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Activate](./activate/)(TaskScheduler *) | Ενεργοποιεί την εργασία για εκτέλεση σε έναν προγραμματιστή. |
| [AddContinuation](./addcontinuation/)(const Action<>\&) | Προσθέτει μια ενέργεια συνέχειας που θα εκτελεστεί μετά την ολοκλήρωση. |
| [Complete](./complete/)() | Σημαδεύει την εργασία ως ολοκληρωμένη και ολοκληρώνει την εργασία. |
| [ConfigureAwait](./configureawait/)(bool) const | Διαμορφώνει πώς οι αναμονές σε αυτήν την εργασία πρέπει να συμπεριφέρονται σχετικά με τη σύλληψη του πλαισίου. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | Δημιουργεί μια συνέχιση που εκτελείται όταν η εργασία ολοκληρώνεται. |
| [Dispose](./dispose/)() override | Απελευθερώνει τους πόρους που σχετίζονται με την εργασία. |
| [Execute](./execute/)() | Εκτελεί τη λειτουργία της εργασίας. |
| [get_AsyncState](./get_asyncstate/)() const | Αποκτά το αντικείμενο κατάστασης που ορίζεται από τον χρήστη και σχετίζεται με την εργασία. |
| static [get_CompletedTask](./get_completedtask/)() | Αποκτά μια ολοκληρωμένη εργασία (singleton) |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Id](./get_id/)() const | Αποκτά το αναγνωριστικό για την εργασία. |
| [get_IsCanceled](./get_iscanceled/)() const | Αποκτά αν η εργασία ολοκληρώθηκε λόγω ακύρωσης. |
| [get_IsCompleted](./get_iscompleted/)() const | Αποκτά αν η εργασία έχει ολοκληρωθεί. |
| [get_IsFaulted](./get_isfaulted/)() const | Αποκτά αν η εργασία ολοκληρώθηκε λόγω μη επεξεργασμένης εξαίρεσης. |
| [get_Scheduler](./get_scheduler/)() const | Αποκτά τον προγραμματιστή που σχετίζεται με αυτήν την εργασία. |
| [get_Status](./get_status/)() const | Αποκτά την τρέχουσα κατάσταση της εργασίας. |
| [GetAwaiter](./getawaiter/)() const | Αποκτά έναν awaiter για αυτήν την εργασία για χρήση με Await. |
| [RunSynchronously](./runsynchronously/)() | Εκτελεί την εργασία συγχρονισμένα στο τρέχον νήμα. |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | Εκτελεί την εργασία συγχρονισμένα χρησιμοποιώντας τον καθορισμένο προγραμματιστή. |
| [set_Function](./set_function/)(const FunctionT\&) | Ορίζει τη εσωτερική συνάρτηση για εκτέλεση. |
| [set_Scheduler](./set_scheduler/)(TaskScheduler *) | Ορίζει το πρόγραμμα προγραμματισμού που σχετίζεται με αυτήν την εργασία. |
| [set_Status](./set_status/)(TaskStatus) | Ορίζει την κατάσταση της εργασίας. |
| [Start](./start/)() | Ξεκινά την εκτέλεση της εργασίας χρησιμοποιώντας το προεπιλεγμένο πρόγραμμα προγραμματισμού. |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | Ξεκινά την εκτέλεση της εργασίας χρησιμοποιώντας το καθορισμένο πρόγραμμα προγραμματισμού. |
| [Task](./task/)(const Action<>\&) | Δημιουργεί ένα [Task](./) με μια ενέργεια για εκτέλεση. |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | Δημιουργεί ένα [Task](./) με μια ενέργεια και διακριτικό ακύρωσης. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | Δημιουργεί ένα [Task](./) με ενέργεια που διατηρεί κατάσταση και αντικείμενο κατάστασης. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | Δημιουργεί ένα [Task](./) με ενέργεια που διατηρεί κατάσταση, αντικείμενο κατάστασης και διακριτικό ακύρωσης. |
| [Task](./task/)() | Εσωτερικός κατασκευαστής για δημιουργία μη αρχικοποιημένων εργασιών. |
| [Wait](./wait/)(const CancellationToken\&) const | Περιμένει την ολοκλήρωση της εργασίας με υποστήριξη ακύρωσης. |
| [Wait](./wait/)() const | Περιμένει την ολοκλήρωση της εργασίας. |
| [~Task](./~task/)() | Καταστροφέας. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [FunctionT](./functiont/) | Εσωτερική υλοποίηση. Δεν προορίζεται για κώδικα χρήστη. |
## Παρατηρήσεις


Παρέχει μια υλοποίηση C++ παρόμοια με το [System.Threading.Tasks.Task](./) στο .NET, υποστηρίζοντας ακύρωση, συνέχειες και μοτίβα async/await.
## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
