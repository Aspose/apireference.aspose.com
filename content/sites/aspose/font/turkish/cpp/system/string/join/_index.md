---
title: "System::String::Join yöntemi"
linktitle: "Join"
second_title: "Aspose.Font için C++"
description: "System::String::Join yöntemi. C++'da dizeyi ayırıcı olarak kullanarak diziyi birleştirir."
type: docs
weight: 7300
url: /tr/cpp/system/string/join/
---
## String::Join(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) method


Diziyi ayırıcı olarak dize kullanarak birleştirir.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<SharedPtr<Object>> &parts)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| separator | const String\& | Diziyi birleştirirken dizi öğeleri arasına konulacak [String](../). |
| parts | const ArrayPtr\<SharedPtr\<Object\>\>\& | Birleştirilecek parçaların [Array](../../array/). |

### ReturnValue

[String](../) representing joint elements.

## Ayrıca Bakınız

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Join(const String\&, const ArrayPtr\<String\>\&, int, int) method


Diziyi ayırıcı olarak dize kullanarak birleştirir.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<String> &parts, int startIndex=0, int count=-1)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| separator | const String\& | Diziyi birleştirirken dizi öğeleri arasına konulacak [String](../). |
| parts | const ArrayPtr\<String\>\& | Birleştirilecek parçaların [Array](../../array/). |
| startIndex | int | Birleştirmeye başlanacak dizideki ilk indeks. |
| count | int | Birleştirilecek dizi öğelerinin sayısı. -1, 'dizi sonuna kadar' anlamına gelir. |

### ReturnValue

[String](../) representing joint array elements.

## Ayrıca Bakınız

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Join(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) method


Diziyi ayırıcı olarak dize kullanarak birleştirir.

```cpp
static String System::String::Join(const String &separator, const SharedPtr<System::Collections::Generic::IEnumerable<String>> &parts)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| separator | const String\& | Diziyi birleştirirken dizi öğeleri arasına konulacak [String](../). |
| parçalar | const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\& | - parçalar enumerable nesnesi |

### ReturnValue

[String](../) representing joint elements.

## Ayrıca Bakınız

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Join(const String\&, const System::Details::ArrayView\<String\>\&, int, int) method


Diziyi ayırıcı olarak dize kullanarak birleştirir.

```cpp
static String System::String::Join(const String &separator, const System::Details::ArrayView<String> &parts, int startIndex=0, int count=-1)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| separator | const String\& | Diziyi birleştirirken dizi öğeleri arasına konulacak [String](../). |
| parçalar | const System::Details::ArrayView\<String\>\& | Birleştirilecek parçaların ArrayView'ı. |
| startIndex | int | Birleştirmeye başlanacak dizideki ilk indeks. |
| count | int | Birleştirilecek dizi öğelerinin sayısı. -1, 'dizi sonuna kadar' anlamına gelir. |

### ReturnValue

[String](../) representing joint array elements.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
