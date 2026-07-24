---
title: "طريقة System::String::Join"
linktitle: "Join"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::String::Join. تقوم بدمج المصفوفة باستخدام السلسلة كفاصل في C++."
type: docs
weight: 7300
url: /ar/cpp/system/string/join/
---
## String::Join(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) method


يجمع المصفوفة باستخدام السلسلة كفاصل.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<SharedPtr<Object>> &parts)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| separator | const String\& | [String](../) لتضع بين عناصر المصفوفة عند دمجها. |
| parts | const ArrayPtr\<SharedPtr\<Object\>\>\& | [Array](../../array/) من الأجزاء التي سيتم دمجها. |

### ReturnValue

[String](../) representing joint elements.

## انظر أيضًا

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const ArrayPtr\<String\>\&, int, int) method


يجمع المصفوفة باستخدام السلسلة كفاصل.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<String> &parts, int startIndex=0, int count=-1)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| separator | const String\& | [String](../) لتضع بين عناصر المصفوفة عند دمجها. |
| parts | const ArrayPtr\<String\>\& | [Array](../../array/) من الأجزاء التي سيتم دمجها. |
| startIndex | int | الفهرس الأول في المصفوفة للبدء بالدمج منه. |
| count | int | عدد عناصر المصفوفة التي سيتم دمجها. -1 تعني 'حتى نهاية المصفوفة'. |

### ReturnValue

[String](../) representing joint array elements.

## انظر أيضًا

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) method


يجمع المصفوفة باستخدام السلسلة كفاصل.

```cpp
static String System::String::Join(const String &separator, const SharedPtr<System::Collections::Generic::IEnumerable<String>> &parts)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| separator | const String\& | [String](../) لتضع بين عناصر المصفوفة عند دمجها. |
| الأجزاء | const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\& | - كائن قابل للتعداد للأجزاء |

### ReturnValue

[String](../) representing joint elements.

## انظر أيضًا

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const System::Details::ArrayView\<String\>\&, int, int) method


يجمع المصفوفة باستخدام السلسلة كفاصل.

```cpp
static String System::String::Join(const String &separator, const System::Details::ArrayView<String> &parts, int startIndex=0, int count=-1)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| separator | const String\& | [String](../) لتضع بين عناصر المصفوفة عند دمجها. |
| الأجزاء | const System::Details::ArrayView\<String\>\& | ArrayView للأجزاء التي سيتم دمجها. |
| startIndex | int | الفهرس الأول في المصفوفة للبدء بالدمج منه. |
| count | int | عدد عناصر المصفوفة التي سيتم دمجها. -1 تعني 'حتى نهاية المصفوفة'. |

### ReturnValue

[String](../) representing joint array elements.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
