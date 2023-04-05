---
title: Class License
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.License klas. Biedt methoden om de component te licentiëren.
type: docs
weight: 270
url: /nl/net/aspose.page/license/
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

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Embedded](../../aspose.page/license/embedded/) { get; set; } | Licentienummer is toegevoegd als ingesloten bron. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense)(Stream) | Licentie voor de component. |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense_1)(string) | Licentie voor de component. |

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

* naamruimte [Aspose.Page](../../aspose.page/)
* montage [Aspose.Page](../../)


