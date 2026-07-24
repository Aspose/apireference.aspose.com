---
title: "System::String::Join μέθοδος"
linktitle: "Join"
second_title: "Aspose.Page για C++"
description: "System::String::Join μέθοδος. Συγχωνεύει πίνακα χρησιμοποιώντας τη συμβολοσειρά ως διαχωριστικό σε C++."
type: docs
weight: 7300
url: /el/cpp/system/string/join/
---
## String::Join(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) method


Συνδέει τον πίνακα χρησιμοποιώντας τη συμβολοσειρά ως διαχωριστικό.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<SharedPtr<Object>> &parts)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| separator | const String\& | [String](../) για τοποθέτηση μεταξύ στοιχείων του πίνακα κατά τη συγχώνευση. |
| parts | const ArrayPtr\<SharedPtr\<Object\>\>\& | [Array](../../array/) των μερών προς συγχώνευση. |

### ReturnValue

[String](../) representing joint elements.

## Δείτε επίσης

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const ArrayPtr\<String\>\&, int, int) method


Συνδέει τον πίνακα χρησιμοποιώντας τη συμβολοσειρά ως διαχωριστικό.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<String> &parts, int startIndex=0, int count=-1)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| separator | const String\& | [String](../) για τοποθέτηση μεταξύ στοιχείων του πίνακα κατά τη συγχώνευση. |
| parts | const ArrayPtr\<String\>\& | [Array](../../array/) των μερών προς συγχώνευση. |
| startIndex | int | Πρώτος δείκτης στον πίνακα από όπου ξεκινά η συγχώνευση. |
| count | int | Αριθμός στοιχείων του πίνακα προς συγχώνευση. -1 σημαίνει 'μέχρι το τέλος του πίνακα'. |

### ReturnValue

[String](../) representing joint array elements.

## Δείτε επίσης

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) method


Συνδέει τον πίνακα χρησιμοποιώντας τη συμβολοσειρά ως διαχωριστικό.

```cpp
static String System::String::Join(const String &separator, const SharedPtr<System::Collections::Generic::IEnumerable<String>> &parts)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| separator | const String\& | [String](../) για τοποθέτηση μεταξύ στοιχείων του πίνακα κατά τη συγχώνευση. |
| parts | const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\& | - αντικείμενο επαναληπτικού parts |

### ReturnValue

[String](../) representing joint elements.

## Δείτε επίσης

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const System::Details::ArrayView\<String\>\&, int, int) method


Συνδέει τον πίνακα χρησιμοποιώντας τη συμβολοσειρά ως διαχωριστικό.

```cpp
static String System::String::Join(const String &separator, const System::Details::ArrayView<String> &parts, int startIndex=0, int count=-1)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| separator | const String\& | [String](../) για τοποθέτηση μεταξύ στοιχείων του πίνακα κατά τη συγχώνευση. |
| parts | const System::Details::ArrayView\<String\>\& | ArrayView των μερών προς συγχώνευση. |
| startIndex | int | Πρώτος δείκτης στον πίνακα από όπου ξεκινά η συγχώνευση. |
| count | int | Αριθμός στοιχείων του πίνακα προς συγχώνευση. -1 σημαίνει 'μέχρι το τέλος του πίνακα'. |

### ReturnValue

[String](../) representing joint array elements.

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
