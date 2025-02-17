---
title: Créer un en-tête de pied de page
linktitle: Créer un en-tête de pied de page
second_title: API de traitement de documents Aspose.Words
description: Apprenez à créer des en-têtes et des pieds de page dans vos documents Word avec Aspose.Words pour .NET. Personnalisez les en-têtes et pieds de page pour chaque page.
type: docs
weight: 10
url: /fr/net/working-with-headers-and-footers/create-header-footer/
---

Voici un guide étape par étape pour expliquer le code source C# suivant pour créer des en-têtes et des pieds de page à l'aide de la fonctionnalité Aspose.Words pour .NET. Assurez-vous d'avoir inclus la bibliothèque Aspose.Words dans votre projet avant d'utiliser ce code.

## Étape 1 : Définir le chemin du répertoire du document

```csharp
// Le chemin d'accès au répertoire des documents.
string dataDir = "YOUR_DIRECTORY_OF_DOCUMENTS";
```

Assurez-vous de spécifier le chemin correct vers votre répertoire de documents où le document modifié sera enregistré.

## Étape 2 : Créer un document et un générateur de documents

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

 Ici, nous créons une instance du`Document` classe et une instance de`DocumentBuilder` classe qui nous permettra de manipuler le document et d’ajouter des éléments.

## Étape 3 : Définir les paramètres de la page et le premier en-tête

```csharp
Section currentSection = builder.CurrentSection;
PageSetup pageSetup = currentSection.PageSetup;

// Précisez si nous voulons que les en-têtes/pieds de page de la première page soient différents des autres pages.
// Vous pouvez également utiliser la propriété PageSetup.OddAndEvenPagesHeaderFooter pour spécifier
// différents en-têtes/pieds de page pour les pages paires et impaires.
pageSetup.DifferentFirstPageHeaderFooter = true;
pageSetup.HeaderDistance = 20;

builder.MoveToHeaderFooter(HeaderFooterType.HeaderFirst);
builder.ParagraphFormat.Alignment = ParagraphAlignment.Center;

builder.Font.Name = "Arial";
builder.Font.Bold = true;
builder.Font.Size = 14;

builder.Write("Aspose.Words - Creating Headers/Footers - Title Page.");

pageSetup.HeaderDistance = 20;
builder. MoveToHeaderFooter(HeaderFooterType.HeaderPrimary);
```

Nous définissons les paramètres de la page, y compris la distance de l'en-tête, puis passons à l'en-tête principal (`HeaderPrimary`). Nous utilisons le générateur de documents pour ajouter du texte et formater l'en-tête.

## Étape 4 : Insérez une image et du texte dans l'en-tête principal

```csharp
builder.InsertImage(ImagesDir + "Graphics Interchange Format.gif", RelativeHorizontalPosition.Page, 10,
     RelativeVerticalPosition.Page, 10, 50, 50, WrapType.Through);

builder.ParagraphFormat.Alignment = ParagraphAlignment.Right;

builder.Write("Aspose.Words - Building headers/footers.");

builder. MoveToHeaderFooter(HeaderFooterType.FooterPrimary);
```

Nous utilisons le générateur de documents pour insérer une image dans le coin supérieur gauche de l'en-tête principal, puis nous ajoutons du texte aligné à droite.

## Étape 5 : Insérer un tableau dans le pied de page principal

```csharp
builder.StartTable();

builder.CellFormat.ClearFormatting();

builder.InsertCell();

builder.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 / 3);

builder.Write("Page ");
builder.InsertField("PAGE", "");
builder.Write(" of ");
builder.InsertField("NUMPAGES", "");

builder.CurrentParagraph.ParagraphFormat.Alignment = ParagraphAlignment.Left;

builder.InsertCell();

builder.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 * 2 / 3);

builder.Write("(C) 2001 Aspose Pty Ltd. All rights reserved.");

builder.CurrentParagraph.ParagraphFormat.Alignment = ParagraphAlignment.Right;

builder.EndRow();
builder.EndTable();

builder.MoveToDocumentEnd();
```

## Étape 6 : Ajouter une nouvelle page et définir les en-têtes/pieds de page

