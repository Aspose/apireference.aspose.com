---
title: FeatureAttributeCollection.Item
second_title: Aspose.GIS لمرجع .NET API
description: FeatureAttributeCollection ملكية. يحصل أو يحدد ملفFeatureAttribute في الفهرس المحدد.
type: docs
weight: 30
url: /ar/net/aspose.gis/featureattributecollection/item/
---
## FeatureAttributeCollection indexer (1 of 2)

يحصل أو يحدد ملف[`FeatureAttribute`](../../featureattribute/) في الفهرس المحدد.

```csharp
public FeatureAttribute this[int index] { get; set; }
```

| معامل | وصف |
| --- | --- |
| index | الفهرس الصفري للسمة المراد الحصول عليها أو تعيينها. |

### قيمة الإرجاع

السمة في الفهرس المحدد.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | الفهرس خارج النطاق. |
| InvalidOperationException | محاولة تعديل مجموعة مقفلة. |

### أنظر أيضا

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* مساحة الاسم [Aspose.Gis](../../featureattributecollection/)
* المجسم [Aspose.GIS](../../../)

---

## FeatureAttributeCollection indexer (2 of 2)

يحصل أو يحدد ملف[`FeatureAttribute`](../../featureattribute/) باسم محدد.

```csharp
public FeatureAttribute this[string name] { get; }
```

| معامل | وصف |
| --- | --- |
| name | اسم السمات. |

### قيمة الإرجاع

السمة بالاسم المحدد ، أو`null` إذا لم يتم العثور عليه.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | اسم السمة هو`null`. |

### أنظر أيضا

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* مساحة الاسم [Aspose.Gis](../../featureattributecollection/)
* المجسم [Aspose.GIS](../../../)


