---
title: CheckBoxControl.Type
linktitle: Type
articleTitle: Type
second_title: Aspose.Words for .NET
description: Discover the CheckBoxControl Type property for Forms 2.0, unlocking versatile control options to enhance your application’s functionality.
type: docs
weight: 20
url: /net/aspose.words.drawing.ole/checkboxcontrol/type/
---
## CheckBoxControl.Type property

Gets type of Forms 2.0 control.

```csharp
public override Forms2OleControlType Type { get; }
```

## Examples

Shows how to change state of the CheckBox control.

```csharp
Document doc = new Document(MyDir + "ActiveX controls.docx");

Shape shape = (Shape)doc.GetChild(NodeType.Shape, 0, true);
CheckBoxControl checkBoxControl = (CheckBoxControl)shape.OleFormat.OleControl;
checkBoxControl.Checked = true;

Assert.That(checkBoxControl.Checked, Is.EqualTo(true));
Assert.That(checkBoxControl.Type, Is.EqualTo(Forms2OleControlType.CheckBox));
```

### See Also

* enum [Forms2OleControlType](../../forms2olecontroltype/)
* class [CheckBoxControl](../)
* namespace [Aspose.Words.Drawing.Ole](../../../aspose.words.drawing.ole/)
* assembly [Aspose.Words](../../../)
