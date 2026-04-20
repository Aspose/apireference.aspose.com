---
title: "طريقة System::Uri::TryCreate"
linktitle: "TryCreate"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Uri::TryCreate. تُنشئ كائن Uri من الـ URI الأساسي والـ URIs النسبية المحددة في C++."
type: docs
weight: 4400
url: /ar/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


ينشئ كائن [Uri](../) من الـ URI الأساسي والـ URIs النسبية المحددة.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | الـ URI الأساسي |
| relativeUri | const SharedPtr\<Uri\>\& | الـ URI النسبي الذي يُضاف إلى الـ URI الأساسي |
| result | SharedPtr\<Uri\>\& | معامل الإخراج الذي، إذا نجحت عملية الإنشاء، يشير إلى كائن [Uri](../) الجديد المُنشأ عند إرجاع الطريقة |

### ReturnValue

صحيح إذا نجحت عملية الإنشاء، وإلا - خطأ

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


ينشئ كائن [Uri](../) من كائن [Uri](../) المحدد الذي يمثل الـ URI الأساسي وتمثيل السلسلة للـ URI النسبي.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | الـ URI الأساسي |
| relativeUri | const String\& | الـ URI النسبي الذي يُضاف إلى الـ URI الأساسي |
| result | SharedPtr\<Uri\>\& | معامل الإخراج الذي، إذا نجحت عملية الإنشاء، يشير إلى كائن [Uri](../) الجديد المُنشأ عند إرجاع الطريقة |

### ReturnValue

صحيح إذا نجحت عملية الإنشاء، وإلا - خطأ

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


ينشئ كائن [Uri](../) يمثل الـ URI المحدد؛ معلمة تحدد نوع الـ URI.

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| uriString | const String\& | سلسلة الـ URI التي سيتم تمثيلها بواسطة الكائن الجاري إنشاؤه |
| uriKind | UriKind | يحدد نوع الـ URI |
| result | SharedPtr\<Uri\>\& | معامل الإخراج الذي، إذا نجحت عملية الإنشاء، يشير إلى كائن [Uri](../) الجديد المُنشأ عند إرجاع الطريقة |

### ReturnValue

صحيح إذا نجحت عملية الإنشاء، وإلا - خطأ

## انظر أيضًا

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
