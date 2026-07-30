---
title: "classe System::Drawing::Imaging::PropertyItem"
linktitle: "PropertyItem"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::Imaging::PropertyItem. Représente une propriété de métadonnées à inclure dans un fichier image. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1400
url: /fr/cpp/system.drawing.imaging/propertyitem/
---
## PropertyItem class


Représente une propriété de métadonnées à inclure dans un fichier image. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class PropertyItem : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Id](./get_id/)() const | Renvoie l'ID de la propriété représentée par l'objet actuel. |
| [get_Len](./get_len/)() const | Renvoie la longueur de la propriété représentée par l'objet actuel en octets. |
| [get_Type](./get_type/)() const | Renvoie le type de la propriété représentée par l'objet actuel en octets. |
| [get_Value](./get_value/)() const | Renvoie la valeur de la propriété représentée par l'objet actuel en octets. |
| [PropertyItem](./propertyitem/)() | Construit une nouvelle instance de la classe [PropertyItem](./). |
| [set_Id](./set_id/)(int32_t) | Définit l'ID de la propriété représentée par l'objet actuel. |
| [set_Len](./set_len/)(int32_t) | Définit la longueur de la propriété représentée par l'objet actuel en octets. |
| [set_Type](./set_type/)(int16_t) | Définit le type de la propriété représentée par l'objet actuel en octets. |
| [set_Value](./set_value/)(const System::ArrayPtr\<uint8_t\>\&) | Définit le type de la propriété représentée par l'objet actuel en octets. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
