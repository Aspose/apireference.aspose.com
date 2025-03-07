---
title: Persistence
second_title: Aspose.Sildes for .NET API Reference
description: Gets the method used to store properties of the ActiveX control. Read only PersistenceTypeaspose.slides/persistencetype.
type: docs
weight: 50
url: /net/aspose.slides/control/persistence/
---
## Control.Persistence property

Gets the method used to store properties of the ActiveX control. Read only [`PersistenceType`](../../persistencetype).

```csharp
public PersistenceType Persistence { get; }
```

### Examples

Next example shows the using Persistence property for checking if properties of ActiveX object may be changed as XML based ActiveX properties:

```csharp
[C#]
if (control.Persistence == PersistenceType.PersistPropertyBag)
{
    control.Properties["Value"] = value;
}
else
{
    YourMethodHere(control.ActiveXControlBinary); //Use your own method for managing ActiveX properties stored in its binary file
}
```

### See Also

* enum [PersistenceType](../../persistencetype)
* class [Control](../../control)
* namespace [Aspose.Slides](../../control)
* assembly [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
