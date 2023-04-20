---
title: Interface IXPathResult
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.Dom.XPath.IXPathResult واجهه المستخدم. ملفXPathResult تمثل الواجهة نتيجة تقييم تعبير XPath 1.0 في سياق عقدة معينة. نظرًا لأن تقييم لتعبير XPath يمكن أن يؤدي إلى أنواع نتائج مختلفة  فإن هذا الكائن يجعل ممكنًا لاكتشاف نوع النتيجة وقيمتها ومعالجتها.
type: docs
weight: 1350
url: /ar/net/aspose.svg.dom.xpath/ixpathresult/
---
## IXPathResult interface

ملف`XPathResult` تمثل الواجهة نتيجة تقييم تعبير XPath 1.0 في سياق عقدة معينة. نظرًا لأن تقييم لتعبير XPath يمكن أن يؤدي إلى أنواع نتائج مختلفة ، فإن هذا الكائن يجعل ممكنًا لاكتشاف نوع النتيجة وقيمتها ومعالجتها.

```csharp
public interface IXPathResult
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [BooleanValue](../../aspose.svg.dom.xpath/ixpathresult/booleanvalue/) { get; } | قيمة هذه النتيجة المنطقية . |
| [InvalidIteratorState](../../aspose.svg.dom.xpath/ixpathresult/invaliditeratorstate/) { get; } | تشير إلى أن المكرر أصبح غير صالح. صحيح إذا`resultType` هو`UnorderedNodeIterator` اكتب أو`OrderedNodeIterator` اكتب و تم تعديل المستند منذ إرجاع هذه النتيجة. |
| [NumberValue](../../aspose.svg.dom.xpath/ixpathresult/numbervalue/) { get; } | نتيجة هذا الرقم |
| [ResultType](../../aspose.svg.dom.xpath/ixpathresult/resulttype/) { get; } | رمز يمثل نوع هذه النتيجة ، كما هو محدد بواسطة http://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathResult [`XPathResultType`](../xpathresulttype/) تعداد . |
| [SingleNodeValue](../../aspose.svg.dom.xpath/ixpathresult/singlenodevalue/) { get; } | قيمة نتيجة هذه العقدة المفردة ، والتي قد تكون`باطل` . |
| [SnapshotLength](../../aspose.svg.dom.xpath/ixpathresult/snapshotlength/) { get; } | عدد العقد في لقطة النتيجة. القيم الصالحة لفهارس snapshotItem هي`0` ل`الطول 1` شامل . |
| [StringValue](../../aspose.svg.dom.xpath/ixpathresult/stringvalue/) { get; } | نتيجة هذه السلسلة . |

## طُرق

| اسم | وصف |
| --- | --- |
| [IterateNext](../../aspose.svg.dom.xpath/ixpathresult/iteratenext/)() | يكرر ويعيد العقدة التالية من مجموعة العقدة أو`باطل` إذا لم يكن هناك المزيد من العقد. |
| [SnapshotItem](../../aspose.svg.dom.xpath/ixpathresult/snapshotitem/)(int) | إرجاع ملف`فِهرِس` العنصر العاشر في مجموعة اللقطة. لو`فِهرِس`أكبر من أو يساوي عدد العقد في القائمة ، ترجع هذه الطريقة`باطل` . على عكس نتيجة المكرر ، لا تصبح اللقطة غير صالحة ، ولكنها قد لا تتوافق مع المستند الحالي إذا تم تغييره. |

### أنظر أيضا

* مساحة الاسم [Aspose.Svg.Dom.XPath](../../aspose.svg.dom.xpath/)
* المجسم [Aspose.SVG](../../)


