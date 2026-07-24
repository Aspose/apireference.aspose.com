---
title: "Κλάση System::ExceptionWrapper"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Page για C++"
description: "Κλάση System::ExceptionWrapper. Πρότυπο που αντιπροσωπεύει το περιτύλιγμα εξαιρέσεων που προέρχονται από την κλάση Exception σε C++."
type: docs
weight: 2600
url: /el/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


Πρότυπο που αντιπροσωπεύει το περιτύλιγμα των εξαιρέσεων που προέρχονται από την κλάση [Exception](../exception/).

```cpp
template<typename T>class ExceptionWrapper
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | Δημιουργεί μια μηδενική‑υπόδειξη της κλάσης [ExceptionWrapper](./) που δεν αντιπροσωπεύει καμία εξαίρεση. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | Δημιουργεί μια υπόδειξη της κλάσης [ExceptionWrapper](./) που περιέχει τον περασμένο δείκτη. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | Κατασκευαστής αντιγραφής. |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | Κατασκευαστής μετακίνησης. |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | Κατασκευαστής που προωθεί τις παραμέτρους στους κατασκευαστές της κλάσης [Exception](../exception/) και δημιουργεί έξυπνο δείκτη που κρατά μια νέα υπόδειξη της κλάσης [Exception](../exception/). |
| static [operator new](./operatornew/)(std::size_t) |  |
| static [operator new[]](./operatornew[]/)(std::size_t) |  |
| [operator SharedPtr< Object >](./operatorsharedptr_object_/)() | Ανώνυμος τελεστής μετατροπής σε [SharedPtr<Object>](../sharedptr/) |
| [operator->](./operator-_/)() const | Επιτρέπει την πρόσβαση στα μέλη του αντικειμένου [Exception](../exception/). |
| [operator=](./operator=/)(const ExceptionWrapper\&) | Τελεστής ανάθεσης. |
| [operator=](./operator=/)(ExceptionWrapper\&&) | Τελεστής ανάθεσης μετακίνησης. |
| static [Type](./type/)() | Συντόμευση για λήψη του αντικειμένου [System::TypeInfo](../typeinfo/) για τον τύπο [Exception](../exception/). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [ExceptionType](./exceptiontype/) | Χρησιμοποιείται για συναρτήσεις μετατροπής. |
## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
