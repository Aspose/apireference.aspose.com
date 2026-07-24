---
title: "System::IO::File::Create طريقة"
linktitle: "Create"
second_title: "Aspose.Page لـ C++"
description: "System::IO::File::Create طريقة. ينشئ ملفًا جديدًا (أو يكتب فوق الموجود) ويفتحه للقراءة والكتابة باستخدام حجم المخزن المؤقت المحدد والخيارات في C++."
type: docs
weight: 500
url: /ar/cpp/system.io/file/create/
---
## File::Create method


ينشئ ملفًا جديدًا (أو يستبدل الموجود) ويفتحه للوصول للقراءة والكتابة باستخدام حجم المخزن المؤقت والخيارات المحددة.

```cpp
static FileStreamPtr System::IO::File::Create(const String &path, int32_t bufferSize=DefaultBufferSize, FileOptions options=FileOptions::None)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المسار | const String\& | مسار الملف لإنشائه أو الكتابة فوقه |
| bufferSize | int32_t | عدد البايتات المخزنة مؤقتًا عند القراءة من الملف والكتابة إليه |
| خيارات | FileOptions | يحدد كيفية إنشاء الملف أو الكتابة فوقه |

### ReturnValue

مؤشر مشترك إلى كائن [FileStream](../../filestream/) المرتبط بالملف المحدد

## انظر أيضًا

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileOptions](../../fileoptions/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
