---
title: Nettoyer le style dupliqué
linktitle: Nettoyer le style dupliqué
second_title: Référence de l'API Aspose.Words pour .NET
description: Guide étape par étape pour nettoyer les styles en double dans un document à l'aide d'Aspose.Words pour .NET. Code source complet inclus.
type: docs
weight: 10
url: /fr/net/programming-with-document-options-and-settings/cleanup-duplicate-style/
---

Dans ce didacticiel, nous vous expliquerons étape par étape le code source C # pour nettoyer les styles en double avec Aspose.Words pour .NET. Cette fonctionnalité permet de supprimer les styles en double d'un document.

## Étape 1 : configuration du projet

Pour commencer, créez un nouveau projet C# dans votre IDE préféré. Assurez-vous que la bibliothèque Aspose.Words pour .NET est référencée dans votre projet.

## Étape 2 : Chargement du document

Dans cette étape, nous allons charger le document Word que nous voulons nettoyer. Utilisez le code suivant pour charger le document :

```csharp
// Chemin d'accès au répertoire des documents.
string dataDir = "YOUR DOCUMENTS DIRECTORY";
Document doc = new Document(dataDir + "Document.docx");
```

 Remplacer`"YOUR DOCUMENTS DIRECTORY"` avec le chemin réel du répertoire où se trouve votre document.

## Étape 3 : Comptez les styles avant de nettoyer

Avant de procéder au nettoyage, nous allons compter le nombre de styles présents dans le document. Utilisez le code suivant pour afficher le nombre de styles :

```csharp
Console.WriteLine(doc.Styles.Count);
```

Cette instruction affiche le nombre de styles présents dans le document.

## Étape 4 : Nettoyer les styles en double

Maintenant, nettoyons les styles en double du document. Utilisez le code suivant pour effectuer le nettoyage :

```csharp
CleanupOptions options = new CleanupOptions { DuplicateStyle = true };
doc. Cleanup(options);
```

 Ce code nettoie les styles en double du document à l'aide des options spécifiées. Dans cet exemple, nous avons activé le`DuplicateStyle` option pour nettoyer les styles en double.

## Étape 5 : Comptez les styles après le nettoyage

Après avoir fait le nettoyage, nous compterons à nouveau le nombre de styles pour vérifier s'il a diminué. Utilisez le code suivant pour afficher le nouveau nombre de styles :

```csharp
Console.WriteLine(doc.Styles.Count);
doc.Save(dataDir + "WorkingWithDocumentOptionsAndSettings.CleanupDuplicateStyle.docx");
```

Cette déclaration affiche le nombre de styles restant après le nettoyage.

### Exemple de code source pour Cleanup Duplicate Style à l'aide de Aspose.Words pour .NET

```csharp

	// Chemin d'accès au répertoire des documents.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document(dataDir + "Document.docx");

	// Nombre de styles avant nettoyage.
	Console.WriteLine(doc.Styles.Count);

	// Nettoie les styles en double du document.
	CleanupOptions options = new CleanupOptions { DuplicateStyle = true };
	doc.Cleanup(options);

	//Le nombre de styles après le nettoyage a été réduit.
	Console.WriteLine(doc.Styles.Count);

	doc.Save(dataDir + "WorkingWithDocumentOptionsAndSettings.CleanupDuplicateStyle.docx");

```