---
title: "System::String::Join-methode"
linktitle: "Join"
second_title: "Aspose.Page voor C++"
description: "System::String::Join-methode. Voegt een array samen met de tekenreeks als scheidingsteken in C++."
type: docs
weight: 7300
url: /nl/cpp/system/string/join/
---
## String::Join(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) method


Voegt een array samen met een string als scheidingsteken.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<SharedPtr<Object>> &parts)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| separator | const String\& | [String](../) om tussen array‑elementen te plaatsen bij het samenvoegen. |
| parts | const ArrayPtr\<SharedPtr\<Object\>\>\& | [Array](../../array/) van delen om samen te voegen. |

### ReturnValue

[String](../) representing joint elements.

## Zie ook

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const ArrayPtr\<String\>\&, int, int) method


Voegt een array samen met een string als scheidingsteken.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<String> &parts, int startIndex=0, int count=-1)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| separator | const String\& | [String](../) om tussen array‑elementen te plaatsen bij het samenvoegen. |
| parts | const ArrayPtr\<String\>\& | [Array](../../array/) van delen om samen te voegen. |
| startIndex | int | Eerste index in de array vanaf waar samengevoegd moet worden. |
| count | int | Aantal array‑elementen om samen te voegen. -1 betekent 'tot het einde van de array'. |

### ReturnValue

[String](../) representing joint array elements.

## Zie ook

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) method


Voegt een array samen met een string als scheidingsteken.

```cpp
static String System::String::Join(const String &separator, const SharedPtr<System::Collections::Generic::IEnumerable<String>> &parts)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| separator | const String\& | [String](../) om tussen array‑elementen te plaatsen bij het samenvoegen. |
| delen | const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\& | - doorlopend object van delen |

### ReturnValue

[String](../) representing joint elements.

## Zie ook

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const System::Details::ArrayView\<String\>\&, int, int) method


Voegt een array samen met een string als scheidingsteken.

```cpp
static String System::String::Join(const String &separator, const System::Details::ArrayView<String> &parts, int startIndex=0, int count=-1)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| separator | const String\& | [String](../) om tussen array‑elementen te plaatsen bij het samenvoegen. |
| delen | const System::Details::ArrayView\<String\>\& | ArrayView van onderdelen om te combineren. |
| startIndex | int | Eerste index in de array vanaf waar samengevoegd moet worden. |
| count | int | Aantal array‑elementen om samen te voegen. -1 betekent 'tot het einde van de array'. |

### ReturnValue

[String](../) representing joint array elements.

## Zie ook

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
