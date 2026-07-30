---
title: "طريقة System::IO::File::Create"
linktitle: "Create"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::File::Create. تُنشئ ملفًا جديدًا (أو تُعيد كتابة الملف الموجود) وتفتحه للوصول للقراءة والكتابة باستخدام حجم المخزن المؤقت المحدد والخيارات في C++."
type: docs
weight: 500
url: /ar/cpp/system.io/file/create/
---
## File::Create method


ينشئ ملفًا جديدًا (أو يستبدل الموجود) ويفتحه للوصول للقراءة والكتابة باستخدام حجم المخزن المؤقت والخيارات المحددة.

```cpp
static FileStreamPtr System::IO::File::Create(const String &path, int32_t bufferSize=DefaultBufferSize, FileOptions options=FileOptions::None)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | مسار الملف الذي سيتم إنشاؤه أو إعادة كتابته |
| bufferSize | int32_t | عدد البايتات المخزنة مؤقتًا عند القراءة من الملف والكتابة إليه |
| الخيارات | FileOptions | يحدد كيفية إنشاء أو إعادة كتابة الملف |

### ReturnValue

مؤشر مشترك إلى كائن [FileStream](../../filestream/) المرتبط بالملف المحدد

## انظر أيضًا

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileOptions](../../fileoptions/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
