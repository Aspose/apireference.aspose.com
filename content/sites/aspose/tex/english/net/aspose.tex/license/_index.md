---
title: Class License
second_title: Aspose.TeX for .NET API Reference
description: Aspose.TeX.License class. Provides methods to license the component
type: docs
weight: 300
url: /net/aspose.tex/license/
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

## Properties

| Name | Description |
| --- | --- |
| [Embedded](../../aspose.tex/license/embedded/) { get; set; } | License number was added as embedded resource. |

## Methods

| Name | Description |
| --- | --- |
| [SetLicense](../../aspose.tex/license/setlicense/#setlicense)(Stream) | Licenses the component. |
| [SetLicense](../../aspose.tex/license/setlicense/#setlicense_1)(string) | Licenses the component. |

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

* namespace [Aspose.TeX](../../aspose.tex/)
* assembly [Aspose.TeX](../../)


