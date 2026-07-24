---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect μέθοδος"
linktitle: "σύνδεση"
second_title: "Aspose.Page για C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect μέθοδος. Προσθέτει τον καθορισμένο αντιπρόσωπο στη συλλογή σε C++."
type: docs
weight: 400
url: /el/cpp/system/multicastdelegate_returntype(argumenttypes...)_/connect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(Callback) method


Προσθέτει το καθορισμένο delegate στη συλλογή.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(Callback callback)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| callback | Callback | Ο αντιπρόσωπος για προσθήκη στη συλλογή |

### ReturnValue

Μια αναφορά στον εαυτό

## Δείτε επίσης

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, ClassType *) method


Προσθέτει τη καθορισμένη μη-στατική μέθοδο του καθορισμένου αντικειμένου στη συλλογή delegate.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| MemberType | Ο τύπος της μη-στατικής μεθόδου που πρέπει να προστεθεί στη συλλογή αντιπροσώπων |
| ClassType | Ο τύπος της μεθόδου αντικειμένου της οποίας πρέπει να προστεθεί στον αντιπρόσωπο |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| μέλος | MemberType ClassType::* | Ένας δείκτης στη μη-στατική μέθοδο του καθορισμένου αντικειμένου |
| obj | ClassType * | Ένας δείκτης σε μέθοδο μέλους αντικειμένου της οποίας πρέπει να προστεθεί στη συλλογή αντιπροσώπων |

### ReturnValue

Μια αναφορά στον εαυτό

## Δείτε επίσης

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


Προσθέτει τη καθορισμένη μη-στατική μέθοδο του καθορισμένου αντικειμένου στη συλλογή delegate.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| MemberType | Ο τύπος της μη-στατικής μεθόδου που πρέπει να προστεθεί στη συλλογή αντιπροσώπων |
| ClassType | Ο τύπος της μεθόδου αντικειμένου της οποίας πρέπει να προστεθεί στη συλλογή αντιπροσώπων |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| μέλος | MemberType ClassType::* | Ένας δείκτης στη μη-στατική μέθοδο του καθορισμένου αντικειμένου |
| obj | const SharedPtr\<ClassType\>\& | Ένας κοινόχρηστος δείκτης σε μέθοδο μέλους αντικειμένου της οποίας πρέπει να προστεθεί στη συλλογή αντιπροσώπων |

### ReturnValue

Μια αναφορά στον εαυτό

## Δείτε επίσης

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MulticastDelegate\&) method


Προσθέτει το καθορισμένο αντικείμενο MulticastDelegate στη συλλογή delegate.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MulticastDelegate &other)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| άλλο | MulticastDelegate\& | Μια παρουσία της κλάσης MulticastDelegate για προσθήκη στη συλλογή αντιπροσώπων |

### ReturnValue

Μια αναφορά στον εαυτό

## Δείτε επίσης

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(std::function\<R(Args...)>) method


Προσθέτει το καθορισμένο αντικείμενο συνάρτησης στη συλλογή αντιπροσώπων. Το αντικείμενο συνάρτησης μετατρέπεται στον τύπο αντιπροσώπου [Callback](../callback/) πριν προστεθεί στη συλλογή.

```cpp
template<class R,class...> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(std::function<R(Args...)> f)
```


| Parameter | Περιγραφή |
| --- | --- |
| R | Ο τύπος επιστροφής του αντικειμένου συνάρτησης για προσθήκη στη συλλογή |
| Παράμετροι | Η λίστα ορισμάτων του αντικειμένου συνάρτησης για προσθήκη στη συλλογή |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| f | std::function\<R(Args...)\> | Το αντικείμενο συνάρτησης για προσθήκη στη συλλογή |

### ReturnValue

Μια αναφορά στον εαυτό

## Δείτε επίσης

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
