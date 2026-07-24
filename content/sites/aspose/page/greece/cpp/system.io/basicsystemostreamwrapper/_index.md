---
title: "System::IO::BasicSystemOStreamWrapper κλάση"
linktitle: "BasicSystemOStreamWrapper"
second_title: "Aspose.Page για C++"
description: "System::IO::BasicSystemOStreamWrapper κλάση. Αντιπροσωπεύει έναν περιτύλιγμα τύπου std::ostream που χρησιμοποιεί το BasicSystemIOStreamBuf ως εσωτερική ενδιάμεση μνήμη σε C++."
type: docs
weight: 700
url: /el/cpp/system.io/basicsystemostreamwrapper/
---
## BasicSystemOStreamWrapper class


Αντιπροσωπεύει έναν περιτύλιγμα τύπου std::ostream που χρησιμοποιεί το [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) ως εσωτερική ενδιάμεση μνήμη.

```cpp
template<typename Elem,typename Traits>class BasicSystemOStreamWrapper : public std::basic_ostream<Elem, std::char_traits<Elem>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemOStreamWrapper\&&) | Χρησιμοποιείται στον κατασκευαστή μετακίνησης και στον τελεστή ανάθεσης μετακίνησης για την επαναφορά δεικτών και την κλήση του [swap()](./swap/). |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Δημιουργεί ένα νέο στιγμιότυπο του [BasicSystemOStreamWrapper](./). |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(const BasicSystemOStreamWrapper\&) | Κατασκευαστής αντιγραφής. Διαγράφηκε. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(BasicSystemOStreamWrapper\&&) | Κατασκευαστής μετακίνησης. |
| [operator=](./operator=/)(const BasicSystemOStreamWrapper\&) | Τελεστής ανάθεσης αντιγραφής. Διαγράφηκε. |
| [operator=](./operator=/)(BasicSystemOStreamWrapper\&&) | Τελεστής ανάθεσης μετακίνησης. |
| [swap](./swap/)(BasicSystemOStreamWrapper\&) | Κλήση για ανταλλαγή *this και **right**, εάν δεν είναι ίσα. |
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
