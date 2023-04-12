---
title: Class License
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.License klas. Biedt methoden om de component te licentiëren.
type: docs
weight: 10
url: /nl/net/aspose.finance/license/
---
## License class

Biedt methoden om de component te licentiëren.

```csharp
public class License
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [License](license/)() | Initialiseert een nieuwe instantie van deze klasse. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [SetLicense](../../aspose.finance/license/setlicense/#setlicense)(Stream) | Licentie voor de component. |
| [SetLicense](../../aspose.finance/license/setlicense/#setlicense_1)(string) | Licentie voor de component. |

### Voorbeelden

In dit voorbeeld wordt geprobeerd een licentiebestand met de naam MyLicense.lic te vinden in de map die bevat de component, in de map die de aanroepende assembly bevat, in de map van de entry-assembly en vervolgens in de ingebedde bronnen van de aanroepende assembly.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

het component jar-bestand:

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

### Zie ook

* naamruimte [Aspose.Finance](../../aspose.finance/)
* montage [Aspose.Finance](../../)


