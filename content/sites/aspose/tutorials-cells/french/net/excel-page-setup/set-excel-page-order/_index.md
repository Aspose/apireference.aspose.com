---
title: Définir l'ordre des pages Excel
linktitle: Définir l'ordre des pages Excel
second_title: Référence de l'API Aspose.Cells pour .NET
description: Guide étape par étape pour définir l'ordre des pages dans Excel à l'aide d'Aspose.Cells pour .NET. Instructions détaillées et code source inclus.
type: docs
weight: 120
url: /fr/net/excel-page-setup/set-excel-page-order/
---
Dans cet article, nous vous guiderons étape par étape pour expliquer le code source C # suivant pour définir l'ordre des pages Excel à l'aide d'Aspose.Cells pour .NET. Nous allons vous montrer comment configurer le répertoire de documents, instancier un objet Workbook, obtenir la référence PageSetup, définir l'ordre d'impression des pages et enregistrer le classeur.

## Étape 1 : configuration du répertoire de documents

 Avant de commencer, vous devez configurer le répertoire de documents dans lequel vous souhaitez enregistrer le fichier Excel. Vous pouvez spécifier le chemin du répertoire en remplaçant la valeur du`dataDir` variable avec votre propre chemin.

```csharp
// Chemin d'accès au répertoire des documents.
string dataDir = "YOUR_DIRECTORY_OF_DOCUMENTS";
```

## Étape 2 : instanciation d'un objet de classeur

La première étape consiste à instancier un objet Workbook. Cela représente le classeur Excel avec lequel nous allons travailler.

```csharp
// Instancier un objet Workbook
Workbook workbook = new Workbook();
```

## Étape 3 : Obtention de la référence PageSetup

Ensuite, nous devons obtenir la référence de l'objet PageSetup de la feuille de calcul sur laquelle nous voulons définir l'ordre des pages.

```csharp
// Obtenir la référence PageSetup de la feuille de calcul
PageSetup pageSetup = workbook.Worksheets[0].PageSetup;
```

## Étape 4 : Définition de l'ordre d'impression des pages

Nous pouvons maintenant définir l'ordre d'impression des pages. Dans cet exemple, nous utilisons l'option "OverThenDown", ce qui signifie que les pages seront imprimées de gauche à droite, puis de haut en bas.

```csharp
// Définissez l'ordre d'impression des pages sur "OverThenDown"
pageSetup.Order = PrintOrderType.OverThenDown;
```

## Étape 5 : Enregistrer le classeur

Enfin, nous enregistrons le classeur Excel avec les changements d'ordre des pages.

```csharp
// Enregistrer le classeur
workbook.Save(dataDir + "SetPageOrder_out.xls");
```

### Exemple de code source pour définir l'ordre des pages Excel à l'aide de Aspose.Cells pour .NET 
```csharp
// Chemin d'accès au répertoire des documents.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Instanciation d'un objet Workbook
Workbook workbook = new Workbook();
// Obtention de la référence du PageSetup de la feuille de calcul
PageSetup pageSetup = workbook.Worksheets[0].PageSetup;
// Réglage de l'ordre d'impression des pages vers le haut puis vers le bas
pageSetup.Order = PrintOrderType.OverThenDown;
// Enregistrez le classeur.
workbook.Save(dataDir + "SetPageOrder_out.xls");
```

## Conclusion

Dans ce didacticiel, nous avons expliqué comment définir l'ordre des pages dans un fichier Excel à l'aide d'Aspose.Cells pour .NET. En suivant les étapes fournies, vous pouvez facilement configurer le répertoire de documents, instancier un objet Workbook, obtenir la référence PageSetup, définir l'ordre d'impression des pages et enregistrer le classeur.

### FAQ

#### Q1 : Pourquoi est-il important de définir l'ordre des pages dans un fichier Excel ?

La définition de l'ordre des pages dans un fichier Excel est importante car elle détermine la façon dont les pages seront imprimées ou affichées. En spécifiant un ordre spécifique, vous pouvez organiser les données de manière logique et faciliter la lecture ou l'impression du fichier.

#### Q2 : Puis-je utiliser d'autres commandes d'impression de page avec Aspose.Cells pour .NET ?

Oui, Aspose.Cells pour .NET prend en charge plusieurs ordres d'impression de pages tels que "DownThenOver", "OverThenDown", "DownThenOverThenDownAgain", etc. Vous pouvez choisir celui qui correspond le mieux à vos besoins.

#### Q3 : Puis-je définir des options supplémentaires pour imprimer des pages avec Aspose.Cells pour .NET ?

Oui, vous pouvez définir diverses options d'impression de page telles que l'échelle, l'orientation, les marges, etc., à l'aide des propriétés de l'objet PageSetup dans Aspose.Cells pour .NET.

#### Q4 : Aspose.Cells pour .NET prend-il en charge d'autres formats de fichiers Excel ?

Oui, Aspose.Cells pour .NET prend en charge une large gamme de formats de fichiers Excel tels que XLSX, XLS, CSV, HTML, PDF, etc. Vous pouvez facilement convertir entre ces formats en utilisant les fonctionnalités fournies par la bibliothèque.