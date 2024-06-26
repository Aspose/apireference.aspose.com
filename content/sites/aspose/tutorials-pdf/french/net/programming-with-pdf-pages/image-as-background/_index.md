---
title: Définir l'image comme arrière-plan de la page dans le fichier PDF
linktitle: Définir l'image comme arrière-plan de la page dans le fichier PDF
second_title: Référence de l'API Aspose.PDF pour .NET
description: Guide étape par étape pour définir une image comme arrière-plan de page dans un fichier PDF à l'aide d'Aspose.PDF pour .NET.
type: docs
weight: 110
url: /fr/net/programming-with-pdf-pages/image-as-background/
---
Dans ce didacticiel, nous vous expliquerons étape par étape le processus de définition d'une image comme arrière-plan de page à l'aide d'Aspose.PDF pour .NET. Nous expliquerons le code source C# fourni et vous fournirons un guide complet pour vous aider à comprendre et à implémenter cette fonctionnalité dans vos propres projets. À la fin de ce didacticiel, vous saurez comment ajouter une image en arrière-plan de page dans un document PDF à l'aide d'Aspose.PDF pour .NET.

## Conditions préalables
Avant de commencer, assurez-vous d'avoir les éléments suivants :

- Une connaissance de base du langage de programmation C#
- Aspose.PDF pour .NET installé dans votre environnement de développement

## Étape 1 : Définir le répertoire des documents
Tout d'abord, vous devez définir le chemin d'accès à votre répertoire de documents. Il s'agit de l'emplacement où vous souhaitez enregistrer votre document PDF modifié. Remplacez "VOTRE RÉPERTOIRE DE DOCUMENTS" par le chemin approprié.

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Étape 2 : Créer un nouveau document
 Ensuite, vous pouvez créer un nouvel objet Document en utilisant le`Document` classe.

```csharp
Document doc = new Document();
```

## Étape 3 : Ajouter une nouvelle page au document
 Vous pouvez maintenant ajouter une nouvelle page à l'objet Document à l'aide de la`Add()` méthode de la`Pages` classe.

```csharp
Page page = doc.Pages.Add();
```

## Étape 4 : Créer un objet Artefact d'arrière-plan
Ensuite, vous pouvez créer un nouvel objet BackgroundArtifact pour définir l'image d'arrière-plan.

```csharp
BackgroundArtifact background = new BackgroundArtifact();
background.BackgroundImage = File.OpenRead(dataDir + "aspose-total-for-net.jpg");
```

## Étape 5 : Ajoutez l'arrière-plan à la page
Ensuite, vous pouvez ajouter l'objet BackgroundArtifact à la collection d'artefacts de la page à l'aide de l'objet`Artifacts` propriété de la`Page` classe.

```csharp
page. Artifacts. Add(background);
```

## Étape 6 : Enregistrez le document PDF
 Enfin, vous pouvez enregistrer le document PDF dans un fichier à l'aide de la`Save()` méthode de la`Document`classe. Assurez-vous de spécifier le chemin d'accès et le nom de fichier corrects.

```csharp
doc.Save(dataDir + "ImageAsBackground_out.pdf");
```

### Exemple de code source pour Image en arrière-plan à l'aide d'Aspose.PDF pour .NET 

```csharp

// Chemin d'accès au répertoire des documents.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Créer un nouvel objet Document
Document doc = new Document();
// Ajouter une nouvelle page à l'objet document
Page page = doc.Pages.Add();
// Créer un objet d'artefact d'arrière-plan
BackgroundArtifact background = new BackgroundArtifact();
// Spécifiez l'image pour l'objet backgroundartifact
background.BackgroundImage = File.OpenRead(dataDir + "aspose-total-for-net.jpg");
// Ajouter un artefact d'arrière-plan à la collection d'artefacts de la page
page.Artifacts.Add(background);
dataDir = dataDir + "ImageAsBackground_out.pdf";
// Enregistrer le document
doc.Save(dataDir);
System.Console.WriteLine("\nImage as page background added successfully.\nFile saved at " + dataDir);

```

