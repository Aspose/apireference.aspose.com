---
title: Class License
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.License class. Provides methods to license the component
type: docs
weight: 1370
url: /net/aspose.gis/license/
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
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense)(Stream) | Licenses the component. |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense_1)(string) | Licenses the component. |

## Examples

In this example, an attempt will be made to find a license file named MyLicense.lic in the folder that contains the component, in the folder that contains the calling assembly, in the folder of the entry assembly and then in the embedded resources of the calling assembly.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### See Also

* namespace [Aspose.Gis](../../aspose.gis/)
* assembly [Aspose.GIS](../../)


