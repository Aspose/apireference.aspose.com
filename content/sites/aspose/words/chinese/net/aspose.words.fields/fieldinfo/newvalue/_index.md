---
title: FieldInfo.NewValue
linktitle: NewValue
articleTitle: NewValue
second_title: 用于 .NET 的 Aspose.Words
description: FieldInfo NewValue 财产. 获取或设置更新属性的可选值 在 C#.
type: docs
weight: 30
url: /zh/net/aspose.words.fields/fieldinfo/newvalue/
---
## FieldInfo.NewValue property

获取或设置更新属性的可选值。

```csharp
public string NewValue { get; set; }
```

## 例子

展示如何使用 INFO 字段。

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// 为“Comments”内置属性设置一个值，然后插入一个 INFO 字段以显示该属性的值。
doc.BuiltInDocumentProperties.Comments = "My comment";
FieldInfo field = (FieldInfo)builder.InsertField(FieldType.FieldInfo, true);
field.InfoType = "Comments";
field.Update();

Assert.AreEqual(" INFO  Comments", field.GetFieldCode());
Assert.AreEqual("My comment", field.Result);

builder.Writeln();

// 为字段的 NewValue 属性设置值并更新
// 该字段还将用新值覆盖相应的内置属性。
field = (FieldInfo)builder.InsertField(FieldType.FieldInfo, true);
field.InfoType = "Comments";
field.NewValue = "New comment";
field.Update();

Assert.AreEqual(" INFO  Comments \"New comment\"", field.GetFieldCode());
Assert.AreEqual("New comment", field.Result);
Assert.AreEqual("New comment", doc.BuiltInDocumentProperties.Comments);

doc.Save(ArtifactsDir + "Field.INFO.docx");
```

### 也可以看看

* class [FieldInfo](../)
* 命名空间 [Aspose.Words.Fields](../../../aspose.words.fields/)
* 部件 [Aspose.Words](../../../)
