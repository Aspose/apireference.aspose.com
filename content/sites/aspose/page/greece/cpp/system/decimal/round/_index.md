---
title: "Μέθοδος System::Decimal::Round"
linktitle: "Στρογγυλοποίηση"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Decimal::Round. Στρογγυλοποιεί την καθορισμένη τιμή στην πλησιέστερη τιμή με τον καθορισμένο αριθμό δεκαδικών ψηφίων. Ένα παράμετρος καθορίζει τη συμπεριφορά της συνάρτησης εάν η καθορισμένη τιμή είναι εξίσου κοντά σε δύο πλησιέστερους αριθμούς σε C++."
type: docs
weight: 4400
url: /el/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


Στρογγυλοποιεί την καθορισμένη τιμή στην πλησιέστερη τιμή με τον καθορισμένο αριθμό δεκαδικών ψηφίων. Ένα παράμετρος καθορίζει τη συμπεριφορά της συνάρτησης εάν η καθορισμένη τιμή είναι εξίσου κοντά σε δύο πλησιέστερους αριθμούς.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| d | const Decimal\& | Η τιμή προς στρογγυλοποίηση |
| ψηφία | int | Ο αριθμός των δεκαδικών ψηφίων στην στρογγυλοποιημένη τιμή |
| mode | MidpointRounding | Καθορίζει πώς να εκτελεστεί η στρογγυλοποίηση εάν το **value** είναι εξίσου κοντά σε δύο πλησιέστερους αριθμούς. |

### ReturnValue

Ο αριθμός με τον καθορισμένο αριθμό ψηφίων που είναι πλησιέστερος στο **value**

## Δείτε επίσης

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


Στρογγυλοποιεί την καθορισμένη τιμή στον πλησιέστερο ακέραιο αριθμό. Ένα παράμετρος καθορίζει τη συμπεριφορά της συνάρτησης εάν η καθορισμένη τιμή είναι εξίσου κοντά σε δύο πλησιέστερους αριθμούς.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| d | const Decimal\& | Η τιμή προς στρογγυλοποίηση |
| mode | MidpointRounding | Καθορίζει πώς να εκτελεστεί η στρογγυλοποίηση εάν το **value** είναι εξίσου κοντά σε δύο πλησιέστερους αριθμούς. |

### ReturnValue

**d** rounded to the nearest integral value

## Δείτε επίσης

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
