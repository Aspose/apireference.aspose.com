---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)> κλάση"
linktitle: "MulticastDelegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Page για C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)> κλάση. Αντιπροσωπεύει μια συλλογή από delegates. Αυτός ο τύπος πρέπει να εκχωρείται στο stack και να περνάται σε συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση System::SmartPtr για τη διαχείριση αντικειμένων αυτού του τύπου σε C++."
type: docs
weight: 4500
url: /el/cpp/system/multicastdelegate_returntype(argumenttypes...)_/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)> class


Αντιπροσωπεύει μια συλλογή από delegates. Αυτός ο τύπος πρέπει να εκχωρείται στο stack και να περνάται σε συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση [System::SmartPtr](../smartptr/) για τη διαχείριση αντικειμένων αυτού του τύπου.

```cpp
template<class ReturnType,class...>class MulticastDelegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Parameter | Περιγραφή |
| --- | --- |
| ReturnType | Τύπος επιστροφής των εκτελέσιμων οντοτήτων που δείχνουν κάθε delegate στη συλλογή |
| ArgumentTypes | Λίστα ορισμάτων των εκτελέσιμων οντοτήτων που δείχνουν κάθε delegate στη συλλογή |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [BeginInvoke](./begininvoke/)(ArgumentTypes..., const AsyncCallback\&, const CallbackArgumentType\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [connect](./connect/)(Callback) | Προσθέτει το καθορισμένο delegate στη συλλογή. |
| [connect](./connect/)(std::function\<R(Args...)>) | Προσθέτει το καθορισμένο αντικείμενο συνάρτησης στη συλλογή delegate. Το αντικείμενο συνάρτησης μετατρέπεται στον τύπο delegate [Callback](./callback/) πριν προστεθεί στη συλλογή. |
| [connect](./connect/)(MulticastDelegate\&) | Προσθέτει το καθορισμένο αντικείμενο MulticastDelegate στη συλλογή delegate. |
| [connect](./connect/)(MemberType ClassType::*, ClassType *) | Προσθέτει τη καθορισμένη μη-στατική μέθοδο του καθορισμένου αντικειμένου στη συλλογή delegate. |
| [connect](./connect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Προσθέτει τη καθορισμένη μη-στατική μέθοδο του καθορισμένου αντικειμένου στη συλλογή delegate. |
| [disconnect](./disconnect/)(Callback) | Αφαιρεί το καθορισμένο delegate από τη συλλογή delegate. |
| [disconnect](./disconnect/)(MemberType ClassType::*, ClassType *) | Αφαιρεί τη καθορισμένη μη-στατική μέθοδο του καθορισμένου αντικειμένου από τη συλλογή delegate. |
| [disconnect](./disconnect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Αφαιρεί τη καθορισμένη μη-στατική μέθοδο του καθορισμένου αντικειμένου από τη συλλογή delegate. |
| [disconnect](./disconnect/)(MulticastDelegate\&) | Αφαιρεί το καθορισμένο αντικείμενο MulticastDelegate από τη συλλογή delegate. |
| [disconnect_all_slots](./disconnect_all_slots/)() | Αφαιρεί όλα τα delegates από τη συλλογή delegate. |
| [empty](./empty/)() const | Καθορίζει αν η συλλογή delegate είναι κενή. |
| [EndInvoke](./endinvoke/)(const SharedPtr\<IAsyncResult\>\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [GetHashCode](./gethashcode/)() const |  |
| [GetType](./gettype/)() const |  |
| [invoke](./invoke/)(ArgumentTypes...) const | Καλεί όλα τα delegates που είναι παρόντα αυτή τη στιγμή στη συλλογή delegates. Τα delegates καλούνται με την ίδια σειρά με την οποία προστέθηκαν στη συλλογή. Η μέθοδος μπλοκάρει ενώ τα delegates εκτελούνται. |
| [IsNull](./isnull/)() const | Καθορίζει αν η συλλογή delegate είναι κενή. |
| [MulticastDelegate](./multicastdelegate/)() | Δημιουργεί μια κενή συλλογή. |
| [MulticastDelegate](./multicastdelegate/)(std::nullptr_t) | Ισοδυναμεί με τον προεπιλεγμένο κατασκευαστή. |
| [MulticastDelegate](./multicastdelegate/)(const MulticastDelegate\&) | Εκτελεί ένα ρηχό αντίγραφο της συλλογής delegate. |
| [MulticastDelegate](./multicastdelegate/)(MulticastDelegate\&&) | Κατασκευαστής μετακίνησης. |
| [MulticastDelegate](./multicastdelegate/)(Callback\&&) | Δημιουργεί ένα αντικείμενο και τοποθετεί τον καθορισμένο delegate στη συλλογή των delegates. |
| [MulticastDelegate](./multicastdelegate/)(T) | Δημιουργεί ένα αντικείμενο και τοποθετεί την καθορισμένη τιμή στη συλλογή των delegates. |
| [MulticastDelegate](./multicastdelegate/)(std::function\<ReturnType(ArgumentTypes...)>) | Δημιουργεί ένα αντικείμενο και τοποθετεί την καθορισμένη τιμή στη συλλογή των delegates. |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | Καθορίζει εάν η συλλογή των delegate δεν είναι κενή. |
| [operator!=](./operator!=/)(const MulticastDelegate\&) const | Καθορίζει εάν δύο στιγμιότυπα του MulticastDelegate - το τρέχον αντικείμενο και το καθορισμένο αντικείμενο - είναι άνισα. |
| [operator()](./operator()/)(ArgumentTypes...) const | Καλεί όλα τα delegates που είναι παρόντα στη συλλογή των delegates. Τα delegates καλούνται με την ίδια σειρά με την οποία προστέθηκαν στη συλλογή. Ο τελεστής μπλοκάρει ενώ τα delegates εκτελούνται. |
| [operator+=](./operator+=/)(Callback) | Προσθέτει το καθορισμένο delegate στη συλλογή. |
| [operator-=](./operator-=/)(Callback) | Αφαιρεί το καθορισμένο delegate από τη συλλογή delegate. |
| [operator=](./operator=/)(const MulticastDelegate\&) | Αναθέτει τη συλλογή των delegates που αντιπροσωπεύεται από το καθορισμένο αντικείμενο στο τρέχον αντικείμενο. Ως αποτέλεσμα, και τα δύο αντικείμενα δείχνουν στην ίδια συλλογή των delegates. |
| [operator=](./operator=/)(MulticastDelegate\&&) | Τελεστής ανάθεσης μετακίνησης. |
| [operator==](./operator==/)(const std::nullptr_t\&) const | Καθορίζει αν η συλλογή delegate είναι κενή. |
| [operator==](./operator==/)(const MulticastDelegate\&) const | Καθορίζει εάν δύο στιγμιότυπα του MulticastDelegate - το τρέχον αντικείμενο και το καθορισμένο αντικείμενο - είναι ίσα. |
| [remove_empty_callbacks](./remove_empty_callbacks/)() const | Καθαρίζει τα περιεχόμενα callbacks που είναι κενά (δεν καλούν τίποτα). |
| [ToString](./tostring/)() const |  |
| static [Type](./type/)() | Επιστρέφει μια αναφορά στο αντικείμενο [TypeInfo](../typeinfo/) που αντιπροσωπεύει τις πληροφορίες τύπου της κλάσης MulticastDelegate. |
| [~MulticastDelegate](./~multicastdelegate/)() | Καταστροφέας. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Callback](./callback/) | Ο τύπος των delegates που αντιπροσωπεύονται από την κλάση MulticastDelegate. |

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
