---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags enum"
linktitle: "X509KeyUsageFlags"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags enum. Ορίζει πώς μπορεί να χρησιμοποιηθεί το κλειδί του πιστοποιητικού σε C++."
type: docs
weight: 2200
url: /el/cpp/system.security.cryptography.x509certificates/x509keyusageflags/
---
## X509KeyUsageFlags enum


Ορίζει πώς μπορεί να χρησιμοποιηθεί το κλειδί του πιστοποιητικού.

```cpp
enum class X509KeyUsageFlags : int32_t
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| None | 0 | Δεν υπάρχουν παράμετροι χρήσης κλειδιού. |
| EncipherOnly | 1 | Το κλειδί μπορεί να χρησιμοποιηθεί μόνο για κρυπτογράφηση. |
| CrlSign | 2 | Το κλειδί μπορεί να χρησιμοποιηθεί για την υπογραφή λίστας ανάκλησης πιστοποιητικού. |
| KeyCertSign | 4 | Το κλειδί μπορεί να χρησιμοποιηθεί για την υπογραφή πιστοποιητικών. |
| KeyAgreement | 8 | Το κλειδί μπορεί να χρησιμοποιηθεί για τον καθορισμό της συμφωνίας κλειδιού. |
| DataEncipherment | 16 | Το κλειδί μπορεί να χρησιμοποιηθεί για κρυπτογράφηση δεδομένων. |
| KeyEncipherment | 32 | Το κλειδί μπορεί να χρησιμοποιηθεί για κρυπτογράφηση κλειδιού. |
| NonRepudiation | 64 | Το κλειδί μπορεί να χρησιμοποιηθεί για έλεγχο ταυτότητας. |
| DigitalSignature | 128 | Το κλειδί μπορεί να χρησιμοποιηθεί ως ψηφιακή υπογραφή. |
| DecipherOnly | 32768 | Το κλειδί μπορεί να χρησιμοποιηθεί μόνο για αποκρυπτογράφηση. |

## Δείτε επίσης

* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
