---
title: Class License
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.License class. Provides methods to license the component
type: docs
weight: 36640
url: /net/aspose.cad/license/
---
## License class

Provides methods to license the component.

```csharp
public class License
```

## Constructors

| Name | Description |
| --- | --- |
| [License](license/)() | Initializes a new instance of this class. |

## Methods

| Name | Description |
| --- | --- |
| [SetLicense](../../aspose.cad/license/setlicense/#setlicense)(Stream) | Licenses the component. |
| [SetLicense](../../aspose.cad/license/setlicense/#setlicense_1)(string) | Licenses the component. |

## Examples

In this example, an attempt will be made to find a license file named MyLicense.lic in the folder that contains  the component, in the folder that contains the calling assembly, in the folder of the entry assembly and then in the embedded resources of the calling assembly.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

the component jar file:

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

### See Also

* namespace [Aspose.CAD](../../aspose.cad/)
* assembly [Aspose.CAD](../../)


