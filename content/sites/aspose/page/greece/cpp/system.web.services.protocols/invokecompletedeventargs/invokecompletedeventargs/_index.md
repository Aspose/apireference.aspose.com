---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs κατασκευαστής"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Page για C++"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs κατασκευαστής. Δημιουργεί ένα νέο αντικείμενο σε C++."
type: docs
weight: 100
url: /el/cpp/system.web.services.protocols/invokecompletedeventargs/invokecompletedeventargs/
---
## InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor


Δημιουργεί μια νέα παρουσία.

```cpp
System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs(Exception error, bool cancelled, System::SharedPtr<Object> userState, System::ArrayPtr<System::SharedPtr<Object>> results)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| σφάλμα | Exception | Οποιοδήποτε σφάλμα που εμφανίστηκε κατά τη διάρκεια μιας ασύγχρονης λειτουργίας. |
| ακυρώθηκε | bool | Μια τιμή που υποδεικνύει εάν μια ασύγχρονη λειτουργία είναι ακυρωμένη. |
| userState | System::SharedPtr\<Object\> | Το προαιρετικό αντικείμενο κατάστασης που παρέχεται από τον χρήστη και περνιέται στη μέθοδο [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../../system.componentmodel/backgroundworker/runworkerasync/)([System.Object](../../../system/object/)). |
| αποτελέσματα | System::ArrayPtr\<System::SharedPtr\<Object\>\> | Μια συλλογή αποτελεσμάτων ασύγχρονης λειτουργίας. |

## Δείτε επίσης

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [InvokeCompletedEventArgs](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Page for C++](../../../)
