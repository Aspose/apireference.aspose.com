---
title: "System::Net::Http::Headers::AuthenticationHeaderValue κλάση"
linktitle: "AuthenticationHeaderValue"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::AuthenticationHeaderValue κλάση. Αντιπροσωπεύει τιμές των κεφαλίδων ''Authorization'', ''ProxyAuthorization'', ''WWW-Authenticate'' και ''Proxy-Authenticate''. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σε σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.net.http.headers/authenticationheadervalue/
---
## AuthenticationHeaderValue class


Αντιπροσωπεύει τιμές των κεφαλίδων 'Authorization', 'ProxyAuthorization', 'WWW-Authenticate' και 'Proxy-Authenticate'. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σε σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class AuthenticationHeaderValue : public System::ICloneable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String) | Κατασκευαστής. |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String, String) | Κατασκευαστής. |
| [Clone](./clone/)() override | Πληροφορίες RTTI. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Συγκρίνει αντικείμενα χρησιμοποιώντας τη σημασιολογία του C# [Object.Equals](../../system/object/equals/) semantics. |
| [get_Parameter](./get_parameter/)() | Λαμβάνει τα διαπιστευτήρια που περιέχουν τις πληροφορίες ταυτοποίησης. |
| [get_Scheme](./get_scheme/)() | Πληροφορίες RTTI. |
| static [GetAuthenticationLength](./getauthenticationlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Αναλύει τη συγκεκριμένη συμβολοσειρά και επιστρέφει τον τελευταίο δείκτη της αναπαράστασης της συμβολοσειράς. |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| static [Parse](./parse/)(String) | Μετατρέπει μια δοθείσα συμβολοσειρά σε ένα στιγμιότυπο της κλάσης [AuthenticationHeaderValue](./). |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<AuthenticationHeaderValue\>\&) | Προσπάθεια μετατροπής μιας δοθείσας συμβολοσειράς σε ένα στιγμιότυπο της κλάσης [AuthenticationHeaderValue](./). |
## Δείτε επίσης

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
