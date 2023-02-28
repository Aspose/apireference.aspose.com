---
title: Class License
second_title: Aspose.OCR für .NET-API-Referenz
description: Aspose.OCR.License klas. Stellt Methoden zur Lizenzierung der Komponente bereit.
type: docs
weight: 120
url: /de/net/aspose.ocr/license/
---
## License class

Stellt Methoden zur Lizenzierung der Komponente bereit.

```csharp
public class License
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [License](license/)() | Default_Constructor |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [IsLicensed](../../aspose.ocr/license/islicensed/) { get; } | Ruft einen Wert ab, der angibt, ob das Produkt lizenziert ist. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense)(Stream) | Lizenziert die Komponente. |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense_1)(string) | Lizenziert die Komponente. |

### Beispiele

In diesem Beispiel wird versucht, eine Lizenzdatei mit dem Namen MyLicense.lic in dem Ordner zu finden, der die Komponente enthält, in dem Ordner, der die aufrufende Assembly enthält, im Ordner des Eintrags Assembly und dann in die eingebetteten Ressourcen der aufrufenden Assembly.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

### Siehe auch

* namensraum [Aspose.OCR](../../aspose.ocr/)
* Montage [Aspose.OCR](../../)


