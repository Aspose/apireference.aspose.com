---
title: "Κατασκευαστής System::String::String"
linktitle: "String"
second_title: "Aspose.Page για C++"
description: "Κατασκευαστής System::String::String. Προεπιλεγμένος κατασκευαστής. Δημιουργεί αντικείμενο συμβολοσειράς που θεωρείται null σε C++."
type: docs
weight: 100
url: /el/cpp/system/string/string/
---
## String::String() constructor


Προεπιλεγμένος κατασκευαστής. Δημιουργεί αντικείμενο συμβολοσειράς που θεωρείται μηδενικό.

```cpp
System::String::String()
```

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(codeporting_icu::UnicodeString\&&) constructor


Κατασκευαστής μετακίνησης.

```cpp
System::String::String(codeporting_icu::UnicodeString &&str) noexcept
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | codeporting_icu::UnicodeString\&& | UnicodeString για να ενσωματωθεί σε [String](../). |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&) constructor


Μετατρέπει ολόκληρο τον πίνακα χαρακτήρων σε συμβολοσειρά.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | [Array](../../array/) για μετατροπή σε συμβολοσειρά. |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&, int, int) constructor


Μετατρέπει υποεύρος πίνακα χαρακτήρων σε συμβολοσειρά. Εάν οι παράμετροι είναι εκτός ορίων του πίνακα, δημιουργείται κενή συμβολοσειρά.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr, int offset, int len)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | Πίνακας χαρακτήρων. |
| offset | int | Δείκτης έναρξης υποπίνακα. |
| len | int | Μήκος υποπίνακα. |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char *, int) constructor


Δημιουργεί συμβολοσειρά από δείκτη χαρακτήρα συμβολοσειράς και ρητό μήκος.

```cpp
System::String::String(const char *str, int length)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const char * | Δείκτης [String](../) στα δεδομένα UTF8, μπορεί να είναι κυριολεκτικό ή πίνακας. |
| length | int | Συγκεκριμένο μήκος συμβολοσειράς |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t *, int) constructor


Δημιουργεί συμβολοσειρά από δείκτη χαρακτήρα συμβολοσειράς και ρητό μήκος.

```cpp
System::String::String(const char16_t *str, int length)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const char16_t * | [String](../) δείκτης, μπορεί να είναι κυριολεκτικός ή πίνακας. |
| length | int | Συγκεκριμένο μήκος συμβολοσειράς |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t *, int, int) constructor


Δημιουργεί συμβολοσειρά από δείκτη χαρακτήρα συμβολοσειράς από τη θέση εκκίνησης χρησιμοποιώντας το μήκος.

```cpp
System::String::String(const char16_t *str, int start, int length)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const char16_t * | [String](../) δείκτης, μπορεί να είναι κυριολεκτικός ή πίνακας. |
| έναρξη | int | Αρχική θέση. |
| length | int | [String](../) μήκος. |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t, int) constructor


Κατασκευαστής γεμίσματος.

```cpp
System::String::String(const char16_t ch, int count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ch | const char16_t | Χαρακτήρας γεμίσματος. |
| count | int | Μήκος στόχου. |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const codeporting_icu::UnicodeString\&) constructor


Μετατρέπει το UnicodeString σε [String](../).

```cpp
System::String::String(const codeporting_icu::UnicodeString &str)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const codeporting_icu::UnicodeString\& | UnicodeString για να ενσωματωθεί σε [String](../). |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::string\&) constructor


Δημιουργεί [String](../) από συμβολοσειρά std::string που παρουσιάζεται σε μορφή UTF-8.

```cpp
System::String::String(const std::string &utf8str)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| utf8str | const std::string\& | Συμβολοσειρά std::string για μετατροπή σε [String](../). |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::u16string\&) constructor


Δημιουργεί [String](../) από συμβολοσειρά utf16.

```cpp
System::String::String(const std::u16string &str)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const std::u16string\& | Συμβολοσειρά Utf16 για μετατροπή σε [String](../). |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::u32string\&) constructor


Δημιουργεί [String](../) από συμβολοσειρά std::u32string.

```cpp
System::String::String(const std::u32string &u32str)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| u32str | const std::u32string\& | Συμβολοσειρά std::u32string για μετατροπή σε [String](../). |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::wstring\&) constructor


Δημιουργεί [String](../) από widestring.

```cpp
System::String::String(const std::wstring &str)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const std::wstring\& | Widestring για μετατροπή σε [String](../). |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const String\&) constructor


Κατασκευαστής αντιγραφής.

