---
title: "منشئ System::IO::FileStream::FileStream"
linktitle: "FileStream"
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام منشئ FileStream لفئة System::IO::FileStream في C++."
type: docs
weight: 100
url: /ar/cpp/system.io/filestream/filestream/
---
## FileStream::FileStream(const FileStream\&) constructor




```cpp
System::IO::FileStream::FileStream(const FileStream &)=delete
```

## انظر أيضًا

* Class [FileStream](../)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::FileStream(const String\&, FileMode) constructor


ينشئ نسخة جديدة من فئة [FileStream](../) ويُهيئها بالمعلمات المحددة.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | مسار الملف المراد فتحه. |
| mode | FileMode | يحدد الوضع الذي يُفتح به الملف. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) constructor


ينشئ نسخة جديدة من فئة [FileStream](../) ويُهيئها بالمعلمات المحددة.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share, int32_t buffer_size, bool useAsync)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | مسار الملف المراد فتحه. |
| mode | FileMode | يحدد الوضع الذي يُفتح به الملف. |
| وصول | FileAccess | نوع الوصول المطلوب. |
| share | FileShare | نوع الوصول الذي تمتلكه كائنات [FileStream](../) الأخرى للملف المفتوح. |
| buffer_size | int32_t | عدد البايتات المخزنة مؤقتًا أثناء عمليات القراءة والكتابة. |
| useAsync | bool | يحدد ما إذا كان يجب استخدام الإدخال/الإخراج غير المتزامن أو الإدخال/الإخراج المتزامن. |
## ملاحظات



قد لا يدعم نظام التشغيل الأساسي الإدخال/الإخراج غير المتزامن.

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) constructor


ينشئ نسخة جديدة من فئة [FileStream](../) ويُهيئها بالمعلمات المحددة.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::Read, int32_t buffer_size=DefaultBufferSize, FileOptions options=FileOptions::SequentialScan)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | مسار الملف المراد فتحه. |
| mode | FileMode | يحدد الوضع الذي يُفتح به الملف. |
| وصول | FileAccess | نوع الوصول المطلوب. |
| share | FileShare | نوع الوصول الذي تمتلكه كائنات [FileStream](../) الأخرى للملف المفتوح. |
| buffer_size | int32_t | عدد البايتات المخزنة مؤقتًا أثناء عمليات القراءة والكتابة. |
| الخيارات | FileOptions | خيارات إضافية. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Enum [FileOptions](../../fileoptions/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
