---
title: Ignorer l'en-tête de pied de page
linktitle: Ignorer l'en-tête de pied de page
second_title: Référence de l'API Aspose.Words pour .NET
description: Apprenez à ajouter un document tout en ignorant le contenu de l'en-tête et du pied de page à l'aide d'Aspose.Words pour .NET.
type: docs
weight: 10
url: /fr/net/join-and-append-documents/ignore-header-footer/
---

Ce didacticiel explique comment utiliser Aspose.Words pour .NET pour ajouter un document tout en ignorant le contenu de l'en-tête et du pied de page. Le code source fourni montre comment configurer les options de format d'importation pour exclure l'en-tête et le pied de page pendant le processus d'ajout.

## Étape 1 : Configurer le projet

Assurez-vous que vous disposez des prérequis suivants :

- Bibliothèque Aspose.Words pour .NET installée. Vous pouvez le télécharger à partir du site Web officiel d'Aspose ou utiliser le gestionnaire de packages NuGet pour l'installer.
- Un chemin d'accès au répertoire de documents où se trouvent les documents source et de destination.

## Étape 2 : Ouvrez les documents source et destination

 Ouvrez les documents source et destination à l'aide de la`Document` constructeur de classe. Remplacer`"YOUR DOCUMENT DIRECTORY"` avec le chemin d'accès réel à votre répertoire de documents.

```csharp
// Chemin d'accès à votre répertoire de documents
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document srcDocument = new Document(dataDir + "Document source.docx");
Document dstDocument = new Document(dataDir + "Northwind traders.docx");
```

## Étape 3 : Configurer les options de format d'importation

 Créer une instance de`ImportFormatOptions` classe et définissez la`IgnoreHeaderFooter` propriété à`false`. Cela garantit que le contenu de l'en-tête et du pied de page est inclus pendant le processus d'ajout.

```csharp
ImportFormatOptions importFormatOptions = new ImportFormatOptions { IgnoreHeaderFooter = false };
```

## Étape 4 : Ajouter le document source au document de destination

 Utilisez le`AppendDocument` méthode du document de destination pour ajouter le document source. Passer`ImportFormatMode.KeepSourceFormatting` comme deuxième paramètre et les options de format d'importation comme troisième paramètre.

```csharp
dstDocument.AppendDocument(srcDocument, ImportFormatMode.KeepSourceFormatting, importFormatOptions);
```

## Étape 5 : Enregistrer le document de destination

 Enfin, enregistrez le document de destination modifié à l'aide de la`Save` méthode de la`Document` objet.

```csharp
dstDocument.Save(dataDir + "JoinAndAppendDocuments.IgnoreHeaderFooter.docx");
```

Ceci termine l'implémentation de l'ajout d'un document tout en ignorant le contenu de l'en-tête et du pied de page à l'aide de Aspose.Words pour .NET.

### Exemple de code source pour Ignorer l'en-tête de pied de page à l'aide d'Aspose.Words pour .NET 

```csharp
	// Chemin d'accès à votre répertoire de documents
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	Document srcDocument = new Document(dataDir + "Document source.docx");
	Document dstDocument = new Document(dataDir + "Northwind traders.docx");
	ImportFormatOptions importFormatOptions = new ImportFormatOptions { IgnoreHeaderFooter = false };
	dstDocument.AppendDocument(srcDocument, ImportFormatMode.KeepSourceFormatting, importFormatOptions);
	dstDocument.Save(dataDir + "JoinAndAppendDocuments.IgnoreHeaderFooter.docx");
```