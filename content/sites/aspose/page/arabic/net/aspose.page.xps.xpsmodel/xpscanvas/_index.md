---
title: Class XpsCanvas
second_title: Aspose.Page لمرجع NET API
description: Aspose.Page.XPS.XpsModel.XpsCanvas فصل. فئة تتضمن ميزات عنصر Canvas . يجمع هذا العنصر العناصر معًا. على سبيل المثال  يمكن تجميع الحروف الرسومية وعناصر المسار في لوحة قماشية ليتم تحديدها كوحدة كوجهة ارتباط تشعبي أو لتطبيق قيمة خاصية مكونة على كل عنصر فرعي وعنصر سلف.
type: docs
weight: 2980
url: /ar/net/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class

فئة تتضمن ميزات عنصر Canvas . يجمع هذا العنصر العناصر معًا. على سبيل المثال ، يمكن تجميع الحروف الرسومية وعناصر المسار في لوحة قماشية ليتم تحديدها كوحدة (كوجهة ارتباط تشعبي) أو لتطبيق قيمة خاصية مكونة على كل عنصر فرعي وعنصر سلف.

```csharp
public sealed class XpsCanvas : XpsContentElement
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | إرجاع / تعيين مثيل هندسة المسار الذي يحد من المنطقة المقدمة للعنصر. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | إرجاع عدد العناصر الفرعية . |
| [EdgeMode](../../aspose.page.xps.xpsmodel/xpscanvas/edgemode/) { get; set; } | إرجاع / تعيين القيمة التي تتحكم في كيفية عرض حواف المسارات داخل اللوحة. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | إرجاع / تعيين كائن هدف الارتباط التشعبي. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | يوفر الوصول إلى العناصر الفرعية عن طريق الفهرس*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | إرجاع / تعيين القيمة التي تحدد الشفافية الموحدة للعنصر. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | إرجاع / تعيين الفرشاة التي تحدد قناعًا لقيم ألفا يتم تطبيقه على العنصر بنفس طريقة سمة التعتيم ، مع السماح بقيم ألفا مختلفة لمناطق مختلفة من العنصر. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | إرجاع / تعيين مصفوفة التحويل المرتبطة بإنشاء إطار إحداثي جديد لجميع سمات العنصر ولجميع العناصر الفرعية (إن وجدت) . |

## طُرق

| اسم | وصف |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/add/)(T) | إضافة عنصر إلى القائمة الفرعية لهذه اللوحة القماشية . |
| [AddCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/addcanvas/)() | إضافة لوحة قماشية جديدة إلى القائمة الفرعية لهذه اللوحة القماشية . |
| [AddGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/addglyphs/)(string, float, FontStyle, float, float, string) | إضافة صور رمزية جديدة إلى القائمة الفرعية لهذه اللوحة القماشية . |
| [AddPath](../../aspose.page.xps.xpsmodel/xpscanvas/addpath/)(XpsPathGeometry) | يضيف مسارًا جديدًا إلى القائمة الفرعية لهذه اللوحة القماشية . |
| [Clone](../../aspose.page.xps.xpsmodel/xpscanvas/clone/)() | استنساخ هذه اللوحة القماشية . |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | تنفيذIEnumerable الواجهة . |
| [Insert&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/insert/)(int, T) | يتم إدراج عنصر في القائمة الفرعية للوحة القماشية هذه في*index* الموضع . |
| [InsertCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/insertcanvas/)(int) | يتم إدراج لوحة قماشية جديدة في القائمة الفرعية لهذه اللوحة القماشية في*index* الموضع . |
| [InsertGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/)(int, string, float, FontStyle, float, float, string) | يتم إدراج صور رمزية جديدة في القائمة الفرعية لهذه اللوحة القماشية في*index* الموضع . |
| [InsertPath](../../aspose.page.xps.xpsmodel/xpscanvas/insertpath/)(int, XpsPathGeometry) | يتم إدراج مسار جديد في القائمة الفرعية للوحة القماشية هذه في*index* الموضع . |

### أنظر أيضا

* class [XpsContentElement](../xpscontentelement/)
* مساحة الاسم [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* المجسم [Aspose.Page](../../)


