---
title: Class JobErrorSheet
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsMetadata.JobErrorSheet classe. Décrit la sortie de la feuille derreurs. Lensemble du travail aura une seule feuille derreur. Lerreur sheet doit être sortie sur la valeur par défautPageMediaSize et en utilisant la valeur par défautPageMediaType . La feuille derreurs doit être isolée du reste du travail. Cela signifie que toutes les options de finition ou de traitement telles que   ou  ne doit pas inclure la feuille derreur. La feuille derreurs doit apparaître comme dernière feuille du travail. https//docs.microsoft.com/enus/windows/win32/printdocs/joberrorsheet
type: docs
weight: 1290
url: /fr/net/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class

Décrit la sortie de la feuille d'erreurs. L'ensemble du travail aura une seule feuille d'erreur. L'erreur sheet doit être sortie sur la valeur par défaut[`PageMediaSize`](../pagemediasize/) et en utilisant la valeur par défaut[`PageMediaType`](../pagemediatype/) . La feuille d'erreurs doit être isolée du reste du travail. Cela signifie que toutes les options de finition ou de traitement (telles que , , ou ) ne doit pas inclure la feuille d'erreur. La feuille d'erreurs doit apparaître comme dernière feuille du travail. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet

```csharp
JobDuplex
```

```csharp
JobStaple
```

```csharp
JobBinding
```

```csharp
public sealed class JobErrorSheet : Feature, IJobPrintTicketItem
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [JobErrorSheet](joberrorsheet/)(params IJobErrorSheetItem[]) | Crée une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtient le nom de l'élément. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Ajoute une liste d'éléments à la fin de la liste d'éléments de cette fonctionnalité. Chacun doit être un[`Feature`](../feature/) , un[`Option`](../option/) ou un[`Property`](../property/) instance. |

## Autres membres

| Nom | La description |
| --- | --- |
| class [ErrorSheetOption](joberrorsheet.errorsheetoption/) | Décrit le`JobErrorSheet` options de fonctionnalité. |
| class [ErrorSheetWhen](joberrorsheet.errorsheetwhen/) | Décrit l'intérieur fonctionnalité. |
| interface [IJobErrorSheetItem](joberrorsheet.ijoberrorsheetitem/) | L'interface de tout`JobErrorSheet` élément caractéristique. |

### Voir également

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espace de noms [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Assemblée [Aspose.Page](../../)


