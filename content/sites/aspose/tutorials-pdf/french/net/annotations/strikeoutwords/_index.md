---
title: Barrer les mots
linktitle: Barrer les mots
second_title: Référence de l'API Aspose.PDF pour .NET
description: Cet article fournit un guide étape par étape pour l'utilisation d'Aspose.PDF pour la fonctionnalité Strike Out Words de .NET, y compris un guide étape par étape et des explications.
type: docs
weight: 150
url: /fr/net/annotations/strikeoutwords/
---
Aspose.PDF pour .NET est une bibliothèque de manipulation et de traitement de documents PDF qui fournit diverses fonctionnalités pour créer, modifier et convertir des fichiers PDF. L'une des fonctionnalités utiles fournies par Aspose.PDF est la possibilité de supprimer des mots ou des phrases dans un document PDF à l'aide du code source C#. Dans cet article, nous fournirons un guide étape par étape sur la façon de supprimer des mots à l'aide d'Aspose.PDF pour .NET.

## Étape 1 : Chargement du document PDF
La première étape consiste à charger le document PDF que vous souhaitez modifier. Dans ce didacticiel, nous allons charger un document PDF nommé "input.pdf" à partir du dossier "YOUR DOCUMENT DIRECTORY". 

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document document = new Document(dataDir + "input.pdf");
```

## Étape 2 : Recherche de fragments de texte
Pour rayer des mots ou des phrases spécifiques dans le document PDF, vous devez d'abord les rechercher. Aspose.PDF fournit une classe TextFragmentAbsorber qui peut être utilisée pour rechercher un fragment de texte spécifique dans le document PDF.

```csharp
Aspose.Pdf.Text.TextFragmentAbsorber textFragmentAbsorber = new Aspose.Pdf.Text.TextFragmentAbsorber("Estoque");
```

Dans le code ci-dessus, nous recherchons le fragment de texte "Estoque" dans le document PDF. Vous pouvez le modifier pour rechercher tout autre mot ou expression que vous souhaitez rayer.

## Étape 3 : Biffer les fragments de texte
Après avoir trouvé les fragments de texte, l'étape suivante consiste à les supprimer. Aspose.PDF fournit une classe StrikeOutAnnotation qui peut être utilisée pour créer une annotation barrée pour le fragment de texte. 

```csharp
Aspose.Pdf.Rectangle rect = new Aspose.Pdf.Rectangle((float)textFragment.Position.XIndent, (float)textFragment.Position.YIndent, (float)textFragment.Position.XIndent + (float)textFragment.Rectangle.Width, (float)textFragment.Position.YIndent + (float)textFragment.Rectangle.Height);

StrikeOutAnnotation strikeOut = new StrikeOutAnnotation(textFragment.Page, rect);
strikeOut.Opacity = .80f;
strikeOut.Border = new Border(strikeOut);
strikeOut.Color = Aspose.Pdf.Color.Red;
textFragment.Page.Annotations.Add(strikeOut);
```

Dans le code ci-dessus, nous créons une annotation barrée pour chaque fragment de texte que nous avons trouvé. Nous définissons également l'opacité, la bordure et la couleur de l'annotation barrée.

## Étape 4 : Enregistrer le document PDF modifié
Après avoir supprimé les fragments de texte, enregistrez le document modifié.

```csharp
dataDir = dataDir + "StrikeOutWords_out.pdf";
document.Save(dataDir);
```

### Exemple de code source pour les mots barrés à l'aide d'Aspose.PDF pour .NET


```csharp

// Chemin d'accès au répertoire des documents.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// Ouvrir le document
Document document = new Document(dataDir + "input.pdf");

// Créer une instance TextFragment Absorber pour rechercher un fragment de texte particulier
Aspose.Pdf.Text.TextFragmentAbsorber textFragmentAbsorber = new Aspose.Pdf.Text.TextFragmentAbsorber("Estoque");
// Parcourir les pages d'un document PDF
for (int i = 1; i <= document.Pages.Count; i++)
{
	// Obtenir la première page du document PDF
	Page page = document.Pages[1];
	page.Accept(textFragmentAbsorber);
}

// Créer une collection de texte Absorbé
Aspose.Pdf.Text.TextFragmentCollection textFragmentCollection = textFragmentAbsorber.TextFragments;

//Itérer sur la collection ci-dessus
for (int j = 1; j <= textFragmentCollection.Count; j++)
{
	Aspose.Pdf.Text.TextFragment textFragment = textFragmentCollection[j];

	// Obtenir les dimensions rectangulaires de l'objet TextFragment
	Aspose.Pdf.Rectangle rect = new Aspose.Pdf.Rectangle(
				(float)textFragment.Position.XIndent,
				(float)textFragment.Position.YIndent,
				(float)textFragment.Position.XIndent +
				(float)textFragment.Rectangle.Width,
				(float)textFragment.Position.YIndent +
				(float)textFragment.Rectangle.Height);

	// Instancier l'instance d'annotation StrikeOut
	StrikeOutAnnotation strikeOut = new StrikeOutAnnotation(textFragment.Page, rect);
	// Définir l'opacité de l'annotation
	strikeOut.Opacity = .80f;
	// Définir la bordure de l'instance d'annotation
	strikeOut.Border = new Border(strikeOut);
	// Définir la couleur de l'annotation
	strikeOut.Color = Aspose.Pdf.Color.Red;
	// Ajouter une annotation à la collection d'annotations de TextFragment
	textFragment.Page.Annotations.Add(strikeOut);
}
dataDir = dataDir + "StrikeOutWords_out.pdf";
document.Save(dataDir);
```

## Conclusion

Dans ce didacticiel, nous avons appris à utiliser Aspose.PDF pour .NET pour supprimer des mots spécifiques dans un document PDF. En suivant le guide étape par étape et en utilisant le code source C# fourni, vous pouvez facilement charger un document PDF, rechercher des fragments de texte spécifiques et créer des annotations barrées pour marquer et barrer visuellement ces mots. Aspose.PDF pour .NET fournit un moyen simple et efficace de manipuler des documents PDF par programmation, ce qui en fait un outil précieux pour les développeurs travaillant avec des fichiers PDF dans des applications .NET.

### FAQ

#### Q : Qu'est-ce qu'Aspose.PDF pour .NET ?

R : Aspose.PDF pour .NET est une bibliothèque puissante qui permet aux développeurs de créer, de modifier et de manipuler des documents PDF par programmation dans des applications .NET. Il fournit un large éventail de fonctionnalités pour travailler avec des fichiers PDF, y compris l'extraction de texte, la gestion des annotations, le remplissage de formulaires, et bien plus encore.

#### Q : Puis-je utiliser Aspose.PDF pour .NET pour supprimer des mots spécifiques dans un document PDF ?

R : Oui, Aspose.PDF pour .NET fournit une fonctionnalité permettant de rechercher des fragments de texte spécifiques dans un document PDF, puis de créer des annotations barrées pour marquer et barrer visuellement ces mots.

#### Q : Comment spécifier le texte que je souhaite rayer dans le document PDF ?

 R : Pour spécifier le texte que vous souhaitez barrer, vous pouvez utiliser le`TextFragmentAbsorber` classe fournie par Aspose.PDF pour .NET. Il vous permet de rechercher un fragment de texte spécifique dans le document PDF en fonction des critères souhaités.

#### Q : Puis-je personnaliser l'apparence de l'annotation barrée ?

: Oui, vous pouvez personnaliser diverses propriétés de l'annotation barrée, telles que l'opacité, le style de bordure et la couleur. Cela vous permet d'adapter l'apparence de l'annotation barrée à vos besoins spécifiques.