---
title: "System::IO::FileOptions enum"
linktitle: "FileOptions"
second_title: "Aspose.Page لـ C++"
description: "System::IO::FileOptions enum. تمثل خيارات متقدمة لإنشاء كائن FileStream في C++."
type: docs
weight: 3200
url: /ar/cpp/system.io/fileoptions/
---
## FileOptions enum


تمثل خيارات متقدمة لإنشاء كائن [FileStream](../filestream/).

```cpp
enum class FileOptions
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| لا شيء | 0 | لا توجد خيارات إضافية. |
| Encrypted | 16384 | الملف مشفر. غير مُنفذ. |
| DeleteOnClose | 67108864 | يجب حذف الملف تلقائيًا عندما لا يكون قيد الاستخدام بعد الآن. |
| SequentialScan | 134217728 | يجب الوصول إلى الملف بشكل تسلسلي. |
| RandomAccess | 268435456 | يتم الوصول إلى الملف عشوائيًا. |
| Asynchronous | 1073741824 | يمكن استخدام الملف لعمليات الإدخال/الإخراج غير المتزامنة. |
| WriteThrough | n/a | يجب أن تذهب جميع عمليات الكتابة مباشرة إلى القرص متجاوزة أي ذاكرة تخزين مؤقت وسيطة. |

## انظر أيضًا

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
