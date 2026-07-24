---
title: "System::Net::FileWebRequest class"
linktitle: "FileWebRequest"
second_title: "Aspose.Page για C++"
description: "System::Net::FileWebRequest class. Παρέχει υλοποίηση της αφηρημένης κλάσης WebRequest για εργασία με το σύστημα αρχείων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1000
url: /el/cpp/system.net/filewebrequest/
---
## FileWebRequest class


Παρέχει υλοποίηση της αφηρημένης κλάσης [WebRequest](../webrequest/) για εργασία με το σύστημα αρχείων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class FileWebRequest : public System::Net::WebRequest
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Abort](./abort/)() override | Ακυρώνει το τρέχον αίτημα. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | Ξεκινά μια ασύγχρονη λειτουργία για λήψη ροής για την εγγραφή δεδομένων στον πόρο. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | Ξεκινά ένα ασύγχρονο αίτημα για τον πόρο. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία λήψης ροής. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | Περιμένει μέχρι να ολοκληρωθεί το καθορισμένο ασύγχρονο αίτημα για τον πόρο. |
| [FileWebRequest](./filewebrequest/)(System::SharedPtr\<Uri\>) | Δημιουργεί μια νέα παρουσία. |
| [get_ContentType](./get_contenttype/)() override | Λαμβάνει τον τύπο MIME του αιτήματος. |
| [get_Headers](./get_headers/)() override | Λαμβάνει τη συλλογή των κεφαλίδων HTTP. |
| [get_Method](./get_method/)() override | Λαμβάνει τη μέθοδο HTTP. |
| [get_RequestUri](./get_requesturi/)() override | Επιστρέφει το URI του αιτήματος. |
| [GetResponse](./getresponse/)() override | Επιστρέφει την απάντηση web που σχετίζεται με το τρέχον web αίτημα. |
| [set_ContentType](./set_contenttype/)(String) override | Ορίζει τον τύπο MIME του αιτήματος. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | Ορίζει τη συλλογή των κεφαλίδων HTTP. |
| [set_Method](./set_method/)(String) override | Ορίζει τη μέθοδο HTTP. |
| [set_Timeout](./set_timeout/)(int) override | Πληροφορίες RTTI. |
## Δείτε επίσης

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
