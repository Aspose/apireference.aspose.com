---
title: "System::IO::BasicSystemIOStreamWrapper κλάση"
linktitle: "BasicSystemIOStreamWrapper"
second_title: "Aspose.Page για C++"
description: "System::IO::BasicSystemIOStreamWrapper κλάση. Αντιπροσωπεύει έναν wrapper τύπου std::iostream που χρησιμοποιεί το BasicSystemIOStreamBuf ως εσωτερική ενδιάμεση μνήμη στη C++."
type: docs
weight: 500
url: /el/cpp/system.io/basicsystemiostreamwrapper/
---
## BasicSystemIOStreamWrapper class


Αντιπροσωπεύει έναν wrapper τύπου std::iostream που χρησιμοποιεί το [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) ως εσωτερική ενδιάμεση μνήμη.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamWrapper : public std::basic_iostream<Elem, std::char_traits<Elem>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamWrapper\&&) | Χρησιμοποιείται στον κατασκευαστή μετακίνησης και στον τελεστή ανάθεσης μετακίνησης για την επαναφορά δεικτών και την κλήση του [swap()](./swap/). |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Δημιουργεί ένα νέο στιγμιότυπο του [BasicSystemIOStreamWrapper](./). |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(const BasicSystemIOStreamWrapper\&) | Κατασκευαστής αντιγραφής. Διαγράφηκε. |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(BasicSystemIOStreamWrapper\&&) | Κατασκευαστής μετακίνησης. |
| [operator=](./operator=/)(const BasicSystemIOStreamWrapper\&) | Τελεστής ανάθεσης αντιγραφής. Διαγράφηκε. |
| [operator=](./operator=/)(BasicSystemIOStreamWrapper\&&) | Τελεστής ανάθεσης μετακίνησης. |
| [swap](./swap/)(BasicSystemIOStreamWrapper\&) | Κλήση για ανταλλαγή *this και **right**, εάν δεν είναι ίσα. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [char_type](./char_type/) |  |
| [Mybase](./mybase/) |  |
| [Mysb](./mysb/) |  |
| [traits_type](./traits_type/) |  |
## Δείτε επίσης

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
