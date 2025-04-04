---
title: Format de ligne Désactiver le saut sur les pages
linktitle: Format de ligne Désactiver le saut sur les pages
second_title: Référence de l'API Aspose.Words pour .NET
description: Découvrez comment désactiver le saut de ligne pour un tableau sur plusieurs pages dans un document Word avec Aspose.Words pour .NET.
type: docs
weight: 10
url: /fr/net/programming-with-tables/row-format-disable-break-across-pages/
---

Dans ce didacticiel, nous allons apprendre à désactiver le saut de ligne d'un tableau de plusieurs pages dans un document Word à l'aide de Aspose.Words pour .NET. Nous suivrons un guide étape par étape pour comprendre le code et implémenter cette fonctionnalité. À la fin de ce didacticiel, vous serez en mesure de désactiver les sauts de ligne pour toutes les lignes de votre tableau dans vos documents Word.

## Étape 1 : configuration du projet
1. Lancez Visual Studio et créez un nouveau projet C#.
2. Ajoutez une référence à la bibliothèque Aspose.Words pour .NET.

## Étape 2 : Chargement du document
Pour commencer à travailler avec le document, procédez comme suit :

```csharp
// Chemin d'accès à votre répertoire de documents
string dataDir = "YOUR DOCUMENTS DIRECTORY";

//Charger le document
Document doc = new Document(dataDir + "Table spanning two pages.docx");
```

Assurez-vous de remplacer "VOTRE RÉPERTOIRE DE DOCUMENTS" par le chemin d'accès réel à votre répertoire de documents et fournissez le nom de fichier correct.

## Étape 3 : Désactiver le saut de ligne dans le tableau
Ensuite, nous désactiverons le saut de ligne pour toutes les lignes du tableau. Utilisez le code suivant :

```csharp
// Récupérer le tableau
Table table = (Table) doc.GetChild(NodeType.Table, 0, true);

// Désactiver le saut de ligne pour toutes les lignes du tableau
foreach(Row row in table.Rows)
row.RowFormat.AllowBreakAcrossPages = false;
```

 Ici, nous utilisons le document pour récupérer la première table, puis parcourons toutes les lignes de la table à l'aide d'une boucle foreach. À l'intérieur de la boucle, nous désactivons le saut de ligne pour chaque ligne en définissant le`RowFormat.AllowBreakAcrossPages` propriété à`false`.

## Étape 4 : Enregistrer le document modifié
Enfin, nous devons enregistrer le document modifié avec le saut de ligne du tableau désactivé. Utilisez le code suivant :

```csharp
doc.Save(dataDir + "WorkingWithTables.RowFormatDisableBreakAcrossPages.docx");
```

Assurez-vous de spécifier le chemin d'accès et le nom de fichier corrects pour le document de sortie.

### Exemple de code source pour Row Format Disable Break Across Pages en utilisant Aspose.Words pour .NET 

```csharp
// Chemin d'accès à votre répertoire de documents
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document(dataDir + "Table spanning two pages.docx");
Table table = (Table) doc.GetChild(NodeType.Table, 0, true);
// Désactiver le saut de pages pour toutes les lignes du tableau.
foreach (Row row in table.Rows)
	row.RowFormat.AllowBreakAcrossPages = false;
doc.Save(dataDir + "WorkingWithTables.RowFormatDisableBreakAcrossPages.docx");
```

## Conclusion
Dans ce didacticiel, nous avons appris à désactiver le saut de ligne d'un tableau de plusieurs pages dans un document Word à l'aide de Aspose.Words pour .NET. En suivant ce guide étape par étape et en implémentant le code C# fourni, vous pouvez appliquer cette désactivation à vos tableaux dans vos documents Word.