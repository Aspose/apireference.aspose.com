---
title: "System::Nullable::NullableBoolHelper method"
linktitle: "NullableBoolHelper"
second_title: "Aspose.Page για C++"
description: "System::Nullable::NullableBoolHelper method. Συνάρτηση βοηθού για να ελέγξει αν το this και το other είναι και τα δύο μη μηδενικά και να καλέσει μια λάμβδα εάν συμβαίνει αυτό. Χρησιμοποιείται σε implementation.s σε C++."
type: docs
weight: 800
url: /el/cpp/system/nullable/nullableboolhelper/
---
## Nullable::NullableBoolHelper method


Βοηθητική συνάρτηση για να ελέγξει αν αυτό και **other** δεν είναι και τα δύο null και να καλέσει μια λάμβδα εάν συμβεί αυτό. Χρησιμοποιείται στην υλοποίηση.

```cpp
template<typename T1> bool System::Nullable<T>::NullableBoolHelper(const T1 &other, const std::function<bool()> &f, bool default_if_both_are_null=false) const
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Άλλος nullable τύπος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| άλλο | const T1\& | Άλλη nullable τιμή για σύγκριση. |
| f | const std::function\<bool()>\& | Λάμβδα για κλήση εάν και τα δύο **this** και **other** δεν είναι μηδενικά. |
| default_if_both_are_null | bool | Τιμή επιστροφής εάν και οι δύο τιμές είναι μηδενικές. |

### ReturnValue

ψευδής εάν είτε **this** είτε **other** είναι μηδενικό· **default_if_both_are_null** εάν και τα δύο είναι μηδενικά· αποτέλεσμα κλήσης του **f** εάν και τα δύο δεν είναι μηδενικά.

## Δείτε επίσης

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
