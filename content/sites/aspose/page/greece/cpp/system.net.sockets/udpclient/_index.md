---
title: "System::Net::Sockets::UdpClient class"
linktitle: "UdpClient"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::UdpClient class. Παρέχει υπηρεσίες δικτύου του Πρωτοκόλλου Χρήστη Datagram (UDP). Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα στην C++."
type: docs
weight: 700
url: /el/cpp/system.net.sockets/udpclient/
---
## UdpClient class


Παρέχει υπηρεσίες δικτύου του Πρωτοκόλλου Χρήστη Datagram (UDP). Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class UdpClient : public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Close](./close/)() | Κλείνει τη σύνδεση UDP. |
| [Connect](./connect/)(String, int32_t) | Καθιερώνει σύνδεση στη συγκεκριμένη θύρα του καθορισμένου κεντρικού υπολογιστή. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Καθιερώνει σύνδεση με τον κεντρικό υπολογιστή στη συγκεκριμένη διεύθυνση στη συγκεκριμένη θύρα. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | Καθιερώνει σύνδεση σε απομακρυσμένο άκρο. |
| [Dispose](./dispose/)() override | Απελευθερώνει τους διαχειριζόμενους και μη διαχειριζόμενους πόρους που χρησιμοποιούνται από το [UdpClient](./). |
| [get_Client](./get_client/)() | Πληροφορίες RTTI. |
| [Receive](./receive/)(System::SharedPtr\<IPEndPoint\>\&) | Επιστρέφει ένα datagram που έστειλε ο διακομιστής. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) | Στέλνει ένα UDP datagram στον κεντρικό υπολογιστή στο απομακρυσμένο άκρο. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) | Στέλνει ένα UDP datagram στη συγκεκριμένη θύρα του καθορισμένου απομακρυσμένου κεντρικού υπολογιστή. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t) | Στέλνει ένα UDP datagram σε απομακρυσμένο κεντρικό υπολογιστή. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | Χρησιμοποιείται για την παροχή της υποκείμενης δικτυακής υποδοχής. |
| [UdpClient](./udpclient/)() | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [UdpClient](./). |
| [UdpClient](./udpclient/)(AddressFamily) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [UdpClient](./). |
| [UdpClient](./udpclient/)(int32_t) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [UdpClient](./). |
| [UdpClient](./udpclient/)(int32_t, AddressFamily) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [UdpClient](./). |
| [UdpClient](./udpclient/)(System::SharedPtr\<IPEndPoint\>) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [UdpClient](./). param local EP το τοπικό σημείο άκρου στο οποίο συνδέετε τη σύνδεση UDP. |
| [UdpClient](./udpclient/)(String, int32_t) | Δημιουργεί ένα νέο στιγμιότυπο της κλάσης [UdpClient](./) και συνδέεται με τον καθορισμένο απομακρυσμένο κεντρικό υπολογιστή στην καθορισμένη θύρα. |
## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
