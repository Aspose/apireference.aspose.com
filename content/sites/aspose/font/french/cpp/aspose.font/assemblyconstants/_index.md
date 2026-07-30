---
title: "Classe Aspose::Font::AssemblyConstants"
linktitle: "AssemblyConstants"
second_title: "Aspose.Font pour C++"
description: "Classe Aspose::Font::AssemblyConstants. Définit les constantes qui participent à la vérification de licence du composant. Celles‑ci étaient auparavant définies directement comme attributs d'assembly, mais je les ai déplacées dans une classe séparée parce que dans .NET Compact Framework je ne peux pas accéder aux attributs d'assembly. Maintenant le code de licence, lorsqu'il est compilé pour le .NET Compact Framework, utilise ces constantes au lieu des attributs d'assembly en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.font/assemblyconstants/
---
## AssemblyConstants class


Définit les constantes qui participent à la vérification de licence du composant. Celles-ci étaient définies directement comme attributs d'assembly, mais je les ai déplacées dans une classe séparée parce que dans le .NET Compact Framework je ne peux pas accéder aux attributs d'assembly. Maintenant le code de licence, lorsqu'il est compilé pour le .NET Compact Framework, utilise ces constantes à la place des attributs d'assembly.

```cpp
class AssemblyConstants
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AssemblyConstants](./assemblyconstants/)() |  |
## Champs

| Champ | Description |
| --- | --- |
| static [Family](./family/) |  |
| static [Platform](./platform/) |  |
| static [Product](./product/) | Ceci est utilisé par le code de licence **Aspose** pour vérifier que la licence correspond au produit correct. |
| static [ReleaseDate](./releasedate/) | Ceci est utilisé par le code de licence **Aspose** pour vérifier l'expiration de l'abonnement. Vous devez définir cela à la date à laquelle vous publiez une version ou un correctif. |
| static [Title](./title/) |  |
| static [Version](./version/) | La version de l'assembly. |
## Voir aussi

* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
