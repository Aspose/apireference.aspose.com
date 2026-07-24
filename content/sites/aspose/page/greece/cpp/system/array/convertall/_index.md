---
title: "System::Array::ConvertAll μέθοδος"
linktitle: "ConvertAll"
second_title: "Aspose.Page για C++"
description: "System::Array::ConvertAll μέθοδος. Δημιουργεί ένα νέο αντικείμενο Array και το γεμίζει με στοιχεία του καθορισμένου πίνακα που έχουν μετατραπεί στον τύπο OutputType χρησιμοποιώντας τον καθορισμένο αντιπρόσωπο μετατροπέα σε C++."
type: docs
weight: 4800
url: /el/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


Δημιουργεί ένα νέο αντικείμενο [Array](../) και το γεμίζει με στοιχεία του καθορισμένου πίνακα που έχουν μετατραπεί στον τύπο **OutputType** χρησιμοποιώντας τον καθορισμένο αντιπρόσωπο μετατροπέα.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| Parameter | Περιγραφή |
| --- | --- |
| InputType | Ο τύπος των στοιχείων του πίνακα εισόδου |
| OutputType | Ο τύπος των στοιχείων του προκύπτοντος πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Ένα αντικείμενο [Array](../) |
| converter | Converter\<InputType, OutputType\> | Ένα αντικείμενο [Converter](../../converter/) που χρησιμοποιείται για τη μετατροπή κάθε στοιχείου του πίνακα εισόδου σε ισοδύναμες τιμές του τύπου **OutputType** |

### ReturnValue

Ένας νέος πίνακας που περιέχει τιμές του τύπου **OutputType** ισοδύναμες με τις τιμές του **input_array**

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


Δημιουργεί ένα νέο αντικείμενο [Array](../) και το γεμίζει με στοιχεία του καθορισμένου πίνακα που έχουν μετατραπεί στον τύπο **OutputType** χρησιμοποιώντας το καθορισμένο αντικείμενο συνάρτησης μετατροπέα.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| Parameter | Περιγραφή |
| --- | --- |
| InputType | Ο τύπος των στοιχείων του πίνακα εισόδου |
| OutputType | Ο τύπος των στοιχείων του προκύπτοντος πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Ένα αντικείμενο [Array](../) |
| μετατροπέας | std::function\<OutputType(InputType)> | Ένα αντικείμενο συνάρτησης που χρησιμοποιείται για τη μετατροπή κάθε στοιχείου του πίνακα εισόδου σε ισοδύναμες τιμές του τύπου **OutputType** |

### ReturnValue

Ένας νέος πίνακας που περιέχει τιμές του τύπου **OutputType** ισοδύναμες με τις τιμές του **input_array**

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
