---
title: Exporter le champ du formulaire de saisie de texte sous forme de texte
linktitle: Exporter le champ du formulaire de saisie de texte sous forme de texte
second_title: API de traitement de documents Aspose.Words
description: Guide étape par étape pour exporter les champs du formulaire de saisie de texte sous forme de texte brut avec Aspose.Words pour .NET.
type: docs
weight: 10
url: /fr/net/programming-with-htmlsaveoptions/export-text-input-form-field-as-text/
---

Dans ce didacticiel, nous vous guiderons à travers le code source C# pour exporter les champs du formulaire de saisie de texte sous forme de texte brut avec Aspose.Words pour .NET. Cette fonctionnalité vous permet d'exporter les champs du formulaire de saisie de texte sous forme de texte lisible, plutôt que de les exporter sous forme d'éléments de saisie HTML.

## Étape 1 : Configuration du projet

Pour commencer, créez un nouveau projet C# dans votre IDE préféré. Assurez-vous que la bibliothèque Aspose.Words for .NET est référencée dans votre projet.

## Étape 2 : Chargement du document

Dans cette étape, nous allons charger le document à exporter. Utilisez le code suivant pour charger le document à partir d'un répertoire spécifié :

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document(dataDir + "Rendering.docx");
```

 Ce code crée une instance de`Document` en chargeant le document à partir du répertoire spécifié.

## Étape 3 : Configuration des options de sauvegarde HTML

Nous allons maintenant configurer les options de sauvegarde HTML pour exporter les champs du formulaire de saisie de texte sous forme de texte brut. Utilisez le code suivant :

```csharp
string imagesDir = Path. Combine(ArtifactsDir, "Images");

// Le dossier spécifié doit exister et être vide.
if (Directory.Exists(imagesDir))
Directory. Delete(imagesDir, true);

Directory.CreateDirectory(imagesDir);

HtmlSaveOptions saveOptions = new HtmlSaveOptions(SaveFormat.Html)
{
ExportTextInputFormFieldAsText = true,
ImagesFolder = imagesDir
};
```

 Ce code crée une instance de`HtmlSaveOptions`et définit le`ExportTextInputFormFieldAsText` possibilité de`true`pour exporter les champs du formulaire de saisie de texte sous forme de texte brut. De plus, il précise le dossier dans lequel les images extraites seront enregistrées.

## Étape 4 : Conversion et enregistrement du document au format HTML

Enfin, nous convertirons le document en HTML en utilisant les options d'enregistrement HTML configurées précédemment. Utilisez le code suivant :

```csharp
doc.Save(dataDir + "WorkingWithHtmlSaveOptions.ExportTextInputFormFieldAsText.html", saveOptions);
```

Ce code convertit le document en HTML en exportant les champs du formulaire de saisie de texte sous forme de texte brut et enregistre le fichier HTML exporté dans le répertoire spécifié.

### Exemple de code source pour exporter le champ du formulaire de saisie de texte sous forme de texte à l'aide d'Aspose.Words pour .NET


```csharp

	// Le chemin d'accès au répertoire des documents.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document(dataDir + "Rendering.docx");

	string imagesDir = Path.Combine(ArtifactsDir, "Images");

	// Le dossier spécifié doit exister et doit être vide.
	if (Directory.Exists(imagesDir))
		Directory.Delete(imagesDir, true);

	Directory.CreateDirectory(imagesDir);

	// Définissez une option pour exporter les champs de formulaire sous forme de texte brut, et non sous forme d'éléments d'entrée HTML.
	HtmlSaveOptions saveOptions = new HtmlSaveOptions(SaveFormat.Html)
	{
		ExportTextInputFormFieldAsText = true, ImagesFolder = imagesDir
	};

	doc.Save(dataDir + "WorkingWithHtmlSaveOptions.ExportTextInputFormFieldAsText.html", saveOptions);

```

 Assurez-vous de spécifier le chemin correct vers le répertoire des documents dans le`dataDir` variable.