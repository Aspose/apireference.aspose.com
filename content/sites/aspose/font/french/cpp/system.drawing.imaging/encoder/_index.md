---
title: "System::Drawing::Imaging::Encoder classe"
linktitle: "Encoder"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Imaging::Encoder class. Représente un GUID associé à un ensemble de paramètres d'encodeur d'image. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 500
url: /fr/cpp/system.drawing.imaging/encoder/
---
## Encoder class


Représente un GUID associé à un ensemble de paramètres d'encodeur d'image. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class Encoder : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Encoder](./encoder/)(const Guid\&) | Construit une nouvelle instance de la classe [Encoder](./). |
| [get_Guid](./get_guid/)() const | Renvoie un GUID qui spécifie un ensemble de paramètres d'encodeur d'image que l'objet actuel représente. |
## Champs

| Champ | Description |
| --- | --- |
| static [ChrominanceTable](./chrominancetable/) | Une instance de la classe [Encoder](./) qui représente la catégorie de paramètres de la table de chrominance. |
| static [ColorDepth](./colordepth/) | Une instance de la classe [Encoder](./) qui représente la catégorie de paramètre de profondeur de couleur. |
| static [Compression](./compression/) | Une instance de la classe [Encoder](./) qui représente la catégorie de paramètre de compression. |
| static [LuminanceTable](./luminancetable/) | Une instance de la classe [Encoder](./) qui représente la catégorie de paramètre de table de luminance. |
| static [Quality](./quality/) | Une instance de la classe [Encoder](./) qui représente la catégorie de paramètre de qualité. |
| static [RenderMethod](./rendermethod/) | Une instance de la classe [Encoder](./) qui représente la catégorie de paramètre de méthode de rendu. |
| static [SaveFlag](./saveflag/) | Une instance de la classe [Encoder](./) qui représente la catégorie de paramètre du drapeau de sauvegarde. |
| static [ScanMethod](./scanmethod/) | Une instance de la classe [Encoder](./) qui représente la catégorie de paramètre de méthode de numérisation. |
| static [Transformation](./transformation/) | Une instance de la classe [Encoder](./) qui représente la catégorie de paramètre de transformation. |
| static [Version](./version/) | Une instance de la classe [Encoder](./) qui représente la catégorie de paramètre de version. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
