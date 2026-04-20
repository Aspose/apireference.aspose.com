---
title: "طريقة System::IO::File::AppendAllLines"
linktitle: "AppendAllLines"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::File::AppendAllLines. تُضيف السلاسل من مجموعة السلاسل المحددة إلى الملف المحدد باستخدام الترميز المحدد عن طريق كتابة كل سلسلة في سطر جديد. إذا لم يكن الملف المحدد موجودًا، يتم إنشاؤه. يُغلق الملف بعد كتابة جميع السلاسل في C++."
type: docs
weight: 100
url: /ar/cpp/system.io/file/appendalllines/
---
## File::AppendAllLines method


يضيف السلاسل من مجموعة السلاسل المحددة إلى الملف المحدد باستخدام الترميز المحدد عن طريق كتابة كل سلسلة في سطر جديد. إذا لم يكن الملف المحدد موجودًا، يتم إنشاؤه. يُغلق الملف بعد كتابة جميع السلاسل.

```cpp
static void System::IO::File::AppendAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | مسار الملف الذي ستُضاف إليه السلاسل |
| المحتويات | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | السلاسل التي ستُكتب إلى الملف |
| encoding | const EncodingPtr\& | ترميز الأحرف الذي سيُستخدم |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
