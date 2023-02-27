---
title: Class License
second_title: Aspose.OCR voor .NET API-referentie
description: Aspose.OCR.License klas. Biedt methoden om de component te licentiëren.
type: docs
weight: 120
url: /nl/net/aspose.ocr/license/
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
| [IsLicensed](../../aspose.ocr/license/islicensed/) { get; } | Krijgt een waarde die aangeeft of het product is gelicentieerd. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense)(Stream) | Licentie voor de component. |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense_1)(string) | Licentie voor de component. |

### Voorbeelden

In dit voorbeeld wordt een poging gedaan om een licentiebestand met de naam MyLicense.lic te vinden in de map die de component bevat, in de map die de aanroepende assembly bevat, in de map van de entry-assembly en vervolgens in de ingebedde bronnen van de aanroepende assembly.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

### Zie ook

* naamruimte [Aspose.OCR](../../aspose.ocr/)
* montage [Aspose.OCR](../../)


