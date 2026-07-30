---
title: "Metodo System::String::Join"
linktitle: "Join"
second_title: "Aspose.Font per C++"
description: "Metodo System::String::Join. Unisce un array usando la stringa come separatore in C++."
type: docs
weight: 7300
url: /it/cpp/system/string/join/
---
## String::Join(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) method


Unisce l'array usando la stringa come separatore.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<SharedPtr<Object>> &parts)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| separator | const String\& | [String](../) da inserire tra gli elementi dell'array durante l'unione. |
| parts | const ArrayPtr\<SharedPtr\<Object\>\>\& | [Array](../../array/) di parti da unire. |

### ReturnValue

[String](../) representing joint elements.

## Vedi anche

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Join(const String\&, const ArrayPtr\<String\>\&, int, int) method


Unisce l'array usando la stringa come separatore.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<String> &parts, int startIndex=0, int count=-1)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| separator | const String\& | [String](../) da inserire tra gli elementi dell'array durante l'unione. |
| parts | const ArrayPtr\<String\>\& | [Array](../../array/) di parti da unire. |
| startIndex | int | Primo indice nell'array da cui iniziare l'unione. |
| count | int | Numero di elementi dell'array da unire. -1 significa 'fino alla fine dell'array'. |

### ReturnValue

[String](../) representing joint array elements.

## Vedi anche

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Join(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) method


Unisce l'array usando la stringa come separatore.

```cpp
static String System::String::Join(const String &separator, const SharedPtr<System::Collections::Generic::IEnumerable<String>> &parts)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| separator | const String\& | [String](../) da inserire tra gli elementi dell'array durante l'unione. |
| parti | const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\& | - oggetto enumerabile di parti |

### ReturnValue

[String](../) representing joint elements.

## Vedi anche

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Join(const String\&, const System::Details::ArrayView\<String\>\&, int, int) method


Unisce l'array usando la stringa come separatore.

```cpp
static String System::String::Join(const String &separator, const System::Details::ArrayView<String> &parts, int startIndex=0, int count=-1)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| separator | const String\& | [String](../) da inserire tra gli elementi dell'array durante l'unione. |
| parti | const System::Details::ArrayView\<String\>\& | ArrayView di parti da unire. |
| startIndex | int | Primo indice nell'array da cui iniziare l'unione. |
| count | int | Numero di elementi dell'array da unire. -1 significa 'fino alla fine dell'array'. |

### ReturnValue

[String](../) representing joint array elements.

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
