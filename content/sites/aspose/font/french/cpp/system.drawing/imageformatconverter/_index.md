---
title: "System::Drawing::ImageFormatConverter classe"
linktitle: "ImageFormatConverter"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::ImageFormatConverter classe. Convertit les objets ImageFormat d'un type de données à un autre. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1400
url: /fr/cpp/system.drawing/imageformatconverter/
---
## ImageFormatConverter class


Convertit les objets ImageFormat d'un type de données à un autre. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class ImageFormatConverter : public System::ComponentModel::TypeConverter
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&) override | Convertit des objets. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | Convertit des objets. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Convertit des objets. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Convertit une chaîne en objet. |
| [ConvertTo](./convertto/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&, const TypeInfo\&) override | Convertit un objet en type spécifique. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Convertit un objet en type spécifique. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Convertit un objet en type spécifique. |
| [ImageFormatConverter](./imageformatconverter/)() | Construit une nouvelle instance de [ImageFormatConverter](./). |
## Voir aussi

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
