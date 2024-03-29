---
title: FieldInfo.InfoType
linktitle: InfoType
articleTitle: InfoType
second_title: Aspose.Words لـ .NET
description: FieldInfo InfoType ملكية. الحصول على أو تعيين نوع خاصية المستند المراد إدراجه في C#.
type: docs
weight: 20
url: /ar/net/aspose.words.fields/fieldinfo/infotype/
---
## FieldInfo.InfoType property

الحصول على أو تعيين نوع خاصية المستند المراد إدراجه.

```csharp
public string InfoType { get; set; }
```

## أمثلة

يوضح كيفية العمل مع حقول INFO.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// قم بتعيين قيمة للخاصية المضمنة "التعليقات"، ثم قم بإدراج حقل INFO لعرض قيمة تلك الخاصية.
doc.BuiltInDocumentProperties.Comments = "My comment";
FieldInfo field = (FieldInfo)builder.InsertField(FieldType.FieldInfo, true);
field.InfoType = "Comments";
field.Update();

Assert.AreEqual(" INFO  Comments", field.GetFieldCode());
Assert.AreEqual("My comment", field.Result);

builder.Writeln();

// تعيين قيمة لخاصية NewValue للحقل وتحديثها
// سيقوم الحقل أيضًا باستبدال الخاصية المضمنة المقابلة بالقيمة الجديدة.
field = (FieldInfo)builder.InsertField(FieldType.FieldInfo, true);
field.InfoType = "Comments";
field.NewValue = "New comment";
field.Update();

Assert.AreEqual(" INFO  Comments \"New comment\"", field.GetFieldCode());
Assert.AreEqual("New comment", field.Result);
Assert.AreEqual("New comment", doc.BuiltInDocumentProperties.Comments);

doc.Save(ArtifactsDir + "Field.INFO.docx");
```

### أنظر أيضا

* class [FieldInfo](../)
* مساحة الاسم [Aspose.Words.Fields](../../../aspose.words.fields/)
* المجسم [Aspose.Words](../../../)
