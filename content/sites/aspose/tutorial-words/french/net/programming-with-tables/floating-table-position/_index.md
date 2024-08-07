---
title: Position de la table flottante
linktitle: Position de la table flottante
second_title: Référence de l'API Aspose.Words pour .NET
description: Apprenez à positionner un tableau dans une position flottante dans un document Word avec Aspose.Words pour .NET.
type: docs
weight: 10
url: /fr/net/programming-with-tables/floating-table-position/
---

Dans ce didacticiel, nous allons apprendre à utiliser Aspose.Words pour .NET pour positionner un tableau dans une position flottante dans un document Word. Nous suivrons un guide étape par étape pour comprendre le code et implémenter cette fonctionnalité. À la fin de ce didacticiel, vous serez en mesure de contrôler par programmation la position et l'alignement des tableaux flottants dans vos documents Word.

## Étape 1 : configuration du projet
1. Lancez Visual Studio et créez un nouveau projet C#.
2. Ajoutez une référence à la bibliothèque Aspose.Words pour .NET.

## Etape 2 : Chargement du document et accès au tableau
Pour commencer à travailler avec le tableau, nous devons charger le document qui le contient et y accéder. Suivez ces étapes:

```csharp
// Chemin d'accès à votre répertoire de documents
string dataDir = "YOUR DOCUMENTS DIRECTORY";

//Charger le document
Document doc = new Document(dataDir + "Table wrapped by text.docx");

// Accéder au tableau
Table table = doc.FirstSection.Body.Tables[0];
```

Assurez-vous de remplacer "VOTRE RÉPERTOIRE DE DOCUMENTS" par le chemin d'accès réel à votre répertoire de documents. Assurez-vous également que le document contient un tableau qui sera positionné en position flottante.

## Étape 3 : Positionnement de la planche flottante
Ensuite, nous positionnerons le tableau dans une position flottante en utilisant les propriétés fournies par Aspose.Words pour .NET. Utilisez le code suivant :

```csharp
// Positionnement de la table flottante
table. AbsoluteHorizontalDistance = 10;
table. RelativeVerticalAlignment = VerticalAlignment. Center;
```

 Ici on utilise le`AbsoluteHorizontalDistance` propriété pour définir la distance horizontale absolue du tableau à partir du bord gauche de la page. Nous utilisons également le`RelativeVerticalAlignment` propriété pour définir l'alignement vertical relatif du tableau sur le contenu environnant.

## Étape 4 : Enregistrer le document modifié
Enfin, nous devons enregistrer le document modifié avec le tableau positionné en position flottante. Utilisez le code suivant :

```csharp
// Enregistrer le document modifié
doc.Save(dataDir + "WorkingWithTables.FloatingTablePosition.docx");
```

Assurez-vous de spécifier le chemin d'accès et le nom de fichier corrects pour le document de sortie.

### Exemple de code source pour la position de table flottante à l'aide de Aspose.Words pour .NET 

```csharp
	// Chemin d'accès à votre répertoire de documents
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	Document doc = new Document(dataDir + "Table wrapped by text.docx");
	Table table = doc.FirstSection.Body.Tables[0];
	table.AbsoluteHorizontalDistance = 10;
	table.RelativeVerticalAlignment = VerticalAlignment.Center;
	doc.Save(dataDir + "WorkingWithTables.FloatingTablePosition.docx");
```

## Conclusion
Dans ce didacticiel, nous avons appris à positionner un tableau dans une position flottante dans un document Word à l'aide de Aspose.Words pour .NET. En suivant ce guide étape par étape et en implémentant le code C# fourni, vous pouvez contrôler par programmation la position et l'alignement des tableaux flottants dans vos documents Word.