---
title: Class SaveOptions
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.SaveOptions classe. Cette classe contient les options nécessaires à la gestion du processus de conversion.
type: docs
weight: 300
url: /fr/net/aspose.page/saveoptions/
---
## SaveOptions class

Cette classe contient les options nécessaires à la gestion du processus de conversion.

```csharp
public abstract class SaveOptions
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [SaveOptions](saveoptions/#constructor)() | Initialise une nouvelle instance du`SaveOptions` classe avec les valeurs par défaut pour les drapeaux!:SuppressErrors (vrai) et[`Debug`](./debug/) (faux). |
| [SaveOptions](saveoptions/#constructor_1)(bool) | Initialise une nouvelle instance du`SaveOptions` classe avec la valeur par défaut pour flag[`Debug`](./debug/) (faux). |

## Propriétés

| Nom | La description |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Spécifie des dossiers supplémentaires où le convertisseur doit trouver les polices pour le document d'entrée. Le dossier par défaut est le dossier de polices standard où le système d'exploitation trouve les polices pour les besoins internes. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Spécifie si les informations de débogage doivent être imprimées sur le flux de sortie standard ou non. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Renvoie une liste des erreurs de conversion supprimées Si!:SuppressErrors est vrai. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | La catégorie Qualité spécifie le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre spécifié est faible, plus la compression est élevée et donc plus la qualité de l'image est faible. La valeur 0 donne la qualité d'image la plus basse, tandis que 100 donne la plus haute. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Spécifie si les erreurs doivent être supprimées ou non. Si de vraies erreurs supprimées sont ajoutées à[`Exceptions`](./exceptions/) list. Si false, la première erreur terminera le programme. |

### Voir également

* espace de noms [Aspose.Page](../../aspose.page/)
* Assemblée [Aspose.Page](../../)


