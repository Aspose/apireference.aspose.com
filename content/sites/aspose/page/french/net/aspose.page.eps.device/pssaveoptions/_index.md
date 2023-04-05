---
title: Class PsSaveOptions
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.EPS.Device.PsSaveOptions classe. Cette classe contient les options nécessaires à la gestion du processus de conversion du document en fichier PostScript PS ou PostScript encapsulé EPS.
type: docs
weight: 80
url: /fr/net/aspose.page.eps.device/pssaveoptions/
---
## PsSaveOptions class

Cette classe contient les options nécessaires à la gestion du processus de conversion du document en fichier PostScript (PS) ou PostScript encapsulé (EPS).

```csharp
public class PsSaveOptions : SaveOptions
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [PsSaveOptions](pssaveoptions/#constructor)() | Initialise une nouvelle instance du`PsSaveOptions` classe avec les valeurs par défaut pour les drapeaux!:SuppressErrors (vrai) et!:Debug (faux). |
| [PsSaveOptions](pssaveoptions/#constructor_1)(bool) | Initialise une nouvelle instance du`PsSaveOptions` classe avec des valeurs par défaut pour flag!:Debug (faux). |

## Propriétés

| Nom | La description |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Spécifie des dossiers supplémentaires où le convertisseur doit trouver les polices pour le document d'entrée. Le dossier par défaut est le dossier de polices standard où le système d'exploitation trouve les polices pour les besoins internes. |
| [BackgroundColor](../../aspose.page.eps.device/pssaveoptions/backgroundcolor/) { get; set; } | La couleur de fond. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Spécifie si les informations de débogage doivent être imprimées sur le flux de sortie standard ou non. |
| [EmbedFonts](../../aspose.page.eps.device/pssaveoptions/embedfonts/) { get; set; } | Indique s'il faut incorporer les polices utilisées dans le document PS. |
| [EmbedFontsAs](../../aspose.page.eps.device/pssaveoptions/embedfontsas/) { get; set; } | Un type de police dans lequel incorporer des polices dans le document PS. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Renvoie une liste des erreurs de conversion supprimées Si!:SuppressErrors est vrai. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | La catégorie Qualité spécifie le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre spécifié est faible, plus la compression est élevée et donc plus la qualité de l'image est faible. La valeur 0 donne la qualité d'image la plus basse, tandis que 100 donne la plus haute. |
| [Margins](../../aspose.page.eps.device/pssaveoptions/margins/) { get; set; } | Les marges de la page. |
| [PageSize](../../aspose.page.eps.device/pssaveoptions/pagesize/) { get; set; } | La taille de la page. |
| [SaveFormat](../../aspose.page.eps.device/pssaveoptions/saveformat/) { get; set; } | Le format d'enregistrement du fichier résultant. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Spécifie si les erreurs doivent être supprimées ou non. Si de vraies erreurs supprimées sont ajoutées à[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Si false, la première erreur terminera le programme. |
| [Transparent](../../aspose.page.eps.device/pssaveoptions/transparent/) { get; set; } | Indique si l'arrière-plan est transparent. |

### Voir également

* class [SaveOptions](../../aspose.page/saveoptions/)
* espace de noms [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* Assemblée [Aspose.Page](../../)


