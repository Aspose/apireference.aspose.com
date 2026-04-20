---
title: "طريقة System::IO::File::Open"
linktitle: "Open"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::File::Open. يفتح الملف المحدد في الوضع المحدد للقراءة والكتابة دون مشاركة في C++."
type: docs
weight: 1900
url: /ar/cpp/system.io/file/open/
---
## File::Open(const String\&, FileMode) method


يفتح الملف المحدد في الوضع المحدد للقراءة والكتابة دون مشاركة.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | مسار الملف الذي سيتم فتحه |
| mode | FileMode | يحدد الوضع الذي يُفتح به الملف |

### ReturnValue

كائن [FileStream](../../filestream/) مرتبط بالملف المفتوح

## انظر أيضًا

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## File::Open(const String\&, FileMode, FileAccess, FileShare) method


يفتح الملف المحدد في الوضع المحدد، مع نوع الوصول المحدد وخيار المشاركة.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::None)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | مسار الملف الذي سيتم فتحه |
| mode | FileMode | يحدد الوضع الذي يُفتح به الملف |
| وصول | FileAccess | نوع الوصول المطلوب |
| share | FileShare | نوع الوصول الذي تمتلكه كائنات [FileStream](../../filestream/) الأخرى إلى الملف المفتوح |

### ReturnValue

كائن [FileStream](../../filestream/) مرتبط بالملف المفتوح

## انظر أيضًا

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
