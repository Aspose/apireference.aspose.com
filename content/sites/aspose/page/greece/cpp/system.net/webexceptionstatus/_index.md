---
title: "System::Net::WebExceptionStatus enum"
linktitle: "WebExceptionStatus"
second_title: "Aspose.Page για C++"
description: "System::Net::WebExceptionStatus enum. Καταγράφει τους κωδικούς κατάστασης της κλάσης WebException σε C++."
type: docs
weight: 4900
url: /el/cpp/system.net/webexceptionstatus/
---
## WebExceptionStatus enum


Καταγράφει τους κωδικούς κατάστασης της κλάσης [WebException](../webexception/).

```cpp
enum class WebExceptionStatus
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| Success | 0 | Δεν προέκυψαν σφάλματα. |
| NameResolutionFailure | 1 | Η υπηρεσία επίλυσης ονομάτων δεν μπόρεσε να επιλύσει το όνομα κεντρικού υπολογιστή. |
| ConnectFailure | 2 | Δεν ήταν δυνατή η επαφή με το απομακρυσμένο σημείο υπηρεσίας στο επίπεδο μεταφοράς. |
| ReceiveFailure | 3 | Δεν ελήφθη πλήρης απάντηση από τον απομακρυσμένο διακομιστή. |
| SendFailure | 4 | Δεν ήταν δυνατή η αποστολή πλήρους αιτήματος στον απομακρυσμένο διακομιστή. |
| PipelineFailure | 5 | Το αίτημα ήταν αλληλουχικό και η σύνδεση κλείστηκε πριν ληφθεί η απάντηση. |
| RequestCanceled | 6 | Το αίτημα ακυρώθηκε ή προέκυψε σφάλμα που δεν μπορεί να ταξινομηθεί. |
| ProtocolError | 7 | Η απάντηση που ελήφθη από τον διακομιστή ήταν πλήρης, αλλά υποδείκνυε σφάλμα σε επίπεδο πρωτοκόλλου. |
| ConnectionClosed | 8 | Η σύνδεση έκλεισε πρόωρα. |
| TrustFailure | 9 | Δεν ήταν δυνατή η επαλήθευση του πιστοποιητικού του διακομιστή. |
| SecureChannelFailure | 10 | Παρουσιάστηκε σφάλμα κατά τη δημιουργία σύνδεσης χρησιμοποιώντας SSL. |
| ServerProtocolViolation | 11 | Η απάντηση του διακομιστή δεν ήταν έγκυρη απάντηση HTTP. |
| KeepAliveFailure | 12 | Η σύνδεση για ένα αίτημα που καθορίζει την κεφαλίδα 'Keep-Alive' έκλεισε απροσδόκητα. |
| Εκκρεμεί | 13 | Ένα εσωτερικό ασύγχρονο αίτημα βρίσκεται σε εκκρεμότητα. |
| Timeout | 14 | Δεν ελήφθη καμία απάντηση κατά τη διάρκεια της περιόδου λήξης χρόνου για ένα αίτημα. |
| ProxyNameResolutionFailure | 15 | Η υπηρεσία επίλυσης ονομάτων δεν μπόρεσε να επιλύσει το όνομα κεντρικού υπολογιστή του διαμεσολαβητή. |
| UnknownError | 16 | Ένα exception άγνωστου τύπου συνέβη. |
| MessageLengthLimitExceeded | 17 | Λήφθηκε ένα μήνυμα που ξεπέρασε το καθορισμένο όριο. |
| CacheEntryNotFound | 18 | Η καθορισμένη καταχώρηση cache δεν βρέθηκε. |
| RequestProhibitedByCachePolicy | 19 | Το αίτημα δεν επιτράπηκε από την πολιτική cache. |
| RequestProhibitedByProxy | 20 | Αυτό το αίτημα δεν επιτράπηκε από τον διαμεσολαβητή. |

## Δείτε επίσης

* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
