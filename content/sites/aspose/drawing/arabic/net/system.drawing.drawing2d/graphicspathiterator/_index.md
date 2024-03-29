---
title: GraphicsPathIterator
second_title: Aspose.Drawing لمرجع NET API
description: يوفر القدرة على التكرار عبر المسارات الفرعية في ملفGraphicsPath واختبر أنواع الأشكال الموجودة في كل مسار فرعي . لا يمكن توريث هذه الفئة.
type: docs
weight: 270
url: /ar/net/system.drawing.drawing2d/graphicspathiterator/
---
## GraphicsPathIterator class

يوفر القدرة على التكرار عبر المسارات الفرعية في ملفGraphicsPath واختبر أنواع الأشكال الموجودة في كل مسار فرعي . لا يمكن توريث هذه الفئة.

```csharp
public sealed class GraphicsPathIterator : IDisposable
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [GraphicsPathIterator](graphicspathiterator)(GraphicsPath) | يقوم بتهيئة مثيل جديد لملف[`GraphicsPathIterator`](../graphicspathiterator) فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Count](../../system.drawing.drawing2d/graphicspathiterator/count) { get; } | يحصل على عدد النقاط في المسار . |
| [SubpathCount](../../system.drawing.drawing2d/graphicspathiterator/subpathcount) { get; } | يحصل على عدد المسارات الفرعية في المسار. |

## طُرق

| اسم | وصف |
| --- | --- |
| [CopyData](../../system.drawing.drawing2d/graphicspathiterator/copydata)(ref PointF[], ref byte[], int, int) | نسخ خاصية GraphicsPath.PathPoints ومصفوفات خاصية GraphicsPath.PathTypes المرتبطة[`GraphicsPath`](../graphicspath) في المصفوفتين المحددتين. |
| [Dispose](../../system.drawing.drawing2d/graphicspathiterator/dispose)() | تنفيذ مهام محددة بواسطة التطبيق مرتبطة بتحرير الموارد غير المُدارة أو تحريرها أو إعادة تعيينها. |
| [Enumerate](../../system.drawing.drawing2d/graphicspathiterator/enumerate)(ref PointF[], ref byte[]) | نسخ خاصية GraphicsPath.PathPoints ومصفوفات خاصية GraphicsPath.PathTypes المرتبطة[`GraphicsPath`](../graphicspath) في المصفوفتين المحددتين. |
| [HasCurve](../../system.drawing.drawing2d/graphicspathiterator/hascurve)() | يشير إلى ما إذا كان المسار مرتبطًا بذلك[`GraphicsPathIterator`](../graphicspathiterator) يحتوي على منحنى. |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker#nextmarker_1)(GraphicsPath) | هذا[`GraphicsPathIterator`](../graphicspathiterator) الكائن لديه[`GraphicsPath`](../graphicspath) الكائن المرتبط به . هذه الطريقة تزيد من[`GraphicsPath`](../graphicspath) إلى العلامة التالية في path ونسخ جميع النقاط الموجودة بين العلامة الحالية والعلامة التالية (أو نهاية المسار) إلى ثانية[`GraphicsPath`](../graphicspath) كائن تم تمريره إلى المعلمة. |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker#nextmarker)(out int, out int) | يزيد[`GraphicsPathIterator`](../graphicspathiterator)إلى العلامة التالية في path وإرجاع فهارس البداية والإيقاف عن طريق المعلمات [out] . |
| [NextPathType](../../system.drawing.drawing2d/graphicspathiterator/nextpathtype)(out byte, out int, out int) | الحصول على فهرس البداية وفهرس النهاية للمجموعة التالية من نقاط البيانات التي لها نفس النوع. |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath#nextsubpath_1)(GraphicsPath, out bool) | يحصل على الشكل التالي (المسار الفرعي) من المسار المرتبط بهذا[`GraphicsPathIterator`](../graphicspathiterator) . |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath#nextsubpath)(out int, out int, out bool) | ينقل ملف[`GraphicsPathIterator`](../graphicspathiterator) إلى المسار الفرعي التالي في المسار. يتم تضمين فهرس البداية وفهرس النهاية للمسار الفرعي التالي في المعلمات [الخارج]. |
| [Rewind](../../system.drawing.drawing2d/graphicspathiterator/rewind)() | ترجيع هذا[`GraphicsPathIterator`](../graphicspathiterator) إلى بداية المسار المرتبط به. |

### أنظر أيضا

* مساحة الاسم [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
