---
title: Class License
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.License classe. Fornisce metodi per concedere in licenza il componente.
type: docs
weight: 1270
url: /it/net/aspose.gis/license/
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

## Metodi

| Nome | Descrizione |
| --- | --- |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense)(Stream) | Concede in licenza il componente. |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense_1)(string) | Concede in licenza il componente. |

### Esempi

In questo esempio si cercherà di trovare un file di licenza denominato MyLicense.lic nella cartella che contiene il componente, nella cartella che contiene l'assembly chiamante, nella cartella dell'assembly di entrata e quindi nella risorse incorporate dell'assembly chiamante.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### Guarda anche

* spazio dei nomi [Aspose.Gis](../../aspose.gis/)
* assemblea [Aspose.GIS](../../)


