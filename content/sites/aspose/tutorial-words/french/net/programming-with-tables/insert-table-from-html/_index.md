---
title: Insérer un tableau à partir de HTML
linktitle: Insérer un tableau à partir de HTML
second_title: Référence de l'API Aspose.Words pour .NET
description: Apprenez à insérer un tableau HTML dans un document Word avec Aspose.Words pour .NET.
type: docs
weight: 10
url: /fr/net/programming-with-tables/insert-table-from-html/
---

Dans ce tutoriel, nous allons apprendre à insérer un tableau dans un document Word à partir de HTML en utilisant Aspose.Words pour .NET. Nous suivrons un guide étape par étape pour comprendre le code et implémenter cette fonctionnalité. À la fin de ce didacticiel, vous serez en mesure d'insérer des tableaux HTML dans vos documents Word par programmation.

## Étape 1 : configuration du projet
1. Lancez Visual Studio et créez un nouveau projet C#.
2. Ajoutez une référence à la bibliothèque Aspose.Words pour .NET.

## Etape 2 : Création du document et initialisation du générateur de document
Pour commencer à travailler avec le document et le générateur de documents, suivez ces étapes :

```csharp
// Chemin d'accès à votre répertoire de documents
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// création de documents
Document doc = new Document();

// Initialiser le générateur de documents
DocumentBuilder builder = new DocumentBuilder(doc);
```

Assurez-vous de remplacer "VOTRE RÉPERTOIRE DE DOCUMENTS" par le chemin d'accès réel à votre répertoire de documents.

## Étape 3 : Insertion du tableau depuis HTML
Ensuite, nous allons insérer le tableau dans le document à l'aide du code HTML. Utilisez le code suivant :

```csharp
builder.InsertHtml("<table>" +
"<tr>" +
"<td>Line 1, Cell 1</td>" +
"<td>Line 1, Cell 2</td>" +
"</tr>" +
"<tr>" +
"<td>Line 2, Cell 1</td>" +
"<td>Line 2, Cell 2</td>" +
"</tr>" +
"</table>");
```

 Ici on utilise le`InsertHtml` méthode du générateur de document pour insérer le code HTML contenant le tableau. Le code HTML spécifié crée un tableau avec deux lignes et deux cellules dans chaque ligne. Vous pouvez personnaliser le contenu du tableau en modifiant le code HTML selon vos besoins.

## Étape 4 : Enregistrer le document modifié
Enfin, nous devons enregistrer le document modifié avec le tableau inséré depuis HTML. Utilisez le code suivant :

```csharp
doc.Save(dataDir + "WorkingWithTables.InsertTableFromHtml.docx");
```

Assurez-vous de spécifier le chemin d'accès et le nom de fichier corrects pour le document de sortie.

### Exemple de code source pour Insert Table From Html en utilisant Aspose.Words pour .NET 

```csharp
	// Chemin d'accès à votre répertoire de documents
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);
	// Notez qu'AutoFitSettings ne s'applique pas aux tableaux insérés à partir de HTML.
	builder.InsertHtml("<table>" +
					   "<tr>" +
					   "<td>Row 1, Cell 1</td>" +
					   "<td>Row 1, Cell 2</td>" +
					   "</tr>" +
					   "<tr>" +
					   "<td>Row 2, Cell 2</td>" +
					   "<td>Row 2, Cell 2</td>" +
					   "</tr>" +
					   "</table>");
	doc.Save(dataDir + "WorkingWithTables.InsertTableFromHtml.docx");
```

## Conclusion
Dans ce didacticiel, nous avons appris à insérer un tableau dans un document Word à partir de HTML à l'aide de Aspose.Words pour .NET. En suivant ce guide étape par étape et en implémentant le code C# fourni, vous pouvez insérer des tableaux HTML dans vos documents Word par programmation. Cette fonctionnalité vous permet de convertir et d'importer des données tabulaires à partir de sources HTML dans vos documents Word.
