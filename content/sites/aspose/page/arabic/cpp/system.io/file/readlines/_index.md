---
title: "طريقة System::IO::File::ReadLines"
linktitle: "ReadLines"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::File::ReadLines. تقرأ محتوى الملف النصي المحدد سطرًا بسطر باستخدام الترميز المحدد للأحرف وتُرجِع مجموعة قابلة للتعداد من السلاسل، كل واحدة تمثل سطرًا واحدًا من محتوى الملف في C++."
type: docs
weight: 2600
url: /ar/cpp/system.io/file/readlines/
---
## File::ReadLines method


يقرأ محتوى ملف النص المحدد سطرًا بسطر باستخدام الترميز الأحرف المحدد ويعيد مجموعة قابلة للتعداد من السلاسل، كل منها يمثل سطرًا واحدًا من محتوى الملف.

```cpp
static SharedPtr<Collections::Generic::IEnumerable<String>> System::IO::File::ReadLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المسار | const String\& | مسار الملف للقراءة |
| الترميز | const EncodingPtr\& | ترميز الأحرف المستخدم |

### ReturnValue

مجموعة قابلة للتعداد من السلاسل تمثل محتوى الملف المحدد

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
