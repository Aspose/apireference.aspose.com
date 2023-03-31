---
title: Class License
second_title: Aspose.OMR per Riferimento API .NET
description: Aspose.OMR.License classe. Fornisce metodi per concedere in licenza il componente.
type: docs
weight: 770
url: /it/net/aspose.omr/license/
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
| [Embedded](../../aspose.omr/license/embedded/) { get; set; } | Il numero di licenza è stato aggiunto come risorsa incorporata. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense)(Stream) | Concede in licenza il componente. |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense_1)(string) | Concede in licenza il componente. |

### Esempi

In questo esempio si cercherà di trovare un file di licenza denominato MyLicense.lic nella cartella che contiene il componente, nella cartella che contiene l'assembly chiamante, nella cartella dell'assembly di entrata e quindi nell'assembly risorse dell'assembly chiamante.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### Guarda anche

* spazio dei nomi [Aspose.OMR](../../aspose.omr/)
* assemblea [Aspose.OMR](../../)


