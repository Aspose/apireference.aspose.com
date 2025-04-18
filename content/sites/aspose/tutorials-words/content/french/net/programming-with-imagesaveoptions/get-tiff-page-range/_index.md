---
title: Obtenir la plage de pages Tiff
linktitle: Obtenir la plage de pages Tiff
second_title: API de traitement de documents Aspose.Words
description: Découvrez comment extraire une plage de pages TIFF avec Aspose.Words for .NET. Tutoriel complet pour les fichiers TIFF personnalisés.
type: docs
weight: 10
url: /fr/net/programming-with-imagesaveoptions/get-tiff-page-range/
---

Dans ce didacticiel, nous explorerons le code source C# fourni pour obtenir une gamme de pages TIFF avec Aspose.Words pour .NET. Cette fonctionnalité vous permet d'extraire une plage spécifique de pages d'un document et de les enregistrer sous forme de fichier TIFF.

## Étape 1 : Configuration de l'environnement

Avant de commencer, assurez-vous d'avoir configuré votre environnement de développement avec Aspose.Words for .NET. Assurez-vous d'avoir ajouté les références nécessaires et importé les espaces de noms appropriés.

## Étape 2 : Chargement du document

```csharp
// Chemin d'accès à votre répertoire de documents
string dataDir = "YOUR DOCUMENTS DIRECTORY";

Document doc = new Document(dataDir + "Rendering.docx");
```

 Dans cette étape, nous chargeons le document en utilisant le`Document` et en transmettant le chemin d'accès au fichier DOCX à charger.

## Étape 3 : Sauvegarde du document complet au format TIFF

```csharp
doc.Save(dataDir + "WorkingWithImageSaveOptions.MultipageTiff.tiff");
```

 Dans cette étape, nous enregistrons le document complet au format TIFF en utilisant le`Save` méthode et en spécifiant le chemin d’accès au fichier de sortie avec l’extension`.tiff`.

## Étape 4 : Configurer les options de sauvegarde pour la plage de pages

```csharp
ImageSaveOptions saveOptions = new ImageSaveOptions(SaveFormat.Tiff)
{
PageSet = new PageSet(new PageRange(0, 1)),
TiffCompression = TiffCompression.Ccitt4,
Resolution = 160
};
```

 Dans cette étape, nous configurons les options de sauvegarde pour la plage de pages spécifique. Nous créons un nouveau`ImageSaveOptions` objet précisant le format de sauvegarde souhaité, ici "Tiff" pour le format TIFF. Nous utilisons`PageSet` pour spécifier la plage de pages que nous souhaitons extraire, ici de la page 0 à la page 1 (incluse). Nous définissons également la compression TIFF sur`Ccitt4` et la résolution à 160 dpi.

## Étape 5 : enregistrement de la plage de pages au format TIFF

```csharp
doc.Save(dataDir + "WorkingWithImageSaveOptions.GetTiffPageRange.tiff", saveOptions);
```

 Dans cette dernière étape, nous enregistrons la plage de pages spécifiée au format TIFF à l'aide du`Save`méthode et en passant le chemin d'accès au fichier de sortie avec`.tiff` extension, ainsi que les options de sauvegarde spécifiées.

Vous pouvez désormais exécuter le code source pour obtenir une plage spécifique de pages de votre document et les enregistrer sous forme de fichier TIFF. Les fichiers résultants seront enregistrés dans le répertoire spécifié avec les noms « WorkingWithImageSaveOptions.MultipageTiff.tiff » pour le document complet et « WorkingWithImageSaveOptions.GetTiffPageRange.tiff » pour la plage de pages spécifiée.

### Exemple de code source de Get Tiff Page Range à l’aide d’Aspose.Words pour .NET

```csharp 

// Chemin d'accès à votre répertoire de documents
string dataDir = "YOUR DOCUMENT DIRECTORY"; 

Document doc = new Document(dataDir + "Rendering.docx");

doc.Save(dataDir + "WorkingWithImageSaveOptions.MultipageTiff.tiff");



ImageSaveOptions saveOptions = new ImageSaveOptions(SaveFormat.Tiff)
{
	PageSet = new PageSet(new PageRange(0, 1)), TiffCompression = TiffCompression.Ccitt4, Resolution = 160
};

doc.Save(dataDir + "WorkingWithImageSaveOptions.GetTiffPageRange.tiff", saveOptions);
            
            
        
```

## Conclusion

Dans ce didacticiel, nous avons exploré la fonctionnalité permettant d'obtenir une gamme de pages TIFF avec Aspose.Words pour .NET. Nous avons appris à extraire une plage spécifique de pages d'un document et à les enregistrer sous forme de fichier TIFF.

Cette fonctionnalité est utile lorsque vous souhaitez extraire uniquement certaines pages d'un document et les enregistrer dans un format d'image standard tel que TIFF. Vous pouvez également personnaliser les options de compression et de résolution pour obtenir des fichiers TIFF de la meilleure qualité.

Aspose.Words for .NET offre une large gamme de fonctionnalités avancées pour la manipulation et la génération de documents. Obtenir une plage de pages TIFF est l'un des nombreux outils puissants qu'il met à votre disposition.

N'hésitez pas à intégrer cette fonctionnalité dans vos projets Aspose.Words for .NET pour extraire et enregistrer des plages de pages spécifiques de vos documents au format TIFF.