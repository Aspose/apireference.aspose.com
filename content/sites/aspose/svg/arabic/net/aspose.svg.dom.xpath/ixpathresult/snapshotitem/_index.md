---
title: IXPathResult.SnapshotItem
second_title: Aspose.SVG لمرجع .NET API
description: IXPathResult طريقة. إرجاع ملففِهرِس العنصر العاشر في مجموعة اللقطة. لوفِهرِسأكبر من أو يساوي عدد العقد في القائمة  ترجع هذه الطريقةباطل . على عكس نتيجة المكرر  لا تصبح اللقطة غير صالحة  ولكنها قد لا تتوافق مع المستند الحالي إذا تم تغييره.
type: docs
weight: 90
url: /ar/net/aspose.svg.dom.xpath/ixpathresult/snapshotitem/
---
## IXPathResult.SnapshotItem method

إرجاع ملف`فِهرِس` العنصر العاشر في مجموعة اللقطة. لو`فِهرِس`أكبر من أو يساوي عدد العقد في القائمة ، ترجع هذه الطريقة`باطل` . على عكس نتيجة المكرر ، لا تصبح اللقطة غير صالحة ، ولكنها قد لا تتوافق مع المستند الحالي إذا تم تغييره.

```csharp
public Node SnapshotItem(int index)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| index | Int32 | فهرس في مجموعة اللقطات. |

### قيمة الإرجاع

العقدة في`فِهرِس` المركز العاشر في`NodeList` ، أو`باطل` إذا كان هذا ليس فهرسًا صالحًا.

### استثناءات

| استثناء | حالة |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | TYPE_ERR: رفع إذا`resultType` ليس `UnorderedNodeSnapshot` اكتب أو`OrderedNodeSnapshot` يكتب. |

### أنظر أيضا

* class [Node](../../../aspose.svg.dom/node/)
* interface [IXPathResult](../)
* مساحة الاسم [Aspose.Svg.Dom.XPath](../../ixpathresult/)
* المجسم [Aspose.SVG](../../../)


