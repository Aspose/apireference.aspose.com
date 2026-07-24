---
title: "طريقة System::IO::File::AppendAllLines"
linktitle: "AppendAllLines"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::File::AppendAllLines. تُضيف السلاسل من مجموعة السلاسل المحددة إلى الملف المحدد باستخدام الترميز المحدد عن طريق كتابة كل سلسلة في سطر جديد. إذا لم يكن الملف المحدد موجودًا، يتم إنشاؤه. يتم إغلاق الملف بعد كتابة جميع السلاسل في C++."
type: docs
weight: 100
url: /ar/cpp/system.io/file/appendalllines/
---
## File::AppendAllLines method


يضيف السلاسل من مجموعة السلاسل المحددة إلى الملف المحدد باستخدام الترميز المحدد عن طريق كتابة كل سلسلة في سطر جديد. إذا لم يكن الملف المحدد موجودًا، يتم إنشاؤه. يُغلق الملف بعد كتابة جميع السلاسل.

```cpp
static void System::IO::File::AppendAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المسار | const String\& | مسار الملف لإضافة السلاسل إليه |
| المحتويات | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | السلاسل التي سيتم كتابتها إلى الملف |
| الترميز | const EncodingPtr\& | ترميز الأحرف المستخدم |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
