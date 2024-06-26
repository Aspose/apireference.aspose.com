---
title: Gérer la taille du papier Excel
linktitle: Gérer la taille du papier Excel
second_title: Référence de l'API Aspose.Cells pour .NET
description: Apprenez à gérer la taille du papier dans Excel avec Aspose.Cells pour .NET. Tutoriel étape par étape avec le code source en C#.
type: docs
weight: 70
url: /fr/net/excel-page-setup/manage-excel-paper-size/
---
Dans ce didacticiel, nous vous guiderons étape par étape sur la façon de gérer la taille du papier dans un document Excel à l'aide d'Aspose.Cells pour .NET. Nous allons vous montrer comment configurer le format de papier à l'aide du code source C#.

## Étape 1 : Configurer l'environnement

Assurez-vous que Aspose.Cells pour .NET est installé sur votre machine. Créez également un nouveau projet dans votre environnement de développement préféré.

## Étape 2 : Importer les bibliothèques nécessaires

Dans votre fichier de code, importez les bibliothèques nécessaires pour travailler avec Aspose.Cells. Voici le code correspondant :

```csharp
using Aspose.Cells;
```

## Étape 3 : Définir le répertoire de documents

Définissez le répertoire dans lequel se trouve le document Excel avec lequel vous souhaitez travailler. Utilisez le code suivant pour définir le répertoire :

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

Assurez-vous de spécifier le chemin d'accès complet au répertoire.

## Étape 4 : Création d'un objet de classeur

L'objet Workbook représente le document Excel avec lequel vous allez travailler. Vous pouvez le créer en utilisant le code suivant :

```csharp
Workbook workbook = new Workbook();
```

Cela crée un nouvel objet Workbook vide.

## Étape 5 : Accéder à la première feuille de travail

Pour accéder à la première feuille de calcul du document Excel, utilisez le code suivant :

```csharp
Worksheet worksheet = workbook.Worksheets[0];
```

Cela vous permettra de travailler avec la première feuille de calcul du classeur.

## Étape 6 : configuration du format de papier

Utilisez la propriété PageSetup.PaperSize de l'objet Worksheet pour définir la taille du papier. Dans cet exemple, nous allons définir le format de papier sur A4. Voici le code correspondant :

```csharp
worksheet.PageSetup.PaperSize = PaperSizeType.PaperA4;
```

Cela définit le format de papier de la feuille de calcul sur A4.

## Étape 7 : Enregistrer le classeur

Pour enregistrer les modifications apportées au classeur, utilisez la méthode Save() de l'objet Workbook. Voici le code correspondant :

```csharp
workbook.Save(dataDir + "ManagePaperSize_out.xls");
```

Cela enregistrera le classeur avec les modifications dans le répertoire spécifié.

### Exemple de code source pour gérer la taille du papier Excel à l'aide d'Aspose.Cells pour .NET 
```csharp
// Chemin d'accès au répertoire des documents.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Instanciation d'un objet Workbook
Workbook workbook = new Workbook();
// Accéder à la première feuille de calcul du fichier Excel
Worksheet worksheet = workbook.Worksheets[0];
// Réglage du format de papier sur A4
worksheet.PageSetup.PaperSize = PaperSizeType.PaperA4;
// Enregistrez le classeur.
workbook.Save(dataDir + "ManagePaperSize_out.xls");
```
## Conclusion

Vous avez maintenant appris à gérer la taille du papier dans un document Excel à l'aide d'Aspose.Cells pour .NET. Ce didacticiel vous a guidé à chaque étape du processus, de la configuration de l'environnement à l'enregistrement des modifications. Vous pouvez maintenant utiliser ces connaissances pour personnaliser le format de papier de vos documents Excel.

### FAQ

#### Q1 : Puis-je définir un format de papier personnalisé autre que A4 ?

R1 : Oui, Aspose.Cells prend en charge une variété de formats de papier prédéfinis ainsi que la possibilité de définir un format de papier personnalisé en spécifiant les dimensions souhaitées.

#### Q2 : Comment puis-je connaître le format de papier actuel dans un document Excel ?

 A2 : Vous pouvez utiliser le`PageSetup.PaperSize` propriété de la`Worksheet` objet pour obtenir le format de papier actuellement défini.

#### Q3 : Est-il possible de définir des marges de page supplémentaires avec le format de papier ?

 A3 : Oui, vous pouvez utiliser`PageSetup.LeftMargin`, `PageSetup.RightMargin`, `PageSetup.TopMargin` et`PageSetup.BottomMargin` propriétés pour définir des marges de page supplémentaires en plus de la taille du papier.

#### Q4 : Cette méthode fonctionne-t-elle pour tous les formats de fichier Excel, tels que .xls et .xlsx ?

R4 : Oui, cette méthode fonctionne pour les formats de fichier .xls et .xlsx.

#### Q5 : Puis-je appliquer différents formats de papier à différentes feuilles de calcul dans le même classeur ?

 A5 : Oui, vous pouvez appliquer différents formats de papier à différentes feuilles de calcul dans le même classeur en utilisant le`PageSetup.PaperSize` propriété de chaque feuille de calcul.