---
title: "System::Net::Cache::HttpCacheAgeControl enum"
linktitle: "HttpCacheAgeControl"
second_title: "Aspose.Page για C++"
description: "System::Net::Cache::HttpCacheAgeControl enum. Το CacheAgeControl χρησιμοποιείται για να καθορίσει προτιμήσεις σχετικά με την ηλικία και τη φρεσκάδα των αποθηκευμένων αντικειμένων σε C++."
type: docs
weight: 300
url: /el/cpp/system.net.cache/httpcacheagecontrol/
---
## HttpCacheAgeControl enum


Το CacheAgeControl χρησιμοποιείται για τον καθορισμό προτιμήσεων σχετικά με την ηλικία και τη φρεσκάδα των αντικειμένων στην προσωρινή μνήμη.

```cpp
enum class HttpCacheAgeControl
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| None | 0 | Μόνο για εσωτερική χρήση. |
| MinFresh | 1 | Το περιεχόμενο μπορεί να ληφθεί από την κρυφή μνήμη εάν ο χρόνος που απομένει πριν τη λήξη είναι μεγαλύτερος ή ίσος με τον χρόνο που καθορίζεται με αυτήν την τιμή. |
| MaxAge | 2 | Το περιεχόμενο μπορεί να ληφθεί από την κρυφή μνήμη μέχρι να είναι παλαιότερο από την ηλικία που καθορίζεται με αυτήν την τιμή. |
| MaxStale | 4 | Το περιεχόμενο μπορεί να ληφθεί από την κρυφή μνήμη μετά τη λήξη του, μέχρι να περάσει ο χρόνος που καθορίζεται με αυτήν την τιμή. |
| MaxAgeAndMinFresh | 3 | MaxAge και MinFresh. |
| MaxAgeAndMaxStale | 6 | MaxAge και MaxStale. |

## Δείτε επίσης

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
