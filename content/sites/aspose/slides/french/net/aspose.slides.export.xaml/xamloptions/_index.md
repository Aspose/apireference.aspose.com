---
title: XamlOptions
second_title: Référence de l'API Aspose.Slides pour .NET
description: Options qui contrôlent la manière dont un document XAML est enregistré.
type: docs
weight: 4310
url: /fr/net/aspose.slides.export.xaml/xamloptions/
---
## XamlOptions class

Options qui contrôlent la manière dont un document XAML est enregistré.

```csharp
public class XamlOptions : SaveOptions, IXamlOptions
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [XamlOptions](xamloptions)() | Crée l'instance XamlOptions. |

## Propriétés

| Nom | La description |
| --- | --- |
| [DefaultRegularFont](../../aspose.slides.export/saveoptions/defaultregularfont) { get; set; } | Renvoie ou définit la police utilisée dans le cas où la police source est introuvable. Lecture-écritureString . |
| [ExportHiddenSlides](../../aspose.slides.export.xaml/xamloptions/exporthiddenslides) { get; set; } | Détermine si les diapositives masquées seront exportées. |
| [OutputSaver](../../aspose.slides.export.xaml/xamloptions/outputsaver) { get; set; } | Représente une implémentation de l'interface IOutputSaver. |
| [ProgressCallback](../../aspose.slides.export/saveoptions/progresscallback) { get; set; } | Représente un objet de rappel pour enregistrer les mises à jour de progression en pourcentage. Voir[`IProgressCallback`](../../aspose.slides/iprogresscallback) . |
| [WarningCallback](../../aspose.slides.export/saveoptions/warningcallback) { get; set; } | Renvoie des ensembles d'un objet qui reçoit des avertissements et décide si le processus de chargement va continuer ou sera abandonné. Lecture/écriture[`IWarningCallback`](../../aspose.slides.warnings/iwarningcallback) . |

### Exemples

```csharp
[C#]
using (Presentation pres = new Presentation("pres.pptx"))
{
	pres.Save(new XamlOptions { ExportHiddenSlides = true });
}
```

### Voir également

* class [SaveOptions](../../aspose.slides.export/saveoptions)
* interface [IXamlOptions](../ixamloptions)
* espace de noms [Aspose.Slides.Export.Xaml](../../aspose.slides.export.xaml)
* Assemblée [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
