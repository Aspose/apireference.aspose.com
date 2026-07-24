---
title: "System::WeakReference< T > class"
linktitle: "WeakReference< T >"
second_title: "Aspose.Page για C++"
description: "System::WeakReference< T > class. Αντιπροσωπεύει μια αδύναμη αναφορά, η οποία αναφέρεται σε ένα αντικείμενο ενώ επιτρέπει ακόμη τη διαγραφή του αντικειμένου σε C++."
type: docs
weight: 7700
url: /el/cpp/system/weakreference_t_/
---
## WeakReference< T > class


Αντιπροσωπεύει μια αδύναμη αναφορά, η οποία αναφέρεται σε ένα αντικείμενο ενώ εξακολουθεί να επιτρέπει τη διαγραφή του αντικειμένου.

```cpp
template<typename T>class WeakReference< T > : public System::Object
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος ενός αναφερόμενου αντικειμένου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [operator!=](./operator!=/)(std::nullptr_t) const | Ελέγχει αν το αναφερόμενο αντικείμενο δεν είναι null. |
| [operator!=](./operator!=/)(const WeakReference\<T\>\&) const | Συγκρίνει το αναφερόμενο αντικείμενο με μια άλλη παρουσία της κλάσης [WeakReference](../weakreference/). |
| [operator==](./operator==/)(std::nullptr_t) const | Ελέγχει αν το αναφερόμενο αντικείμενο είναι null. |
| [operator==](./operator==/)(const WeakReference\<T\>\&) const | Συγκρίνει το αναφερόμενο αντικείμενο με μια άλλη παρουσία της κλάσης [WeakReference](../weakreference/). |
| [reset](./reset/)() |  |
| [SetTarget](./settarget/)(const SmartPtr\<T\>\&) | Ορίζει το αντικείμενο (τον στόχο) στο οποίο αναφέρεται το τρέχον αντικείμενο [WeakReference](../weakreference/). |
| [TryGetTarget](./trygettarget/)(const SmartPtr\<T\>\&) const | Λαμβάνει το αντικείμενο (τον στόχο) στο οποίο αναφέρεται το τρέχον αντικείμενο [WeakReference](../weakreference/). |
| [WeakReference](./weakreference/)() | Προεπιλεγμένος κατασκευαστής. |
| [WeakReference](./weakreference/)(std::nullptr_t) | Κατασκευαστής από nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&) | Αρχικοποιεί μια νέα παρουσία της κλάσης [WeakReference](../weakreference/), αναφέροντας το καθορισμένο αντικείμενο. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&, bool) | Αρχικοποιεί μια νέα παρουσία της κλάσης [WeakReference](../weakreference/), αναφέροντας το καθορισμένο αντικείμενο. |

## Δείτε επίσης

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
