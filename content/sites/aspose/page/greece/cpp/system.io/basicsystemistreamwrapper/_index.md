---
title: "System::IO::BasicSystemIStreamWrapper κλάση"
linktitle: "BasicSystemIStreamWrapper"
second_title: "Aspose.Page για C++"
description: "System::IO::BasicSystemIStreamWrapper κλάση. Αναπαριστά ένα περιτύλιγμα τύπου std::istream που χρησιμοποιεί το BasicSystemIOStreamBuf ως εσωτερική προσωρινή μνήμη σε C++."
type: docs
weight: 600
url: /el/cpp/system.io/basicsystemistreamwrapper/
---
## BasicSystemIStreamWrapper class


Αναπαριστά ένα περιτύλιγμα τύπου std::istream που χρησιμοποιεί το [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) ως εσωτερική προσωρινή μνήμη.

```cpp
template<typename Elem,typename Traits>class BasicSystemIStreamWrapper : public std::basic_istream<Elem, std::char_traits<Elem>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIStreamWrapper\&&) | Χρησιμοποιείται στον κατασκευαστή μετακίνησης και στον τελεστή ανάθεσης μετακίνησης για την επαναφορά δεικτών και την κλήση του [swap()](./swap/). |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Δημιουργεί ένα νέο στιγμιότυπο του [BasicSystemIStreamWrapper](./). |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(const BasicSystemIStreamWrapper\&) | Κατασκευαστής αντιγραφής. Διαγράφηκε. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(BasicSystemIStreamWrapper\&&) | Κατασκευαστής μετακίνησης. |
| [operator=](./operator=/)(const BasicSystemIStreamWrapper\&) | Τελεστής ανάθεσης αντιγραφής. Διαγράφηκε. |
| [operator=](./operator=/)(BasicSystemIStreamWrapper\&&) | Τελεστής ανάθεσης μετακίνησης. |
| [swap](./swap/)(BasicSystemIStreamWrapper\&) | Κλήση για ανταλλαγή *this και **right**, εάν δεν είναι ίσα. |
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
