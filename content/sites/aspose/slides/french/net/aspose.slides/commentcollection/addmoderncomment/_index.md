---
title: AddModernComment
second_title: Référence de l'API Aspose.Slides pour .NET
description: Ajouter un nouveau commentaire moderne à la fin dune collection.
type: docs
weight: 60
url: /fr/net/aspose.slides/commentcollection/addmoderncomment/
---
## CommentCollection.AddModernComment method

Ajouter un nouveau commentaire moderne à la fin d'une collection.

```csharp
public IModernComment AddModernComment(string text, ISlide slide, IShape shape, PointF position, 
    DateTime creationTime)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| text | String | Texte brut d'un nouveau commentaire moderne. |
| slide | ISlide | Faites glisser une présentation où ajouter un nouveau commentaire moderne. |
| shape | IShape | Forme sur une diapositive à laquelle un nouveau commentaire moderne est associé. |
| position | PointF | Position sur une diapositive où ajouter un nouveau commentaire moderne. |
| creationTime | DateTime | Le temps d'une création de commentaire moderne. |

### Return_Value

Ajout d'un commentaire moderne.

### Exemples

```csharp
[C#]
using (Presentation pres = new Presentation())
{
    ICommentAuthor newAuthor = pres.CommentAuthors.AddAuthor("Some Author", "SA");
    newAuthor.Comments.AddModernComment("This is modern comment", pres.Slides[0], null, new PointF(100, 100), DateTime.Now);

    pres.Save(outPptxFileName, SaveFormat.Pptx);
}
```

### Voir également

* interface [IModernComment](../../imoderncomment)
* interface [ISlide](../../islide)
* interface [IShape](../../ishape)
* class [CommentCollection](../../commentcollection)
* espace de noms [Aspose.Slides](../../commentcollection)
* Assemblée [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
