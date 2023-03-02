---
title: VectorLayer.Add
second_title: Aspose.GIS لمرجع .NET API
description: VectorLayer طريقة. يضيف معلمًا جديدًا إلى الطبقة  إذا كان مدعومًا من قبلVectorLayer سDriver .
type: docs
weight: 80
url: /ar/net/aspose.gis/vectorlayer/add/
---
## Add(Feature) {#add}

يضيف معلمًا جديدًا إلى الطبقة ، إذا كان مدعومًا من قبل[`VectorLayer`](../) س[`Driver`](../driver/) .

```csharp
public void Add(Feature feature)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| feature | Feature | الميزة المراد إضافتها. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| InvalidOperationException | يتم طرحها إذا كانت الطبقة للقراءة فقط. |

### أنظر أيضا

* class [Feature](../../feature/)
* class [VectorLayer](../)
* مساحة الاسم [Aspose.Gis](../../vectorlayer/)
* المجسم [Aspose.GIS](../../../)

---

## Add(Feature, IFeatureStyle) {#add_1}

يضيف معلمًا جديدًا بالنمط المحدد إلى الطبقة ، إذا كان مدعومًا من قبل[`VectorLayer`](../) س[`Driver`](../driver/) .

```csharp
public virtual void Add(Feature feature, IFeatureStyle style)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| feature | Feature | الميزة المراد إضافتها. |
| style | IFeatureStyle | نمط الميزة. يستخدم`null` للإشارة إلى النمط المفقود. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| InvalidOperationException | يتم طرحها إذا كانت الطبقة لا تدعم الأنماط أو كانت الطبقة للقراءة فقط. |
| InvalidOperationException | يتم طرحها إذا كانت الطبقات القابلة للتحرير لا تدعم الأنماط. |
| ArgumentException | يتم طرحه إذا كان النمط لا يتطابق مع نوع برنامج التشغيل. |

### أنظر أيضا

* class [Feature](../../feature/)
* interface [IFeatureStyle](../../ifeaturestyle/)
* class [VectorLayer](../)
* مساحة الاسم [Aspose.Gis](../../vectorlayer/)
* المجسم [Aspose.GIS](../../../)


