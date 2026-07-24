---
title: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate μέθοδος"
linktitle: "Delegate"
second_title: "Aspose.Page για C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate μέθοδος. Προεπιλεγμένος κατασκευαστής. Δημιουργεί το αντικείμενο delegate που δεν δείχνει σε τίποτα σε C++."
type: docs
weight: 100
url: /el/cpp/system/delegate_returntype(argumenttypes...)_/delegate/
---
## Delegate< ReturnType(ArgumentTypes...)>::Delegate() method


Προεπιλεγμένος κατασκευαστής. Δημιουργεί το αντικείμενο delegate που δεν δείχνει σε τίποτα.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate()=default
```

## Δείτε επίσης

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## Δείτε επίσης

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


Μετακινούμενος κατασκευαστής αντιγραφής. Αναλαμβάνει την ιδιοκτησία μιας οντότητας στην οποία δείχνει ο καθορισμένος delegate.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| o | Delegate\&& | Το αντικείμενο Delegate από το οποίο θα μετακινηθεί η αναφερόμενη οντότητα |

## Δείτε επίσης

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


Κατασκευαστής. Δημιουργεί ένα delegate από το καθορισμένο αντικείμενο συνάρτησης.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος του αντικειμένου συνάρτησης που δέχεται ο κατασκευαστής ως όρισμα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| functor_tag | int | Μια ψεύτικη ακέραια τιμή· αυτό το όρισμα χρησιμοποιείται για την επίλυση ασάφειας |
| functor | T\& | Ένα αντικείμενο συνάρτησης στο οποίο θα δείχνει το νεοσυγκατασκευασμένο delegate |

## Δείτε επίσης

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


Μετακινούμενος κατασκευαστής. Δημιουργεί ένα delegate από το καθορισμένο αντικείμενο συνάρτησης.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος του αντικειμένου συνάρτησης που δέχεται ο κατασκευαστής ως όρισμα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| functor_tag | long | Μια ψεύτικη ακέραια τιμή· αυτό το όρισμα χρησιμοποιείται για την επίλυση ασάφειας |
| functor | T\&& | Ένα αντικείμενο συνάρτησης στο οποίο θα δείχνει το νεοσυγκατασκευασμένο delegate |

## Δείτε επίσης

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


Κατασκευαστής. Δημιουργεί ένα delegate που δείχνει στη καθορισμένη μη-στατική μέθοδο του καθορισμένου αντικειμένου.

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| MemberType | Ο τύπος της μη-στατικής μεθόδου που ο κατασκευαστής δέχεται ως όρισμα |
| ClassType | Ο τύπος του αντικειμένου που δέχεται ο κατασκευαστής ως όρισμα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| μέλος | MemberType ClassType::* | Ένας δείκτης στη μη-στατική μέθοδο στην οποία θα δείχνει ο νεοδημιουργημένος αντιπρόσωπος |
| obj | ClassType * | Ένας δείκτης σε μέθοδο μέλους αντικειμένου στην οποία θα δείχνει ο νεοδημιουργημένος αντιπρόσωπος |

## Δείτε επίσης

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


Κατασκευαστής. Δημιουργεί ένα delegate που δείχνει στη καθορισμένη μη-στατική μέθοδο του καθορισμένου αντικειμένου.

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| MemberType | Ο τύπος της μη-στατικής μεθόδου που ο κατασκευαστής δέχεται ως όρισμα |
| ClassType | Ο τύπος του αντικειμένου που δέχεται ο κατασκευαστής ως όρισμα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| μέλος | MemberType MemberClass::* | Ένας δείκτης στη μη-στατική μέθοδο στην οποία θα δείχνει ο νεοδημιουργημένος αντιπρόσωπος |
| obj | const SharedPtr\<ClassType\>\& | Ένας δείκτης shared σε μέθοδο μέλους αντικειμένου στην οποία θα δείχνει ο νεοδημιουργημένος αντιπρόσωπος |

## Δείτε επίσης

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


Δημιουργεί ένα αντικείμενο delegate που δείχνει σε ένα αντικείμενο συνάρτησης std::function.

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| Parameter | Περιγραφή |
| --- | --- |
| R | Ο τύπος επιστροφής του αντικειμένου συνάρτησης που δέχεται ο κατασκευαστής ως όρισμα |
| Παράμετροι | Η λίστα ορισμάτων του αντικειμένου συνάρτησης που δέχεται ο κατασκευαστής ως όρισμα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| f | std::function\<R(Args...)\> | Ένα αντικείμενο συνάρτησης στο οποίο θα δείχνει το νεοδημιουργημένο αντικείμενο αντιπροσώπου |

## Δείτε επίσης

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


Κατασκευαστής. Δημιουργεί ένα delegate από τον καθορισμένο δείκτη στο αντικείμενο συνάρτησης που δημιουργείται από το std::bind().

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| Parameter | Περιγραφή |
| --- | --- |
| Το | Τύπος του αντικειμένου συνάρτησης που δημιουργείται από το std::bind() και δέχεται ο κατασκευαστής ως όρισμα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| συνάρτηση | T | Δείκτης σε μια "bind expression" - έναν δείκτη συνάρτησης που δημιουργείται από το std::bind() - στον οποίο θα δείχνει το νεοδημιουργημένο αντικείμενο Delegate |

## Δείτε επίσης

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


Κατασκευαστής. Δημιουργεί ένα αντικείμενο delegate από τον καθορισμένο δείκτη σε ελεύθερη συνάρτηση ή στατική μέθοδο.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| Parameter | Περιγραφή |
| --- | --- |
| Το | Τύπος του δείκτη συνάρτησης ή στατικής μεθόδου που δέχεται ο κατασκευαστής ως όρισμα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| συνάρτηση | T | Δείκτης σε συνάρτηση ή στατική μέθοδο στην οποία θα δείχνει το νεοδημιουργημένο αντικείμενο Delegate |

## Δείτε επίσης

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
