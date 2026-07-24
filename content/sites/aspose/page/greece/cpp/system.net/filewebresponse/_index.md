---
title: "System::Net::FileWebResponse class"
linktitle: "FileWebResponse"
second_title: "Aspose.Page για C++"
description: "System::Net::FileWebResponse class. Παρέχει υλοποίηση της αφηρημένης κλάσης WebResponse για εργασία με το σύστημα αρχείων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1100
url: /el/cpp/system.net/filewebresponse/
---
## FileWebResponse class


Παρέχει υλοποίηση της αφηρημένης κλάσης [WebResponse](../webresponse/) για εργασία με το σύστημα αρχείων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Close](./close/)() override | Κλείνει τη ροή της απάντησης. |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | Δημιουργεί μια νέα παρουσία. |
| [get_ContentLength](./get_contentlength/)() override | Πληροφορίες RTTI. |
| [get_ContentType](./get_contenttype/)() override | Επιστρέφει τον τύπο MIME του πόρου. |
| [get_Headers](./get_headers/)() override | Επιστρέφει τη συλλογή των κεφαλίδων που σχετίζονται με την τρέχουσα απάντηση. |
| [get_ResponseUri](./get_responseuri/)() override | Επιστρέφει το URI του πόρου. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν η τρέχουσα απόκριση υποστηρίζει κεφαλίδες. |
| [GetResponseStream](./getresponsestream/)() override | Επιστρέφει τη ροή απόκρισης. |
## Δείτε επίσης

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
