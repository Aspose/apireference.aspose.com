---
title: "System::Text::StringBuilder::Insert μέθοδος"
linktitle: "Εισαγωγή"
second_title: "Aspose.Page για C++"
description: "System::Text::StringBuilder::Insert μέθοδος. Εισάγει χαρακτήρες στη σταθερή θέση του builder σε C++."
type: docs
weight: 1200
url: /el/cpp/system.text/stringbuilder/insert/
---
## StringBuilder::Insert(int, const System::ArrayPtr\<char_t\>\&, int, int) method


Εισάγει χαρακτήρες στη σταθερή θέση του builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int index, const System::ArrayPtr<char_t> &chars, int startIndex, int charCount)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση για εισαγωγή χαρακτήρων. |
| chars | const System::ArrayPtr\<char_t\>\& | [Πίνακας](../../../system/array/) από τον οποίο θα εισαχθεί το τμήμα. |
| startIndex | int | [Πίνακας](../../../system/array/) αρχικός δείκτης τμήματος. |
| charCount | int | [Πίνακας](../../../system/array/) μήκος τμήματος. |

### ReturnValue

Αυτός ο δείκτης.

## Δείτε επίσης

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, char_t) method


Εισάγει χαρακτήρα στη σταθερή θέση του builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, char_t ch)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| startIndex | int | Θέση για εισαγωγή χαρακτήρων. |
| ch | char_t | Χαρακτήρας για εισαγωγή. |

### ReturnValue

Αυτός ο δείκτης.

## Δείτε επίσης

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, const String\&) method


Εισάγει συμβολοσειρά στη σταθερή θέση του builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, const String &str)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| startIndex | int | Θέση για εισαγωγή χαρακτήρων. |
| str | const String\& | [String](../../../system/string/) για εισαγωγή. |

### ReturnValue

Αυτός ο δείκτης.

## Δείτε επίσης

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, T) method


Εισάγει τιμή στη σταθερή θέση του builder.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Insert(int startIndex, T value)
```


| Parameter | Περιγραφή |
| --- | --- |
| Parameter | τύπος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| startIndex | int | Θέση για εισαγωγή χαρακτήρων. |
| τιμή | T | Τιμή για μορφοποίηση και εισαγωγή. |

### ReturnValue

Αυτός ο δείκτης.

## Δείτε επίσης

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int32_t, const String\&, int32_t) method


Εισάγει επαναλαμβανόμενη συμβολοσειρά στη σταθερή θέση του builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int32_t index, const String &value, int32_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| δείκτης | int32_t | Θέση για εισαγωγή χαρακτήρων. |
| value | const String\& | [String](../../../system/string/) για εισαγωγή. |
| count | int32_t | Πόσες φορές να επαναληφθεί η συμβολοσειρά **value**. |

### ReturnValue

Αυτός ο δείκτης.

## Δείτε επίσης

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
