---
title: "Κλάση System::IO::BasicSystemIOStreamBuf"
linktitle: "BasicSystemIOStreamBuf"
second_title: "Aspose.Page για C++"
description: "System::IO::BasicSystemIOStreamBuf class. Αντιπροσωπεύει ένα buffer που περιβάλλει ροές τύπου System::IO::Stream και επιτρέπει τη χρήση τους ως εσωτερικό buffer ροών τύπου std::iostream σε C++."
type: docs
weight: 400
url: /el/cpp/system.io/basicsystemiostreambuf/
---
## BasicSystemIOStreamBuf class


Αντιπροσωπεύει ένα buffer που περιβάλλει ροές τύπου [System::IO::Stream](../stream/)-like και επιτρέπει τη χρήση τους ως εσωτερικό buffer ροών τύπου std::iostream.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamBuf : public std::basic_streambuf<Elem, std::char_traits<Elem>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamBuf\&&) | Χρησιμοποιείται στον κατασκευαστή μετακίνησης και στον τελεστή ανάθεσης μετακίνησης για την επαναφορά δεικτών και την κλήση του [swap()](./swap/). |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)() | Δημιουργεί ένα νέο στιγμιότυπο του [BasicSystemIOStreamBuf](./). |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const SharedPtr\<Stream\>\&, SystemIOStreamWrappingMode, const std::locale\&) | Δημιουργεί ένα νέο στιγμιότυπο του [BasicSystemIOStreamBuf](./). |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const BasicSystemIOStreamBuf\&) | Κατασκευαστής αντιγραφής. Διαγράφηκε. |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(BasicSystemIOStreamBuf\&&) | Κατασκευαστής μετακίνησης. |
| [operator=](./operator=/)(const BasicSystemIOStreamBuf\&) | Τελεστής ανάθεσης αντιγραφής. Διαγράφηκε. |
| [operator=](./operator=/)(BasicSystemIOStreamBuf\&&) | Τελεστής ανάθεσης μετακίνησης. |
| [swap](./swap/)(BasicSystemIOStreamBuf\&) | Κλήση για ανταλλαγή *this και right, εάν δεν είναι ίσα. |
| [~BasicSystemIOStreamBuf](./~basicsystemiostreambuf/)() override | Καταστροφέας. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [char_type](./char_type/) |  |
| [int_type](./int_type/) |  |
| [Mysb](./mysb/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [traits_type](./traits_type/) |  |
## Δείτε επίσης

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
