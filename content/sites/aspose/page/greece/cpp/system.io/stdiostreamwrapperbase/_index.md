---
title: "System::IO::STDIOStreamWrapperBase κλάση"
linktitle: "STDIOStreamWrapperBase"
second_title: "Aspose.Page για C++"
description: "System::IO::STDIOStreamWrapperBase κλάση. Αντιπροσωπεύει μια βασική κλάση για περιτυλίγματα τύπου System.IO.Stream. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() . Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2000
url: /el/cpp/system.io/stdiostreamwrapperbase/
---
## STDIOStreamWrapperBase class


Αντιπροσωπεύει μια βασική κλάση για περιτυλίγματα τύπου [System.IO.Stream](../stream/). Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename T,typename>class STDIOStreamWrapperBase : public System::IO::Stream
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_CanRead](./get_canread/)() const override | Καθορίζει εάν η ροή υποστηρίζει ανάγνωση. |
| [get_CanSeek](./get_canseek/)() const override | Καθορίζει αν το ρεύμα υποστηρίζει αναζήτηση. |
| [get_CanWrite](./get_canwrite/)() const override | Καθορίζει εάν η ροή υποστηρίζει εγγραφή. |
| [get_Length](./get_length/)() const override | Επιστρέφει το μήκος της ροής. |
| [get_Position](./get_position/)() const override | Επιστρέφει τη τρέχουσα θέση της ροής. |
| [operator=](./operator=/)(const STDIOStreamWrapperBase\&) | Τελεστής ανάθεσης αντιγραφής. Διαγράφηκε. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Ορίζει τη θέση της ροής που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [set_Position](./set_position/)(int64_t) override | Ορίζει τη θέση της ροής. |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/)(const STDIOStreamWrapperBase\&) | Κατασκευαστής αντιγραφής. Διαγράφηκε. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Null](../stream/null/) | Μια ροή χωρίς υποκείμενη αποθήκευση. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | Πληροφορίες RTTI. |
| [int_type](./int_type/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Δείτε επίσης

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
