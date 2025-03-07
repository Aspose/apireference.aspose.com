---
title: Conserver le formatage source
linktitle: Conserver le formatage source
second_title: API de traitement de documents Aspose.Words
description: Découvrez comment ajouter un document source à un document de destination tout en préservant la mise en forme d'origine à l'aide d'Aspose.Words pour .NET.
type: docs
weight: 10
url: /fr/net/join-and-append-documents/keep-source-formatting/
---

Ce didacticiel montre comment ajouter un document source à un document de destination tout en préservant la mise en forme d'origine du document source à l'aide d'Aspose.Words pour .NET.

## Étape 1 : Configurer le projet

Assurez-vous que vous disposez des conditions préalables suivantes :

-  Bibliothèque Aspose.Words pour .NET installée. Vous pouvez le télécharger depuis[Aspose.Releases]https://releases.aspose.com/words/net/ ou utilisez le gestionnaire de packages NuGet pour l'installer.
- Un chemin de répertoire de documents dans lequel les documents source et de destination seront enregistrés.

## Étape 2 : Créer les documents de destination et source

 Créer des instances de`Document` pour les documents de destination et d'origine.

```csharp
// Chemin d'accès à votre répertoire de documents
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document dstDoc = new Document();
dstDoc.FirstSection.Body.AppendParagraph("Destination document text.");

Document srcDoc = new Document();
srcDoc.FirstSection.Body.AppendParagraph("Source document text.");
```

## Étape 3 : Ajouter le document source au document de destination

 Utilisez le`AppendDocument` méthode du document de destination pour ajouter le document source. Passer`ImportFormatMode.KeepSourceFormatting`comme mode de format d'importation pour conserver le formatage d'origine du document source.

```csharp
dstDoc.AppendDocument(srcDoc, ImportFormatMode.KeepSourceFormatting);
```

## Étape 4 : Enregistrez le document modifié

 Enregistrez le document modifié à l'aide du`Save` méthode du`Document` objet.

```csharp
dstDoc.Save(dataDir + "JoinAndAppendDocuments.KeepSourceFormatting.docx");
```

Ceci termine la mise en œuvre de l’ajout d’un document source à un document de destination tout en conservant le formatage d’origine à l’aide d’Aspose.Words pour .NET.

### Exemple de code source pour conserver le formatage source à l'aide d'Aspose.Words pour .NET 

```csharp
	// Chemin d'accès à votre répertoire de documents
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	Document dstDoc = new Document();
	dstDoc.FirstSection.Body.AppendParagraph("Destination document text. ");
	Document srcDoc = new Document();
	srcDoc.FirstSection.Body.AppendParagraph("Source document text. ");
	// Ajoutez le document source au document de destination.
	// Passer le mode format pour conserver le formatage d'origine du document source lors de son importation.
	dstDoc.AppendDocument(srcDoc, ImportFormatMode.KeepSourceFormatting);
	dstDoc.Save(dataDir + "JoinAndAppendDocuments.KeepSourceFormatting.docx");
```