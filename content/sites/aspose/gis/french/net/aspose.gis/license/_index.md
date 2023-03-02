---
title: Class License
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.License classe. Fournit des méthodes pour autoriser le composant.
type: docs
weight: 1270
url: /fr/net/aspose.gis/license/
---
## License class

Fournit des méthodes pour autoriser le composant.

```csharp
public class License
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [License](license/)() | Default_Constructor |

## Méthodes

| Nom | La description |
| --- | --- |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense)(Stream) | Licence du composant. |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense_1)(string) | Licence du composant. |

### Exemples

Dans cet exemple, une tentative sera faite pour trouver un fichier de licence nommé MyLicense.lic dans le dossier qui contient le composant, dans le dossier qui contient l'assembly appelant, dans le dossier de l'assembly d'entrée puis dans le ressources embarquées de l'assembly appelant.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### Voir également

* espace de noms [Aspose.Gis](../../aspose.gis/)
* Assemblée [Aspose.GIS](../../)


