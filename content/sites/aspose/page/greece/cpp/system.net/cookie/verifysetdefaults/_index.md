---
title: "System::Net::Cookie::VerifySetDefaults method"
linktitle: "VerifySetDefaults"
second_title: "Aspose.Page για C++"
description: "System::Net::Cookie::VerifySetDefaults μέθοδος. Επαληθεύει και ορίζει τις προεπιλεγμένες τιμές του χαρακτηριστικού'' σε C++."
type: docs
weight: 4200
url: /el/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


Επαληθεύει και ορίζει τις προεπιλεγμένες τιμές του χαρακτηριστικού.

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| μεταβλητή | CookieVariant | Η προδιαγραφή του cookie. |
| uri | System::SharedPtr\<Uri\> | Η παρουσία της κλάσης Uri που χρησιμοποιείται για την αρχικοποίηση των εσωτερικών πεδίων. |
| isLocalDomain | bool | Μια τιμή που υποδεικνύει εάν το cookie προωθείται στον τοπικό τομέα. |
| localDomain | String | Ένα όνομα τοπικού τομέα. |
| setDefault | bool | Μια τιμή που υποδεικνύει εάν τα χαρακτηριστικά του cookie πρέπει να αρχικοποιηθούν χρησιμοποιώντας τις προεπιλεγμένες τιμές τους. |
| shouldThrow | bool | Μια τιμή που υποδεικνύει εάν πρέπει να εξαχθεί μια εξαίρεση όταν οι καθορισμένες τιμές είναι μη έγκυρες. |

### ReturnValue

Αληθές όταν όλες οι τιμές είναι έγκυρες, διαφορετικά ψευδές.

## Δείτε επίσης

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
