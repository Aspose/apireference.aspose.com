---
title: "Aspose::Font::CffDataProviders::CffUpdateStringIndexStrategy énum"
linktitle: "CffUpdateStringIndexStrategy"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::CffDataProviders::CffUpdateStringIndexStrategy enum. Spécifie comment ajouter des chaînes au stockage CFF String INDEX. Lorsque nous essayons d'ajouter une chaîne dans le CFF String INDEX, il peut arriver que cette chaîne soit déjà présente dans le String INDEX. En utilisant l'option SearchForDuplicates nous pouvons forcer la recherche dans le String INDEX afin de détecter si cette chaîne est déjà présente ou non. Cette approche économise de l'espace dans la structure String INDEX, mais nécessite plus de temps pour ajouter la chaîne en C++."
type: docs
weight: 1000
url: /fr/cpp/aspose.font.cffdataproviders/cffupdatestringindexstrategy/
---
## CffUpdateStringIndexStrategy enum


Spécifie comment ajouter des chaînes au stockage CFF String INDEX. Lorsque nous essayons d'ajouter une chaîne dans le CFF String INDEX, il peut arriver que cette chaîne soit déjà présente dans le String INDEX. En utilisant l'option [SearchForDuplicates](./) nous pouvons forcer la recherche dans le String INDEX afin de détecter si cette chaîne est déjà présente ou non. Cette approche économise de l'espace dans la structure String INDEX, mais nécessite plus de temps pour ajouter la chaîne.

```cpp
enum class CffUpdateStringIndexStrategy
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| SearchForDuplicates | 0 | Spécifie que la recherche de la chaîne à ajouter doit être effectuée dans la structure String INDEX afin d'éviter d'ajouter des doublons. |
| AddStringAsIs | 1 | Spécifie qu'aucune vérification des doublons ne doit être effectuée lors de l'ajout d'une chaîne. Cette approche fonctionne plus rapidement, mais peut entraîner une utilisation inefficace de la mémoire pour String INDEX. |

## Voir aussi

* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
