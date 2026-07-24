---
title: "System::String::Join yöntemi"
linktitle: "Join"
second_title: "Aspose.Page için C++"
description: "System::String::Join yöntemi. Dizi elemanlarını dizeyi ayırıcı olarak kullanarak C++'da birleştirir."
type: docs
weight: 7300
url: /tr/cpp/system/string/join/
---
## String::Join(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) method


Diziyi ayırıcı olarak string kullanarak birleştirir.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<SharedPtr<Object>> &parts)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| separator | const String\& | [String](../) birleştirirken dizi elemanları arasına koymak için. |
| parts | const ArrayPtr\<SharedPtr\<Object\>\>\& | birleştirilecek parçaların [Array](../../array/) |

### ReturnValue

[String](../) representing joint elements.

## Ayrıca Bakınız

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const ArrayPtr\<String\>\&, int, int) method


Diziyi ayırıcı olarak string kullanarak birleştirir.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<String> &parts, int startIndex=0, int count=-1)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| separator | const String\& | [String](../) birleştirirken dizi elemanları arasına koymak için. |
| parts | const ArrayPtr\<String\>\& | birleştirilecek parçaların [Array](../../array/) |
| startIndex | int | Birleştirmeye başlanacak dizideki ilk indeks. |
| count | int | Birleştirilecek dizi elemanlarının sayısı. -1, 'dizi sonuna kadar' anlamına gelir. |

### ReturnValue

[String](../) representing joint array elements.

## Ayrıca Bakınız

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) method


Diziyi ayırıcı olarak string kullanarak birleştirir.

```cpp
static String System::String::Join(const String &separator, const SharedPtr<System::Collections::Generic::IEnumerable<String>> &parts)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| separator | const String\& | [String](../) birleştirirken dizi elemanları arasına koymak için. |
| parçalar | const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\& | - parçalar enumerable nesnesi |

### ReturnValue

[String](../) representing joint elements.

## Ayrıca Bakınız

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const System::Details::ArrayView\<String\>\&, int, int) method


Diziyi ayırıcı olarak string kullanarak birleştirir.

```cpp
static String System::String::Join(const String &separator, const System::Details::ArrayView<String> &parts, int startIndex=0, int count=-1)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| separator | const String\& | [String](../) birleştirirken dizi elemanları arasına koymak için. |
| parçalar | const System::Details::ArrayView\<String\>\& | Birleştirilecek parçaların ArrayView'i. |
| startIndex | int | Birleştirmeye başlanacak dizideki ilk indeks. |
| count | int | Birleştirilecek dizi elemanlarının sayısı. -1, 'dizi sonuna kadar' anlamına gelir. |

### ReturnValue

[String](../) representing joint array elements.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
