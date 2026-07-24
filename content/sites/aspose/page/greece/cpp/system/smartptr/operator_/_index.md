---
title: "System::SmartPtr::operator* μέθοδος"
linktitle: "operator*"
second_title: "Aspose.Page για C++"
description: "System::SmartPtr::operator* μέθοδος. Παίρνει αναφορά στο αντικείμενο στο οποίο δείχνει ο δείκτης. Επιβεβαιώνει ότι ο δείκτης δεν είναι null σε C++."
type: docs
weight: 2500
url: /el/cpp/system/smartptr/operator_/
---
## SmartPtr::operator* method


Λαμβάνει αναφορά στο αντικείμενο στο οποίο δείχνει ο δείκτης. Επιβεβαιώνει ότι ο δείκτης δεν είναι null.

```cpp
Pointee_ & System::SmartPtr<T>::operator*() const
```


### ReturnValue

Αναφορά στο αντικείμενο στο οποίο δείχνει ο δείκτης.

## Δείτε επίσης

* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::SmartPtr::operator< μέθοδος
τίτλος συνδέσμου: operator<
second_title: Aspose.Page για C++
description: 'System::SmartPtr::operator< μέθοδος. Παρέχει σημασιολογία λιγότερο-συγκρίσιμη για την κλάση SmartPtr σε C++.'
type: docs
βάρος: 2700
url: /cpp/system/smartptr/operator_/
---
## SmartPtr::operator<(SmartPtr\<Y\> const\&) const method


Παρέχει σημασιολογία λιγότερο-συγκρίσιμη για την κλάση [SmartPtr](../).

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(SmartPtr<Y> const &x) const
```


| Parameter | Περιγραφή |
| --- | --- |
| Y | Τύπος δείκτη για σύγκριση με τον τρέχοντα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| x | SmartPtr\<Y\> const\& | Δείκτης για σύγκριση με τον τρέχοντα. |

### ReturnValue

Αληθές αν το αντικείμενο στο οποίο αναφέρεται το [SmartPtr](../) είναι 'less' από το x και ψευδές διαφορετικά.

## Δείτε επίσης

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator<(Y *) const method


Παρέχει σημασιολογία λιγότερο-συγκρίσιμη για την κλάση [SmartPtr](../).

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(Y *p) const
```


| Parameter | Περιγραφή |
| --- | --- |
| Y | Τύπος δείκτη για σύγκριση με τον τρέχοντα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| p | Y * | Δείκτης για σύγκριση με τον τρέχοντα. |

### ReturnValue

Αληθές εάν το αντικείμενο που αναφέρεται από [SmartPtr](../) είναι 'μικρότερο' από το p και ψευδές διαφορετικά.

## Δείτε επίσης

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
