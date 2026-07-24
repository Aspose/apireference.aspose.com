---
title: "System::IO::File::OpenText طريقة"
linktitle: "OpenText"
second_title: "Aspose.Page لـ C++"
description: "System::IO::File::OpenText طريقة. يفتح الملف الموجود المحدد لقراءة النص باستخدام ترميز UTF-8 دون مشاركة في C++."
type: docs
weight: 2100
url: /ar/cpp/system.io/file/opentext/
---
## File::OpenText method


يفتح الملف الموجود المحدد لقراءة النص باستخدام ترميز UTF-8 دون مشاركة.

```cpp
static StreamReaderPtr System::IO::File::OpenText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المسار | const String\& | مسار الملف لفتحه |
| الترميز | const EncodingPtr\& | ترميز الأحرف المستخدم |

### ReturnValue

مؤشر مشترك إلى كائن [StreamWriter](../../streamwriter/) مرتبط بالملف المفتوح

## انظر أيضًا

* Typedef [StreamReaderPtr](../../../system/streamreaderptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
