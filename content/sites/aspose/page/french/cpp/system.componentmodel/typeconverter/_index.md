---
title: "System::ComponentModel::TypeConverter classe"
linktitle: "TypeConverter"
second_title: "Aspose.Page pour C++"
description: "System::ComponentModel::TypeConverter classe. Classe qui gère la conversion de types dans le modèle de composants. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1400
url: /fr/cpp/system.componentmodel/typeconverter/
---
## TypeConverter class


Classe qui gère la conversion de types dans le modèle de composants. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class TypeConverter : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | Convertit des objets. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Convertit des objets. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Convertit une chaîne en objet. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::String\&) | Convertit une chaîne invariante en objet. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | Convertit une chaîne invariante en objet. |
| [ConvertFromString](./convertfromstring/)(const System::String\&) | Convertit une chaîne en objet. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | Convertit une chaîne en objet. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Convertit une chaîne en objet. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Convertit l'objet en type spécifique. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Convertit l'objet en type spécifique. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<System::Object\>\&) | Convertit un objet en chaîne invariante. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | Convertit un objet en chaîne invariante. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<System::Object\>\&) | Convertit un objet en chaîne. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | Convertit un objet en chaîne. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Convertit un objet en chaîne. |
| [TypeConverter](./typeconverter/)() | Informations RTTI. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
