---
title: "System::Delegate< ReturnType(ArgumentTypes...)> κλάση"
linktitle: "Delegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Page για C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)> κλάση. Αντιπροσωπεύει έναν δείκτη σε συνάρτηση, μέθοδο ή αντικείμενο συνάρτησης. Αυτός ο τύπος θα πρέπει να εκχωρείται στη στοίβα και να περνάται στις συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση System::SmartPtr για τη διαχείριση αντικειμένων αυτού του τύπου σε C++."
type: docs
weight: 2100
url: /el/cpp/system/delegate_returntype(argumenttypes...)_/
---
## Delegate< ReturnType(ArgumentTypes...)> class


Αντιπροσωπεύει έναν δείκτη σε συνάρτηση, μέθοδο ή αντικείμενο συνάρτησης. Αυτός ο τύπος θα πρέπει να εκχωρείται στη στοίβα και να περνάται στις συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση [System::SmartPtr](../smartptr/) για τη διαχείριση αντικειμένων αυτού του τύπου.

```cpp
template<class ReturnType,class...>class Delegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Parameter | Περιγραφή |
| --- | --- |
| ReturnType | Ο τύπος επιστροφής μιας συνάρτησης, μεθόδου ή αντικειμένου συνάρτησης του οποίου αντιπροσωπεύεται από την κλάση |
| ArgumentTypes | Η λίστα ορισμάτων μιας συνάρτησης, μεθόδου ή αντικειμένου συνάρτησης του οποίου αντιπροσωπεύεται από την κλάση |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Delegate](./delegate/)() | Προεπιλεγμένος κατασκευαστής. Δημιουργεί το αντικείμενο delegate που δεν δείχνει σε τίποτα. |
| [Delegate](./delegate/)(const Delegate\&) |  |
| [Delegate](./delegate/)(Delegate\&&) | Μετακινούμενος κατασκευαστής αντιγραφής. Αναλαμβάνει την ιδιοκτησία μιας οντότητας στην οποία δείχνει ο καθορισμένος delegate. |
| [Delegate](./delegate/)(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) | Κατασκευαστής. Δημιουργεί ένα αντικείμενο delegate από τον καθορισμένο δείκτη σε ελεύθερη συνάρτηση ή στατική μέθοδο. |
| [Delegate](./delegate/)(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) | Κατασκευαστής. Δημιουργεί ένα delegate από τον καθορισμένο δείκτη στο αντικείμενο συνάρτησης που δημιουργείται από το std::bind(). |
| [Delegate](./delegate/)(int, T\&) | Κατασκευαστής. Δημιουργεί ένα delegate από το καθορισμένο αντικείμενο συνάρτησης. |
| [Delegate](./delegate/)(long, T\&&) | Μετακινούμενος κατασκευαστής. Δημιουργεί ένα delegate από το καθορισμένο αντικείμενο συνάρτησης. |
| [Delegate](./delegate/)(MemberType ClassType::*, ClassType *) | Κατασκευαστής. Δημιουργεί ένα delegate που δείχνει στη καθορισμένη μη-στατική μέθοδο του καθορισμένου αντικειμένου. |
| [Delegate](./delegate/)(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) | Κατασκευαστής. Δημιουργεί ένα delegate που δείχνει στη καθορισμένη μη-στατική μέθοδο του καθορισμένου αντικειμένου. |
| [Delegate](./delegate/)(std::function\<R(Args...)>) | Δημιουργεί ένα αντικείμενο delegate που δείχνει σε ένα αντικείμενο συνάρτησης std::function. |
| [Empty](./empty/)() const | Καθορίζει αν το τρέχον αντικείμενο delegate είναι κενό, π.χ. δεν δείχνει σε καμία οντότητα. |
| [operator()](./operator()/)(ArgumentTypes...) const | Καλεί μια συνάρτηση, μέθοδο ή αντικείμενο συνάρτησης στο οποίο δείχνει το τρέχον αντικείμενο delegate. |
| [operator=](./operator=/)(const Delegate\&) |  |
| [operator=](./operator=/)(Delegate\&&) | Μετακινούμενος τελεστής ανάθεσης. Αναλαμβάνει την ιδιοκτησία μιας οντότητας στην οποία δείχνει ο καθορισμένος delegate. |
| [operator==](./operator==/)(const Delegate\&) const | Συγκρίνει δύο αντικείμενα delegate για να ελέγξει αν δείχνουν στην ίδια οντότητα. |
## Παρατηρήσεις



```cpp
#include "system/delegate.h"
#include <iostream>

// Δηλώστε το delegate.
using Message = System::Delegate<void()>;

void PrintMessage()
{
  std::cout << "Hello, world!" << std::endl;
}

int main()
{
  // Αναθέστε στη μεταβλητή τη διεύθυνση της συνάρτησης PrintMessage.
  Message mes = Message(&PrintMessage);

  // Καλέστε τη συνάρτηση.
  mes();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