## Conclusion
Dans ce didacticiel, nous avons appris à définir une image comme arrière-plan de page dans un document PDF à l'aide d'Aspose.PDF pour .NET. En suivant ce guide étape par étape, vous pouvez facilement ajouter une image d'arrière-plan à vos documents PDF. Aspose.PDF offre une API puissante et flexible pour travailler avec des fichiers PDF, y compris la personnalisation de l'arrière-plan de la page. Vous pouvez maintenant appliquer cette fonctionnalité dans vos propres projets pour créer des documents PDF avec des images d'arrière-plan personnalisées

### FAQ pour définir l'image comme arrière-plan de page dans le fichier PDF

#### Q : Comment puis-je définir une image comme arrière-plan de page dans un document PDF à l'aide d'Aspose.PDF pour .NET ?

R : Pour définir une image comme arrière-plan de page dans un document PDF à l'aide d'Aspose.PDF pour .NET, vous pouvez suivre ces étapes :

1. Définissez le répertoire du document en spécifiant le chemin d'accès où vous souhaitez enregistrer votre document PDF modifié.
2.  Créez un nouvel objet Document à l'aide de`Document` classe.
3.  Ajoutez une nouvelle page à l'objet Document à l'aide de la`Add()` méthode de la`Pages` classe.
4.  Créez un nouvel objet BackgroundArtifact pour définir l'image d'arrière-plan. Vous pouvez spécifier le fichier image en utilisant`File.OpenRead()` méthode.
5.  Ajoutez l'objet BackgroundArtifact à la collection d'artefacts de la page à l'aide de l'objet`Artifacts` propriété de la`Page` classe.
6.  Enregistrez le document PDF dans un fichier à l'aide de la`Save()` méthode de la`Document` class et spécifiez le chemin d'accès et le nom de fichier corrects pour la sortie.

#### Q : Puis-je ajouter plusieurs images d'arrière-plan à différentes pages du document PDF ?

R : Oui, vous pouvez ajouter plusieurs images d'arrière-plan à différentes pages du document PDF en répétant le processus décrit dans le didacticiel pour chaque page. Créez simplement un nouvel objet BackgroundArtifact avec l'image souhaitée pour chaque page et ajoutez-le à la collection d'artefacts de la page respective.

#### Q : Puis-je appliquer une mise à l'échelle ou un positionnement de l'image à l'image d'arrière-plan de la page ?

 R : Oui, vous pouvez appliquer la mise à l'échelle ou le positionnement de l'image à l'image d'arrière-plan de la page en manipulant le`background.BackgroundImage` propriété de l'objet BackgroundArtifact. Avant d'ajouter le BackgroundArtifact à la page, vous pouvez modifier les propriétés de l'image, telles que la largeur, la hauteur et la position, pour personnaliser l'apparence de l'image en arrière-plan.

#### Q : Aspose.PDF pour .NET prend-il en charge l'ajout d'images d'arrière-plan aux documents PDF existants avec du contenu ?

: Oui, Aspose.PDF pour .NET vous permet d'ajouter des images d'arrière-plan aux documents PDF existants avec du contenu. Vous pouvez charger un document PDF existant, ajouter l'image d'arrière-plan à la page souhaitée, puis enregistrer le document mis à jour dans un nouveau fichier ou écraser le fichier d'origine.

#### Q : Puis-je utiliser des images de différents formats comme arrière-plan de page, comme PNG ou BMP ?

R : Oui, vous pouvez utiliser des images de différents formats comme arrière-plan de page, tels que PNG ou BMP, en plus du format JPEG utilisé dans le didacticiel. Aspose.PDF pour .NET prend en charge une large gamme de formats d'image, et vous pouvez utiliser n'importe quel format d'image pris en charge comme arrière-plan pour les pages PDF.