---
title: "System::UriComponents enum"
linktitle: "UriComponents"
second_title: "Aspose.Page για C++"
description: "System::UriComponents enum. Αναπαριστά τα στοιχεία URI σε C++."
type: docs
weight: 8900
url: /el/cpp/system/uricomponents/
---
## UriComponents enum


Αντιπροσωπεύει τα στοιχεία του URI.

```cpp
enum class UriComponents
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| Σχήμα | 1 | Τα δεδομένα Scheme. |
| UserInfo | 2 | Τα δεδομένα UserInfo. |
| Host | 4 | Τα δεδομένα Host. |
| Θύρα | 8 | Τα δεδομένα Port. |
| SchemeAndServer | n/a | Τα δεδομένα Scheme, Host και Port. |
| Διαδρομή | 16 | Τα δεδομένα LocalPath. |
| Ερώτημα | 32 | Τα δεδομένα Query. |
| PathAndQuery | n/a | Τα δεδομένα LocalPath και Query. |
| HttpRequestUrl | n/a | Τα δεδομένα Scheme, Host, Port, Query και LocalPath. |
| Fragment | 64 | Τα δεδομένα Fragment. |
| AbsoluteUri | n/a | Τα δεδομένα Scheme, Host, Port, Quer, LocalPath και Fragment. |
| StrongPort | 128 | Τα δεδομένα Port· εάν τα δεδομένα θύρας δεν υπάρχουν στο [Uri](../uri/) και έχει εκχωρηθεί προεπιλεγμένη θύρα στο Scheme, επιστρέφεται η προεπιλεγμένη θύρα· εάν δεν υπάρχει προεπιλεγμένη θύρα, επιστρέφεται -1. |
| HostAndPort | n/a | Τα δεδομένα Host και Port· εάν τα δεδομένα θύρας δεν υπάρχουν στο [Uri](../uri/) και έχει εκχωρηθεί προεπιλεγμένη θύρα στο Scheme, επιστρέφεται η προεπιλεγμένη θύρα. Εάν δεν υπάρχει προεπιλεγμένη θύρα, επιστρέφεται -1. |
| StrongAuthority | n/a | Τα δεδομένα UserInfo, Host και Port. Εάν δεν υπάρχουν δεδομένα θύρας στο [Uri](../uri/) και έχει εκχωρηθεί προεπιλεγμένη θύρα στο Scheme, επιστρέφεται η προεπιλεγμένη θύρα. Εάν δεν υπάρχει προεπιλεγμένη θύρα, επιστρέφεται -1. |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | Καθορίζει ότι ο διαχωριστής πρέπει να συμπεριληφθεί. |
| SerializationInfoString | n/a | Το πλήρες πλαίσιο [Uri](../uri/) που απαιτείται για τους Serializers του [Uri](../uri/). Το πλαίσιο περιλαμβάνει το πεδίο IPv6. |

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
