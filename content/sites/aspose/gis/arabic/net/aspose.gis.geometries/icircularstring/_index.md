---
title: Interface ICircularString
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.Geometries.ICircularString واجهه المستخدم. منحنى متعدد الرؤوس باستيفاء دائري بين النقاط.
type: docs
weight: 960
url: /ar/net/aspose.gis.geometries/icircularstring/
---
## ICircularString interface

منحنى متعدد الرؤوس باستيفاء دائري بين النقاط.

```csharp
public interface ICircularString : ICurve, IEquatable<ICircularString>, IReadOnlyList<IPoint>
```

## طُرق

| اسم | وصف |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icircularstring/toeditable/)() | الحصول على نسخة قابلة للتحرير من هذه الهندسة. |

### ملاحظات

ملف`CircularString` يتكون من مقطع قوس دائري واحد أو أكثر متصل من طرف إلى طرف . تحدد النقاط الثلاث الأولى المقطع الأول. النقطة الأولى هي نقطة بداية القوس . النقطة الثانية هي أي نقطة وسيطة على القوس بخلاف نقطة البداية أو النهاية . النقطة الثالثة هي نهاية القوس. يتم تحديد الأقواس اللاحقة من خلال نقاطها الوسيطة ونقاط النهاية فقط ، حيث يتم تعريف نقطة البداية ضمنيًا كنقطة نهاية المقطع السابق.

### أنظر أيضا

* interface [ICurve](../icurve/)
* interface [IPoint](../ipoint/)
* مساحة الاسم [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* المجسم [Aspose.GIS](../../)


