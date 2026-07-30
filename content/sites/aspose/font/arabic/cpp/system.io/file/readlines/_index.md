---
title: "System::IO::File::ReadLines طريقة"
linktitle: "ReadLines"
second_title: "Aspose.Font لـ C++"
description: "System::IO::File::ReadLines طريقة. يقرأ محتوى الملف النصي المحدد سطرًا بسطر باستخدام الترميز المحدد للأحرف ويعيد مجموعة قابلة للتعداد من السلاسل، كل منها يمثل سطرًا واحدًا من محتوى الملف في C++."
type: docs
weight: 2600
url: /ar/cpp/system.io/file/readlines/
---
## File::ReadLines method


يقرأ محتوى ملف النص المحدد سطرًا بسطر باستخدام الترميز الأحرف المحدد ويعيد مجموعة قابلة للتعداد من السلاسل، كل منها يمثل سطرًا واحدًا من محتوى الملف.

```cpp
static SharedPtr<Collections::Generic::IEnumerable<String>> System::IO::File::ReadLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | مسار الملف الذي سيتم قراءته |
| encoding | const EncodingPtr\& | ترميز الأحرف الذي سيُستخدم |

### ReturnValue

مجموعة قابلة للتعداد من السلاسل تمثل محتوى الملف المحدد

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
