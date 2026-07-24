---
title: "System::IterateOver μέθοδος"
linktitle: "ΕπανάληψηΠάνωΣε"
second_title: "Aspose.Page για C++"
description: "System::IterateOver μέθοδος. Αυτή η ιδιότητα λειτουργίας τυλίγει ένα αντικείμενο που είναι enumerable (ή iterable) ώστε να μπορεί να χρησιμοποιηθεί με βρόχο for βασισμένο σε εύρος. Αυτή η υπερφόρτωση για Enumerable αυτό με προεπιλεγμένο τύπο στόχου σε C++."
type: docs
weight: 23100
url: /el/cpp/system/iterateover/
---
## System::IterateOver(const Enumerable *) method


Αυτή η ιδιότητα λειτουργίας τυλίγει ένα αντικείμενο που είναι enumerable (ή iterable) ώστε να μπορεί να χρησιμοποιηθεί με βρόχο for βασισμένο σε εύρος. Αυτή η υπερφόρτωση για Enumerable αυτό με προεπιλεγμένο τύπο στόχου.

```cpp
template<typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, Details::ValueTypeOfEnumerable<Enumerable>, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parameter | Περιγραφή |
| --- | --- |
| Enumerable | Ο τύπος ενός τυλιγμένου αντικειμένου |

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(const Enumerable *) method


Αυτή η ιδιότητα λειτουργίας τυλίγει ένα αντικείμενο που είναι enumerable (ή iterable) ώστε να μπορεί να χρησιμοποιηθεί με βρόχο for βασισμένο σε εύρος. Αυτή η υπερφόρτωση για Enumerable χωρίς μεθόδους begin(), end() με όρισμα τύπου στόχου για (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος στόχου, πρέπει να επιστρέφεται από τον iterator |
| Enumerable | Ο τύπος ενός τυλιγμένου αντικειμένου |

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Αυτή η ιδιότητα λειτουργίας τυλίγει ένα αντικείμενο που είναι enumerable (ή iterable) ώστε να μπορεί να χρησιμοποιηθεί με βρόχο for βασισμένο σε εύρος. Αυτή η υπερφόρτωση για Enumerable χωρίς μεθόδους begin(), end() με όρισμα τύπου στόχου για (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος στόχου, πρέπει να επιστρέφεται από τον iterator |
| Enumerable | Ο τύπος ενός τυλιγμένου αντικειμένου |

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Αυτή η ιδιότητα λειτουργίας τυλίγει ένα αντικείμενο που είναι enumerable (ή iterable) ώστε να μπορεί να χρησιμοποιηθεί με βρόχο for βασισμένο σε εύρος. Αυτή η υπερφόρτωση για Enumerable χωρίς μεθόδους begin(), end() με προεπιλεγμένο τύπο στόχου ως όρισμα για (auto& value : IterateOver(enumerable)) ανάλογα με τον παρακάτω κώδικα C# foreach (var value in enumerable)

```cpp
template<typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Περιγραφή |
| --- | --- |
| Enumerable | Ο τύπος ενός τυλιγμένου αντικειμένου |

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Αυτή η ιδιότητα λειτουργίας τυλίγει ένα αντικείμενο που είναι enumerable (ή iterable) ώστε να μπορεί να χρησιμοποιηθεί με βρόχο for βασισμένο σε εύρος. Αυτή η υπερφόρτωση για Enumerable με μεθόδους begin(), end() με προεπιλεγμένο τύπο στόχου ως όρισμα για (auto& value : IterateOver(enumerable))

```cpp
template<typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Περιγραφή |
| --- | --- |
| Enumerable | Ο τύπος ενός τυλιγμένου αντικειμένου |

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Αυτή η ιδιότητα λειτουργίας τυλίγει ένα αντικείμενο που είναι enumerable (ή iterable) ώστε να μπορεί να χρησιμοποιηθεί με βρόχο for βασισμένο σε εύρος. Αυτή η υπερφόρτωση για Enumerable με μεθόδους begin(), end() με τύπο στόχου ίδιο με τον αρχικό value_type του iterator.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Περιγραφή |
| --- | --- |
| Enumerable | Ο τύπος ενός τυλιγμένου αντικειμένου |
| T | Ο τύπος στόχου που πρέπει να επιστραφεί από τον iterator |

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Αυτή η ιδιότητα λειτουργίας τυλίγει ένα αντικείμενο που είναι enumerable (ή iterable) ώστε να μπορεί να χρησιμοποιηθεί με βρόχο for βασισμένο σε εύρος. Αυτή η υπερφόρτωση για Enumerable με μεθόδους begin(), end() με διαφορετικό τύπο στόχου και τον αρχικό value_type του iterator.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&!std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, Details::CppIteratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Περιγραφή |
| --- | --- |
| Enumerable | Ο τύπος ενός τυλιγμένου αντικειμένου |
| T | Ο τύπος στόχου που πρέπει να επιστραφεί από τον iterator |

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
