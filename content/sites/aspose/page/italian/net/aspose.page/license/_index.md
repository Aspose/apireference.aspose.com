---
title: Class License
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.License classe. Fornisce metodi per concedere in licenza il componente.
type: docs
weight: 270
url: /it/net/aspose.page/license/
---
## License class

Fornisce metodi per concedere in licenza il componente.

```csharp
public class License
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [License](license/)() | Inizializza una nuova istanza di questa classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Embedded](../../aspose.page/license/embedded/) { get; set; } | Il numero di licenza è stato aggiunto come risorsa incorporata. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense)(Stream) | Concede in licenza il componente. |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense_1)(string) | Concede in licenza il componente. |

### Esempi

In questo esempio, verrà effettuato un tentativo di trovare un file di licenza denominato MyLicense.lic nella cartella che contiene  il componente, nella cartella che contiene l'assembly chiamante, nella cartella dell'assembly di entrata e poi nelle risorse embedded dell'assembly chiamante.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

il file jar del componente:

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

### Guarda anche

* spazio dei nomi [Aspose.Page](../../aspose.page/)
* assemblea [Aspose.Page](../../)


