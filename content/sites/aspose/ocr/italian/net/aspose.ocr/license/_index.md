---
title: Class License
second_title: Aspose.OCR per Riferimento API .NET
description: Aspose.OCR.License classe. Fornisce metodi per concedere in licenza il componente.
type: docs
weight: 120
url: /it/net/aspose.ocr/license/
---
## License class

Fornisce metodi per concedere in licenza il componente.

```csharp
public class License
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [License](license/)() | Default_Costruttore |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [IsLicensed](../../aspose.ocr/license/islicensed/) { get; } | Ottiene un valore che indica se il prodotto è concesso in licenza. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense)(Stream) | Concede in licenza il componente. |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense_1)(string) | Concede in licenza il componente. |

### Esempi

In questo esempio si cercherà di trovare un file di licenza denominato MyLicense.lic nella cartella che contiene il componente, nella cartella che contiene l'assembly chiamante, nella cartella dell'assembly di entrata e quindi in le risorse incorporate dell'assembly chiamante.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

### Guarda anche

* spazio dei nomi [Aspose.OCR](../../aspose.ocr/)
* assemblea [Aspose.OCR](../../)


