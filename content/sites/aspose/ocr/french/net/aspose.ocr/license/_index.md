---
title: Class License
second_title: Référence de l'API Aspose.OCR pour .NET
description: Aspose.OCR.License classe. Fournit des méthodes pour autoriser le composant.
type: docs
weight: 120
url: /fr/net/aspose.ocr/license/
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

## Propriétés

| Nom | La description |
| --- | --- |
| [IsLicensed](../../aspose.ocr/license/islicensed/) { get; } | Obtient une valeur indiquant si le produit est sous licence. |

## Méthodes

| Nom | La description |
| --- | --- |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense)(Stream) | Licence du composant. |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense_1)(string) | Licence du composant. |

### Exemples

Dans cet exemple, une tentative sera faite pour trouver un fichier de licence nommé MyLicense.lic dans le dossier qui contient le composant, dans le dossier qui contient l'assembly appelant, dans le dossier de l'assembly d'entrée, puis dans les ressources embarquées de l'assembly appelant.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

### Voir également

* espace de noms [Aspose.OCR](../../aspose.ocr/)
* Assemblée [Aspose.OCR](../../)


