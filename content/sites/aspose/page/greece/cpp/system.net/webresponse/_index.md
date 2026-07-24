---
title: "System::Net::WebResponse κλάση"
linktitle: "WebResponse"
second_title: "Aspose.Page για C++"
description: "System::Net::WebResponse κλάση. Αντιπροσωπεύει μια απάντηση web. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 4000
url: /el/cpp/system.net/webresponse/
---
## WebResponse class


Αντιπροσωπεύει μια απάντηση web. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class WebResponse : public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Close](./close/)() | Κλείνει τη ροή της απάντησης. |
| [Dispose](./dispose/)() override | Δεν κάνει τίποτα. |
| virtual [get_ContentLength](./get_contentlength/)() | Πληροφορίες RTTI. |
| virtual [get_ContentType](./get_contenttype/)() | Επιστρέφει τον τύπο MIME του πόρου. |
| virtual [get_Headers](./get_headers/)() | Επιστρέφει τη συλλογή των κεφαλίδων που σχετίζονται με την τρέχουσα απάντηση. |
| virtual [get_ResponseUri](./get_responseuri/)() | Επιστρέφει το URI του πόρου. |
| virtual [get_SupportsHeaders](./get_supportsheaders/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η τρέχουσα απόκριση υποστηρίζει κεφαλίδες. |
| virtual [GetResponseStream](./getresponsestream/)() | Επιστρέφει τη ροή απόκρισης. |
## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
