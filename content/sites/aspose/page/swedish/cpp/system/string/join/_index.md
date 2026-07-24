---
title: "System::String::Join metod"
linktitle: "Join"
second_title: "Aspose.Page för C++"
description: "System::String::Join metod. Slår samman en array med strängen som avgränsare i C++."
type: docs
weight: 7300
url: /sv/cpp/system/string/join/
---
## String::Join(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) method


Sammanfogar array med sträng som avgränsare.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<SharedPtr<Object>> &parts)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| separator | const String\& | [String](../) att sätta mellan array‑element när de slås samman. |
| parts | const ArrayPtr\<SharedPtr\<Object\>\>\& | [Array](../../array/) med delar att slå samman. |

### ReturnValue

[String](../) representing joint elements.

## Se även

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const ArrayPtr\<String\>\&, int, int) method


Sammanfogar array med sträng som avgränsare.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<String> &parts, int startIndex=0, int count=-1)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| separator | const String\& | [String](../) att sätta mellan array‑element när de slås samman. |
| parts | const ArrayPtr\<String\>\& | [Array](../../array/) med delar att slå samman. |
| startIndex | int | Första indexet i arrayen att börja slå samman från. |
| count | int | Antal array‑element att slå samman. -1 betyder 'tills arrayen slutar'. |

### ReturnValue

[String](../) representing joint array elements.

## Se även

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) method


Sammanfogar array med sträng som avgränsare.

```cpp
static String System::String::Join(const String &separator, const SharedPtr<System::Collections::Generic::IEnumerable<String>> &parts)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| separator | const String\& | [String](../) att sätta mellan array‑element när de slås samman. |
| delar | const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\& | - enumerable‑objekt för delar |

### ReturnValue

[String](../) representing joint elements.

## Se även

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const System::Details::ArrayView\<String\>\&, int, int) method


Sammanfogar array med sträng som avgränsare.

```cpp
static String System::String::Join(const String &separator, const System::Details::ArrayView<String> &parts, int startIndex=0, int count=-1)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| separator | const String\& | [String](../) att sätta mellan array‑element när de slås samman. |
| delar | const System::Details::ArrayView\<String\>\& | ArrayView för delar att slå samman. |
| startIndex | int | Första indexet i arrayen att börja slå samman från. |
| count | int | Antal array‑element att slå samman. -1 betyder 'tills arrayen slutar'. |

### ReturnValue

[String](../) representing joint array elements.

## Se även

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
