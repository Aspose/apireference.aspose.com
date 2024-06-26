---
title: Ajouter un dessin avec un remplissage dégradé
linktitle: Ajouter un dessin avec un remplissage dégradé
second_title: Référence de l'API Aspose.PDF pour .NET
description: Apprenez à ajouter un dessin avec un remplissage dégradé avec Aspose.PDF pour .NET. Tutoriel étape par étape pour créer des documents PDF attrayants.
type: docs
weight: 20
url: /fr/net/programming-with-graphs/add-drawing-with-gradient-fill/
---
Dans ce didacticiel, nous vous guiderons pas à pas à travers le code source C # suivant pour ajouter un dessin avec un remplissage dégradé à la programmation avec des graphiques à l'aide d'Aspose.PDF pour .NET.

Assurez-vous d'avoir installé la bibliothèque Aspose.PDF et configuré votre environnement de développement avant de commencer. Avoir également des connaissances de base en programmation C#.

## Étape 1 : configuration du répertoire de documents

Dans le code source fourni, vous devez spécifier le répertoire dans lequel vous souhaitez enregistrer le fichier PDF résultant. Remplacez la variable "dataDir" par le répertoire souhaité.

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Étape 2 : instanciation d'un objet document et ajout d'une page

Nous créons une instance de la classe Document et ajoutons une page à ce document.

```csharp
Document doc = new Document();
Page page = doc.Pages.Add();
```

## Étape 3 : Créer un objet graphique et l'ajouter à la page

Nous créons un objet Graph avec des dimensions spécifiées et l'ajoutons à la collection de paragraphes de la page.

```csharp
Aspose.Pdf.Drawing.Graph graph = new Aspose.Pdf.Drawing.Graph(300, 300);
page.Paragraphs.Add(graph);
```

## Étape 4 : créer un objet rectangle et l'ajouter au graphique

Nous créons un objet Rectangle avec des dimensions spécifiées et l'ajoutons à la collection de formes du graphique.

```csharp
Aspose.Pdf.Drawing.Rectangle rect = new Aspose.Pdf.Drawing.Rectangle(0, 0, 300, 300);
graph.Shapes.Add(rect);
```

## Étape 5 : Configurer le remplissage dégradé

Nous configurons le remplissage dégradé du rectangle à l'aide de la classe GradientAxialShading.

```csharp
rect.GraphInfo.FillColor = new Aspose.Pdf.Color
{
PatternColorSpace = new GradientAxialShading(Color.Red, Color.Blue)
{
Start = new Point(0, 0),
End = new Point(300, 300)
}
};
```

Cela crée un remplissage dégradé du rouge au bleu, du point (0, 0) au point (300, 300).

## Étape 6 : Enregistrer le fichier PDF

Enfin, nous enregistrons le fichier PDF résultant sous le nom "AddDrawingWithGradientFill_out.pdf" dans le répertoire spécifié.

```csharp
doc.Save(dataDir + "AddDrawingWithGradientFill_out.pdf");
```

### Exemple de code source pour Ajouter un dessin avec un remplissage dégradé à l'aide d'Aspose.PDF pour .NET 

```csharp

// Chemin d'accès au répertoire des documents.
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document();
Page page = doc.Pages.Add();
Aspose.Pdf.Drawing.Graph graph = new Aspose.Pdf.Drawing.Graph(300, 300);
page.Paragraphs.Add(graph);
Aspose.Pdf.Drawing.Rectangle rect = new Aspose.Pdf.Drawing.Rectangle(0, 0, 300, 300);
graph.Shapes.Add(rect);
rect.GraphInfo.FillColor = new Aspose.Pdf.Color
{
	PatternColorSpace = new GradientAxialShading(Color.Red, Color.Blue)
	{
		Start = new Point(0, 0),
		End = new Point(300, 300)
	}
};
doc.Save(dataDir + "AddDrawingWithGradientFill_out.pdf");

```
## Conclusion

Dans ce didacticiel, nous avons expliqué étape par étape comment ajouter un dessin avec un remplissage dégradé à la programmation avec des graphiques à l'aide d'Aspose.PDF pour .NET. Vous pouvez désormais utiliser ces connaissances pour créer des documents PDF attrayants avec des conceptions personnalisées et des remplissages dégradés.

### FAQ

#### Q : Quel est l'objectif de ce didacticiel ?

R : Ce didacticiel vise à vous guider tout au long du processus d'ajout d'un dessin avec un remplissage dégradé à la programmation avec des graphiques à l'aide d'Aspose.PDF pour .NET.

#### Q : Quels sont les prérequis requis avant de commencer ?

R : Avant de commencer, assurez-vous d'avoir installé la bibliothèque Aspose.PDF et configuré votre environnement de développement. De plus, il est recommandé d'avoir une compréhension de base de la programmation C#.

#### Q : Comment spécifier le répertoire d'enregistrement du fichier PDF ?

R : Dans le code source fourni, vous pouvez modifier la valeur de la variable "dataDir" pour indiquer le répertoire dans lequel vous souhaitez enregistrer le fichier PDF résultant.

#### Q : À quoi sert l'objet Graph ?

R : L'objet Graph sert de conteneur pour les éléments de dessin. Il est créé avec des dimensions spécifiées et ajouté à la collection de paragraphes de la page.

#### Q : Comment puis-je configurer le remplissage dégradé pour une forme ?

R : Pour configurer le remplissage dégradé, vous pouvez définir la propriété FillColor du GraphInfo d'une forme à l'aide de la classe GradientAxialShading. Cela vous permet de définir les points de début et de fin du dégradé et les couleurs entre lesquelles effectuer la transition.

#### Q : Puis-je personnaliser les couleurs et la direction du remplissage dégradé ?

R : Oui, vous pouvez personnaliser les couleurs et la direction du remplissage dégradé en ajustant les objets Color et en spécifiant les points de début et de fin du GradientAxialShading.

#### Q : Quelle est la dernière étape du didacticiel ?

R : La dernière étape consiste à enregistrer le fichier PDF résultant sous le nom "AddDrawingWithGradientFill_out.pdf" dans le répertoire spécifié.

#### Q : Un exemple de code source est-il disponible ?

R : Oui, le didacticiel fournit un exemple de code source que vous pouvez utiliser comme référence pour implémenter les étapes décrites.

#### Q : Puis-je appliquer un remplissage dégradé à d'autres formes que les rectangles ?

R : Oui, vous pouvez également appliquer un remplissage dégradé à d'autres formes. Le processus implique la configuration de la propriété FillColor du GraphInfo de la forme à l'aide de la classe GradientAxialShading.