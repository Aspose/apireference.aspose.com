---
title: AbstractPath.Open
second_title: Aspose.GIS لمرجع .NET API
description: AbstractPath طريقة. يفتح هذاAbstractPathكملف .
type: docs
weight: 120
url: /ar/net/aspose.gis/abstractpath/open/
---
## AbstractPath.Open method

يفتح هذا`AbstractPath`كملف .

```csharp
public abstract Stream Open(FileAccess access)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| access | FileAccess | تحدد مجموعة فرعية من العمليات التي يمكن إجراؤها على ملفStream. |

### قيمة الإرجاع

أStream فتح مع المحددFileAccess .

### ملاحظات

إذا*access* لديه العلمWrite تعيين ، والملف غير موجود ، يجب على الوارث إنشائه. أن`AbstractPath` يمكن فتحه عدة مرات بواسطة`Aspose.GIS` . هذا مطلوب لقراءة file بشكل مستقل مع تيارات متعددة. لا يجب تخزين النتيجة مؤقتًا بل يجب إعادة جديدةStream في كل مرة تسمى هذه الطريقة .

### أنظر أيضا

* class [AbstractPath](../)
* مساحة الاسم [Aspose.Gis](../../abstractpath/)
* المجسم [Aspose.GIS](../../../)


