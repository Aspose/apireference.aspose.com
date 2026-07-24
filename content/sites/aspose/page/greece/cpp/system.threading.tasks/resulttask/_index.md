---
title: "System::Threading::Tasks::ResultTask κλάση"
linktitle: "ResultTask"
second_title: "Aspose.Page για C++"
description: "System::Threading::Tasks::ResultTask κλάση. Μια εξειδίκευση Task που επιστρέφει μια τιμή αποτελέσματος μετά την ολοκλήρωση σε C++."
type: docs
weight: 100
url: /el/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


Μια εξειδίκευση [Task](../task/) που επιστρέφει μια τιμή αποτελέσματος μετά την ολοκλήρωση.

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος της τιμής αποτελέσματος που επιστρέφεται από το task |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ConfigureAwait](./configureawait/)(bool) const | Ρυθμίζει πώς οι αναμονές σε αυτό το task αποτελέσματος πρέπει να συμπεριφέρονται σχετικά με τη σύλληψη του πλαισίου. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | Δημιουργεί μια συνέχεια που εκτελείται όταν ολοκληρώνεται το task αποτελέσματος. |
| [get_Result](./get_result/)() const | Αποκτά το αποτέλεσμα της ασύγχρονης λειτουργίας. |
| [GetAwaiter](./getawaiter/)() const | Αποκτά έναν awaiter για αυτό το task αποτελέσματος για χρήση με Await. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | Δημιουργεί ένα [ResultTask](./) με μια συνάρτηση που επιστρέφει μια τιμή. |
| [ResultTask](./resulttask/)() | Εσωτερική υλοποίηση. Δεν προορίζεται για κώδικα χρήστη. |
| [ResultTask](./resulttask/)(const T\&) | Εσωτερικός κατασκευαστής για τη δημιουργία task αποτελέσματος με καθορισμένο αποτέλεσμα. |
| [set_Result](./set_result/)(const T\&) | Ορίζει την τιμή αποτελέσματος για το task. |
## Παρατηρήσεις



Αντιπροσωπεύει μια ασύγχρονη λειτουργία που παράγει ένα αποτέλεσμα, παρόμοια με το [System.Threading.Tasks.Task<TResult>](../task/) στο .NET
## Δείτε επίσης

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
