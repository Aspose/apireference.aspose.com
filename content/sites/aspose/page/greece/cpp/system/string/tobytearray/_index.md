---
title: "μέθοδος System::String::ToByteArray"
linktitle: "ToByteArray"
second_title: "Aspose.Page για C++"
description: "μέθοδος System::String::ToByteArray. Μετατρέπει τη συμβολοσειρά ή το υποσύνολο σε πίνακα bytes σε C++."
type: docs
weight: 4700
url: /el/cpp/system/string/tobytearray/
---
## String::ToByteArray method


Μετατρέπει τη συμβολοσειρά ή την υποσυμβολοσειρά σε πίνακα byte.

```cpp
ArrayPtr<uint8_t> System::String::ToByteArray(int32_t startIndex=0, int32_t length=INT32_MAX, bool LE=true) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| startIndex | int32_t | Δείκτης έναρξης υποσυμβολοσειράς. |
| length | int32_t | Μήκος υποσυμβολοσειράς. |
| LE | bool | Αν είναι true, κωδικοποιεί χαρακτήρες χρησιμοποιώντας little endianness· διαφορετικά, χρησιμοποιεί big endianness. |

### ReturnValue

[Array](../../array/) containing bytes representing characters of the string.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
