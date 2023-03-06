---
title: AbstractPath.Combine
second_title: Aspose.GIS لمرجع .NET API
description: AbstractPath طريقة. يجمع هذاAbstractPath بمكونات المسار المحددة.
type: docs
weight: 50
url: /ar/net/aspose.gis/abstractpath/combine/
---
## AbstractPath.Combine method

يجمع هذا[`AbstractPath`](../) بمكونات المسار المحددة.

```csharp
public virtual AbstractPath Combine(string location)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| location | String | مكون مسار لإلحاقه بهذا[`AbstractPath`](../). |

### قيمة الإرجاع

جديد[`AbstractPath`](../) مشيرا إلى أ[`Location`](../location/) هذا هو مزيج من المواقع من هذا[`AbstractPath`](../)و الوسيطة .

### ملاحظات

عادة لا يجب أن يتجاوز الوارث هذه الطريقة. يربط التنفيذ الافتراضي هذا[`Location`](../location/) مع الحجة ويدعو[`WithLocation`](../withlocation/) مع السلسلة المتسلسلة كوسيطة. يتم تحديد نتيجة المجموعة بالطريقة التالية:  إذا كانت الحجة تبدأ بـ[`Separator`](../separator/)، النتيجة المركبة تساوي الوسيطة ؛ خلاف ذلك ، إذا[`Location`](../location/) ينتهي بـ[`Separator`](../separator/) ، نتيجة المجموعة تساوي` +`؛ خلاف ذلك ، فإن النتيجة تساوي` + +`

### أنظر أيضا

* class [AbstractPath](../)
* مساحة الاسم [Aspose.Gis](../../abstractpath/)
* المجسم [Aspose.GIS](../../../)


