---
title: Class License
second_title: Aspose.OMR för .NET API-referens
description: Aspose.OMR.License klass. Tillhandahåller metoder för att licensiera komponenten.
type: docs
weight: 770
url: /sv/net/aspose.omr/license/
---
## License class

Tillhandahåller metoder för att licensiera komponenten.

```csharp
public class License
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [License](license/)() | Default_Constructor |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Embedded](../../aspose.omr/license/embedded/) { get; set; } | Licensnummer lades till som inbäddad resurs. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense)(Stream) | Licensierar komponenten. |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense_1)(string) | Licensierar komponenten. |

### Exempel

I det här exemplet kommer ett försök att göras att hitta en licensfil med namnet MyLicense.lic i mappen som innehåller komponenten , i mappen som innehåller den anropande sammansättningen, i mappen för postsammansättningen och sedan i embedded resurser för den anropande församlingen.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### Se även

* namnutrymme [Aspose.OMR](../../aspose.omr/)
* hopsättning [Aspose.OMR](../../)


