---
title: Add
second_title: Aspose.PDF لمرجع .NET API
description: يضيف عامل تشغيل جديدًا إلى المجموعة .
type: docs
weight: 60
url: /ar/net/aspose.pdf/operatorcollection/add/
---
## Add(Operator) {#add}

يضيف عامل تشغيل جديدًا إلى المجموعة .

```csharp
public override void Add(Operator op)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| op | Operator | العامل الذي يجب إضافته |

### أمثلة

مثال يوضح كيفية إضافة عوامل تشغيل إلى نهاية page.contents.

```csharp
Document doc = new Document("input.pdf");
doc.Pages[1].Contents.Add(new Aspose.Pdf.Operators.q());
doc.Pages[1].Contents.Add(new Aspose.Pdf.Operators.Q());
```

### أنظر أيضا

* class [Operator](../../operator)
* class [OperatorCollection](../../operatorcollection)
* مساحة الاسم [Aspose.Pdf](../../operatorcollection)
* المجسم [Aspose.PDF](../../../)

---

## Add(Operator[]) {#add_1}

أضف عوامل تشغيل في نهاية عوامل تشغيل المحتويات.

```csharp
public void Add(Operator[] ops)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| ops | Operator[] | مصفوفة العوامل المراد إضافتها. يمكن أن يكون لكل عامل أي فهرس (افتراضيًا -1) لأنه يصل إلى نهاية مشغلي المحتويات ، أي يتم تعيين المؤشرات تلقائيًا. |

### أمثلة

مثال يوضح كيفية إضافة عامل تشغيل إلى نهاية محتويات الصفحة.

```csharp
Document doc = new Document("input.pdf");
OperatorCollection oc = doc.Pages[1].Contents;
oc.Add(new Operator[] { new Aspose.Pdf.Operators.q(), new Aspose.Pdf.Operators.Q() } );
```

### أنظر أيضا

* class [Operator](../../operator)
* class [OperatorCollection](../../operatorcollection)
* مساحة الاسم [Aspose.Pdf](../../operatorcollection)
* المجسم [Aspose.PDF](../../../)

---

## Add(ICollection&lt;Operator&gt;) {#add_2}

يضيف إلى مجموعة كافة العوامل من مجموعة أخرى.

```csharp
public void Add(ICollection<Operator> ops)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| ops | ICollection`1 | تحتوي مجموعة whitch على عوامل التشغيل التي ستتم إضافتها. |

### أمثلة

مثال يوضح كيفية إضافة مجموعة عامل إلى محتويات الصفحة.

```csharp
Document doc = new Document("input.pdf");
OperatorCollection oc = doc.Pages[1].Contents;
List<Operator> opList = new List<Operator>();
opList.Add(new AOperator.q());
opList.Add(new Operators.Q());
oc.Add(opList);
```

### أنظر أيضا

* class [Operator](../../operator)
* class [OperatorCollection](../../operatorcollection)
* مساحة الاسم [Aspose.Pdf](../../operatorcollection)
* المجسم [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
