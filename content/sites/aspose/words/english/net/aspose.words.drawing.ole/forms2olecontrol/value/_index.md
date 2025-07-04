---
title: Forms2OleControl.Value
linktitle: Value
articleTitle: Value
second_title: Aspose.Words for .NET
description: Discover the Forms2OleControl Value property, reflecting control states. Easily manage option button values, 1 for checked, 0 for unchecked. Simplify your coding!
type: docs
weight: 90
url: /net/aspose.words.drawing.ole/forms2olecontrol/value/
---
## Forms2OleControl.Value property

Gets underlying Value property which often represents control state. For example checked option button has '1' value while unchecked has '0'. Default value is an empty string.

```csharp
public string Value { get; }
```

## Examples

Shows how to verify the properties of an ActiveX control.

```csharp
Document doc = new Document(MyDir + "ActiveX controls.docx");

Shape shape = (Shape)doc.GetChild(NodeType.Shape, 0, true);
OleControl oleControl = shape.OleFormat.OleControl;

Assert.That(oleControl.Name, Is.EqualTo("CheckBox1"));

if (oleControl.IsForms2OleControl)
{
    Forms2OleControl checkBox = (Forms2OleControl)oleControl;
    Assert.That(checkBox.Caption, Is.EqualTo("First"));
    Assert.That(checkBox.Value, Is.EqualTo("0"));
    Assert.That(checkBox.Enabled, Is.EqualTo(true));
    Assert.That(checkBox.Type, Is.EqualTo(Forms2OleControlType.CheckBox));
    Assert.That(checkBox.ChildNodes, Is.EqualTo(null));
    Assert.That(checkBox.GroupName, Is.EqualTo(string.Empty));

    // Note, that you can't set GroupName for a Frame.
    checkBox.GroupName = "Aspose group name";
}
```

### See Also

* class [Forms2OleControl](../)
* namespace [Aspose.Words.Drawing.Ole](../../../aspose.words.drawing.ole/)
* assembly [Aspose.Words](../../../)
