---
title: Class License
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.License klas. Biedt methoden om de component te licentiëren.
type: docs
weight: 1270
url: /nl/net/aspose.gis/license/
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

## methoden

| Naam | Beschrijving |
| --- | --- |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense)(Stream) | Licentie voor de component. |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense_1)(string) | Licentie voor de component. |

### Voorbeelden

In dit voorbeeld wordt een poging gedaan om een licentiebestand met de naam MyLicense.lic te vinden in de map die de component bevat, in de map die de aanroepende assembly bevat, in de map van de entry-assembly en vervolgens in de ingebedde bronnen van de aanroepende assembly.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### Zie ook

* naamruimte [Aspose.Gis](../../aspose.gis/)
* montage [Aspose.GIS](../../)


