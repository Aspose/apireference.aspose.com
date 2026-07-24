---
title: "System::SmartPtr::SmartPtr κατασκευαστής"
linktitle: "SmartPtr"
second_title: "Aspose.Page για C++"
description: "System::SmartPtr::SmartPtr κατασκευαστής. Μετατρέπει τον τύπο της αναφερόμενης συλλογής δημιουργώντας μια νέα συλλογή διαφορετικού τύπου. Χρήσιμο εάν σε C# υπάρχει μετατροπή τύπου πίνακα που δεν υποστηρίζεται σε C++."
type: docs
weight: 100
url: /el/cpp/system/smartptr/smartptr/
---
## SmartPtr::SmartPtr(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) constructor


Μετατρέπει τον τύπο του αναφερόμενου πίνακα δημιουργώντας έναν νέο πίνακα διαφορετικού τύπου. Χρήσιμο εάν σε C# υπάρχει μετατροπή τύπου πίνακα που δεν υποστηρίζεται σε C++.

```cpp
template<typename Y> System::SmartPtr<T>::SmartPtr(const SmartPtr<Array<Y>> &src, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Περιγραφή |
| --- | --- |
| Y | Τύπος του πηγαίου πίνακα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| src | const SmartPtr\<Array\<Y\>\>\& | Δείκτης σε πίνακα για δημιουργία αντιγράφου, αλλά με διαφορετικό τύπο στοιχείων. |
| mode | SmartPtrMode | Λειτουργία δείκτη. |

## Δείτε επίσης

* Class [SmartPtr](../)
* Class [Array](../../array/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) constructor


Δημιουργεί ένα [SmartPtr](../) που μοιράζεται πληροφορίες ιδιοκτησίας με την αρχική τιμή του ptr, αλλά διατηρεί έναν ανεξάρτητο και μη διαχειριζόμενο δείκτη p.

```cpp
template<typename P> System::SmartPtr<T>::SmartPtr(const SmartPtr<P> &ptr, Pointee_ *p, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ptr | const SmartPtr\<P\>\& | Ένας άλλος έξυπνος δείκτης για να μοιραστεί την ιδιοκτησία με την ιδιοκτησία από. |
| p | Pointee_ * | Δείκτης σε ένα αντικείμενο για διαχείριση. |
| mode | SmartPtrMode | Λειτουργία δείκτη. |

## Δείτε επίσης

* Class [SmartPtr](../)
* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<Q\>\&, SmartPtrMode) constructor


Δημιουργεί αντίγραφο αντικειμένου [SmartPtr](../). Και οι δύο δείκτες δείχνουν στο ίδιο αντικείμενο μετά. Εκτελεί μετατροπή τύπου εάν επιτρέπεται.

```cpp
template<class Q,typename> System::SmartPtr<T>::SmartPtr(const SmartPtr<Q> &x, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Περιγραφή |
| --- | --- |
| Q | Τύπος του αντικειμένου που δείχνει το x. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | Δείκτης για αντίγραφο. |
| mode | SmartPtrMode | Λειτουργία δείκτη. |

## Δείτε επίσης

* Class [SmartPtr](../)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr_\&, SmartPtrMode) constructor


Δημιουργεί αντίγραφο αντικειμένου [SmartPtr](../). Και οι δύο δείκτες δείχνουν στο ίδιο αντικείμενο μετά.

```cpp
System::SmartPtr<T>::SmartPtr(const SmartPtr_ &ptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ptr | const SmartPtr_\& | Δείκτης για αντίγραφο. |
| mode | SmartPtrMode | Λειτουργία δείκτη. |

## Δείτε επίσης

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const Y\&) constructor


Αρχικοποιεί κενό πίνακα. Χρησιμοποιείται για τη μετάφραση ορισμένων κατασκευών κώδικα C#.

```cpp
template<typename Y,typename> System::SmartPtr<T>::SmartPtr(const Y &)
```


| Parameter | Περιγραφή |
| --- | --- |
| Y | Δείκτης θέσης τύπου EmptyArrayInitializer. |

## Δείτε επίσης

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(Pointee_ *, SmartPtrMode) constructor


Δημιουργεί [SmartPtr](../) που δείχνει στο καθορισμένο αντικείμενο, ή μετατρέπει ακατέργαστο δείκτη σε [SmartPtr](../).

```cpp
System::SmartPtr<T>::SmartPtr(Pointee_ *object, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| αντικείμενο | Pointee_ * | Pointee. |
| mode | SmartPtrMode | Λειτουργία δείκτη. |

## Δείτε επίσης

* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtr_\&&, SmartPtrMode) constructor


Δημιουργεί μετακίνηση αντικειμένου [SmartPtr](../). Στην ουσία, ανταλλάσσει δύο δείκτες, εάν είναι και οι δύο στην ίδια λειτουργία. Το x μπορεί να γίνει μη χρησιμοποιήσιμο μετά την κλήση.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtr_ &&x, SmartPtrMode mode=SmartPtrMode::Shared) noexcept
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| x | SmartPtr_\&& | Δείκτης για μετακίνηση. |
| mode | SmartPtrMode | Λειτουργία δείκτη. |

## Δείτε επίσης

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtrMode) constructor


Δημιουργεί αντικείμενο [SmartPtr](../) της απαιτούμενης λειτουργίας.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtrMode mode)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| mode | SmartPtrMode | Λειτουργία δείκτη. |

## Δείτε επίσης

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(std::nullptr_t, SmartPtrMode) constructor


Δημιουργεί αντικείμενο [SmartPtr](../) μηδενικού δείκτη της απαιτούμενης λειτουργίας.

```cpp
System::SmartPtr<T>::SmartPtr(std::nullptr_t=nullptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| mode | std::nullptr_t | Λειτουργία δείκτη. |

## Δείτε επίσης

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
