---
title: "System::IO::Path::CheckPath μέθοδος"
linktitle: "CheckPath"
second_title: "Aspose.Page για C++"
description: "System::IO::Path::CheckPath μέθοδος. Καθορίζει εάν η καθορισμένη διαδρομή είναι έγκυρη ελέγχοντας αν περιέχει μη έγκυρους χαρακτήρες. Εξαίρεση ρίχνεται εάν η διαδρομή περιέχει μη έγκυρους χαρακτήρες σε C++."
type: docs
weight: 200
url: /el/cpp/system.io/path/checkpath/
---
## Path::CheckPath method


Καθορίζει αν η καθορισμένη διαδρομή είναι έγκυρη ελέγχοντας αν περιέχει μη έγκυρους χαρακτήρες. Εξαίρεση ρίχνεται εάν η διαδρομή περιέχει μη έγκυρους χαρακτήρες.

```cpp
static void System::IO::Path::CheckPath(const String &path, const String &msg=s_msg_path, bool allow_empty=true)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Η διαδρομή προς έλεγχο |
| msg | const String\& | Το μήνυμα που θα περάσει στον κατασκευαστή του αντικειμένου εξαίρεσης |
| allow_empty | bool | Καθορίζει εάν μια κενή ή null συμβολοσειρά πρέπει να θεωρείται σωστή διαδρομή (αληθές) ή όχι (ψευδές); εάν αυτή η παράμετρος είναι ψευδής και το **path** είναι κενό, ρίχνεται ArgumentException· εάν αυτή η παράμετρος είναι ψευδής και το **path** είναι null, ρίχνεται ArgumentNullException. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [Path](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
