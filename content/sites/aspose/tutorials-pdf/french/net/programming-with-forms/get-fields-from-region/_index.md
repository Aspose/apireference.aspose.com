---
title: Obtenir les champs de la région dans le fichier PDF
linktitle: Obtenir les champs de la région dans le fichier PDF
second_title: Référence de l'API Aspose.PDF pour .NET
description: Obtenez facilement des champs d'une région spécifique dans un fichier PDF avec Aspose.PDF pour .NET.
type: docs
weight: 130
url: /fr/net/programming-with-forms/get-fields-from-region/
---
Dans ce didacticiel, nous allons vous montrer comment obtenir les champs d'une région spécifique dans un fichier PDF à l'aide d'Aspose.PDF pour .NET. Nous expliquerons étape par étape le code source C # pour vous guider tout au long de ce processus.

## Étape 1 : Préparation

Assurez-vous d'avoir importé les bibliothèques nécessaires et définissez le chemin d'accès à votre répertoire de documents :

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Étape 2 : Ouvrez le fichier PDF

Ouvrez le fichier PDF :

```csharp
Aspose.Pdf.Document doc = new Aspose.Pdf.Document(dataDir + "GetFieldsFromRegion.pdf");
```

## Étape 3 : Créer un objet rectangle pour délimiter la région

Créez un objet rectangle pour délimiter la région où vous souhaitez obtenir les champs :

```csharp
Aspose.Pdf.Rectangle rectangle = new Aspose.Pdf.Rectangle(35, 30, 500, 500);
```

## Étape 4 : Obtenir le formulaire PDF

Obtenir le formulaire PDF du document :

```csharp
Aspose.Pdf.Forms.Form form = doc.Form;
```

## Étape 5 : Obtenir les champs dans la région rectangulaire

Obtenez les champs situés dans la région rectangulaire spécifiée :

```csharp
Aspose.Pdf.Forms.Field[] fields = form.GetFieldsInRect(rectangle);
```

## Étape 6 : Afficher les noms et les valeurs des champs

Parcourez les champs résultants et affichez leurs noms et leurs valeurs :

```csharp
foreach (Field field in fields)
{
Console.Out.WriteLine("Field name: " + field.FullName + "-" + "Field value: " + field.Value);
}
```

### Exemple de code source pour Get Fields From Region en utilisant Aspose.PDF pour .NET 
```csharp
// Chemin d'accès au répertoire des documents.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Ouvrir le fichier pdf
Aspose.Pdf.Document doc = new Aspose.Pdf.Document(dataDir + "GetFieldsFromRegion.pdf");
// Créer un objet rectangle pour obtenir des champs dans cette zone
Aspose.Pdf.Rectangle rectangle = new Aspose.Pdf.Rectangle(35, 30, 500, 500);
// Obtenir le formulaire PDF
Aspose.Pdf.Forms.Form form = doc.Form;
// Obtenir des champs dans la zone rectangulaire
Aspose.Pdf.Forms.Field[] fields = form.GetFieldsInRect(rectangle);
// Afficher les noms et les valeurs des champs
foreach (Field field in fields)
{
	// Afficher les propriétés d'emplacement d'image pour tous les emplacements
	Console.Out.WriteLine("Field Name: " + field.FullName + "-" + "Field Value: " + field.Value);
}
```

## Conclusion

Dans ce didacticiel, nous avons appris à obtenir les champs d'une région spécifique dans un document PDF à l'aide d'Aspose.PDF pour .NET. En suivant ces étapes, vous pouvez facilement extraire les champs situés dans une zone rectangulaire donnée de votre document PDF à l'aide d'Aspose.PDF.

### FAQ

#### Q : Puis-je utiliser cette méthode pour obtenir des champs d'une région non rectangulaire dans un document PDF ?

 R : Non, la méthode fournie`GetFieldsInRect` est spécifiquement conçu pour récupérer des champs situés dans une zone rectangulaire dans un document PDF. Si vous devez extraire des champs d'une région non rectangulaire, vous devez implémenter une logique personnalisée pour identifier et extraire les champs en fonction d'autres critères, tels que les coordonnées ou les noms des champs.

#### Q : Comment puis-je modifier la taille ou la position du rectangle pour obtenir des champs d'une région différente ?

 R : Pour obtenir des champs d'une autre région, vous pouvez modifier le`Aspose.Pdf.Rectangle` paramètres de l'objet utilisés pour définir le rectangle englobant. Le`Rectangle` constructeur prend quatre paramètres :`x`, `y`, `width` , et`height`qui représentent les coordonnées du coin supérieur gauche et les dimensions du rectangle. Le réglage de ces paramètres modifiera la région à partir de laquelle les champs sont extraits.

#### Q : Que se passe-t-il s'il n'y a pas de champs dans la zone rectangulaire spécifiée ?

 R : S'il n'y a pas de champs dans la région rectangulaire spécifiée, le`GetFieldsInRect` méthode renverra un tableau vide. Vous pouvez vérifier la longueur du tableau pour déterminer s'il existe des champs dans la région.

#### Q : Puis-je obtenir des champs de régions qui se chevauchent dans un document PDF ?

 R : Oui, vous pouvez obtenir des champs à partir de régions qui se chevauchent dans un document PDF en créant plusieurs`Aspose.Pdf.Rectangle` objets et en appelant le`GetFieldsInRect` méthode pour chacun d'eux. Les régions qui se chevauchent seront gérées indépendamment et vous recevrez des tableaux de champs distincts pour chaque région.

#### Q : Est-il possible d'obtenir des champs d'une page spécifique ou de plusieurs pages dans le document PDF ?

R : Oui, vous pouvez obtenir des champs à partir d'une page spécifique ou de plusieurs pages dans un document PDF. Pour cela, vous pouvez charger le document PDF, accéder aux pages souhaitées à l'aide de la`doc.Pages` collection, puis appliquer le`GetFieldsInRect` méthode à la région spécifique de chaque page.