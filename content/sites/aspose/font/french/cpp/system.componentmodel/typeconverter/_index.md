---
title: "classe System::ComponentModel::TypeConverter"
linktitle: "TypeConverter"
second_title: "Aspose.Font pour C++"
description: "classe System::ComponentModel::TypeConverter. Classe qui gère la conversion de type dans le modèle de composants. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 1400
url: /fr/cpp/system.componentmodel/typeconverter/
---
## TypeConverter class


Classe qui gère la conversion de type dans le modèle de composants. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

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
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Convertit un objet en type spécifique. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Convertit un objet en type spécifique. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<System::Object\>\&) | Convertit un objet en chaîne invariante. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | Convertit un objet en chaîne invariante. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<System::Object\>\&) | Convertit un objet en chaîne. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | Convertit un objet en chaîne. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Convertit un objet en chaîne. |
| [TypeConverter](./typeconverter/)() | Informations RTTI. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
