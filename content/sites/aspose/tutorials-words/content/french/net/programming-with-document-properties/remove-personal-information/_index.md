---
title: Supprimer les informations personnelles
linktitle: Supprimer les informations personnelles
second_title: API de traitement de documents Aspose.Words
description: Guide étape par étape pour supprimer les informations personnelles d’un document avec Aspose.Words for .NET.
type: docs
weight: 10
url: /fr/net/programming-with-document-properties/remove-personal-information/
---

Dans ce didacticiel, nous vous guiderons à travers le code source C# pour supprimer les informations personnelles d'un document avec Aspose.Words for .NET. Cette fonctionnalité vous permet de supprimer des informations personnelles sensibles d'un document, telles que les données d'identification de l'auteur.

## Étape 1 : Configuration du projet

Pour commencer, créez un nouveau projet C# dans votre IDE préféré. Assurez-vous que la bibliothèque Aspose.Words for .NET est référencée dans votre projet.

## Étape 2 : Chargement du document

Dans cette étape, nous téléchargerons le document Word dont nous souhaitons supprimer les informations personnelles. Utilisez le code suivant pour charger le document :

```csharp
// Chemin d'accès au répertoire des documents.
string dataDir = "YOUR DOCUMENTS DIRECTORY";
Document doc = new Document(dataDir + "Properties.docx") { RemovePersonalInformation = true };
```

 Remplacer`"YOUR DOCUMENTS DIRECTORY"` avec le chemin réel du répertoire où se trouve votre document.

## Étape 3 : Supprimer les informations personnelles

 Nous allons maintenant permettre la suppression des informations personnelles en définissant le`RemovePersonalInformation` propriété à`true`. Utilisez le code suivant :

```csharp
doc.RemovePersonalInformation = true;
```

Ce code active la suppression des informations personnelles dans le document.

## Étape 4 : Sauvegarde du document

Enfin, nous enregistrerons le document avec les informations personnelles supprimées. Utilisez le code suivant :

```csharp
doc.Save(dataDir + "DocumentPropertiesAndVariables.RemovePersonalInformation.docx");
```

Ce code enregistre le document avec les informations personnelles supprimées dans un nouveau fichier.

### Exemple de code source pour supprimer des informations personnelles à l'aide d'Aspose.Words pour .NET

```csharp

	// Le chemin d'accès au répertoire des documents.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document(dataDir + "Properties.docx") { RemovePersonalInformation = true };

	doc.Save(dataDir + "DocumentPropertiesAndVariables.RemovePersonalInformation.docx");
	
```

 Assurez-vous de spécifier le chemin d'accès correct au document dans le champ`dataDir` variable.

Vous savez maintenant comment supprimer des informations personnelles d'un document à l'aide d'Aspose.Words pour .NET. En suivant le guide étape par étape fourni dans ce didacticiel, vous pouvez facilement supprimer les informations sensibles de vos propres documents.