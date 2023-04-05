---
title: Class License
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.License classe. Fournit des méthodes pour autoriser le composant.
type: docs
weight: 270
url: /fr/net/aspose.page/license/
---
## License class

Fournit des méthodes pour autoriser le composant.

```csharp
public class License
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [License](license/)() | Initialise une nouvelle instance de cette classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Embedded](../../aspose.page/license/embedded/) { get; set; } | Le numéro de licence a été ajouté en tant que ressource intégrée. |

## Méthodes

| Nom | La description |
| --- | --- |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense)(Stream) | Licence du composant. |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense_1)(string) | Licence du composant. |

### Exemples

Dans cet exemple, une tentative sera faite pour trouver un fichier de licence nommé MyLicense.lic dans le dossier qui contient  le composant, dans le dossier qui contient l'assembly appelant, dans le dossier de l'assembly d'entrée puis dans les ressources embarquées de l'assembly appelant.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

le fichier jar du composant :

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

### Voir également

* espace de noms [Aspose.Page](../../aspose.page/)
* Assemblée [Aspose.Page](../../)


