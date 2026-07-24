---
title: "Aspose::Page::AssemblyConstants classe"
linktitle: "AssemblyConstants"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::AssemblyConstants classe. Définit les constantes qui participent à la vérification de licence du composant. Celles-ci étaient auparavant définies directement comme attributs d'assembly, mais je les ai déplacées dans une classe séparée parce que dans .NET Compact Framework je ne peux pas accéder aux attributs d'assembly. Maintenant le code de licence, lorsqu'il est compilé pour le .NET Compact Framework, utilise ces constantes au lieu des attributs d'assembly en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.page/assemblyconstants/
---
## AssemblyConstants class


Définit les constantes qui participent à la vérification de licence du composant. Celles‑ci étaient auparavant définies directement comme attributs d'assembly, mais je les ai déplacées dans une classe séparée parce que dans le .NET Compact Framework je ne peux pas accéder aux attributs d'assembly. Désormais le code de licence, lorsqu'il est compilé pour le .NET Compact Framework, utilise ces constantes au lieu des attributs d'assembly.

```cpp
class AssemblyConstants : public System::Object
```

## Champs

| Champ | Description |
| --- | --- |
| static [Family](./family/) |  |
| static [Platform](./platform/) |  |
| static [Producer](./producer/) | Le producteur des documents de sortie. |
| static [PRODUCT](./product/) |  |
| static [Product](./product/) | Ceci est utilisé par le code de licence **Aspose** pour vérifier que la licence est destinée au bon produit. |
| static [Product2](./product2/) | Ceci est utilisé par le code de licence **Aspose** pour vérifier que la licence est destinée au bon produit. Temporairement, la licence **Aspose.EPS** sera également valide pour [Aspose.Page](../). |
| static [Product3](./product3/) | Ceci est utilisé par le code de licence **Aspose** pour vérifier que la licence est destinée au bon produit. Temporairement, la licence Aspose.XPS sera également valide pour [Aspose.Page](../). |
| static [ReleaseDate](./releasedate/) | Ceci est utilisé par le code de licence **Aspose** pour vérifier l'expiration de l'abonnement. Vous devez définir cela à la date à laquelle vous publiez une version ou un correctif. |
| static [Title](./title/) |  |
| static [VERSION](./version/) |  |
| static [Version](./version/) | La version de l'assembly. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
