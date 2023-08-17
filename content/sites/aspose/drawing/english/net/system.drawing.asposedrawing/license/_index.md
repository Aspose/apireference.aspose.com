---
title: Class License
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.AsposeDrawing.License class. Provides methods to license the component
type: docs
weight: 20
url: /net/system.drawing.asposedrawing/license/
---
## License class

Provides methods to license the component.

```csharp
public class License
```

## Constructors

| Name | Description |
| --- | --- |
| [License](license/)() | The default constructor. |

## Methods

| Name | Description |
| --- | --- |
| [SetLicense](../../system.drawing.asposedrawing/license/setlicense/#setlicense)(Stream) | Licenses the component. |
| [SetLicense](../../system.drawing.asposedrawing/license/setlicense/#setlicense_1)(string) | Licenses the component. |

## Examples

In this example, an attempt will be made to find a license file named MyLicense.lic in the folder that contains the component, in the folder that contains the calling assembly, in the folder of the entry assembly and then in the embedded resources of the calling assembly.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");

```

### See Also

* namespace [System.Drawing.AsposeDrawing](../../system.drawing.asposedrawing/)
* assembly [Aspose.Drawing](../../)


