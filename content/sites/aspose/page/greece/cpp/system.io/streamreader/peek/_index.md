---
title: "System::IO::StreamReader::Peek μέθοδος"
linktitle: "Peek"
second_title: "Aspose.Page για C++"
description: "System::IO::StreamReader::Peek μέθοδος. Διαβάζει έναν μόνο χαρακτήρα από τη ροή χωρίς να αλλάζει τον stream''s δείκτη ανάγνωσης σε C++."
type: docs
weight: 800
url: /el/cpp/system.io/streamreader/peek/
---
## StreamReader::Peek method


Διαβάζει έναν μόνο χαρακτήρα από τη ροή χωρίς να αλλάξει τον κέρσορα ανάγνωσης της ροής.

```cpp
virtual int System::IO::StreamReader::Peek() override
```


### ReturnValue

Διαβάστε χαρακτήρα κωδικοποιημένο με κωδικοποίηση UTF-16· εάν ο διαβασμένος χαρακτήρας αντιπροσωπεύεται από δύο codepoints στην κωδικοποίηση UTF-16, τότε επιστρέφεται μόνο το υψηλό surragate· εάν δεν διαβαστεί κανένας χαρακτήρας, επιστρέφεται -1.

## Δείτε επίσης

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