```cpp
System::String::String(const String &str)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const String\& | [String](../) για αντιγραφή. |

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) constructor


Δημιουργεί συμβολοσειρά από δείκτη χαρακτήρα συμβολοσειράς. Θεωρεί τη δείχθηκε συμβολοσειρά ως null-τερματισμένη σε UTF8, υπολογίζει το μήκος της στόχου συμβολοσειράς βάσει του χαρακτήρα null.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char>::value>::type *=nullptr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const T\& | Δείκτης συμβολοσειράς χαρακτήρων. |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) constructor


Δημιουργεί συμβολοσειρά από δείκτη χαρακτήρα συμβολοσειράς. Θεωρεί τη δείχθηκε συμβολοσειρά ως null-τερματισμένη, υπολογίζει το μήκος της στόχου συμβολοσειράς βάσει του χαρακτήρα null.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char16_t>::value>::type *=nullptr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const T\& | Δείκτης συμβολοσειράς χαρακτήρων. |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) constructor


Δημιουργεί συμβολοσειρά από δείκτη widecharacter συμβολοσειράς. Θεωρεί τη δείχθηκε συμβολοσειρά ως null-τερματισμένη, υπολογίζει το μήκος της στόχου συμβολοσειράς βάσει του χαρακτήρα null. Η μετατροπή από wchar_t είναι χρονοβόρα σε ορισμένες πλατφόρμες, επομένως δεν επιτρέπονται έμμεσες μετατροπές.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, wchar_t>::value>::type *=nullptr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const T\& | Δείκτης συμβολοσειράς χαρακτήρων. |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) constructor


Κατασκευαστής nullptr. Δηλώνεται ως πρότυπο για την επίλυση προτεραιοτήτων με άλλους κατασκευαστές προτύπων.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<std::is_same<T, std::nullptr_t>::value>::type *=nullptr)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Πρέπει να είναι nullptr_t |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const T\& | nullptr |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const wchar_t *, int) constructor


Δημιουργεί συμβολοσειρά από δείκτη widecharacter συμβολοσειράς και ρητό μήκος. Η μετατροπή από wchar_t είναι χρονοβόρα σε ορισμένες πλατφόρμες, επομένως δεν επιτρέπονται έμμεσες μετατροπές.

```cpp
System::String::String(const wchar_t *str, int length)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const wchar_t * | [String](../) δείκτης, μπορεί να είναι κυριολεκτικός ή πίνακας. |
| length | int | Συγκεκριμένο μήκος συμβολοσειράς |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const wchar_t, int) constructor


Κατασκευαστής γεμίσματος. Η μετατροπή από wchar_t είναι χρονοβόρα σε ορισμένες πλατφόρμες, επομένως δεν επιτρέπονται έμμεσες μετατροπές.

```cpp
System::String::String(const wchar_t ch, int count=1)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ch | const wchar_t | Χαρακτήρας γεμίσματος. |
| count | int | Μήκος στόχου. |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(String\&&) constructor


Κατασκευαστής μετακίνησης.

```cpp
System::String::String(String &&str) noexcept
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | String\&& | [String](../) για μετακίνηση δεδομένων από. |

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) constructor


Δημιουργεί συμβολοσειρά από κυριολεκτικό συμβολοσειράς. Θεωρεί το κυριολεκτικό ως null-τερματισμένη συμβολοσειρά σε UTF8, υπολογίζει το μήκος της στόχου συμβολοσειράς βάσει του μεγέθους του κυριολεκτικού.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char>::value>::type *=nullptr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | T\& | [String](../) δείκτης κυριολεκτικού. |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) constructor


Δημιουργεί συμβολοσειρά από κυριολεκτικό συμβολοσειράς. Θεωρεί το κυριολεκτικό ως συμβολοσειρά με τερματισμό null, υπολογίζει το μήκος της στόχου συμβολοσειράς βάσει του μεγέθους του κυριολεκτικού.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char16_t>::value>::type *=nullptr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | T\& | [String](../) δείκτης κυριολεκτικού. |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) constructor


Δημιουργεί συμβολοσειρά από κυριολεκτικό widestring. Θεωρεί το κυριολεκτικό ως null-τερματισμένη συμβολοσειρά, υπολογίζει το μήκος της στόχου συμβολοσειράς βάσει του μεγέθους του κυριολεκτικού. Η μετατροπή από wchar_t είναι χρονοβόρα σε ορισμένες πλατφόρμες, επομένως δεν επιτρέπονται έμμεσες μετατροπές.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, wchar_t>::value>::type *=nullptr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | T\& | [String](../) δείκτης κυριολεκτικού. |

## Δείτε επίσης

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
