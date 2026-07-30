---
title: "طريقة System::IO::File::OpenText"
linktitle: "OpenText"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::File::OpenText. تفتح الملف الموجود المحدد لقراءة النص باستخدام ترميز UTF-8 دون مشاركة في C++."
type: docs
weight: 2100
url: /ar/cpp/system.io/file/opentext/
---
## File::OpenText method


يفتح الملف الموجود المحدد لقراءة النص باستخدام ترميز UTF-8 دون مشاركة.

```cpp
static StreamReaderPtr System::IO::File::OpenText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | مسار الملف الذي سيتم فتحه |
| encoding | const EncodingPtr\& | ترميز الأحرف الذي سيُستخدم |

### ReturnValue

مؤشر مشترك إلى كائن [StreamWriter](../../streamwriter/) مرتبط بالملف المفتوح

## انظر أيضًا

* Typedef [StreamReaderPtr](../../../system/streamreaderptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