```csharp
builder. InsertBreak(BreakType.PageBreak);
builder.InsertBreak(BreakType.SectionBreakNewPage);

currentSection = builder. CurrentSection;
pageSetup = currentSection.PageSetup;
pageSetup.Orientation = Orientation.Landscape;
// Cette section n'a pas besoin d'un en-tête/pied de page différent pour la première page, nous n'avons besoin que d'une seule page de titre dans le document,
// et l'en-tête/pied de page de cette page a déjà été défini dans la section précédente.
pageSetup.DifferentFirstPageHeaderFooter = false;

// Cette section affiche par défaut les en-têtes/pieds de page de la section précédente, appelez currentSection.HeadersFooters.LinkToPrevious(false) pour rompre ce lien,
// la largeur de la page est différente pour la nouvelle section, nous devons donc définir différentes largeurs de cellules pour un tableau de pied de page.
currentSection.HeadersFooters.LinkToPrevious(false);

//Si nous souhaitons utiliser les en-têtes/pieds de page déjà existants pour cette section,
// mais avec quelques modifications mineures, il peut être judicieux de copier les en-têtes/pieds de page
// de la section précédente et appliquez les modifications nécessaires là où nous le souhaitons.
CopyHeadersFootersFromPreviousSection(currentSection);

HeaderFooter primaryFooter = currentSection.HeadersFooters[HeaderFooterType.FooterPrimary];

Row row = primaryFooter.Tables[0].FirstRow;
row.FirstCell.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 / 3);
row.LastCell.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 * 2 / 3);

// Enregistrez le document
doc.Save(dataDir + "WorkingWithHeadersAndFooters.CreateHeaderFooter.docx");
```

 Nous ajoutons un saut de page et un saut de section pour créer une nouvelle page où les en-têtes/pieds de page principaux seront visibles. Nous définissons les paramètres de la nouvelle section, puis nous utilisons le`CopyHeadersFootersFromPreviousSection` méthode pour copier les en-têtes/pieds de page de la section précédente. Enfin, nous définissons les largeurs de cellules appropriées pour le tableau de pied de page principal et enregistrons le document.

### Exemple de code source pour créer des en-têtes et des pieds de page avec Aspose.Words for .NET

```csharp
// Le chemin d'accès au répertoire des documents.
string dataDir = "YOUR_DIRECTORY_OF_DOCUMENTS";

Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Section currentSection = builder.CurrentSection;
PageSetup pageSetup = currentSection.PageSetup;
// Spécifiez si nous voulons que les en-têtes/pieds de page de la première page soient différents des autres pages.
// Vous pouvez également utiliser la propriété PageSetup.OddAndEvenPagesHeaderFooter pour spécifier
// différents en-têtes/pieds de page pour les pages paires et impaires.
pageSetup.DifferentFirstPageHeaderFooter = true;
pageSetup.HeaderDistance = 20;

builder.MoveToHeaderFooter(HeaderFooterType.HeaderFirst);
builder.ParagraphFormat.Alignment = ParagraphAlignment.Center;

builder.Font.Name = "Arial";
builder.Font.Bold = true;
builder.Font.Size = 14;

builder.Write("Aspose.Words Header/Footer Creation Primer - Title Page.");

pageSetup.HeaderDistance = 20;
builder.MoveToHeaderFooter(HeaderFooterType.HeaderPrimary);

// Insérez une image positionnée dans le coin supérieur/gauche de l’en-tête.
// La distance depuis les bords supérieur/gauche de la page est définie sur 10 points.
builder.InsertImage(ImagesDir + "Graphics Interchange Format.gif", RelativeHorizontalPosition.Page, 10,
	RelativeVerticalPosition.Page, 10, 50, 50, WrapType.Through);

builder.ParagraphFormat.Alignment = ParagraphAlignment.Right;

builder.Write("Aspose.Words Header/Footer Creation Primer.");

builder.MoveToHeaderFooter(HeaderFooterType.FooterPrimary);

//Nous utilisons un tableau avec deux cellules pour constituer une partie du texte sur la ligne (avec numérotation des pages).
// A aligner à gauche, et l'autre partie du texte (avec copyright) à droite.
builder.StartTable();

builder.CellFormat.ClearFormatting();

builder.InsertCell();

builder.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 / 3);

// Il utilise les champs PAGE et NUMPAGES pour calculer automatiquement le numéro de page actuel et le nombre de pages.
builder.Write("Page ");
builder.InsertField("PAGE", "");
builder.Write(" of ");
builder.InsertField("NUMPAGES", "");

builder.CurrentParagraph.ParagraphFormat.Alignment = ParagraphAlignment.Left;

builder.InsertCell();

builder.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 * 2 / 3);

builder.Write("(C) 2001 Aspose Pty Ltd. All rights reserved.");

builder.CurrentParagraph.ParagraphFormat.Alignment = ParagraphAlignment.Right;

builder.EndRow();
builder.EndTable();

builder.MoveToDocumentEnd();

// Faites un saut de page pour créer une deuxième page sur laquelle les principaux en-têtes/pieds de page seront visibles.
builder.InsertBreak(BreakType.PageBreak);
builder.InsertBreak(BreakType.SectionBreakNewPage);

currentSection = builder.CurrentSection;
pageSetup = currentSection.PageSetup;
pageSetup.Orientation = Orientation.Landscape;
// Cette section n'a pas besoin d'un en-tête/pied de page de première page différent, nous n'avons besoin que d'une seule page de titre dans le document,
// et l'en-tête/pied de page de cette page a déjà été défini dans la section précédente.
pageSetup.DifferentFirstPageHeaderFooter = false;

// Cette section affiche les en-têtes/pieds de page de la section précédente
// par défaut, appelez currentSection.HeadersFooters.LinkToPrevious(false) pour annuler cette largeur de page
// est différent pour la nouvelle section et nous devons donc définir différentes largeurs de cellules pour un tableau de pied de page.
currentSection.HeadersFooters.LinkToPrevious(false);

// Si nous voulons utiliser l’ensemble d’en-tête/pied de page déjà existant pour cette section.
// Mais avec quelques modifications mineures, il peut être judicieux de copier les en-têtes/pieds de page
//de la section précédente et appliquez les modifications nécessaires là où nous le souhaitons.
CopyHeadersFootersFromPreviousSection(currentSection);

HeaderFooter primaryFooter = currentSection.HeadersFooters[HeaderFooterType.FooterPrimary];

Row row = primaryFooter.Tables[0].FirstRow;
row.FirstCell.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 / 3);
row.LastCell.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 * 2 / 3);

doc.Save(dataDir + "WorkingWithHeadersAndFooters.CreateHeaderFooter.docx");
```

