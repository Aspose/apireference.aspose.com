---
title: Boutons radio horizontalement et verticalement
linktitle: Boutons radio horizontalement et verticalement
second_title: Référence de l'API Aspose.PDF pour .NET
description: Créez facilement des boutons radio horizontaux et verticaux dans vos documents PDF avec Aspose.PDF pour .NET.
type: docs
weight: 180
url: /fr/net/programming-with-forms/horizontally-and-vertically-radio-buttons/
---
Dans ce didacticiel, nous allons vous montrer comment créer des boutons radio disposés horizontalement et verticalement dans un document PDF à l'aide d'Aspose.PDF pour .NET. Nous expliquerons étape par étape le code source C # pour vous guider tout au long de ce processus.

## Étape 1 : Préparation

Assurez-vous d'avoir importé les bibliothèques nécessaires et définissez le chemin d'accès à votre répertoire de documents :

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Étape 2 : Chargez le document

Chargez le document PDF existant :

```csharp
FormEditor formEditor = new FormEditor();
formEditor.BindPdf(dataDir + "input.pdf");
```

## Étape 3 : Personnalisez les options des boutons radio

Personnalisez les options des boutons radio en définissant les propriétés suivantes :

```csharp
formEditor. RadioGap = 4; // Distance entre deux options de bouton radio
formEditor. RadioHoriz = true; //Disposition horizontale des boutons radio
formEditor.RadioButtonItemSize = 20; // Taille des boutons radio
formEditor.Facade.BorderWidth = 1; // Largeur de la bordure du bouton radio
formEditor.Facade.BorderColor = System.Drawing.Color.Black; // Couleur de la bordure du bouton radio
```

## Étape 4 : Ajouter des boutons radio horizontaux

Ajoutez des boutons radio disposés horizontalement en spécifiant les options et la position du champ :

```csharp
formEditor.Items = new string[] { "First", "Second", "Third" };
formEditor.AddField(FieldType.Radio, "NewField1", 1, 40, 600, 120, 620);
```

## Étape 5 : Ajouter des boutons radio verticaux

Ajoutez des boutons radio disposés verticalement en spécifiant les options et la position du champ :

```csharp
formEditor. RadioHoriz = false; // Disposition verticale des boutons radio
formEditor.Items = new string[] { "First", "Second", "Third" };
formEditor.AddField(FieldType.Radio, "NewField2", 1, 40, 500, 60, 550);
```

## Étape 6 : Enregistrez le document

Enregistrez le document PDF modifié :

```csharp
dataDir = dataDir + "HorizontallyAndVerticallyRadioButtons_out.pdf";
formEditor.Save(dataDir);
```

### Exemple de code source pour les boutons radio horizontalement et verticalement à l'aide d'Aspose.PDF pour .NET 
```csharp
try
{
	// Chemin d'accès au répertoire des documents.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	// Charger le document précédemment enregistré
	FormEditor formEditor = new FormEditor();
	formEditor.BindPdf(dataDir + "input.pdf");
	// RadioGap est la distance entre deux options de bouton radio.
	formEditor.RadioGap = 4;
	// Ajouter un bouton radio horizontal
	formEditor.RadioHoriz = true;
	// RadioButtonItemSize si la taille de l'élément du bouton radio.
	formEditor.RadioButtonItemSize = 20;
	formEditor.Facade.BorderWidth = 1;
	formEditor.Facade.BorderColor = System.Drawing.Color.Black;
	formEditor.Items = new string[] { "First", "Second", "Third" };
	formEditor.AddField(FieldType.Radio, "NewField1", 1, 40, 600, 120, 620);
	// Ajouter un autre bouton radio situé verticalement
	formEditor.RadioHoriz = false;
	formEditor.Items = new string[] { "First", "Second", "Third" };
	formEditor.AddField(FieldType.Radio, "NewField2", 1, 40, 500, 60, 550);
	dataDir = dataDir + "HorizontallyAndVerticallyRadioButtons_out.pdf";
	// Enregistrez le document PDF
	formEditor.Save(dataDir);
	Console.WriteLine("\nHorizontally and vertically laid out radio buttons successfully.\nFile saved at " + dataDir);
}
catch (Exception ex)
{
	Console.WriteLine(ex.Message);
}
```

## Conclusion

Dans ce didacticiel, nous avons appris à créer des boutons radio disposés horizontalement et verticalement dans un document PDF à l'aide d'Aspose.PDF pour .NET. En suivant ces étapes, vous pouvez facilement personnaliser la disposition des boutons radio et les ajouter à vos documents PDF à l'aide d'Aspose.PDF.

### FAQ

#### Q : Que sont les boutons radio disposés horizontalement et verticalement dans un document PDF ?

R : Les boutons radio disposés horizontalement et verticalement dans un document PDF font référence à l'orientation de la mise en page des options des boutons radio. La disposition horizontale place les options du bouton radio côte à côte, permettant aux utilisateurs de faire une sélection de gauche à droite. La disposition verticale, en revanche, empile les options des boutons radio les unes sur les autres, permettant aux utilisateurs de faire une sélection de haut en bas.

#### Q : Comment personnaliser l'apparence des options de bouton radio dans Aspose.PDF pour .NET ?

R : Vous pouvez personnaliser l'apparence des options de bouton radio dans Aspose.PDF pour .NET en ajustant plusieurs propriétés. L'API fournit des options pour définir la distance entre deux options de bouton radio (`RadioGap`), l'orientation de la mise en page (`RadioHoriz`), la taille des éléments du bouton radio (`RadioButtonItemSize`), la largeur et la couleur des bordures des boutons radio, etc.

#### Q : Puis-je ajouter des boutons radio horizontaux et verticaux au même document PDF ?

R : Oui, vous pouvez ajouter des boutons radio horizontaux et verticaux au même document PDF en utilisant Aspose.PDF pour .NET. L'exemple de code source fourni dans le didacticiel montre comment ajouter d'abord des boutons radio disposés horizontalement, puis ajouter un autre ensemble de boutons radio disposés verticalement au même document PDF.

#### Q : Puis-je définir différentes options de bouton radio pour chaque groupe de boutons radio ?

 R : Oui, vous pouvez définir différentes options de bouton radio pour chaque groupe de boutons radio. Chaque groupe doit avoir un`RadioButtonField` objet, et le`RadioButtonOptionField` les objets de chaque groupe doivent partager la même page et des noms uniques pour leurs options. Cela garantit que les boutons radio de chaque groupe fonctionnent correctement et que les sélections s'excluent mutuellement.

#### Q : Les paramètres de mise en page et d'apparence des boutons radio sont-ils pris en charge dans toutes les visionneuses et applications PDF ?

R : Oui, les paramètres de mise en page et d'apparence des boutons radio sont pris en charge dans toutes les visionneuses et applications PDF conformes aux normes. La spécification PDF définit les boutons radio et leurs divers attributs, ce qui les rend universellement reconnus au format PDF. Cependant, il est essentiel de tester l'apparence et le comportement des boutons radio dans différents visualiseurs PDF pour garantir un rendu cohérent sur différentes plates-formes.