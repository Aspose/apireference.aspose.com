---
title: Définir la taille de l'image dans le fichier PDF
linktitle: Définir la taille de l'image dans le fichier PDF
second_title: Référence de l'API Aspose.PDF pour .NET
description: Guide étape par étape pour définir la taille d'une image dans un fichier PDF à l'aide d'Aspose.PDF pour .NET.
type: docs
weight: 270
url: /fr/net/programming-with-images/set-image-size/
---
Dans ce didacticiel, nous vous expliquerons comment définir la taille d'une image dans un fichier PDF à l'aide d'Aspose.PDF pour .NET. Suivez ces étapes pour effectuer cette opération facilement.

## Conditions préalables

Avant de commencer, assurez-vous d'avoir les éléments suivants :

- Visual Studio ou tout autre environnement de développement installé et configuré.
- Une connaissance de base du langage de programmation C#.
- Bibliothèque Aspose.PDF pour .NET installée. Vous pouvez le télécharger sur le site officiel d'Aspose.

## Etape 1 : Création du document PDF

Pour commencer, utilisez le code suivant pour créer un nouveau document PDF :

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
// Instancier un objet Document
Document doc = new Document();

// Ajouter une page à la collection de pages du fichier PDF
Aspose.Pdf.Page page = doc.Pages.Add();
```

## Étape 2 : Image ajoutée

Ensuite, nous ajouterons une image à la page du document PDF. Utilisez le code suivant :

```csharp
// Créer une instance d'image
Aspose.Pdf.Image img = new Aspose.Pdf.Image();

// Définir la largeur et la hauteur de l'image en points
img. FixWidth = 100;
img. FixHeight = 100;

// Définir le type d'image sur inconnu (Inconnu)
img.FileType = Aspose.Pdf.ImageFileType.Unknown;

//Chemin d'accès au fichier source de l'image
img.File = dataDir + "aspose-logo.jpg";

// Ajouter l'image à la collection de paragraphes de la page
page.Paragraphs.Add(img);
```

Assurez-vous de fournir le chemin d'accès correct au fichier source de l'image.

## Étape 3 : Définir les propriétés de la page

Enfin, nous définirons les propriétés de la page, notamment sa largeur et sa hauteur. Utilisez le code suivant :

```csharp
// Définir les propriétés de la page
page.PageInfo.Width = 800;
page.PageInfo.Height = 800;
```

### Exemple de code source pour définir la taille de l'image à l'aide d'Aspose.PDF pour .NET 
```csharp
// Chemin d'accès au répertoire des documents.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Instancier l'objet Document
Document doc = new Document();
// ajouter une page à la collection de pages du fichier PDF
Aspose.Pdf.Page page = doc.Pages.Add();
// Créer une instance d'image
Aspose.Pdf.Image img = new Aspose.Pdf.Image();
// Définir la largeur et la hauteur de l'image en points
img.FixWidth = 100;
img.FixHeight = 100;
// Définir le type d'image comme SVG
img.FileType = Aspose.Pdf.ImageFileType.Unknown;
// Chemin du fichier source
img.File = dataDir + "aspose-logo.jpg";
page.Paragraphs.Add(img);
//Définir les propriétés de la page
page.PageInfo.Width = 800;
page.PageInfo.Height = 800;
dataDir = dataDir + "SetImageSize_out.pdf";
// enregistrer le fichier PDF résultant
doc.Save(dataDir);
Console.WriteLine("\nImage size added successfully.\nFile saved at " + dataDir);
```

## Conclusion

Félicitation ! Vous avez défini avec succès la taille d'une image dans un document PDF à l'aide d'Aspose.PDF pour .NET. Vous pouvez maintenant appliquer cette méthode à vos propres projets pour ajuster la taille des images dans les fichiers PDF.

### FAQ pour définir la taille de l'image dans le fichier PDF

#### Q : Quel est l'objectif de définir la taille d'une image dans un document PDF à l'aide d'Aspose.PDF pour .NET ?

: Le but de la définition de la taille d'une image dans un document PDF est de contrôler les dimensions de l'image lorsqu'elle est ajoutée au PDF. Cela vous permet d'ajuster l'apparence et la disposition des images dans vos fichiers PDF.

#### Q : Comment fonctionne le processus de définition de la taille d'une image dans un document PDF ?

 R : Le processus implique la création d'un`Aspose.Pdf.Image` instance, en spécifiant sa largeur et sa hauteur à l'aide de la`FixWidth` et`FixHeight` propriétés, puis en ajoutant l'image au document PDF. De plus, vous pouvez définir les dimensions de la page elle-même pour accueillir l'image.

#### Q : Puis-je définir la taille d'une image sur un pourcentage spécifique des dimensions de la page ?

R : Le code fourni définit la largeur et la hauteur absolues de l'image en points. Si vous souhaitez définir la taille d'une image en fonction d'un pourcentage des dimensions de la page, vous devez calculer les dimensions en conséquence et ajuster le code en conséquence.

####  Q : Quelle est la signification de la`FileType` property when adding an image to the PDF document?

 R : Le`FileType`La propriété spécifie le type d'image ajoutée au document PDF. Dans le code fourni, la valeur`Unknown` indique que le type d'image est inconnu et Aspose.PDF tentera de déterminer le type d'image en fonction de l'extension de fichier.

#### Q : Puis-je ajouter plusieurs images à une seule page en utilisant cette méthode ?

 R : Oui, vous pouvez ajouter plusieurs images à une même page en créant plusieurs`Aspose.Pdf.Image` instances et en les ajoutant à la collection de paragraphes de la page. Assurez-vous d'ajuster le positionnement et la disposition des images selon vos besoins.

#### Q : Comment puis-je contrôler le placement et l'alignement de l'image ajoutée sur la page ?

 R : Le placement et l'alignement de l'image ajoutée peuvent être contrôlés en ajustant les coordonnées et la disposition de l'image à l'aide de propriétés telles que`img.Left`, `img.Top`, et les propriétés de mise en forme des paragraphes.

####  Q : À quoi sert de définir les propriétés de la page à l'aide de`page.PageInfo.Width` and `page.PageInfo.Height`?

R : La configuration des propriétés de la page vous permet de définir les dimensions de la page elle-même. Cela garantit que les dimensions de la page s'adaptent à l'image ajoutée et à tout autre contenu que vous pourriez avoir sur la page.

#### Q : Puis-je définir différentes tailles pour différentes images dans le même document PDF ?

 R : Oui, vous pouvez définir différentes tailles pour différentes images en créant des`Aspose.Pdf.Image` instances et en ajustant les`FixWidth`, `FixHeight`, et les propriétés de placement de chaque image.

#### Q : Comment puis-je intégrer cette méthode dans mes propres projets pour définir la taille des images dans les fichiers PDF ?

R : Pour intégrer cette méthode dans vos projets, suivez les étapes décrites et modifiez le code si nécessaire. Vous pouvez utiliser cette méthode pour ajouter des images de tailles spécifiques à vos documents PDF en fonction des exigences de votre application.