---
title: "System::String::Join method"
linktitle: "Join"
second_title: "Aspose.Font für C++"
description: "System::String::Join method. Verbindet ein Array, wobei der String als Trennzeichen verwendet wird in C++."
type: docs
weight: 7300
url: /de/cpp/system/string/join/
---
## String::Join(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) method


Verbindet ein Array unter Verwendung eines Strings als Trennzeichen.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<SharedPtr<Object>> &parts)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| separator | const String\& | [String](../) zum Einfügen zwischen Array-Elementen beim Zusammenfügen. |
| parts | const ArrayPtr\<SharedPtr\<Object\>\>\& | [Array](../../array/) von Teilen, die zusammengefügt werden sollen. |

### ReturnValue

[String](../) representing joint elements.

## Siehe auch

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Join(const String\&, const ArrayPtr\<String\>\&, int, int) method


Verbindet ein Array unter Verwendung eines Strings als Trennzeichen.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<String> &parts, int startIndex=0, int count=-1)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| separator | const String\& | [String](../) zum Einfügen zwischen Array-Elementen beim Zusammenfügen. |
| parts | const ArrayPtr\<String\>\& | [Array](../../array/) von Teilen, die zusammengefügt werden sollen. |
| startIndex | int | Erster Index im Array, ab dem das Zusammenfügen beginnt. |
| count | int | Anzahl der Array-Elemente, die zusammengefügt werden sollen. -1 bedeutet 'bis zum Ende des Arrays'. |

### ReturnValue

[String](../) representing joint array elements.

## Siehe auch

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Join(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) method


Verbindet ein Array unter Verwendung eines Strings als Trennzeichen.

```cpp
static String System::String::Join(const String &separator, const SharedPtr<System::Collections::Generic::IEnumerable<String>> &parts)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| separator | const String\& | [String](../) zum Einfügen zwischen Array-Elementen beim Zusammenfügen. |
| Teile | const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\& | - aufzählbares Objekt von Teilen |

### ReturnValue

[String](../) representing joint elements.

## Siehe auch

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Join(const String\&, const System::Details::ArrayView\<String\>\&, int, int) method


Verbindet ein Array unter Verwendung eines Strings als Trennzeichen.

```cpp
static String System::String::Join(const String &separator, const System::Details::ArrayView<String> &parts, int startIndex=0, int count=-1)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| separator | const String\& | [String](../) zum Einfügen zwischen Array-Elementen beim Zusammenfügen. |
| Teile | const System::Details::ArrayView\<String\>\& | ArrayView von Teilen, die zusammengefügt werden sollen. |
| startIndex | int | Erster Index im Array, ab dem das Zusammenfügen beginnt. |
| count | int | Anzahl der Array-Elemente, die zusammengefügt werden sollen. -1 bedeutet 'bis zum Ende des Arrays'. |

### ReturnValue

[String](../) representing joint array elements.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
