---
title: "System::Runtime::InteropServices::Marshal κλάση"
linktitle: "Marshal"
second_title: "Aspose.Page για C++"
description: "System::Runtime::InteropServices::Marshal κλάση. Παρέχει υλοποίηση μαρσαρίσματος. Μόνο για συμβατότητα με μεταφρασμένο κώδικα, καθώς δεν υποστηρίζεται διαχειριζόμενος κώδικας στην πλευρά C++. Αυτός είναι ένας στατικός τύπος χωρίς υπηρεσίες στιγμιοτύπων. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του με οποιονδήποτε τρόπο σε C++."
type: docs
weight: 100
url: /el/cpp/system.runtime.interopservices/marshal/
---
## Marshal class


Παρέχει υλοποίηση μαρσαρίσματος. Μόνο για συμβατότητα με μεταγλωττισμένο κώδικα, καθώς δεν υποστηρίζεται διαχειριζόμενος κώδικας στην πλευρά του C++. Πρόκειται για στατικό τύπο χωρίς υπηρεσίες στιγμιοτύπων. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του με κανέναν τρόπο.

```cpp
class Marshal
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [AllocHGlobal](./allochglobal/)(int32_t) | Κατανέμει μη διαχειριζόμενη μνήμη. |
| static [AllocHGlobal](./allochglobal/)(IntPtr) | Κατανέμει μη διαχειριζόμενη μνήμη. |
| static [Copy](./copy/)(const IntPtr, container\&&, int, int) | Υλοποιεί public static void Copy(IntPtr source, byte[] destination, int startIndex, int length) σημασιολογία. |
| static [Copy](./copy/)(const void *, container\&&, int, int) | Υλοποιεί public static void Copy(IntPtr source, byte[] destination, int startIndex, int length) σημασιολογία. |
| static [Copy](./copy/)(const container\&, int, void *, int) | Υλοποιεί public static void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [Copy](./copy/)(const container\&, int, IntPtr, int) | Υλοποιεί public static void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [FreeHGlobal](./freehglobal/)(IntPtr) | Απελευθερώνει μη διαχειριζόμενη μνήμη. |
| static [GetHRForException](./gethrforexception/)(const System::Exception\&) | Αποκτά HResult από εξαίρεση. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr) | Δημιουργεί ένα διαχειριζόμενο [String](../../system/string/) από μια μη διαχειριζόμενη μηδενική-τερματισμένη UTF8-συμβολοσειρά. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr, int) | Δημιουργεί ένα διαχειριζόμενο [String](../../system/string/) από μια μη διαχειριζόμενη UTF8-συμβολοσειρά. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr) | Δημιουργεί ένα διαχειριζόμενο [String](../../system/string/) από μια μη διαχειριζόμενη μηδενική-τερματισμένη συμβολοσειρά. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr, int) | Δημιουργεί ένα διαχειριζόμενο [String](../../system/string/) από μια μη διαχειριζόμενη συμβολοσειρά. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr) | Δημιουργεί ένα διαχειριζόμενο [String](../../system/string/) από μια μη διαχειριζόμενη μηδενική-τερματισμένη unicode συμβολοσειρά. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr, int) | Δημιουργεί ένα διαχειριζόμενο [String](../../system/string/) από μια μη διαχειριζόμενη unicode συμβολοσειρά. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr) | Δημιουργεί ένα διαχειριζόμενο [String](../../system/string/) από μια μη διαχειριζόμενη μηδενική-τερματισμένη UTF8-συμβολοσειρά. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr, int) | Δημιουργεί ένα διαχειριζόμενο [String](../../system/string/) από μια μη διαχειριζόμενη UTF8-συμβολοσειρά. |
| static [ReadByte](./readbyte/)(IntPtr, int) | Διαβάζει byte από τη μνήμη. |
| static [ReadInt16](./readint16/)(IntPtr, int) | Διαβάζει short από τη μνήμη. |
| static [ReadInt32](./readint32/)(IntPtr, int) | Διαβάζει int από τη μνήμη. |
| static [SecureStringToGlobalAllocAnsi](./securestringtoglobalallocansi/)(const SharedPtr\<Security::SecureString\>\&) | Αντιγράφει τα περιεχόμενα της καθορισμένης ασφαλούς συμβολοσειράς σε μη διαχειριζόμενη μνήμη, μετατρέποντας σε μορφή ANSI. |
| static [SecureStringToGlobalAllocUnicode](./securestringtoglobalallocunicode/)(const SharedPtr\<Security::SecureString\>\&) | Αντιγράφει τα περιεχόμενα της καθορισμένης ασφαλούς συμβολοσειράς σε μη διαχειριζόμενη μνήμη. |
| static [StringToHGlobalAnsi](./stringtohglobalansi/)(const String\&) | Αντιγράφει τα περιεχόμενα μιας καθορισμένης συμβολοσειράς σε μη διαχειριζόμενη μνήμη. |
| static [StringToHGlobalAuto](./stringtohglobalauto/)(const String\&) | Αντιγράφει τα περιεχόμενα μιας καθορισμένης συμβολοσειράς σε μη διαχειριζόμενη μνήμη, μετατρέποντας σε μορφή ANSI εάν απαιτείται. |
| static [StringToHGlobalUni](./stringtohglobaluni/)(const String\&) | Αντιγράφει τα περιεχόμενα μιας καθορισμένης συμβολοσειράς σε μη διαχειριζόμενη μνήμη. |
| static [WriteByte](./writebyte/)(IntPtr, int, uint8_t) | Γράφει byte στη μνήμη. |
| static [WriteByte](./writebyte/)(IntPtr, uint8_t) | Γράφει byte στη μνήμη. |
| static [WriteInt16](./writeint16/)(IntPtr, int, int16_t) | Γράφει short στη μνήμη. |
| static [WriteInt32](./writeint32/)(IntPtr, int, int32_t) | Γράφει int στη μνήμη. |
| static [WriteInt64](./writeint64/)(IntPtr, int, int64_t) | Γράφει long στη μνήμη. |
| static [ZeroFreeGlobalAllocAnsi](./zerofreeglobalallocansi/)(IntPtr) | Απελευθερώνει τον μη διαχειριζόμενο δείκτη συμβολοσειράς που δημιουργήθηκε με τη μέθοδο SecureStringToGlobalAllocAnsi. |
| static [ZeroFreeGlobalAllocUnicode](./zerofreeglobalallocunicode/)(IntPtr) | Απελευθερώνει τον μη διαχειριζόμενο δείκτη συμβολοσειράς που δημιουργήθηκε με τη μέθοδο SecureStringToGlobalAllocUnicode. |
## Δείτε επίσης

* Namespace [System::Runtime::InteropServices](../)
* Library [Aspose.Page for C++](../../)
