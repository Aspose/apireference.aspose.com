---
title: "System::Net::Sockets::SocketFlags enum"
linktitle: "SocketFlags"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::SocketFlags enum. Παρέχει σταθερές τιμές για τα μηνύματα του socket σε C++."
type: docs
weight: 1400
url: /el/cpp/system.net.sockets/socketflags/
---
## SocketFlags enum


Παρέχει σταθερές τιμές για τα μηνύματα του socket.

```cpp
enum class SocketFlags
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| None | 0 | Δεν υπάρχουν σημαίες που χρησιμοποιούνται για αυτήν την κλήση. |
| OutOfBand | 1 | Τα δεδομένα out-of-band επεξεργάζονται. |
| Peek | 2 | Κοιτάξτε ένα εισερχόμενο μήνυμα. |
| DontRoute | 4 | Στείλτε ένα μήνυμα χωρίς χρήση πινάκων δρομολόγησης. |
| Truncated | 256 | Ένα μήνυμα είναι πολύ μεγάλο για να χωρέσει στο καθορισμένο buffer. Έχει περικοπεί. |
| ControlDataTruncated | 512 | Τα δεδομένα ελέγχου είναι μεγαλύτερα από 64 KB και δεν χωρούν στο εσωτερικό buffer. Έχει περικοπεί. |
| Broadcast | 1024 | Ένα πακέτο εκπομπής. |
| Multicast | 2048 | Ένα πακέτο multicast. |
| Partial | 32768 | Ένα μήνυμα που αποστέλλεται ή λαμβάνεται μερικώς. |

## Δείτε επίσης

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
