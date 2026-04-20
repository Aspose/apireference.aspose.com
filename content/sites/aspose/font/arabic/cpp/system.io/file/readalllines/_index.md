---
title: "طريقة System::IO::File::ReadAllLines"
linktitle: "ReadAllLines"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::File::ReadAllLines. تقرأ محتوى ملف النص المحدد سطرًا بسطر إلى مصفوفة من السلاسل باستخدام ترميز الأحرف المحدد في C++."
type: docs
weight: 2400
url: /ar/cpp/system.io/file/readalllines/
---
## File::ReadAllLines method


يقرأ محتوى ملف النص المحدد سطرًا بسطر إلى مصفوفة من السلاسل باستخدام الترميز الأحرف المحدد.

```cpp
static ArrayPtr<String> System::IO::File::ReadAllLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | مسار الملف الذي سيتم قراءته |
| encoding | const EncodingPtr\& | ترميز الأحرف الذي سيُستخدم |

### ReturnValue

مصفوفة سلاسل، كل عنصر فيها يمثل سطرًا واحدًا من الملف المحدد

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
