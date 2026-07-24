---
title: "System::Collections::Generic::KeyValuePair κλάση"
linktitle: "KeyValuePair"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::KeyValuePair κλάση. Ζεύγος κλειδιού και τιμής. Αυτός ο τύπος πρέπει να εκχωρείται στη στοίβα και να περνιέται στις συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση System::SmartPtr για τη διαχείριση αντικειμένων αυτού του τύπου σε C++."
type: docs
weight: 2900
url: /el/cpp/system.collections.generic/keyvaluepair/
---
## KeyValuePair class


Ζεύγος κλειδιού και τιμής. Αυτός ο τύπος πρέπει να εκχωρείται στη στοίβα και να περνιέται στις συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση [System::SmartPtr](../../system/smartptr/) για τη διαχείριση αντικειμένων αυτού του τύπου.

```cpp
template<typename TKey,typename TValue>class KeyValuePair
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Key](./get_key/)() const | Λαμβάνει το κλειδί. |
| [get_Value](./get_value/)() const | Λαμβάνει την τιμή. |
| [GetHashCode](./gethashcode/)() const | Υπολογίζει το hash του ζεύγους κλειδιού-τιμής κάνοντας XOR τα hashes του κλειδιού και της τιμής. |
| [IsNull](./isnull/)() const | Πάντα επιστρέφει false. |
| [KeyValuePair](./keyvaluepair/)() | Αρχικοποιητής μηδενικού ζεύγους κλειδιού-τιμής. |
| [KeyValuePair](./keyvaluepair/)(const TKey\&, const TValue\&) | Κατασκευαστής. |
| [KeyValuePair](./keyvaluepair/)(const std::pair\<OtherK, OtherV\>\&) | Κατασκευαστής μετατροπής τύπου. |
| [operator<](./operator_/)(const KeyValuePair\&) const | Διόρθωση για κλάσεις που κληρονομούν από [IComparer<KeyValuePair<TKey, TValue>>](../icomparer/), δεν συγκρίνει τίποτα. |
| [ToString](./tostring/)() const | Μετατρέπει το ζεύγος κλειδιού-τιμής σε συμβολοσειρά. |

## Δείτε επίσης

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
