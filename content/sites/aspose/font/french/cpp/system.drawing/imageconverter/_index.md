---
title: "System::Drawing::ImageConverter classe"
linktitle: "ImageConverter"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::ImageConverter classe. Convertit les objets Image d'un type de données à un autre. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1300
url: /fr/cpp/system.drawing/imageconverter/
---
## ImageConverter class


Convertit les objets [Image](../image/) d'un type de données à un autre. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class ImageConverter : public System::ComponentModel::TypeConverter
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Convertit un objet en type spécifique. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Convertit un objet en type spécifique. |
| [ImageConverter](./imageconverter/)() | Construit une nouvelle instance de [ImageConverter](./). |
## Voir aussi

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
