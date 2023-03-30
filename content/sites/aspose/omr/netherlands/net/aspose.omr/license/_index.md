---
title: Class License
second_title: Aspose.OMR voor .NET API-referentie
description: Aspose.OMR.License klas. Biedt methoden om de component te licentiëren.
type: docs
weight: 770
url: /nl/net/aspose.omr/license/
---
## License class

Biedt methoden om de component te licentiëren.

```csharp
public class License
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [License](license/)() | De standaard constructeur. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Embedded](../../aspose.omr/license/embedded/) { get; set; } | Licentienummer is toegevoegd als ingesloten bron. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense)(Stream) | Licentie voor de component. |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense_1)(string) | Licentie voor de component. |

### Voorbeelden

In dit voorbeeld wordt geprobeerd een licentiebestand met de naam MyLicense.lic te vinden in de map die de component bevat, in de map die de aanroepende assembly bevat, in de map van de entry-assembly en vervolgens in de ingesloten bronnen van de oproepende assembly.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### Zie ook

* naamruimte [Aspose.OMR](../../aspose.omr/)
* montage [Aspose.OMR](../../)


