---
title: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class"
linktitle: "IXpsTextConversionOptions"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class. Définit les options de conversion du XPS vers d'autres formats en C++."
type: docs
weight: 300
url: /fr/cpp/aspose.page.xps.presentation/ixpstextconversionoptions/
---
## IXpsTextConversionOptions class


Définit les options de conversion du [XPS](../../aspose.page.xps/) vers d'autres formats.

```cpp
class IXpsTextConversionOptions : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [get_PreserveText](./get_preservetext/)() | Dans le [XPS](../../aspose.page.xps/), certains éléments de texte peuvent contenir des références à des formes de glyphes alternatives qui ne correspondent à aucun code de caractère dans la police. Si ce drapeau est défini sur true, le texte de ces éléments [XPS](../../aspose.page.xps/) est converti en formes graphiques. Le texte lui‑-même apparaît alors transparent au-dessus. Cela rend le texte de ces éléments sélectionnable. Mais l'effet secondaire est que le fichier de sortie peut être beaucoup plus volumineux que l'original. Si ce drapeau est défini sur false, les caractères qui devraient être affichés sous forme alternative sont remplacés par d'autres caractères qui sont mappés aux formes de glyphes alternatives. Ainsi, le texte, bien qu'encore sélectionnable, sera modifié et deviendra probablement illisible. |
| virtual [set_PreserveText](./set_preservetext/)(bool) | Dans le [XPS](../../aspose.page.xps/), certains éléments de texte peuvent contenir des références à des formes de glyphes alternatives qui ne correspondent à aucun code de caractère dans la police. Si ce drapeau est défini sur true, le texte de ces éléments [XPS](../../aspose.page.xps/) est converti en formes graphiques. Le texte lui‑-même apparaît alors transparent au-dessus. Cela rend le texte de ces éléments sélectionnable. Mais l'effet secondaire est que le fichier de sortie peut être beaucoup plus volumineux que l'original. Si ce drapeau est défini sur false, les caractères qui devraient être affichés sous forme alternative sont remplacés par d'autres caractères qui sont mappés aux formes de glyphes alternatives. Ainsi, le texte, bien qu'encore sélectionnable, sera modifié et deviendra probablement illisible. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation](../)
* Library [Aspose.Page for C++](../../)