### FAQ

#### Q : Comment puis-je ajouter un en-tête à mon document dans Aspose.Words ?

 R : Pour ajouter un en-tête à votre document dans Aspose.Words, vous pouvez utiliser le`Document.FirstSection.HeadersFooters.Add(HeaderFooterType.HeaderPrimary)` méthode. Cette méthode ajoute un titre principal à la première section de votre document.

#### Q : Comment puis-je ajouter un pied de page à mon document dans Aspose.Words ?

 R : Pour ajouter un pied de page à votre document dans Aspose.Words, vous pouvez utiliser le`Document.FirstSection.HeadersFooters.Add(HeaderFooterType.FooterPrimary)` méthode. Cette méthode ajoute un pied de page principal à la première section de votre document.

#### Q : Comment puis-je ajouter du texte à mon en-tête ou pied de page dans Aspose.Words ?

 R : Pour ajouter du texte à votre en-tête ou pied de page dans Aspose.Words, vous pouvez utiliser le`HeaderFooter.Paragraphs` propriété pour obtenir la collection de paragraphes de l’en-tête ou du pied de page, puis ajoutez un paragraphe contenant votre texte à cette collection à l’aide de la propriété`ParagraphCollection.Add` méthode.

#### Q : Puis-je personnaliser le contenu de l'en-tête ou du pied de page avec des images et des numéros de page dans Aspose.Words ?

 : Oui, vous pouvez personnaliser le contenu de l'en-tête ou du pied de page avec des images et des numéros de page dans Aspose.Words. Vous pouvez utiliser des objets comme`Shape` pour ajouter des images et des objets comme`Field` pour ajouter des numéros de page à votre en-tête ou pied de page.

#### Q : Puis-je modifier la police, la taille et la couleur du texte dans mon en-tête ou mon pied de page dans Aspose.Words ?

 R : Oui, vous pouvez modifier la police, la taille et la couleur du texte dans votre en-tête ou pied de page dans Aspose.Words. Vous pouvez accéder aux propriétés de formatage du texte telles que`Font` pour changer la police,`Size` pour ajuster la taille, et`Color` pour définir la couleur du texte.