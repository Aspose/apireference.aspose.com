---
title: "طريقة System::IO::File::WriteAllLines"
linktitle: "WriteAllLines"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::File::WriteAllLines. تنشئ ملف نصي جديد أو تُستبدل الموجود وتكتب جميع السلاسل من المصفوفة المحددة من السلاسل إليه، كل سلسلة في سطر جديد، باستخدام الترميز المحدد في C++."
type: docs
weight: 3600
url: /ar/cpp/system.io/file/writealllines/
---
## File::WriteAllLines(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) method


ينشئ ملف نص جديد أو يستبدل الموجود ويكتب جميع السلاسل من مصفوفة السلاسل المحددة إليه، كل سلسلة في سطر جديد، باستخدام الترميز المحدد.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const ArrayPtr<String> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المسار | const String\& | الملف لإنشائه أو استبداله |
| المحتويات | const ArrayPtr\<String\>\& | مصفوفة سلاسل |
| الترميز | const EncodingPtr\& | ترميز الأحرف المستخدم |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::WriteAllLines(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) method


ينشئ ملف نص جديد أو يستبدل الموجود ويكتب جميع السلاسل من مجموعة السلاسل القابلة للتعداد المحددة إليه، كل سلسلة في سطر جديد، باستخدام الترميز المحدد.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المسار | const String\& | الملف لإنشائه أو استبداله |
| المحتويات | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | مجموعة قابلة للتعداد من السلاسل |
| الترميز | const EncodingPtr\& | ترميز الأحرف المستخدم |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
