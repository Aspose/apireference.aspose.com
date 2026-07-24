---
title: "طريقة System::Uri::TryCreate"
linktitle: "TryCreate"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Uri::TryCreate. تُنشئ كائن Uri من القاعدة المحددة وعناوين URI النسبية في C++."
type: docs
weight: 4400
url: /ar/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


يُنشئ كائن [Uri](../) من القاعدة المحددة وعناوين URI النسبية.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| baseUri | const SharedPtr\\<Uri\\>\\& | عنوان URI الأساسي |
| relativeUri | const SharedPtr\\<Uri\\>\\& | عنوان URI النسبي الذي يُضاف إلى عنوان URI الأساسي |
| result | SharedPtr\<Uri\>\& | معامل الإخراج الذي، إذا نجحت العملية، يشير إلى كائن [Uri](../) المُنشأ حديثًا عند عودة الطريقة |

### ReturnValue

صحيح إذا نجحت العملية، وإلا - خطأ

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


يُنشئ كائن [Uri](../) من كائن [Uri](../) المحدد الذي يمثل عنوان URI الأساسي وتمثيل السلسلة لعنوان URI النسبي.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| baseUri | const SharedPtr\\<Uri\\>\\& | عنوان URI الأساسي |
| relativeUri | const String\& | عنوان URI النسبي الذي يُضاف إلى عنوان URI الأساسي |
| result | SharedPtr\<Uri\>\& | معامل الإخراج الذي، إذا نجحت العملية، يشير إلى كائن [Uri](../) المُنشأ حديثًا عند عودة الطريقة |

### ReturnValue

صحيح إذا نجحت العملية، وإلا - خطأ

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


يُنشئ كائن [Uri](../) يمثل عنوان URI المحدد؛ معلمة تحدد نوع URI.

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| uriString | const String\& | سلسلة URI التي سيتم تمثيلها بواسطة الكائن الجاري إنشاؤه |
| uriKind | UriKind | يحدد نوع URI |
| result | SharedPtr\<Uri\>\& | معامل الإخراج الذي، إذا نجحت العملية، يشير إلى كائن [Uri](../) المُنشأ حديثًا عند عودة الطريقة |

### ReturnValue

صحيح إذا نجحت العملية، وإلا - خطأ

## انظر أيضًا

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
