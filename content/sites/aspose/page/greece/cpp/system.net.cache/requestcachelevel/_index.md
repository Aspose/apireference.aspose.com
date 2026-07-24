---
title: "System::Net::Cache::RequestCacheLevel enum"
linktitle: "RequestCacheLevel"
second_title: "Aspose.Page για C++"
description: "System::Net::Cache::RequestCacheLevel enum. Το enum περιγράφει τις ρυθμίσεις cache που ισχύουν για οποιοδήποτε WebRequest σε C++."
type: docs
weight: 500
url: /el/cpp/system.net.cache/requestcachelevel/
---
## RequestCacheLevel enum


Το enum περιγράφει τις ρυθμίσεις cache που ισχύουν για οποιοδήποτε [WebRequest](../../system.net/webrequest/).

```cpp
enum class RequestCacheLevel
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| Default | 0 | Ικανοποιεί ένα αίτημα για πόρο είτε χρησιμοποιώντας το αποθηκευμένο αντίγραφο του πόρου είτε στέλνοντας ένα αίτημα για τον πόρο στον διακομιστή. |
| BypassCache | 1 | Ικανοποιεί ένα αίτημα χρησιμοποιώντας τον διακομιστή. Δεν λαμβάνονται καταχωρήσεις από την cache. |
| CacheOnly | 2 | Ικανοποιεί ένα αίτημα για πόρο μόνο από την cache. Θα εξαχθεί [WebException](../../system.net/webexception/) όταν ένας πόρος δεν βρίσκεται στην cache του πελάτη. |
| CacheIfAvailable | 3 | Καλύπτει ένα αίτημα για πόρο από τη λανθάνουσα μνήμη εάν ο πόρος είναι διαθέσιμος· διαφορετικά στέλνει ένα αίτημα στον διακομιστή. |
| Επαλήθευση | 4 | Χρήση τοπικού αντιγράφου ενός πόρου εάν η χρονική σήμανση του πελάτη είναι ίδια με τη χρονική σήμανση του πόρου στον διακομιστή. Διαφορετικά, ο πόρος κατεβαίνει από έναν διακομιστή. |
| Επαναφόρτωση | 5 | Ένας πόρος κατεβάζεται πάντα από τον διακομιστή. |
| NoCacheNoStore | 6 | Ποτέ δεν καλύπτει ένα αίτημα χρησιμοποιώντας πόρους από τη λανθάνουσα μνήμη και δεν αποθηκεύει πόρους στη λανθάνουσα μνήμη. |

## Δείτε επίσης

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
